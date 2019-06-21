package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class btt extends com.tencent.mm.bt.a
{
  public int wVK;
  private boolean wVL;

  private btt dmA()
  {
    AppMethodBeat.i(51846);
    if (!this.wVL)
    {
      b localb = new b("Not all required fields were included (false = not included in message),  uiVal:" + this.wVL);
      AppMethodBeat.o(51846);
      throw localb;
    }
    AppMethodBeat.o(51846);
    return this;
  }

  public final btt LQ(int paramInt)
  {
    this.wVK = paramInt;
    this.wVL = true;
    return this;
  }

  public final int computeSize()
  {
    AppMethodBeat.i(51847);
    int i = e.a.a.b.b.a.bs(1, this.wVK);
    AppMethodBeat.o(51847);
    return i + 0 + 0;
  }

  public final boolean populateBuilderWithField(e.a.a.a.a parama, com.tencent.mm.bt.a parama1, int paramInt)
  {
    AppMethodBeat.i(51850);
    parama1 = (btt)parama1;
    boolean bool = true;
    switch (paramInt)
    {
    default:
      bool = false;
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(51850);
      return bool;
      parama1.LQ(parama.BTU.vd());
    }
  }

  public final byte[] toByteArray()
  {
    AppMethodBeat.i(51848);
    dmA();
    byte[] arrayOfByte = super.toByteArray();
    AppMethodBeat.o(51848);
    return arrayOfByte;
  }

  public final String toString()
  {
    AppMethodBeat.i(51845);
    String str = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append(getClass().getName()).append("(").toString())).append("uiVal = ").append(this.wVK).append("   ").toString() + ")";
    AppMethodBeat.o(51845);
    return str;
  }

  public final void writeFields(e.a.a.c.a parama)
  {
    AppMethodBeat.i(51849);
    parama.iz(1, this.wVK);
    AppMethodBeat.o(51849);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.btt
 * JD-Core Version:    0.6.2
 */