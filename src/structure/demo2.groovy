package structure

/**
 * @author wanghong* @date 2019/08/12 20:36
 * Groovy中的映射
 * */
def colors = [red:'00',green:'01',yellow:'02']

// 索引
println colors['red']
println colors.red

// 添加
colors.put('blue','03')
colors.blue = '03'
println colors.toMapString()

// 可以添加任意类型的对象
colors.complex = [a:1,b:2]
println colors.toMapString()

// key是Number或单引号不可变的字符串（默认）

// 使用的是Java中的java.util.LinkedHashMap
println colors.getClass()

// 显示的指定默认的类型
HashMap col = []

def coll = [] as HashMap

// Map常用操作
def stu = [
        1:[num:'001',name:'bob',score:80],
        2:[num:'002',name:'mike',score: 59],
        3:[num:'003',name:'macro',score: 100],
]

// 遍历
stu.each {def s -> println "The key is ${s.key}, " + "the value is ${s.value}"}
stu.each {key,value -> println "The key is ${key}, " + "the value is ${value}"}

// 带索引的遍历,注意参数前后顺序不能反
stu.eachWithIndex{ def entry, int i -> println "index is ${i} " + "The entry is ${entry}" }

// Map的查找 find findAll

// 统计 count findAll collect
def names = stu.findAll {s -> s.value.score >= 60}.collect {it.value.name}
println names.toListString()

// group by
def group = stu.groupBy {def s -> s.value.score >= 60 ? '及格':'不及格'}
println group

// 排序
def sort = stu.sort{def s1,def s2 ->
    Number score1 = s1.value.score
    Number score2 = s2.value.score
    return score1 == score2 ? 0 : score1 < score2 ? -1:1
}
println sort.toMapString()