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
* Testing for nulls, negative numbers, empty lists/arrays, out of rangers.   

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

### Types of binary trees 

* **Full** No node has only one child.
	  a
	 / \
	b   c
	   / \
	  d   e
* **Complete** All levels are completely filled except possibly the last.
	  a
	 / \
	b   c
   /   / \
  f	  d   e
* **Perfect** All internal nodes have two children, all leaves are the same level. 
	  a
	 / \
	b   c
   / \ / \
  f	  gd  e
  
* **Balanced** Hash the minimum possible depth. 
	  a
	 / \
	b   c
   / \ 
  f	  g
  
 * **Degenerate** All nodes have one child. 
	  a
	 / 
	c
     \ 
      g
       \
        h

## Concurrency
 
 **Processes**: Isolated, no data sharing.
 **Threads**: Its own call stack and memory cache but shared data.
 
Performance gain (Amdahl's Law): f F is the percentage of the program which can not run in parallel and N is the number of processes, then the maximum performance gain is **1 / (F + ((1-F) / n))**.

### Issues: 
* **Visibility problems**: Data changed by one thread, another unaware.
	* Liveness failure: Deadlock.
	* Safety Failure: Use of incorrect data.

### Solutions:
* **synchronized** keyword.
	* One thread per block of code.
	* Synchronizing an object guarantees that no multiple threads can enter blocks of code guarded by this key.   
	* Multiple keys can be used in the same class.
	
* **volatile** keyword.
	* No local cache for the volatile variable. All changes will go to central memory immediately. Similar to this: synchronized(this){x=newValue;}
	
* **Atomic** operations: Operations performed within the same unit of work without interference of other threads.
	* double and long variables are only atomic if declared as volatile.

* **Immutability**: To make a class immutable:
	* All fields are **final**.
	* The class is declared as **final**.
	* Private fields without setters. Internal changes have no effect outside of the class.
	* If mutable values are passed from the outside, then a final copy must be made to avoid changes through referenced values.
	
It is wise to use pools. For an example go to [ExecutorsExample](https://github.com/rojosewe/GoogleInterview/blob/master/src/oljeet/concurrency/ExecutorsExample.java)

Callable<E> returns a Future<E>: Future<Long> f = callable.submit(); Long x = f.get().

The fork-join framework allows to split a task and the rejoin it much in the same way map reduce does.
 
## Testing

* Testing systems:
	* Testing levels: 
		* Unit testing.
		* Integration testing.
		* Functional testing.
		* System testing.
		* QA acceptance.
	* Box approach:
		* White box approach: 
			* API testing: Testing the code by calling APIs.
			* Code coverage: All lines of code executed at least once.
			* Fault Injection: Intentionally making the software fail.
			* Static testing: Automatically testing the source code without executing. Looking for failures in the data flow of the source code.
		* Black box approach:
			* Specification based testing.
			* Visual testing.
			
* Testing to remember:
	* For users: A/B Testing, Usability testing, Accessibility testing, Localization testing, Alpha & Beta testing.
	* For performance: Stress testing, stability testing.
	* Quality: Security, Concurrency, conformance.
	
* Process: plan, develop, execute, report, analyse, solution, retest, closure, add a new test.