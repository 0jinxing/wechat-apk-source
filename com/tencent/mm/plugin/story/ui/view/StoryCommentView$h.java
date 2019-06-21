package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryCommentView$h
  implements Runnable
{
  StoryCommentView$h(StoryCommentView paramStoryCommentView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110421);
    StoryCommentView.b(this.sjP).setVisibility(8);
    StoryCommentView.b(this.sjP).setAlpha(1.0F);
    AppMethodBeat.o(110421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.h
 * JD-Core Version:    0.6.2
 */