package com.tencent.mm.plugin.story.ui.view;

import a.f.a.m;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentInputView$4
  implements View.OnClickListener
{
  StoryCommentInputView$4(StoryCommentInputView paramStoryCommentInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110391);
    StoryCommentInputView.b(this.sjp, false);
    paramView = this.sjp.getCommentInputCallback();
    if (paramView != null)
    {
      paramView.m("", Boolean.FALSE);
      AppMethodBeat.o(110391);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110391);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentInputView.4
 * JD-Core Version:    0.6.2
 */