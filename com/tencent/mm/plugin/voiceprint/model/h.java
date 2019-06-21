package com.tencent.mm.plugin.voiceprint.model;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bc.a;
import com.tencent.mm.model.bc.b;
import com.tencent.mm.modelvoice.g;
import com.tencent.mm.modelvoice.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cnn;
import com.tencent.mm.protocal.protobuf.cob;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends com.tencent.mm.ai.m
  implements k
{
  int Kt;
  private int Lp;
  f ehi;
  private String filename;
  private final q ftU;
  String gCk;
  public boolean sLb;
  private boolean sLd;
  private Handler sLe;
  private int sLf;

  public h(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(26097);
    this.Lp = 0;
    this.sLb = false;
    this.sLd = false;
    this.sLe = null;
    this.sLf = 0;
    this.Kt = 0;
    this.gCk = "";
    ab.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "resid %d vertifyTicket %s", new Object[] { Integer.valueOf(paramInt), bo.bc(paramString2, "") });
    this.ftU = new c();
    bc.a locala = (bc.a)this.ftU.acF();
    this.filename = paramString1;
    this.Lp = 0;
    locala.fma.wTu = paramInt;
    locala.fma.wuc = paramString2;
    this.sLf = 0;
    locala.fma.wTs = 0;
    ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(0) });
    this.sLb = true;
    cHL();
    AppMethodBeat.o(26097);
  }

  private int cHL()
  {
    AppMethodBeat.i(26099);
    bc.a locala = (bc.a)this.ftU.acF();
    cob localcob = new cob();
    new g();
    locala.fma.xkT = localcob;
    Object localObject = new l(m.by(this.filename, false));
    int i = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
    if (i - this.Lp >= 6000)
    {
      localObject = ((l)localObject).cF(this.Lp, 6000);
      ab.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "read offset %d, ret %d , buf len %d, totallen %d finish %b", new Object[] { Integer.valueOf(this.Lp), Integer.valueOf(((g)localObject).ret), Integer.valueOf(((g)localObject).cqs), Integer.valueOf(i), Boolean.valueOf(this.sLb) });
      if (((g)localObject).cqs != 0)
        break label198;
      i = -2;
      AppMethodBeat.o(26099);
    }
    while (true)
    {
      return i;
      int j = this.Lp;
      localObject = ((l)localObject).cF(j, i - j);
      break;
      label198: if (((g)localObject).ret < 0)
      {
        ab.w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", new Object[] { Integer.valueOf(((g)localObject).ret) });
        AppMethodBeat.o(26099);
        i = -1;
      }
      else if (this.Lp >= 469000)
      {
        ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", new Object[] { Integer.valueOf(this.Lp) });
        AppMethodBeat.o(26099);
        i = -1;
      }
      else
      {
        localcob.xlC = new SKBuiltinBuffer_t().setBuffer(((g)localObject).buf);
        localcob.ptx = this.Lp;
        localcob.xlA = ((g)localObject).cqs;
        localcob.xlB = 0;
        locala.fma.wTs = this.sLf;
        if (this.sLb)
        {
          j = (int)com.tencent.mm.vfs.e.asZ(m.by(this.filename, false));
          if (((g)localObject).fXD >= j)
          {
            localcob.xlB = 1;
            this.sLd = true;
            ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", new Object[] { Integer.valueOf(i) });
          }
        }
        this.Lp = ((g)localObject).fXD;
        locala.fma.xkT = localcob;
        AppMethodBeat.o(26099);
        i = 0;
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(26098);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(26098);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26100);
    ab.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (bc.b)paramq.ZS();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.acF().vyj.ver;
      ab.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      aw.RS().aa(new h.1(this, paramInt1));
      AppMethodBeat.o(26100);
    }
    while (true)
    {
      return;
      if ((paramInt2 != 0) && (paramInt3 != 0))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26100);
      }
      else
      {
        this.sLf = paramArrayOfByte.fmb.wTs;
        this.Kt = paramArrayOfByte.fmb.vYu;
        this.gCk = paramArrayOfByte.fmb.xkU;
        int i = paramArrayOfByte.fmb.wTs;
        int j = this.Kt;
        boolean bool = bo.isNullOrNil(this.gCk);
        if (bo.isNullOrNil(this.gCk));
        for (paramInt1 = 0; ; paramInt1 = this.gCk.length())
        {
          ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Integer.valueOf(paramInt1) });
          if (!this.sLd)
            break label302;
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(26100);
          break;
        }
        label302: ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", new Object[] { Integer.valueOf(cHL()) });
        a(this.ftf, this.ehi);
        ab.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
        AppMethodBeat.o(26100);
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
    return 617;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.h
 * JD-Core Version:    0.6.2
 */