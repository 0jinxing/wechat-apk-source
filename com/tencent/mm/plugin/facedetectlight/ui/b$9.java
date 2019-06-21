package com.tencent.mm.plugin.facedetectlight.ui;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class b$9
  implements Camera.PreviewCallback
{
  b$9(b paramb, Camera.PreviewCallback paramPreviewCallback)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(770);
    al.d(new b.9.1(this));
    if (this.lUN != null)
      this.lUN.onPreviewFrame(paramArrayOfByte, paramCamera);
    paramCamera.addCallbackBuffer(paramArrayOfByte);
    AppMethodBeat.o(770);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.9
 * JD-Core Version:    0.6.2
 */