package com.tencent.mm.plugin.story.proxy;

import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/proxy/StoryHintProxy$mOriginalClickListener$1", "Landroid/view/View$OnClickListener;", "lastClick", "", "onClick", "", "view", "Landroid/view/View;", "plugin-story_release"})
public final class b$c
  implements View.OnClickListener
{
  private long qlT;

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(109725);
    j.p(paramView, "view");
    long l = bo.anU();
    b.c(this.saT).removeMessages(b.a(this.saT));
    b.c(this.saT).sendMessageDelayed(b.c(this.saT).obtainMessage(b.a(this.saT), paramView), ViewConfiguration.getDoubleTapTimeout());
    ab.d(b.access$getTAG$cp(), "onClick lastClick=%s now=%s", new Object[] { Long.valueOf(this.qlT), Long.valueOf(l) });
    if (l - this.qlT < ViewConfiguration.getDoubleTapTimeout())
    {
      b.c(this.saT).removeMessages(b.a(this.saT));
      b.d(this.saT);
      AppMethodBeat.o(109725);
    }
    while (true)
    {
      return;
      this.qlT = l;
      AppMethodBeat.o(109725);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.proxy.b.c
 * JD-Core Version:    0.6.2
 */