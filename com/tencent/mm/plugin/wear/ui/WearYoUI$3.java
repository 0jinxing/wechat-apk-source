package com.tencent.mm.plugin.wear.ui;

import android.os.Vibrator;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WearYoUI$3
  implements Runnable
{
  WearYoUI$3(WearYoUI paramWearYoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26465);
    WearYoUI.c(this.tYZ).vibrate(200L);
    WearYoUI.d(this.tYZ).animate().scaleX(1.2F);
    WearYoUI.d(this.tYZ).animate().scaleY(1.2F);
    WearYoUI.d(this.tYZ).animate().setDuration(200L);
    WearYoUI.d(this.tYZ).animate().start();
    WearYoUI.d(this.tYZ).animate().setListener(new WearYoUI.a(this.tYZ, 1));
    AppMethodBeat.o(26465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.ui.WearYoUI.3
 * JD-Core Version:    0.6.2
 */