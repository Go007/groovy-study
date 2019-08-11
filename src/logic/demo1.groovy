package logic

/**
 * @author wanghong* @date 2019/08/11 19:24
 * Groovy中的逻辑控制
 * */

// Groovy中的switch case非常灵活，不想Java中只能是 int char String Enum类型
def x = 1
def result
switch (x.class){
    case 'hello':
        result = 'hello'
        break
    case [1,2,'hello']: // 列表
        result = 'list'
        break
    case Integer:
        result = 'integer'
        break
    default:result = 'default'
}

println result

// 对范围的for循环
def sum = 0
for (i in 0..9){
    sum += i
}

// 对list的for
for (i in [1,2,3,4,5]){
    sum += i
}

// 对Map的for
for (i in ['a':1,'b':2]){
    sum += i.value
}