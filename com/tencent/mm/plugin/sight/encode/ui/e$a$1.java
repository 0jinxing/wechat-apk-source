package com.tencent.mm.plugin.sight.encode.ui;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class e$a$1
  implements Camera.AutoFocusCallback
{
  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(25099);
    ab.v("MicroMsg.SightCamera", "auto focus callback");
    e.a.ouf = true;
    AppMethodBeat.o(25099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.encode.ui.e.a.1
 * JD-Core Version:    0.6.2
 */