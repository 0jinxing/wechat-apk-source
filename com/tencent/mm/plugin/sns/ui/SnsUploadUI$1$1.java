package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadUI$1$1
  implements Runnable
{
  SnsUploadUI$1$1(SnsUploadUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39735);
    SnsUploadUI.a(this.rCP.rCO).aYS();
    SnsUploadUI.a(this.rCP.rCO).postInvalidate();
    SnsUploadUI.b(this.rCP.rCO).postInvalidate();
    AppMethodBeat.o(39735);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.1.1
 * JD-Core Version:    0.6.2
 */