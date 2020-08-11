// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.FreeDrinkPromotion in pizza.proto
package squareup.proto3

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.Syntax
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import okio.ByteString

class FreeDrinkPromotion(
  @field:WireField(
    tag = 1,
    adapter = "squareup.proto3.FreeDrinkPromotion${'$'}Drink#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY
  )
  @JvmField
  val drink: Drink = Drink.UNKNOWN,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<FreeDrinkPromotion, FreeDrinkPromotion.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.drink = drink
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FreeDrinkPromotion) return false
    if (unknownFields != other.unknownFields) return false
    if (drink != other.drink) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + drink.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """drink=$drink"""
    return result.joinToString(prefix = "FreeDrinkPromotion{", separator = ", ", postfix = "}")
  }

  fun copy(drink: Drink = this.drink, unknownFields: ByteString = this.unknownFields):
      FreeDrinkPromotion = FreeDrinkPromotion(drink, unknownFields)

  class Builder : Message.Builder<FreeDrinkPromotion, Builder>() {
    @JvmField
    var drink: Drink = Drink.UNKNOWN

    fun drink(drink: Drink): Builder {
      this.drink = drink
      return this
    }

    override fun build(): FreeDrinkPromotion = FreeDrinkPromotion(
      drink = drink,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<FreeDrinkPromotion> = object : ProtoAdapter<FreeDrinkPromotion>(
      FieldEncoding.LENGTH_DELIMITED, 
      FreeDrinkPromotion::class, 
      "type.googleapis.com/squareup.proto3.FreeDrinkPromotion", 
      PROTO_3, 
      null
    ) {
      override fun encodedSize(value: FreeDrinkPromotion): Int {
        var size = value.unknownFields.size
        if (value.drink != Drink.UNKNOWN) size += Drink.ADAPTER.encodedSizeWithTag(1, value.drink)
        return size
      }

      override fun encode(writer: ProtoWriter, value: FreeDrinkPromotion) {
        if (value.drink != Drink.UNKNOWN) Drink.ADAPTER.encodeWithTag(writer, 1, value.drink)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): FreeDrinkPromotion {
        var drink: Drink = Drink.UNKNOWN
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> try {
              drink = Drink.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return FreeDrinkPromotion(
          drink = drink,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: FreeDrinkPromotion): FreeDrinkPromotion = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }

  enum class Drink(
    override val value: Int
  ) : WireEnum {
    UNKNOWN(0),

    PEPSI(1),

    MOUNTAIN_DEW(2),

    ROOT_BEER(9);

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<Drink> = object : EnumAdapter<Drink>(
        Drink::class, 
        PROTO_3, 
        Drink.UNKNOWN
      ) {
        override fun fromValue(value: Int): Drink? = Drink.fromValue(value)
      }

      @JvmStatic
      fun fromValue(value: Int): Drink? = when (value) {
        0 -> UNKNOWN
        1 -> PEPSI
        2 -> MOUNTAIN_DEW
        9 -> ROOT_BEER
        else -> null
      }
    }
  }
}
