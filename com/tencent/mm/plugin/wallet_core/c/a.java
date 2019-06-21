package com.tencent.mm.plugin.wallet_core.c;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.ro;
import com.tencent.mm.protocal.protobuf.rp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.c.x;

public final class a extends u
{
  public b ehh;
  private f ehi;
  public int ttL;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, String paramString8, String paramString9, int paramInt2)
  {
    AppMethodBeat.i(46489);
    this.ttL = 0;
    this.ttL = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ro();
    ((b.a)localObject).fsK = new rp();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).fsI = 580;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ro)this.ehh.fsG.fsP;
    ((ro)localObject).fKh = paramString1;
    ((ro)localObject).vLo = paramString2;
    ((ro)localObject).vYO = paramString3;
    ((ro)localObject).vYP = paramString4;
    ((ro)localObject).vYR = paramString5;
    ((ro)localObject).vYQ = paramString6;
    ((ro)localObject).vYS = paramInt1;
    ((ro)localObject).jBB = paramString7;
    ((ro)localObject).ndP = paramString8;
    ((ro)localObject).vEt = 2;
    ((ro)localObject).vYV = paramString9;
    ((ro)localObject).vYU = paramInt2;
    ((ro)localObject).vRP = k.cPy();
    if (x.dNS())
      ((ro)localObject).vYT = x.dNU();
    ab.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, UserName: %s, path: %s", new Object[] { paramString1, paramString7, paramString8 });
    AppMethodBeat.o(46489);
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt1, String paramString8, int paramInt2)
  {
    AppMethodBeat.i(46488);
    this.ttL = 0;
    this.ttL = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ro();
    ((b.a)localObject).fsK = new rp();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkpayjsapi";
    ((b.a)localObject).fsI = 580;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ro)this.ehh.fsG.fsP;
    ((ro)localObject).fKh = paramString1;
    ((ro)localObject).vLo = paramString2;
    ((ro)localObject).vYO = paramString3;
    ((ro)localObject).vYP = paramString4;
    ((ro)localObject).vYR = paramString5;
    ((ro)localObject).vYQ = paramString6;
    ((ro)localObject).vXP = paramString7;
    ((ro)localObject).vYS = paramInt1;
    ((ro)localObject).vRP = k.cPy();
    if (x.dNS())
      ((ro)localObject).vYT = x.dNU();
    ((ro)localObject).vEt = 1;
    ((ro)localObject).vYV = paramString8;
    ((ro)localObject).vYU = paramInt2;
    ab.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, url: %s, jsapiScene: %s", new Object[] { paramString1, paramString7, Integer.valueOf(paramInt1) });
    AppMethodBeat.o(46488);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46490);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46490);
    return i;
  }

  public final String cOS()
  {
    return ((rp)this.ehh.fsH.fsP).vwr;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(46491);
    ab.d("MicroMsg.NetSceneCheckPayJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    Object localObject = paramString;
    if (paramInt1 == 0)
    {
      localObject = paramString;
      if (paramInt2 == 0)
      {
        paramString = (rp)((b)paramq).fsH.fsP;
        ab.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.luT + " resp.ErrMsg is " + paramString.luU);
        localObject = (ro)((b)paramq).fsG.fsP;
        if (((ro)localObject).vXP == null)
          break label399;
        paramq = Uri.parse(((ro)localObject).vXP).getQueryParameter("appid");
        if (paramq == ((ro)localObject).fKh)
          break label311;
        h.pYm.e(14954, new Object[] { paramString.vwr, "", Integer.valueOf(((ro)localObject).vYS), ((ro)localObject).vYV, ((ro)localObject).fKh, Integer.valueOf(((ro)localObject).vEt), Integer.valueOf(((ro)localObject).vYU), ((ro)localObject).vXP, paramq });
      }
    }
    while (true)
    {
      ab.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + paramString.luT + " resp.ErrMsg is " + paramString.luU);
      localObject = paramString.luU;
      this.ehi.onSceneEnd(paramInt1, paramInt2, (String)localObject, this);
      AppMethodBeat.o(46491);
      return;
      label311: h.pYm.e(14954, new Object[] { paramString.vwr, "", Integer.valueOf(((ro)localObject).vYS), ((ro)localObject).vYV, ((ro)localObject).fKh, Integer.valueOf(((ro)localObject).vEt), Integer.valueOf(((ro)localObject).vYU), ((ro)localObject).vXP });
      continue;
      label399: if ((((ro)localObject).jBB != null) && (((ro)localObject).ndP != null))
        h.pYm.e(14954, new Object[] { paramString.vwr, "", Integer.valueOf(((ro)localObject).vYS), ((ro)localObject).vYV, ((ro)localObject).fKh, Integer.valueOf(((ro)localObject).vEt), Integer.valueOf(((ro)localObject).vYU), ((ro)localObject).ndP, ((ro)localObject).jBB });
    }
  }

  public final String getToken()
  {
    return ((rp)this.ehh.fsH.fsP).token;
  }

  public final int getType()
  {
    return 580;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.a
 * JD-Core Version:    0.6.2
 */