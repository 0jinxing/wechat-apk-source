package com.tencent.mm.plugin.webwx.ui;

import android.animation.Animator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebWXLogoutUI$4
  implements View.OnClickListener
{
  WebWXLogoutUI$4(WebWXLogoutUI paramWebWXLogoutUI, Animator paramAnimator)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26541);
    if (WebWXLogoutUI.c(this.uLG))
      WebWXLogoutUI.d(this.uLG).setImageResource(2131231145);
    while (true)
    {
      WebWXLogoutUI.e(this.uLG);
      this.uLG.findViewById(2131829196).setVisibility(0);
      this.uLH.start();
      AppMethodBeat.o(26541);
      return;
      WebWXLogoutUI.d(this.uLG).setImageResource(2131231143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWXLogoutUI.4
 * JD-Core Version:    0.6.2
 */