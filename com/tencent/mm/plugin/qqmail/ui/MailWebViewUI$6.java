package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMWebView;

final class MailWebViewUI$6
  implements Runnable
{
  MailWebViewUI$6(MailWebViewUI paramMailWebViewUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68400);
    View localView = (View)MailWebViewUI.c(this.pzh).getParent();
    if (localView != null)
    {
      int i = localView.getWidth();
      if (this.pzk > i)
      {
        int j = 10;
        float f = i / this.pzk;
        while (f < MailWebViewUI.c(this.pzh).getScale())
        {
          j--;
          if (j <= 0)
            break;
          MailWebViewUI.c(this.pzh).zoomOut();
        }
      }
    }
    AppMethodBeat.o(68400);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.6
 * JD-Core Version:    0.6.2
 */