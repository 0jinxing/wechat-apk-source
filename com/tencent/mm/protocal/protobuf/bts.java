package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bts extends com.tencent.mm.bt.a
{
  public String wVI;
  private boolean wVJ;

  public final bts alV(String paramString)
  {
    this.wVI = paramString;
    this.wVJ = true;
    return this;
  }

  public final int computeSize()
  {
    AppMethodBeat.i(51853);
    int i = 0;
    if (this.wVJ)
      i = e.a.a.b.b.a.f(1, this.wVI) + 0;
    AppMethodBeat.o(51853);
    return i + 0;
  }

  public final boolean populateBuilderWithField(e.a.a.a.a parama, com.tencent.mm.bt.a parama1, int paramInt)
  {
    AppMethodBeat.i(51856);
    parama1 = (bts)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default:
      bool = false;
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(51856);
      return bool;
      parama1.alV(parama.BTU.readString());
    }
  }

  public final byte[] toByteArray()
  {
    AppMethodBeat.i(51854);
    byte[] arrayOfByte = super.toByteArray();
    AppMethodBeat.o(51854);
    return arrayOfByte;
  }

  public final String toString()
  {
    return this.wVI;
  }

  public final void writeFields(e.a.a.c.a parama)
  {
    AppMethodBeat.i(51855);
    if (this.wVJ)
      parama.e(1, this.wVI);
    AppMethodBeat.o(51855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bts
 * JD-Core Version:    0.6.2
 */