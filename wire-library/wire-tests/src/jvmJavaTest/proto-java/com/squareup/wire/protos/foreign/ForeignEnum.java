// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.foreign.ForeignEnum in foreign.proto
package com.squareup.wire.protos.foreign;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.lang.Override;

public enum ForeignEnum implements WireEnum {
  BAV(0),

  BAX(1);

  public static final ProtoAdapter<ForeignEnum> ADAPTER = new ProtoAdapter_ForeignEnum();

  private final int value;

  ForeignEnum(int value) {
    this.value = value;
  }

  /**
   * Return the constant for {@code value} or null.
   */
  public static ForeignEnum fromValue(int value) {
    switch (value) {
      case 0: return BAV;
      case 1: return BAX;
      default: return null;
    }
  }

  @Override
  public int getValue() {
    return value;
  }

  private static final class ProtoAdapter_ForeignEnum extends EnumAdapter<ForeignEnum> {
    ProtoAdapter_ForeignEnum() {
      super(ForeignEnum.class, Syntax.PROTO_2, ForeignEnum.BAV);
    }

    @Override
    protected ForeignEnum fromValue(int value) {
      return ForeignEnum.fromValue(value);
    }
  }
}
