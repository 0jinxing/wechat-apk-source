package com.tencent.mm.plugin.voip_cs.c;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends com.tencent.mm.plugin.voip.video.a
{
  public a(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }

  public final void cMB()
  {
    AppMethodBeat.i(135436);
    try
    {
      Camera.Size localSize;
      d locald;
      if (this.sZv != null)
      {
        localSize = this.sZv.getPreviewSize();
        locald = c.cMg();
        if (!this.sZy)
          break label107;
      }
      label107: for (int i = 1; ; i = 0)
      {
        this.sZv.getPreviewFrameRate();
        int j = this.sZL;
        int k = this.sZM;
        int m = localSize.width;
        int n = localSize.height;
        ab.d("MicroMsg.VoipCSReportHelper", "setCameraInfo");
        locald.tcW = i;
        locald.tcS = j;
        locald.tcT = k;
        locald.tcU = m;
        locald.tcV = n;
        AppMethodBeat.o(135436);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.CSCaptureRender", "getCameraDataForVoipCS failed" + localException.getMessage());
        AppMethodBeat.o(135436);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.c.a
 * JD-Core Version:    0.6.2
 */