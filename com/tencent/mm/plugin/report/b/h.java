package com.tencent.mm.plugin.report.b;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.c;
import com.tencent.mm.protocal.protobuf.ahi;
import com.tencent.mm.protocal.protobuf.ahj;
import com.tencent.mm.protocal.protobuf.atd;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends m
  implements k
{
  private static boolean isRunning;
  private static Object lock;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private a pXr;
  private ahi pXv;

  static
  {
    AppMethodBeat.i(72688);
    isRunning = false;
    lock = new Object();
    AppMethodBeat.o(72688);
  }

  public h()
  {
    AppMethodBeat.i(72684);
    this.pXv = null;
    this.pXr = new a();
    setIsRunning(true);
    this.pXv = SmcProtoBufUtil.toMMGetStrategyReq();
    if (this.pXv != null)
    {
      this.pXv.vZL = new atd();
      this.pXv.vZL.wxc = a.BM(0);
    }
    AppMethodBeat.o(72684);
  }

  public static boolean isRunning()
  {
    synchronized (lock)
    {
      boolean bool = isRunning;
      return bool;
    }
  }

  private static void setIsRunning(boolean paramBoolean)
  {
    synchronized (lock)
    {
      isRunning = paramBoolean;
      return;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(72687);
    this.ehi = paramf;
    g.RN();
    boolean bool = com.tencent.mm.kernel.a.QX();
    if (!bool)
      this.pXv.vZK = com.tencent.mm.bt.b.bI(bo.dpz());
    b.a locala = new b.a();
    locala.fsN = false;
    locala.fsJ = this.pXv;
    locala.fsK = new ahj();
    if (bool)
      paramf = "/cgi-bin/micromsg-bin/getkvidkeystrategy";
    while (true)
    {
      locala.uri = paramf;
      locala.fsI = getType();
      this.ehh = locala.acD();
      if (!bool)
      {
        this.ehh.a(z.dmw());
        this.ehh.cQh = 1;
      }
      int i = a(parame, this.ehh, this);
      if (i < 0)
        ab.i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      try
      {
        SmcLogic.OnStrategyResp(3, -1, null, 1);
        SmcLogic.OnStrategyResp(3, -1, null, 2);
        setIsRunning(false);
        AppMethodBeat.o(72687);
        return i;
        paramf = "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa";
      }
      catch (Exception parame)
      {
        while (true)
          ab.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(parame) });
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(72685);
    if ((g.RO().eJo == null) || (g.RO().eJo.ftA == null))
    {
      ab.f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(72685);
    }
    while (true)
    {
      return;
      if (paramInt2 != 0)
      {
        ab.e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
        SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 1);
        SmcLogic.OnStrategyResp(paramInt2, paramInt3, null, 2);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        setIsRunning(false);
        AppMethodBeat.o(72685);
        continue;
      }
      ab.d("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy ok");
      paramArrayOfByte = (ahj)this.ehh.fsH.fsP;
      this.pXr.a(paramArrayOfByte.vZV, 0);
      try
      {
        paramq = SmcProtoBufUtil.toSmcKVStrategyResp(paramArrayOfByte);
        paramArrayOfByte = SmcProtoBufUtil.toSmcIdkeyStrategyResp(paramArrayOfByte);
        SmcLogic.OnStrategyResp(0, 0, paramq.toByteArray(), 1);
        SmcLogic.OnStrategyResp(0, 0, paramArrayOfByte.toByteArray(), 2);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        setIsRunning(false);
        AppMethodBeat.o(72685);
      }
      catch (Exception paramq)
      {
        while (true)
          ab.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(paramq) });
      }
    }
  }

  public final int getType()
  {
    AppMethodBeat.i(72686);
    g.RN();
    int i;
    if (com.tencent.mm.kernel.a.QX())
    {
      i = 988;
      AppMethodBeat.o(72686);
    }
    while (true)
    {
      return i;
      i = 989;
      AppMethodBeat.o(72686);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.h
 * JD-Core Version:    0.6.2
 */