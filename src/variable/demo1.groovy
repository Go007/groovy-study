package variable

/**
 * @author wanghong* @date 2019/08/11 18:40
 *  在Groovy中基本类型会自动包装为对应的对象类型
 *  所以可以说Groovy中都是对象类型
 * */
int i = 1
println(i.class) // class java.lang.Integer

// Groovy中 def 支持弱类型
def x = 1
println(x.class)
def y = 3.1415927
println(y.class)
def z = 'Hello'
println(z.class)

// def 定义的变量支持动态类型
x = 1.0
println(x.class)
