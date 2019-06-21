package com.tencent.mm.plugin.freewifi.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.protocal.protobuf.amm;
import com.tencent.mm.protocal.protobuf.amn;

public final class i extends c
{
  public i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(20792);
    bzd();
    amm localamm = (amm)this.ehh.fsG.fsP;
    localamm.cuH = paramString1;
    localamm.mvO = paramString2;
    localamm.mvP = paramString3;
    localamm.mvQ = paramString4;
    localamm.cxb = paramString5;
    localamm.vAN = paramString6;
    AppMethodBeat.o(20792);
  }

  protected final void bzd()
  {
    AppMethodBeat.i(20791);
    b.a locala = new b.a();
    locala.fsJ = new amm();
    locala.fsK = new amn();
    locala.uri = "/cgi-bin/mmo2o-bin/getportalapinfo";
    locala.fsI = 1709;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20791);
  }

  public final String bzn()
  {
    return ((amn)this.ehh.fsH.fsP).mwV;
  }

  public final String bzo()
  {
    return ((amn)this.ehh.fsH.fsP).mwW;
  }

  public final int getType()
  {
    return 1709;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.d.i
 * JD-Core Version:    0.6.2
 */