package models
import helpers.array2dOfByte

class Frame(val width:Int){
    private val data: ArrayList<ByteArray> = ArrayList()
// data returns an array list of elements in the byte array ArrayList() is used to initialize the val

    fun addRow(byteString: String): Frame {
        val row = ByteArray(byteString.length)
        for (i in byteString.indices) {
            row[i] = "${byteString[i]}".toByte()
        }
        data.add(row)
        return this
        //The function takes in a byteString parameter which is a string of characters that need to be converted to bytes.
        //
        //The function then creates a new ByteArray object called row with a length equal to the length of byteString. The for loop iterates over each character in byteString and converts it to a byte using the toByte() function. Each converted byte is then stored in the corresponding index of the row array.
        //
        //After all characters have been converted to bytes and stored in row, the row array is added to the data array list using the add() function. Finally, the addRow() function returns the updated Frame object (this).
    }
    fun as2dByteArray(): Array<ByteArray>{
        val bytes = array2dOfByte(data.size, width)
        return data.toArray(bytes)
        //converts data array to byte array
        //helper function
    }
}