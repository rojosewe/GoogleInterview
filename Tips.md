# Tips

* Creating a new class or implementing an interface might make it 10x easier to solve that question.
* Check for all the data structures:
	* Map if you need to fast arbitrary access and no repetitions.
	* Queue if you wish to maintain an FIFO order and eliminate after user.
	* Stack if you wish to maintain an LIFO order and eliminate after user.
	* Array if you need arbitrary access, no removals and you know the size.
	* Lists if you do not know the size.
		* ArrayList if you need arbitrary access, and no removals.
		* LinkedList if you need linear access, and removals.
	* Sets if you need no repetitions.
		* HashSet If you need no arbitrary access and no iteration.
		* LinkedHashSet allows you to access the values in order.
		* TreeSet If you need no maintain the items ordered.

## Binary Trees

* Array is formed as:
	* Parent(r) =⌊(r−1)/2⌋ if r≠0.
	* Left child(r) =2r+1 if 2r+1≤n.
	* Right child(r) =2r+2 if 2r+2≤n2.
	* Left sibling(r) =r−1 if r is even.
	* Right sibling(r) =r+1 if r is odd and r+1≤n.

* Traversal orders:
	* InOrder: left, value, right
	* PreOrder: value, left, right
	* PostOrder: left, right, value

* For a BFS, use a Queue Implementation.
* For a DFS, use a PreOrder Traversal.

 