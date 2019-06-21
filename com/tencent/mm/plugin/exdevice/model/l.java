package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.protocal.protobuf.jk;
import com.tencent.mm.protocal.protobuf.jl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class l extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;

  public l(String paramString, int paramInt)
  {
    AppMethodBeat.i(19314);
    this.ehi = null;
    this.ehh = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new jk();
    ((b.a)localObject).fsK = new jl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindharddevice";
    ((b.a)localObject).fsI = 536;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (jk)this.ehh.fsG.fsP;
    ((jk)localObject).vKK = bo.nullAsNil(paramString);
    ((jk)localObject).vLh = bo.h(Integer.valueOf(paramInt));
    AppMethodBeat.o(19314);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(19316);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19316);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19315);
    ab.i("MicroMsg.exdevice.NetSceneBindHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    label290: long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = boP();
      ab.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDevice : DeviceIdServer = %s, DeviceType = %s", new Object[] { paramArrayOfByte.vLi.jBE, paramArrayOfByte.vLi.vIk });
      String str1 = paramArrayOfByte.vLj.vHO;
      String str2 = paramArrayOfByte.vLj.wwm;
      String str3 = paramArrayOfByte.vLj.vKF;
      String str4 = paramArrayOfByte.vLj.wwn;
      paramInt1 = paramArrayOfByte.vLj.wwo;
      if (paramArrayOfByte.vEq != 0)
        break label464;
      paramq = "sync";
      ab.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s", new Object[] { str1, str2, str3, str4, Integer.valueOf(paramInt1), paramq });
      paramInt1 = 0;
      if (ad.boW().dT(paramArrayOfByte.vLj.wwm, paramArrayOfByte.vLi.jBE) == null)
        break label472;
      boolean bool = ad.boW().dU(paramArrayOfByte.vLi.jBE, paramArrayOfByte.vLj.wwm);
      ab.i("MicroMsg.exdevice.NetSceneBindHardDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramArrayOfByte.vLj.wwm, Boolean.valueOf(bool) });
      if (bool)
        paramInt1 = 1;
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      f.a(paramq, paramArrayOfByte.vLi, paramArrayOfByte.vLj);
      paramq.field_url = "";
      paramArrayOfByte = u.bpx().hT(paramq.field_mac);
      if ((paramArrayOfByte != null) && (paramArrayOfByte.cxs == 2))
      {
        ab.i("MicroMsg.exdevice.NetSceneBindHardDevice", "before do bind netscene, stop the channel now");
        ad.bpd();
        d.hH(paramq.field_mac);
        paramArrayOfByte = u.bpx();
        l = paramq.field_mac;
        if (!paramArrayOfByte.lwJ.containsKey(Long.valueOf(l)))
          break label477;
        paramArrayOfByte.lwJ.remove(Long.valueOf(l));
        ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "remove the device from map : %d", new Object[] { Long.valueOf(l) });
      }
      label430: if (paramInt1 == 0)
        break label501;
      ad.boW().b(paramq);
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(19315);
      return;
      label464: paramq = "async";
      break;
      label472: paramInt1 = 1;
      break label290;
      label477: ab.i("MicroMsg.exdevice.ExdeviceInfoManager", "device id not contains in the map : %d", new Object[] { Long.valueOf(l) });
      break label430;
      label501: ad.boW().e(paramq);
    }
  }

  public final jl boP()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (jl localjl = (jl)this.ehh.fsH.fsP; ; localjl = null)
      return localjl;
  }

  public final int getType()
  {
    return 536;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.l
 * JD-Core Version:    0.6.2
 */