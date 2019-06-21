package com.tencent.mm.plugin.facedetect.views;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetect.model.c;
import com.tencent.mm.plugin.facedetect.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class FaceDetectCameraView$c$1
  implements Runnable
{
  FaceDetectCameraView$c$1(FaceDetectCameraView.c paramc, long paramLong)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(579);
    synchronized (FaceDetectCameraView.e(this.mar.mai))
    {
      ab.i("MicroMsg.FaceDetectCameraView", "hy: enter worker thread. using %d ms", new Object[] { Long.valueOf(bo.az(this.maq)) });
      long l1 = bo.yz();
      Object localObject2;
      if (this.mar.mam == null)
      {
        ab.e("MicroMsg.FaceDetectCameraView", "hy: already released");
        if (FaceDetectCameraView.i(this.mar.mai) != null)
        {
          localObject2 = new com/tencent/mm/plugin/facedetect/views/FaceDetectCameraView$c$1$1;
          ((FaceDetectCameraView.c.1.1)localObject2).<init>(this);
          al.d((Runnable)localObject2);
        }
        AppMethodBeat.o(579);
      }
      while (true)
      {
        return;
        try
        {
          localObject2 = this.mar.mam;
          int j = FaceDetectCameraView.j(this.mar.mai);
          int k = FaceDetectCameraView.k(this.mar.mai);
          Object localObject4 = new android/graphics/Point;
          ((Point)localObject4).<init>(j, k);
          ((n)localObject2).lUG = ((Point)localObject4);
          localObject2 = this.mar.mam;
          if ((((n)localObject2).erH != null) && (((n)localObject2).lUL));
          while (true)
          {
            if (i == 0)
              this.mar.mam.f(FaceDetectCameraView.l(this.mar.mai));
            localObject2 = this.mar.mam.lUF;
            FaceDetectCameraView.a(this.mar.mai, (Point)localObject2);
            localObject2 = this.mar.mam;
            localObject4 = FaceDetectCameraView.l(this.mar.mai);
            long l2 = bo.yz();
            if ((((n)localObject2).erH != null) && (!((n)localObject2).lUE))
            {
              if (localObject4 != null)
              {
                ab.i("MicroMsg.FaceScanCamera", "hy: SurfaceTexture is not null");
                ((n)localObject2).erH.setPreviewTexture((SurfaceTexture)localObject4);
              }
              c.ea(((n)localObject2).getPreviewWidth(), ((n)localObject2).getPreviewHeight());
              ((n)localObject2).erH.startPreview();
              ((n)localObject2).lUE = true;
              ab.d("MicroMsg.FaceScanCamera", "startPreview done costTime=[%s]", new Object[] { Long.valueOf(bo.az(l2)) });
            }
            this.mar.mam.setPreviewCallback(this.mar.man);
            if (FaceDetectCameraView.i(this.mar.mai) != null)
            {
              localObject2 = new com/tencent/mm/plugin/facedetect/views/FaceDetectCameraView$c$1$2;
              ((FaceDetectCameraView.c.1.2)localObject2).<init>(this);
              al.d((Runnable)localObject2);
            }
            ab.i("MicroMsg.FaceDetectCameraView", "hy: opened and start preview. use: %d ms", new Object[] { Long.valueOf(bo.az(l1)) });
            FaceDetectCameraView.f(this.mar.mai);
            AppMethodBeat.o(579);
            break;
            i = 0;
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.FaceDetectCameraView", localException, "hy: exception caused", new Object[0]);
          if (FaceDetectCameraView.i(this.mar.mai) != null)
          {
            FaceDetectCameraView.c.1.3 local3 = new com/tencent/mm/plugin/facedetect/views/FaceDetectCameraView$c$1$3;
            local3.<init>(this);
            al.d(local3);
          }
          AppMethodBeat.o(579);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.c.1
 * JD-Core Version:    0.6.2
 */