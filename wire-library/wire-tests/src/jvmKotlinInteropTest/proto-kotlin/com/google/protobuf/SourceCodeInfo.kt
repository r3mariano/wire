// Code generated by Wire protocol buffer compiler, do not edit.
// Source: google.protobuf.SourceCodeInfo in google/protobuf/descriptor.proto
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
import com.squareup.wire.internal.redactElements
import com.squareup.wire.internal.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * ===================================================================
 * Optional source code info
 * Encapsulates information about the original source file from which a
 * FileDescriptorProto was generated.
 */
class SourceCodeInfo(
  location: List<Location> = emptyList(),
  unknownFields: ByteString = ByteString.EMPTY
) : Message<SourceCodeInfo, SourceCodeInfo.Builder>(ADAPTER, unknownFields) {
  /**
   * A Location identifies a piece of source code in a .proto file which
   * corresponds to a particular definition.  This information is intended
   * to be useful to IDEs, code indexers, documentation generators, and similar
   * tools.
   *
   * For example, say we have a file like:
   *   message Foo {
   *     optional string foo = 1;
   *   }
   * Let's look at just the field definition:
   *   optional string foo = 1;
   *   ^       ^^     ^^  ^  ^^^
   *   a       bc     de  f  ghi
   * We have the following locations:
   *   span   path               represents
   *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
   *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
   *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
   *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
   *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
   *
   * Notes:
   * - A location may refer to a repeated field itself (i.e. not to any
   *   particular index within it).  This is used whenever a set of elements are
   *   logically enclosed in a single code segment.  For example, an entire
   *   extend block (possibly containing multiple extension definitions) will
   *   have an outer location whose path refers to the "extensions" repeated
   *   field without an index.
   * - Multiple locations may have the same path.  This happens when a single
   *   logical declaration is spread out across multiple places.  The most
   *   obvious example is the "extend" block again -- there may be multiple
   *   extend blocks in the same scope, each of which will have the same path.
   * - A location's span is not always a subset of its parent's span.  For
   *   example, the "extendee" of an extension declaration appears at the
   *   beginning of the "extend" block and is shared by all extensions within
   *   the block.
   * - Just because a location's span is a subset of some other location's span
   *   does not mean that it is a descendant.  For example, a "group" defines
   *   both a type and a field in a single declaration.  Thus, the locations
   *   corresponding to the type and field and their components will overlap.
   * - Code which tries to interpret locations should probably be designed to
   *   ignore those that it doesn't understand, as more types of locations could
   *   be recorded in the future.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.google.protobuf.SourceCodeInfo${'$'}Location#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val location: List<Location> = immutableCopyOf("location", location)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.location = location
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SourceCodeInfo) return false
    if (unknownFields != other.unknownFields) return false
    if (location != other.location) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + location.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (location.isNotEmpty()) result += """location=$location"""
    return result.joinToString(prefix = "SourceCodeInfo{", separator = ", ", postfix = "}")
  }

  fun copy(location: List<Location> = this.location, unknownFields: ByteString =
      this.unknownFields): SourceCodeInfo = SourceCodeInfo(location, unknownFields)

  class Builder : Message.Builder<SourceCodeInfo, Builder>() {
    @JvmField
    var location: List<Location> = emptyList()

    /**
     * A Location identifies a piece of source code in a .proto file which
     * corresponds to a particular definition.  This information is intended
     * to be useful to IDEs, code indexers, documentation generators, and similar
     * tools.
     *
     * For example, say we have a file like:
     *   message Foo {
     *     optional string foo = 1;
     *   }
     * Let's look at just the field definition:
     *   optional string foo = 1;
     *   ^       ^^     ^^  ^  ^^^
     *   a       bc     de  f  ghi
     * We have the following locations:
     *   span   path               represents
     *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
     *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
     *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
     *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
     *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
     *
     * Notes:
     * - A location may refer to a repeated field itself (i.e. not to any
     *   particular index within it).  This is used whenever a set of elements are
     *   logically enclosed in a single code segment.  For example, an entire
     *   extend block (possibly containing multiple extension definitions) will
     *   have an outer location whose path refers to the "extensions" repeated
     *   field without an index.
     * - Multiple locations may have the same path.  This happens when a single
     *   logical declaration is spread out across multiple places.  The most
     *   obvious example is the "extend" block again -- there may be multiple
     *   extend blocks in the same scope, each of which will have the same path.
     * - A location's span is not always a subset of its parent's span.  For
     *   example, the "extendee" of an extension declaration appears at the
     *   beginning of the "extend" block and is shared by all extensions within
     *   the block.
     * - Just because a location's span is a subset of some other location's span
     *   does not mean that it is a descendant.  For example, a "group" defines
     *   both a type and a field in a single declaration.  Thus, the locations
     *   corresponding to the type and field and their components will overlap.
     * - Code which tries to interpret locations should probably be designed to
     *   ignore those that it doesn't understand, as more types of locations could
     *   be recorded in the future.
     */
    fun location(location: List<Location>): Builder {
      checkElementsNotNull(location)
      this.location = location
      return this
    }

    override fun build(): SourceCodeInfo = SourceCodeInfo(
      location = location,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<SourceCodeInfo> = object : ProtoAdapter<SourceCodeInfo>(
      FieldEncoding.LENGTH_DELIMITED, 
      SourceCodeInfo::class, 
      "type.googleapis.com/google.protobuf.SourceCodeInfo", 
      PROTO_2, 
      null
    ) {
      override fun encodedSize(value: SourceCodeInfo): Int {
        var size = value.unknownFields.size
        size += Location.ADAPTER.asRepeated().encodedSizeWithTag(1, value.location)
        return size
      }

      override fun encode(writer: ProtoWriter, value: SourceCodeInfo) {
        Location.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.location)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): SourceCodeInfo {
        val location = mutableListOf<Location>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> location.add(Location.ADAPTER.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return SourceCodeInfo(
          location = location,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: SourceCodeInfo): SourceCodeInfo = value.copy(
        location = value.location.redactElements(Location.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  class Location(
    path: List<Int> = emptyList(),
    span: List<Int> = emptyList(),
    /**
     * If this SourceCodeInfo represents a complete declaration, these are any
     * comments appearing before and after the declaration which appear to be
     * attached to the declaration.
     *
     * A series of line comments appearing on consecutive lines, with no other
     * tokens appearing on those lines, will be treated as a single comment.
     *
     * leading_detached_comments will keep paragraphs of comments that appear
     * before (but not connected to) the current element. Each paragraph,
     * separated by empty lines, will be one comment element in the repeated
     * field.
     *
     * Only the comment content is provided; comment markers (e.g. //) are
     * stripped out.  For block comments, leading whitespace and an asterisk
     * will be stripped from the beginning of each line other than the first.
     * Newlines are included in the output.
     *
     * Examples:
     *
     *   optional int32 foo = 1;  // Comment attached to foo.
     *   // Comment attached to bar.
     *   optional int32 bar = 2;
     *
     *   optional string baz = 3;
     *   // Comment attached to baz.
     *   // Another line attached to baz.
     *
     *   // Comment attached to qux.
     *   //
     *   // Another line attached to qux.
     *   optional double qux = 4;
     *
     *   // Detached comment for corge. This is not leading or trailing comments
     *   // to qux or corge because there are blank lines separating it from
     *   // both.
     *
     *   // Detached comment for corge paragraph 2.
     *
     *   optional string corge = 5;
     *   /&#42; Block comment attached
     *    * to corge.  Leading asterisks
     *    * will be removed. &#42;/
     *   /&#42; Block comment attached to
     *    * grault. &#42;/
     *   optional int32 grault = 6;
     *
     *   // ignored detached comments.
     */
    @field:WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    @JvmField
    val leading_comments: String? = null,
    @field:WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    @JvmField
    val trailing_comments: String? = null,
    leading_detached_comments: List<String> = emptyList(),
    unknownFields: ByteString = ByteString.EMPTY
  ) : Message<Location, Location.Builder>(ADAPTER, unknownFields) {
    /**
     * Identifies which part of the FileDescriptorProto was defined at this
     * location.
     *
     * Each element is a field number or an index.  They form a path from
     * the root FileDescriptorProto to the place where the definition.  For
     * example, this path:
     *   [ 4, 3, 2, 7, 1 ]
     * refers to:
     *   file.message_type(3)  // 4, 3
     *       .field(7)         // 2, 7
     *       .name()           // 1
     * This is because FileDescriptorProto.message_type has field number 4:
     *   repeated DescriptorProto message_type = 4;
     * and DescriptorProto.field has field number 2:
     *   repeated FieldDescriptorProto field = 2;
     * and FieldDescriptorProto.name has field number 1:
     *   optional string name = 1;
     *
     * Thus, the above path gives the location of a field name.  If we removed
     * the last element:
     *   [ 4, 3, 2, 7 ]
     * this path refers to the whole field declaration (from the beginning
     * of the label to the terminating semicolon).
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED
    )
    @JvmField
    val path: List<Int> = immutableCopyOf("path", path)

    /**
     * Always has exactly three or four elements: start line, start column,
     * end line (optional, otherwise assumed same as start line), end column.
     * These are packed into a single field for efficiency.  Note that line
     * and column numbers are zero-based -- typically you will want to add
     * 1 to each before displaying to a user.
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT32",
      label = WireField.Label.PACKED
    )
    @JvmField
    val span: List<Int> = immutableCopyOf("span", span)

    @field:WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.REPEATED
    )
    @JvmField
    val leading_detached_comments: List<String> = immutableCopyOf("leading_detached_comments",
        leading_detached_comments)

    override fun newBuilder(): Builder {
      val builder = Builder()
      builder.path = path
      builder.span = span
      builder.leading_comments = leading_comments
      builder.trailing_comments = trailing_comments
      builder.leading_detached_comments = leading_detached_comments
      builder.addUnknownFields(unknownFields)
      return builder
    }

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is Location) return false
      if (unknownFields != other.unknownFields) return false
      if (path != other.path) return false
      if (span != other.span) return false
      if (leading_comments != other.leading_comments) return false
      if (trailing_comments != other.trailing_comments) return false
      if (leading_detached_comments != other.leading_detached_comments) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + path.hashCode()
        result = result * 37 + span.hashCode()
        result = result * 37 + leading_comments.hashCode()
        result = result * 37 + trailing_comments.hashCode()
        result = result * 37 + leading_detached_comments.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      if (path.isNotEmpty()) result += """path=$path"""
      if (span.isNotEmpty()) result += """span=$span"""
      if (leading_comments != null) result += """leading_comments=${sanitize(leading_comments)}"""
      if (trailing_comments != null) result +=
          """trailing_comments=${sanitize(trailing_comments)}"""
      if (leading_detached_comments.isNotEmpty()) result +=
          """leading_detached_comments=${sanitize(leading_detached_comments)}"""
      return result.joinToString(prefix = "Location{", separator = ", ", postfix = "}")
    }

    fun copy(
      path: List<Int> = this.path,
      span: List<Int> = this.span,
      leading_comments: String? = this.leading_comments,
      trailing_comments: String? = this.trailing_comments,
      leading_detached_comments: List<String> = this.leading_detached_comments,
      unknownFields: ByteString = this.unknownFields
    ): Location = Location(path, span, leading_comments, trailing_comments,
        leading_detached_comments, unknownFields)

    class Builder : Message.Builder<Location, Builder>() {
      @JvmField
      var path: List<Int> = emptyList()

      @JvmField
      var span: List<Int> = emptyList()

      @JvmField
      var leading_comments: String? = null

      @JvmField
      var trailing_comments: String? = null

      @JvmField
      var leading_detached_comments: List<String> = emptyList()

      /**
       * Identifies which part of the FileDescriptorProto was defined at this
       * location.
       *
       * Each element is a field number or an index.  They form a path from
       * the root FileDescriptorProto to the place where the definition.  For
       * example, this path:
       *   [ 4, 3, 2, 7, 1 ]
       * refers to:
       *   file.message_type(3)  // 4, 3
       *       .field(7)         // 2, 7
       *       .name()           // 1
       * This is because FileDescriptorProto.message_type has field number 4:
       *   repeated DescriptorProto message_type = 4;
       * and DescriptorProto.field has field number 2:
       *   repeated FieldDescriptorProto field = 2;
       * and FieldDescriptorProto.name has field number 1:
       *   optional string name = 1;
       *
       * Thus, the above path gives the location of a field name.  If we removed
       * the last element:
       *   [ 4, 3, 2, 7 ]
       * this path refers to the whole field declaration (from the beginning
       * of the label to the terminating semicolon).
       */
      fun path(path: List<Int>): Builder {
        checkElementsNotNull(path)
        this.path = path
        return this
      }

      /**
       * Always has exactly three or four elements: start line, start column,
       * end line (optional, otherwise assumed same as start line), end column.
       * These are packed into a single field for efficiency.  Note that line
       * and column numbers are zero-based -- typically you will want to add
       * 1 to each before displaying to a user.
       */
      fun span(span: List<Int>): Builder {
        checkElementsNotNull(span)
        this.span = span
        return this
      }

      /**
       * If this SourceCodeInfo represents a complete declaration, these are any
       * comments appearing before and after the declaration which appear to be
       * attached to the declaration.
       *
       * A series of line comments appearing on consecutive lines, with no other
       * tokens appearing on those lines, will be treated as a single comment.
       *
       * leading_detached_comments will keep paragraphs of comments that appear
       * before (but not connected to) the current element. Each paragraph,
       * separated by empty lines, will be one comment element in the repeated
       * field.
       *
       * Only the comment content is provided; comment markers (e.g. //) are
       * stripped out.  For block comments, leading whitespace and an asterisk
       * will be stripped from the beginning of each line other than the first.
       * Newlines are included in the output.
       *
       * Examples:
       *
       *   optional int32 foo = 1;  // Comment attached to foo.
       *   // Comment attached to bar.
       *   optional int32 bar = 2;
       *
       *   optional string baz = 3;
       *   // Comment attached to baz.
       *   // Another line attached to baz.
       *
       *   // Comment attached to qux.
       *   //
       *   // Another line attached to qux.
       *   optional double qux = 4;
       *
       *   // Detached comment for corge. This is not leading or trailing comments
       *   // to qux or corge because there are blank lines separating it from
       *   // both.
       *
       *   // Detached comment for corge paragraph 2.
       *
       *   optional string corge = 5;
       *   /&#42; Block comment attached
       *    * to corge.  Leading asterisks
       *    * will be removed. &#42;/
       *   /&#42; Block comment attached to
       *    * grault. &#42;/
       *   optional int32 grault = 6;
       *
       *   // ignored detached comments.
       */
      fun leading_comments(leading_comments: String?): Builder {
        this.leading_comments = leading_comments
        return this
      }

      fun trailing_comments(trailing_comments: String?): Builder {
        this.trailing_comments = trailing_comments
        return this
      }

      fun leading_detached_comments(leading_detached_comments: List<String>): Builder {
        checkElementsNotNull(leading_detached_comments)
        this.leading_detached_comments = leading_detached_comments
        return this
      }

      override fun build(): Location = Location(
        path = path,
        span = span,
        leading_comments = leading_comments,
        trailing_comments = trailing_comments,
        leading_detached_comments = leading_detached_comments,
        unknownFields = buildUnknownFields()
      )
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Location> = object : ProtoAdapter<Location>(
        FieldEncoding.LENGTH_DELIMITED, 
        Location::class, 
        "type.googleapis.com/google.protobuf.SourceCodeInfo.Location", 
        PROTO_2, 
        null
      ) {
        override fun encodedSize(value: Location): Int {
          var size = value.unknownFields.size
          size += ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, value.path)
          size += ProtoAdapter.INT32.asPacked().encodedSizeWithTag(2, value.span)
          size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.leading_comments)
          size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.trailing_comments)
          size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6,
              value.leading_detached_comments)
          return size
        }

        override fun encode(writer: ProtoWriter, value: Location) {
          ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, value.path)
          ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 2, value.span)
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.leading_comments)
          ProtoAdapter.STRING.encodeWithTag(writer, 4, value.trailing_comments)
          ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.leading_detached_comments)
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): Location {
          val path = mutableListOf<Int>()
          val span = mutableListOf<Int>()
          var leading_comments: String? = null
          var trailing_comments: String? = null
          val leading_detached_comments = mutableListOf<String>()
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> path.add(ProtoAdapter.INT32.decode(reader))
              2 -> span.add(ProtoAdapter.INT32.decode(reader))
              3 -> leading_comments = ProtoAdapter.STRING.decode(reader)
              4 -> trailing_comments = ProtoAdapter.STRING.decode(reader)
              6 -> leading_detached_comments.add(ProtoAdapter.STRING.decode(reader))
              else -> reader.readUnknownField(tag)
            }
          }
          return Location(
            path = path,
            span = span,
            leading_comments = leading_comments,
            trailing_comments = trailing_comments,
            leading_detached_comments = leading_detached_comments,
            unknownFields = unknownFields
          )
        }

        override fun redact(value: Location): Location = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }
}
