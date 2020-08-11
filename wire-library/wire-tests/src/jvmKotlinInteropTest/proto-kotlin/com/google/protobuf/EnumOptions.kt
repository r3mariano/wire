// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.EnumOptions in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.immutableCopyOf
import com.squareup.wire.internal.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class EnumOptions(
  /**
   * Set this option to true to allow mapping different tag names to the same
   * value.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val allow_alias: Boolean? = null,
  /**
   * Is this enum deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating enums.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = null,
  uninterpreted_option: List<UninterpretedOption> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<EnumOptions, EnumOptions.Builder>(ADAPTER, unknownFields) {
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = immutableCopyOf("uninterpreted_option",
      uninterpreted_option)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.allow_alias = allow_alias
    builder.deprecated = deprecated
    builder.uninterpreted_option = uninterpreted_option
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EnumOptions) return false
    if (unknownFields != other.unknownFields) return false
    if (allow_alias != other.allow_alias) return false
    if (deprecated != other.deprecated) return false
    if (uninterpreted_option != other.uninterpreted_option) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + allow_alias.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (allow_alias != null) result += """allow_alias=$allow_alias"""
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    return result.joinToString(prefix = "EnumOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    allow_alias: Boolean? = this.allow_alias,
    deprecated: Boolean? = this.deprecated,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    unknownFields: ByteString = this.unknownFields
  ): EnumOptions = EnumOptions(allow_alias, deprecated, uninterpreted_option, unknownFields)

  class Builder : Message.Builder<EnumOptions, Builder>() {
    @JvmField
    var allow_alias: Boolean? = null

    @JvmField
    var deprecated: Boolean? = null

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    /**
     * Set this option to true to allow mapping different tag names to the same
     * value.
     */
    fun allow_alias(allow_alias: Boolean?): Builder {
      this.allow_alias = allow_alias
      return this
    }

    /**
     * Is this enum deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum, or it will be completely ignored; in the very least, this
     * is a formalization for deprecating enums.
     */
    fun deprecated(deprecated: Boolean?): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    override fun build(): EnumOptions = EnumOptions(
      allow_alias = allow_alias,
      deprecated = deprecated,
      uninterpreted_option = uninterpreted_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<EnumOptions> = object : ProtoAdapter<EnumOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumOptions::class, 
      "type.googleapis.com/google.protobuf.EnumOptions", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: EnumOptions): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.allow_alias)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(3, value.deprecated)
        size += UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option)
        return size
      }

      override fun encode(writer: ProtoWriter, value: EnumOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.allow_alias)
        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.deprecated)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): EnumOptions {
        var allow_alias: Boolean? = null
        var deprecated: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            2 -> allow_alias = ProtoAdapter.BOOL.decode(reader)
            3 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumOptions(
          allow_alias = allow_alias,
          deprecated = deprecated,
          uninterpreted_option = uninterpreted_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: EnumOptions): EnumOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
