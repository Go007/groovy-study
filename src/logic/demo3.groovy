package logic

/**
 * @author wanghong* @date 2019/08/11 23:28
 *  闭包的3个关键变量 this owner delegate
 * */
def clouser = {
    println "clouser this" + this // 代表闭包定义处的类
    println "clouser owner" + owner // 代表闭包定义处的类或对象
    println "clouser owner" + owner // 代表任意对象，默认与owner一致
}
clouser.call()

// 内部类
class Person {
    def static classClouser = {
        println "classClouser this" + this
        println "classClouser owner" + owner
        println "classClouser delegate" + delegate
    }

    def static say() {
        def methodClouser = {
            println "methodClouser this" + this
            println "methodClouser owner" + owner
            println "methodClouser delegate" + delegate
        }
        classClouser.call()
    }
}

Person.classClouser.call()
Person.say()

// 闭包中定义一个闭包
def nestClouser = {
    def innerClouser = {
        println "innerClouser this" + this
        println "innerClouser owner" + owner
        println "innerClouser delegate" + delegate
    }
    // this,owner是不能修改的
    innerClouser.delegate = new Person() // 修改默认的delegate
    innerClouser.call()
}
nestClouser.call()

/**
 * 闭包的委托策略
 */
class Student{
    String name
    def pretty = {"My name is ${name}"}
    String toString(){
        pretty.call()
    }
}

class Teacher{
    String name
}

def stu = new Student(name: "wh")
def tea = new Teacher(name: "wg")
println stu.toString()
stu.pretty.delegate = tea
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu.toString()