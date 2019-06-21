package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.t;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.xn;
import com.tencent.mm.protocal.protobuf.xo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class e extends m
  implements k
{
  private static aq fYY;
  private static List<c> fYZ;
  private String cIS;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private String fYX;
  private boolean fZa;
  private boolean fZb;
  public String fileName;
  private ap frk;
  public int retCode;

  static
  {
    AppMethodBeat.i(116576);
    fYY = null;
    fYZ = new ArrayList();
    AppMethodBeat.o(116576);
  }

  public e(p paramp)
  {
    AppMethodBeat.i(116570);
    this.retCode = 0;
    this.fZa = false;
    this.fZb = false;
    this.frk = new ap(new e.2(this), false);
    if (paramp != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      this.fileName = paramp.fileName;
      if (this.fileName == null)
        break label134;
    }
    label134: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.fYX = paramp.fYX;
      this.cIS = paramp.cIS;
      ab.i("MicroMsg.NetSceneDownloadVoice", "NetSceneDownloadVoice:  file[%s] voiceFormat[%s] user[%s]", new Object[] { this.fileName, this.fYX, this.cIS });
      AppMethodBeat.o(116570);
      return;
      bool = false;
      break;
    }
  }

  public static void a(aq paramaq)
  {
    if (fYY == null)
      fYY = paramaq;
  }

  public static void a(c paramc)
  {
    AppMethodBeat.i(116567);
    if (!fYZ.contains(paramc))
      fYZ.add(paramc);
    AppMethodBeat.o(116567);
  }

  public static void b(c paramc)
  {
    AppMethodBeat.i(116568);
    fYZ.remove(paramc);
    AppMethodBeat.o(116568);
  }

  private void doNotify()
  {
    AppMethodBeat.i(116569);
    bi localbi = q.uV(this.fileName);
    if (localbi != null)
    {
      if (fYY != null)
        fYY.a(localbi);
      Iterator localIterator = fYZ.iterator();
      while (localIterator.hasNext())
        al.d(new e.1(this, (c)localIterator.next(), localbi));
    }
    AppMethodBeat.o(116569);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = -1;
    AppMethodBeat.i(116571);
    this.ehi = paramf;
    if (this.fileName == null)
    {
      ab.e("MicroMsg.NetSceneDownloadVoice", "doScene:  filename null!");
      this.retCode = (g.getLine() + 10000);
      AppMethodBeat.o(116571);
    }
    while (true)
    {
      return i;
      paramf = q.uW(this.fileName);
      if ((paramf == null) || (!paramf.amd()))
      {
        ab.e("MicroMsg.NetSceneDownloadVoice", "Get info Failed file:" + this.fileName);
        this.retCode = (g.getLine() + 10000);
        AppMethodBeat.o(116571);
      }
      else
      {
        ab.i("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.fileName + " netTimes:" + paramf.fXf);
        if (!q.uM(this.fileName))
        {
          ab.e("MicroMsg.NetSceneDownloadVoice", "checkVoiceNetTimes Failed file:" + this.fileName);
          q.um(this.fileName);
          this.retCode = (g.getLine() + 10000);
          AppMethodBeat.o(116571);
        }
        else
        {
          int j = paramf.fVG - paramf.fWY;
          if (j <= 0)
          {
            if (paramf.status == 5)
            {
              this.fZb = true;
              ab.e("MicroMsg.NetSceneDownloadVoice", "doScene file:" + this.fileName + " Net:" + paramf.fVG + " Local:" + paramf.fWY);
              this.retCode = (g.getLine() + 10000);
              AppMethodBeat.o(116571);
            }
            else
            {
              q.a(this.fileName, paramf.fWY, null);
              this.retCode = (g.getLine() + 10000);
              AppMethodBeat.o(116571);
            }
          }
          else
          {
            if (paramf.frO == paramf.fVG)
              this.fZa = true;
            Object localObject = new b.a();
            ((b.a)localObject).fsJ = new xn();
            ((b.a)localObject).fsK = new xo();
            ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/downloadvoice";
            ((b.a)localObject).fsI = 128;
            ((b.a)localObject).fsL = 20;
            ((b.a)localObject).fsM = 1000000020;
            this.ehh = ((b.a)localObject).acD();
            localObject = (xn)this.ehh.fsG.fsP;
            ((xn)localObject).vFF = paramf.clientId;
            ((xn)localObject).ptF = paramf.cKK;
            ((xn)localObject).wdn = j;
            ((xn)localObject).vOq = paramf.fWY;
            if (t.kH(this.cIS))
            {
              ((xn)localObject).vEf = this.cIS;
              ((xn)localObject).wdo = paramf.gah;
            }
            ab.i("MicroMsg.NetSceneDownloadVoice", "doScene req.ClientMsgId:%s req.MsgId:%d req.NewMsgId:%d, req.Length:%d req.Offset:%d req.ChatRoomName:%s req.MasterBufId %d", new Object[] { ((xn)localObject).vFF, Integer.valueOf(((xn)localObject).ptD), Long.valueOf(((xn)localObject).ptF), Integer.valueOf(((xn)localObject).wdn), Integer.valueOf(((xn)localObject).vOq), ((xn)localObject).vEf, Long.valueOf(((xn)localObject).wdo) });
            i = a(parame, this.ehh, this);
            AppMethodBeat.o(116571);
          }
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116575);
    ab.i("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (xo)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramArrayOfByte.wdq == 1)
    {
      ab.v("MicroMsg.NetSceneDownloadVoice", this.fileName + " cancelFlag = 1");
      q.uR(this.fileName);
      AppMethodBeat.o(116575);
    }
    while (true)
    {
      return;
      if (paramInt3 == -22)
      {
        q.um(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116575);
      }
      else if ((paramInt2 == 4) && (paramInt3 != 0))
      {
        h.pYm.a(111L, 231L, 1L, false);
        q.um(this.fileName);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116575);
      }
      else if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        h.pYm.a(111L, 230L, 1L, false);
        ab.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " resp:" + paramq.ZS().vyl);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116575);
      }
      else
      {
        ab.d("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + " Recv:" + paramArrayOfByte.ptz.getILen() + " fileOff:" + paramArrayOfByte.vOq);
        if (paramArrayOfByte.ptz.getBuffer() == null)
        {
          ab.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd get recv Buffer null");
          q.um(this.fileName);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(116575);
        }
        else
        {
          paramq = paramArrayOfByte.ptz.getBuffer().toByteArray();
          if (paramq.length == 0)
          {
            ab.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Recv Buf ZERO length ");
            q.um(this.fileName);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(116575);
          }
          else
          {
            paramInt1 = q.aY(this.fYX, this.fileName).write(paramq, paramq.length, paramArrayOfByte.vOq);
            if (paramInt1 < 0)
            {
              ab.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd Write Failed File:" + this.fileName + " ret:" + paramInt1);
              q.um(this.fileName);
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
              AppMethodBeat.o(116575);
            }
            else
            {
              q.c(this.fileName, paramq, paramq.length);
              ab.i("MicroMsg.NetSceneDownloadVoice", "OnRecvEnd : file:" + this.fileName + " filesize:" + paramInt1 + " voiceFormat:" + this.fYX);
              paramInt1 = q.a(this.fileName, paramInt1, null);
              if (paramInt1 < 0)
              {
                h.pYm.a(111L, 229L, 1L, false);
                ab.e("MicroMsg.NetSceneDownloadVoice", "onGYNetEnd file:" + this.fileName + "updateAfterRecv Ret:" + paramInt1);
                this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
                AppMethodBeat.o(116575);
              }
              else if (paramInt1 == 1)
              {
                doNotify();
                this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
                AppMethodBeat.o(116575);
              }
              else
              {
                long l = 1000L;
                if (this.fZa)
                  l = 0L;
                this.frk.ae(l, l);
                AppMethodBeat.o(116575);
              }
            }
          }
        }
      }
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(116573);
    h.pYm.a(111L, 233L, 1L, false);
    q.um(this.fileName);
    AppMethodBeat.o(116573);
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(116574);
    boolean bool = super.acJ();
    if (bool)
      h.pYm.a(111L, 232L, 1L, false);
    AppMethodBeat.o(116574);
    return bool;
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    AppMethodBeat.i(116572);
    paramq = (xn)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    if ((paramq.ptF == 0L) || (paramq.vFF == null) || (paramq.vFF.length() == 0) || (paramq.wdn <= 0) || (paramq.vOq < 0))
    {
      q.um(this.fileName);
      paramq = m.b.ftv;
      AppMethodBeat.o(116572);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(116572);
    }
  }

  public final int getType()
  {
    return 128;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.e
 * JD-Core Version:    0.6.2
 */