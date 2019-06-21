package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/VerticalViewHolder;", "()V", "bindCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "getBindCallback", "()Lkotlin/jvm/functions/Function1;", "setBindCallback", "(Lkotlin/jvm/functions/Function1;)V", "galleryItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "Lkotlin/collections/ArrayList;", "pool", "Landroid/support/v7/widget/RecyclerView$RecycledViewPool;", "prePosition", "preRow", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "update", "items", "", "updateChildRecyclerPosition", "row", "Companion", "plugin-story_release"})
public final class r extends RecyclerView.a<s>
{
  private static final String TAG = "MicroMsg.VerticalAdapter";
  public static final r.a srA;
  private final ArrayList<ArrayList<g>> rZR;
  b<? super Integer, y> srw;
  int srx;
  int sry;
  private final RecyclerView.n srz;

  static
  {
    AppMethodBeat.i(111012);
    srA = new r.a((byte)0);
    TAG = "MicroMsg.VerticalAdapter";
    AppMethodBeat.o(111012);
  }

  public r()
  {
    AppMethodBeat.i(111011);
    this.rZR = new ArrayList();
    this.srx = -1;
    this.srz = new RecyclerView.n();
    this.srz.aF(0, 2);
    AppMethodBeat.o(111011);
  }

  public final void dI(List<? extends ArrayList<g>> paramList)
  {
    AppMethodBeat.i(111006);
    j.p(paramList, "items");
    this.rZR.clear();
    this.rZR.addAll((Collection)paramList);
    AppMethodBeat.o(111006);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(111008);
    int i = this.rZR.size();
    AppMethodBeat.o(111008);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.r
 * JD-Core Version:    0.6.2
 */