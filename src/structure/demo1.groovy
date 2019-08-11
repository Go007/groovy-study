package structure

/**
 * @author wanghong* @date 2019/08/11 23:53
 * Groovy 中的数据结构
 * */
def list = [1,2,3,4,5]
println list.class
println list.size()

// 数组
def array = [1,2,3,4,5] as int[]
int[] array2 = [1,2,3,4,5]

// 列表的排序
def sortList = [4,5,3,1,2]
Comparator c = {a,b -> a==b ? 0:Math.abs(a) < Math.abs(b) ? -1:1}
Collections.sort(sortList,c)
println sortList
sortList.sort()

sortList.sort({
    a,b -> a==b ? 0:Math.abs(a) < Math.abs(b) ? -1:1
})

def sortStringList = ['abc','a','ab','groovy','java']
sortStringList.sort({it -> return it.size()})
println sortStringList

// 列表的查找 find findAll
def findList = [1,2,3,4,5]
int x = findList.find {return it%2 == 0}
println x

// any every

// min max

// 统计 count