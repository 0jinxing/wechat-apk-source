package com.tencent.mm.plugin.story.ui.a;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.ui.view.editor.item.MusicLrcView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ah;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$SearchResultViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter$BaseViewHolder;", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "itemView", "Landroid/view/View;", "(Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;Landroid/view/View;)V", "searchTipView", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView;", "getSearchTipView", "()Lcom/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView;", "searchTitleView", "Landroid/widget/TextView;", "getSearchTitleView", "()Landroid/widget/TextView;", "searchresultIcon", "Landroid/widget/ImageView;", "getSearchresultIcon", "()Landroid/widget/ImageView;", "update", "", "position", "", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "plugin-story_release"})
public final class e$g extends e.a
{
  private final ImageView sfD;
  private final TextView sfE;
  private final MusicLrcView sfF;

  public e$g(View paramView)
  {
    super(paramView, localObject);
    AppMethodBeat.i(110110);
    paramView = localObject.findViewById(2131828172);
    j.o(paramView, "itemView.findViewById(R.…audio_search_result_icon)");
    this.sfD = ((ImageView)paramView);
    paramView = localObject.findViewById(2131828173);
    j.o(paramView, "itemView.findViewById(R.…udio_search_result_title)");
    this.sfE = ((TextView)paramView);
    paramView = localObject.findViewById(2131828174);
    j.o(paramView, "itemView.findViewById(R.…_audio_search_result_tip)");
    this.sfF = ((MusicLrcView)paramView);
    AppMethodBeat.o(110110);
  }

  public final void a(int paramInt, AudioCacheInfo paramAudioCacheInfo)
  {
    AppMethodBeat.i(110109);
    j.p(paramAudioCacheInfo, "info");
    boolean bool;
    Object localObject2;
    if (paramInt == e.a(this.sfy))
    {
      bool = true;
      localObject1 = this.apJ;
      j.o(localObject1, "itemView");
      ((View)localObject1).setSelected(bool);
      localObject1 = this.sfD;
      localObject2 = this.apJ;
      j.o(localObject2, "itemView");
      localObject2 = ((View)localObject2).getContext();
      if (!bool)
        break label172;
      paramInt = -16777216;
      label76: ((ImageView)localObject1).setImageDrawable(ah.f((Context)localObject2, 2131231422, paramInt));
      localObject2 = this.sfE;
      if (!paramAudioCacheInfo.rTY.isEmpty())
        break label177;
    }
    for (Object localObject1 = (CharSequence)paramAudioCacheInfo.rUa; ; localObject1 = (CharSequence)(paramAudioCacheInfo.rUa + " - " + (String)localObject1))
    {
      ((TextView)localObject2).setText((CharSequence)localObject1);
      this.sfF.setShow(bool);
      this.sfF.setPlayer(e.b(this.sfy));
      this.sfF.f(paramAudioCacheInfo.rTX, this.sfy.sfv);
      AppMethodBeat.o(110109);
      return;
      bool = false;
      break;
      label172: paramInt = -1;
      break label76;
      label177: localObject1 = bo.c((List)paramAudioCacheInfo.rTY, ",");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.a.e.g
 * JD-Core Version:    0.6.2
 */