package com.tencent.mm.plugin.facedetect.views;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

final class FaceDetectCameraView$a extends ak
{
  private WeakReference<FaceDetectCameraView> Nw;

  private FaceDetectCameraView$a(FaceDetectCameraView paramFaceDetectCameraView)
  {
    super(Looper.getMainLooper());
    AppMethodBeat.i(574);
    this.Nw = new WeakReference(paramFaceDetectCameraView);
    AppMethodBeat.o(574);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(575);
    super.handleMessage(paramMessage);
    if ((this.Nw == null) || (this.Nw.get() == null))
    {
      ab.e("MicroMsg.FaceDetectCameraView", "hy: no referenced view. exit");
      AppMethodBeat.o(575);
    }
    while (true)
    {
      return;
      if (paramMessage.what == 1)
      {
        paramMessage = (FaceCharacteristicsResult)paramMessage.obj;
        if (FaceCharacteristicsResult.vj(paramMessage.errCode))
        {
          if (FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()) != null)
          {
            FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()).d(paramMessage);
            AppMethodBeat.o(575);
          }
        }
        else if (FaceCharacteristicsResult.vi(paramMessage.errCode))
        {
          if (FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()) != null)
          {
            FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()).a(paramMessage.errCode, paramMessage.aIm);
            AppMethodBeat.o(575);
          }
        }
        else if (FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()) != null)
          FaceDetectCameraView.a((FaceDetectCameraView)this.Nw.get()).c(paramMessage);
      }
      else
      {
        AppMethodBeat.o(575);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.a
 * JD-Core Version:    0.6.2
 */