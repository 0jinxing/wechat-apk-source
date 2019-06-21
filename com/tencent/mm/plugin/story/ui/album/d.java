package com.tencent.mm.plugin.story.ui.album;

import a.f.a.b;
import a.l;
import a.y;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.h;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$StoryAlbumItemViewHolder;", "()V", "mMediaList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryHistoryInfo;", "Lkotlin/collections/ArrayList;", "mOnGridItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "info", "", "getMOnGridItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setMOnGridItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateDatas", "datas", "", "Companion", "StoryAlbumItemViewHolder", "plugin-story_release"})
public final class d extends RecyclerView.a<d.b>
{
  private static final String TAG = "MicroMsg.StoryAlbumItemAdapter";
  public static final d.a sgp;
  b<? super h, y> sgd;
  final ArrayList<h> sgo;

  static
  {
    AppMethodBeat.i(110167);
    sgp = new d.a((byte)0);
    TAG = "MicroMsg.StoryAlbumItemAdapter";
    AppMethodBeat.o(110167);
  }

  public d()
  {
    AppMethodBeat.i(110166);
    this.sgo = new ArrayList();
    AppMethodBeat.o(110166);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110164);
    int i = this.sgo.size();
    AppMethodBeat.o(110164);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.album.d
 * JD-Core Version:    0.6.2
 */