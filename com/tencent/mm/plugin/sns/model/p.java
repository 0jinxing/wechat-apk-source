package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cax;
import com.tencent.mm.protocal.protobuf.cay;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.OutputStream;

public final class p extends m
  implements k
{
  String cHr;
  private com.tencent.mm.ai.b ehh;
  public f ehi;
  private String filename;
  private OutputStream output;
  private String qJc;
  private int qJd;
  int qJe;
  private boolean qJf;
  private String qJg;
  private bau qJh;

  public p(bau parambau, String paramString1, String paramString2, int paramInt1, boolean paramBoolean, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(36264);
    this.cHr = "";
    this.output = null;
    this.qJd = -1;
    this.qJe = -1;
    this.qJf = true;
    this.qJg = null;
    this.cHr = paramString1;
    this.qJh = parambau;
    this.qJf = paramBoolean;
    this.qJd = paramInt1;
    this.qJe = paramInt2;
    this.qJg = paramString3;
    this.qJc = an.fZ(af.getAccSnsPath(), paramString1);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cax();
    ((b.a)localObject).fsK = new cay();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnsdownload";
    ((b.a)localObject).fsI = 208;
    ((b.a)localObject).fsL = 96;
    ((b.a)localObject).fsM = 1000000096;
    this.ehh = ((b.a)localObject).acD();
    cax localcax = (cax)this.ehh.fsG.fsP;
    r localr = af.cnu().Zi(paramString1);
    localObject = localr;
    if (localr == null)
      localObject = new r();
    ((r)localObject).rfH = paramString1;
    ((r)localObject).offset = 0;
    af.cnu().a(paramString1, (r)localObject);
    if (paramBoolean);
    for (this.filename = i.n(parambau); ; this.filename = i.m(parambau))
    {
      com.tencent.mm.vfs.e.tf(this.qJc);
      com.tencent.mm.vfs.e.deleteFile(an.fZ(af.getAccSnsPath(), paramString1) + this.filename);
      localcax.xac = paramString2;
      localcax.xad = 0;
      localcax.ptx = 0;
      localcax.ptw = 0;
      localcax.jCt = this.qJd;
      ab.d("MicroMsg.NetSceneSnsDownload", "requestKey ".concat(String.valueOf(paramString3)));
      AppMethodBeat.o(36264);
      return;
    }
  }

  private int R(byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(36268);
    if (!i.Xn(af.getAccPath()))
      AppMethodBeat.o(36268);
    while (true)
    {
      return i;
      try
      {
        if (this.output == null)
        {
          com.tencent.mm.vfs.e.tf(this.qJc);
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          this.output = com.tencent.mm.vfs.e.L(this.qJc + this.filename, false);
        }
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("appendBuf ");
        ab.d("MicroMsg.NetSceneSnsDownload", paramArrayOfByte.length);
        this.output.write(paramArrayOfByte);
        aco();
        i = paramArrayOfByte.length;
        AppMethodBeat.o(36268);
      }
      catch (IOException paramArrayOfByte)
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("appendBuf failed: ");
        ab.printErrStackTrace("MicroMsg.NetSceneSnsDownload", paramArrayOfByte, this.filename, new Object[0]);
        aco();
        i = -1;
        AppMethodBeat.o(36268);
      }
      finally
      {
        aco();
        AppMethodBeat.o(36268);
      }
    }
    throw paramArrayOfByte;
  }

  private void aco()
  {
    AppMethodBeat.i(36269);
    try
    {
      if (this.output != null)
      {
        this.output.flush();
        this.output.close();
        this.output = null;
      }
      AppMethodBeat.o(36269);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneSnsDownload", localIOException, "", new Object[0]);
        AppMethodBeat.o(36269);
      }
    }
  }

  private void onError()
  {
    AppMethodBeat.i(36267);
    af.cnA().XG(this.qJg);
    AppMethodBeat.o(36267);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(36265);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36265);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36266);
    ab.d("MicroMsg.NetSceneSnsDownload", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (b.c)paramq.ZS();
    paramq = (cay)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramArrayOfByte.vyl != 0)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      af.cnA().XG(this.qJg);
      AppMethodBeat.o(36266);
    }
    while (true)
    {
      return;
      paramArrayOfByte = af.cnu().Zi(this.cHr);
      if (paramq.ptw <= 0)
      {
        ab.e("MicroMsg.NetSceneSnsDownload", "error 1");
        onError();
        AppMethodBeat.o(36266);
      }
      else if (paramq.vJd == null)
      {
        ab.e("MicroMsg.NetSceneSnsDownload", "error 2");
        onError();
        AppMethodBeat.o(36266);
      }
      else if ((paramq.ptx < 0) || (paramq.ptx + paramq.vJd.getBuffer().wR.length > paramq.ptw))
      {
        ab.e("MicroMsg.NetSceneSnsDownload", "error 3");
        onError();
        AppMethodBeat.o(36266);
      }
      else if (paramq.ptx != paramArrayOfByte.offset)
      {
        ab.e("MicroMsg.NetSceneSnsDownload", "error 4");
        onError();
        AppMethodBeat.o(36266);
      }
      else
      {
        paramInt1 = R(paramq.vJd.getBuffer().toByteArray());
        if (paramInt1 < 0)
        {
          ab.e("MicroMsg.NetSceneSnsDownload", "error 5");
          onError();
          AppMethodBeat.o(36266);
        }
        else
        {
          paramArrayOfByte.offset += paramInt1;
          paramArrayOfByte.rfD = paramq.ptw;
          ab.d("MicroMsg.NetSceneSnsDownload", "byteLen " + paramInt1 + "  totalLen " + paramq.ptw);
          af.cnu().a(this.cHr, paramArrayOfByte);
          if ((paramArrayOfByte.offset == paramArrayOfByte.rfD) && (paramArrayOfByte.rfD != 0))
          {
            paramInt1 = 1;
            label420: if (paramInt1 == 0)
              break label674;
            ab.d("MicroMsg.NetSceneSnsDownload", "downLoad ok");
            if (this.qJe != 1)
              break label561;
            paramq = i.e(this.qJh);
            label449: paramArrayOfByte = an.fZ(af.getAccSnsPath(), this.cHr);
            com.tencent.mm.vfs.e.deleteFile(paramArrayOfByte + paramq);
            com.tencent.mm.vfs.e.h(paramArrayOfByte, this.filename, paramq);
            if (!this.qJf)
              break label573;
            s.b(paramArrayOfByte, paramq, i.f(this.qJh), af.cnN());
          }
          while (true)
          {
            af.cnA().XG(this.qJg);
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(36266);
            break;
            paramInt1 = 0;
            break label420;
            label561: paramq = i.l(this.qJh);
            break label449;
            label573: String str = i.e(this.qJh);
            if (!com.tencent.mm.vfs.e.ct(paramArrayOfByte + str))
              s.a(paramArrayOfByte, paramq, str, af.cnO());
            str = i.f(this.qJh);
            if (!com.tencent.mm.vfs.e.ct(paramArrayOfByte + str))
              s.b(paramArrayOfByte, paramq, str, af.cnN());
          }
          label674: a(this.ftf, this.ehi);
          AppMethodBeat.o(36266);
        }
      }
    }
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 208;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.p
 * JD-Core Version:    0.6.2
 */