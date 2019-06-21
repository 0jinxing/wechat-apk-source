package com.qq.taf.jce.dynamic;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ByteField extends NumberField
{
  private byte data;

  ByteField(byte paramByte, int paramInt)
  {
    super(paramInt);
    this.data = ((byte)paramByte);
  }

  public final byte get()
  {
    return this.data;
  }

  public final Number getNumber()
  {
    AppMethodBeat.i(117017);
    byte b = this.data;
    AppMethodBeat.o(117017);
    return Byte.valueOf(b);
  }

  public final void set(byte paramByte)
  {
    this.data = ((byte)paramByte);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.ByteField
 * JD-Core Version:    0.6.2
 */