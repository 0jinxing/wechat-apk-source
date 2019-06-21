package com.tencent.mm.plugin.offline.ui;

import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class OfflineAlertView$8
  implements Runnable
{
  OfflineAlertView$8(OfflineAlertView paramOfflineAlertView, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(43450);
    ab.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", new Object[] { Integer.valueOf(this.oZi.getHeight()), Integer.valueOf(this.oZi.getMeasuredHeight()) });
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)OfflineAlertView.a(this.oZl).getLayoutParams();
    if (this.oZi.getHeight() > 0)
    {
      localLayoutParams.height = this.oZi.getHeight();
      OfflineAlertView.a(this.oZl).setLayoutParams(localLayoutParams);
      OfflineAlertView.a(this.oZl).invalidate();
    }
    if (OfflineAlertView.b(this.oZl) != null)
      OfflineAlertView.b(this.oZl).onShow();
    AppMethodBeat.o(43450);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.OfflineAlertView.8
 * JD-Core Version:    0.6.2
 */