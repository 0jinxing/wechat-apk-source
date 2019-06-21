package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cnk;
import com.tencent.mm.protocal.protobuf.cnl;
import com.tencent.mm.protocal.protobuf.cob;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends com.tencent.mm.ai.m
  implements k
{
  int Kt;
  private int Lp;
  private final b ehh;
  private f ehi;
  private String filename;
  private String gCk;
  public boolean sLb;
  private boolean sLd;
  private Handler sLe;
  private int sLf;

  public j(String paramString, int paramInt)
  {
    AppMethodBeat.i(26104);
    this.Lp = 0;
    this.sLb = false;
    this.sLd = false;
    this.sLe = null;
    this.sLf = 0;
    this.Kt = 0;
    this.gCk = "";
    ab.d("MicroMsg.NetSceneVerifyVoicePrint", "resid %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cnk();
    ((b.a)localObject).fsK = new cnl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyvoiceprint";
    ((b.a)localObject).fsI = 613;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cnk)this.ehh.fsG.fsP;
    this.filename = paramString;
    this.Lp = 0;
    ((cnk)localObject).wTu = paramInt;
    this.sLf = 0;
    ((cnk)localObject).wTs = 0;
    ab.i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.sLb = true;
    cHL();
    AppMethodBeat.o(26104);
  }

  private int cHL()
  {
    AppMethodBeat.i(26106);
    cnk localcnk = (cnk)this.ehh.fsG.fsP;
    cob localcob = new cob();
    new g();
    localcnk.xkT = localcob;
    Object localObject = new l(m.by(this.filename, false));
    int i = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
    if (i - this.Lp >= 6000)
    {
      localObject = ((l)localObject).cF(this.Lp, 6000);
      ab.d("MicroMsg.NetSceneVerifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.Lp), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).cqs), Integer.valueOf(i), Boolean.valueOf(this.sLb) });
      if (((g)localObject).cqs != 0)
        break label196;
      i = -2;
      AppMethodBeat.o(26106);
    }
    while (true)
    {
      return i;
      int j = this.Lp;
      localObject = ((l)localObject).cF(j, i - j);
      break;
      label196: if (((g)localObject).ret < 0)
      {
        ab.w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
        AppMethodBeat.o(26106);
        i = -1;
      }
      else if (this.Lp >= 469000)
      {
        ab.i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.Lp) });
        AppMethodBeat.o(26106);
        i = -1;
      }
      else
      {
        localcob.xlC = new SKBuiltinBuffer_t().setBuffer(((g)localObject).buf);
        localcob.ptx = this.Lp;
        localcob.xlA = ((g)localObject).cqs;
        localcob.xlB = 0;
        localcnk.wTs = this.sLf;
        if (this.sLb)
        {
          j = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
          if (((g)localObject).fXD >= j)
          {
            localcob.xlB = 1;
            this.sLd = true;
            ab.i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
          }
        }
        this.Lp = ((g)localObject).fXD;
        localcnk.xkT = localcob;
        AppMethodBeat.o(26106);
        i = 0;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(26105);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26105);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26107);
    ab.d("MicroMsg.NetSceneVerifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (cnl)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26107);
    }
    while (true)
    {
      return;
      this.sLf = paramq.wTs;
      this.Kt = paramq.vYu;
      ab.i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", new Object[] { Integer.valueOf(paramq.wTs), Integer.valueOf(this.Kt) });
      if (this.sLd)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26107);
      }
      else
      {
        ab.i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(cHL()) });
        a(this.ftf, this.ehi);
        ab.i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
        AppMethodBeat.o(26107);
      }
    }
  }

  public final int acn()
  {
    return 240;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 613;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.j
 * JD-Core Version:    0.6.2
 */