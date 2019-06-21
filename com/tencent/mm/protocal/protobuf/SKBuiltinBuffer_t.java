package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class SKBuiltinBuffer_t extends com.tencent.mm.bt.a
{
  private static final int fieldNumberBuffer = 2;
  private static final int fieldNumberILen = 1;
  private com.tencent.mm.bt.b Buffer;
  private boolean hasBuffer;
  private boolean hasILen;
  private int iLen;

  private int computeNestedMessageSize()
  {
    return 0;
  }

  private SKBuiltinBuffer_t setILen(int paramInt)
  {
    this.iLen = paramInt;
    this.hasILen = true;
    return this;
  }

  public int computeSize()
  {
    AppMethodBeat.i(51838);
    int i = e.a.a.b.b.a.bs(1, this.iLen) + 0;
    int j = i;
    if (this.hasBuffer)
      j = i + e.a.a.b.b.a.b(2, this.Buffer);
    i = computeNestedMessageSize();
    AppMethodBeat.o(51838);
    return j + i;
  }

  public com.tencent.mm.bt.b getBuffer()
  {
    return this.Buffer;
  }

  public byte[] getBufferToBytes()
  {
    return this.Buffer.wR;
  }

  public int getILen()
  {
    return this.iLen;
  }

  public boolean hasBuffer()
  {
    return this.hasBuffer;
  }

  public SKBuiltinBuffer_t parseFrom(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51842);
    paramArrayOfByte = new e.a.a.a.a(paramArrayOfByte, unknownTagHandler);
    for (int i = getNextFieldNumber(paramArrayOfByte); ; i = getNextFieldNumber(paramArrayOfByte))
    {
      if (i <= 0)
      {
        paramArrayOfByte = validate();
        AppMethodBeat.o(51842);
        return paramArrayOfByte;
      }
      if (!populateBuilderWithField(paramArrayOfByte, this, i))
        paramArrayOfByte.ems();
    }
  }

  public final boolean populateBuilderWithField(e.a.a.a.a parama, com.tencent.mm.bt.a parama1, int paramInt)
  {
    AppMethodBeat.i(51841);
    parama1 = (SKBuiltinBuffer_t)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default:
      bool = false;
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(51841);
      return bool;
      parama1.setILen(parama.BTU.vd());
      continue;
      parama1.setBuffer(parama.BTU.emu());
    }
  }

  public SKBuiltinBuffer_t setBuffer(com.tencent.mm.bt.b paramb)
  {
    AppMethodBeat.i(51835);
    if (paramb == null)
      setBuffer(null);
    this.Buffer = paramb;
    this.hasBuffer = true;
    setILen(this.Buffer.wR.length);
    AppMethodBeat.o(51835);
    return this;
  }

  public SKBuiltinBuffer_t setBuffer(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51833);
    paramArrayOfByte = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    setBuffer(paramArrayOfByte);
    setILen(paramArrayOfByte.wR.length);
    AppMethodBeat.o(51833);
    return this;
  }

  public SKBuiltinBuffer_t setBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51834);
    paramArrayOfByte = com.tencent.mm.bt.b.y(paramArrayOfByte, paramInt1, paramInt2);
    setBuffer(paramArrayOfByte);
    setILen(paramArrayOfByte.wR.length);
    AppMethodBeat.o(51834);
    return this;
  }

  public byte[] toByteArray()
  {
    AppMethodBeat.i(51839);
    validate();
    byte[] arrayOfByte = super.toByteArray();
    AppMethodBeat.o(51839);
    return arrayOfByte;
  }

  public String toString()
  {
    AppMethodBeat.i(51836);
    String str1 = new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString() + "iLen = " + this.iLen + "   ";
    String str2 = str1;
    if (this.hasBuffer)
      str2 = str1 + "Buffer = " + this.Buffer + "   ";
    str2 = str2 + ")";
    AppMethodBeat.o(51836);
    return str2;
  }

  protected SKBuiltinBuffer_t validate()
  {
    AppMethodBeat.i(51837);
    if (!this.hasILen)
    {
      e.a.a.b localb = new e.a.a.b("Not all required fields were included (false = not included in message),  iLen:" + this.hasILen);
      AppMethodBeat.o(51837);
      throw localb;
    }
    AppMethodBeat.o(51837);
    return this;
  }

  public void writeFields(e.a.a.c.a parama)
  {
    AppMethodBeat.i(51840);
    parama.iz(1, this.iLen);
    if (this.hasBuffer)
      parama.c(2, this.Buffer);
    AppMethodBeat.o(51840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t
 * JD-Core Version:    0.6.2
 */