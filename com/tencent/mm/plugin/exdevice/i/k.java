package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.s;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends ae
  implements f
{
  private int kWt = -1;
  private String lst = null;
  private String lsu = null;
  private String lxI = null;

  public k(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this.lst = paramString1;
    this.lxI = paramString2;
    this.lsu = paramString3;
    this.kWt = paramInt;
  }

  public final boolean a(com.tencent.mm.plugin.exdevice.service.m paramm, d paramd)
  {
    AppMethodBeat.i(19744);
    ab.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "execute MMWifiStatusSubscribeTaskExcuter. brandName=" + this.lst + ",deviceType=" + this.lxI + ",deviceId=" + this.lsu + ",reqType=" + this.kWt);
    aw.Rg().a(1090, this);
    paramm = new s(this.lst, this.lxI, this.lsu, this.kWt);
    aw.Rg().a(paramm, 0);
    AppMethodBeat.o(19744);
    return false;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(19743);
    ab.i("MicroMsg.exdevice.MMWifiStatusSubscribeTaskExcuter", "onSceneEnd. errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    aw.Rg().b(1090, this);
    AppMethodBeat.o(19743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.k
 * JD-Core Version:    0.6.2
 */