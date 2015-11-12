/**
 * Created by hgp on 10.11.15.
 */
class FooTest extends spock.lang.Specification {
    def "foo gives bar"() {
        given:
        def foo = new Foo()
        when:
        def result = foo.foo()
        then:
        "bar" == result
    }
}

