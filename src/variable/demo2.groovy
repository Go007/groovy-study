package variable

/**
 * @author wanghong* @date 2019/08/11 18:51
 *  Groovy中的字符串
 *  1. ' ' 与 ''' '''的区别
 *    ''' ''' 支持有格式的，在换行时不需要写 +
 * */

def s = 'a single \'xx\' string'
println(s)

def sss = '''\
line one
line two
'''
println sss

// " " 可扩展字符串
def ss = "this is a common string"
println ss.class  // java.lang.String

def name = "World"
def sayHello = "Hello:${name}"
println sayHello
println sayHello.class // org.codehaus.groovy.runtime.GStringImpl

// ${ } 可扩展任意的表达式
def sum = "The sum of 1 and 2 equals ${1 + 2}"
println sum
println sum.class

println '============'

def result = echo(sum)
println result
println result.class // java.lang.String

String echo(String msg){
    return msg
}