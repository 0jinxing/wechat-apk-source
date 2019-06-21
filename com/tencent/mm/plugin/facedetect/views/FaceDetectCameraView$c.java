package com.tencent.mm.plugin.facedetect.views;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class FaceDetectCameraView$c
  implements FaceDetectCameraView.b
{
  n mam;
  Camera.PreviewCallback man;
  private d.b mao;

  private FaceDetectCameraView$c(FaceDetectCameraView paramFaceDetectCameraView)
  {
    AppMethodBeat.i(584);
    this.mam = null;
    this.man = new Camera.PreviewCallback()
    {
      public final void onPreviewFrame(byte[] paramAnonymousArrayOfByte, Camera paramAnonymousCamera)
      {
        AppMethodBeat.i(581);
        ab.v("MicroMsg.FaceDetectCameraView", "hy: on preview callback");
        com.tencent.mm.plugin.facedetect.model.d.bsq().aS(paramAnonymousArrayOfByte);
        AppMethodBeat.o(581);
      }
    };
    this.mao = new FaceDetectCameraView.c.4(this);
    this.mam = new n(paramFaceDetectCameraView.getContext());
    FaceDetectCameraView.a(paramFaceDetectCameraView, -1L);
    FaceDetectCameraView.d(paramFaceDetectCameraView);
    AppMethodBeat.o(584);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(585);
    FaceDetectCameraView.a(this.mai, paramc);
    while (true)
    {
      synchronized (FaceDetectCameraView.e(this.mai))
      {
        if (this.mam == null)
        {
          ab.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
          AppMethodBeat.o(585);
          return;
        }
        if (this.mam.lUE)
        {
          ab.w("MicroMsg.FaceDetectCameraView", "hy: already previewed. return");
          FaceDetectCameraView.f(this.mai);
          AppMethodBeat.o(585);
          continue;
        }
        FaceDetectCameraView.g(this.mai);
        if (FaceDetectCameraView.h(this.mai))
          break label184;
        if (this.mai.isAvailable())
        {
          ab.i("MicroMsg.FaceDetectCameraView", "hy: already available. manually call available");
          this.mai.onSurfaceTextureAvailable(this.mai.getSurfaceTexture(), this.mai.getWidth(), this.mai.getHeight());
          AppMethodBeat.o(585);
        }
      }
      ab.w("MicroMsg.FaceDetectCameraView", "hy: not initialized yet. do after init");
      AppMethodBeat.o(585);
      continue;
      label184: com.tencent.mm.sdk.g.d.post(new FaceDetectCameraView.c.1(this, bo.yz()), "FaceDetectCameraView_Camera");
      AppMethodBeat.o(585);
    }
  }

  public final void btG()
  {
    AppMethodBeat.i(587);
    if (!FaceDetectCameraView.m(this.mai))
    {
      FaceDetectCameraView.b(this.mai, true);
      com.tencent.mm.sdk.g.d.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(580);
          synchronized (FaceDetectCameraView.e(FaceDetectCameraView.c.this.mai))
          {
            if (FaceDetectCameraView.c.this.mam == null)
              AppMethodBeat.o(580);
            while (true)
            {
              return;
              ab.d("MicroMsg.FaceDetectCameraView", "hy: closeCamera");
              FaceDetectCameraView.c.this.mam.setPreviewCallback(null);
              com.tencent.mm.plugin.facedetect.model.d locald = com.tencent.mm.plugin.facedetect.model.d.bsq();
              synchronized (com.tencent.mm.plugin.facedetect.model.d.mLock)
              {
                if (locald.lTC != null)
                  locald.lTC.clear();
                if (FaceDetectCameraView.l(FaceDetectCameraView.c.this.mai) != null)
                  FaceDetectCameraView.l(FaceDetectCameraView.c.this.mai).release();
                FaceDetectCameraView.c.this.mam.release();
                FaceDetectCameraView.c.this.mam = null;
                ab.d("MicroMsg.FaceDetectCameraView", "hy: scanCamera.release() done");
                FaceDetectCameraView.b(FaceDetectCameraView.c.this.mai, false);
                AppMethodBeat.o(580);
              }
            }
          }
        }
      }
      , "FaceDetectCameraView_Camera");
    }
    AppMethodBeat.o(587);
  }

  public final Point btH()
  {
    AppMethodBeat.i(593);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      Point localPoint = this.mam.lUM;
      AppMethodBeat.o(593);
      return localPoint;
    }
  }

  public final void btr()
  {
    AppMethodBeat.i(592);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      if ((this.mam != null) && (this.mam.lUE))
      {
        com.tencent.mm.plugin.facedetect.model.d.bsq().b(this.mao);
        if (!FaceDetectCameraView.n(this.mai))
          FaceDetectCameraView.a(this.mai, null);
      }
      AppMethodBeat.o(592);
      return;
    }
  }

  public final int getPreviewHeight()
  {
    AppMethodBeat.i(589);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      int i = this.mam.getPreviewHeight();
      AppMethodBeat.o(589);
      return i;
    }
  }

  public final int getPreviewWidth()
  {
    AppMethodBeat.i(588);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      int i = this.mam.getPreviewWidth();
      AppMethodBeat.o(588);
      return i;
    }
  }

  public final int getRotation()
  {
    AppMethodBeat.i(590);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      int i = this.mam.lUJ;
      AppMethodBeat.o(590);
      return i;
    }
  }

  public final void im(long paramLong)
  {
    AppMethodBeat.i(591);
    while (true)
    {
      synchronized (FaceDetectCameraView.e(this.mai))
      {
        if (this.mam == null)
        {
          ab.w("MicroMsg.FaceDetectCameraView", "hy: camera is null. return");
          AppMethodBeat.o(591);
          return;
        }
        ab.i("MicroMsg.FaceDetectCameraView", "hy: start capturing. tween: %d", new Object[] { Long.valueOf(paramLong) });
        FaceDetectCameraView.b(this.mai, paramLong);
        if (!FaceDetectCameraView.q(this.mai))
        {
          if ((this.mam != null) && (this.mam.lUE))
          {
            ab.i("MicroMsg.FaceDetectCameraView", "hy: is previewing. directly start capture");
            FaceDetectCameraView.a(this.mai, false);
            com.tencent.mm.plugin.facedetect.model.d.bsq().a(this.mao);
            FaceDetectCameraView.r(this.mai);
            AppMethodBeat.o(591);
            continue;
          }
          ab.i("MicroMsg.FaceDetectCameraView", "hy: not previewed yet. wait");
          FaceDetectCameraView.a(this.mai, true);
        }
      }
      ab.w("MicroMsg.FaceDetectCameraView", "hy: already scanning");
    }
  }

  public final void stopPreview()
  {
    AppMethodBeat.i(586);
    synchronized (FaceDetectCameraView.e(this.mai))
    {
      if ((this.mam != null) && (this.mam.lUE))
      {
        n localn = this.mam;
        if (localn.erH != null)
        {
          localn.erH.stopPreview();
          localn.lUE = false;
          com.tencent.mm.plugin.facedetect.model.c.lTA.WY();
        }
      }
      AppMethodBeat.o(586);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.c
 * JD-Core Version:    0.6.2
 */