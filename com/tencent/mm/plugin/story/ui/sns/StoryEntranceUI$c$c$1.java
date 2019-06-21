package com.tencent.mm.plugin.story.ui.sns;

import a.f.a.m;
import a.f.b.j;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryEntranceUI$c$c$1
  implements View.OnClickListener
{
  StoryEntranceUI$c$c$1(StoryEntranceUI.c.c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110250);
    int i = this.shA.kj();
    paramView = this.shA.shy.shw.get(i);
    j.o(paramView, "userList[position]");
    StoryEntranceUI.b localb = (StoryEntranceUI.b)paramView;
    paramView = this.shA.shy.seN;
    if (paramView != null)
    {
      paramView.m(Integer.valueOf(i), localb);
      AppMethodBeat.o(110250);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110250);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.StoryEntranceUI.c.c.1
 * JD-Core Version:    0.6.2
 */