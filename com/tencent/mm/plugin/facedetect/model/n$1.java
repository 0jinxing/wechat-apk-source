package com.tencent.mm.plugin.facedetect.model;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$1
  implements Camera.PreviewCallback
{
  n$1(n paramn, Camera.PreviewCallback paramPreviewCallback)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(252);
    if (this.lUN != null)
      this.lUN.onPreviewFrame(paramArrayOfByte, paramCamera);
    paramCamera.addCallbackBuffer(paramArrayOfByte);
    AppMethodBeat.o(252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.n.1
 * JD-Core Version:    0.6.2
 */