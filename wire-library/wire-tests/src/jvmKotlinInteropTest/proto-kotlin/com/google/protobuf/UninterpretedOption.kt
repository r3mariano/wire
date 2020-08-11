// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.UninterpretedOption in google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.immutableCopyOf
import com.squareup.wire.internal.missingRequiredFields
import com.squareup.wire.internal.redactElements
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * A message representing a option the parser does not recognize. This only
 * appears in options protos created by the compiler::Parser class.
 * DescriptorPool resolves these when building Descriptor objects. Therefore,
 * options protos in descriptor objects (e.g. returned by Descriptor::options(),
 * or produced by Descriptor::CopyTo()) will never have UninterpretedOptions
 * in them.
 */
class UninterpretedOption(
  name: List<NamePart> = emptyList(),
  /**
   * The value of the uninterpreted option, in whatever type the tokenizer
   * identified it as during parsing. Exactly one of these should be set.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val identifier_value: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#UINT64"
  )
  @JvmField
  val positive_int_value: Long? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  @JvmField
  val negative_int_value: Long? = null,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE"
  )
  @JvmField
  val double_value: Double? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  @JvmField
  val string_value: ByteString? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  @JvmField
  val aggregate_value: String? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<UninterpretedOption, UninterpretedOption.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 2,
    adapter = "com.google.protobuf.UninterpretedOption${'$'}NamePart#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val name: List<NamePart> = immutableCopyOf("name", name)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.identifier_value = identifier_value
    builder.positive_int_value = positive_int_value
    builder.negative_int_value = negative_int_value
    builder.double_value = double_value
    builder.string_value = string_value
    builder.aggregate_value = aggregate_value
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is UninterpretedOption) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (identifier_value != other.identifier_value) return false
    if (positive_int_value != other.positive_int_value) return false
    if (negative_int_value != other.negative_int_value) return false
    if (double_value != other.double_value) return false
    if (string_value != other.string_value) return false
    if (aggregate_value != other.aggregate_value) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + identifier_value.hashCode()
      result = result * 37 + positive_int_value.hashCode()
      result = result * 37 + negative_int_value.hashCode()
      result = result * 37 + double_value.hashCode()
      result = result * 37 + string_value.hashCode()
      result = result * 37 + aggregate_value.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name.isNotEmpty()) result += """name=$name"""
    if (identifier_value != null) result += """identifier_value=${sanitize(identifier_value)}"""
    if (positive_int_value != null) result += """positive_int_value=$positive_int_value"""
    if (negative_int_value != null) result += """negative_int_value=$negative_int_value"""
    if (double_value != null) result += """double_value=$double_value"""
    if (string_value != null) result += """string_value=$string_value"""
    if (aggregate_value != null) result += """aggregate_value=${sanitize(aggregate_value)}"""
    return result.joinToString(prefix = "UninterpretedOption{", separator = ", ", postfix = "}")
  }

  fun copy(
    name: List<NamePart> = this.name,
    identifier_value: String? = this.identifier_value,
    positive_int_value: Long? = this.positive_int_value,
    negative_int_value: Long? = this.negative_int_value,
    double_value: Double? = this.double_value,
    string_value: ByteString? = this.string_value,
    aggregate_value: String? = this.aggregate_value,
    unknownFields: ByteString = this.unknownFields
  ): UninterpretedOption = UninterpretedOption(name, identifier_value, positive_int_value,
      negative_int_value, double_value, string_value, aggregate_value, unknownFields)

  class Builder : Message.Builder<UninterpretedOption, Builder>() {
    @JvmField
    var name: List<NamePart> = emptyList()

    @JvmField
    var identifier_value: String? = null

    @JvmField
    var positive_int_value: Long? = null

    @JvmField
    var negative_int_value: Long? = null

    @JvmField
    var double_value: Double? = null

    @JvmField
    var string_value: ByteString? = null

    @JvmField
    var aggregate_value: String? = null

    fun name(name: List<NamePart>): Builder {
      checkElementsNotNull(name)
      this.name = name
      return this
    }

    /**
     * The value of the uninterpreted option, in whatever type the tokenizer
     * identified it as during parsing. Exactly one of these should be set.
     */
    fun identifier_value(identifier_value: String?): Builder {
      this.identifier_value = identifier_value
      return this
    }

    fun positive_int_value(positive_int_value: Long?): Builder {
      this.positive_int_value = positive_int_value
      return this
    }

    fun negative_int_value(negative_int_value: Long?): Builder {
      this.negative_int_value = negative_int_value
      return this
    }

    fun double_value(double_value: Double?): Builder {
      this.double_value = double_value
      return this
    }

    fun string_value(string_value: ByteString?): Builder {
      this.string_value = string_value
      return this
    }

    fun aggregate_value(aggregate_value: String?): Builder {
      this.aggregate_value = aggregate_value
      return this
    }

    override fun build(): UninterpretedOption = UninterpretedOption(
      name = name,
      identifier_value = identifier_value,
      positive_int_value = positive_int_value,
      negative_int_value = negative_int_value,
      double_value = double_value,
      string_value = string_value,
      aggregate_value = aggregate_value,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<UninterpretedOption> = object : ProtoAdapter<UninterpretedOption>(
      FieldEncoding.LENGTH_DELIMITED, 
      UninterpretedOption::class, 
      "type.googleapis.com/google.protobuf.UninterpretedOption", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: UninterpretedOption): Int {
        var size = value.unknownFields.size
        size += NamePart.ADAPTER.asRepeated().encodedSizeWithTag(2, value.name)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.identifier_value)
        size += ProtoAdapter.UINT64.encodedSizeWithTag(4, value.positive_int_value)
        size += ProtoAdapter.INT64.encodedSizeWithTag(5, value.negative_int_value)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, value.double_value)
        size += ProtoAdapter.BYTES.encodedSizeWithTag(7, value.string_value)
        size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.aggregate_value)
        return size
      }

      override fun encode(writer: ProtoWriter, value: UninterpretedOption) {
        NamePart.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.name)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.identifier_value)
        ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.positive_int_value)
        ProtoAdapter.INT64.encodeWithTag(writer, 5, value.negative_int_value)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, value.double_value)
        ProtoAdapter.BYTES.encodeWithTag(writer, 7, value.string_value)
        ProtoAdapter.STRING.encodeWithTag(writer, 8, value.aggregate_value)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): UninterpretedOption {
        val name = mutableListOf<NamePart>()
        var identifier_value: String? = null
        var positive_int_value: Long? = null
        var negative_int_value: Long? = null
        var double_value: Double? = null
        var string_value: ByteString? = null
        var aggregate_value: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            2 -> name.add(NamePart.ADAPTER.decode(reader))
            3 -> identifier_value = ProtoAdapter.STRING.decode(reader)
            4 -> positive_int_value = ProtoAdapter.UINT64.decode(reader)
            5 -> negative_int_value = ProtoAdapter.INT64.decode(reader)
            6 -> double_value = ProtoAdapter.DOUBLE.decode(reader)
            7 -> string_value = ProtoAdapter.BYTES.decode(reader)
            8 -> aggregate_value = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return UninterpretedOption(
          name = name,
          identifier_value = identifier_value,
          positive_int_value = positive_int_value,
          negative_int_value = negative_int_value,
          double_value = double_value,
          string_value = string_value,
          aggregate_value = aggregate_value,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: UninterpretedOption): UninterpretedOption = value.copy(
        name = value.name.redactElements(NamePart.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  /**
   * The name of the uninterpreted option.  Each string represents a segment in
   * a dot-separated name.  is_extension is true iff a segment represents an
   * extension (denoted with parentheses in options specs in .proto files).
   * E.g.,{ ["foo", false], ["bar.baz", true], ["qux", false] } represents
   * "foo.(bar.baz).qux".
   */
  class NamePart(
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REQUIRED
    )
    @JvmField
    val name_part: String,
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL",
      label = WireField.Label.REQUIRED
    )
    @JvmField
    val is_extension: Boolean,
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<NamePart, NamePart.Builder>(ADAPTER, unknownFields) {
    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.name_part = name_part
      builder.is_extension = is_extension
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is NamePart) return false
      if (unknownFields != other.unknownFields) return false
      if (name_part != other.name_part) return false
      if (is_extension != other.is_extension) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + name_part.hashCode()
        result = result * 37 + is_extension.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """name_part=${sanitize(name_part)}"""
      result += """is_extension=$is_extension"""
      return result.joinToString(prefix = "NamePart{", separator = ", ", postfix = "}")
    }

    fun copy(
      name_part: String = this.name_part,
      is_extension: Boolean = this.is_extension,
      unknownFields: ByteString = this.unknownFields
    ): NamePart = NamePart(name_part, is_extension, unknownFields)

    class Builder : Message.Builder<NamePart, Builder>() {
      @JvmField
      var name_part: String? = null

      @JvmField
      var is_extension: Boolean? = null

      fun name_part(name_part: String): Builder {
        this.name_part = name_part
        return this
      }

      fun is_extension(is_extension: Boolean): Builder {
        this.is_extension = is_extension
        return this
      }

      override fun build(): NamePart = NamePart(
        name_part = name_part ?: throw missingRequiredFields(name_part, "name_part"),
        is_extension = is_extension ?: throw missingRequiredFields(is_extension, "is_extension"),
        unknownFields = buildUnknownFields()
      )
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<NamePart> = object : ProtoAdapter<NamePart>(
        FieldEncoding.LENGTH_DELIMITED, 
        NamePart::class, 
        "type.googleapis.com/google.protobuf.UninterpretedOption.NamePart", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: NamePart): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name_part)
          size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.is_extension)
          return size
        }

        override fun encode(writer: ProtoWriter, value: NamePart) {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name_part)
          ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.is_extension)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): NamePart {
          var name_part: String? = null
          var is_extension: Boolean? = null
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> name_part = ProtoAdapter.STRING.decode(reader)
              2 -> is_extension = ProtoAdapter.BOOL.decode(reader)
              else -> reader.readUnknownField(tag)
            }
          }
          return NamePart(
            name_part = name_part ?: throw missingRequiredFields(name_part, "name_part"),
            is_extension = is_extension ?: throw missingRequiredFields(is_extension,
                "is_extension"),
            unknownFields = unknownFields
          )
        }

        override fun redact(value: NamePart): NamePart = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }
}
