# Map-Vs-Flatmap

flatMap flatten the output in addition to map functionality.
flatMap creates the stream out of inner object/list in a map and retruns the output in single stream
#Example 
map output: [[a, b, c], [d, e], [f, g, a]]
flatMap output: [a, b, c, d, e, f, g] (by applying distinct)
