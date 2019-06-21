package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.ui.ah;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class g$2
  implements Runnable
{
  g$2(g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110739);
    int i = a.fromDPToPix(g.d(this.sos).getContext(), 112);
    View localView = LayoutInflater.from(g.d(this.sos).getContext()).inflate(2130970901, (ViewGroup)g.d(this.sos), false);
    g.a(this.sos, localView);
    Object localObject = localView.findViewById(2131828192);
    j.o(localObject, "layout.findViewById(R.id…tory_scroll_up_hint_icon)");
    ((ImageView)localObject).setImageDrawable(ah.f(g.d(this.sos).getContext(), 2131231124, -1));
    localObject = new RelativeLayout.LayoutParams(-1, i);
    ((RelativeLayout.LayoutParams)localObject).addRule(12, 1);
    g.d(this.sos).addView(localView, (ViewGroup.LayoutParams)localObject);
    j.o(localView, "layout");
    localView.setAlpha(0.0F);
    localView.animate().alpha(1.0F).start();
    g.b(this.sos).ce(i);
    g.h(this.sos);
    AppMethodBeat.o(110739);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.g.2
 * JD-Core Version:    0.6.2
 */