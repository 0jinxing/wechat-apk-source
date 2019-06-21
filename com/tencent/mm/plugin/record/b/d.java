package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.rh;
import com.tencent.mm.protocal.protobuf.ri;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class d extends m
  implements k
{
  private b ehh;
  private f ehi;
  private d.a pJk;

  public d(String paramString1, String paramString2, String paramString3, int paramInt, d.a parama)
  {
    AppMethodBeat.i(135642);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new rh();
    ((b.a)localObject).fsK = new ri();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkmd5";
    ((b.a)localObject).fsI = 939;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (rh)this.ehh.fsG.fsP;
    ((rh)localObject).fileid = paramString1;
    ((rh)localObject).cvZ = paramString2;
    ((rh)localObject).vYy = paramString3;
    ((rh)localObject).vYz = paramInt;
    this.pJk = parama;
    ab.i("MicroMsg.NetSceneCheckMd5", "summersafecdn NetSceneCheckMd5 fileid[%s], md5[%s], newmd5[%s], crc[%d], stack[%s]", new Object[] { ((rh)localObject).fileid, ((rh)localObject).cvZ, ((rh)localObject).vYy, Integer.valueOf(((rh)localObject).vYz), bo.dpG() });
    AppMethodBeat.o(135642);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(135643);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135643);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135644);
    ab.i("MicroMsg.NetSceneCheckMd5", "summersafecdn onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.pJk != null)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
        break label91;
      paramString = this.pJk;
    }
    while (true)
      for (paramq = ""; ; paramq = paramq.aeskey)
      {
        paramString.ae(paramq, paramInt2, paramInt3);
        AppMethodBeat.o(135644);
        return;
        label91: paramq = (ri)((b)paramq).fsH.fsP;
        paramString = this.pJk;
        if (paramq == null)
          break;
      }
  }

  public final int getType()
  {
    return 939;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.d
 * JD-Core Version:    0.6.2
 */