package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUploadUI$1$2
  implements Runnable
{
  SnsUploadUI$1$2(SnsUploadUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39736);
    SnsUploadSayFooter localSnsUploadSayFooter = SnsUploadUI.a(this.rCP.rCO);
    if (!localSnsUploadSayFooter.aYV())
      localSnsUploadSayFooter.setVisibility(8);
    SnsUploadUI.a(this.rCP.rCO).postInvalidate();
    SnsUploadUI.c(this.rCP.rCO).postInvalidate();
    AppMethodBeat.o(39736);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.1.2
 * JD-Core Version:    0.6.2
 */