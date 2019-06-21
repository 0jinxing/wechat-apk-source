package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.a.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.protocal.protobuf.vq;
import com.tencent.mm.protocal.protobuf.vr;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class h extends com.tencent.mm.plugin.exdevice.a.a<vq, vr>
{
  private final WeakReference<b<h>> lqU;
  String username;

  public h(String paramString, b<h> paramb)
  {
    AppMethodBeat.i(19450);
    this.username = paramString;
    this.lqU = new WeakReference(paramb);
    AppMethodBeat.o(19450);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19451);
    ab.d("MicroMsg.NetSceneDelFollow", "hy: del follow end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    super.a(paramInt1, paramInt2, paramInt3, paramString, paramq, paramArrayOfByte);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ad.boY().Kq(this.username);
    paramq = (b)this.lqU.get();
    if (paramq != null)
      paramq.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19451);
  }

  public final int getType()
  {
    return 1792;
  }

  public final String getUri()
  {
    return "/cgi-bin/mmoc-bin/hardware/delfollow";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.h
 * JD-Core Version:    0.6.2
 */