package sorting

import org.junit.Test

class ScriptTests {

    @Test
    void testSortStrings() {
        GroovyShell shell = new GroovyShell()
        shell.evaluate(new File("src/main/groovy/sorting/sort_strings.groovy"))
    }
}
