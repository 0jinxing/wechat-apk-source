package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.forcenotify.a.a;
import com.tencent.mm.plugin.forcenotify.c.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class ForceNotifyShowUI$c
  implements View.OnClickListener
{
  ForceNotifyShowUI$c(ForceNotifyShowUI paramForceNotifyShowUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(51086);
    if (ForceNotifyShowUI.c(this.mtB).field_CreateTime > 0L)
    {
      paramView = String.valueOf(ForceNotifyShowUI.c(this.mtB).field_CreateTime / 1000L) + ForceNotifyShowUI.c(this.mtB).field_UserName;
      ((a)g.K(a.class)).b(this.mtB.username, paramView, 2, cb.aaE() / 1000L);
    }
    this.mtB.finish();
    this.mtB.overridePendingTransition(0, 2131034227);
    AppMethodBeat.o(51086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.c
 * JD-Core Version:    0.6.2
 */