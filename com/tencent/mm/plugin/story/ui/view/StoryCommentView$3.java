package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StoryCommentView$3
  implements View.OnClickListener
{
  StoryCommentView$3(StoryCommentView paramStoryCommentView)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(138905);
    paramView = StoryCommentView.m(this.sjP);
    paramView.isRecording = true;
    paramView.skt += 1;
    int j;
    if ((paramView.skt == 1) && (paramView.skr == null) && (paramView.sks == null))
      j = i;
    while (true)
    {
      if (j != 0)
        paramView.cCq();
      al.af(paramView.skv);
      al.n(paramView.skv, paramView.sku);
      AppMethodBeat.o(138905);
      return;
      if (paramView.skt == 2)
      {
        j = i;
        if (paramView.sks == null);
      }
      else
      {
        j = i;
        if (paramView.skt != 3)
          j = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.3
 * JD-Core Version:    0.6.2
 */