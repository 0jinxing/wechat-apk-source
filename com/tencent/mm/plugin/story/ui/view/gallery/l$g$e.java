package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.v;
import android.content.res.Resources;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.m.a;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ak;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class l$g$e
  implements Runnable
{
  l$g$e(l.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110795);
    l locall = this.spO.spK;
    Object localObject1 = null;
    if (locall.soE == m.a.rQF)
      localObject1 = ac.a.xWF;
    if (localObject1 != null)
    {
      Object localObject2 = g.RP();
      j.o(localObject2, "storage()");
      if (!((e)localObject2).Ry().getBoolean((ac.a)localObject1, false))
      {
        localObject1 = locall.spg.getLayoutParams();
        if (localObject1 == null)
        {
          localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          AppMethodBeat.o(110795);
          throw ((Throwable)localObject1);
        }
        localObject1 = (ViewGroup.MarginLayoutParams)localObject1;
        ak.hF(locall.getContext());
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = (-locall.getTop());
        locall.spg.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        locall.spg.setVisibility(0);
        localObject2 = locall.spg;
        localObject1 = locall.getResources().getString(2131303956);
        j.o(localObject1, "resources.getString(R.string.story_pull_hint)");
        ((TextView)localObject2).setText((CharSequence)l.a.l((CharSequence)localObject1, locall.spg.getCurrentTextColor()));
      }
    }
    AppMethodBeat.o(110795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.g.e
 * JD-Core Version:    0.6.2
 */