package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.asx;
import com.tencent.mm.protocal.protobuf.asy;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k
{
  private f eIc;
  private String lst;
  private com.tencent.mm.ai.b ltG;

  public s(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(19335);
    this.eIc = null;
    this.ltG = null;
    this.lst = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new asx();
    ((b.a)localObject).fsK = new asy();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/device/subscribestatus";
    ((b.a)localObject).fsI = 1090;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ltG = ((b.a)localObject).acD();
    localObject = (asx)this.ltG.fsG.fsP;
    ((asx)localObject).vKe = com.tencent.mm.bt.b.akB(paramString2);
    ((asx)localObject).vKc = com.tencent.mm.bt.b.akB(paramString3);
    ((asx)localObject).nbk = paramInt;
    this.lst = paramString1;
    AppMethodBeat.o(19335);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19337);
    this.eIc = paramf;
    int i = a(parame, this.ltG, this);
    AppMethodBeat.o(19337);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19336);
    ab.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    ad.boW().Kv(this.lst);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramInt1 = ((asy)this.ltG.fsH.fsP).getBaseResponse().Ret;
      ab.i("MicroMsg.exdevice.NetSceneHardDeviceStatusSubscribe", "HardDeviceStatusSubResponse: ret=" + paramInt1 + ",msg=" + paramString);
    }
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19336);
  }

  public final int getType()
  {
    return 1090;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.s
 * JD-Core Version:    0.6.2
 */