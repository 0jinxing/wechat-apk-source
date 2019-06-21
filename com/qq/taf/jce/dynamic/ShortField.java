package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ShortField extends NumberField
{
  private short data;

  ShortField(short paramShort, int paramInt)
  {
    super(paramInt);
    this.data = ((short)paramShort);
  }

  public final short get()
  {
    return this.data;
  }

  public final Number getNumber()
  {
    AppMethodBeat.i(117008);
    short s = this.data;
    AppMethodBeat.o(117008);
    return Short.valueOf(s);
  }

  public final void set(short paramShort)
  {
    this.data = ((short)paramShort);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ShortField
 * JD-Core Version:    0.6.2
 */