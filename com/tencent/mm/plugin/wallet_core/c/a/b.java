package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjd;
import com.tencent.mm.protocal.protobuf.bje;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.u;

public final class b extends u
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public String jumpUrl;
  public int tuH;

  public b()
  {
    AppMethodBeat.i(46563);
    this.tuH = 0;
    b.a locala = new b.a();
    bjd localbjd = new bjd();
    g.RQ();
    Object localObject = g.RP().Ry().get(ac.a.xML, Boolean.FALSE);
    if (localObject != null);
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      if (bool);
      for (int i = 1; ; i = 0)
      {
        localbjd.wMs = i;
        locala.fsJ = localbjd;
        locala.fsK = new bje();
        locala.uri = "/cgi-bin/mmpay-bin/payibggetjumpurl";
        locala.fsI = 1564;
        locala.fsL = 0;
        locala.fsM = 0;
        this.ehh = locala.acD();
        AppMethodBeat.o(46563);
        return;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(46565);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46565);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(46564);
    ab.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg jump url raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (bje)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.luT), paramq.luU });
      paramString = paramq.luU;
      paramInt2 = paramq.luT;
      this.jumpUrl = paramq.mZj;
      this.tuH = paramq.wMt;
    }
    while (true)
    {
      paramq = paramString;
      if (bo.isNullOrNil(paramString))
        paramq = ah.getContext().getString(2131304763);
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramq, this);
      AppMethodBeat.o(46564);
      return;
      ab.e("MicroMsg.NetSceneIbgPayGetJumpUrl", "hy: get ibg pay jump url failed");
      this.jumpUrl = null;
    }
  }

  public final int getType()
  {
    return 1564;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.a.b
 * JD-Core Version:    0.6.2
 */