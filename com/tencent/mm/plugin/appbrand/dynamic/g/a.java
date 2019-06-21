package com.tencent.mm.plugin.appbrand.dynamic.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.widget.i;
import com.tencent.mm.protocal.protobuf.axs;
import com.tencent.mm.protocal.protobuf.axt;
import com.tencent.mm.protocal.protobuf.cvy;
import com.tencent.mm.protocal.protobuf.cwv;
import com.tencent.mm.protocal.protobuf.cyc;

public final class a extends com.tencent.mm.ai.a<axt>
{
  private int cBc;
  public final com.tencent.mm.ai.b ehh;
  public com.tencent.mm.plugin.appbrand.widget.j hoA;
  private int hog;

  public a(String paramString, boolean paramBoolean, cyc paramcyc)
  {
    AppMethodBeat.i(10936);
    axs localaxs = new axs();
    localaxs.fKh = paramString;
    localaxs.wBO = paramcyc;
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      localaxs.wsv = i;
      paramString = new b.a();
      paramString.fsI = 1181;
      paramString.uri = "/cgi-bin/mmbiz-bin/wxaattr/launchwxawidget";
      paramString.fsJ = localaxs;
      paramString.fsK = new axt();
      paramString = paramString.acD();
      this.ehh = paramString;
      this.ehh = paramString;
      this.hog = paramcyc.xtw;
      this.cBc = com.tencent.mm.plugin.appbrand.dynamic.k.b.cX(this.hog, paramcyc.wzF);
      AppMethodBeat.o(10936);
      return;
    }
  }

  private String getAppId()
  {
    return ((axs)this.ehh.fsG.fsP).fKh;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, axt paramaxt)
  {
    AppMethodBeat.i(10937);
    u.i("MicroMsg.CgiLaunchWxaWidget", "onCgiBack, errType %d, errCode %d, errMsg %s, req appId %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, getAppId() });
    String str1;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramaxt != null))
    {
      str1 = getAppId();
      this.hoA = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.K(com.tencent.mm.plugin.appbrand.widget.a.a.class)).auQ().a(str1, this.cBc, this.hog, paramaxt);
      if (paramaxt.wBQ != null)
      {
        String str2 = ((d)g.K(d.class)).xF().at(str1, this.cBc);
        paramString = new cwv();
        paramString.xsy = str2;
        paramString.vMG = paramaxt.wBQ.vMG;
        if (this.cBc == 10102)
        {
          paramString.xsx = paramaxt.wBQ.xrR;
          ((d)g.K(d.class)).xF().a(str1, paramString, this.cBc);
          AppMethodBeat.o(10937);
        }
      }
    }
    while (true)
    {
      return;
      if (this.cBc == 10002)
      {
        paramString.xsx = paramaxt.wBQ.xrQ;
        ((d)g.K(d.class)).xF().a(str1, paramString, this.cBc);
      }
      AppMethodBeat.o(10937);
      continue;
      com.tencent.mm.plugin.appbrand.dynamic.j.azE().zX(getAppId());
      this.hoA = ((com.tencent.mm.plugin.appbrand.widget.a.a)g.K(com.tencent.mm.plugin.appbrand.widget.a.a.class)).auQ().L(getAppId(), this.cBc, this.hog);
      AppMethodBeat.o(10937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.g.a
 * JD-Core Version:    0.6.2
 */