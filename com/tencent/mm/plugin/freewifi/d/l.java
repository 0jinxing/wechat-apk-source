package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.byb;
import com.tencent.mm.protocal.protobuf.byc;

public final class l extends c
{
  public l(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(20799);
    bzd();
    byb localbyb = (byb)this.ehh.fsG.fsP;
    localbyb.appId = paramString1;
    localbyb.mzT = paramInt;
    localbyb.cxb = paramString2;
    AppMethodBeat.o(20799);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20798);
    b.a locala = new b.a();
    locala.fsJ = new byb();
    locala.fsK = new byc();
    locala.uri = "/cgi-bin/mmo2o-bin/setpcloginuserInfo";
    locala.fsI = 1761;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20798);
  }

  public final int getType()
  {
    return 1761;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.l
 * JD-Core Version:    0.6.2
 */