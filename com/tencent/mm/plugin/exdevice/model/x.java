package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.cjc;
import com.tencent.mm.protocal.protobuf.cjd;
import com.tencent.mm.sdk.platformtools.ab;

public final class x extends com.tencent.mm.ai.m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public asq ltI;

  public x(asq paramasq, int paramInt)
  {
    AppMethodBeat.i(19350);
    this.ltI = paramasq;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjc();
    ((b.a)localObject).fsK = new cjd();
    ((b.a)localObject).fsI = 537;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/unbindharddevice";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cjc)this.ehh.fsG.fsP;
    ((cjc)localObject).vLi = paramasq;
    ((cjc)localObject).vEq = paramInt;
    AppMethodBeat.o(19350);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19351);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19351);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19352);
    ab.i("MicroMsg.exdevice.NetSceneUnBindHardDevice", "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = i.lto;
    i.hN(0L);
    paramq = ad.boW().Kv(this.ltI.jBE);
    if (paramq != null)
    {
      if ((u.bpy().lqX != null) && (!u.bpy().lqX.hZ(paramq.field_mac)))
        ab.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "stopChannel Failed!!!");
      if (!ad.boW().dU(this.ltI.jBE, this.ltI.vIk))
        ab.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "deleteByDeviceId Failed!!!");
      if ((paramInt2 != 0) || (paramInt3 != 0))
        ab.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "scene.getType() = %s", new Object[] { Integer.valueOf(537) });
      if ((this.ehh == null) || (this.ehh.fsH.fsP == null))
        break label257;
    }
    label257: for (paramq = (cjd)this.ehh.fsH.fsP; ; paramq = null)
    {
      if (paramq == null)
        ab.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "UnbindHardDevice resp or req is null");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(19352);
      return;
      ab.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", new Object[] { this.ltI.jBE });
      break;
    }
  }

  public final int getType()
  {
    return 537;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.x
 * JD-Core Version:    0.6.2
 */