package com.tencent.mm.plugin.story.ui.view;

import a.f.a.a;
import a.l;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"})
final class StoryCommentView$4
  implements View.OnLongClickListener
{
  StoryCommentView$4(StoryCommentView paramStoryCommentView)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(138906);
    boolean bool;
    if (StoryCommentView.c(this.sjP) == 3)
    {
      AppMethodBeat.o(138906);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramView = this.sjP.getOutsideClickListener();
      if (paramView != null)
      {
        paramView = (Boolean)paramView.invoke();
        if (paramView != null)
        {
          bool = paramView.booleanValue();
          AppMethodBeat.o(138906);
        }
      }
      else
      {
        AppMethodBeat.o(138906);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.4
 * JD-Core Version:    0.6.2
 */