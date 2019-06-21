package com.tencent.mm.plugin.voip.video;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Camera.AutoFocusCallback
{
  a$1(a parama)
  {
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(5020);
    ab.d("MicroMsg.Voip.CaptureRender", "onAutoFocus, success:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.sZQ.sZJ = true;
    AppMethodBeat.o(5020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a.1
 * JD-Core Version:    0.6.2
 */