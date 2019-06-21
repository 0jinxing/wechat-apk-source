package com.tencent.mm.plugin.facedetectlight.ui;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class b$2
  implements Camera.PreviewCallback
{
  b$2(b paramb)
  {
  }

  public final void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(760);
    b.A(this.mdJ).aa(new b.2.1(this, paramArrayOfByte, paramCamera));
    AppMethodBeat.o(760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.b.2
 * JD-Core Version:    0.6.2
 */