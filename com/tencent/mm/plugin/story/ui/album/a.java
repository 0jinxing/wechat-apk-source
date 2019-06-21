package com.tencent.mm.plugin.story.ui.album;

import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumAdapter$StoryAlbumViewHolder;", "()V", "ITEM_TYPE_FAVORITE", "", "ITEM_TYPE_LOADING", "ITEM_TYPE_NOMAL", "LABEL_FAVORITE", "", "LABEL_LOAD_MORE", "mFavList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lkotlin/collections/ArrayList;", "mIsAll", "", "mIsSelectFavorite", "getMIsSelectFavorite", "()Z", "setMIsSelectFavorite", "(Z)V", "mItemList", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumInfo;", "mOnFavItemClickListener", "Lkotlin/Function0;", "", "getMOnFavItemClickListener", "()Lkotlin/jvm/functions/Function0;", "setMOnFavItemClickListener", "(Lkotlin/jvm/functions/Function0;)V", "mOnGridItemClickListener", "Lkotlin/Function1;", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "Lkotlin/ParameterName;", "name", "info", "getMOnGridItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setMOnGridItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "mRawDataCount", "mThisYear", "calculateStoryCount", "findPositionInGallery", "storyInfo", "getFavItemDateList", "getItemCount", "getItemDateList", "getItemViewType", "position", "hasFavStoryChanged", "datas", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onIsAll", "updateDatas", "", "updateFavStory", "Companion", "StoryAlbumFavHolder", "StoryAlbumLoadingHolder", "StoryAlbumNormalHolder", "StoryAlbumViewHolder", "plugin-story_release"})
public final class a extends RecyclerView.a<a.e>
{
  static final String TAG = "MicroMsg.StoryAlbumAdapter";
  public static final a.a sgf;
  ArrayList<c> mItemList;
  private final int rFe;
  boolean rFn;
  private final String sfV;
  private final String sfW;
  private final int sfX;
  private final int sfY;
  private ArrayList<com.tencent.mm.plugin.story.h.j> sfZ;
  private final int sga;
  private int sgb;
  boolean sgc;
  a.f.a.b<? super h, y> sgd;
  a.f.a.a<y> sge;

  static
  {
    AppMethodBeat.i(110156);
    sgf = new a.a((byte)0);
    TAG = "MicroMsg.StoryAlbumAdapter";
    AppMethodBeat.o(110156);
  }

  public a()
  {
    AppMethodBeat.i(110155);
    this.sfV = "loadingMore";
    this.sfW = "favorite";
    this.rFe = 1;
    this.sfY = 2;
    this.mItemList = new ArrayList();
    this.sfZ = new ArrayList();
    b.a locala = com.tencent.mm.plugin.story.e.b.rRO;
    this.sga = new GregorianCalendar().get(1);
    AppMethodBeat.o(110155);
  }

  public final void dJ(List<c> paramList)
  {
    AppMethodBeat.i(110151);
    a.f.b.j.p(paramList, "datas");
    ab.i(TAG, "updateDatas");
    this.mItemList.clear();
    if ((com.tencent.mm.plugin.story.c.a.a.rQZ.cwU()) && (!this.sgc))
    {
      this.mItemList.add(new c(this.sfW, null, 2));
      ab.i(TAG, "updateDatas add fav");
    }
    this.mItemList.addAll((Collection)paramList);
    Iterator localIterator = ((Iterable)this.mItemList).iterator();
    while (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      int i = this.sgb;
      this.sgb = (localc.sgn.size() + i);
    }
    if (!paramList.isEmpty())
      this.mItemList.add(new c(this.sfV, null, 2));
    notifyDataSetChanged();
    AppMethodBeat.o(110151);
  }

  public final int e(com.tencent.mm.plugin.story.h.j paramj)
  {
    AppMethodBeat.i(110154);
    a.f.b.j.p(paramj, "storyInfo");
    ab.d(TAG, "storyLocalId=" + (int)paramj.xDa);
    int i = ((Collection)this.mItemList).size();
    int j = 0;
    int k = 0;
    if (j < i)
    {
      Iterator localIterator = ((c)this.mItemList.get(j)).sgn.iterator();
      label84: if (localIterator.hasNext())
        if ((int)((h)localIterator.next()).rXz.xDa == (int)paramj.xDa)
        {
          ab.d(TAG, "findPositionInGallery index=%s", new Object[] { Integer.valueOf(k) });
          AppMethodBeat.o(110154);
        }
    }
    while (true)
    {
      return k;
      k++;
      break label84;
      j++;
      break;
      AppMethodBeat.o(110154);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110150);
    int i = this.mItemList.size();
    AppMethodBeat.o(110150);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(110149);
    if (bo.isEqual(((c)this.mItemList.get(paramInt)).label, this.sfV))
    {
      paramInt = this.rFe;
      AppMethodBeat.o(110149);
    }
    while (true)
    {
      return paramInt;
      if (bo.isEqual(((c)this.mItemList.get(paramInt)).label, this.sfW))
      {
        paramInt = this.sfY;
        AppMethodBeat.o(110149);
      }
      else
      {
        paramInt = this.sfX;
        AppMethodBeat.o(110149);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.a
 * JD-Core Version:    0.6.2
 */