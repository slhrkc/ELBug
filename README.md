ELBug
=====

To produce the overloading bug in EL
-------------------------------------------------------------------

The cause of the problem is that EL can't determine the right method to call. 
Instead of calling Vector.remove(Object o), it calls Vector.remove(int index).

I think this is because of the way EL resolving algorithm. The algorithm just calls getMethod() with "name" and number of parameters.

So when it calls getMethod() method on Vector class, remove(int index) matches the "name" and the number of parameters. As it is the first matching method it is returned.
