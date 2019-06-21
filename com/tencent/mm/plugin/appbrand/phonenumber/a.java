package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.sd;
import com.tencent.mm.protocal.protobuf.se;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/CgiCheckVerifyCode;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/CheckVerifyCodeResp;", "appId", "", "mobile", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "plugin-appbrand-integration_release"})
public final class a extends com.tencent.mm.ai.a<se>
{
  public a(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(134777);
    sd localsd = new sd();
    localsd.csB = paramString1;
    localsd.cFl = paramString2;
    localsd.tCi = paramString3;
    paramString1 = new b.a();
    paramString1.a((com.tencent.mm.bt.a)localsd);
    paramString1.b((com.tencent.mm.bt.a)new se());
    paramString1.qq("/cgi-bin/mmbiz-bin/wxaapp/customphone/checkverifycode");
    paramString1.kU(2775);
    paramString1.kV(0);
    paramString1.kW(0);
    a(paramString1.acD());
    AppMethodBeat.o(134777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.a
 * JD-Core Version:    0.6.2
 */