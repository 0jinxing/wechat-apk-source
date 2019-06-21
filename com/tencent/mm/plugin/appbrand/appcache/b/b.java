package com.tencent.mm.plugin.appbrand.appcache.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.ci.g;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.launching.h;
import com.tencent.mm.protocal.protobuf.blb;
import com.tencent.mm.protocal.protobuf.blc;
import com.tencent.mm.protocal.protobuf.cga;
import com.tencent.mm.vending.g.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/CgiPreDownloadCode;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/PreDownloadCodeResp;", "username", "", "(Ljava/lang/String;)V", "TAG", "getUsername", "()Ljava/lang/String;", "createSingleReqInfo", "Lcom/tencent/mm/protocal/protobuf/SyncVersionSingleReqInfo;", "run", "Lcom/tencent/mm/wx/WxPipeline;", "Lcom/tencent/mm/modelbase/Cgi$CgiBack;", "plugin-appbrand-integration_release"})
public final class b extends com.tencent.mm.ai.a<blc>
{
  private final String TAG;
  private final String username;

  public b(String paramString)
  {
    AppMethodBeat.i(134471);
    this.username = paramString;
    this.TAG = "MicroMsg.AppBrand.CgiPreDownloadCode";
    com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
    blb localblb = new blb();
    Object localObject = this.username;
    cga localcga = new cga();
    localcga.xfb = ((String)localObject);
    paramString = (CharSequence)localObject;
    if ((paramString == null) || (paramString.length() == 0))
    {
      k = 1;
      if (k == 0)
        break label229;
      paramString = null;
      label93: if (paramString == null)
        break label245;
      localObject = paramString.ayL();
      if (localObject == null)
        break label245;
      k = ((WxaAttributes.e)localObject).axy;
      label115: localcga.xfc = k;
      if (paramString == null)
        break label251;
      paramString = paramString.field_appId;
      if (paramString == null)
        break label251;
      paramString = h.bm(paramString, 0);
      k = j;
      if (paramString == null);
    }
    label229: label245: label251: for (int k = paramString.gVu; ; k = i)
    {
      localcga.xfd = k;
      localblb.wOb = localcga;
      locala.a((com.tencent.mm.bt.a)localblb);
      locala.b((com.tencent.mm.bt.a)new blc());
      locala.qq("/cgi-bin/mmbiz-bin/wxasync/wxaapp_predownloadcode");
      locala.kU(1479);
      a(locala.acD());
      AppMethodBeat.o(134471);
      return;
      k = 0;
      break;
      paramString = com.tencent.mm.plugin.appbrand.app.f.auO().d((String)localObject, new String[0]);
      break label93;
      k = 0;
      break label115;
    }
  }

  public final com.tencent.mm.ci.f<a.a<blc>> acy()
  {
    AppMethodBeat.i(134470);
    Object localObject = (CharSequence)this.username;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label65;
      localObject = g.c((c.a)new b.a(this));
      j.o(localObject, "pipelineExt {\n          …          )\n            }");
      AppMethodBeat.o(134470);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label65: localObject = super.acy();
      j.o(localObject, "super.run()");
      AppMethodBeat.o(134470);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b
 * JD-Core Version:    0.6.2
 */