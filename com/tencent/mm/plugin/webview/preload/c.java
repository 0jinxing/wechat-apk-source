package com.tencent.mm.plugin.webview.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class c
{
  public long endTime;
  public int exv = 0;
  public int scene;
  public long startTime;
  public int upJ = 0;
  public int upK = 0;
  public int upL = 0;

  public final void IF()
  {
    AppMethodBeat.i(80444);
    long l = this.endTime - this.startTime;
    String str;
    if (at.isWifi(ah.getContext()))
      str = "wifi";
    while (true)
    {
      ab.d("MicroMsg.Preload.Kv15871", "scene:%d, requestCount:%d, responseContentUpdateCount:%d, responseContentNotUpdateCount:%d, costTime:%d responseContentTotalSize:%d, netWorkType:%s", new Object[] { Integer.valueOf(this.scene), Integer.valueOf(this.exv), Integer.valueOf(this.upJ), Integer.valueOf(this.upK), Long.valueOf(l), Integer.valueOf(this.upL), str });
      h.pYm.e(15871, new Object[] { Integer.valueOf(this.scene), Integer.valueOf(this.exv), Integer.valueOf(this.upJ), Integer.valueOf(this.upK), Long.valueOf(l), Integer.valueOf(this.upL), str });
      AppMethodBeat.o(80444);
      return;
      if (at.is4G(ah.getContext()))
        str = "4g";
      else if (at.is3G(ah.getContext()))
        str = "3g";
      else if (at.is2G(ah.getContext()))
        str = "2g";
      else
        str = "none";
    }
  }

  public final void IV(int paramInt)
  {
    this.upL += paramInt;
  }

  public final void cYQ()
  {
    this.upJ += 1;
  }

  public final void cYR()
  {
    this.upK += 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.c
 * JD-Core Version:    0.6.2
 */