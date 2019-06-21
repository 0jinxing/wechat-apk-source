package com.tencent.mm.bf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clg;
import com.tencent.mm.protocal.protobuf.clh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends m
  implements k
{
  private int aTg;
  private b ehh;
  f ehi;
  private String fQv;
  private int fQw;
  int fQx;
  private int fQy;
  private String filemd5;
  String filename;
  ap frk;
  private int sampleRate;

  public a(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(116535);
    this.fQv = null;
    this.filemd5 = null;
    this.filename = null;
    this.sampleRate = 0;
    this.fQw = 0;
    this.aTg = 0;
    this.fQx = 0;
    this.fQy = 5;
    this.frk = new ap(new a.1(this), true);
    this.fQv = bo.anU();
    this.filename = paramString;
    this.fQy = paramInt1;
    this.sampleRate = paramInt2;
    this.fQw = paramInt3;
    this.aTg = paramInt4;
    paramInt1 = (int)com.tencent.mm.vfs.e.asZ(this.filename);
    this.filemd5 = com.tencent.mm.a.g.x(com.tencent.mm.vfs.e.e(this.filename, 0, paramInt1));
    AppMethodBeat.o(116535);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = 3960;
    AppMethodBeat.i(116536);
    this.ehi = paramf;
    int j = (int)com.tencent.mm.vfs.e.asZ(this.filename);
    ab.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.fQx + "this.filemd5 " + this.filemd5);
    if (j <= 0)
    {
      ab.e("MicroMsg.NetSceneUploadMedia", "read failed :" + this.filename);
      AppMethodBeat.o(116536);
      i = -1;
      return i;
    }
    int k = j - this.fQx;
    if (k > 3960);
    while (true)
    {
      ab.i("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " filelen:" + j + " oldoff:" + this.fQx + "  canReadLen " + i);
      paramf = com.tencent.mm.vfs.e.e(this.filename, this.fQx, i);
      if (paramf == null)
      {
        ab.e("MicroMsg.NetSceneUploadMedia", "read data error");
        AppMethodBeat.o(116536);
        i = -1;
        break;
      }
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new clg();
      ((b.a)localObject).fsK = new clh();
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmuploadmedia";
      ((b.a)localObject).fsI = 240;
      ((b.a)localObject).fsL = 111;
      ((b.a)localObject).fsM = 1000000111;
      this.ehh = ((b.a)localObject).acD();
      localObject = (clg)this.ehh.fsG.fsP;
      ((clg)localObject).xiT = new bts().alV(this.fQv);
      ((clg)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
      ((clg)localObject).pty = paramf.length;
      ((clg)localObject).xiU = new bts().alV(this.filemd5);
      ((clg)localObject).ptw = j;
      ((clg)localObject).ptx = this.fQx;
      ((clg)localObject).nda = this.fQy;
      ((clg)localObject).xiV = 1;
      ((clg)localObject).xiW = this.sampleRate;
      ((clg)localObject).xiX = this.fQw;
      ((clg)localObject).xiY = this.aTg;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(116536);
      break;
      i = k;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116537);
    ab.d("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (clg)((b)paramq).fsG.fsP;
    paramq = ((clh)((b)paramq).fsH.fsP).fKk;
    ab.i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", new Object[] { this.filename, paramq, Integer.valueOf(paramArrayOfByte.ptw), Integer.valueOf(paramArrayOfByte.pty), Integer.valueOf(paramArrayOfByte.ptx) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneUploadMedia", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116537);
    }
    while (true)
    {
      return;
      if ((paramArrayOfByte.ptw <= paramArrayOfByte.pty + paramArrayOfByte.ptx) && (paramq != null) && (!paramq.equals("0")))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(116537);
      }
      else
      {
        paramInt1 = paramArrayOfByte.ptx;
        this.fQx = (paramArrayOfByte.ptz.getILen() + paramInt1);
        ab.d("MicroMsg.NetSceneUploadMedia", "onGYNetEnd file:" + this.filename + " delay:500");
        this.frk.ae(500L, 500L);
        AppMethodBeat.o(116537);
      }
    }
  }

  public final int acn()
  {
    return 60;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 240;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bf.a
 * JD-Core Version:    0.6.2
 */