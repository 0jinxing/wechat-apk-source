package com.tencent.mm.modelmulti;

import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.zero.b.b;
import com.tencent.mm.protocal.x.a;
import com.tencent.mm.protocal.x.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class i extends m
  implements k
{
  private WakerLock ebJ;
  private f ehi;
  private final q ftU;

  public i()
  {
    AppMethodBeat.i(58376);
    this.ebJ = new WakerLock(ah.getContext(), "MicroMsg.NetSceneSynCheck");
    this.ebJ.lock(3000L, "NetSceneSynCheck");
    this.ftU = new i.a();
    g.RQ();
    if (g.RP() != null)
    {
      g.RQ();
      if (g.RP().Ry() != null)
      {
        g.RQ();
        Object localObject = (String)g.RP().Ry().get(8195, null);
        ((x.a)this.ftU.acF()).fIi = bo.anf((String)localObject);
        localObject = (x.a)this.ftU.acF();
        g.RQ();
        g.RN();
        ((x.a)localObject).uin = com.tencent.mm.kernel.a.QF();
        ((x.a)this.ftU.acF()).netType = com.tencent.mm.protocal.a.getNetType(ah.getContext());
        ((x.a)this.ftU.acF()).vyo = com.tencent.mm.protocal.a.dlZ();
        ab.d("MicroMsg.MMSyncCheck", "NetSceneSynCheck");
        AppMethodBeat.o(58376);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
      AppMethodBeat.o(58376);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(58377);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    if ((i == -1) && (this.ebJ.isLocking()))
      this.ebJ.unLock();
    AppMethodBeat.o(58377);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58378);
    paramArrayOfByte = (x.b)paramq.ZS();
    ab.i("MicroMsg.NetSceneSynCheck", "new syncCheck complete, selector=" + paramArrayOfByte.vyM);
    if ((g.RK()) && (!com.tencent.mm.kernel.a.QT()))
    {
      paramq = ((x.a)paramq.acF()).eJt;
      if (bo.cb(paramq))
        ab.e("MicroMsg.NetSceneSynCheck", "onGYNetEnd md5 is null");
      paramArrayOfByte.eJt = paramq;
      ((b)g.K(b.class)).ahW().a(paramArrayOfByte.vyM, 2, paramArrayOfByte.dmu());
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    this.ebJ.unLock();
    AppMethodBeat.o(58378);
  }

  public final boolean acI()
  {
    return true;
  }

  public final int getType()
  {
    return 39;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.i
 * JD-Core Version:    0.6.2
 */