package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.js;
import com.tencent.mm.protocal.protobuf.jt;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private String ltA;
  private long ltB;
  private String ltC;
  private long ltD;

  public m(long paramLong1, String paramString1, String paramString2, long paramLong2)
  {
    this.ltB = paramLong1;
    this.ltC = paramString1;
    this.ltA = paramString2;
    this.ltD = paramLong2;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(19318);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new js();
    paramf.fsK = new jt();
    paramf.uri = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
    paramf.fsI = 1262;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (js)this.ehh.fsG.fsP;
    paramf.mac = com.tencent.mm.plugin.exdevice.j.b.jdMethod_if(this.ltB);
    paramf.vMh = this.ltC;
    paramf.vMg = this.ltA;
    paramf.vMi = this.ltD;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19318);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19317);
    ab.i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    jt localjt;
    asq localasq;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localjt = (jt)this.ehh.fsH.fsP;
      localasq = localjt.vLi;
      paramArrayOfByte = null;
      paramq = null;
      if (localasq != null)
      {
        paramArrayOfByte = localasq.jBE;
        paramq = localasq.vIk;
      }
      ab.d("MicroMsg.NetSceneBindUnauthDevice", "unauth bind deviceId = %s, deviceType = %s", new Object[] { paramArrayOfByte, paramq });
      if (ad.boW().dT(paramq, paramArrayOfByte) == null)
        break label291;
      boolean bool = ad.boW().dU(paramArrayOfByte, paramq);
      ab.i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramq, Boolean.valueOf(bool) });
      if (!bool)
        break label308;
      paramInt1 = 1;
    }
    while (true)
    {
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      paramq.field_connProto = this.ltA;
      paramq.field_connStrategy = 1;
      paramq.field_closeStrategy = 1;
      paramq.field_url = "";
      f.a(paramq, localasq, localjt.vLj);
      if (paramq.field_mac == 0L)
      {
        ab.d("MicroMsg.NetSceneBindUnauthDevice", "onSceneEnd, mac of hardDeviceAttr is 0 so set a local mac.");
        paramq.field_mac = this.ltB;
      }
      if (paramInt1 != 0)
        ad.boW().b(paramq);
      while (true)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(19317);
        return;
        label291: paramInt1 = 1;
        break;
        ad.boW().e(paramq);
      }
      label308: paramInt1 = 0;
    }
  }

  public final int getType()
  {
    return 1262;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.m
 * JD-Core Version:    0.6.2
 */