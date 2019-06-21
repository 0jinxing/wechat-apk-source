package com.tencent.mm.plugin.exdevice.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.protocal.protobuf.ub;
import com.tencent.mm.protocal.protobuf.uc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public final class a extends com.tencent.mm.plugin.exdevice.a.a<ub, uc>
{
  String appId;
  String ceI;
  String cws;
  String lqT;
  private WeakReference<b<a>> lqU;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, b<a> paramb)
  {
    AppMethodBeat.i(19067);
    this.ceI = bo.nullAsNil(paramString1);
    this.cws = bo.nullAsNil(paramString2);
    this.lqT = bo.nullAsNil(paramString3);
    this.appId = bo.nullAsNil(paramString4);
    this.lqU = new WeakReference(paramb);
    AppMethodBeat.o(19067);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19068);
    ab.d("MicroMsg.NetSceneConnectedRouter", "ap: connected router end. errType: %d, errCode: %d, errMsg: %s, resp: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramq.toString() });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    paramq = (b)this.lqU.get();
    if (paramq != null)
      paramq.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19068);
  }

  public final int getType()
  {
    return 1799;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/mydevice/connectedrouter";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.a.a
 * JD-Core Version:    0.6.2
 */