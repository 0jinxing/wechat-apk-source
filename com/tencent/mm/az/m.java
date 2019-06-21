package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.ckd;

@Deprecated
public final class m extends j.b
{
  private ckd fLH;

  public m(int paramInt)
  {
    super(30);
    AppMethodBeat.i(16522);
    this.fLH = new ckd();
    this.fLH.OpCode = paramInt;
    this.oqT = this.fLH;
    AppMethodBeat.o(16522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.m
 * JD-Core Version:    0.6.2
 */