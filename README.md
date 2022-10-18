# Map-Vs-Flatmap

flatMap flatten the output in addition to map functionality.
flatMap creates the stream out of inner object/list in a map and retruns the output in single stream

#Example 

Map Output: 
[[Dhaka, Sylhet], [Chottogram, Barishal], [Rajshahi, Dhaka, Sylhet]]

Flat Map Output: 
[Rajshahi, Chottogram, Barishal, Dhaka, Sylhet] (by applying distinct like this: .collect(Collectors.toSet()))
