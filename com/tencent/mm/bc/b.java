package com.tencent.mm.bc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cks;
import com.tencent.mm.protocal.protobuf.ckt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.File;

public final class b extends m
  implements k
{
  private String clientId;
  private int coc;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public String fNa;
  private int frO;
  private String imgPath;
  private String username;

  private b(String paramString)
  {
    AppMethodBeat.i(136858);
    this.username = paramString;
    this.frO = 0;
    this.coc = 0;
    paramString = new StringBuilder();
    g.RN();
    this.clientId = (com.tencent.mm.kernel.a.QF() + System.currentTimeMillis());
    AppMethodBeat.o(136858);
  }

  public b(String paramString1, String paramString2)
  {
    this(paramString1);
    this.imgPath = paramString2;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = -1;
    AppMethodBeat.i(136860);
    this.ehi = paramf;
    if ((this.imgPath == null) || (this.imgPath.length() == 0))
    {
      ab.e("MicroMsg.NetSceneUploadCardImg", "imgPath is null or length = 0");
      AppMethodBeat.o(136860);
    }
    while (true)
    {
      return i;
      if (!com.tencent.mm.a.e.ct(this.imgPath))
      {
        ab.e("MicroMsg.NetSceneUploadCardImg", "The img does not exist, imgPath = " + this.imgPath);
        AppMethodBeat.o(136860);
      }
      else
      {
        if (this.frO == 0)
          this.frO = ((int)new File(this.imgPath).length());
        paramf = new b.a();
        paramf.fsJ = new cks();
        paramf.fsK = new ckt();
        paramf.uri = "/cgi-bin/micromsg-bin/uploadcardimg";
        paramf.fsI = 575;
        paramf.fsL = 0;
        paramf.fsM = 0;
        this.ehh = paramf.acD();
        int j = Math.min(this.frO - this.coc, 32768);
        byte[] arrayOfByte = com.tencent.mm.a.e.e(this.imgPath, this.coc, j);
        if (arrayOfByte == null)
        {
          ab.e("MicroMsg.NetSceneUploadCardImg", "readFromFile error");
          AppMethodBeat.o(136860);
        }
        else
        {
          ab.i("MicroMsg.NetSceneUploadCardImg", "doScene uploadLen:%d, total: %d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(this.frO) });
          paramf = (cks)this.ehh.fsG.fsP;
          paramf.wcP = this.username;
          paramf.ptw = this.frO;
          paramf.ptx = this.coc;
          paramf.ptz = new SKBuiltinBuffer_t().setBuffer(arrayOfByte);
          paramf.pty = paramf.ptz.getILen();
          paramf.ptv = this.clientId;
          i = a(parame, this.ehh, this);
          AppMethodBeat.o(136860);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136861);
    ab.d("MicroMsg.NetSceneUploadCardImg", "onGYNetEnd:%s, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneUploadCardImg", "upload card img error");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(136861);
    }
    while (true)
    {
      return;
      paramq = (ckt)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      this.fNa = paramq.wGv;
      this.coc = paramq.ptx;
      if (this.coc < this.frO)
      {
        if (a(this.ftf, this.ehi) < 0)
        {
          ab.e("MicroMsg.NetSceneUploadCardImg", "doScene again failed");
          this.ehi.onSceneEnd(3, -1, "", this);
        }
        ab.d("MicroMsg.NetSceneUploadCardImg", "doScene again");
        AppMethodBeat.o(136861);
      }
      else
      {
        if (!bo.isNullOrNil(this.fNa))
        {
          paramq = ((j)g.K(j.class)).XM().aoO(this.username);
          if ((paramq != null) && ((int)paramq.ewQ > 0) && (com.tencent.mm.n.a.jh(paramq.field_type)))
          {
            paramq.iY(this.fNa);
            ((j)g.K(j.class)).XM().b(this.username, paramq);
          }
        }
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(136861);
      }
    }
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(136859);
    if ((this.imgPath == null) || (this.imgPath.length() == 0))
    {
      paramq = m.b.ftv;
      AppMethodBeat.o(136859);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(136859);
    }
  }

  public final int getType()
  {
    return 575;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bc.b
 * JD-Core Version:    0.6.2
 */