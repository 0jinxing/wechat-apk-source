package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/ControlAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/adapter/ControlAdapter$ControlViewHolder;", "()V", "galleryItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "selectedPosition", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setSelected", "update", "items", "", "ControlViewHolder", "plugin-story_release"})
public final class a extends RecyclerView.a<a>
{
  public int llU;
  public final ArrayList<g> rZR;

  public a()
  {
    AppMethodBeat.i(110091);
    this.rZR = new ArrayList();
    AppMethodBeat.o(110091);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110089);
    int i = this.rZR.size();
    AppMethodBeat.o(110089);
    return i;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/ControlAdapter$ControlViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/ControlAdapter;Landroid/view/View;)V", "view", "getView", "()Landroid/view/View;", "plugin-story_release"})
  public final class a extends RecyclerView.v
  {
    final View view;

    public a()
    {
      super();
      AppMethodBeat.i(110087);
      this$1 = localObject.findViewById(2131828178);
      j.o(a.this, "itemView.findViewById(R.…y_control_page_indicator)");
      this.view = a.this;
      AppMethodBeat.o(110087);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.a
 * JD-Core Version:    0.6.2
 */