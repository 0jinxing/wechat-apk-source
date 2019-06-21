package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck;", "", "gallery", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "recyclerView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;", "pageScrollHelper", "Lcom/tencent/mm/plugin/story/ui/view/gallery/PageScrollHelper;", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;Lcom/tencent/mm/plugin/story/ui/view/gallery/PageScrollHelper;)V", "hintLayout", "Landroid/view/View;", "hintShowing", "", "scrollListener", "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$scrollListener$1;", "showHintRunnable", "Ljava/lang/Runnable;", "cancelHint", "", "checkCancel", "destroy", "Companion", "plugin-story_release"})
public final class g
{
  private static final String TAG = "MicroMsg.GalleryScrollUpCheck";
  public static final g.a soq;
  boolean soj;
  private final g.c sok;
  private final Runnable sol;
  private View som;
  private final l son;
  private final GalleryRecyclerView soo;
  private final j sop;

  static
  {
    AppMethodBeat.i(110745);
    soq = new g.a((byte)0);
    TAG = "MicroMsg.GalleryScrollUpCheck";
    AppMethodBeat.o(110745);
  }

  public g(l paraml, GalleryRecyclerView paramGalleryRecyclerView, j paramj)
  {
    AppMethodBeat.i(110744);
    this.son = paraml;
    this.soo = paramGalleryRecyclerView;
    this.sop = paramj;
    this.sok = new g.c(this);
    paraml = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(paraml, "storage()");
    if (paraml.Ry().getBoolean(ac.a.xWC, false))
    {
      this.sol = ((Runnable)g.1.sor);
      this.sop.i((RecyclerView)this.soo);
      AppMethodBeat.o(110744);
    }
    while (true)
    {
      return;
      this.sol = ((Runnable)new g.2(this));
      al.n(this.sol, 5000L);
      this.soo.a((RecyclerView.m)this.sok);
      AppMethodBeat.o(110744);
    }
  }

  public final void cCG()
  {
    AppMethodBeat.i(110742);
    b.a((a)new g.b(this));
    AppMethodBeat.o(110742);
  }

  public final void destroy()
  {
    AppMethodBeat.i(110743);
    al.af(this.sol);
    this.son.removeView(this.som);
    this.soo.b((RecyclerView.m)this.sok);
    AppMethodBeat.o(110743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.g
 * JD-Core Version:    0.6.2
 */