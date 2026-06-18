class KthLargest(k: Int, nums: IntArray) {
private val k=k;
private val arr=nums.toMutableList();
    fun add(`val`: Int): Int {
arr.add(`val`)
arr.sort()
return arr[arr.size-k]
    }
}
