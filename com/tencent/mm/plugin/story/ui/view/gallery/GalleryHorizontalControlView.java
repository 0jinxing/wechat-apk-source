package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.ui.a.a;
import com.tencent.mm.plugin.story.ui.b.c;
import com.tencent.mm.ui.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHorizontalControlView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adapter", "Lcom/tencent/mm/plugin/story/ui/adapter/ControlAdapter;", "galleryItems", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "recycler", "Landroid/support/v7/widget/RecyclerView;", "setSelection", "", "position", "update", "items", "", "updateView", "plugin-story_release"})
public final class GalleryHorizontalControlView extends FrameLayout
{
  private final RecyclerView exa;
  private final ArrayList<g> rZR;
  private final a snQ;

  public GalleryHorizontalControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110723);
    AppMethodBeat.o(110723);
  }

  public GalleryHorizontalControlView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110722);
    this.rZR = new ArrayList();
    View.inflate(paramContext, 2130970884, (ViewGroup)this);
    paramAttributeSet = findViewById(2131828148);
    j.o(paramAttributeSet, "findViewById(R.id.story_gallery_control_recycler)");
    this.exa = ((RecyclerView)paramAttributeSet);
    this.exa.setLayoutManager((RecyclerView.i)new c(paramContext));
    this.snQ = new a();
    this.exa.setAdapter((RecyclerView.a)this.snQ);
    this.exa.setFocusable(false);
    this.exa.setVisibility(8);
    setPadding(0, 0, 0, ak.fr(paramContext));
    AppMethodBeat.o(110722);
  }

  public final void dI(List<g> paramList)
  {
    AppMethodBeat.i(110720);
    j.p(paramList, "items");
    this.rZR.clear();
    this.rZR.addAll((Collection)paramList);
    paramList = this.snQ;
    List localList = (List)this.rZR;
    j.p(localList, "items");
    paramList.rZR.clear();
    paramList.rZR.addAll((Collection)localList);
    this.snQ.notifyDataSetChanged();
    if (this.rZR.size() <= 1)
    {
      this.exa.setVisibility(8);
      AppMethodBeat.o(110720);
    }
    while (true)
    {
      return;
      this.exa.setVisibility(0);
      AppMethodBeat.o(110720);
    }
  }

  public final void setSelection(int paramInt)
  {
    AppMethodBeat.i(110721);
    a locala = this.snQ;
    if (locala.llU != paramInt)
    {
      locala.cg(locala.llU);
      locala.llU = paramInt;
      locala.cg(locala.llU);
    }
    this.exa.bY(paramInt);
    AppMethodBeat.o(110721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView
 * JD-Core Version:    0.6.2
 */