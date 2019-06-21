package com.tencent.mm.plugin.emojicapture.e;

import a.l;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.model.a.b;
import com.tencent.mm.plugin.emojicapture.model.c;
import com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy;
import com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI.b.a;
import com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/presenter/CapturePresenter;", "Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IPresenter;", "context", "Landroid/content/Context;", "view", "Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IView;", "videoPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "uiNavigation", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IView;Lcom/tencent/mm/modelcontrol/VideoTransPara;Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$UINavigation;Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "emojiCaptureInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;", "recordStartTime", "", "recordState", "Lcom/tencent/mm/plugin/emojicapture/presenter/CapturePresenter$RecordState;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "useVoiceInput", "", "voiceDetectTimer", "Lcom/tencent/mm/sdk/platformtools/MTimerHandler;", "voiceFinished", "voiceInput", "Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy;", "voiceText", "", "changeSticker", "", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "checkNetworkAvailable", "destroy", "exit", "pauseCapture", "startRecord", "stopCallBack", "info", "stopRecord", "Companion", "RecordState", "plugin-emojicapture_release"})
public final class a
  implements com.tencent.mm.plugin.emojicapture.c.a.a
{
  public static final a.a ljW;
  private Context context;
  private final d ext;
  private final EmojiCaptureReporter lha;
  private a.b ljL;
  private long ljM;
  private boolean ljN;
  private boolean ljO;
  private String ljP;
  private final com.tencent.mm.plugin.emojicapture.model.a.a ljQ;
  private VoiceInputProxy ljR;
  private final ap ljS;
  private com.tencent.mm.plugin.emojicapture.c.a.b ljT;
  private final VideoTransPara ljU;
  private EmojiCaptureUI.b ljV;

  static
  {
    AppMethodBeat.i(2754);
    ljW = new a.a((byte)0);
    AppMethodBeat.o(2754);
  }

  public a(Context paramContext, com.tencent.mm.plugin.emojicapture.c.a.b paramb, VideoTransPara paramVideoTransPara, EmojiCaptureUI.b paramb1, EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    AppMethodBeat.i(2753);
    this.context = paramContext;
    this.ljT = paramb;
    this.ljU = paramVideoTransPara;
    this.ljV = paramb1;
    this.lha = paramEmojiCaptureReporter;
    this.ljL = a.b.ljY;
    this.ljQ = new com.tencent.mm.plugin.emojicapture.model.a.a();
    this.ext = new d(this.context);
    this.ljR = new VoiceInputProxy((VoiceInputProxy.b)new f(this), this.ext);
    this.ljS = new ap((ap.a)new e(this), true);
    CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
    this.ext.connect((Runnable)a.1.ljX);
    paramContext = this.ljU;
    paramb = c.lhw;
    paramContext.width = c.bmM();
    paramb = this.ljU;
    paramContext = c.lhw;
    paramb.height = c.bmM();
    this.ljU.videoBitrate = 5000000;
    com.tencent.mm.plugin.mmsight.model.j.ouz.videoBitrate = this.ljU.videoBitrate;
    com.tencent.mm.plugin.mmsight.model.j.ouz.fcY = this.ljU;
    this.ljQ.scene = this.lha.scene;
    this.ljQ.ezZ = this.lha.ezZ;
    AppMethodBeat.o(2753);
  }

  public final boolean EB()
  {
    AppMethodBeat.i(2748);
    ab.i("MicroMsg.CapturePresenter", "stop record " + this.ljL);
    boolean bool;
    if (this.ljL == a.b.lkc)
    {
      bool = true;
      AppMethodBeat.o(2748);
    }
    while (true)
    {
      return bool;
      this.ljL = a.b.lkc;
      Object localObject;
      if (bo.az(this.ljM) < 600L)
      {
        localObject = this.ljR;
        if (localObject != null)
          ((VoiceInputProxy)localObject).stop(true);
        this.ljL = a.b.ljZ;
        bool = false;
        AppMethodBeat.o(2748);
      }
      else
      {
        EmojiCaptureUI.b localb = this.ljV;
        Context localContext = this.context;
        localObject = this.context.getString(2131300968);
        a.f.b.j.o(localObject, "context.getString(R.string.loading_tips)");
        localb.a(localContext, (CharSequence)localObject, true, (DialogInterface.OnCancelListener)new a.d(this));
        this.ljT.getDecoration().lmz.pause();
        if (this.ljN)
        {
          localObject = this.ljR;
          if (localObject != null)
            ((VoiceInputProxy)localObject).stop(true);
          this.ljS.stopTimer();
        }
        this.lha.lgM = System.currentTimeMillis();
        this.lha.euE = (this.lha.lgM - this.lha.lgL);
        EmojiCaptureReporter.a(4, this.lha.ezZ, 0L, this.lha.euE, 0L, 0L, 0L, 0, 0, this.lha.scene);
        bool = true;
        AppMethodBeat.o(2748);
      }
    }
  }

  public final void a(com.tencent.mm.plugin.emojicapture.model.a.a parama)
  {
    AppMethodBeat.i(2749);
    a.f.b.j.p(parama, "info");
    ab.i("MicroMsg.CapturePresenter", "stopRecord: videoRecorder stop");
    this.ljQ.setVideoPath(parama.videoPath);
    this.ljQ.mb(parama.thumbPath);
    this.ljQ.lhI = this.ljP;
    this.ljQ.lhJ = parama.lhJ;
    com.tencent.mm.plugin.emojicapture.model.a.a locala = this.ljQ;
    if (this.ljQ.lhH == null);
    for (boolean bool = true; ; bool = false)
    {
      locala.lhK = bool;
      this.ljQ.lgS = parama.lgS;
      this.ljV.c(this.ljQ);
      AppMethodBeat.o(2749);
      return;
    }
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(2752);
    ab.i("MicroMsg.CapturePresenter", "changeSticker:".concat(String.valueOf(paramb)));
    this.ljQ.lhH = paramb;
    this.ljT.a(paramb);
    AppMethodBeat.o(2752);
  }

  public final void aDm()
  {
    AppMethodBeat.i(2747);
    ab.i("MicroMsg.CapturePresenter", "start record " + this.ljL);
    this.ljQ.setVideoPath("");
    this.ljQ.mb("");
    this.ljP = this.ljT.getDecoration().getText();
    this.ljT.getDecoration().lmz.reset();
    if (this.ljP == null);
    for (boolean bool = true; ; bool = false)
    {
      this.ljN = bool;
      ab.i("MicroMsg.CapturePresenter", "startRecord: useVoiceInput " + this.ljN);
      if ((this.ljN) && ((a.f.b.j.j("NON_NETWORK", at.getNetTypeString(ah.getContext())) ^ true)))
      {
        VoiceInputProxy localVoiceInputProxy = this.ljR;
        if (localVoiceInputProxy != null)
          localVoiceInputProxy.start();
        this.ljS.ms(50L);
      }
      this.ljO = false;
      this.ljL = a.b.lkb;
      this.ljM = bo.yz();
      this.lha.lgL = System.currentTimeMillis();
      EmojiCaptureReporter.a(3, this.lha.ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, this.lha.scene);
      AppMethodBeat.o(2747);
      return;
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(2751);
    this.ext.release();
    VoiceInputProxy localVoiceInputProxy = this.ljR;
    if (localVoiceInputProxy != null)
    {
      localVoiceInputProxy.setUiCallback(null);
      AppMethodBeat.o(2751);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2751);
    }
  }

  public final void exit()
  {
    AppMethodBeat.i(2750);
    EmojiCaptureUI.b.a.a(this.ljV, false);
    AppMethodBeat.o(2750);
  }

  public final void pk()
  {
    AppMethodBeat.i(2746);
    ab.i("MicroMsg.CapturePresenter", "pauseCapture " + this.ljO);
    if ((this.ljP != null) || (this.ljO))
    {
      this.ljV.Kc(this.ljP);
      AppMethodBeat.o(2746);
    }
    while (true)
    {
      return;
      al.n((Runnable)new c(this), 1500L);
      AppMethodBeat.o(2746);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class c
    implements Runnable
  {
    c(a parama)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(2741);
      ab.i("MicroMsg.CapturePresenter", "voice finish called force");
      if (!a.a(this.lke))
        a.c(this.lke).Kc(a.d(this.lke));
      a.b(this.lke);
      AppMethodBeat.o(2741);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onTimerExpired"})
  static final class e
    implements ap.a
  {
    e(a parama)
    {
    }

    public final boolean BI()
    {
      boolean bool = false;
      AppMethodBeat.i(2743);
      Object localObject;
      int i;
      if (a.e(this.lke) != null)
      {
        localObject = a.e(this.lke);
        if (localObject != null)
          i = ((VoiceInputProxy)localObject).getMaxAmplitudeRate();
      }
      while (true)
      {
        localObject = a.f(this.lke);
        if (i > 10)
          bool = true;
        ((com.tencent.mm.plugin.emojicapture.c.a.b)localObject).gB(bool);
        AppMethodBeat.o(2743);
        return true;
        i = 0;
        continue;
        i = 0;
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/presenter/CapturePresenter$voiceInput$1", "Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$UICallback;", "onRecognizeFinish", "", "onRes", "voiceText", "", "plugin-emojicapture_release"})
  public static final class f
    implements VoiceInputProxy.b
  {
    public final void amw()
    {
      AppMethodBeat.i(2745);
      ab.i("MicroMsg.CapturePresenter", "onRecognizeFinish voice finish called");
      if (!a.a(this.lke))
        a.c(this.lke).Kc(a.d(this.lke));
      a.b(this.lke);
      AppMethodBeat.o(2745);
    }

    public final void onRes(String paramString)
    {
      AppMethodBeat.i(2744);
      ab.i("MicroMsg.CapturePresenter", "onRes ".concat(String.valueOf(paramString)));
      a.a(this.lke, paramString);
      AppMethodBeat.o(2744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.a
 * JD-Core Version:    0.6.2
 */