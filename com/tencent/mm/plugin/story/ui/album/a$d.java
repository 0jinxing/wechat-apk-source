package com.tencent.mm.plugin.story.ui.album;

import a.k.m;
import a.l;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumNormalHolder;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumViewHolder;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;", "view", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;Landroid/view/View;)V", "gridAdapter", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter;", "getGridAdapter", "()Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter;", "setGridAdapter", "(Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter;)V", "gridView", "Landroid/support/v7/widget/RecyclerView;", "getGridView", "()Landroid/support/v7/widget/RecyclerView;", "setGridView", "(Landroid/support/v7/widget/RecyclerView;)V", "layoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "getLayoutManager", "()Landroid/support/v7/widget/GridLayoutManager;", "setLayoutManager", "(Landroid/support/v7/widget/GridLayoutManager;)V", "monTv", "Landroid/widget/TextView;", "getMonTv", "()Landroid/widget/TextView;", "setMonTv", "(Landroid/widget/TextView;)V", "yearTv", "getYearTv", "setYearTv", "handleDate", "", "preStoryAlbumInfo", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "storyAlbumInfo", "handleGrid", "handleYearTv", "preHead", "", "head", "yearStr", "", "onBind", "position", "plugin-story_release"})
public final class a$d extends a.e
{
  private TextView rvH;
  private TextView rvJ;
  RecyclerView sgk;
  private d sgl;
  private GridLayoutManager sgm;

  public a$d(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110146);
    paramView = localObject.findViewById(2131827997);
    a.f.b.j.o(paramView, "view.findViewById(R.id.a…_item_decoration_year_tv)");
    this.rvJ = ((TextView)paramView);
    paramView = localObject.findViewById(2131827999);
    a.f.b.j.o(paramView, "view.findViewById(R.id.a…item_decoration_month_tv)");
    this.rvH = ((TextView)paramView);
    paramView = localObject.findViewById(2131828001);
    a.f.b.j.o(paramView, "view.findViewById(R.id.a…tem_decoration_grid_view)");
    this.sgk = ((RecyclerView)paramView);
    this.sgl = new d();
    localObject.getContext();
    this.sgm = new GridLayoutManager(4);
    AppMethodBeat.o(110146);
  }

  public final void Fh(int paramInt)
  {
    AppMethodBeat.i(110145);
    Object localObject1 = a.a(this.sgg).get(paramInt);
    a.f.b.j.o(localObject1, "mItemList[position]");
    Object localObject2 = (c)localObject1;
    Object localObject3;
    if ((paramInt > 0) && (!bo.isEqual(((c)a.a(this.sgg).get(paramInt - 1)).label, a.b(this.sgg))))
    {
      localObject1 = (c)a.a(this.sgg).get(paramInt - 1);
      if (!this.sgg.sgc)
      {
        this.rvH.setVisibility(0);
        localObject3 = ((c)localObject2).label;
        if (m.a((CharSequence)localObject3, ":", 0, false, 6) == -1)
          break label408;
        localObject3 = m.a((CharSequence)localObject3, new String[] { ":" });
        if (((List)localObject3).size() == 2)
        {
          this.rvH.setText((CharSequence)((List)localObject3).get(1));
          if ((localObject1 != null) && (!((c)localObject1).sgn.isEmpty()))
            break label373;
          paramInt = 0;
          label189: int i = ((h)((c)localObject2).sgn.get(0)).rXz.sdV;
          localObject1 = (String)((List)localObject3).get(0);
          paramInt /= 10000;
          i /= 10000;
          if (((paramInt != 0) || (i == a.c(this.sgg))) && ((paramInt == 0) || (i == paramInt)))
            break label396;
          this.rvJ.setVisibility(0);
          this.rvJ.setText((CharSequence)localObject1);
        }
      }
    }
    while (true)
    {
      this.sgk.setLayoutManager((RecyclerView.i)this.sgm);
      this.sgk.setAdapter((RecyclerView.a)this.sgl);
      this.sgl.sgd = this.sgg.sgd;
      localObject1 = this.sgl;
      localObject2 = ((c)localObject2).sgn;
      a.f.b.j.p(localObject2, "datas");
      ((d)localObject1).sgo.clear();
      ((d)localObject1).sgo.addAll((Collection)localObject2);
      ((d)localObject1).notifyDataSetChanged();
      AppMethodBeat.o(110145);
      return;
      localObject1 = null;
      break;
      label373: paramInt = ((h)((c)localObject1).sgn.get(0)).rXz.sdV;
      break label189;
      label396: this.rvJ.setVisibility(8);
      continue;
      label408: this.rvH.setText((CharSequence)localObject3);
      this.rvJ.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.a.d
 * JD-Core Version:    0.6.2
 */