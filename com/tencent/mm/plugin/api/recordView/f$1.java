package com.tencent.mm.plugin.api.recordView;

import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView.d;
import com.tencent.mm.plugin.mmsight.model.e;
import com.tencent.mm.plugin.video.b;
import com.tencent.mm.sdk.platformtools.ab;

final class f$1
  implements b
{
  f$1(f paramf)
  {
  }

  public final void e(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(76338);
    if (this.gMl.gLL.a(paramSurfaceTexture, this.gMl.gLM, this.gMl.gLO, this.gMl.gLV) < 0)
    {
      ab.e("MicroMsg.MMSightRecordViewImpl", "start preview failed!");
      if (this.gMl.gMd != null)
        this.gMl.gMd.aDo();
    }
    if (this.gMl.gLX != -1)
      this.gMl.ass();
    this.gMl.gLL.bPn();
    this.gMl.asp();
    this.gMl.asA();
    if (this.gMl.gMi != null)
      this.gMl.gMi.a(this.gMl.gLS.fag);
    ab.i("MicroMsg.MMSightRecordViewImpl", "do start preview after texture available");
    AppMethodBeat.o(76338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.f.1
 * JD-Core Version:    0.6.2
 */