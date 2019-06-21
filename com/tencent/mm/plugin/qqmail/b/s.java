package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Random;

public final class s extends m
  implements k
{
  private String cEV;
  private String clientId;
  private int coc;
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private com.tencent.mm.ai.g fEW;
  private int frO;
  private String puA;
  private int puB;
  private String puz;

  public s(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt, com.tencent.mm.ai.g paramg)
  {
    AppMethodBeat.i(67981);
    this.puz = null;
    this.frO = 0;
    this.clientId = null;
    this.coc = 0;
    this.puB = 0;
    this.puz = paramString1;
    this.puB = paramInt;
    this.fEW = paramg;
    if (!bo.isNullOrNil(paramString1))
    {
      this.clientId = (com.tencent.mm.a.g.x(paramString1.getBytes()) + "_" + System.nanoTime() + "_" + new Random().nextInt());
      this.frO = paramString1.getBytes().length;
      this.coc = 0;
    }
    if (!bo.isNullOrNil(paramString2))
      this.cEV = paramString2;
    if (paramArrayOfString != null)
    {
      this.puA = "";
      int i = paramArrayOfString.length;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        paramString1 = paramArrayOfString[paramInt];
        this.puA = (this.puA + paramString1 + ",");
      }
      this.puA = this.puA.substring(0, this.puA.length() - 1);
    }
    ab.i("MicroMsg.NetSceneComposeSend", "NetSceneComposeSend, clientId: %s, totalLen: %d", new Object[] { this.clientId, Integer.valueOf(this.frO) });
    AppMethodBeat.o(67981);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(67984);
    this.ehi = paramf;
    int i;
    if (bo.isNullOrNil(this.puz))
    {
      ab.e("MicroMsg.NetSceneComposeSend", "doScene, sendContent is null");
      AppMethodBeat.o(67984);
      i = -1;
    }
    while (true)
    {
      return i;
      int j = Math.min(this.frO - this.coc, 32768);
      ab.i("MicroMsg.NetSceneComposeSend", "doScene, dataLen: %d", new Object[] { Integer.valueOf(j) });
      paramf = new byte[j];
      Object localObject = this.puz.getBytes();
      i = this.coc;
      int k = 0;
      while (i < this.coc + j)
      {
        paramf[k] = ((byte)localObject[i]);
        k++;
        i++;
      }
      if (bo.cb(paramf))
      {
        ab.e("MicroMsg.NetSceneComposeSend", "doScene, sendData is null");
        AppMethodBeat.o(67984);
        i = -1;
      }
      else
      {
        localObject = new b.a();
        ((b.a)localObject).fsJ = new e();
        ((b.a)localObject).fsK = new f();
        ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/composesend";
        ((b.a)localObject).fsI = 485;
        ((b.a)localObject).fsL = 0;
        ((b.a)localObject).fsM = 0;
        this.ehh = ((b.a)localObject).acD();
        localObject = (e)this.ehh.fsG.fsP;
        ((e)localObject).ptv = this.clientId;
        ((e)localObject).ptw = this.frO;
        ((e)localObject).ptx = this.coc;
        ((e)localObject).pty = j;
        ((e)localObject).ptA = this.cEV;
        ((e)localObject).ptB = this.puA;
        ((e)localObject).ptC = ((int)(this.frO + this.puB * 1.333333F));
        ab.i("MicroMsg.NetSceneComposeSend", "doScene, realSize: %d", new Object[] { Integer.valueOf(((e)localObject).ptC) });
        ((e)localObject).ptz = aa.ad(paramf);
        i = a(parame, this.ehh, this);
        ab.i("MicroMsg.NetSceneComposeSend", "doScene, ret: %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(67984);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67983);
    ab.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(67983);
    }
    while (true)
    {
      return;
      this.coc = ((f)((b)paramq).fsH.fsP).ptx;
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (this.fEW != null)
        this.fEW.a(this.coc, this.frO, this);
      if (this.coc < this.frO)
      {
        ab.i("MicroMsg.NetSceneComposeSend", "onGYNetEnd, startPos: %d, totalLen: %d, continue to upload", new Object[] { Integer.valueOf(this.coc), Integer.valueOf(this.frO) });
        if (a(this.ftf, this.ehi) < 0)
        {
          ab.e("MicroMsg.NetSceneComposeSend", "continue to upload fail");
          AppMethodBeat.o(67983);
        }
      }
      else
      {
        ab.i("MicroMsg.NetSceneComposeSend", "finished upload");
        AppMethodBeat.o(67983);
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(67982);
    if (bo.isNullOrNil(this.puz))
    {
      ab.e("MicroMsg.NetSceneComposeSend", "securityVerificationChecked failed, content is null");
      paramq = m.b.ftv;
      AppMethodBeat.o(67982);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(67982);
    }
  }

  public final int getType()
  {
    return 485;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.s
 * JD-Core Version:    0.6.2
 */