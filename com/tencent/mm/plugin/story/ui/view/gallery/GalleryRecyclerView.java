package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.m;
import a.f.a.q;
import a.l;
import a.y;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryRecyclerView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "childControlView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "childRecyclerView", "layoutManager", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "getLayoutManager", "()Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "onRowSelected", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "row", "rowView", "pageControl", "", "getOnRowSelected", "()Lkotlin/jvm/functions/Function3;", "setOnRowSelected", "(Lkotlin/jvm/functions/Function3;)V", "onScrollCallback", "Lkotlin/Function2;", "position", "", "offset", "getOnScrollCallback", "()Lkotlin/jvm/functions/Function2;", "setOnScrollCallback", "(Lkotlin/jvm/functions/Function2;)V", "selectedRow", "child", "Landroid/view/View;", "setScrollEnable", "enabled", "", "Companion", "plugin-story_release"})
public final class GalleryRecyclerView extends RecyclerView
{
  private static final String TAG = "MicroMsg.GalleryRecyclerView";
  public static final GalleryRecyclerView.a snX;
  int rZb;
  private final com.tencent.mm.plugin.story.ui.b.b snT;
  RecyclerView snU;
  q<? super Integer, ? super RecyclerView, ? super GalleryHorizontalControlView, y> snV;
  private m<? super Integer, ? super Float, y> snW;

  static
  {
    AppMethodBeat.i(110731);
    snX = new GalleryRecyclerView.a((byte)0);
    TAG = "MicroMsg.GalleryRecyclerView";
    AppMethodBeat.o(110731);
  }

  public GalleryRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110730);
    AppMethodBeat.o(110730);
  }

  public GalleryRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110729);
    this.snT = new com.tencent.mm.plugin.story.ui.b.b(paramContext);
    setLayoutManager((RecyclerView.i)this.snT);
    this.snT.lqs = ((m)new GalleryRecyclerView.1(this));
    this.snT.shb = ((m)new GalleryRecyclerView.2(this));
    b((RecyclerView.h)new b(1));
    setItemAnimator(null);
    setItemViewCacheSize(0);
    AppMethodBeat.o(110729);
  }

  public final com.tencent.mm.plugin.story.ui.b.b getLayoutManager()
  {
    return this.snT;
  }

  public final q<Integer, RecyclerView, GalleryHorizontalControlView, y> getOnRowSelected()
  {
    return this.snV;
  }

  public final m<Integer, Float, y> getOnScrollCallback()
  {
    return this.snW;
  }

  public final void setOnRowSelected(q<? super Integer, ? super RecyclerView, ? super GalleryHorizontalControlView, y> paramq)
  {
    this.snV = paramq;
  }

  public final void setOnScrollCallback(m<? super Integer, ? super Float, y> paramm)
  {
    this.snW = paramm;
  }

  public final void setScrollEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(110728);
    this.snT.shc = paramBoolean;
    Object localObject = this.snU;
    if (localObject != null);
    for (localObject = ((RecyclerView)localObject).getLayoutManager(); ; localObject = null)
    {
      if ((localObject instanceof com.tencent.mm.plugin.story.ui.b.b))
        ((com.tencent.mm.plugin.story.ui.b.b)localObject).shc = paramBoolean;
      AppMethodBeat.o(110728);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView
 * JD-Core Version:    0.6.2
 */