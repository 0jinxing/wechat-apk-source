package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.l.a;
import com.tencent.mm.l.a.a;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clx;
import com.tencent.mm.protocal.protobuf.cly;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.ad;
import java.util.HashMap;
import junit.framework.Assert;

public final class f extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  private int endFlag;
  private int fXD;
  private boolean fZa;
  private int fZe;
  long fZf;
  public String fileName;
  ap frk;
  public int retCode;

  public f(String paramString)
  {
    this(paramString, 0);
  }

  public f(String paramString, int paramInt)
  {
    AppMethodBeat.i(116578);
    this.retCode = 0;
    this.fXD = 0;
    this.fZa = false;
    this.endFlag = 0;
    this.frk = new ap(new f.1(this), true);
    if (paramString != null);
    while (true)
    {
      Assert.assertTrue(bool);
      ab.d("MicroMsg.NetSceneUploadVoice", "NetSceneUploadVoice:  file:".concat(String.valueOf(paramString)));
      this.fileName = paramString;
      this.fZe = paramInt;
      AppMethodBeat.o(116578);
      return;
      bool = false;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(116579);
    this.ehi = paramf;
    this.fZa = false;
    int i;
    if (this.fileName == null)
    {
      ab.e("MicroMsg.NetSceneUploadVoice", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      i = -1;
      AppMethodBeat.o(116579);
    }
    p localp;
    while (true)
    {
      return i;
      localp = q.uW(this.fileName);
      if ((localp == null) || (!localp.ame()))
      {
        ab.e("MicroMsg.NetSceneUploadVoice", "Get info Failed file:" + this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        i = -1;
        AppMethodBeat.o(116579);
      }
      else
      {
        ab.d("MicroMsg.NetSceneUploadVoice", "doScene file:" + this.fileName + " netTimes:" + localp.fXf);
        if (q.uM(this.fileName))
          break;
        ab.e("MicroMsg.NetSceneUploadVoice", "checkVoiceNetTimes Failed file:" + this.fileName);
        q.um(this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        i = -1;
        AppMethodBeat.o(116579);
      }
    }
    paramf = new g();
    int j;
    int k;
    label281: Object localObject;
    if (localp.status == 8)
    {
      ab.v("MicroMsg.NetSceneUploadVoice", this.fileName + " cancelFlag = 1");
      j = 1;
      this.endFlag = 0;
      q.uS(localp.fileName);
      k = 0;
      int m = localp.gaf;
      ab.i("MicroMsg.NetSceneUploadVoice", "info.getVoiceLength: %s", new Object[] { Integer.valueOf(m) });
      i = m;
      if (m == 0)
      {
        m = q.uX(this.fileName);
        ab.i("MicroMsg.NetSceneUploadVoice", "getCurrentRecordFileLen: %s", new Object[] { Integer.valueOf(m) });
        i = m;
        if (m < 0)
        {
          i = q.mt(this.fXD);
          ab.i("MicroMsg.NetSceneUploadVoice", "fuck getMinTimeByOffset: %s", new Object[] { Integer.valueOf(i) });
        }
      }
      localObject = new b.a();
      ((b.a)localObject).fsJ = new clx();
      ((b.a)localObject).fsK = new cly();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadvoice";
      ((b.a)localObject).fsI = 127;
      ((b.a)localObject).fsL = 19;
      ((b.a)localObject).fsM = 1000000019;
      this.ehh = ((b.a)localObject).acD();
      localObject = (clx)this.ehh.fsG.fsP;
      ((clx)localObject).ndG = r.Yz();
      ((clx)localObject).ndF = localp.cIS;
      ((clx)localObject).vOq = localp.fVG;
      ((clx)localObject).vFF = localp.clientId;
      ((clx)localObject).wdp = i;
      ((clx)localObject).fJT = this.endFlag;
      ((clx)localObject).ptF = localp.cKK;
      ((clx)localObject).wdq = j;
      ((clx)localObject).xjG = this.fZe;
      ((clx)localObject).vEG = bh.aaf();
      ((clx)localObject).vEG = a.a.KG().F(localp.cIS, localp.fXe);
      ((clx)localObject).wEz = k;
      if (j == 1)
        break label2048;
      ((clx)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf.buf, 0, paramf.cqs);
    }
    for (((clx)localObject).wdn = paramf.cqs; ; ((clx)localObject).wdn = 1)
    {
      ab.d("MicroMsg.NetSceneUploadVoice", "cancelFlag:" + j + " endFlag:" + this.endFlag + " svrId:" + localp.cKK);
      ab.v("MicroMsg.NetSceneUploadVoice", "doscene msgId:" + ((clx)localObject).ptF + " user:" + ((clx)localObject).ndF + " offset:" + ((clx)localObject).vOq + " dataLen:" + ((clx)localObject).ptz.getILen() + " endFlag:" + ((clx)localObject).fJT);
      ab.i("MicroMsg.NetSceneUploadVoice", "doScene MsgId:" + localp.cKK + " voiceFormat:" + k + " file:" + this.fileName + " readBytes:" + paramf.cqs + " neTTTOff:" + localp.fVG + " neWWWOff:" + this.fXD + " endFlag:" + this.endFlag + " cancelFlag:" + j + " status:" + localp.status + " voiceLen:" + i);
      this.fZf = System.currentTimeMillis();
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(116579);
      break;
      if (localp.status == 3)
        this.fZa = true;
      localObject = q.uN(this.fileName);
      if (localObject == null)
      {
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        ab.e("MicroMsg.NetSceneUploadVoice", "doScene: fileOp is null, fileName:%s", new Object[] { this.fileName });
        i = -1;
        AppMethodBeat.o(116579);
        break;
      }
      k = ((b)localObject).getFormat();
      ab.d("MicroMsg.NetSceneUploadVoice", "format ".concat(String.valueOf(k)));
      paramf = ((b)localObject).cF(localp.fVG, 6000);
      ab.d("MicroMsg.NetSceneUploadVoice", "doScene READ file[" + this.fileName + "] read ret:" + paramf.ret + " readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localp.fVG + " line:" + com.tencent.mm.compatible.util.g.getLine());
      if (paramf.ret < 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 241L, 1L, false);
        ab.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] read ret:" + paramf.ret + " readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localp.fVG);
        q.um(this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        i = -1;
        AppMethodBeat.o(116579);
        break;
      }
      this.fXD = paramf.fXD;
      if ((this.fXD < localp.fVG) || (this.fXD >= 469000))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 240L, 1L, false);
        ab.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] newOff:" + this.fXD + " OldtOff:" + localp.fVG);
        q.um(this.fileName);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        i = -1;
        AppMethodBeat.o(116579);
        break;
      }
      this.endFlag = 0;
      if ((paramf.cqs == 0) && (!this.fZa))
      {
        ab.e("MicroMsg.NetSceneUploadVoice", "doScene:  file:" + this.fileName + " No Data temperature , will be retry");
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
        i = -1;
        AppMethodBeat.o(116579);
        break;
      }
      if (this.fZa)
      {
        if (localp.frO <= 0)
        {
          ab.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] read totalLen:" + localp.frO);
          q.um(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          i = -1;
          AppMethodBeat.o(116579);
          break;
        }
        if ((localp.frO > this.fXD) && (paramf.cqs < 6000))
        {
          ab.e("MicroMsg.NetSceneUploadVoice", "Err doScene READ file[" + this.fileName + "] readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localp.fVG + " totalLen:" + localp.frO);
          q.um(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          i = -1;
          AppMethodBeat.o(116579);
          break;
        }
        if (localp.frO <= this.fXD)
        {
          Integer localInteger = (Integer)q.gak.get(q.getFullPath(this.fileName));
          if ((localInteger != null) && (localInteger.intValue() != 0))
          {
            j = ((Integer)q.gal.get(q.getFullPath(this.fileName))).intValue();
            localObject = ((b)localObject).cF(0, j);
            i = q.c(localInteger.intValue() & 0xFF, ((g)localObject).buf, ((g)localObject).cqs);
            if (localInteger.intValue() != i)
            {
              ab.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. realChecksum:%d, tempChecksum:%d, total:%d, rr.length:%d", new Object[] { Integer.valueOf(i), localInteger, Integer.valueOf(j), Integer.valueOf(((g)localObject).cqs) });
              ab.e("MicroMsg.NetSceneUploadVoice", "Checksum error file[" + this.fileName + "] readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localp.fVG + " totalLen:" + localp.frO);
              com.tencent.mm.plugin.report.service.h.pYm.a(111L, 173L, 1L, false);
              q.gak.put(q.getFullPath(this.fileName), Integer.valueOf(i));
              localInteger = (Integer)q.gam.get(q.getFullPath(this.fileName));
              if ((localInteger != null) && (localInteger.intValue() != 0))
              {
                i = q.b(0, ((g)localObject).buf, ((g)localObject).cqs);
                if (localInteger.intValue() != i)
                {
                  ab.e("MicroMsg.NetSceneUploadVoice", "Checksum error file. cacheSimpleChecksum:%d, realSimpleChecksum:%d", new Object[] { localInteger, Integer.valueOf(i) });
                  q.um(this.fileName);
                  this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
                  com.tencent.mm.plugin.report.service.h.pYm.a(111L, 174L, 1L, false);
                  i = -1;
                  AppMethodBeat.o(116579);
                  break;
                }
              }
            }
          }
          this.endFlag = 1;
        }
      }
      j = 0;
      break label281;
      label2048: ((clx)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.bt.b.bI(new byte[1]));
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116583);
    ab.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (clx)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    paramq = (cly)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      q.un(this.fileName);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116583);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 4) && (paramInt3 != 0))
      {
        q.um(this.fileName);
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 237L, 1L, false);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116583);
      }
      else if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(111L, 236L, 1L, false);
        ab.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " errType:" + paramInt2 + " errCode:" + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116583);
      }
      else
      {
        ab.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd msgId:" + paramq.ptF + " toUser:" + paramArrayOfByte.ndF);
        if ((paramq.ptF <= 0L) && (!ad.mR(paramArrayOfByte.ndF)))
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(111L, 235L, 1L, false);
          ab.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " getMsgId:" + paramq.ptF + " netoff:" + paramq.vOq);
          q.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(116583);
        }
        else
        {
          ab.d("MicroMsg.NetSceneUploadVoice", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(paramq.ptF), Integer.valueOf(ae.giA) });
          if ((10007 == ae.giz) && (ae.giA != 0))
          {
            paramq.ptF = ae.giA;
            ae.giA = 0;
          }
          paramInt1 = q.a(this.fileName, this.fXD, paramq.ptF, paramq.vFF, this.endFlag, this.fZe);
          ab.d("MicroMsg.NetSceneUploadVoice", "dkmsgid onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.fileName + " MsgSvrId:" + paramq.ptF + " clientId:" + paramq.vFF + " neWWOff:" + this.fXD + " neTTTT:" + paramq.wdn + " forwardflag:" + this.fZe);
          if (paramInt1 < 0)
          {
            q.um(this.fileName);
            ab.e("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + "UpdateAfterSend Ret:" + paramInt1);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(116583);
          }
          else
          {
            if (paramInt1 != 1)
              break;
            ab.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd finish file:" + this.fileName);
            paramq = q.uW(this.fileName);
            paramq = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramq.fXe);
            com.tencent.mm.modelstat.b.fRa.j(paramq);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(116583);
          }
        }
      }
    }
    if (this.fZa);
    for (long l = 0L; ; l = 500L)
    {
      ab.d("MicroMsg.NetSceneUploadVoice", "onGYNetEnd file:" + this.fileName + " delay:" + l);
      this.frk.ae(l, l);
      AppMethodBeat.o(116583);
      break;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(116582);
    com.tencent.mm.plugin.report.service.h.pYm.a(111L, 238L, 1L, false);
    q.um(this.fileName);
    AppMethodBeat.o(116582);
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(116581);
    boolean bool = super.acJ();
    if (bool)
      com.tencent.mm.plugin.report.service.h.pYm.a(111L, 239L, 1L, false);
    AppMethodBeat.o(116581);
    return bool;
  }

  public final int acn()
  {
    return 60;
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    AppMethodBeat.i(116580);
    paramq = (clx)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    ab.v("MicroMsg.NetSceneUploadVoice", "check msgId:" + paramq.ptF + " offset:" + paramq.vOq + " dataLen:" + paramq.ptz.getILen() + " endFlag:" + paramq.fJT);
    if (((paramq.ptF == 0L) && (paramq.vOq != 0)) || (((paramq.ptz == null) || (paramq.ptz.getILen() == 0)) && (paramq.fJT != 1) && (paramq.wdq != 1)))
    {
      paramq = m.b.ftv;
      AppMethodBeat.o(116580);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(116580);
    }
  }

  public final int getType()
  {
    return 127;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.f
 * JD-Core Version:    0.6.2
 */