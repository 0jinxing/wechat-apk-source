package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.aq;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.d.f;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentView$10
  implements View.OnClickListener
{
  StoryCommentView$10(StoryCommentView paramStoryCommentView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110412);
    if (!StoryCommentView.a(this.sjP).rrj.isEmpty())
      if (StoryCommentView.c(this.sjP) == 3)
      {
        this.sjP.oE(2);
        paramView = h.scu;
        h.EX(1);
        AppMethodBeat.o(110412);
      }
    while (true)
    {
      return;
      this.sjP.oE(3);
      paramView = h.scu;
      h.EX(2);
      paramView = h.scu;
      h.cAw().bE(4L);
      paramView = h.scu;
      h.cAw().fz(String.valueOf(StoryCommentView.l(this.sjP)));
      paramView = h.scu;
      h.cAx();
      AppMethodBeat.o(110412);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.10
 * JD-Core Version:    0.6.2
 */