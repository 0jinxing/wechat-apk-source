package com.tencent.mm.plugin.wallet_core.c;

import android.content.SharedPreferences;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.protobuf.sb;
import com.tencent.mm.protocal.protobuf.sc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.wallet_core.c.u;

public final class b extends u
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public int ttL;
  public sc ttM;

  public b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    this(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramInt, (byte)0);
  }

  private b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, byte paramByte)
  {
    AppMethodBeat.i(46492);
    this.ttL = 0;
    this.ttL = 5;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new sb();
    ((b.a)localObject).fsK = new sc();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkuserauthjsapi";
    ((b.a)localObject).fsI = 2728;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (sb)this.ehh.fsG.fsP;
    ((sb)localObject).fKh = paramString1;
    ((sb)localObject).vLo = paramString2;
    ((sb)localObject).vYO = paramString3;
    ((sb)localObject).vYP = paramString4;
    ((sb)localObject).vYR = paramString5;
    ((sb)localObject).vYQ = paramString6;
    ((sb)localObject).vXP = paramString7;
    ((sb)localObject).vYS = 5;
    ((sb)localObject).vRP = k.cPy();
    ((sb)localObject).vEt = 1;
    ((sb)localObject).jBB = null;
    ((sb)localObject).ndP = null;
    ((sb)localObject).vYV = paramString8;
    ((sb)localObject).vYU = paramInt;
    boolean bool = ((l)g.K(l.class)).bxe();
    paramString4 = ah.doB();
    paramString3 = null;
    paramString2 = null;
    if (paramString4 != null)
    {
      paramString3 = paramString4.getString("cpu_id", null);
      paramString2 = paramString4.getString("uid", null);
    }
    ((sb)localObject).vZt = 0;
    ((sb)localObject).rOh = paramString3;
    ((sb)localObject).jSY = paramString2;
    if (bool);
    for (paramInt = 1; ; paramInt = 0)
    {
      ((sb)localObject).vZu = paramInt;
      ab.d("MicroMsg.NetSceneCheckUserAuthJsapi", "cpu_id: %s, uid: %s", new Object[] { paramString3, paramString2 });
      ab.i("MicroMsg.NetSceneCheckUserAuthJsapi", "appId: %s, url: %s, jsapiScene: %s, isOpenTouchPay: %b", new Object[] { paramString1, paramString7, Integer.valueOf(5), Boolean.valueOf(bool) });
      AppMethodBeat.o(46492);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46493);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46493);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(46494);
    ab.d("MicroMsg.NetSceneCheckUserAuthJsapi", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    String str = paramString;
    if (paramInt1 == 0)
    {
      str = paramString;
      if (paramInt2 == 0)
      {
        this.ttM = ((sc)((com.tencent.mm.ai.b)paramq).fsH.fsP);
        paramString = (sb)((com.tencent.mm.ai.b)paramq).fsG.fsP;
        if (paramString.vXP == null)
          break label369;
        paramq = Uri.parse(paramString.vXP).getQueryParameter("appid");
        if (paramq == paramString.fKh)
          break label283;
        h.pYm.e(14954, new Object[] { this.ttM.vwr, "", Integer.valueOf(paramString.vYS), paramString.vYV, paramString.fKh, Integer.valueOf(paramString.vEt), Integer.valueOf(paramString.vYU), paramString.vXP, paramq });
      }
    }
    while (true)
    {
      ab.i("MicroMsg.NetSceneCheckUserAuthJsapi", "CheckUserAuthJsapiResponse resp.ErrCode is " + this.ttM.luT + " resp.ErrMsg is " + this.ttM.luU);
      str = this.ttM.luU;
      this.ehi.onSceneEnd(paramInt1, paramInt2, str, this);
      AppMethodBeat.o(46494);
      return;
      label283: h.pYm.e(14954, new Object[] { this.ttM.vwr, "", Integer.valueOf(paramString.vYS), paramString.vYV, paramString.fKh, Integer.valueOf(paramString.vEt), Integer.valueOf(paramString.vYU), paramString.vXP });
      continue;
      label369: if ((paramString.jBB != null) && (paramString.ndP != null))
        h.pYm.e(14954, new Object[] { this.ttM.vwr, "", Integer.valueOf(paramString.vYS), paramString.vYV, paramString.fKh, Integer.valueOf(paramString.vEt), Integer.valueOf(paramString.vYU), paramString.ndP, paramString.jBB });
    }
  }

  public final int getType()
  {
    return 580;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.b
 * JD-Core Version:    0.6.2
 */