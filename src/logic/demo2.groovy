package logic

/**
 * @author wanghong* @date 2019/08/11 19:44
 * Groovy中的闭包
 * */
def clouser = { println "Hello Groovy" }
clouser.call()
clouser()

def clouser2 = {
    String name
    println "Hello ${name}"
}
clouser2("wanghong")

// 闭包中默认的参数名 it
def clouser3 = {
    println "Hello ${it}"
}
clouser3("wanghong")

def clouser4 = { String name, String age ->
    println "Hello ${name},age ${age}"
}
clouser4("wanghong", "29")

// 闭包中的返回值，一定有返回值
def result = clouser("wanghong")
println(result) // null

// 求阶乘
int fab(int n) {
    int result = 1
    1.upto(n, { num -> result *= num })
    return result
}

int fab2(int n) {
    int result = 1
    n.downto(1) { num -> result *= num }
    return result
}

println fab(5)
println fab2(5)

// 累加
int cal(int n) {
    int result = 0
    n.times { num -> result += num }
    return result
}

println cal(101)

//字符串与闭包结合使用
String str = "a b 3 c"
// each
println str.each { String s -> s.multiply(2) }

// find 查找符合条件的第一个
println str.find { String s -> s.isNumber() }

// findAll
def list = str.findAll{String s -> s.isNumber()}
println list.toListString()

// any

// every

// collect
println str.collect{it.toUpperCase()}