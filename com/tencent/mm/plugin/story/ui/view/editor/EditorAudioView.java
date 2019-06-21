package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.b;
import a.f.a.m;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.an;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.InsectRelativeLayout;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.d;
import com.tencent.mm.plugin.story.model.audio.f.a;
import com.tencent.mm.plugin.story.ui.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ah;
import com.tencent.mm.vending.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView;", "Lcom/tencent/mm/emoji/view/InsectRelativeLayout;", "Lcom/tencent/mm/media/editor/panel/IEditorPanel;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "audioAdapter", "Lcom/tencent/mm/plugin/story/ui/adapter/RecommendMusicAdapter;", "audioRecycler", "Landroid/support/v7/widget/RecyclerView;", "audioSearchPanel", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioSearchView;", "audioTask", "Lcom/tencent/mm/plugin/story/model/audio/GetRecommendAudioTask;", "callback", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$AudioCallback;", "getCallback", "()Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$AudioCallback;", "setCallback", "(Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$AudioCallback;)V", "currentMusicPostion", "iconMuteMusic", "Landroid/widget/ImageView;", "iconMuteOrigin", "muteOrigin", "", "panel", "Landroid/view/View;", "scrollListener", "com/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$scrollListener$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$scrollListener$1;", "searchBtn", "searchIv", "taskFinished", "visibleCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "visible", "", "withMusic", "addAudioList", "audioList", "", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicInfo;", "back", "getMusicRequestId", "", "initAudioSearchPanel", "insectBottom", "bottom", "isShow", "refreshAudioList", "reset", "selectItem", "position", "setMusicPlayer", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setOnVisibleChangeCallback", "setShow", "show", "setShowAudioPanel", "setup", "videoPath", "startTime", "endTime", "showSearchPanel", "updateMusicMuteStatus", "music", "AudioCallback", "plugin-story_release"})
public final class EditorAudioView extends InsectRelativeLayout
{
  private final String TAG;
  private b<? super Boolean, y> eUw;
  boolean rYp;
  private final View skU;
  private final RecyclerView skV;
  final ImageView skW;
  final ImageView skX;
  private final ImageView skY;
  private final View skZ;
  final EditorAudioSearchView sla;
  final e slb;
  private int slc;
  com.tencent.mm.plugin.story.model.audio.f sld;
  boolean sle;
  boolean slf;
  private EditorAudioView.a slg;
  private final EditorAudioView.d slh;

