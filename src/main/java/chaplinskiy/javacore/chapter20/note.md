interface Closeable, Flushable java 5
inteface Autocloseable java 7
try with resources

IoException
SecurityException

Ресурсы, управляемые оператором try с ресурсами, должны быть объектами классов, реализующих интерфейс AutoCloseable.

Ресурс, объявляемый в блоке оператора try, неявно считается завершенным.

Управлять можно несколькими ресурсами, перечислив их списком через запятую при объявлении.

InputStream, OutputStream, Reader и Writer