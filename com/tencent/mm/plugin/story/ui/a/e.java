package com.tencent.mm.plugin.story.ui.a;

import a.f.a.m;
import a.l;
import a.y;
import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo.a;
import com.tencent.mm.plugin.story.ui.view.AudioWaveView;
import com.tencent.mm.plugin.story.ui.view.editor.item.MusicLrcView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$BaseViewHolder;", "()V", "audioList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "Lkotlin/collections/ArrayList;", "itemClickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "position", "info", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "musicPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "queryString", "", "getQueryString", "()Ljava/lang/String;", "setQueryString", "(Ljava/lang/String;)V", "selectedPosition", "addAudioList", "index", "audios", "", "addSearchAudioList", "getItem", "getItemCount", "getItemViewType", "getSelection", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMusicPlayer", "player", "setSelection", "(Ljava/lang/Integer;)V", "updateAudioList", "BaseViewHolder", "Companion", "RecommendMusicLoadingHolder", "RecommendMusicViewHolder", "SearchEntranceViewHolder", "SearchResultLoadingHolder", "SearchResultViewHolder", "plugin-story_release"})
public final class e extends RecyclerView.a<e.a>
{
  private static final String TAG = "MicroMsg.RecommendMusicAdapter";
  public static final e.b sfx;
  public int llU;
  public m<? super Integer, ? super AudioCacheInfo, y> llV;
  public final ArrayList<AudioCacheInfo> sfu;
  public String sfv;
  private v sfw;

  static
  {
    AppMethodBeat.i(110121);
    sfx = new e.b((byte)0);
    TAG = "MicroMsg.RecommendMusicAdapter";
    AppMethodBeat.o(110121);
  }

  public e()
  {
    AppMethodBeat.i(110120);
    this.sfu = new ArrayList();
    this.llU = -1;
    AppMethodBeat.o(110120);
  }

  public final AudioCacheInfo Fg(int paramInt)
  {
    AppMethodBeat.i(110115);
    AudioCacheInfo localAudioCacheInfo = (AudioCacheInfo)a.a.j.x((List)this.sfu, paramInt);
    AppMethodBeat.o(110115);
    return localAudioCacheInfo;
  }

  public final void dG(List<AudioCacheInfo> paramList)
  {
    AppMethodBeat.i(110111);
    a.f.b.j.p(paramList, "audios");
    this.sfu.clear();
    this.sfu.addAll((Collection)paramList);
    notifyDataSetChanged();
    AppMethodBeat.o(110111);
  }

