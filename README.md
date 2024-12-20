# Kotlin MutableList removeIf vs removeAll subtle difference

This example demonstrates a subtle difference in behavior between Kotlin's `removeIf` and `removeAll` functions when used with mutable lists.  Both remove elements based on a predicate, but they differ in how they handle the list itself. `removeIf` modifies the list in-place, while `removeAll` returns a new list containing the elements that satisfy the predicate.

**Bug:** Unexpected behavior when using `removeIf` and `removeAll` on mutable lists, potentially causing confusion for developers expecting consistent behavior.

**Solution:** Understanding the difference and choosing the appropriate function based on whether in-place modification or a new list is desired.
