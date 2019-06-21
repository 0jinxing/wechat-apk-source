package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "plugin-story_release"})
public final class g$c extends RecyclerView.m
{
  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110741);
    j.p(paramRecyclerView, "recyclerView");
    if ((!g.g(this.sos)) && (paramInt2 > 0))
    {
      ab.i(g.access$getTAG$cp(), "onScrolled ".concat(String.valueOf(paramInt2)));
      paramRecyclerView = com.tencent.mm.kernel.g.RP();
      j.o(paramRecyclerView, "storage()");
      paramRecyclerView.Ry().set(ac.a.xWC, Boolean.TRUE);
      this.sos.cCG();
    }
    AppMethodBeat.o(110741);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.g.c
 * JD-Core Version:    0.6.2
 */