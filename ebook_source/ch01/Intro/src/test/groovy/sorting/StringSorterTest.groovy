package sorting;

import spock.lang.Specification;

class StringSorterTest extends Specification {
    StringSorter sorter = new StringSorter()
    def strings = ['this', 'is', 'a', 'list', 'of', 'strings']

    def "lexicographical sort returns alphabetical"() {
        when:
        def sorted = sorter.sortLexicographically(strings)

        then:
        sorted == ['a', 'is', 'list', 'of', 'strings', 'this']
    }

    def "reverse sort by length should be decreasing size"() {
        when:
        def sorted = sorter.sortByDecreasingLength(strings)

        then:
        sorted*.size() == [7, 4, 4, 2, 2, 1]
    }
}
