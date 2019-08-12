package objectoriented

/**
 * @author wanghong* @date 2019/08/12 21:20
 * Groovy中的面向对象
 *  1. Groovy中默认都是public,GroovyObject
 * */
class Person implements Action{
    String name
    int age

    def increase(Integer years){
        this.age += years
    }

    @Override
    void eat() {

    }

    // 一个方法找不到时，用它代替
    def invokeMethod(String name,Object args){
        return "The method is ${name},the param is ${args}"
    }

    def methodMissing(String name,Object args){
        return "The method is ${name},the param is ${args} missing"
    }
}

// 比较大的区别：无论是直接调用 . 还是调用 get/set方法 最终都是调用 get/set
def person = new Person(name:'wh',age: 29)
println person.name
println person.getAge()

person.increase(10)
println person.age

// 接口中不允许定义非public方法
interface Action{
    void eat()
}

// 适配器模式
trait DefaultAction{
    abstract void eat()

    // 提供默认实现，否则就要定义成 abstract
    void play(){
        println 'I can play'
    }
}