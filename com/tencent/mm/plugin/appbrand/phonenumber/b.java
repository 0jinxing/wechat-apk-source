package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.sd;
import com.tencent.mm.protocal.protobuf.se;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/CgiCheckVerifyCodeWxaPhone;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/CheckVerifyCodeResp;", "appId", "", "mobile", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "plugin-appbrand-integration_release"})
public final class b extends com.tencent.mm.ai.a<se>
{
  public b(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(134778);
    sd localsd = new sd();
    localsd.csB = paramString1;
    localsd.cFl = paramString2;
    localsd.tCi = paramString3;
    paramString1 = new b.a();
    paramString1.a((com.tencent.mm.bt.a)localsd);
    paramString1.b((com.tencent.mm.bt.a)new se());
    paramString1.qq("/cgi-bin/mmbiz-bin/wxaapp/checkverifycode");
    paramString1.kU(1010);
    paramString1.kV(0);
    paramString1.kW(0);
    a(paramString1.acD());
    AppMethodBeat.o(134778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.b
 * JD-Core Version:    0.6.2
 */