package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Random;

public final class u extends m
  implements k
{
  private String cJb;
  private int coc;
  private b ehh;
  private f ehi;
  private g fEW;
  public String filePath;
  private int frO;

  public u(String paramString1, String paramString2, g paramg)
  {
    AppMethodBeat.i(67988);
    this.filePath = null;
    this.coc = 0;
    this.frO = 0;
    this.filePath = paramString1;
    this.cJb = (paramString2 + "_" + System.nanoTime() + "_" + Math.abs(new Random().nextInt() / 2));
    this.fEW = paramg;
    ab.i("MicroMsg.NetSceneUploadFie", "msgId: %s, filePath: %s", new Object[] { this.cJb, this.filePath });
    AppMethodBeat.o(67988);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = -1;
    AppMethodBeat.i(67991);
    this.ehi = paramf;
    if (bo.isNullOrNil(this.filePath))
    {
      ab.e("MicroMsg.NetSceneUploadFie", "doScene, filePath is null");
      AppMethodBeat.o(67991);
    }
    while (true)
    {
      return i;
      if (!com.tencent.mm.vfs.e.ct(this.filePath))
      {
        ab.e("MicroMsg.NetSceneUploadFie", "doScene, file: %s not exist", new Object[] { this.filePath });
        AppMethodBeat.o(67991);
      }
      else
      {
        if (this.frO == 0)
        {
          this.frO = ((int)com.tencent.mm.vfs.e.asZ(this.filePath));
          ab.i("MicroMsg.NetSceneUploadFie", "doScene, totalLen: %d", new Object[] { Integer.valueOf(this.frO) });
        }
        int j = Math.min(this.frO - this.coc, 32768);
        ab.i("MicroMsg.NetSceneUploadFie", "doScene, startPos: %d, dataLen: %d", new Object[] { Integer.valueOf(this.coc), Integer.valueOf(j) });
        paramf = com.tencent.mm.vfs.e.e(this.filePath, this.coc, j);
        if (paramf == null)
        {
          ab.e("MicroMsg.NetSceneUploadFie", "doScene, read file buf is null");
          AppMethodBeat.o(67991);
        }
        else
        {
          ab.i("MicroMsg.NetSceneUploadFie", "doScene, buf.length: %d", new Object[] { Integer.valueOf(paramf.length) });
          Object localObject = new b.a();
          ((b.a)localObject).fsJ = new ag();
          ((b.a)localObject).fsK = new ah();
          ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadfile";
          ((b.a)localObject).fsI = 484;
          ((b.a)localObject).fsL = 0;
          ((b.a)localObject).fsM = 0;
          this.ehh = ((b.a)localObject).acD();
          localObject = (ag)this.ehh.fsG.fsP;
          ((ag)localObject).ptv = this.cJb;
          ((ag)localObject).ptw = this.frO;
          ((ag)localObject).ptx = this.coc;
          ((ag)localObject).pty = j;
          ((ag)localObject).ptz = aa.ad(paramf);
          i = a(parame, this.ehh, this);
          ab.i("MicroMsg.NetSceneUploadFie", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(67991);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67989);
    ab.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(67989);
    }
    while (true)
    {
      return;
      paramArrayOfByte = (ah)((b)paramq).fsH.fsP;
      paramq = paramArrayOfByte.ptv;
      ab.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, clientId: %s, totalLen: %d, attachId: %s", new Object[] { paramArrayOfByte.ptv, Integer.valueOf(paramArrayOfByte.ptw), paramArrayOfByte.ptE });
      if (!paramq.equals(this.cJb))
      {
        AppMethodBeat.o(67989);
      }
      else
      {
        this.coc = paramArrayOfByte.ptx;
        if (this.coc < this.frO)
        {
          ab.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.coc), Integer.valueOf(this.frO) });
          if (a(this.ftf, this.ehi) < 0)
          {
            ab.e("MicroMsg.NetSceneUploadFie", "continue to upload fail");
            if (this.ehi != null)
              this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            if (this.fEW != null)
              this.fEW.a(this.coc, this.frO, this);
            AppMethodBeat.o(67989);
          }
        }
        else
        {
          paramq = paramArrayOfByte.ptE;
          ab.i("MicroMsg.NetSceneUploadFie", "onGYNetEnd, finish upload, startPos: %d, totalLen: %d, attachId: %s", new Object[] { Integer.valueOf(this.coc), Integer.valueOf(this.frO), paramq });
          if (this.ehi != null)
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          if (this.fEW != null)
            this.fEW.a(this.coc, this.frO, this);
          AppMethodBeat.o(67989);
        }
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 640;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(67990);
    if ((bo.isNullOrNil(this.filePath)) || (!com.tencent.mm.vfs.e.ct(this.filePath)))
    {
      ab.e("MicroMsg.NetSceneUploadFie", "securityVerificationChecked failed, file not exist");
      paramq = m.b.ftv;
      AppMethodBeat.o(67990);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(67990);
    }
  }

  public final ah ccv()
  {
    if (this.ehh != null);
    for (ah localah = (ah)this.ehh.fsH.fsP; ; localah = null)
      return localah;
  }

  public final int getType()
  {
    return 484;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.u
 * JD-Core Version:    0.6.2
 */