  public final void dH(List<AudioCacheInfo> paramList)
  {
    AppMethodBeat.i(110112);
    a.f.b.j.p(paramList, "audios");
    int i = this.sfu.size();
    Object localObject1 = (List)this.sfu;
    ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
    int j;
    if (localListIterator.hasPrevious())
    {
      localObject1 = localListIterator.previous();
      Object localObject2 = (AudioCacheInfo)localObject1;
      j = ((AudioCacheInfo)localObject2).type;
      AudioCacheInfo.a locala = AudioCacheInfo.rUj;
      if (j != AudioCacheInfo.cyM())
      {
        j = ((AudioCacheInfo)localObject2).type;
        locala = AudioCacheInfo.rUj;
        if (j != AudioCacheInfo.cyN())
        {
          j = ((AudioCacheInfo)localObject2).type;
          localObject2 = AudioCacheInfo.rUj;
          if (j != AudioCacheInfo.cyK())
            break label198;
        }
      }
      j = 1;
      label130: if (j != 0)
      {
        label135: localObject1 = (AudioCacheInfo)localObject1;
        if (localObject1 != null)
          this.sfu.remove(localObject1);
        j = this.sfu.size();
        if (i != j)
          break label209;
        this.sfu.addAll((Collection)paramList);
        at(i, paramList.size());
        AppMethodBeat.o(110112);
      }
    }
    while (true)
    {
      return;
      label198: j = 0;
      break label130;
      break;
      localObject1 = null;
      break label135;
      label209: this.sfu.addAll((Collection)paramList);
      cg(j);
      at(i, paramList.size() - 1);
      AppMethodBeat.o(110112);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(110116);
    int i = this.sfu.size();
    AppMethodBeat.o(110116);
    return i;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(110117);
    Object localObject = Fg(paramInt);
    if (localObject != null)
    {
      paramInt = ((AudioCacheInfo)localObject).type;
      AppMethodBeat.o(110117);
    }
    while (true)
    {
      return paramInt;
      localObject = AudioCacheInfo.rUj;
      paramInt = AudioCacheInfo.cyJ();
      AppMethodBeat.o(110117);
    }
  }

  public final void setMusicPlayer(v paramv)
  {
    AppMethodBeat.i(110114);
    a.f.b.j.p(paramv, "player");
    this.sfw = paramv;
    AppMethodBeat.o(110114);
  }

  public final void setSelection(Integer paramInteger)
  {
    AppMethodBeat.i(110113);
    if (paramInteger == null)
    {
      cg(this.llU);
      this.llU = -1;
      cg(this.llU);
      AppMethodBeat.o(110113);
    }
    while (true)
    {
      return;
      cg(this.llU);
      this.llU = paramInteger.intValue();
      cg(this.llU);
      AppMethodBeat.o(110113);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$BaseViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;Landroid/view/View;)V", "iconView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "loading", "getLoading", "()Landroid/view/View;", "title", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView;", "getTitle", "()Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView;", "waveView", "Lcom/tencent/mm/plugin/story/ui/view/AudioWaveView;", "getWaveView", "()Lcom/tencent/mm/plugin/story/ui/view/AudioWaveView;", "update", "", "position", "", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "plugin-story_release"})
  public final class d extends e.a
  {
    private final ImageView nmi;
    private final View sfA;
    private final MusicLrcView sfB;
    private final AudioWaveView sfC;

    public d()
    {
      super(localObject);
      AppMethodBeat.i(110106);
      this$1 = localObject.findViewById(2131828114);
      a.f.b.j.o(e.this, "itemView.findViewById(R.…story_item_audio_loading)");
      this.sfA = e.this;
      this$1 = localObject.findViewById(2131828165);
      a.f.b.j.o(e.this, "itemView.findViewById(R.…story_item_audio_preview)");
      this.nmi = ((ImageView)e.this);
      this$1 = localObject.findViewById(2131828167);
      a.f.b.j.o(e.this, "itemView.findViewById(R.id.story_item_audio_title)");
      this.sfB = ((MusicLrcView)e.this);
      this$1 = localObject.findViewById(2131828166);
      a.f.b.j.o(e.this, "itemView.findViewById(R.id.waveView)");
      this.sfC = ((AudioWaveView)e.this);
      AppMethodBeat.o(110106);
    }

    public final void a(int paramInt, AudioCacheInfo paramAudioCacheInfo)
    {
      boolean bool = true;
      int i = -16777216;
      AppMethodBeat.i(110105);
      a.f.b.j.p(paramAudioCacheInfo, "info");
      Object localObject1 = this.apJ;
      a.f.b.j.o(localObject1, "itemView");
      ((View)localObject1).setEnabled(true);
      if (paramInt == e.a(e.this))
      {
        localObject1 = this.apJ;
        a.f.b.j.o(localObject1, "itemView");
        ((View)localObject1).setSelected(bool);
        ab.i(e.access$getTAG$cp(), "LogStory: ".concat(String.valueOf(bool)));
        localObject1 = this.nmi;
        Object localObject2 = this.apJ;
        a.f.b.j.o(localObject2, "itemView");
        localObject2 = ((View)localObject2).getContext();
        if (!bool)
          break label245;
        paramInt = -16777216;
        label114: ((ImageView)localObject1).setImageDrawable(ah.f((Context)localObject2, 2131231422, paramInt));
        this.nmi.setVisibility(0);
        this.sfC.setVisibility(0);
        this.sfC.setShow(bool);
        this.sfC.setPlayer(e.b(e.this));
        this.sfB.setShow(bool);
        localObject1 = this.sfB;
        if (!bool)
          break label250;
      }
      label245: label250: for (paramInt = i; ; paramInt = -1)
      {
        ((MusicLrcView)localObject1).setTextColor(paramInt);
        this.sfB.setPlayer(e.b(e.this));
        MusicLrcView.a(this.sfB, paramAudioCacheInfo.rTX);
        this.sfB.setVisibility(0);
        this.sfA.setVisibility(8);
        AppMethodBeat.o(110105);
        return;
        bool = false;
        break;
        paramInt = -1;
        break label114;
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$SearchResultLoadingHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$BaseViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;Landroid/view/View;)V", "plugin-story_release"})
  public final class f extends e.a
  {
    public f()
    {
      super(localObject);
      AppMethodBeat.i(110108);
      AppMethodBeat.o(110108);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.e
 * JD-Core Version:    0.6.2
 */