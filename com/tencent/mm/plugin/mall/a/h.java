package com.tencent.mm.plugin.mall.a;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.d.i;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.bjf;
import com.tencent.mm.protocal.protobuf.bjg;
import com.tencent.mm.protocal.protobuf.csg;
import com.tencent.mm.protocal.protobuf.csi;
import com.tencent.mm.protocal.protobuf.csl;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class h extends m
  implements k
{
  private b ehh;
  private f ehi;
  public csi okW;

  public h()
  {
    AppMethodBeat.i(43105);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new bjf();
    ((b.a)localObject1).fsK = new bjg();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/payibggetoverseawallet";
    ((b.a)localObject1).fsI = 1577;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (bjf)this.ehh.fsG.fsP;
    com.tencent.mm.kernel.g.RQ();
    Object localObject2 = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xML, Boolean.FALSE);
    if (localObject2 != null);
    for (boolean bool = ((Boolean)localObject2).booleanValue(); ; bool = false)
    {
      if (bool);
      for (int i = 1; ; i = 0)
      {
        ((bjf)localObject1).wMs = i;
        ((bjf)localObject1).aOt = aa.dor();
        ((bjf)localObject1).wMv = Build.VERSION.RELEASE;
        ((bjf)localObject1).wMu = com.tencent.mm.sdk.platformtools.g.ar(null, d.vxo);
        ((bjf)localObject1).wMw = Build.MANUFACTURER;
        ab.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", new Object[] { Integer.valueOf(((bjf)localObject1).wMs), ((bjf)localObject1).aOt, ((bjf)localObject1).wMv, ((bjf)localObject1).wMu, ((bjf)localObject1).wMw });
        AppMethodBeat.o(43105);
        return;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(43107);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43107);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43106);
    ab.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + paramInt3 + ", errMsg " + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bjg)((b)paramq).fsH.fsP;
      if ((paramq.wMz == null) || (paramq.wMA == null))
        break label242;
      ab.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd wallet_region : %s wallet_gray_area: %s wallet_threepoint_area size: %s", new Object[] { Integer.valueOf(paramq.okT), Integer.valueOf(paramq.wMz.wmz.size()), Integer.valueOf(paramq.wMA.wmz.size()) });
      if (paramq.wMD != null)
      {
        this.okW = paramq.wMD;
        ab.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "wallet_key_info flag %s wallet_key_info.url %s", new Object[] { Integer.valueOf(paramq.wMD.xpH), paramq.wMD.url });
      }
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xNQ, Integer.valueOf(paramq.okT));
      r.cPO().a(paramq.okT, paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(43106);
      return;
      label242: ab.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + paramq.okT);
    }
  }

  public final String bMU()
  {
    if (this.okW == null);
    for (String str = ""; ; str = this.okW.url)
      return str;
  }

  public final int getType()
  {
    return 1577;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.h
 * JD-Core Version:    0.6.2
 */