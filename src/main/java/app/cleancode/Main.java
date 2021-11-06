package app.cleancode;

import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {
    public static void main(String[] args) throws Throwable {
        XmlMapper mapper = XmlMapper.builder().build();
        JsonNode rootNode = mapper.reader().readTree(Files.readAllBytes(Paths.get("test.xml")));
        System.out.println(rootNode.toPrettyString());
    }
}
