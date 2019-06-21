package com.tencent.mm.modelsimple;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.tr;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.amu;
import com.tencent.mm.protocal.protobuf.amv;
import com.tencent.mm.protocal.protobuf.bcr;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cme;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private String account;
  private b ehh;
  private f ehi;

  public m(String paramString)
  {
    AppMethodBeat.i(123433);
    this.account = paramString;
    b.a locala = new b.a();
    locala.fsJ = new amu();
    locala.fsK = new amv();
    locala.uri = "/cgi-bin/micromsg-bin/getprofile";
    locala.fsI = 302;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((amu)this.ehh.fsG.fsP).jBB = paramString;
    AppMethodBeat.o(123433);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(123434);
    int i;
    if (bo.isNullOrNil(this.account))
    {
      ab.e("MicroMsg.NetSceneGetProfile", "null or empty username");
      i = -1;
      AppMethodBeat.o(123434);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(123434);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123435);
    ab.d("MicroMsg.NetSceneGetProfile", "get profile ret: errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (amv)this.ehh.fsH.fsP;
      paramq = new tr();
      paramq.cPQ.cPR = paramArrayOfByte.wrv.xke;
      a.xxA.m(paramq);
      if ((r.Yz().equals(paramArrayOfByte.wru.wcB.toString())) && (!bo.isNullOrNil(paramArrayOfByte.wrv.vXn)))
        g.RP().Ry().set(ac.a.xJM, paramArrayOfByte.wrv.vXn);
      ab.d("MicroMsg.NetSceneGetProfile", "summersafecdn resp.UserInfo.PluginSwitch[%d], GrayscaleFlag[%d]", new Object[] { Integer.valueOf(paramArrayOfByte.wru.wHd), Integer.valueOf(paramArrayOfByte.wrv.xjY) });
      g.RP().Ry().set(64, Integer.valueOf(paramArrayOfByte.wrv.vCl));
      g.RP().Ry().set(144385, Integer.valueOf(paramArrayOfByte.wrv.xjY));
      g.RP().Ry().set(40, Integer.valueOf(paramArrayOfByte.wru.wHd));
      g.RP().Ry().set(339975, Integer.valueOf(paramArrayOfByte.wrv.xkg));
      ab.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d", new Object[] { Integer.valueOf(paramArrayOfByte.wrv.xkg) });
      g.RP().Ry().set(ac.a.xNQ, Integer.valueOf(paramArrayOfByte.wrv.wlv));
      ab.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d %d", new Object[] { Integer.valueOf(paramArrayOfByte.wrv.xkg), Integer.valueOf(paramArrayOfByte.wrv.wlv) });
      g.RP().Ry().set(208903, paramArrayOfByte.wrv.vLf);
      g.RP().Ry().set(274433, paramArrayOfByte.wrv.wGn);
      g.RP().Ry().set(274434, paramArrayOfByte.wrv.wGm);
      g.RP().Ry().set(274436, paramArrayOfByte.wrv.xjZ);
      g.RP().Ry().set(ac.a.xLU, bo.bc(paramArrayOfByte.wrv.duq, ""));
      g.RP().Ry().set(ac.a.xQe, paramArrayOfByte.wrv.xki);
      ab.d("MicroMsg.NetSceneGetProfile", "weidianInfo:%s", new Object[] { paramArrayOfByte.wrv.duq });
      av.fly.ak("last_login_use_voice", paramArrayOfByte.wru.wHd);
      if (Build.VERSION.SDK_INT < 23)
        Settings.System.putString(ah.getContext().getContentResolver(), "89884a87498ef44f", paramArrayOfByte.wrv.xkf);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(123435);
  }

  public final int getType()
  {
    return 302;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.m
 * JD-Core Version:    0.6.2
 */