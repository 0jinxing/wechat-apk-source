package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.ckg;
import com.tencent.mm.protocal.protobuf.ckh;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/CgiUpdateUserPhone;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/UpdateUserPhoneResp;", "appId", "", "mobile", "type", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "plugin-appbrand-integration_release"})
public final class f extends com.tencent.mm.ai.a<ckh>
{
  public static final f.a ixf;

  static
  {
    AppMethodBeat.i(134784);
    ixf = new f.a((byte)0);
    AppMethodBeat.o(134784);
  }

  public f(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(134783);
    ckg localckg = new ckg();
    localckg.csB = paramString1;
    localckg.cFl = paramString2;
    localckg.type = paramInt;
    paramString1 = new b.a();
    paramString1.a((com.tencent.mm.bt.a)localckg);
    paramString1.b((com.tencent.mm.bt.a)new ckh());
    paramString1.qq("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone");
    paramString1.kU(2932);
    paramString1.kV(0);
    paramString1.kW(0);
    a(paramString1.acD());
    AppMethodBeat.o(134783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.f
 * JD-Core Version:    0.6.2
 */