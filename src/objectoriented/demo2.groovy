package objectoriented

/**
 * @author wanghong* @date 2019/08/12 21:34
 * Groovy中的元编程
 * */
// 如何将metaClass扩展的属性或方法变为全局(整个应用中)可用的
ExpandoMetaClass.enableGlobally()

// 为类动态的添加属性
Person.metaClass.sex = 'male'

def p = new Person(name:'wh',age: 29)
println p.say()

println p.sex

// 为类动态的添加方法
Person.metaClass.nameUpperCase = {name.toUpperCase()}
println p.nameUpperCase()

// 动态添加静态方法
Person.metaClass.static.createPerson = {
    String name,int age -> new Person(name:name,age:age)
}

def p2 = Person.createPerson("macro",28)
println p2.name
println p2.age