  public EditorAudioView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110532);
    AppMethodBeat.o(110532);
  }

  public EditorAudioView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110531);
    this.TAG = "MicroMsg.EditorAudioView";
    this.slh = new EditorAudioView.d(this);
    View.inflate(paramContext, 2130970857, (ViewGroup)this);
    paramAttributeSet = findViewById(2131828017);
    j.o(paramAttributeSet, "findViewById(R.id.story_audio_panel)");
    this.skU = paramAttributeSet;
    paramAttributeSet = findViewById(2131828018);
    j.o(paramAttributeSet, "findViewById(R.id.story_esitor_search_btn)");
    this.skZ = paramAttributeSet;
    paramAttributeSet = findViewById(2131828021);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_audio_recycler)");
    this.skV = ((RecyclerView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828028);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_audio_search_panel)");
    this.sla = ((EditorAudioSearchView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828019);
    j.o(paramAttributeSet, "findViewById(R.id.story_item_audio_search_icon)");
    this.skY = ((ImageView)paramAttributeSet);
    this.skV.setLayoutManager((RecyclerView.i)new LinearLayoutManager(0));
    this.slb = new e();
    new an().i(this.skV);
    this.skV.setAdapter((RecyclerView.a)this.slb);
    paramAttributeSet = new StateListDrawable();
    Drawable localDrawable = paramContext.getResources().getDrawable(2131231431);
    paramAttributeSet.addState(new int[] { 16842919 }, localDrawable);
    localDrawable = ah.f(paramContext, 2131231431, -1);
    paramAttributeSet.addState(new int[0], localDrawable);
    this.skY.setImageDrawable((Drawable)paramAttributeSet);
    this.slb.llV = ((m)new EditorAudioView.1(this));
    this.skV.a((RecyclerView.m)this.slh);
    paramAttributeSet = findViewById(2131828026);
    j.o(paramAttributeSet, "findViewById(R.id.story_…r_audio_mute_origin_icon)");
    this.skW = ((ImageView)paramAttributeSet);
    this.skW.setImageDrawable(ah.f(paramContext, 2131232080, -1));
    findViewById(2131828025).setOnClickListener((View.OnClickListener)new EditorAudioView.2(this, paramContext));
    paramAttributeSet = findViewById(2131828023);
    j.o(paramAttributeSet, "findViewById(R.id.story_…or_audio_mute_music_icon)");
    this.skX = ((ImageView)paramAttributeSet);
    this.skX.setImageDrawable(ah.f(paramContext, 2131232080, -1));
    findViewById(2131828022).setOnClickListener((View.OnClickListener)new EditorAudioView.3(this));
    setOnClickListener((View.OnClickListener)new EditorAudioView.4(this));
    this.skZ.setOnClickListener((View.OnClickListener)new EditorAudioView.5(this));
    this.skU.setTranslationY(getResources().getDimension(2131428691));
    this.sla.setCallback((EditorAudioSearchView.a)new EditorAudioView.b(this));
    AppMethodBeat.o(110531);
  }

  private final void lM(boolean paramBoolean)
  {
    AppMethodBeat.i(110526);
    if (!paramBoolean)
      this.skX.setImageDrawable(ah.f(getContext(), 2131232081, -1));
    while (true)
    {
      this.slf = paramBoolean;
      AppMethodBeat.o(110526);
      return;
      this.skX.setImageDrawable(ah.f(getContext(), 2131232080, -1));
    }
  }

  private final void lN(boolean paramBoolean)
  {
    AppMethodBeat.i(110527);
    if (paramBoolean)
    {
      this.sla.setShow(true);
      AppMethodBeat.o(110527);
    }
    while (true)
    {
      return;
      this.sla.setShow(false);
      AppMethodBeat.o(110527);
    }
  }

  private final void setShowAudioPanel(boolean paramBoolean)
  {
    AppMethodBeat.i(110525);
    if (paramBoolean)
    {
      this.skU.setVisibility(0);
      this.skU.animate().cancel();
      this.skU.animate().translationY(0.0F).start();
      AppMethodBeat.o(110525);
    }
    while (true)
    {
      return;
      this.skU.animate().cancel();
      this.skU.animate().translationY(this.skU.getHeight()).withEndAction((Runnable)new EditorAudioView.f(this)).start();
      AppMethodBeat.o(110525);
    }
  }

  public final void Fj(int paramInt)
  {
    AppMethodBeat.i(110523);
    Object localObject1;
    int i;
    Object localObject2;
    if (this.slb.llU != paramInt)
    {
      localObject1 = this.slb.Fg(paramInt);
      if (localObject1 == null)
        break label75;
      i = ((AudioCacheInfo)localObject1).type;
      localObject2 = AudioCacheInfo.rUj;
      if (i != AudioCacheInfo.cyM())
        break label75;
      localObject1 = this.slg;
      if (localObject1 != null)
        ((EditorAudioView.a)localObject1).d(null);
    }
    while (true)
    {
      this.slc = paramInt;
      AppMethodBeat.o(110523);
      return;
      label75: if (localObject1 != null)
      {
        i = ((AudioCacheInfo)localObject1).type;
        localObject2 = AudioCacheInfo.rUj;
        if (i == AudioCacheInfo.cyK())
        {
          this.slb.setSelection(null);
          localObject2 = this.slg;
          if (localObject2 != null)
            ((EditorAudioView.a)localObject2).d((AudioCacheInfo)localObject1);
          lN(true);
          setShowAudioPanel(false);
        }
      }
      else
      {
        this.slb.setSelection(Integer.valueOf(paramInt));
        localObject2 = this.slg;
        if (localObject2 != null)
          ((EditorAudioView.a)localObject2).d((AudioCacheInfo)localObject1);
        lM(true);
      }
    }
  }

  public final boolean aFF()
  {
    boolean bool = false;
    AppMethodBeat.i(110529);
    int i;
    if (getVisibility() != 0)
    {
      if (this.sla.getVisibility() == 0)
      {
        i = 1;
        if (i == 0)
          break label46;
      }
    }
    else
    {
      AppMethodBeat.o(110529);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label46: AppMethodBeat.o(110529);
    }
  }

  public final EditorAudioView.a getCallback()
  {
    return this.slg;
  }

  public final long getMusicRequestId()
  {
    com.tencent.mm.plugin.story.model.audio.f localf = this.sld;
    if (localf != null);
    for (long l = localf.rUB; ; l = -1L)
      return l;
  }

  public final boolean jn(int paramInt)
  {
    AppMethodBeat.i(110530);
    View localView = this.skU;
    if (localView.getPaddingBottom() != paramInt)
      localView.post((Runnable)new EditorAudioView.c(localView, paramInt));
    AppMethodBeat.o(110530);
    return true;
  }

  public final void setCallback(EditorAudioView.a parama)
  {
    this.slg = parama;
  }

  public final void setMusicPlayer(v paramv)
  {
    AppMethodBeat.i(110524);
    j.p(paramv, "player");
    this.slb.setMusicPlayer(paramv);
    this.sla.setMusicPlayer(paramv);
    AppMethodBeat.o(110524);
  }

  public final void setOnVisibleChangeCallback(b<? super Boolean, y> paramb)
  {
    this.eUw = paramb;
  }

  public final void setShow(boolean paramBoolean)
  {
    AppMethodBeat.i(110528);
    Object localObject;
    if (paramBoolean)
    {
      setVisibility(0);
      localObject = this.eUw;
      if (localObject != null)
        ((b)localObject).am(Boolean.TRUE);
      this.skU.animate().cancel();
      this.skU.animate().translationY(0.0F).start();
      if (this.sle)
        break label235;
      localObject = this.sld;
      if (localObject != null)
      {
        ab.i(((com.tencent.mm.plugin.story.model.audio.f)localObject).TAG, "loadMore: " + ((com.tencent.mm.plugin.story.model.audio.f)localObject).isLoading);
        if (!((com.tencent.mm.plugin.story.model.audio.f)localObject).isLoading)
        {
          ((com.tencent.mm.plugin.story.model.audio.f)localObject).isLoading = true;
          new d(((com.tencent.mm.plugin.story.model.audio.f)localObject).rUA, ((com.tencent.mm.plugin.story.model.audio.f)localObject).cEB, ((com.tencent.mm.plugin.story.model.audio.f)localObject).cGm, ((com.tencent.mm.plugin.story.model.audio.f)localObject).rUB, (byte)0).acy().b((a)new f.a((com.tencent.mm.plugin.story.model.audio.f)localObject));
        }
        AppMethodBeat.o(110528);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110528);
      continue;
      localObject = this.eUw;
      if (localObject != null)
        ((b)localObject).am(Boolean.FALSE);
      this.skU.animate().cancel();
      this.skU.animate().translationY(this.skU.getHeight()).withEndAction((Runnable)new EditorAudioView.e(this)).start();
      label235: AppMethodBeat.o(110528);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView
 * JD-Core Version:    0.6.2
 */