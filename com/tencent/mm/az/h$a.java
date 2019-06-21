package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.axd;

public final class h$a
{
  axd fLD;
  private int key;
  private String value;

  public h$a()
  {
    AppMethodBeat.i(59995);
    this.key = 0;
    this.value = "";
    this.fLD = new axd();
    this.fLD.pXC = 0;
    this.fLD.pXM = "";
    AppMethodBeat.o(59995);
  }

  public h$a(int paramInt, String paramString)
  {
    AppMethodBeat.i(59996);
    this.key = paramInt;
    this.value = paramString;
    this.fLD = new axd();
    this.fLD.pXC = paramInt;
    this.fLD.pXM = paramString;
    AppMethodBeat.o(59996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.h.a
 * JD-Core Version:    0.6.2
 */