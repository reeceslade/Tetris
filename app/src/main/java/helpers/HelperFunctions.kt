package helpers

fun array2dOfByte(sizeOuter:Int, sizeInner:Int): Array<ByteArray>
= Array(sizeOuter) { ByteArray(sizeInner) }
//arguments = row and col
// this function generates and returns a new array with the specified properties
