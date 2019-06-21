package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vl;
import com.tencent.mm.sdk.platformtools.bo;

@Deprecated
public final class c extends j.b
{
  private vl fLx;
  public String username;

  public c(String paramString)
  {
    this(paramString, 0);
    this.username = paramString;
  }

  public c(String paramString, int paramInt)
  {
    super(4);
    AppMethodBeat.i(988);
    this.fLx = new vl();
    this.fLx.wcB = new bts().alV(bo.nullAsNil(paramString));
    this.fLx.wcC = paramInt;
    this.oqT = this.fLx;
    AppMethodBeat.o(988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.c
 * JD-Core Version:    0.6.2
 */