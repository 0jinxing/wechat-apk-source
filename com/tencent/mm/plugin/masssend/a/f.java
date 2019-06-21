package com.tencent.mm.plugin.masssend.a;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.b;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bap;
import com.tencent.mm.protocal.protobuf.baq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import junit.framework.Assert;

public final class f extends m
  implements k
{
  g.a eOm;
  boolean eVT;
  public com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private int fDC;
  int fXf;
  private a ooh;
  int retCode;

  public f(a parama, boolean paramBoolean)
  {
    this(parama, paramBoolean, 0);
  }

  public f(a parama, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(22738);
    this.ooh = null;
    this.eOm = null;
    this.retCode = 0;
    this.fXf = 0;
    this.eVT = false;
    this.ooh = parama;
    this.fDC = paramInt;
    parama.createTime = bo.anU();
    if (parama.msgType == 43)
    {
      parama.status = 104;
      com.tencent.mm.modelvideo.o.all();
      parama.ood = t.uj(t.ui(parama.bNw()));
      com.tencent.mm.modelvideo.o.all();
      parama.cde = t.uj(t.uh(parama.bNw()));
      this.fXf = 2500;
      if (parama.videoSource == 2)
        this.fXf = 2500;
    }
    Object localObject;
    while (true)
    {
      localObject = new b.a();
      ((b.a)localObject).fsJ = new bap();
      ((b.a)localObject).fsK = new baq();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/masssend";
      ((b.a)localObject).fsI = 193;
      ((b.a)localObject).fsL = 84;
      ((b.a)localObject).fsM = 1000000084;
      this.ehh = ((b.a)localObject).acD();
      localObject = (bap)this.ehh.fsG.fsP;
      ((bap)localObject).wEm = com.tencent.mm.a.g.x(parama.bNy().getBytes());
      ((bap)localObject).wEx = parama.ooa;
      ((bap)localObject).wEl = parama.bNy();
      parama.fQv = bo.anU();
      ((bap)localObject).wEn = parama.bNv();
      ((bap)localObject).nao = parama.msgType;
      ((bap)localObject).wEo = parama.oob;
      if (!paramBoolean)
        break label550;
      j = i;
      label302: ((bap)localObject).wEy = j;
      ((bap)localObject).wqw = paramInt;
      this.eOm = new g.a();
      AppMethodBeat.o(22738);
      return;
      if (parama.msgType != 34)
        break;
      this.fXf = 40;
      parama.status = 104;
      parama.cde = com.tencent.mm.modelvoice.o.uj(parama.bNw());
      parama.ood = 0;
    }
    if (parama.msgType == 3)
    {
      this.fXf = 40;
      if (paramInt != 1)
        break label556;
      this.fXf = 1250;
    }
    label550: label556: for (int j = 1; ; j = 0)
    {
      parama.ooe = j;
      parama.status = 104;
      parama.ood = 0;
      localObject = new StringBuilder();
      aw.ZK();
      parama.cde = ((int)com.tencent.mm.vfs.e.asZ(com.tencent.mm.model.c.XW() + parama.bNw()));
      break;
      if (parama.msgType == 1)
      {
        this.fXf = 1;
        parama.status = 104;
        parama.cde = parama.bNw().getBytes().length;
        parama.ood = 0;
        break;
      }
      ab.d("MicroMsg.NetSceneMasSend", "error msgtype:" + parama.msgType);
      Assert.assertTrue("error msgtype:" + parama.msgType, false);
      break;
      j = 0;
      break label302;
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(22739);
    this.ehi = paramf;
    if (this.eVT)
    {
      ab.d("MicroMsg.NetSceneMasSend", "isCancel");
      this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
      AppMethodBeat.o(22739);
      j = -1;
    }
    while (true)
    {
      return j;
      this.fXf -= 1;
      if (this.fXf < 0)
      {
        ab.d("MicroMsg.NetSceneMasSend", "MAX_SEND_TIMES");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if (this.ooh == null)
      {
        ab.d("MicroMsg.NetSceneMasSend", "MasSendInfo is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if (bo.isNullOrNil(this.ooh.bNy()))
      {
        ab.d("MicroMsg.NetSceneMasSend", "MasSendInfo.toList is null");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if (this.ooh.ooa == 0)
      {
        ab.d("MicroMsg.NetSceneMasSend", "getTolistCount is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if (this.ooh.cde <= 0)
      {
        ab.d("MicroMsg.NetSceneMasSend", "getDataLen is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if ((this.ooh.status == 103) && (this.ooh.ood <= 0))
      {
        ab.d("MicroMsg.NetSceneMasSend", "getThumbTotalLen is 0");
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else if ((this.ooh.status != 103) && (this.ooh.status != 104))
      {
        ab.d("MicroMsg.NetSceneMasSend", "msg type :" + this.ooh.msgType);
        this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
        AppMethodBeat.o(22739);
        j = -1;
      }
      else
      {
        paramf = (bap)this.ehh.fsG.fsP;
        Object localObject1;
        Object localObject2;
        label686: label854: Object localObject3;
        if (this.ooh.msgType == 43)
        {
          localObject1 = this.ooh.bNw();
          if (bo.isNullOrNil((String)localObject1))
          {
            ab.d("MicroMsg.NetSceneMasSend", "MasSendInfo.fileName is null");
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            j = -1;
          }
          while (true)
          {
            if (j == 0)
              break label2317;
            AppMethodBeat.o(22739);
            break;
            paramf.wEp = new SKBuiltinBuffer_t();
            paramf.wEq = 0;
            paramf.wEu = new SKBuiltinBuffer_t();
            paramf.wEt = 0;
            paramf.wEv = 2;
            paramf.wEo = this.ooh.oob;
            if (this.ooh.videoSource > 0);
            for (j = 2; ; j = 0)
            {
              paramf.wEw = j;
              paramf.wEs = this.ooh.ood;
              paramf.wEr = this.ooh.cde;
              if (this.ooh.status != 103)
                break label920;
              com.tencent.mm.modelvideo.o.all();
              localObject2 = t.m(t.ui((String)localObject1), this.ooh.fWZ, 8000);
              if ((((t.b)localObject2).ret >= 0) && (((t.b)localObject2).cqs != 0))
                break label686;
              ab.e("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "]  Error ");
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
              break;
            }
            ab.d("MicroMsg.NetSceneMasSend", "doScene READ THUMB[" + (String)localObject1 + "] read ret:" + ((t.b)localObject2).ret + " readlen:" + ((t.b)localObject2).cqs + " newOff:" + ((t.b)localObject2).fXD + " netOff:" + this.ooh.fWZ);
            if (((t.b)localObject2).fXD >= this.ooh.fWZ)
              break label854;
            ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ THUMB[" + (String)localObject1 + "] newOff:" + ((t.b)localObject2).fXD + " OldtOff:" + this.ooh.fWZ);
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            j = -1;
          }
          localObject3 = new byte[((t.b)localObject2).cqs];
          System.arraycopy(((t.b)localObject2).buf, 0, localObject3, 0, ((t.b)localObject2).cqs);
          paramf.wEt = this.ooh.fWZ;
          localObject2 = new SKBuiltinBuffer_t();
          ((SKBuiltinBuffer_t)localObject2).setBuffer((byte[])localObject3);
          paramf.wEu = ((SKBuiltinBuffer_t)localObject2);
          while (true)
          {
            j = 0;
            break;
            label920: com.tencent.mm.modelvideo.o.all();
            localObject3 = t.m(t.uh((String)localObject1), this.ooh.ooc, 8000);
            if ((((t.b)localObject3).ret < 0) || (((t.b)localObject3).cqs == 0))
            {
              ab.e("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "]  Error ");
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
              break;
            }
            ab.d("MicroMsg.NetSceneMasSend", "doScene READ VIDEO[" + (String)localObject1 + "] read ret:" + ((t.b)localObject3).ret + " readlen:" + ((t.b)localObject3).cqs + " newOff:" + ((t.b)localObject3).fXD + " netOff:" + this.ooh.ooc);
            if (((t.b)localObject3).fXD < this.ooh.ooc)
            {
              ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] newOff:" + ((t.b)localObject3).fXD + " OldtOff:" + this.ooh.ooc);
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
              break;
            }
            if (((t.b)localObject3).fXD >= com.tencent.mm.modelvideo.c.fUE)
            {
              ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ VIDEO[" + (String)localObject1 + "] maxsize:" + com.tencent.mm.modelvideo.c.fUE);
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
              break;
            }
            localObject2 = new byte[((t.b)localObject3).cqs];
            System.arraycopy(((t.b)localObject3).buf, 0, localObject2, 0, ((t.b)localObject3).cqs);
            paramf.wEq = this.ooh.ooc;
            paramf.wEt = this.ooh.fWZ;
            localObject3 = new SKBuiltinBuffer_t();
            ((SKBuiltinBuffer_t)localObject3).setBuffer((byte[])localObject2);
            paramf.wEp = ((SKBuiltinBuffer_t)localObject3);
          }
        }
        if (this.ooh.msgType == 34)
        {
          paramf.wEv = 0;
          paramf.wEw = 0;
          paramf.wEp = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
          paramf.wEq = 0;
          paramf.wEu = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
          paramf.wEt = 0;
          paramf.wEs = 0;
          paramf.wEr = this.ooh.cde;
          localObject3 = com.tencent.mm.modelvoice.q.uN(this.ooh.bNw());
          if (localObject3 == null)
          {
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            ab.d("MicroMsg.NetSceneMasSend", "fileop is null");
            j = -1;
          }
          while (true)
          {
            if (j == 0)
              break label2317;
            AppMethodBeat.o(22739);
            j = -1;
            break;
            localObject2 = ((com.tencent.mm.modelvoice.b)localObject3).cF(this.ooh.ooc, 8000);
            if (((com.tencent.mm.modelvoice.g)localObject2).ret < 0)
            {
              ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ file[" + this.ooh.bNw() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).cqs + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).fXD + " netOff:" + this.ooh.ooc);
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
            }
            else if ((((com.tencent.mm.modelvoice.g)localObject2).fXD < this.ooh.ooc) || (((com.tencent.mm.modelvoice.g)localObject2).fXD >= 469000))
            {
              ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ offseterror file[" + this.ooh.bNw() + "] read ret:" + ((com.tencent.mm.modelvoice.g)localObject2).ret + " readlen:" + ((com.tencent.mm.modelvoice.g)localObject2).cqs + " newOff:" + ((com.tencent.mm.modelvoice.g)localObject2).fXD + " netOff:" + this.ooh.ooc);
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
            }
            else if (this.ooh.cde <= 0)
            {
              ab.e("MicroMsg.NetSceneMasSend", "Err doScene READ datalen file[" + this.ooh.bNw() + "] read totalLen:" + this.ooh.cde);
              this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 10000);
              j = -1;
            }
            else
            {
              localObject1 = new byte[((com.tencent.mm.modelvoice.g)localObject2).cqs];
              System.arraycopy(((com.tencent.mm.modelvoice.g)localObject2).buf, 0, localObject1, 0, ((com.tencent.mm.modelvoice.g)localObject2).cqs);
              paramf.wEp = new SKBuiltinBuffer_t().setBuffer((byte[])localObject1);
              paramf.wEo = this.ooh.oob;
              paramf.wEq = this.ooh.ooc;
              paramf.wEz = ((com.tencent.mm.modelvoice.b)localObject3).getFormat();
            }
          }
        }
        if (this.ooh.msgType == 3)
        {
          if (bo.isNullOrNil(this.ooh.bNw()))
          {
            ab.d("MicroMsg.NetSceneMasSend", "getFilename is null");
            this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
            j = -1;
          }
          while (true)
          {
            if (j == 0)
              break label2317;
            AppMethodBeat.o(22739);
            j = -1;
            break;
            paramf.wEv = 0;
            paramf.wEw = 0;
            paramf.wEp = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
            paramf.wEq = 0;
            paramf.wEu = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
            paramf.wEt = 0;
            paramf.wEs = 0;
            paramf.wEo = 0;
            paramf.wEs = this.ooh.ood;
            paramf.wEr = this.ooh.cde;
            paramf.wqw = this.fDC;
            localObject2 = new StringBuilder();
            aw.ZK();
            localObject2 = com.tencent.mm.model.c.XW() + this.ooh.bNw();
            int k = this.ooh.cde - this.ooh.ooc;
            j = k;
            if (k > 8000)
              j = 8000;
            localObject2 = com.tencent.mm.vfs.e.e((String)localObject2, this.ooh.ooc, j);
            if (bo.cb((byte[])localObject2))
            {
              ab.e("MicroMsg.NetSceneMasSend", "doScene READ data[" + this.ooh.bNw() + "]  Error ");
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              j = -1;
            }
            else
            {
              paramf.wEq = this.ooh.ooc;
              paramf.wEt = this.ooh.fWZ;
              localObject3 = new SKBuiltinBuffer_t();
              ((SKBuiltinBuffer_t)localObject3).setBuffer((byte[])localObject2);
              paramf.wEp = ((SKBuiltinBuffer_t)localObject3);
              j = i;
            }
          }
        }
        if (this.ooh.msgType == 1)
        {
          paramf.wEp = new SKBuiltinBuffer_t().setBuffer(this.ooh.bNw().getBytes());
          paramf.wEr = this.ooh.cde;
          paramf.wEo = 0;
          paramf.wEq = 0;
          paramf.wEu = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
          paramf.wEt = 0;
          paramf.wEs = 0;
          paramf.wEv = 0;
          paramf.wEw = 0;
          label2317: j = a(parame, this.ehh, this);
          AppMethodBeat.o(22739);
        }
        else
        {
          ab.d("MicroMsg.NetSceneMasSend", "error msgtype:" + this.ooh.msgType);
          this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
          AppMethodBeat.o(22739);
          j = -1;
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22740);
    ab.d("MicroMsg.NetSceneMasSend", "onGYNetEnd  errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd FAILED errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22740);
    }
    while (true)
    {
      return;
      if (this.ooh == null)
      {
        ab.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd Get INFO FAILED :");
        this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(22740);
      }
      else if ((this.ooh.status != 104) && (this.ooh.status != 103))
      {
        ab.e("MicroMsg.NetSceneMasSend", "ERR: onGYNetEnd STATUS ERR: status:" + this.ooh.status);
        this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(22740);
      }
      else
      {
        paramArrayOfByte = (baq)this.ehh.fsH.fsP;
        paramq = (bap)this.ehh.fsG.fsP;
        if ((paramq.wEs > 0) && (paramq.wEu != null) && (paramq.wEu.getBuffer() != null) && (!bo.cb(paramq.wEu.getBuffer().toByteArray())) && (paramq.wEt != paramArrayOfByte.wEt - paramq.wEu.getILen()))
        {
          ab.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Thumb ");
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          this.ehi.onSceneEnd(3, -1, "doScene failed", this);
          AppMethodBeat.o(22740);
        }
        else if ((paramq.wEr > 0) && (paramq.wEp != null) && (paramq.wEp.getBuffer() != null) && (!bo.cb(paramq.wEp.getBuffer().toByteArray())) && (paramq.wEq != paramArrayOfByte.wEq - paramq.wEp.getILen()))
        {
          ab.e("MicroMsg.NetSceneMasSend", "onGYNetEnd Err Data ");
          this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
          this.ehi.onSceneEnd(3, -1, "doScene failed", this);
          AppMethodBeat.o(22740);
        }
        else
        {
          this.ooh.fXb = bo.anT();
          paramInt1 = this.ooh.status;
          if (paramInt1 == 103)
          {
            paramArrayOfByte = this.ooh;
            paramInt1 = paramq.wEt;
            paramArrayOfByte.fWZ = (paramq.wEu.getILen() + paramInt1);
            if (this.ooh.fWZ >= this.ooh.ood)
              this.ooh.status = 199;
          }
          while (true)
            if (this.ooh.status != 199)
            {
              if (a(this.ftf, this.ehi) != -1)
                break label1532;
              this.retCode = (0 - (com.tencent.mm.compatible.util.g.getLine() + 10000));
              this.ehi.onSceneEnd(3, -1, "doScene failed", this);
              AppMethodBeat.o(22740);
              break;
              if (paramInt1 == 104)
              {
                paramArrayOfByte = this.ooh;
                paramInt1 = paramq.wEq;
                paramArrayOfByte.ooc = (paramq.wEp.getILen() + paramInt1);
                if (this.ooh.ooc >= this.ooh.cde)
                  if (this.ooh.ood > 0)
                    this.ooh.status = 103;
                  else
                    this.ooh.status = 199;
              }
              else
              {
                ab.e("MicroMsg.NetSceneMasSend", "onGYNetEnd ERROR STATUS:".concat(String.valueOf(paramInt1)));
                this.retCode = (0 - com.tencent.mm.compatible.util.g.getLine() - 10000);
                this.ehi.onSceneEnd(3, -1, "doScene failed", this);
                AppMethodBeat.o(22740);
                break;
              }
            }
          paramArrayOfByte = h.bNE();
          a locala = this.ooh;
          if (locala != null)
          {
            locala.bJt = -1;
            ContentValues localContentValues = new ContentValues();
            if ((locala.bJt & 0x1) != 0)
              localContentValues.put("clientid", locala.bNv());
            if ((locala.bJt & 0x2) != 0)
              localContentValues.put("status", Integer.valueOf(locala.status));
            if ((locala.bJt & 0x4) != 0)
              localContentValues.put("createtime", Long.valueOf(locala.createTime));
            if ((locala.bJt & 0x8) != 0)
              localContentValues.put("lastmodifytime", Long.valueOf(locala.fXb));
            if ((locala.bJt & 0x10) != 0)
              localContentValues.put("filename", locala.bNw());
            if ((locala.bJt & 0x20) != 0)
              localContentValues.put("thumbfilename", locala.bNx());
            if ((locala.bJt & 0x40) != 0)
              localContentValues.put("tolist", locala.bNy());
            if ((locala.bJt & 0x80) != 0)
              localContentValues.put("tolistcount", Integer.valueOf(locala.ooa));
            if ((locala.bJt & 0x100) != 0)
              localContentValues.put("msgtype", Integer.valueOf(locala.msgType));
            if ((locala.bJt & 0x200) != 0)
              localContentValues.put("mediatime", Integer.valueOf(locala.oob));
            if ((locala.bJt & 0x400) != 0)
              localContentValues.put("datanetoffset", Integer.valueOf(locala.ooc));
            if ((locala.bJt & 0x800) != 0)
              localContentValues.put("datalen", Integer.valueOf(locala.cde));
            if ((locala.bJt & 0x1000) != 0)
              localContentValues.put("thumbnetoffset", Integer.valueOf(locala.fWZ));
            if ((locala.bJt & 0x2000) != 0)
              localContentValues.put("thumbtotallen", Integer.valueOf(locala.ood));
            if ((locala.bJt & 0x4000) != 0)
              localContentValues.put("reserved1", Integer.valueOf(locala.videoSource));
            if ((locala.bJt & 0x8000) != 0)
              localContentValues.put("reserved2", Integer.valueOf(locala.ooe));
            if ((locala.bJt & 0x10000) != 0)
            {
              if (locala.fng != null)
                break label1480;
              paramq = "";
              label1266: localContentValues.put("reserved3", paramq);
            }
            if ((locala.bJt & 0x20000) != 0)
            {
              if (locala.fnh != null)
                break label1490;
              paramq = "";
              label1301: localContentValues.put("reserved4", paramq);
            }
            if ((int)paramArrayOfByte.fni.insert("massendinfo", "clientid", localContentValues) != -1)
            {
              aw.ZK();
              if (com.tencent.mm.model.c.XR().aoZ("masssendapp") != null)
                break label1500;
              paramInt1 = 1;
              label1352: paramq = new ak();
              paramq.setUsername("masssendapp");
              paramq.setContent(b.a(locala));
              paramq.eD(locala.createTime);
              paramq.hO(0);
              paramq.hM(0);
              if (paramInt1 == 0)
                break label1505;
              aw.ZK();
              com.tencent.mm.model.c.XR().d(paramq);
              label1420: paramArrayOfByte.doNotify();
            }
          }
          if (this.eOm != null);
          for (long l = this.eOm.Mr(); ; l = 0L)
          {
            ab.d("MicroMsg.NetSceneMasSend", "!!!FIN: useTime:".concat(String.valueOf(l)));
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(22740);
            break;
            label1480: paramq = locala.fng;
            break label1266;
            label1490: paramq = locala.fnh;
            break label1301;
            label1500: paramInt1 = 0;
            break label1352;
            label1505: aw.ZK();
            com.tencent.mm.model.c.XR().a(paramq, "masssendapp");
            break label1420;
          }
          label1532: AppMethodBeat.o(22740);
        }
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 2500;
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    return m.b.ftu;
  }

  public final void cancel()
  {
    this.eVT = true;
  }

  public final int getType()
  {
    return 193;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.f
 * JD-Core Version:    0.6.2
 */