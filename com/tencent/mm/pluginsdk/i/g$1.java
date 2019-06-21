package com.tencent.mm.pluginsdk.i;

import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements Camera.AutoFocusCallback
{
  g$1(g paramg)
  {
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(27483);
    ab.d("MicroMsg.YuvReocrder", "auto focus callback");
    g.a(this.vgj);
    AppMethodBeat.o(27483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.g.1
 * JD-Core Version:    0.6.2
 */