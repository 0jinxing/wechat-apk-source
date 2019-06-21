package com.tencent.mm.plugin.websearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.plugin.websearch.a.a;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.axb;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.bq;
import com.tencent.mm.protocal.protobuf.br;
import com.tencent.mm.sdk.platformtools.aa;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class c
  implements n
{
  private int tZq;
  private Map<String, String> tZr;

  public c()
  {
    AppMethodBeat.i(91352);
    this.tZr = new HashMap();
    AppMethodBeat.o(91352);
  }

  public final void HM(int paramInt)
  {
    this.tZq = paramInt;
  }

  public final String adC(String paramString)
  {
    AppMethodBeat.i(91356);
    paramString = (String)this.tZr.get(paramString);
    AppMethodBeat.o(91356);
    return paramString;
  }

  public final void bw(int paramInt, String paramString)
  {
    AppMethodBeat.i(91353);
    axc localaxc = new axc();
    localaxc.wBd = paramInt;
    localaxc.wBl = ((int)(System.currentTimeMillis() / 1000L));
    localaxc.jBv = 1;
    localaxc.wBe = new com.tencent.mm.bt.b(paramString.getBytes());
    paramString = new b.a();
    paramString.fsJ = new bq();
    paramString.fsK = new br();
    paramString.uri = "/cgi-bin/mmux-bin/adlog";
    paramString.fsI = 1802;
    paramString = paramString.acD();
    bq localbq = (bq)paramString.fsG.fsP;
    axb localaxb = new axb();
    localaxb.vOz = d.vxj;
    localaxb.vOA = d.vxi;
    localaxb.vOB = d.vxl;
    localaxb.vOC = d.vxm;
    localaxb.vOD = aa.dor();
    localaxb.wBk = ((int)(System.currentTimeMillis() / 1000L));
    localbq.vDV = localaxb;
    localbq.vDW.add(localaxc);
    w.a(paramString, new c.1(this));
    AppMethodBeat.o(91353);
  }

  public final int cUM()
  {
    return this.tZq;
  }

  public final String cUN()
  {
    AppMethodBeat.i(91354);
    String str = a.aLD();
    AppMethodBeat.o(91354);
    return str;
  }

  public final void gQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(91355);
    this.tZr.put(paramString1, paramString2);
    AppMethodBeat.o(91355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c
 * JD-Core Version:    0.6.2
 */