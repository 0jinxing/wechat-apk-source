package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"})
final class ForceNotifyListUI$b$2
  implements View.OnLongClickListener
{
  ForceNotifyListUI$b$2(ForceNotifyListUI.b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(51068);
    ab.i(ForceNotifyListUI.f(this.mtr.mtn), "OnLongClick!");
    new a((Context)this.mtr.mtn.dxU()).a(paramView, 0, 0L, (View.OnCreateContextMenuListener)this.mtr, (n.d)this.mtr, ForceNotifyListUI.e(this.mtr.mtn)[0], ForceNotifyListUI.e(this.mtr.mtn)[1]);
    AppMethodBeat.o(51068);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyListUI.b.2
 * JD-Core Version:    0.6.2
 */