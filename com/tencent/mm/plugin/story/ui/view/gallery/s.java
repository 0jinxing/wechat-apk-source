package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.a.g;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "width", "", "height", "(Landroid/view/View;II)V", "adapter", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryAdapter;", "getAdapter", "()Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryAdapter;", "horizontalControlView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "getHorizontalControlView", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "layoutManager", "Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "getLayoutManager", "()Lcom/tencent/mm/plugin/story/ui/layout/GalleryLayoutManager;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "getRecyclerView", "()Landroid/support/v7/widget/RecyclerView;", "plugin-story_release"})
public final class s extends RecyclerView.v
{
  final RecyclerView iJP;
  private final com.tencent.mm.plugin.story.ui.b.b snT;
  final g srB;
  final GalleryHorizontalControlView srC;

  public s(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView);
    AppMethodBeat.i(111013);
    Object localObject = paramView.findViewById(2131828156);
    j.o(localObject, "itemView.findViewById(R.…lery_horizontal_recycler)");
    this.iJP = ((RecyclerView)localObject);
    this.srB = new g(paramInt1, paramInt2);
    localObject = paramView.getContext();
    j.o(localObject, "itemView.context");
    this.snT = new com.tencent.mm.plugin.story.ui.b.b((Context)localObject, 0, (byte)0);
    paramView = paramView.findViewById(2131828157);
    j.o(paramView, "itemView.findViewById(R.…ory_gallery_page_control)");
    this.srC = ((GalleryHorizontalControlView)paramView);
    this.iJP.setAdapter((RecyclerView.a)this.srB);
    this.iJP.setLayoutManager((RecyclerView.i)this.snT);
    this.iJP.setFocusable(false);
    this.iJP.b((RecyclerView.h)new b(0));
    localObject = this.iJP.getItemAnimator();
    paramView = (View)localObject;
    if (!(localObject instanceof av))
      paramView = null;
    paramView = (av)paramView;
    if (paramView != null)
      paramView.kQ();
    this.iJP.setItemViewCacheSize(0);
    AppMethodBeat.o(111013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.s
 * JD-Core Version:    0.6.2
 */