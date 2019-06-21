package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asu;
import com.tencent.mm.protocal.protobuf.bwh;
import com.tencent.mm.protocal.protobuf.bwi;
import com.tencent.mm.sdk.platformtools.ab;

public final class w extends m
  implements k
{
  private com.tencent.mm.ai.f eIc;
  String ltH;
  public com.tencent.mm.ai.b lty;

  public w(long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(19347);
    this.lty = null;
    this.eIc = null;
    ab.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", new Object[] { paramString1, paramString2, Long.valueOf(paramLong2), Long.valueOf(paramLong3), Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
    this.ltH = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwh();
    ((b.a)localObject).fsK = new bwi();
    ((b.a)localObject).fsI = 538;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendharddevicemsg";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (bwh)this.lty.fsG.fsP;
    asq localasq = new asq();
    localasq.vIk = paramString1;
    localasq.jBE = paramString2;
    ((bwh)localObject).vLi = localasq;
    paramString1 = new asu();
    paramString1.wwE = paramLong2;
    paramString1.pcX = ((int)paramLong3);
    paramString1.vJd = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    paramString1.jCt = paramInt;
    ((bwh)localObject).wWW = paramString1;
    if (paramLong1 != 0L)
    {
      ((bwh)localObject).wwz = new SKBuiltinBuffer_t().setBuffer(u.bpx().o(paramLong1, 2));
      AppMethodBeat.o(19347);
    }
    while (true)
    {
      return;
      paramString1 = ad.boW().Kv(paramString2);
      if (paramString1 != null)
        ((bwh)localObject).wwz = new SKBuiltinBuffer_t().setBuffer(paramString1.field_sessionBuf);
      AppMethodBeat.o(19347);
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(19349);
    this.eIc = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(19349);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19348);
    ab.i("MicroMsg.exdevice.NetSceneSendHardDeviceMsg", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19348);
  }

  public final int getType()
  {
    return 538;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.w
 * JD-Core Version:    0.6.2
 */