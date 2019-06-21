package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.forcenotify.b.c;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class ForceNotifyListUI$b$3
  implements View.OnClickListener
{
  ForceNotifyListUI$b$3(ForceNotifyListUI.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(51070);
    ab.i(ForceNotifyListUI.f(this.mtr.mtn), "resetView onClick! username:%s", new Object[] { this.mtr.username });
    c.mtf.Mn(this.mtr.username);
    this.mtr.mtq.animate().rotation(360.0F).setDuration(300L).withEndAction((Runnable)new ForceNotifyListUI.b.3.1(this)).start();
    AppMethodBeat.o(51070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.b.3
 * JD-Core Version:    0.6.2
 */