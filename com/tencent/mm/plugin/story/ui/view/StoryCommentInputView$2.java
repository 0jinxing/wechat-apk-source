package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentInputView$2
  implements View.OnClickListener
{
  StoryCommentInputView$2(StoryCommentInputView paramStoryCommentInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110389);
    if (StoryCommentInputView.f(this.sjp) == 0)
    {
      StoryCommentInputView.a(this.sjp, 2);
      StoryCommentInputView.b(this.sjp, true);
      AppMethodBeat.o(110389);
    }
    while (true)
    {
      return;
      if (StoryCommentInputView.g(this.sjp))
      {
        StoryCommentInputView.a(this.sjp, 0);
        StoryCommentInputView.b(this.sjp, false);
        AppMethodBeat.o(110389);
      }
      else
      {
        StoryCommentInputView.a(this.sjp, 0);
        StoryCommentInputView.h(this.sjp).setVisibility(0);
        AppMethodBeat.o(110389);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.2
 * JD-Core Version:    0.6.2
 */