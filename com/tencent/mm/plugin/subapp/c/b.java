package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clx;
import com.tencent.mm.protocal.protobuf.cly;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import junit.framework.Assert;

public final class b extends m
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ai.b ehh;
  com.tencent.mm.ai.f ehi;
  private int endFlag;
  private int fXD;
  private boolean fZa;
  long fZf;
  String fileName;
  ap frk;
  int retCode;

  public b(String paramString)
  {
    AppMethodBeat.i(25251);
    this.retCode = 0;
    this.fXD = 0;
    this.fZa = false;
    this.endFlag = 0;
    this.frk = new ap(new b.1(this), true);
    if (paramString != null);
    while (true)
    {
      Assert.assertTrue(bool);
      ab.d("MicroMsg.NetSceneUploadVoiceRemind", "NetSceneUploadVoice:  file:".concat(String.valueOf(paramString)));
      this.fileName = paramString;
      AppMethodBeat.o(25251);
      return;
      bool = false;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(25252);
    this.ehi = paramf;
    this.fZa = false;
    if (this.fileName == null)
    {
      ab.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  filename null!");
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      AppMethodBeat.o(25252);
    }
    g localg;
    for (int i = -1; ; i = -1)
    {
      return i;
      paramf = this.fileName;
      localg = d.cDE().abp(paramf);
      if ((localg != null) && (localg.ame()))
        break;
      ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Get info Failed file:" + this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      AppMethodBeat.o(25252);
    }
    ab.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene file:" + this.fileName + " netTimes:" + localg.field_nettimes);
    paramf = this.fileName;
    boolean bool;
    if (paramf == null)
      bool = false;
    while (true)
    {
      if (bool)
        break label291;
      ab.e("MicroMsg.NetSceneUploadVoiceRemind", "checkVoiceNetTimes Failed file:" + this.fileName);
      h.um(this.fileName);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
      AppMethodBeat.o(25252);
      i = -1;
      break;
      paramf = d.cDE().abp(paramf);
      if (paramf == null)
      {
        bool = false;
      }
      else if (paramf.field_nettimes >= 80)
      {
        bool = false;
      }
      else
      {
        paramf.field_nettimes += 1;
        paramf.bJt = 16384;
        bool = h.a(paramf);
      }
    }
    label291: paramf = new c.a();
    label352: int j;
    if (localg.field_status == 8)
    {
      ab.v("MicroMsg.NetSceneUploadVoiceRemind", this.fileName + " cancelFlag = 1");
      this.endFlag = 1;
      h.uS(localg.field_filename);
      i = 1;
      j = localg.field_voicelenght;
      if (j != 0)
        break label1645;
      j = (this.fXD - 6) / 32 * 20;
    }
    label1645: 
    while (true)
    {
      ab.d("MicroMsg.NetSceneUploadVoiceRemind", "info.getMsgSvrId() " + localg.field_msgid);
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new clx();
      ((b.a)localObject).fsK = new cly();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadvoicerecognize";
      ((b.a)localObject).fsI = 329;
      ((b.a)localObject).fsL = 157;
      ((b.a)localObject).fsM = 1000000157;
      this.ehh = ((b.a)localObject).acD();
      localObject = (clx)this.ehh.fsG.fsP;
      ((clx)localObject).ndG = r.Yz();
      ((clx)localObject).ndF = localg.field_user;
      ((clx)localObject).vOq = localg.field_offset;
      ((clx)localObject).vFF = localg.field_clientid;
      ((clx)localObject).wdp = j;
      ((clx)localObject).fJT = this.endFlag;
      ((clx)localObject).ptF = localg.field_msgid;
      ((clx)localObject).wdq = i;
      ((clx)localObject).xjF = ((int)(localg.field_createtime / 1000L));
      ((clx)localObject).wEz = 1;
      if (i != 1)
        ((clx)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf.buf, 0, paramf.cqs);
      for (((clx)localObject).wdn = paramf.cqs; ; ((clx)localObject).wdn = 1)
      {
        ab.v("MicroMsg.NetSceneUploadVoiceRemind", "cancelFlag:" + i + " endFlag:" + this.endFlag + " svrId:" + localg.field_msgid);
        ab.v("MicroMsg.NetSceneUploadVoiceRemind", "doscene msgId:" + ((clx)localObject).ptF + " user:" + ((clx)localObject).ndF + " offset:" + ((clx)localObject).vOq + " dataLen:" + ((clx)localObject).ptz.getILen() + " endFlag:" + ((clx)localObject).fJT);
        ab.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene MsgId:" + localg.field_msgid + " file:" + this.fileName + " readBytes:" + paramf.cqs + " neTTTOff:" + localg.field_offset + " neWWWOff:" + this.fXD + " endFlag:" + this.endFlag + " cancelFlag:" + i + " status:" + localg.field_status);
        ab.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log " + localObject.toString());
        this.fZf = System.currentTimeMillis();
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(25252);
        break;
        if (localg.field_status == 3)
          this.fZa = true;
        paramf = h.abm(this.fileName);
        if (paramf == null)
        {
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          AppMethodBeat.o(25252);
          i = -1;
          break;
        }
        paramf = paramf.Fo(localg.field_offset);
        ab.d("MicroMsg.NetSceneUploadVoiceRemind", "doScene READ file[" + this.fileName + "] read ret:" + paramf.ret + " readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localg.field_offset + " line:" + com.tencent.mm.compatible.util.g.getLine());
        if (paramf.ret < 0)
        {
          ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] read ret:" + paramf.ret + " readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localg.field_offset);
          h.um(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          AppMethodBeat.o(25252);
          i = -1;
          break;
        }
        this.fXD = paramf.fXD;
        if ((this.fXD < localg.field_offset) || (this.fXD >= 469000))
        {
          ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] newOff:" + this.fXD + " OldtOff:" + localg.field_offset);
          h.um(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          AppMethodBeat.o(25252);
          i = -1;
          break;
        }
        this.endFlag = 0;
        if ((paramf.cqs == 0) && (!this.fZa))
        {
          ab.e("MicroMsg.NetSceneUploadVoiceRemind", "doScene:  file:" + this.fileName + " No Data temperature , will be retry");
          h.um(this.fileName);
          this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
          AppMethodBeat.o(25252);
          i = -1;
          break;
        }
        if (this.fZa)
        {
          if (localg.field_totallen <= 0)
          {
            ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] read totalLen:" + localg.field_totallen);
            h.um(this.fileName);
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
            AppMethodBeat.o(25252);
            i = -1;
            break;
          }
          if ((localg.field_totallen > this.fXD) && (paramf.cqs < 6000))
          {
            ab.e("MicroMsg.NetSceneUploadVoiceRemind", "Err doScene READ file[" + this.fileName + "] readlen:" + paramf.cqs + " newOff:" + paramf.fXD + " netOff:" + localg.field_offset + " totalLen:" + localg.field_totallen);
            h.um(this.fileName);
            this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
            AppMethodBeat.o(25252);
            i = -1;
            break;
          }
          if (localg.field_totallen <= this.fXD)
            this.endFlag = 1;
        }
        i = 0;
        break label352;
        ((clx)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.bt.b.bI(new byte[1]));
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25255);
    ab.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (clx)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    paramq = (cly)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    ab.d("MicroMsg.NetSceneUploadVoiceRemind", "tiger log resp " + paramq.toString());
    if ((paramInt2 == 4) && (paramInt3 == -22))
    {
      paramq = this.fileName;
      paramq = d.cDE().abp(paramq);
      if (paramq != null)
      {
        if (paramq.field_status == 3)
        {
          aw.ZK();
          paramArrayOfByte = com.tencent.mm.model.c.XO().jf(paramq.field_msglocalid);
          paramArrayOfByte.setContent(f.d(paramq.field_human, paramq.field_voicelenght, false));
          paramArrayOfByte.setStatus(2);
          aw.ZK();
          com.tencent.mm.model.c.XO().a(paramq.field_msglocalid, paramArrayOfByte);
        }
        paramq.field_status = 97;
        paramq.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
        paramq.bJt = 320;
        h.a(paramq);
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25255);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 4) && (paramInt3 != 0))
      {
        h.um(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(25255);
      }
      else if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " errType:" + paramInt2 + " errCode:" + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(25255);
      }
      else
      {
        ab.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd msgId:" + paramq.ptF + " toUser:" + paramArrayOfByte.ndF);
        String str = this.fileName;
        int i = this.fXD;
        l = paramq.ptF;
        Object localObject = paramq.vFF;
        int j = this.endFlag;
        if (str == null)
          paramInt1 = -1;
        while (true)
        {
          ab.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd updateAfterSend:" + paramInt1 + " file:" + this.fileName + " MsgSvrId:" + paramq.ptF + " clientId:" + paramq.vFF + " neWWOff:" + this.fXD + " neTTTT:" + paramq.wdn);
          if (paramInt1 >= 0)
            break label1094;
          h.um(this.fileName);
          ab.e("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + "UpdateAfterSend Ret:" + paramInt1);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(25255);
          break;
          ab.d("MicroMsg.VoiceRemindLogic", "UpdateAfterSend file:[" + str + "] newOff:" + i + " SvrID:" + l + " clientID:" + (String)localObject + " hasSendEndFlag " + j);
          paramArrayOfByte = d.cDE().abp(str);
          if (paramArrayOfByte == null)
          {
            paramInt1 = -1;
          }
          else
          {
            paramArrayOfByte.field_offset = i;
            paramArrayOfByte.field_lastmodifytime = (System.currentTimeMillis() / 1000L);
            paramArrayOfByte.bJt = 264;
            if ((bo.isNullOrNil(paramArrayOfByte.field_clientid)) && (localObject != null))
            {
              paramArrayOfByte.field_clientid = ((String)localObject);
              paramArrayOfByte.bJt |= 512;
            }
            if ((paramArrayOfByte.field_msgid == 0L) && (l != 0L))
            {
              paramArrayOfByte.field_msgid = l;
              paramArrayOfByte.bJt |= 4;
            }
            int k = 0;
            ab.d("MicroMsg.VoiceRemindLogic", "info.getTotalLen() " + paramArrayOfByte.field_totallen + "  newOffset " + i + "  " + paramArrayOfByte.field_status);
            paramInt1 = k;
            if (paramArrayOfByte.field_totallen <= i)
            {
              paramInt1 = k;
              if (paramArrayOfByte.field_status == 3)
              {
                paramInt1 = k;
                if (j == 1)
                {
                  paramArrayOfByte.field_status = 99;
                  paramArrayOfByte.bJt |= 64;
                  aw.ZK();
                  localObject = com.tencent.mm.model.c.XO().jf(paramArrayOfByte.field_msglocalid);
                  ((bi)localObject).ju(paramArrayOfByte.field_user);
                  ((bi)localObject).eI(paramArrayOfByte.field_msgid);
                  ((bi)localObject).setStatus(2);
                  ((bi)localObject).setContent(f.d(paramArrayOfByte.field_human, paramArrayOfByte.field_voicelenght, false));
                  aw.ZK();
                  com.tencent.mm.model.c.XO().a(paramArrayOfByte.field_msglocalid, (bi)localObject);
                  ab.d("MicroMsg.VoiceRemindLogic", "END!!! updateSend  file:" + str + " total:" + paramArrayOfByte.field_totallen + " status:" + paramArrayOfByte.field_status + " netTimes:" + paramArrayOfByte.field_nettimes);
                  paramInt1 = 1;
                  h.uO(str);
                }
              }
            }
            if (!h.a(paramArrayOfByte))
              paramInt1 = -4;
          }
        }
        label1094: if (paramInt1 != 1)
          break;
        ab.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd finish file:" + this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(25255);
      }
    }
    if (this.fZa);
    for (long l = 0L; ; l = 500L)
    {
      ab.d("MicroMsg.NetSceneUploadVoiceRemind", "onGYNetEnd file:" + this.fileName + " delay:" + l);
      this.frk.ae(l, l);
      AppMethodBeat.o(25255);
      break;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(25254);
    h.um(this.fileName);
    AppMethodBeat.o(25254);
  }

  public final int acn()
  {
    return 240;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(25253);
    paramq = (clx)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    ab.v("MicroMsg.NetSceneUploadVoiceRemind", "check : offset:" + paramq.vOq + " dataLen:" + paramq.ptz.getILen() + " endFlag:" + paramq.fJT);
    paramq = m.b.ftu;
    AppMethodBeat.o(25253);
    return paramq;
  }

  public final int getType()
  {
    return 329;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.b
 * JD-Core Version:    0.6.2
 */