
package sorting

def strings = ['this', 'is', 'a', 'list', 'of', 'strings']

// sort lexicographically
assert strings.sort() == ['a', 'is', 'list', 'of', 'strings', 'this']

// sort using closure coerced to Comparator
Collections.sort(strings,
        { s1, s2 -> s2.size() - s1.size() } as Comparator)
assert strings*.size() == [7, 4, 4, 2, 2, 1]

// reverse sort using sort() method on Collection
strings.sort { -it.size() }
assert strings*.size() == [7, 4, 4, 2, 2, 1]