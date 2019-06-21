package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.b.a;
import com.tencent.mm.plugin.story.model.d.f;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
public final class StoryCommentView$c
  implements Runnable
{
  public StoryCommentView$c(StoryCommentView paramStoryCommentView, f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138916);
    f localf = this.sjS;
    Object localObject = (Iterable)StoryCommentView.a(this.sjP).rrj;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      do
        if (!((Iterator)localObject).hasNext())
          break;
      while (!((a)((Iterator)localObject).next()).rVh);
    }
    for (boolean bool = true; ; bool = false)
    {
      localf.rVh = bool;
      if (this.sjS.rVh)
      {
        this.sjP.oE(3);
        ab.d(StoryCommentView.access$getTAG$cp(), String.valueOf(this.sjS.rrj.size() - 1));
        StoryCommentView.b(this.sjP).getLayoutManager().bY(this.sjS.rrj.size() - 1);
      }
      AppMethodBeat.o(138916);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentView.c
 * JD-Core Version:    0.6.2
 */