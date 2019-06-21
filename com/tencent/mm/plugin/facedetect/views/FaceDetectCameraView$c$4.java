package com.tencent.mm.plugin.facedetect.views;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a;
import com.tencent.mm.plugin.facedetect.model.c;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.sdk.platformtools.ak;

final class FaceDetectCameraView$c$4
  implements d.b
{
  FaceDetectCameraView$c$4(FaceDetectCameraView.c paramc)
  {
  }

  public final void aT(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(583);
    if (!FaceDetectCameraView.n(this.mar.mai))
    {
      if (FaceDetectCameraView.o(this.mar.mai) == null)
        FaceDetectCameraView.a(this.mar.mai, c.lTA.g(Integer.valueOf(paramArrayOfByte.length)));
      System.arraycopy(paramArrayOfByte, 0, FaceDetectCameraView.o(this.mar.mai), 0, paramArrayOfByte.length);
      FaceDetectCameraView.a(this.mar.mai, paramArrayOfByte);
    }
    c.lTA.g(paramArrayOfByte);
    f.bsA().post(new FaceDetectCameraView.c.4.1(this));
    AppMethodBeat.o(583);
  }

  public final a<byte[]> bsr()
  {
    return c.lTA;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.c.4
 * JD-Core Version:    0.6.2
 */