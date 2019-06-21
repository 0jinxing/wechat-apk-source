package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryCommentView$j
  implements Runnable
{
  StoryCommentView$j(StoryCommentView paramStoryCommentView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138920);
    StoryCommentView.f(this.sjP).sfG = false;
    ab.i(StoryCommentView.access$getTAG$cp(), "LogStory: comment recycler count is " + StoryCommentView.b(this.sjP).getChildCount());
    int i = StoryCommentView.b(this.sjP).getChildCount();
    for (int j = 0; j < i; j++)
    {
      Object localObject = StoryCommentView.b(this.sjP).getChildAt(j);
      if ((localObject instanceof CommentItemView))
      {
        localObject = (CommentItemView)localObject;
        int k = StoryCommentView.b(this.sjP).getChildCount() - j;
        long l = k * 30L;
        float f = (k + 1) * a.fromDPToPix(((CommentItemView)localObject).getContext(), 16);
        ((CommentItemView)localObject).setAlpha(0.0F);
        ((CommentItemView)localObject).setTranslationY(f);
        ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(localObject, "translationY", new float[] { f, 0.0F });
        j.o(localObjectAnimator, "transAnim");
        localObjectAnimator.setDuration(150L);
        localObjectAnimator.setStartDelay(l);
        localObjectAnimator.start();
        localObject = ObjectAnimator.ofFloat(localObject, "alpha", new float[] { 0.0F, 1.0F });
        j.o(localObject, "alphaAnim");
        ((ObjectAnimator)localObject).setDuration(150L);
        ((ObjectAnimator)localObject).setStartDelay(l);
        ((ObjectAnimator)localObject).start();
      }
    }
    AppMethodBeat.o(138920);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.j
 * JD-Core Version:    0.6.2
 */