package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.brb;
import com.tencent.mm.protocal.protobuf.brc;
import com.tencent.mm.protocal.protobuf.cob;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends com.tencent.mm.ai.m
  implements k
{
  int Kt;
  private int Lp;
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private String filename;
  public boolean sLb;
  private boolean sLd;
  private Handler sLe;
  int sLf;
  private int sLg;
  int sLh;

  public f(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(26086);
    this.Lp = 0;
    this.sLb = false;
    this.sLd = false;
    this.sLe = null;
    this.sLf = 0;
    this.sLg = 0;
    this.sLh = 0;
    this.Kt = 0;
    ab.d("MicroMsg.NetSceneRegisterVoicePrint", "step %d resid %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    this.sLh = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brb();
    ((b.a)localObject).fsK = new brc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registervoiceprint";
    ((b.a)localObject).fsI = 612;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brb)this.ehh.fsG.fsP;
    this.filename = paramString;
    this.Lp = 0;
    ((brb)localObject).wTu = paramInt2;
    ((brb)localObject).jCs = paramInt1;
    this.sLf = paramInt3;
    ((brb)localObject).wTs = paramInt3;
    ab.i("MicroMsg.NetSceneRegisterVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.sLb = true;
    cHL();
    AppMethodBeat.o(26086);
  }

  private int cHL()
  {
    AppMethodBeat.i(26088);
    brb localbrb = (brb)this.ehh.fsG.fsP;
    cob localcob = new cob();
    new g();
    localbrb.wTt = localcob;
    Object localObject = new l(m.by(this.filename, false));
    int i = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
    if (i - this.Lp >= 6000)
    {
      localObject = ((l)localObject).cF(this.Lp, 6000);
      ab.d("MicroMsg.NetSceneRegisterVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.Lp), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).cqs), Integer.valueOf(i), Boolean.valueOf(this.sLb) });
      if (((g)localObject).cqs != 0)
        break label196;
      i = -2;
      AppMethodBeat.o(26088);
    }
    while (true)
    {
      return i;
      int j = this.Lp;
      localObject = ((l)localObject).cF(j, i - j);
      break;
      label196: if (((g)localObject).ret < 0)
      {
        ab.w("MicroMsg.NetSceneRegisterVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
        AppMethodBeat.o(26088);
        i = -1;
      }
      else if (this.Lp >= 469000)
      {
        ab.i("MicroMsg.NetSceneRegisterVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.Lp) });
        AppMethodBeat.o(26088);
        i = -1;
      }
      else
      {
        localcob.xlC = new SKBuiltinBuffer_t().setBuffer(((g)localObject).buf);
        localcob.ptx = this.Lp;
        localcob.xlA = ((g)localObject).cqs;
        localcob.xlB = 0;
        localbrb.wTs = this.sLf;
        if (this.sLb)
        {
          j = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
          if (((g)localObject).fXD >= j)
          {
            localcob.xlB = 1;
            this.sLd = true;
            ab.i("MicroMsg.NetSceneRegisterVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
          }
        }
        this.Lp = ((g)localObject).fXD;
        localbrb.wTt = localcob;
        AppMethodBeat.o(26088);
        i = 0;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(26087);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26087);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26089);
    ab.d("MicroMsg.NetSceneRegisterVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (brc)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26089);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NetSceneRegisterVoicePrint", "voice ticket %d ret %d nextstep %d %d ", new Object[] { Integer.valueOf(paramq.wTs), Integer.valueOf(paramq.wTv), Integer.valueOf(paramq.wTw), Integer.valueOf(paramq.wTv) });
      this.sLf = paramq.wTs;
      this.sLg = paramq.wTw;
      this.Kt = paramq.wTv;
      if (this.sLd)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26089);
      }
      else
      {
        ab.i("MicroMsg.NetSceneRegisterVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(cHL()) });
        a(this.ftf, this.ehi);
        ab.i("MicroMsg.NetSceneRegisterVoicePrint", "loop doscene");
        AppMethodBeat.o(26089);
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
    return 612;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.f
 * JD-Core Version:    0.6.2
 */