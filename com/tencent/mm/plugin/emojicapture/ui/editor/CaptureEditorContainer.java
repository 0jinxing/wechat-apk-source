package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.a.e;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.t;
import com.tencent.mm.api.t.a;
import com.tencent.mm.api.u;
import com.tencent.mm.media.editor.view.TextColorSelector;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.b.a;
import com.tencent.mm.plugin.emojicapture.c.b.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.f;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "addEmojiIcon", "Landroid/widget/ImageView;", "addEmojiIconNor", "Landroid/graphics/drawable/Drawable;", "addEmojiIconSel", "addEmojiView", "Landroid/view/View;", "backBtn", "captureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "changeTextRoot", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView;", "editorItemContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "editorTypeRoot", "mixBtn", "presenter", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IPresenter;", "getPresenter", "()Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IPresenter;", "setPresenter", "(Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IPresenter;)V", "removeBgIcon", "removeBgIconNor", "removeBgIconSel", "removeBgView", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "smileyPanel", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel;", "speedUpIcon", "speedUpIconNor", "speedUpIconSel", "speedUpView", "startTick", "", "getStartTick", "()J", "setStartTick", "(J)V", "videoCallback", "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$videoCallback$1", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$videoCallback$1;", "videoPlayView", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "videoPlayViewContainer", "Landroid/view/ViewGroup;", "videoPreparedCallback", "Lkotlin/Function0;", "", "createDrawable", "selected", "normal", "selectedColor", "normalColor", "destroy", "getItemContainer", "getVideoPlayView", "initSmileyPanel", "isShow", "", "isShowSmileyPanel", "isShowTextEditor", "reset", "setReporter", "setVisibility", "visibility", "setup", "videoPath", "removeBgEnable", "removeBg", "toggleSmileyPanel", "show", "toggleTextEditor", "text", "", "textColor", "viewPrepared", "plugin-emojicapture_release"})
public final class CaptureEditorContainer extends RelativeLayout
  implements b.b
{
  private final String TAG;
  private final ChatFooterPanel eAk;
  private long eyR;
  private EmojiCaptureReporter lha;
  private b.a lmT;
  private com.tencent.mm.plugin.emojicapture.model.a.a lmU;
  private final ViewGroup lmV;
  private EmojiVideoPlayTextureView lmW;
  private EditorItemContainer lmX;
  private EditorChangeTextView lmY;
  private View lmZ;
  private View lna;
  private View lnb;
  private View lnc;
  private final ImageView lnd;
  private final ImageView lne;
  private final ImageView lnf;
  private ImageView lnh;
  private ImageView lni;
  private final Drawable lnj;
  private final Drawable lnk;
  private final Drawable lnl;
  private final Drawable lnm;
  private final Drawable lnn;
  private final Drawable lno;
  private a.f.a.a<y> lnp;
  private final c lnq;

  public CaptureEditorContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(3052);
    AppMethodBeat.o(3052);
  }

  public CaptureEditorContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3051);
    this.TAG = "MicroMsg.CaptureEditorContainer";
    this.lmU = new com.tencent.mm.plugin.emojicapture.model.a.a();
    View.inflate(paramContext, 2130969336, (ViewGroup)this);
    paramAttributeSet = findViewById(2131823455);
    j.o(paramAttributeSet, "findViewById(R.id.emoji_…e_video_play_view_layout)");
    this.lmV = ((ViewGroup)paramAttributeSet);
    paramAttributeSet = findViewById(2131823456);
    j.o(paramAttributeSet, "findViewById(R.id.editor_item_container)");
    this.lmX = ((EditorItemContainer)paramAttributeSet);
    paramAttributeSet = findViewById(2131823403);
    j.o(paramAttributeSet, "findViewById(R.id.change_text_root)");
    this.lmY = ((EditorChangeTextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823457);
    j.o(paramAttributeSet, "findViewById(R.id.editor_type_root)");
    this.lmZ = paramAttributeSet;
    paramAttributeSet = findViewById(2131823458);
    j.o(paramAttributeSet, "findViewById(R.id.editor_remove_background)");
    this.lna = paramAttributeSet;
    paramAttributeSet = findViewById(2131823461);
    j.o(paramAttributeSet, "findViewById(R.id.editor_speed_up)");
    this.lnb = paramAttributeSet;
    paramAttributeSet = findViewById(2131823464);
    j.o(paramAttributeSet, "findViewById(R.id.editor_add_emoji)");
    this.lnc = paramAttributeSet;
    paramAttributeSet = findViewById(2131823459);
    j.o(paramAttributeSet, "findViewById(R.id.editor_remove_background_icon)");
    this.lnd = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823462);
    j.o(paramAttributeSet, "findViewById(R.id.editor_speed_up_icon)");
    this.lne = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823465);
    j.o(paramAttributeSet, "findViewById(R.id.editor_add_emoji_icon)");
    this.lnf = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823468);
    j.o(paramAttributeSet, "findViewById(R.id.to_capture)");
    this.lnh = ((ImageView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823470);
    j.o(paramAttributeSet, "findViewById(R.id.mix_video)");
    this.lni = ((ImageView)paramAttributeSet);
    paramAttributeSet = ah.f(paramContext, 2131231430, com.tencent.mm.plugin.emojicapture.ui.a.dg(this));
    j.o(paramAttributeSet, "getColorDrawable(context…ve_bg, getIconSelColor())");
    this.lnj = paramAttributeSet;
    paramAttributeSet = ah.f(paramContext, 2131231485, com.tencent.mm.plugin.emojicapture.ui.a.dh(this));
    j.o(paramAttributeSet, "getColorDrawable(context…ve_bg, getIconNorColor())");
    this.lnk = paramAttributeSet;
    paramAttributeSet = ah.f(paramContext, 2131231427, com.tencent.mm.plugin.emojicapture.ui.a.dg(this));
    j.o(paramAttributeSet, "getColorDrawable(context…ickly, getIconSelColor())");
    this.lnl = paramAttributeSet;
    paramAttributeSet = ah.f(paramContext, 2131231481, com.tencent.mm.plugin.emojicapture.ui.a.dh(this));
    j.o(paramAttributeSet, "getColorDrawable(context…ickly, getIconNorColor())");
    this.lnm = paramAttributeSet;
    paramAttributeSet = ah.f(paramContext, 2131231396, com.tencent.mm.plugin.emojicapture.ui.a.dg(this));
    j.o(paramAttributeSet, "getColorDrawable(context…emoji, getIconSelColor())");
    this.lnn = paramAttributeSet;
    paramAttributeSet = ah.f(paramContext, 2131231437, com.tencent.mm.plugin.emojicapture.ui.a.dh(this));
    j.o(paramAttributeSet, "getColorDrawable(context…emoji, getIconNorColor())");
    this.lno = paramAttributeSet;
    this.lnd.setImageDrawable(this.lnk);
    this.lne.setImageDrawable(this.lnm);
    this.lnf.setImageDrawable(this.lno);
    this.lnh.setImageDrawable(ah.f(paramContext, 2131231482, com.tencent.mm.plugin.emojicapture.ui.a.dh(this)));
    this.lni.setImageDrawable(ah.f(paramContext, 2131231414, com.tencent.mm.plugin.emojicapture.ui.a.dg(this)));
    this.lna.setOnClickListener((View.OnClickListener)new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(3025);
        EmojiCaptureReporter.a(10, CaptureEditorContainer.c(this.lnr).ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, CaptureEditorContainer.c(this.lnr).scene);
        Object localObject = CaptureEditorContainer.d(this.lnr);
        paramAnonymousView = this.lnr.getPresenter();
        boolean bool;
        if (paramAnonymousView != null)
        {
          bool = paramAnonymousView.bmx();
          ((View)localObject).setSelected(bool);
          localObject = CaptureEditorContainer.e(this.lnr);
          if (!CaptureEditorContainer.d(this.lnr).isSelected())
            break label116;
        }
        label116: for (paramAnonymousView = CaptureEditorContainer.f(this.lnr); ; paramAnonymousView = CaptureEditorContainer.g(this.lnr))
        {
          ((ImageView)localObject).setImageDrawable(paramAnonymousView);
          AppMethodBeat.o(3025);
          return;
          bool = false;
          break;
        }
      }
    });
    this.lnb.setOnClickListener((View.OnClickListener)new CaptureEditorContainer.2(this));
    this.lnc.setOnClickListener((View.OnClickListener)new CaptureEditorContainer.3(this));
    findViewById(2131823467).setOnClickListener((View.OnClickListener)new CaptureEditorContainer.4(this));
    findViewById(2131823469).setOnClickListener((View.OnClickListener)new CaptureEditorContainer.5(this));
    setOnClickListener((View.OnClickListener)new CaptureEditorContainer.6(this));
    this.lmY.setCallback((EditorChangeTextView.a)new CaptureEditorContainer.7(this));
    this.lmX.setStateChangeListener((EditorItemContainer.b)new CaptureEditorContainer.8(this));
    paramContext = u.aR(paramContext);
    j.o(paramContext, "SmileyPanelFactory.getmSmileyPanel(context)");
    this.eAk = ((ChatFooterPanel)paramContext);
    ab.i(this.TAG, "initSmileyPanel " + this.eAk);
    this.eAk.setEntranceScene(ChatFooterPanel.vhl);
    this.eAk.setBackgroundResource(2130838551);
    this.eAk.AE();
    this.eAk.bf(true);
    this.eAk.j(true, true);
    this.eAk.setVisibility(8);
    this.eAk.onResume();
    paramContext = u.AH();
    j.o(paramContext, "callbackWrapper");
    paramContext.a((t.a)new CaptureEditorContainer.a(this));
    this.eAk.setCallback((f)paramContext);
    paramContext = new RelativeLayout.LayoutParams(-1, com.tencent.mm.bz.a.fromDPToPix(getContext(), 230));
    paramContext.addRule(12);
    addView((View)this.eAk, (ViewGroup.LayoutParams)paramContext);
    this.eAk.setTranslationY(paramContext.height);
    this.lnq = new c(this);
    AppMethodBeat.o(3051);
  }

  public final void a(com.tencent.mm.plugin.emojicapture.model.a.a parama, String paramString, boolean paramBoolean1, boolean paramBoolean2, a.f.a.a<y> parama1)
  {
    AppMethodBeat.i(3040);
    j.p(parama, "captureInfo");
    j.p(paramString, "videoPath");
    this.lmU = parama;
    parama = getContext();
    j.o(parama, "context");
    this.lmW = new EmojiVideoPlayTextureView(parama);
    this.lmV.addView((View)this.lmW);
    parama = this.lmW;
    if (parama != null)
      parama.setRemoveBgEnable(paramBoolean1);
    parama = this.lmW;
    if (parama != null)
      parama.setVideoCallback((e.a)this.lnq);
    parama = this.lmW;
    if (parama != null)
      parama.setVideoPath(paramString);
    parama = this.lmW;
    if (parama != null)
      parama.setAlpha(0.0F);
    if (!paramBoolean1)
    {
      this.lna.setEnabled(false);
      this.lna.setSelected(false);
      this.lnd.setImageDrawable(this.lnk);
      this.lna.setAlpha(0.3F);
      this.lnp = parama1;
      AppMethodBeat.o(3040);
      return;
    }
    this.lna.setEnabled(true);
    this.lna.setAlpha(1.0F);
    this.lna.setSelected(paramBoolean2);
    paramString = this.lnd;
    if (this.lna.isSelected());
    for (parama = this.lnj; ; parama = this.lnk)
    {
      paramString.setImageDrawable(parama);
      break;
    }
  }

  public final void a(boolean paramBoolean, CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(3045);
    if (paramBoolean)
    {
      this.lmY.setVisibility(0);
      EditorChangeTextView localEditorChangeTextView = this.lmY;
      localEditorChangeTextView.jgG.setText(paramCharSequence);
      if (paramCharSequence != null)
        localEditorChangeTextView.jgG.setSelection(paramCharSequence.length());
      int i = e.k(com.tencent.mm.plugin.emojicapture.ui.a.bnQ(), paramInt);
      paramInt = i;
      if (i == -1)
        paramInt = 0;
      localEditorChangeTextView.lnw.setSelected(paramInt);
      localEditorChangeTextView.lnx = com.tencent.mm.plugin.emojicapture.ui.a.bnQ()[paramInt];
      localEditorChangeTextView.lny = com.tencent.mm.plugin.emojicapture.ui.a.bnR()[paramInt];
      localEditorChangeTextView.jgG.setTextColor(localEditorChangeTextView.lnx);
      localEditorChangeTextView.lnD = false;
      AppMethodBeat.o(3045);
    }
    while (true)
    {
      return;
      this.lmY.cancel();
      AppMethodBeat.o(3045);
    }
  }

  public final boolean aFF()
  {
    AppMethodBeat.i(3043);
    boolean bool;
    if (getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(3043);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3043);
    }
  }

  public final void bmA()
  {
    AppMethodBeat.i(3041);
    Object localObject = this.lmW;
    if (localObject != null)
      ((EmojiVideoPlayTextureView)localObject).setAlpha(1.0F);
    localObject = this.lha;
    if (localObject == null)
      j.avw("reporter");
    ((EmojiCaptureReporter)localObject).lgN = System.currentTimeMillis();
    AppMethodBeat.o(3041);
  }

  public final boolean bmB()
  {
    AppMethodBeat.i(3044);
    boolean bool;
    if (this.lmY.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(3044);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3044);
    }
  }

  public final boolean bmC()
  {
    AppMethodBeat.i(3046);
    boolean bool;
    if (this.eAk.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(3046);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3046);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(3050);
    ab.i(this.TAG, "destroy " + this.eAk);
    this.eAk.destroy();
    AppMethodBeat.o(3050);
  }

  public final void gC(boolean paramBoolean)
  {
    AppMethodBeat.i(3047);
    float f = this.eAk.getLayoutParams().height;
    ImageView localImageView;
    if (paramBoolean)
    {
      this.lnc.setSelected(true);
      this.eAk.setVisibility(0);
      this.eAk.animate().translationY(0.0F).start();
      localImageView = this.lnf;
      if (!this.lnc.isSelected())
        break label125;
    }
    label125: for (Drawable localDrawable = this.lnn; ; localDrawable = this.lno)
    {
      localImageView.setImageDrawable(localDrawable);
      AppMethodBeat.o(3047);
      return;
      this.lnc.setSelected(false);
      this.eAk.animate().translationY(f).withEndAction((Runnable)new CaptureEditorContainer.b(this)).start();
      break;
    }
  }

  public final EditorItemContainer getItemContainer()
  {
    return this.lmX;
  }

  public final b.a getPresenter()
  {
    return this.lmT;
  }

  public final long getStartTick()
  {
    return this.eyR;
  }

  public final EmojiVideoPlayTextureView getVideoPlayView()
  {
    return this.lmW;
  }

  public final void reset()
  {
    AppMethodBeat.i(3048);
    this.lna.setSelected(false);
    this.lnb.setSelected(false);
    this.lnd.setImageDrawable(this.lnk);
    this.lne.setImageDrawable(this.lnm);
    EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = this.lmW;
    if (localEmojiVideoPlayTextureView != null)
      localEmojiVideoPlayTextureView.stop();
    this.lmV.removeView((View)this.lmW);
    this.lmW = null;
    AppMethodBeat.o(3048);
  }

  public final void setPresenter(b.a parama)
  {
    this.lmT = parama;
  }

  public final void setReporter(EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    AppMethodBeat.i(3042);
    j.p(paramEmojiCaptureReporter, "reporter");
    this.lha = paramEmojiCaptureReporter;
    this.lmY.setReporter(paramEmojiCaptureReporter);
    AppMethodBeat.o(3042);
  }

  public final void setStartTick(long paramLong)
  {
    this.eyR = paramLong;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(3049);
    super.setVisibility(paramInt);
    EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = this.lmW;
    if (localEmojiVideoPlayTextureView != null)
    {
      localEmojiVideoPlayTextureView.setVisibility(paramInt);
      AppMethodBeat.o(3049);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(3049);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$videoCallback$1", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$IVideoCallback;", "onCompletion", "", "onError", "what", "", "extra", "onGetVideoSize", "width", "height", "onPlayTime", "playTime", "videoTime", "onPrepared", "plugin-emojicapture_release"})
  public static final class c
    implements e.a
  {
    public final void EA()
    {
      AppMethodBeat.i(3039);
      ab.i(CaptureEditorContainer.a(this.lnr), "onCompletion cost " + bo.az(this.lnr.getStartTick()) + "ms");
      this.lnr.setStartTick(bo.yz());
      Object localObject = CaptureEditorContainer.n(this.lnr);
      if (localObject != null)
      {
        ((EmojiVideoPlayTextureView)localObject).llB = true;
        localObject = ((EmojiVideoPlayTextureView)localObject).llA;
        if (localObject != null)
        {
          ((i)localObject).yI(0);
          AppMethodBeat.o(3039);
        }
      }
      while (true)
      {
        return;
        AppMethodBeat.o(3039);
        continue;
        AppMethodBeat.o(3039);
      }
    }

    public final int dG(int paramInt1, int paramInt2)
    {
      return 0;
    }

    public final void dH(int paramInt1, int paramInt2)
    {
    }

    public final void onError(int paramInt1, int paramInt2)
    {
    }

    public final void pL()
    {
      AppMethodBeat.i(3038);
      EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = CaptureEditorContainer.n(this.lnr);
      if (localEmojiVideoPlayTextureView != null)
        localEmojiVideoPlayTextureView.setOneTimeVideoTextureUpdateCallback((a.f.a.a)new CaptureEditorContainer.c.a(this));
      this.lnr.setStartTick(bo.yz());
      localEmojiVideoPlayTextureView = CaptureEditorContainer.n(this.lnr);
      if (localEmojiVideoPlayTextureView != null)
      {
        localEmojiVideoPlayTextureView.start();
        AppMethodBeat.o(3038);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(3038);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer
 * JD-Core Version:    0.6.2
 */