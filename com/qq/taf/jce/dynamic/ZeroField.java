package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ZeroField extends NumberField
{
  ZeroField(int paramInt)
  {
    super(paramInt);
  }

  public final byte byteValue()
  {
    return 0;
  }

  public final double doubleValue()
  {
    return 0.0D;
  }

  public final float floatValue()
  {
    return 0.0F;
  }

  public final Number getNumber()
  {
    AppMethodBeat.i(117015);
    AppMethodBeat.o(117015);
    return Integer.valueOf(0);
  }

  public final int intValue()
  {
    return 0;
  }

  public final long longValue()
  {
    return 0L;
  }

  public final short shortValue()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ZeroField
 * JD-Core Version:    0.6.2
 */