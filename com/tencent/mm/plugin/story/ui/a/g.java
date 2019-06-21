package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/adapter/StoryGalleryViewHolder;", "width", "", "height", "(II)V", "flipItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "Lkotlin/collections/ArrayList;", "getHeight", "()I", "onItemLongClickListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "position", "item", "", "getOnItemLongClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemLongClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getWidth", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "update", "items", "", "plugin-story_release"})
public final class g extends RecyclerView.a<i>
{
  private final int height;
  private final ArrayList<com.tencent.mm.plugin.story.model.d.g> sfQ;
  private final int width;

  public g(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110136);
    this.width = paramInt1;
    this.height = paramInt2;
    this.sfQ = new ArrayList();
    AppMethodBeat.o(110136);
  }

  public final void dI(List<com.tencent.mm.plugin.story.model.d.g> paramList)
  {
    AppMethodBeat.i(110131);
    j.p(paramList, "items");
    this.sfQ.clear();
    this.sfQ.addAll((Collection)paramList);
    AppMethodBeat.o(110131);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110132);
    int i = this.sfQ.size();
    AppMethodBeat.o(110132);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.g
 * JD-Core Version:    0.6.2
 */