package com.tencent.mm.chatroom.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.protocal.protobuf.bbt;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.bo;

@Deprecated
public final class b extends j.b
{
  private bbt ehG;

  public b(String paramString, int paramInt)
  {
    super(20);
    AppMethodBeat.i(103958);
    this.ehG = new bbt();
    this.ehG.vEi = new bts().alV(bo.nullAsNil(paramString));
    this.ehG.jBT = paramInt;
    this.oqT = this.ehG;
    AppMethodBeat.o(103958);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.e.b
 * JD-Core Version:    0.6.2
 */