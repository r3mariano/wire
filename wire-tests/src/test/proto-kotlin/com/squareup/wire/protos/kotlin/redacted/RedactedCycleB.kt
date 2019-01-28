// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: redacted_test.proto
package com.squareup.wire.protos.kotlin.redacted

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import okio.ByteString

data class RedactedCycleB(@field:WireField(tag = 1, adapter =
    "com.squareup.wire.protos.kotlin.redacted.RedactedCycleA#ADAPTER") val a: RedactedCycleA? =
    null, val unknownFields: ByteString = ByteString.EMPTY) : Message<RedactedCycleB,
    RedactedCycleB.Builder>(ADAPTER, unknownFields) {
  @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  class Builder(private val message: RedactedCycleB) : Message.Builder<RedactedCycleB, Builder>() {
    override fun build(): RedactedCycleB = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<RedactedCycleB> = object : ProtoAdapter<RedactedCycleB>(
      FieldEncoding.LENGTH_DELIMITED, 
      RedactedCycleB::class.java
    ) {
      override fun encodedSize(value: RedactedCycleB): Int = 
        RedactedCycleA.ADAPTER.encodedSizeWithTag(1, value.a) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: RedactedCycleB) {
        RedactedCycleA.ADAPTER.encodeWithTag(writer, 1, value.a)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): RedactedCycleB {
        var a: RedactedCycleA? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = RedactedCycleA.ADAPTER.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return RedactedCycleB(
          a = a,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: RedactedCycleB): RedactedCycleB? = value.copy(
        a = value.a?.let(RedactedCycleA.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
