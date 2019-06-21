package com.tencent.mm.plugin.game.commlib;

import android.os.Build.VERSION;
import com.facebook.device.yearclass.YearClass;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.game.d.ax;
import com.tencent.mm.plugin.game.d.ay;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;

public final class c extends m
  implements k
{
  private f ehi;
  private final b lty;

  public c()
  {
    AppMethodBeat.i(59403);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ax();
    ((b.a)localObject).fsK = new ay();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecenterglobalsetting";
    ((b.a)localObject).fsI = 1311;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    ax localax = (ax)this.lty.fsG.fsP;
    localax.nbs = aa.dor();
    String str = a.a.bDb().bCT();
    localObject = str;
    if (bo.isNullOrNil(str))
      localObject = bo.gQ(ah.getContext());
    localax.guW = ((String)localObject);
    localax.nbt = g.cdf;
    localax.nbu = new d();
    localax.nbu.mZp = Build.VERSION.SDK_INT;
    localax.nbu.mZq = YearClass.get(ah.getContext());
    ab.i("MicroMsg.NetSceneGetGameGlobalConfig", "lang=%s, country=%s, releaseChannel=%s, osVersion = %d, deviceLevel = %d", new Object[] { localax.nbs, localax.guW, Integer.valueOf(localax.nbt), Integer.valueOf(localax.nbu.mZp), Integer.valueOf(localax.nbu.mZq) });
    AppMethodBeat.o(59403);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(59405);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(59405);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59404);
    ab.i("MicroMsg.NetSceneGetGameGlobalConfig", "errType = " + paramInt2 + ", errCode = " + paramInt3 + ", errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(59404);
    }
    while (true)
    {
      return;
      paramq = (ay)((b)paramq).fsH.fsP;
      if (paramq == null)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(59404);
      }
      else
      {
        a.a(paramq);
        com.tencent.mm.plugin.game.commlib.c.a.bny();
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(59404);
      }
    }
  }

  public final int getType()
  {
    return 1311;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.c
 * JD-Core Version:    0.6.2
 */