package pl.nullpointerexception.p5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class VoidMethodExampleTest {

    private VoidMethodExample testee = new VoidMethodExample();

    @Test
    public void delete(@TempDir Path tempDir) throws IOException {
        // given
        Files.createFile(tempDir.resolve("testFile.txt"));
        // when
        testee.delete(tempDir, "testFile.txt");
        // then
        assertThat(Files.exists(tempDir.resolve("testFile.txt"))).isFalse();
    }


    @Test
    public void delete2(@TempDir Path tempDir) throws IOException {
        // given
        Files.createFile(tempDir.resolve("testFile.txt"));
        // when
        testee.delete(tempDir,"testFile.txt");
        // then
        assertThat(Files.exists(tempDir.resolve("testFile.txt"))).isFalse();
    }
}