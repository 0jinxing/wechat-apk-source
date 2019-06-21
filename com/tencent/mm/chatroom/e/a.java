package com.tencent.mm.chatroom.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.vg;
import com.tencent.mm.sdk.platformtools.bo;

@Deprecated
public final class a extends j.b
{
  private vg ehF;

  public a(String paramString)
  {
    super(7);
    AppMethodBeat.i(103957);
    this.ehF = new vg();
    this.ehF.wcB = new bts().alV(bo.nullAsNil(paramString));
    this.oqT = this.ehF;
    AppMethodBeat.o(103957);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.e.a
 * JD-Core Version:    0.6.2
 */