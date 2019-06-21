package com.tencent.mm.plugin.sns.ui;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.s;

final class SnsUploadUI$14
  implements Runnable
{
  SnsUploadUI$14(SnsUploadUI paramSnsUploadUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39753);
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.rCO.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    af.cnu();
    s.fs(localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels);
    AppMethodBeat.o(39753);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadUI.14
 * JD-Core Version:    0.6.2
 */