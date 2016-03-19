# Tips

* Creating a new class or implementing an interface might make it 10x easier to solve that question.
* Check for all the data strcutures:
⋅⋅* HashMap if you need to keep something sorted.

## Binary Trees

* Array is formed as:
⋅⋅* Parent(r) =⌊(r−1)/2⌋ if r≠0.
⋅⋅* Left child(r) =2r+1 if 2r+1≤n.
⋅⋅* Right child(r) =2r+2 if 2r+2≤n2.
⋅⋅* Left sibling(r) =r−1 if r is even.
⋅⋅* Right sibling(r) =r+1 if r is odd and r+1≤n.

* Trasversal orders:
⋅⋅* InOrder: left, value, right
⋅⋅* PreOrder: value, left, right
⋅⋅* PostOrder: left, right, value

* For a BFS, use a Queue Implementation. 

 