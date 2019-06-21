package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentColorSelector$1
  implements View.OnClickListener
{
  StoryCommentColorSelector$1(StoryCommentColorSelector paramStoryCommentColorSelector)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110380);
    this.sjd.setSelectedColor(-1);
    StoryCommentColorSelector.a(this.sjd);
    AppMethodBeat.o(110380);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector.1
 * JD-Core Version:    0.6.2
 */