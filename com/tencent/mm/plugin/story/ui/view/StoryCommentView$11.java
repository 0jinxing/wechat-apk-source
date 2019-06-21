package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentView$11
  implements View.OnClickListener
{
  StoryCommentView$11(StoryCommentView paramStoryCommentView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138913);
    ab.i(StoryCommentView.access$getTAG$cp(), "CommentBubble click");
    StoryCommentView.a(this.sjP, true);
    AppMethodBeat.o(138913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.11
 * JD-Core Version:    0.6.2
 */