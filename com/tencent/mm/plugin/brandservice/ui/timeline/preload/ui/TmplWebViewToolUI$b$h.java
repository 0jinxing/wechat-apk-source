package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.f;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"})
final class TmplWebViewToolUI$b$h
  implements View.OnLongClickListener
{
  TmplWebViewToolUI$b$h(TmplWebViewToolUI.b paramb)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(15056);
    paramView = new StringBuilder();
    paramView.append(this.jVf.jUY.toString());
    h.J((Context)this.jVf.jVe, paramView.toString(), "");
    AppMethodBeat.o(15056);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.b.h
 * JD-Core Version:    0.6.2
 */