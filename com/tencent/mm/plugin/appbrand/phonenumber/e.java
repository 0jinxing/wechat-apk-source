package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.bwx;
import com.tencent.mm.protocal.protobuf.bwy;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/CgiSendVerifyCodeWxaPhone;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/SendVerifyCodeResp;", "appId", "", "mobile", "(Ljava/lang/String;Ljava/lang/String;)V", "plugin-appbrand-integration_release"})
public final class e extends com.tencent.mm.ai.a<bwy>
{
  public e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(134782);
    bwx localbwx = new bwx();
    localbwx.csB = paramString1;
    localbwx.cFl = paramString2;
    paramString1 = new b.a();
    paramString1.a((com.tencent.mm.bt.a)localbwx);
    paramString1.b((com.tencent.mm.bt.a)new bwy());
    paramString1.qq("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode");
    paramString1.kU(1024);
    paramString1.kV(0);
    paramString1.kW(0);
    a(paramString1.acD());
    AppMethodBeat.o(134782);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.e
 * JD-Core Version:    0.6.2
 */