package com.tencent.mm.plugin.report.b;

import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.a.a.h;
import com.tencent.mm.protocal.a.a.i;
import com.tencent.mm.protocal.a.a.j;
import com.tencent.mm.protocal.protobuf.atd;
import com.tencent.mm.protocal.protobuf.sk;
import com.tencent.mm.protocal.protobuf.sl;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends m
  implements k
{
  int cIb;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private boolean lSi;
  private sk pXq;
  private a pXr;

  public e(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(72675);
    this.lSi = false;
    this.pXq = null;
    this.cIb = 0;
    this.pXr = new a();
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new NullPointerException("data must not be null");
      AppMethodBeat.o(72675);
      throw paramArrayOfByte;
    }
    this.cIb = paramInt;
    com.tencent.mm.kernel.g.RN();
    this.lSi = com.tencent.mm.kernel.a.QX();
    if (paramInt == 1);
    while (true)
    {
      Object localObject;
      try
      {
        localObject = new com/tencent/mm/protocal/a/a/i;
        ((i)localObject).<init>();
        ((i)localObject).parseFrom(paramArrayOfByte);
        this.pXq = SmcProtoBufUtil.toMMReportKvReq((i)localObject);
        if (this.pXq == null)
          break label233;
        this.pXq.vZL = new atd();
        this.pXq.vZL.wxc = a.BM(this.cIb);
        AppMethodBeat.o(72675);
        return;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.NetSceneCliReportKV", "parse data error");
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RS().aa(new e.1(this));
        continue;
      }
      if (paramInt == 2)
      {
        try
        {
          localObject = new com/tencent/mm/protocal/a/a/g;
          ((com.tencent.mm.protocal.a.a.g)localObject).<init>();
          ((com.tencent.mm.protocal.a.a.g)localObject).parseFrom(paramArrayOfByte);
          this.pXq = SmcProtoBufUtil.toMMReportIdkeyReq((com.tencent.mm.protocal.a.a.g)localObject);
        }
        catch (Exception paramArrayOfByte)
        {
          ab.e("MicroMsg.NetSceneCliReportKV", "parse data error");
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RS().aa(new e.2(this));
        }
        continue;
        label233: ab.i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", new Object[] { bo.dpG() });
        AppMethodBeat.o(72675);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(72677);
    this.ehi = paramf;
    int i;
    if (this.pXq == null)
    {
      ab.e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
      i = -2;
      AppMethodBeat.o(72677);
    }
    while (true)
    {
      return i;
      if (!this.lSi)
        this.pXq.vZK = com.tencent.mm.bt.b.bI(bo.dpz());
      b.a locala = new b.a();
      locala.fsN = false;
      locala.fsJ = this.pXq;
      locala.fsK = new sl();
      label101: String str;
      if (1 == this.cIb)
      {
        paramf = "/cgi-bin/micromsg-bin/newreportkvcomm";
        if (1 != this.cIb)
          break label226;
        str = "/cgi-bin/micromsg-bin/newreportkvcommrsa";
        label113: if (!this.lSi)
          break label233;
        locala.uri = paramf;
        locala.fsI = getType();
        this.ehh = locala.acD();
        if (!this.lSi)
        {
          this.ehh.a(z.dmw());
          this.ehh.cQh = 1;
        }
        i = a(parame, this.ehh, this);
        if (i < 0)
          ab.i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      }
      try
      {
        SmcLogic.OnReportResp(3, -1, null, this.cIb);
        AppMethodBeat.o(72677);
        continue;
        paramf = "/cgi-bin/micromsg-bin/newreportidkey";
        break label101;
        label226: str = "/cgi-bin/micromsg-bin/newreportidkeyrsa";
        break label113;
        label233: paramf = str;
      }
      catch (Exception parame)
      {
        while (true)
          ab.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(parame) });
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(72676);
    if ((com.tencent.mm.kernel.g.RO().eJo == null) || (com.tencent.mm.kernel.g.RO().eJo.ftA == null))
    {
      ab.f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(72676);
    }
    while (true)
    {
      return;
      if (paramInt2 != 0)
      {
        ab.e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + paramInt2 + ", errCode:" + paramInt3);
        SmcLogic.OnReportResp(paramInt2, paramInt3, null, this.cIb);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(72676);
        continue;
      }
      ab.d("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy ok, channel:" + this.cIb);
      paramq = (sl)this.ehh.fsH.fsP;
      this.pXr.a(paramq.vZV, this.cIb);
      try
      {
        if (this.cIb == 1)
          SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportKvResp(paramq).toByteArray(), this.cIb);
        while (true)
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(72676);
          break;
          if (this.cIb == 2)
            SmcLogic.OnReportResp(0, 0, SmcProtoBufUtil.toSmcReportIdkeyResp(paramq).toByteArray(), this.cIb);
        }
      }
      catch (Exception paramq)
      {
        while (true)
          ab.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(paramq) });
      }
    }
  }

  public final int getType()
  {
    int i;
    if (!this.lSi)
      if (1 == this.cIb)
        i = 997;
    while (true)
    {
      return i;
      i = 987;
      continue;
      if (1 == this.cIb)
        i = 996;
      else
        i = 986;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.e
 * JD-Core Version:    0.6.2
 */