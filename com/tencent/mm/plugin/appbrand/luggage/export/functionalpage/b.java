package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cjx;
import com.tencent.mm.protocal.protobuf.cjy;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/CgiUpdateRuntimeQrcode;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/UpdateRuntimeQrcodeResponse;", "uuid", "", "status", "", "respData", "(Ljava/lang/String;ILjava/lang/String;)V", "onCgiBack", "", "errType", "errCode", "errMsg", "resp", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Companion", "plugin-appbrand-integration_release"})
public final class b extends com.tencent.mm.ai.a<cjy>
{
  public static final b.a ikn;

  static
  {
    AppMethodBeat.i(134728);
    ikn = new b.a((byte)0);
    AppMethodBeat.o(134728);
  }

  private b(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(134727);
    com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
    cjx localcjx = new cjx();
    localcjx.eCq = paramString1;
    localcjx.status = paramInt;
    localcjx.xik = paramString2;
    locala.a((com.tencent.mm.bt.a)localcjx);
    locala.b((com.tencent.mm.bt.a)new cjy());
    locala.kU(2578);
    locala.qq("/cgi-bin/mmbiz-bin/wxabusiness/updateruntimeqrcode");
    a(locala.acD());
    AppMethodBeat.o(134727);
  }

  public static final b Cp(String paramString)
  {
    AppMethodBeat.i(134729);
    j.p(paramString, "uuid");
    paramString = new b(paramString, 4);
    AppMethodBeat.o(134729);
    return paramString;
  }

  public static final b Cq(String paramString)
  {
    AppMethodBeat.i(134730);
    j.p(paramString, "uuid");
    paramString = new b(paramString, 1);
    AppMethodBeat.o(134730);
    return paramString;
  }

  public static final b cx(String paramString1, String paramString2)
  {
    AppMethodBeat.i(134731);
    j.p(paramString1, "uuid");
    j.p(paramString2, "respData");
    paramString1 = new b(paramString1, paramString2);
    AppMethodBeat.o(134731);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b
 * JD-Core Version:    0.6.2
 */