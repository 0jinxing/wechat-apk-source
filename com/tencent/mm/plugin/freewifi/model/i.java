package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ce;
import com.tencent.mm.protocal.protobuf.cf;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private String csB;
  private final b ehh;
  private f ehi;

  private i()
  {
    AppMethodBeat.i(20734);
    b.a locala = new b.a();
    locala.fsJ = new ce();
    locala.fsK = new cf();
    locala.uri = "/cgi-bin/mmo2o-bin/addcontact";
    locala.fsI = 1703;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(20734);
  }

  public i(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this();
    AppMethodBeat.i(20735);
    this.csB = paramString1;
    ce localce = (ce)this.ehh.fsG.fsP;
    localce.vEn = paramString1;
    localce.Url = paramString2;
    localce.vAM = paramInt;
    localce.vAN = paramString3;
    ab.i("MicroMsg.FreeWifi.NetSceneAddContact", "appid = %s", new Object[] { paramString1 });
    AppMethodBeat.o(20735);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(20737);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(20737);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(20736);
    ab.i("MicroMsg.FreeWifi.NetSceneAddContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.csB });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(20736);
  }

  public final int getType()
  {
    return 1703;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.i
 * JD-Core Version:    0.6.2
 */