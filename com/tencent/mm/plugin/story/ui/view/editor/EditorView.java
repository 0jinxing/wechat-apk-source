package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.b.j;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.t;
import com.tencent.mm.api.t.a;
import com.tencent.mm.api.u;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.b.a.bd;
import com.tencent.mm.media.editor.view.TextColorSelector;
import com.tencent.mm.plugin.story.c.a.a.a;
import com.tencent.mm.plugin.story.d.b.b;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo.a;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.b;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.protocal.protobuf.cei;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.ak;
import java.util.ArrayList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/EditorView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/story/contract/EditorContract$IView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "DEFAULT_CLICK_LIMIT_TIME", "", "DEFAULT_NOTIFY_MOMENT_DURATION", "TAG", "", "addAudioCheckView", "Landroid/widget/ImageView;", "addAudioView", "addEmojiView", "addLocation", "addLocationCheckView", "addTextView", "audioPanel", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView;", "blueCheckDrawable", "Landroid/graphics/drawable/Drawable;", "blueColor", "clickTime", "controlGroupPanel", "Landroid/view/ViewGroup;", "controlPanel", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorControlPanel;", "emojiPanel", "Lcom/tencent/mm/media/editor/panel/EditorEmojiPanel;", "favoriteTip", "inputPanel", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView;", "isNotifyMoment", "", "isSetFavorite", "itemContainer", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer;", "menuDialog", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorMoreDialog;", "mixView", "Landroid/view/View;", "moreBtn", "navigationBarHeight", "pendingTextItem", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/TextItemView;", "poiService", "Lcom/tencent/mm/plugin/story/api/ICheckLifePoi;", "presenter", "Lcom/tencent/mm/plugin/story/contract/EditorContract$IPresenter;", "getPresenter", "()Lcom/tencent/mm/plugin/story/contract/EditorContract$IPresenter;", "setPresenter", "(Lcom/tencent/mm/plugin/story/contract/EditorContract$IPresenter;)V", "reportArg", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorView$ReportInfo;", "showLocation", "snsTip", "storyLocation", "Lcom/tencent/mm/protocal/protobuf/StoryLocation;", "videoCallBack", "com/tencent/mm/plugin/story/ui/view/editor/EditorView$videoCallBack$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorView$videoCallBack$1;", "videoLoopEndTime", "", "videoLoopStartTime", "videoPlayView", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "videoPreparedCallback", "Lkotlin/Function0;", "", "back", "checkFavorite", "checkLocation", "checkMoment", "destroy", "getItemContainer", "getLocation", "getLocationResult", "data", "Landroid/content/Intent;", "getMusicRequestId", "getVideoPlayView", "initAudioPanel", "initSafeArea", "initSmileyPanel", "isShow", "isShowAudioPanel", "isShowSmileyPanel", "isShowTextEditor", "onActivityResult", "requestCode", "resultCode", "reportDirectly", "location", "reset", "setFavStory", "setMusicPlayer", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "setNotifySns", "setVisibility", "visibility", "setup", "videoPath", "startTime", "endTime", "toggleAudioPanel", "show", "toggleSmileyPanel", "toggleTextEditor", "text", "", "textColor", "textBgColor", "Companion", "ReportInfo", "plugin-story_release"})
public final class EditorView extends RelativeLayout
  implements b.b
{
  public static final EditorView.a smv;
  public final String TAG;
  private boolean hNp;
  private long iBO;
  private a.f.a.a<y> lnp;
  private final VideoPlayerTextureView oxL;
  private boolean rYq;
  private final ImageView rnO;
  public com.tencent.mm.plugin.story.d.b.a slS;
  private final View slT;
  private final ImageView slU;
  private final ImageView slV;
  private final ImageView slW;
  private final ImageView slX;
  private final ViewGroup slY;
  private final ImageView slZ;
  private final ImageView sma;
  private final EditorControlPanel smb;
  public final EditorItemContainer smc;
  private final EditorInputView smd;
  private final com.tencent.mm.media.editor.b.a sme;
  private final EditorAudioView smf;
  private final ImageView smg;
  private final ImageView smh;
  private double smi;
  private double smj;
  public final cei smk;
  private final int sml;
  private final Drawable smm;
  private final long smn;
  private final long smo;
  private com.tencent.mm.plugin.story.ui.view.editor.item.f smp;
  private boolean smq;
  private int smr;
  private c sms;
  public EditorView.b smt;
  private final EditorView.i smu;

  static
  {
    AppMethodBeat.i(110612);
    smv = new EditorView.a((byte)0);
    AppMethodBeat.o(110612);
  }

  public EditorView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110611);
    AppMethodBeat.o(110611);
  }

  public EditorView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110610);
    this.TAG = "MicroMsg.EditorView";
    this.smk = new cei();
    this.hNp = true;
    this.smn = 2000L;
    this.smo = 3000L;
    this.rYq = true;
    View.inflate(paramContext, 2130970880, (ViewGroup)this);
    this.sml = getResources().getColor(2131689505);
    this.smm = paramContext.getResources().getDrawable(2131231813);
    paramAttributeSet = findViewById(2131828139);
    j.o(paramAttributeSet, "findViewById(R.id.editor_video_play_view)");
    this.oxL = ((VideoPlayerTextureView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828140);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_control_panel)");
    this.smb = ((EditorControlPanel)paramAttributeSet);
    paramAttributeSet = findViewById(2131828127);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_emoji)");
    this.slU = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828128);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_text)");
    this.slV = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828129);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_audio)");
    this.slW = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828131);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_location)");
    this.slX = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828130);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_audio_check)");
    this.slZ = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828132);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_add_location_check)");
    this.sma = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828124);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_control_layout)");
    this.slY = ((ViewGroup)paramAttributeSet);
    paramAttributeSet = findViewById(2131828125);
    j.o(paramAttributeSet, "findViewById(R.id.editor_mix)");
    this.slT = paramAttributeSet;
    paramAttributeSet = findViewById(2131823456);
    j.o(paramAttributeSet, "findViewById(R.id.editor_item_container)");
    this.smc = ((EditorItemContainer)paramAttributeSet);
    paramAttributeSet = findViewById(2131823403);
    j.o(paramAttributeSet, "findViewById(R.id.change_text_root)");
    this.smd = ((EditorInputView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828141);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_audio_panel)");
    this.smf = ((EditorAudioView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828120);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_more)");
    this.rnO = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828121);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_fav_tip)");
    this.smg = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828122);
    j.o(paramAttributeSet, "findViewById(R.id.story_editor_sns_tip)");
    this.smh = ((ImageView)paramAttributeSet);
    this.smg.setImageDrawable(ah.f(paramContext, 2131231432, -1));
    this.smh.setImageDrawable(ah.f(paramContext, 2131231420, -1));
    this.rnO.setImageDrawable(ah.f(paramContext, 2131231421, -1));
    label557: float f1;
    float f2;
    float f3;
    float f4;
    float f5;
    if ((!com.tencent.mm.plugin.story.c.a.a.rQZ.cxh()) && (!com.tencent.mm.plugin.story.c.a.a.rQZ.cwU()))
    {
      this.rnO.setVisibility(8);
      paramAttributeSet = this.slW;
      if (!((a.a)com.tencent.mm.plugin.story.c.a.a.rQZ.Uw()).rRg)
        break label1179;
      paramInt = 0;
      paramAttributeSet.setVisibility(paramInt);
      this.slU.setOnClickListener((View.OnClickListener)new EditorView.1(this));
      this.slV.setOnClickListener((View.OnClickListener)new EditorView.5(this));
      this.slW.setOnClickListener((View.OnClickListener)new EditorView.6(this));
      this.smc.setOnLocationClick((View.OnClickListener)new EditorView.7(this));
      this.smc.setOnTextClick((View.OnClickListener)new EditorView.8(this));
      this.slX.setOnClickListener((View.OnClickListener)new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(110578);
          this.smw.cCA();
          paramAnonymousView = h.scu;
          h.EU(10);
          AppMethodBeat.o(110578);
        }
      });
      this.slT.setOnClickListener((View.OnClickListener)new EditorView.10(this));
      ImageView localImageView = (ImageView)findViewById(2131828119);
      localImageView.setOnClickListener((View.OnClickListener)new EditorView.11(this));
      this.rnO.setOnClickListener((View.OnClickListener)new EditorView.12(this, paramContext));
      this.smc.setDeleteStateListener((a.f.a.b)new EditorView.2(this));
      this.smd.setOnVisibleChangeCallback((a.f.a.b)new EditorView.3(this));
      this.smd.setCallback((EditorInputView.a)new EditorView.4(this));
      this.sme = new com.tencent.mm.media.editor.b.a(paramContext, (ViewGroup)this);
      this.sme.eUw = ((a.f.a.b)new EditorView.e(this));
      paramAttributeSet = this.sme;
      t.a locala = (t.a)new f(this);
      j.p(locala, "callback");
      t localt = u.AH();
      j.o(localt, "callbackWrapper");
      localt.a(locala);
      paramAttributeSet.eAk.setCallback((com.tencent.mm.pluginsdk.ui.chat.f)localt);
      this.smf.setOnVisibleChangeCallback((a.f.a.b)new EditorView.c(this));
      this.smf.setCallback((EditorAudioView.a)new d(this));
      this.slU.setImageDrawable(ah.f(paramContext, 2131231433, -1));
      this.slV.setImageDrawable(ah.f(paramContext, 2131231434, -1));
      this.slW.setImageDrawable(ah.f(paramContext, 2131231422, -1));
      this.slX.setImageDrawable(ah.f(paramContext, 2131231416, -1));
      localImageView.setImageDrawable(ah.f(paramContext, 2131231428, -1));
      this.sma.setImageDrawable(this.smm);
      this.slZ.setImageDrawable(this.smm);
      this.sma.setVisibility(8);
      this.slZ.setVisibility(8);
      this.smr = ak.fr(paramContext);
      paramContext = ak.hy(getContext());
      paramInt = paramContext.y;
      int i = paramContext.x;
      f1 = paramInt / i;
      f2 = paramInt;
      paramContext = com.tencent.mm.plugin.story.h.a.sdm;
      f2 /= com.tencent.mm.plugin.story.h.a.cBp();
      f3 = (i - f2) / 2.0F;
      f4 = i;
      paramContext = com.tencent.mm.plugin.story.h.a.sdm;
      f5 = f4 * com.tencent.mm.plugin.story.h.a.cBo();
      f4 = (paramInt - f5) / 2.0F;
      paramContext = com.tencent.mm.plugin.story.h.a.sdm;
      if (f1 > com.tencent.mm.plugin.story.h.a.cBo())
        break label1185;
      this.smd.bd(f3);
      this.smc.ac(f2, f3);
    }
    while (true)
    {
      this.smu = new EditorView.i(this);
      AppMethodBeat.o(110610);
      return;
      this.rnO.setVisibility(0);
      break;
      label1179: paramInt = 8;
      break label557;
      label1185: paramContext = com.tencent.mm.plugin.story.h.a.sdm;
      if (f1 >= com.tencent.mm.plugin.story.h.a.cBp())
      {
        this.smc.ad(f5, f4);
      }
      else
      {
        this.smd.bd(f3);
        this.smc.ac(f2, f3);
        this.smc.ad(f5, f4);
      }
    }
  }

  public final void a(String paramString, long paramLong1, long paramLong2, a.f.a.a<y> parama)
  {
    AppMethodBeat.i(110600);
    j.p(paramString, "videoPath");
    this.oxL.setVideoCallback((e.a)this.smu);
    this.oxL.setVideoPath(paramString);
    this.oxL.setAlpha(0.0F);
    this.lnp = parama;
    this.smi = (paramLong1 / 1000.0D);
    this.smj = (paramLong2 / 1000.0D);
    parama = this.smf;
    j.p(paramString, "videoPath");
    parama.sle = false;
    parama.sld = new com.tencent.mm.plugin.story.model.audio.f(paramString, paramLong1, paramLong2);
    paramString = parama.sld;
    if (paramString != null)
      paramString.exD = ((a.f.a.b)new EditorAudioView.g(parama));
    parama.slb.setSelection(Integer.valueOf(-1));
    paramString = new ArrayList();
    if (parama.slb.llU != 0)
      parama.slb.setSelection(Integer.valueOf(-1));
    Object localObject = AudioCacheInfo.rUj;
    localObject = new AudioCacheInfo();
    ((AudioCacheInfo)localObject).type = AudioCacheInfo.cyM();
    paramString.add(localObject);
    parama.slb.dG((List)paramString);
    this.hNp = false;
    this.smc.f((a.f.a.a)EditorView.h.smz);
    AppMethodBeat.o(110600);
  }

  public final void a(boolean paramBoolean, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(110602);
    if (paramBoolean)
    {
      this.smd.setShow(true);
      EditorInputView localEditorInputView = this.smd;
      localEditorInputView.slx.setText(paramCharSequence);
      if (paramCharSequence != null)
        localEditorInputView.slx.setSelection(paramCharSequence.length());
      if (paramInt2 != 0)
      {
        paramBoolean = bool;
        localEditorInputView.slB = paramBoolean;
        if (localEditorInputView.slB)
          paramInt1 = paramInt2 | EditorInputView.slD ^ 0xFFFFFFFF;
        localEditorInputView.setSelectedIndex(a.a.e.k(EditorInputView.sjN, paramInt1));
        localEditorInputView.lnw.setSelected(localEditorInputView.biG);
        localEditorInputView.lnD = false;
        localEditorInputView.slz.setActivated(localEditorInputView.slB);
        localEditorInputView.cCx();
        AppMethodBeat.o(110602);
      }
    }
    while (true)
    {
      return;
      paramBoolean = false;
      break;
      this.smd.setShow(false);
      AppMethodBeat.o(110602);
    }
  }

  public final boolean aFF()
  {
    AppMethodBeat.i(110601);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(110601);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110601);
    }
  }

  public final boolean bmC()
  {
    AppMethodBeat.i(110603);
    boolean bool;
    if (this.sme.eAj.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(110603);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110603);
    }
  }

  public final void cCA()
  {
    AppMethodBeat.i(110598);
    Intent localIntent = new Intent();
    if (this.smc.cCB())
      localIntent.putExtra("get_poi_classify_id", this.smk.wCC);
    localIntent.putExtra("get_poi_from_scene", "story");
    localIntent.putExtra("poi_show_none", false);
    localIntent.putExtra("select_radio_icon_color", "#0E9CE6");
    d.b(getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", localIntent, 1003);
    AppMethodBeat.o(110598);
  }

  public final boolean cxq()
  {
    Object localObject = null;
    AppMethodBeat.i(110605);
    int i;
    boolean bool;
    if (this.smd.getVisibility() == 0)
    {
      i = 1;
      if (i == 0)
        break label47;
      a(false, null, 0, 0);
      AppMethodBeat.o(110605);
      bool = true;
    }
    label134: 
    while (true)
    {
      return bool;
      i = 0;
      break;
      label47: if (bmC())
      {
        gC(false);
        AppMethodBeat.o(110605);
        bool = true;
      }
      else
      {
        if (this.smf.aFF())
        {
          EditorAudioView localEditorAudioView = this.smf;
          EditorAudioSearchView localEditorAudioSearchView = localEditorAudioView.sla;
          if (localEditorAudioSearchView.getVisibility() == 0)
          {
            EditText localEditText = localEditorAudioSearchView.skC;
            if (localEditText != null)
              localObject = localEditText.getText();
            if (bo.ac((CharSequence)localObject))
              localEditorAudioSearchView.cCr();
          }
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              localEditorAudioView.setShow(false);
            AppMethodBeat.o(110605);
            bool = true;
            break;
            localEditorAudioSearchView.cCu();
            localObject = com.tencent.mm.plugin.story.model.audio.b.rUx;
            com.tencent.mm.plugin.story.model.audio.b.cyT().cH(1L);
            localObject = com.tencent.mm.plugin.story.model.audio.b.rUx;
            com.tencent.mm.plugin.story.model.audio.b.a.cyU();
            localEditorAudioSearchView.reset();
            localObject = localEditorAudioSearchView.skP;
            if (localObject == null)
              break label134;
            ((EditorAudioSearchView.a)localObject).cCv();
            break label134;
          }
        }
        AppMethodBeat.o(110605);
        bool = false;
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(110607);
    this.oxL.stop();
    this.sme.eAk.destroy();
    AppMethodBeat.o(110607);
  }

  public final void gC(boolean paramBoolean)
  {
    AppMethodBeat.i(110604);
    if (paramBoolean)
    {
      this.sme.setShow(true);
      AppMethodBeat.o(110604);
    }
    while (true)
    {
      return;
      this.sme.setShow(false);
      AppMethodBeat.o(110604);
    }
  }

  public final EditorItemContainer getItemContainer()
  {
    return this.smc;
  }

  public final cei getLocation()
  {
    AppMethodBeat.i(110599);
    cei localcei;
    if (this.hNp)
    {
      localcei = this.smk;
      AppMethodBeat.o(110599);
    }
    while (true)
    {
      return localcei;
      localcei = new cei();
      AppMethodBeat.o(110599);
    }
  }

  public final long getMusicRequestId()
  {
    AppMethodBeat.i(110609);
    long l = this.smf.getMusicRequestId();
    AppMethodBeat.o(110609);
    return l;
  }

  public final com.tencent.mm.plugin.story.d.b.a getPresenter()
  {
    AppMethodBeat.i(110595);
    com.tencent.mm.plugin.story.d.b.a locala = this.slS;
    if (locala == null)
      j.avw("presenter");
    AppMethodBeat.o(110595);
    return locala;
  }

  public final VideoPlayerTextureView getVideoPlayView()
  {
    return this.oxL;
  }

  public final void reset()
  {
    AppMethodBeat.i(110606);
    this.rYq = true;
    this.smq = false;
    Object localObject = this.smc;
    ((EditorItemContainer)localObject).lnI.removeAllViews();
    ((EditorItemContainer)localObject).gI(false);
    localObject = this.smf;
    ((EditorAudioView)localObject).rYp = false;
    ((EditorAudioView)localObject).slf = true;
    ((EditorAudioView)localObject).skW.setImageDrawable(ah.f(((EditorAudioView)localObject).getContext(), 2131232080, -1));
    ((EditorAudioView)localObject).skX.setImageDrawable(ah.f(((EditorAudioView)localObject).getContext(), 2131232080, -1));
    ((EditorAudioView)localObject).sla.reset();
    this.hNp = false;
    this.sma.setVisibility(8);
    this.slZ.setVisibility(8);
    this.smh.setVisibility(8);
    this.smg.setVisibility(8);
    this.smc.f((a.f.a.a)g.smy);
    AppMethodBeat.o(110606);
  }

  public final void setMusicPlayer(v paramv)
  {
    AppMethodBeat.i(110597);
    j.p(paramv, "player");
    this.smf.setMusicPlayer(paramv);
    AppMethodBeat.o(110597);
  }

  public final void setPresenter(com.tencent.mm.plugin.story.d.b.a parama)
  {
    AppMethodBeat.i(110596);
    j.p(parama, "<set-?>");
    this.slS = parama;
    AppMethodBeat.o(110596);
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(110608);
    super.setVisibility(paramInt);
    this.oxL.setVisibility(paramInt);
    AppMethodBeat.o(110608);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorView$initAudioPanel$2", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorAudioView$AudioCallback;", "cancel", "", "confirm", "onAudioSelected", "info", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "pauseAudio", "toggleOrigin", "remove", "", "plugin-story_release"})
  public static final class d
    implements EditorAudioView.a
  {
    public final void d(AudioCacheInfo paramAudioCacheInfo)
    {
      AppMethodBeat.i(110584);
      if (paramAudioCacheInfo != null)
      {
        int i = paramAudioCacheInfo.type;
        AudioCacheInfo.a locala = AudioCacheInfo.rUj;
        if (i == AudioCacheInfo.cyK())
        {
          this.smw.getPresenter().pauseAudio();
          AppMethodBeat.o(110584);
        }
      }
      while (true)
      {
        return;
        this.smw.getPresenter().a(paramAudioCacheInfo);
        AppMethodBeat.o(110584);
      }
    }

    public final void lO(boolean paramBoolean)
    {
      AppMethodBeat.i(110585);
      this.smw.getPresenter().lt(paramBoolean);
      AppMethodBeat.o(110585);
    }

    public final void pauseAudio()
    {
      AppMethodBeat.i(110583);
      this.smw.getPresenter().pauseAudio();
      AppMethodBeat.o(110583);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorView$initSmileyPanel$2", "Lcom/tencent/mm/api/SmileyPanelCallbackWrapper$Callback;", "onHide", "", "onSelectedEmoji", "emojiInfo", "Lcom/tencent/mm/api/IEmojiInfo;", "plugin-story_release"})
  public static final class f
    implements t.a
  {
    public final void a(com.tencent.mm.api.k paramk)
    {
      AppMethodBeat.i(110587);
      j.p(paramk, "emojiInfo");
      ab.i(EditorView.b(this.smw), "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramk });
      EditorItemContainer localEditorItemContainer = EditorView.c(this.smw);
      paramk = (EmojiInfo)paramk;
      j.p(paramk, "emojiInfo");
      com.tencent.mm.plugin.story.ui.view.editor.item.b localb = new com.tencent.mm.plugin.story.ui.view.editor.item.b(localEditorItemContainer.getContext(), false);
      Object localObject = new RelativeLayout.LayoutParams(-1, -1);
      localEditorItemContainer.lnI.addView((View)localb, (ViewGroup.LayoutParams)localObject);
      localObject = com.tencent.mm.plugin.story.f.l.sac;
      localb.setSafeArea(com.tencent.mm.plugin.story.f.l.czI());
      localb.setValidArea(localEditorItemContainer.smH);
      localb.setStateResolve((EditorItemContainer.b)localEditorItemContainer.smU);
      localb.setEmojiInfo(paramk);
      localb.resume();
      localEditorItemContainer.r((View)localb, true);
      localEditorItemContainer.removeCallbacks(localEditorItemContainer.lnN);
      localEditorItemContainer.postDelayed(localEditorItemContainer.lnN, 1500L);
      onHide();
      AppMethodBeat.o(110587);
    }

    public final void onHide()
    {
      AppMethodBeat.i(110588);
      this.smw.gC(false);
      AppMethodBeat.o(110588);
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class g extends a.f.b.k
    implements a.f.a.a<y>
  {
    public static final g smy;

    static
    {
      AppMethodBeat.i(110589);
      smy = new g();
      AppMethodBeat.o(110589);
    }

    g()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView
 * JD-Core Version:    0.6.2
 */