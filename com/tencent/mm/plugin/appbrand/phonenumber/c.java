package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.awc;
import com.tencent.mm.protocal.protobuf.awd;
import org.json.JSONException;
import org.json.JSONStringer;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/phonenumber/CgiGetAllPhone;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/JSOperateWxDataResponse;", "appId", "", "apiName", "withCredentials", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "jsonStringer", "plugin-appbrand-integration_release"})
public final class c extends com.tencent.mm.ai.a<awd>
{
  public c(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(134780);
    String str = ap(paramString2, paramBoolean);
    paramString2 = new awc();
    paramString2.fKh = paramString1;
    paramString1 = a.k.d.UTF_8;
    if (str == null)
    {
      paramString1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(134780);
      throw paramString1;
    }
    paramString1 = str.getBytes(paramString1);
    j.o(paramString1, "(this as java.lang.String).getBytes(charset)");
    paramString2.jBi = new b(paramString1);
    paramString1 = new b.a();
    paramString1.a((com.tencent.mm.bt.a)paramString2);
    paramString1.b((com.tencent.mm.bt.a)new awd());
    paramString1.qq("/cgi-bin/mmbiz-bin/wxaapp/customphone/getallphone");
    paramString1.kU(2536);
    paramString1.kV(0);
    paramString1.kW(0);
    a(paramString1.acD());
    AppMethodBeat.o(134780);
  }

  private static String ap(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(134779);
    JSONStringer localJSONStringer = new JSONStringer();
    try
    {
      localJSONStringer.object();
      localJSONStringer.key("api_name");
      localJSONStringer.value(paramString);
      localJSONStringer.key("with_credentials");
      localJSONStringer.value(paramBoolean);
      localJSONStringer.endObject();
      paramString = localJSONStringer.toString();
      j.o(paramString, "jsonStringer.toString()");
      AppMethodBeat.o(134779);
      return paramString;
    }
    catch (JSONException paramString)
    {
      while (true)
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.JsApiGetPhoneNumberNew", (Throwable)paramString, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.c
 * JD-Core Version:    0.6.2
 */