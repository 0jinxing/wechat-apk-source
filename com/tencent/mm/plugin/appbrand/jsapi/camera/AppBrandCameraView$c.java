package com.tencent.mm.plugin.appbrand.jsapi.camera;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.camera.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.camera.a.c.a;
import com.tencent.mm.plugin.appbrand.jsapi.camera.a.d;
import com.tencent.mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.concurrent.atomic.AtomicBoolean;

final class AppBrandCameraView$c
  implements AppBrandCameraView.a, c.a
{
  private int duration;
  private c hGQ;
  AtomicBoolean hGR;
  private int hGS;

  private AppBrandCameraView$c(AppBrandCameraView paramAppBrandCameraView)
  {
    AppMethodBeat.i(130928);
    this.hGR = new AtomicBoolean(false);
    this.hGS = 200;
    this.duration = this.hGS;
    AppMethodBeat.o(130928);
  }

  public final void aDd()
  {
    AppMethodBeat.i(130932);
    ab.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, takePicture err");
    AppMethodBeat.o(130932);
  }

  public final void aDm()
  {
    AppMethodBeat.i(130933);
    ab.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, startRecord err");
    AppMethodBeat.o(130933);
  }

  public final void aDn()
  {
    AppMethodBeat.i(130934);
    ab.e("MicroMsg.AppBrandCameraView", "ScanCodeMode, safeStopRecord err");
    AppMethodBeat.o(130934);
  }

  public final void b(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(130931);
    if (this.hGR.compareAndSet(false, true))
    {
      al.n(new AppBrandCameraView.c.1(this), this.duration);
      ab.d("MicroMsg.AppBrandCameraView", "resultText:%s, resultType:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    }
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.AppBrandCameraView", "resultType:%d is not support, ignore");
      AppMethodBeat.o(130931);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      h.a(AppBrandCameraView.b(this.hGO), this.hGO.getCameraId(), "qrcode", paramString, paramArrayOfByte);
      AppMethodBeat.o(130931);
      continue;
      h.a(AppBrandCameraView.b(this.hGO), this.hGO.getCameraId(), "barcode", paramString, paramArrayOfByte);
      AppMethodBeat.o(130931);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(130929);
    this.hGQ = new d();
    this.hGQ.init();
    this.hGQ.hHx = this;
    AppBrandCameraView.a(this.hGO, 4);
    if (AppBrandCameraView.x(this.hGO) > 0)
      this.duration = (1000 / AppBrandCameraView.x(this.hGO));
    AppMethodBeat.o(130929);
  }

  public final void q(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130930);
    if (this.hGR.get())
    {
      ab.d("MicroMsg.AppBrandCameraView", "[onFrameData] isScanPause, return");
      AppMethodBeat.o(130930);
    }
    while (true)
    {
      return;
      if ((this.hGQ != null) && (AppBrandCameraView.f(this.hGO) != null))
        this.hGQ.a(paramArrayOfByte, paramInt1, paramInt2, AppBrandCameraView.y(this.hGO), AppBrandCameraView.f(this.hGO).getCameraRotation());
      AppMethodBeat.o(130930);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(130935);
    if (this.hGQ != null)
      this.hGQ.release();
    AppMethodBeat.o(130935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView.c
 * JD-Core Version:    0.6.2
 */