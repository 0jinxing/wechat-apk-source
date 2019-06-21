package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vo;
import com.tencent.mm.sdk.platformtools.bo;

@Deprecated
public final class d extends j.b
{
  private vo fLy;

  public d(String paramString, long paramLong)
  {
    super(8);
    AppMethodBeat.i(16518);
    this.fLy = new vo();
    this.fLy.wcB = new bts().alV(bo.nullAsNil(paramString));
    this.fLy.ptF = paramLong;
    this.oqT = this.fLy;
    AppMethodBeat.o(16518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.d
 * JD-Core Version:    0.6.2
 */