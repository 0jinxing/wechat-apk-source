package com.tencent.mm.plugin.story.ui.view;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryCommentView$i
  implements Runnable
{
  StoryCommentView$i(StoryCommentView paramStoryCommentView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110422);
    StoryCommentView.d(this.sjP).pause();
    StoryCommentView.d(this.sjP).setAlpha(1.0F);
    AppMethodBeat.o(110422);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.i
 * JD-Core Version:    0.6.2
 */