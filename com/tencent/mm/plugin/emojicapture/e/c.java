package com.tencent.mm.plugin.emojicapture.e;

import a.f.b.j;
import a.l;
import a.v;
import a.y;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.b.a;
import com.tencent.mm.plugin.emojicapture.c.b.b;
import com.tencent.mm.plugin.emojicapture.proxy.CgiEmojiTextSpamProxy;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b.a;
import com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView;
import com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer;
import com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView;
import com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/presenter/EditorPresenter;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IPresenter;", "context", "Landroid/content/Context;", "view", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IView;", "uiNavigation", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;", "imitateMd5", "", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IView;Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;Ljava/lang/String;Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "cgiEmojiTextSpamProxy", "Lcom/tencent/mm/plugin/emojicapture/proxy/CgiEmojiTextSpamProxy;", "emojiCaptureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "hideLoadingRunnable", "Ljava/lang/Runnable;", "isRemoveBg", "", "isSpeedup", "mixCallback", "com/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$mixCallback$1", "Lcom/tencent/mm/plugin/emojicapture/presenter/EditorPresenter$mixCallback$1;", "mixingInfo", "Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixInfo;", "originVideoPath", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "textColor", "", "viewPrepared", "voiceText", "voiceTextPrepared", "addEmoji", "", "emojiInfo", "Lcom/tencent/mm/api/IEmojiInfo;", "checkText", "text", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shouldBlock", "createMixingEmojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "attachedText", "attachedEmojiMd5", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "destroy", "exportOriginVideo", "mix", "mixImpl", "onBack", "onVoiceTextFinished", "pause", "prepareCheck", "removeBg", "reset", "resume", "setup", "speedUp", "toggleTouch", "enable", "updateText", "color", "change", "updateTextWithoutCheck", "Companion", "plugin-emojicapture_release"})
public final class c
  implements b.a
{
  public static final c.a lkx;
  private Context context;
  private final com.tencent.mm.remoteservice.d ext;
  private final String eyL;
  private final EmojiCaptureReporter lha;
  private boolean liA;
  private String ljP;
  private com.tencent.mm.plugin.emojicapture.model.a.a ljQ;
  private EmojiCaptureUI.b ljV;
  private String lko;
  private boolean lkp;
  private boolean lkq;
  private boolean lkr;
  private final CgiEmojiTextSpamProxy lks;
  private com.tencent.mm.plugin.emojicapture.model.b.d lkt;
  private final c.e lku;
  private final Runnable lkv;
  private b.b lkw;
  private int textColor;

  static
  {
    AppMethodBeat.i(2794);
    lkx = new c.a((byte)0);
    AppMethodBeat.o(2794);
  }

  public c(Context paramContext, b.b paramb, EmojiCaptureUI.b paramb1, String paramString, EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    AppMethodBeat.i(2793);
    this.context = paramContext;
    this.lkw = paramb;
    this.ljV = paramb1;
    this.eyL = paramString;
    this.lha = paramEmojiCaptureReporter;
    this.ext = new com.tencent.mm.remoteservice.d(this.context);
    this.lks = new CgiEmojiTextSpamProxy(this.ext);
    this.ljQ = new com.tencent.mm.plugin.emojicapture.model.a.a();
    this.lku = new c.e(this);
    this.lkv = ((Runnable)new c.c(this));
    AppMethodBeat.o(2793);
  }

  private final EmojiInfo a(String paramString, int paramInt, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(2786);
    String str1 = this.ljQ.thumbPath;
    String str2 = com.tencent.mm.vfs.e.atg(str1);
    EmojiInfo localEmojiInfo = new EmojiInfo();
    String str3 = EmojiInfo.dvg() + str2;
    if (!com.tencent.mm.a.e.ct(str3))
      com.tencent.mm.vfs.e.y(str1, str3);
    ab.i("MicroMsg.EditorPresenter", "create loading EmojiInfo. md5: " + str2 + " outputPath: " + str3);
    localEmojiInfo.vS(str2);
    localEmojiInfo.aqe("capture");
    localEmojiInfo.Mw(EmojiInfo.yaf);
    localEmojiInfo.field_attachedText = paramString;
    paramString = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    localEmojiInfo.field_width = com.tencent.mm.plugin.emojicapture.model.c.bmN();
    paramString = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    localEmojiInfo.field_height = com.tencent.mm.plugin.emojicapture.model.c.bmN();
    localEmojiInfo.a(EmojiInfo.a.yaD);
    localEmojiInfo.al(paramArrayList);
    localEmojiInfo.field_imitateMd5 = this.eyL;
    localEmojiInfo.field_captureEnterTime = this.lha.ezZ;
    paramString = this.ljQ.lhH;
    if (paramString != null);
    for (paramString = paramString.lgY; ; paramString = null)
    {
      localEmojiInfo.field_lensId = paramString;
      paramString = com.tencent.mm.plugin.emojicapture.model.c.lhw;
      localEmojiInfo.field_attachTextColor = com.tencent.mm.plugin.emojicapture.model.c.a.ut(paramInt);
      localEmojiInfo.field_captureScene = this.lha.scene;
      paramString = EmojiCaptureProxy.lkM;
      EmojiCaptureProxy.access$getInstance$cp().createEmojiInfo(localEmojiInfo);
      AppMethodBeat.o(2786);
      return localEmojiInfo;
    }
  }

  private final void b(String paramString, a.f.a.b<? super Boolean, y> paramb)
  {
    AppMethodBeat.i(2787);
    if (bo.isNullOrNil(paramString))
    {
      paramb.am(Boolean.FALSE);
      AppMethodBeat.o(2787);
    }
    while (true)
    {
      return;
      this.lks.cgiEmojiTextSpam(paramString, (a.f.a.b)new c.b(paramb));
      AppMethodBeat.o(2787);
    }
  }

  private final void bnK()
  {
    AppMethodBeat.i(2785);
    Object localObject1 = new StringBuilder("start mix ");
    Object localObject2 = this.lkw.getVideoPlayView();
    Object localObject3;
    Object localObject4;
    if (localObject2 != null)
    {
      localObject2 = ((EmojiVideoPlayTextureView)localObject2).getVideoPath();
      ab.i("MicroMsg.EditorPresenter", (String)localObject2);
      localObject1 = new com.tencent.mm.plugin.emojicapture.model.b.a(this.lkw.getItemContainer().getValidRect());
      localObject2 = this.lkw.getItemContainer().getAllItemViews();
      localObject3 = this.lkw.getItemContainer().getAllEmojiMd5();
      localObject4 = this.lkw.getItemContainer().getTextItem();
      if (localObject4 == null)
        break label177;
    }
    label177: for (int i = ((TextEditorItemView)localObject4).getTextColor(); ; i = 0)
    {
      localObject4 = this.lkw.getItemContainer().getAttachedText();
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
        ((com.tencent.mm.plugin.emojicapture.model.b.a)localObject1).a(((com.tencent.mm.plugin.emojicapture.ui.editor.a)((Iterator)localObject2).next()).UI());
      localObject2 = null;
      break;
    }
    int j;
    long l;
    label366: boolean bool1;
    boolean bool2;
    if (this.lkt == null)
    {
      this.lha.eyJ = this.lkw.getItemContainer().getAttachedText();
      this.lha.textColor = i;
      this.lha.lgS = this.liA;
      this.lha.lgT = this.lkr;
      this.lha.lgU = ((ArrayList)localObject3).size();
      this.lha.ckF = (System.currentTimeMillis() - this.lha.ezZ);
      EmojiCaptureReporter localEmojiCaptureReporter = this.lha;
      localObject2 = this.ljQ.lhH;
      if (localObject2 != null)
      {
        localObject2 = ((com.tencent.mm.plugin.emojicapture.model.a.b)localObject2).lgY;
        localEmojiCaptureReporter.lgY = ((String)localObject2);
        this.lha.bmv();
        localObject2 = a((String)localObject4, i, (ArrayList)localObject3);
        localObject3 = com.tencent.mm.plugin.emojicapture.model.b.e.liH;
        j = this.ljQ.scene;
        l = ((EmojiInfo)localObject2).field_captureEnterTime;
        localObject3 = this.ljQ.videoPath;
        localObject4 = this.lkw.getVideoPlayView();
        if (localObject4 == null)
          break label509;
        i = (int)((EmojiVideoPlayTextureView)localObject4).getPlayRate();
        bool1 = this.liA;
        if (this.ljQ.lhH == null)
          break label515;
        bool2 = true;
        label385: this.lkt = com.tencent.mm.plugin.emojicapture.model.b.e.a(j, l, (String)localObject3, (com.tencent.mm.plugin.emojicapture.model.b.a)localObject1, i, bool1, bool2, (EmojiInfo)localObject2);
        pause();
        if (!com.tencent.mm.plugin.emojicapture.ui.a.uC(this.ljQ.scene))
          break label652;
        al.af(this.lkv);
        al.n(this.lkv, 60000L);
        localObject1 = this.ljV;
        localObject3 = this.context;
        localObject2 = this.context.getString(2131299056);
        j.o(localObject2, "context.getString(R.string.emoji_generating)");
        EmojiCaptureUI.b.a.a((EmojiCaptureUI.b)localObject1, (Context)localObject3, (CharSequence)localObject2);
        localObject2 = com.tencent.mm.emoji.d.b.ezV;
        com.tencent.mm.emoji.d.b.a(this.ljQ.ezZ, (com.tencent.mm.emoji.d.a)this.lku);
        AppMethodBeat.o(2785);
      }
    }
    while (true)
    {
      return;
      localObject2 = null;
      break;
      label509: i = 1;
      break label366;
      label515: bool2 = false;
      break label385;
      localObject2 = EmojiCaptureProxy.lkM;
      EmojiCaptureProxy.access$getInstance$cp().deleteEmojiInfoByEnterTime(this.lha.ezZ);
      localObject2 = a((String)localObject4, i, (ArrayList)localObject3);
      localObject3 = com.tencent.mm.plugin.emojicapture.model.b.e.liH;
      j = this.ljQ.scene;
      l = ((EmojiInfo)localObject2).field_captureEnterTime;
      localObject4 = this.ljQ.videoPath;
      localObject3 = this.lkw.getVideoPlayView();
      if (localObject3 != null)
      {
        i = (int)((EmojiVideoPlayTextureView)localObject3).getPlayRate();
        label597: bool1 = this.liA;
        if (this.ljQ.lhH == null)
          break label646;
      }
      label646: for (bool2 = true; ; bool2 = false)
      {
        this.lkt = com.tencent.mm.plugin.emojicapture.model.b.e.a(j, l, (String)localObject4, (com.tencent.mm.plugin.emojicapture.model.b.a)localObject1, i, bool1, bool2, (EmojiInfo)localObject2);
        break;
        i = 1;
        break label597;
      }
      label652: EmojiCaptureUI.b.a.a(this.ljV, true);
      AppMethodBeat.o(2785);
    }
  }

  private final void gE(boolean paramBoolean)
  {
    AppMethodBeat.i(2788);
    ab.i("MicroMsg.EditorPresenter", "toggleTouch: ".concat(String.valueOf(paramBoolean)));
    Object localObject;
    if ((this.context instanceof Activity))
    {
      localObject = this.context;
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type android.app.Activity");
        AppMethodBeat.o(2788);
        throw ((Throwable)localObject);
      }
      localObject = (Activity)localObject;
      if (paramBoolean)
      {
        ((Activity)localObject).getWindow().clearFlags(16);
        AppMethodBeat.o(2788);
      }
    }
    while (true)
    {
      return;
      ((Activity)localObject).getWindow().addFlags(16);
      AppMethodBeat.o(2788);
    }
  }

  public final boolean Ab()
  {
    AppMethodBeat.i(2789);
    ab.i("MicroMsg.EditorPresenter", "onBack: " + this.lkw.aFF() + ' ' + this.lkw.bmB() + ' ' + this.lkw.bmC());
    boolean bool;
    if (this.lkw.aFF())
      if (this.lkw.bmB())
      {
        this.lkw.a(false, null, 0);
        bool = true;
        AppMethodBeat.o(2789);
      }
    while (true)
    {
      return bool;
      if (this.lkw.bmC())
      {
        this.lkw.gC(false);
        bool = true;
        AppMethodBeat.o(2789);
      }
      else
      {
        this.liA = false;
        this.lkr = false;
        this.ljP = null;
        this.lkp = false;
        this.lkq = false;
        Object localObject = this.lkw.getVideoPlayView();
        if (localObject != null);
        for (localObject = ((EmojiVideoPlayTextureView)localObject).getVideoPath(); ; localObject = null)
        {
          com.tencent.mm.vfs.e.deleteFile((String)localObject);
          this.lkw.reset();
          localObject = this.lkw.getItemContainer();
          ((EditorItemContainer)localObject).pause();
          ((EditorItemContainer)localObject).lnI.removeAllViews();
          this.lkt = null;
          gE(true);
          this.ljV.bnN();
          EmojiCaptureReporter.a(9, this.lha.ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, this.lha.scene);
          bool = true;
          AppMethodBeat.o(2789);
          break;
        }
        bool = false;
        AppMethodBeat.o(2789);
      }
    }
  }

  public final void JZ(String paramString)
  {
    AppMethodBeat.i(2779);
    ab.i("MicroMsg.EditorPresenter", "voice text callback");
    b(paramString, (a.f.a.b)new c.f(this, paramString));
    AppMethodBeat.o(2779);
  }

  public final void b(com.tencent.mm.plugin.emojicapture.model.a.a parama)
  {
    AppMethodBeat.i(2778);
    j.p(parama, "emojiCaptureInfo");
    ab.i("MicroMsg.EditorPresenter", "setup");
    this.ljQ = parama;
    this.lko = parama.videoPath;
    this.liA = parama.lgS;
    this.textColor = parama.lhJ;
    this.lkw.a(parama, parama.videoPath, parama.lhK, this.liA, (a.f.a.a)new c.h(this));
    com.tencent.mm.ab.b.a("EditorPresenter_setup", (a.f.a.a)new c.i(parama));
    AppMethodBeat.o(2778);
  }

  public final boolean bmx()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(2780);
    ab.i("MicroMsg.EditorPresenter", "removeBg " + this.liA);
    if (!this.ljQ.lhK)
    {
      AppMethodBeat.o(2780);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
      if ((localEmojiVideoPlayTextureView != null) && (localEmojiVideoPlayTextureView.isPlaying() == true))
      {
        if (!this.liA);
        while (true)
        {
          this.liA = bool1;
          localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
          if (localEmojiVideoPlayTextureView != null)
            EmojiVideoPlayTextureView.a(localEmojiVideoPlayTextureView, this.liA);
          bool1 = this.liA;
          AppMethodBeat.o(2780);
          break;
          bool1 = false;
        }
      }
      AppMethodBeat.o(2780);
      bool1 = bool2;
    }
  }

  public final boolean bmy()
  {
    boolean bool = true;
    AppMethodBeat.i(2781);
    ab.i("MicroMsg.EditorPresenter", "speedUp " + this.lkr);
    EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
    if ((localEmojiVideoPlayTextureView != null) && (localEmojiVideoPlayTextureView.getPlayRate() == 1.0F))
    {
      localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
      if (localEmojiVideoPlayTextureView != null)
        localEmojiVideoPlayTextureView.setPlayRate(2.0F);
      this.lkr = true;
      AppMethodBeat.o(2781);
    }
    while (true)
    {
      return bool;
      localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
      if (localEmojiVideoPlayTextureView != null)
        localEmojiVideoPlayTextureView.setPlayRate(1.0F);
      this.lkr = false;
      AppMethodBeat.o(2781);
      bool = false;
    }
  }

  public final void bmz()
  {
    AppMethodBeat.i(2784);
    if (!bo.isNullOrNil(this.eyL))
    {
      com.tencent.mm.kernel.b.a locala = g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(locala, "MMKernel.plugin(IPluginEmoji::class.java)");
      if (!((Boolean)((com.tencent.mm.plugin.emoji.b.d)locala).getProvider().c(ac.a.xVx, Boolean.FALSE)).booleanValue())
      {
        new com.tencent.mm.ui.widget.a.c.a(this.context).PZ(2131298894).Qc(2131298893).a((DialogInterface.OnDismissListener)new c.d(this)).show();
        locala = g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(locala, "MMKernel.plugin(IPluginEmoji::class.java)");
        ((com.tencent.mm.plugin.emoji.b.d)locala).getProvider().d(ac.a.xVx, Boolean.TRUE);
        AppMethodBeat.o(2784);
      }
    }
    while (true)
    {
      return;
      bnK();
      AppMethodBeat.o(2784);
    }
  }

  public final void c(k paramk)
  {
    AppMethodBeat.i(2782);
    j.p(paramk, "emojiInfo");
    if ((paramk instanceof EmojiInfo))
      if (this.lkw.getItemContainer().getAllEmojiMd5().size() >= 8)
      {
        t.makeText(this.context, 2131299015, 0).show();
        AppMethodBeat.o(2782);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.emojicapture.ui.editor.a locala = (com.tencent.mm.plugin.emojicapture.ui.editor.a)new EmojiEditorItemView(this.context);
      ((EmojiEditorItemView)locala).setEmojiInfo((EmojiInfo)paramk);
      locala.resume();
      paramk = this.lkw.getItemContainer();
      j.p(locala, "itemView");
      Object localObject = new RelativeLayout.LayoutParams(-1, -1);
      paramk.lnI.addView((View)locala, (ViewGroup.LayoutParams)localObject);
      localObject = paramk.getValidRect();
      Context localContext = paramk.getContext();
      j.o(localContext, "context");
      locala.a((RectF)localObject, localContext.getResources().getDimension(2131427333));
      paramk.setEditing(locala);
      paramk.lnI.bringChildToFront((View)paramk.getTextItem());
      AppMethodBeat.o(2782);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(2792);
    ab.i("MicroMsg.EditorPresenter", "destroy");
    Object localObject = this.lkw.getVideoPlayView();
    if (localObject != null)
      ((EmojiVideoPlayTextureView)localObject).stop();
    this.lkw.getItemContainer().pause();
    this.lkw.destroy();
    this.ext.release();
    this.lks.setCallback(null);
    localObject = com.tencent.mm.emoji.d.b.ezV;
    com.tencent.mm.emoji.d.b.b(this.ljQ.ezZ, (com.tencent.mm.emoji.d.a)this.lku);
    AppMethodBeat.o(2792);
  }

  public final void n(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(2783);
    ab.i("MicroMsg.EditorPresenter", "updateText ".concat(String.valueOf(paramString)));
    b(paramString, (a.f.a.b)new c.j(this, p.b(this.context, (CharSequence)this.context.getString(2131300968), true, null), paramString, paramInt, paramBoolean));
    AppMethodBeat.o(2783);
  }

  public final void pause()
  {
    AppMethodBeat.i(2790);
    ab.i("MicroMsg.EditorPresenter", "pause");
    EmojiVideoPlayTextureView localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
    if ((localEmojiVideoPlayTextureView != null) && (localEmojiVideoPlayTextureView.isPlaying() == true))
    {
      localEmojiVideoPlayTextureView = this.lkw.getVideoPlayView();
      if (localEmojiVideoPlayTextureView != null)
        localEmojiVideoPlayTextureView.pause();
    }
    this.lkw.getItemContainer().pause();
    gE(false);
    AppMethodBeat.o(2790);
  }

  public final void resume()
  {
    AppMethodBeat.i(2791);
    ab.i("MicroMsg.EditorPresenter", "resume");
    Object localObject = this.lkw.getVideoPlayView();
    if (localObject != null)
      ((EmojiVideoPlayTextureView)localObject).start();
    localObject = this.lkw.getItemContainer();
    int i = ((EditorItemContainer)localObject).lnI.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = ((EditorItemContainer)localObject).lnI.getChildAt(j);
      if ((localView instanceof com.tencent.mm.plugin.emojicapture.ui.editor.a))
        ((com.tencent.mm.plugin.emojicapture.ui.editor.a)localView).resume();
    }
    gE(true);
    AppMethodBeat.o(2791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.c
 * JD-Core Version:    0.6.2
 */