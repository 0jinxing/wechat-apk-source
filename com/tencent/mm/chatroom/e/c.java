package com.tencent.mm.chatroom.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bor;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.bo;

@Deprecated
public final class c extends j.b
{
  private bor ehH;

  public c(String paramString1, String paramString2)
  {
    super(16);
    AppMethodBeat.i(103959);
    this.ehH = new bor();
    this.ehH.wcB = new bts().alV(bo.nullAsNil(paramString1));
    this.ehH.vEi = new bts().alV(bo.nullAsNil(paramString2));
    this.oqT = this.ehH;
    AppMethodBeat.o(103959);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.e.c
 * JD-Core Version:    0.6.2
 */