package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.ipcall.b.c;
import com.tencent.mm.protocal.protobuf.bma;
import com.tencent.mm.protocal.protobuf.bmb;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private b ehh;
  private f ehi;
  public bma nyw;
  public bmb nyx;

  public i(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21860);
    this.ehh = null;
    this.nyw = null;
    this.nyx = null;
    this.ehi = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bma();
    ((b.a)localObject).fsK = new bmb();
    ((b.a)localObject).fsI = 991;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/pstninvite";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    long l = System.currentTimeMillis();
    int i = c.bIP();
    localObject = (bma)this.ehh.fsG.fsP;
    ((bma)localObject).ndG = r.Yz();
    ((bma)localObject).wOR = paramString2;
    ((bma)localObject).ndF = paramString1;
    ((bma)localObject).wOQ = paramInt1;
    ((bma)localObject).vZF = i;
    ((bma)localObject).wOZ = 1;
    ((bma)localObject).wOP = l;
    ((bma)localObject).wOY = paramInt2;
    ((bma)localObject).wPa = paramInt3;
    this.nyw = ((bma)localObject);
    ab.i("MicroMsg.NetSceneIPCallInvite", "toUsername: %s, phoneNumber: %s, invitedId: %s, netType: %d, dialScene: %d, countryType: %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(21860);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21861);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21861);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21862);
    ab.i("MicroMsg.NetSceneIPCallInvite", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyx = ((bmb)((b)paramq).fsH.fsP);
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(21862);
    }
    while (true)
    {
      return;
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(21862);
    }
  }

  public final int getType()
  {
    return 991;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.i
 * JD-Core Version:    0.6.2
 */