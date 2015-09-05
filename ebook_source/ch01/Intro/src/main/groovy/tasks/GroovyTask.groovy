package tasks

import groovy.transform.Canonical

@Canonical
class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
}
