package com.tencent.mm.plugin.account.security.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cjz;
import com.tencent.mm.protocal.protobuf.cka;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends m
  implements k
{
  public String ceI;
  public String cws;
  public String deviceName;
  private b ehh;
  private f ehi;

  public c(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(69831);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjz();
    ((b.a)localObject).fsK = new cka();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/updatesafedevice";
    ((b.a)localObject).fsI = 361;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.ceI = paramString1;
    this.deviceName = paramString2;
    this.cws = paramString3;
    localObject = (cjz)this.ehh.fsG.fsP;
    ((cjz)localObject).wcI = paramString1;
    ((cjz)localObject).Name = paramString2;
    ((cjz)localObject).vIk = paramString3;
    AppMethodBeat.o(69831);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(69833);
    int i;
    if ((bo.isNullOrNil(this.ceI)) || (bo.isNullOrNil(this.deviceName)) || (bo.isNullOrNil(this.cws)))
    {
      ab.e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
      i = -1;
      AppMethodBeat.o(69833);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(69833);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(69832);
    ab.i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(69832);
  }

  public final int getType()
  {
    return 361;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.c
 * JD-Core Version:    0.6.2
 */