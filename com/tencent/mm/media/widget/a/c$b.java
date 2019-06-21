package com.tencent.mm.media.widget.a;

import a.l;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "success", "", "camera", "Landroid/hardware/Camera;", "kotlin.jvm.PlatformType", "onAutoFocus"})
final class c$b
  implements Camera.AutoFocusCallback
{
  c$b(c paramc)
  {
  }

  public final void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(13189);
    ab.v(c.a(this.faW), "auto focus callback success ".concat(String.valueOf(paramBoolean)));
    this.faW.faO = true;
    AppMethodBeat.o(13189);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.c.b
 * JD-Core Version:    0.6.2
 */