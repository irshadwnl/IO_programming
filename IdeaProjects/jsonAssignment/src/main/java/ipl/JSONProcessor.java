package ipl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.List;
import java.util.Map;

public class JSONProcessor {
    public static void processJSON(String inputPath, String outputPath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Ipl> matches = mapper.readValue(new File(inputPath), new TypeReference<List<Ipl>>() {});

        for (Ipl match : matches) {
            match.team1 = CensorshipUtil.maskTeam(match.team1);
            match.team2 = CensorshipUtil.maskTeam(match.team2);
            match.player_of_match = CensorshipUtil.redactPlayer();

            match.score = match.score.entrySet().stream()
                    .collect(java.util.stream.Collectors.toMap(
                            e -> CensorshipUtil.maskTeam(e.getKey()),
                            Map.Entry::getValue
                    ));

            match.winner = CensorshipUtil.maskTeam(match.winner);
        }

        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), matches);
    }
}
