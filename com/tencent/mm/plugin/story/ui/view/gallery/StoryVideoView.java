package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import a.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.g.b.a.bm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvideo.MMVideoView;
import com.tencent.mm.modelvideo.MMVideoView.a;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.h.n;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.k;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.cee;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView;", "Lcom/tencent/mm/modelvideo/MMVideoView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "C_TAG", "", "fakeLayer", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewFakeLayer;", "firstPlayWaitTime", "", "getFirstPlayWaitTime", "()J", "setFirstPlayWaitTime", "(J)V", "isFakeVideo", "", "isLocalVideo", "isLocalVideoPause", "isMute", "needShowLoading", "sessionId", "startPlayTime", "surfaceAvailable", "videoItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "videoTips", "Landroid/widget/TextView;", "avgBlockTime", "", "blockCount", "calcDownloadRange", "playTime", "start", "Lcom/tencent/mm/pointers/PInt;", "end", "checkCanPlay", "checkNeedReset", "checkResumeLocalVideo", "createVideoView", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView;", "mContext", "fakeEndTime", "fakeStartTime", "getErrorCode", "getFilePath", "getSessionId", "getStayTime", "initView", "", "isLive", "isShowLoading", "moovCostTime", "onCompletion", "onFinish", "mediaId", "ret", "onGetVideoSize", "width", "height", "onProgress", "offset", "total", "onSeekComplete", "startPlay", "onSurfaceAvailable", "onTextureUpdate", "onUIDestroy", "onUIPause", "onUIResume", "pause", "play", "item", "playLocalVideo", "videoPath", "prepareVideo", "reportStopLocalVideo", "reset", "resume", "storyVideoItem", "setMute", "mute", "setNeedShowLoading", "show", "setScaleType", "scaleType", "Lcom/tencent/mm/pluginsdk/ui/IMMVideoView$ScaleType;", "setVideoPath", "url", "durationSec", "showLoading", "startTimer", "rightNow", "stop", "stopTimer", "Companion", "plugin-story_release"})
public final class StoryVideoView extends MMVideoView
{
  public static final StoryVideoView.a sqI;
  private String cvF;
  private boolean eif;
  private long fqM;
  private TextView mqf;
  private i rVZ;
  private final String sqA;
  private boolean sqB;
  boolean sqC;
  private boolean sqD;
  private boolean sqE;
  private boolean sqF;
  private o sqG;
  private long sqH;

  static
  {
    AppMethodBeat.i(110950);
    sqI = new StoryVideoView.a((byte)0);
    AppMethodBeat.o(110950);
  }

  public StoryVideoView(Context paramContext)
  {
    this(paramContext, null);
    AppMethodBeat.i(110949);
    AppMethodBeat.o(110949);
  }

  public StoryVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(110948);
    this.sqA = "MicroMsg.StoryVideoView";
    paramContext = com.tencent.mm.plugin.story.model.j.rST;
    setRootPath(j.a.getAccStoryPath());
    diM();
    setIsShowBasicControls(false);
    paramContext = this.vgm;
    a.f.b.j.o(paramContext, "footerRoot");
    paramContext.setVisibility(8);
    this.TAG = this.sqA;
    this.sqB = true;
    AppMethodBeat.o(110948);
  }

  private final void abf(String paramString)
  {
    AppMethodBeat.i(110921);
    Object localObject = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("playLocalVideo: ").append(paramString).append(", isPlayingNow:");
    com.tencent.mm.pluginsdk.ui.tools.e locale = this.klq;
    a.f.b.j.o(locale, "videoView");
    ab.i((String)localObject, locale.isPlaying());
    if (this.klq == null)
      this.klq = cf(getContext());
    reset();
    localObject = this.klq;
    if (localObject != null)
      ((com.tencent.mm.pluginsdk.ui.tools.e)localObject).stop();
    locale = this.klq;
    if (locale != null)
      if (!this.eif)
      {
        if (!this.sqF)
          break label204;
        localObject = this.sqG;
        if (localObject == null)
          a.f.b.j.avw("fakeLayer");
        if (!((o)localObject).sqP)
          break label204;
      }
    label204: for (boolean bool = true; ; bool = false)
    {
      locale.setMute(bool);
      this.bkJ = false;
      this.sqC = true;
      setDownloadStatus(3);
      setNeedShowLoading(false);
      localObject = this.klq;
      if (localObject != null)
        break;
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
      AppMethodBeat.o(110921);
      throw paramString;
    }
    ((StoryVideoPlayTextureView)localObject).setNeedResetExtractor(bwE());
    localObject = this.klq;
    a.f.b.j.o(localObject, "videoView");
    ((com.tencent.mm.pluginsdk.ui.tools.e)localObject).setVideoPath(paramString);
    this.fqM = bo.yz();
    this.sqH = 0L;
    paramString = k.rTc;
    paramString = this.rVZ;
    if (paramString != null)
    {
      localObject = paramString.username;
      paramString = (String)localObject;
      if (localObject != null);
    }
    else
    {
      paramString = "";
    }
    k.aao(paramString);
    this.klq.setVideoCallback((e.a)new StoryVideoView.b(this));
    this.sqE = false;
    this.cvF = null;
    AppMethodBeat.o(110921);
  }

  private final boolean bwE()
  {
    AppMethodBeat.i(110934);
    boolean bool;
    if (this.sqC)
    {
      AppMethodBeat.o(110934);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        bool = g.RP().Ry().getBoolean(ac.a.xQl, false);
        AppMethodBeat.o(110934);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException, "check need reset error", new Object[0]);
        AppMethodBeat.o(110934);
        bool = false;
      }
    }
  }

  public final void EA()
  {
    AppMethodBeat.i(110916);
    ab.i(this.TAG, "onCompletion, currPosMs:" + getCurrPosMs() + ", playStatus:" + this.fUP + ", downloadStatus:" + this.fUO);
    if (getCurrPosMs() <= 0)
      AppMethodBeat.o(110916);
    while (true)
    {
      return;
      h.b localb = this.rcd;
      if (localb != null)
        localb.cq(getSessionId(), getMediaId());
      super.EA();
      AppMethodBeat.o(110916);
    }
  }

  public final void a(i parami, String paramString)
  {
    AppMethodBeat.i(110915);
    a.f.b.j.p(parami, "item");
    Object localObject1 = this.mqf;
    if (localObject1 != null)
      ((TextView)localObject1).setVisibility(8);
    this.rVZ = parami;
    localObject1 = parami.rWj;
    int i = parami.fDG;
    this.sqF = false;
    Object localObject2 = this.sqG;
    if (localObject2 == null)
      a.f.b.j.avw("fakeLayer");
    ((o)localObject2).setVisibility(8);
    if (!parami.czf())
    {
      ab.i(this.TAG, "play empty item");
      aNt();
      AppMethodBeat.o(110915);
    }
    while (true)
    {
      return;
      if (parami.cze())
      {
        this.sqF = true;
        ab.i(this.TAG, "LogStory: play fake video");
        paramString = this.sqG;
        if (paramString == null)
          a.f.b.j.avw("fakeLayer");
        paramString.setVisibility(0);
        parami = parami.rWl;
        if (parami != null)
        {
          paramString = this.sqG;
          if (paramString == null)
            a.f.b.j.avw("fakeLayer");
          paramString.setFakeVideoInfo(parami);
          paramString = this.sqG;
          if (paramString == null)
            a.f.b.j.avw("fakeLayer");
          paramString.lW(this.eif);
          this.fUM = parami.videoPath;
          this.fUL = "";
          parami = this.fUM;
          a.f.b.j.o(parami, "filepath");
          abf(parami);
        }
      }
      while (true)
      {
        setLoop(true);
        parami = this.klq;
        if (parami != null)
          break;
        parami = new v("null cannot be cast to non-null type android.view.View");
        AppMethodBeat.o(110915);
        throw parami;
        ab.i(this.TAG, "LogStory: play normal video");
        localObject2 = s.rTV;
        Object localObject3 = s.a((cek)localObject1);
        if (com.tencent.mm.vfs.e.asZ((String)localObject3) > 0L)
        {
          ab.i(this.TAG, "play " + (String)localObject3 + " downloadDone now can play " + ((cek)localObject1).Id);
          this.fUM = ((String)localObject3);
          if (localObject3 != null)
            abf((String)localObject3);
        }
        else
        {
          localObject2 = s.rTV;
          localObject2 = s.a(parami);
          int j = (int)com.tencent.mm.vfs.e.asZ(((n)localObject2).field_filePath);
          ab.i(this.TAG, "play " + (String)localObject3 + " error try play from url or videoCache " + ((cek)localObject1).Id + " fileLength:" + j + " cacheSize:" + ((n)localObject2).field_cacheSize);
          if (j < ((n)localObject2).field_cacheSize)
          {
            ((n)localObject2).field_cacheSize = j;
            localObject3 = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxX().b((n)localObject2);
          }
          ab.i(this.TAG, String.valueOf(localObject2));
          if ((((n)localObject2).Jo()) && (com.tencent.mm.vfs.e.ct(((n)localObject2).field_filePath)))
          {
            ab.i(this.TAG, "play " + ((cek)localObject1).Id + " download finish");
            this.fUM = ((n)localObject2).field_filePath;
            parami = s.rTV;
            this.fUL = s.be(i, ((cek)localObject1).Url);
            parami = this.fUM;
            a.f.b.j.o(parami, "filepath");
            abf(parami);
          }
          else
          {
            if ((((n)localObject2).Jo()) && (!com.tencent.mm.vfs.e.ct(((n)localObject2).field_filePath)))
            {
              ab.i(this.TAG, "error downloadFinish " + ((n)localObject2).Jo() + " ret:" + com.tencent.mm.vfs.e.ct(((n)localObject2).field_filePath));
              ((n)localObject2).cCe();
              localObject3 = com.tencent.mm.plugin.story.model.j.rST;
              j.a.cxX().b((n)localObject2);
            }
            ab.i(this.TAG, "play " + ((cek)localObject1).Id + ' ' + paramString + " start online play " + ((n)localObject2).field_filePath);
            reset();
            this.klq.stop();
            this.klq.setVideoCallback((e.a)this);
            this.sqC = false;
            this.vgu = true;
            setNeedShowLoading(true);
            super.c(false, parami.rWj.Url, (int)((cek)localObject1).duration);
            this.fUM = ((n)localObject2).field_filePath;
            parami = s.rTV;
            this.fUL = s.be(i, ((cek)localObject1).Url);
            this.cvF = paramString;
            this.fqM = bo.yz();
            this.sqH = 0L;
            start();
          }
        }
      }
      ((View)parami).setAlpha(0.0F);
      AppMethodBeat.o(110915);
    }
  }

  public final boolean a(int paramInt, PInt paramPInt1, PInt paramPInt2)
  {
    AppMethodBeat.i(110936);
    a.f.b.j.p(paramPInt1, "start");
    a.f.b.j.p(paramPInt2, "end");
    Object localObject1 = "";
    paramPInt1.value = Math.max(paramInt, this.fUV);
    if (this.fUP == 1)
    {
      paramPInt1.value = paramInt;
      paramPInt1.value += this.fUW;
      localObject1 = "" + "step1;";
    }
    Object localObject2 = localObject1;
    if (this.fUP == 2)
    {
      paramPInt1.value = (paramInt - 8);
      if (paramPInt1.value < 0)
        paramPInt1.value = 0;
      paramPInt2.value = (paramPInt1.value + this.fUW + 8);
      localObject2 = (String)localObject1 + "step2;";
    }
    if (this.fUP == 3)
    {
      paramPInt1.value = this.fUV;
      paramPInt2.value = (paramInt + 1 + this.fVa.fVg);
      localObject1 = (String)localObject2 + "step3;";
      localObject2 = localObject1;
      if (paramPInt2.value >= this.fUR + 1)
      {
        paramPInt2.value = (this.fUR + 1);
        localObject2 = (String)localObject1 + "step5;";
      }
      if (paramPInt2.value >= paramPInt1.value)
        break label367;
      paramPInt1.value += this.fVa.fVg;
      AppMethodBeat.o(110936);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localObject1 = localObject2;
      if (this.fUP != 4)
        break;
      paramPInt1.value = this.fUV;
      paramPInt2.value = (this.fUW + paramInt + 1 + this.fVa.fVg);
      localObject1 = (String)localObject2 + "step4;";
      break;
      label367: ab.i(this.TAG, "%s calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d] [%s] %s", new Object[] { aZk(), Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value), Integer.valueOf(paramInt), Integer.valueOf(this.fUP), Integer.valueOf(this.fUV), Integer.valueOf(this.fUW), this.fUL, localObject2 });
      AppMethodBeat.o(110936);
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(110930);
    ab.i(this.TAG, "onUIDestroy, isLocalVideo:" + this.sqC);
    o localo = this.sqG;
    if (localo == null)
      a.f.b.j.avw("fakeLayer");
    localo.cDd();
    super.aEX();
    AppMethodBeat.o(110930);
  }

  public final void aNt()
  {
    AppMethodBeat.i(110927);
    if (this.sqB)
      gR(800L);
    AppMethodBeat.o(110927);
  }

  public final void ad(String paramString, int paramInt)
  {
    AppMethodBeat.i(110933);
    super.ad(paramString, paramInt);
    AppMethodBeat.o(110933);
  }

  public final void akU()
  {
    AppMethodBeat.i(110946);
    ab.i(this.TAG, "prepareVideo, surfaceAvailable:" + this.sqD);
    if (this.klq != null)
    {
      localObject = this.klq;
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoPlayTextureView");
        AppMethodBeat.o(110946);
        throw ((Throwable)localObject);
      }
      ((StoryVideoPlayTextureView)localObject).setNeedResetExtractor(bwE());
    }
    super.akU();
    Object localObject = g.RP();
    a.f.b.j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().get(ac.a.xPd, Integer.valueOf(0));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(110946);
      throw ((Throwable)localObject);
    }
    if (((Integer)localObject).intValue() == 1)
    {
      localObject = this.mqf;
      if (localObject != null)
        ((TextView)localObject).setText((CharSequence)d.RK(this.fUM));
      localObject = this.mqf;
      if (localObject != null)
      {
        ((TextView)localObject).setVisibility(0);
        AppMethodBeat.o(110946);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110946);
    }
  }

  public final void akV()
  {
    AppMethodBeat.i(110928);
    ab.i(this.TAG, "onUIPause, isLocalVideo:" + this.sqC);
    Object localObject = this.sqG;
    if (localObject == null)
      a.f.b.j.avw("fakeLayer");
    ((o)localObject).cDc();
    if (this.sqC)
    {
      localObject = this.klq;
      if (localObject != null)
      {
        ((com.tencent.mm.pluginsdk.ui.tools.e)localObject).pause();
        AppMethodBeat.o(110928);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110928);
      continue;
      super.akV();
      AppMethodBeat.o(110928);
    }
  }

  public final void akW()
  {
    AppMethodBeat.i(110929);
    ab.i(this.TAG, "onUIResume, isLocalVideo:" + this.sqC);
    if (isPlaying())
    {
      o localo = this.sqG;
      if (localo == null)
        a.f.b.j.avw("fakeLayer");
      localo.lW(this.eif);
    }
    if (this.sqC)
      AppMethodBeat.o(110929);
    while (true)
    {
      return;
      super.akW();
      AppMethodBeat.o(110929);
    }
  }

  public final void akY()
  {
    AppMethodBeat.i(110945);
    super.akY();
    ab.i(this.TAG, "onSurfaceAvailable");
    this.sqD = true;
    AppMethodBeat.o(110945);
  }

  public final void bQL()
  {
    AppMethodBeat.i(110940);
    super.bQL();
    Object localObject = this.klq;
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.view.View");
      AppMethodBeat.o(110940);
      throw ((Throwable)localObject);
    }
    ((View)localObject).setAlpha(1.0F);
    this.sqH = bo.az(this.fqM);
    AppMethodBeat.o(110940);
  }

  public final void c(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(138955);
    super.c(paramBoolean, paramString, paramInt);
    AppMethodBeat.o(138955);
  }

  public final int cCZ()
  {
    if (this.vgG.rlG > this.vgG.startTimeStamp);
    for (int i = (int)(this.vgG.rlG - this.vgG.startTimeStamp); ; i = 0)
      return i;
  }

  public final int cDa()
  {
    return this.vgG.blockCount;
  }

  public final int cDb()
  {
    if (this.vgG.blockCount > 0);
    for (int i = (int)(this.vgG.viG / this.vgG.blockCount); ; i = 0)
      return i;
  }

  public final void cU(boolean paramBoolean)
  {
    AppMethodBeat.i(110922);
    if (this.sqC)
      AppMethodBeat.o(110922);
    while (true)
    {
      return;
      super.cU(paramBoolean);
      AppMethodBeat.o(110922);
    }
  }

  public final void cV(boolean paramBoolean)
  {
    AppMethodBeat.i(110923);
    ab.c(this.TAG, aZk() + " startTimer, isLocalVideo:" + this.sqC, new Object[0]);
    if (!this.sqC)
      super.cV(paramBoolean);
    AppMethodBeat.o(110923);
  }

  public final com.tencent.mm.pluginsdk.ui.tools.e cf(Context paramContext)
  {
    AppMethodBeat.i(110944);
    paramContext = new StoryVideoPlayTextureView(paramContext);
    paramContext.setOpenWithNoneSurface(true);
    paramContext.setNeedResetExtractor(bwE());
    paramContext.setIsOnlineVideoType(true);
    paramContext = (com.tencent.mm.pluginsdk.ui.tools.e)paramContext;
    AppMethodBeat.o(110944);
    return paramContext;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110932);
    super.dH(paramInt1, paramInt2);
    ab.i(this.TAG, "onGetVideoSize, mediaId:" + getMediaId() + ", isLocalVideo:" + this.sqC + ", isPrepareVideo:" + this.fUX + ", isPrepared:" + this.VN + ", playerStatus:" + this.fUP + ", downloadStatus:" + this.fUO);
    AppMethodBeat.o(110932);
  }

  public final int getErrorCode()
  {
    return this.vgG.viH;
  }

  public final String getFilePath()
  {
    AppMethodBeat.i(110942);
    String str = this.fUM;
    a.f.b.j.o(str, "filepath");
    AppMethodBeat.o(110942);
    return str;
  }

  public final long getFirstPlayWaitTime()
  {
    return this.sqH;
  }

  public final String getSessionId()
  {
    AppMethodBeat.i(110917);
    String str = bo.nullAsNil(this.cvF);
    a.f.b.j.o(str, "Util.nullAsNil(sessionId)");
    AppMethodBeat.o(110917);
    return str;
  }

  public final int getStayTime()
  {
    AppMethodBeat.i(110941);
    int i = (int)bo.az(this.fqM);
    AppMethodBeat.o(110941);
    return i;
  }

  public final void h(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110931);
    if (!bo.isEqual(this.fUL, paramString))
      AppMethodBeat.o(110931);
    while (true)
    {
      return;
      paramString = this.TAG;
      StringBuilder localStringBuilder = new StringBuilder("%s download  onProgress [%d, %d], pauseByLoadData:").append(this.fUU).append(", playStatus:").append(this.fUP).append(", currPosMs:").append(getCurrPosMs()).append(", isPlyaing:");
      com.tencent.mm.pluginsdk.ui.tools.e locale = this.klq;
      a.f.b.j.o(locale, "videoView");
      ab.d(paramString, locale.isPlaying(), new Object[] { aZk(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (((getCurrPosMs() <= 0) || (this.fUP == 1) || (this.fUP == 0)) && (mm(getCurrPosSec())))
        cV(true);
      AppMethodBeat.o(110931);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(110914);
    super.initView();
    Object localObject = getContext();
    a.f.b.j.o(localObject, "context");
    this.sqG = new o((Context)localObject);
    RelativeLayout localRelativeLayout = this.vgl;
    localObject = this.sqG;
    if (localObject == null)
      a.f.b.j.avw("fakeLayer");
    localRelativeLayout.addView((View)localObject, new ViewGroup.LayoutParams(-1, -1));
    this.mqf = ((TextView)findViewById(2131822138));
    AppMethodBeat.o(110914);
  }

  public final boolean isLive()
  {
    AppMethodBeat.i(110925);
    boolean bool;
    if (this.sqC)
    {
      bool = false;
      AppMethodBeat.o(110925);
    }
    while (true)
    {
      return bool;
      bool = super.isLive();
      AppMethodBeat.o(110925);
    }
  }

  public final void m(i parami)
  {
    Object localObject1 = null;
    AppMethodBeat.i(110919);
    ab.i(this.TAG, "resume, current play time:" + getCurrPosMs() + ", " + getCurrPosSec() + ", " + getVideoDurationSec() + ", isPrepared:" + this.VN + ", sessionId:" + this.cvF + ", isLocalVideo:" + this.sqC);
    Object localObject2 = this.sqG;
    if (localObject2 == null)
      a.f.b.j.avw("fakeLayer");
    ((o)localObject2).lW(this.eif);
    if (getCurrPosSec() >= getVideoDurationSec())
    {
      ab.i(this.TAG, "resume, restart video");
      if (parami != null)
      {
        a(parami, this.cvF);
        AppMethodBeat.o(110919);
      }
    }
    while (true)
    {
      return;
      Object localObject3 = this.TAG;
      StringBuilder localStringBuilder = new StringBuilder("checkResumeLocalVideo, isLocalVideo:").append(this.sqC).append(", currentPosition:");
      localObject2 = this.klq;
      label214: int i;
      if (localObject2 != null)
      {
        localObject2 = Integer.valueOf(((com.tencent.mm.pluginsdk.ui.tools.e)localObject2).getCurrentPosition());
        ab.i((String)localObject3, localObject2);
        if (!this.sqC)
          break label320;
        localObject2 = this.klq;
        if (localObject2 == null)
          break label314;
        i = ((com.tencent.mm.pluginsdk.ui.tools.e)localObject2).getCurrentPosition();
        label252: if (i <= 0)
          break label320;
        localObject3 = this.klq;
        localObject2 = localObject1;
        if (localObject3 != null)
          localObject2 = Boolean.valueOf(((com.tencent.mm.pluginsdk.ui.tools.e)localObject3).start());
        this.sqE = false;
      }
      label314: label320: for (boolean bool = a.f.b.j.j(localObject2, Boolean.TRUE); ; bool = false)
      {
        if (!bool)
          break label326;
        AppMethodBeat.o(110919);
        break;
        localObject2 = null;
        break label214;
        i = 0;
        break label252;
      }
      label326: if ((getCurrPosMs() > 0) && (!this.sqC))
      {
        if (!this.VN)
        {
          this.vgu = true;
          akU();
          AppMethodBeat.o(110919);
        }
        else
        {
          super.play();
          AppMethodBeat.o(110919);
        }
      }
      else
      {
        if (parami != null)
          a(parami, this.cvF);
        AppMethodBeat.o(110919);
      }
    }
  }

  public final boolean mn(int paramInt)
  {
    AppMethodBeat.i(110935);
    boolean bool = super.mn(paramInt);
    ab.i(this.TAG, "checkCanPlay, cachePlayTime:" + this.fUV + ", ret:" + bool);
    AppMethodBeat.o(110935);
    return bool;
  }

  public final boolean pause()
  {
    boolean bool = true;
    AppMethodBeat.i(110920);
    ab.i(this.TAG, "pause, isLocalVideo:" + this.sqC);
    o localo = this.sqG;
    if (localo == null)
      a.f.b.j.avw("fakeLayer");
    localo.cDc();
    if (this.sqC)
    {
      this.sqE = true;
      this.klq.pause();
      AppMethodBeat.o(110920);
    }
    while (true)
    {
      return bool;
      bool = super.pause();
      AppMethodBeat.o(110920);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(110947);
    super.reset();
    this.sqD = false;
    this.cvF = null;
    AppMethodBeat.o(110947);
  }

  public final void setFirstPlayWaitTime(long paramLong)
  {
    this.sqH = paramLong;
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(110918);
    super.setMute(paramBoolean);
    this.eif = paramBoolean;
    if (this.klq != null)
      this.klq.setMute(paramBoolean);
    AppMethodBeat.o(110918);
  }

  public final void setNeedShowLoading(boolean paramBoolean)
  {
    AppMethodBeat.i(110926);
    ab.i(this.TAG, hashCode() + " setNeedShowLoading: " + paramBoolean);
    this.sqB = paramBoolean;
    if (!this.sqB)
      bJc();
    AppMethodBeat.o(110926);
  }

  public final void setScaleType(h.d paramd)
  {
    AppMethodBeat.i(110943);
    super.setScaleType(paramd);
    AppMethodBeat.o(110943);
  }

  public final void start()
  {
    AppMethodBeat.i(110937);
    if ((this.bqQ > 0) && (!this.sqC))
    {
      ab.i(this.TAG, "start from onError and not local video");
      Object localObject = this.rVZ;
      if (localObject != null)
      {
        s locals = s.rTV;
        localObject = s.a((i)localObject);
        if (((n)localObject).Jo())
        {
          ab.i(this.TAG, "start from onError and download finish now");
          localObject = ((n)localObject).field_filePath;
          a.f.b.j.o(localObject, "videoCache.field_filePath");
          abf((String)localObject);
          AppMethodBeat.o(110937);
        }
      }
    }
    while (true)
    {
      return;
      super.start();
      AppMethodBeat.o(110937);
    }
  }

  public final void stop()
  {
    long l = 1L;
    AppMethodBeat.i(110938);
    try
    {
      Object localObject1 = this.sqG;
      if (localObject1 == null)
        a.f.b.j.avw("fakeLayer");
      ((o)localObject1).cDd();
      if (this.sqC)
      {
        bm localbm = new com/tencent/mm/g/b/a/bm;
        localbm.<init>();
        localObject1 = this.rVZ;
        if (localObject1 != null)
          localObject1 = Long.valueOf(((i)localObject1).rUJ);
        while (true)
        {
          localObject1 = localbm.gf(String.valueOf(localObject1));
          Object localObject2 = h.scu;
          localObject1 = ((bm)localObject1).dl(h.cAs().FF());
          localObject2 = h.scu;
          if (h.cAs().FK() == 1L)
          {
            label103: localObject1 = ((bm)localObject1).dn(l).dq(this.sqH).dr(getStayTime()).ds(getErrorCode()).GV();
            localObject2 = h.scu;
            localObject2 = ((bm)localObject1).du(h.cAs().FE());
            localObject1 = h.scu;
            ((bm)localObject2).dv(h.cAs().FH()).dp(getCurrPosMs());
            ab.d(this.TAG, "time distance %d", new Object[] { Long.valueOf(System.currentTimeMillis() - localbm.GW()) });
            if (System.currentTimeMillis() - localbm.GW() >= 500L)
            {
              localObject1 = this.rVZ;
              if (localObject1 == null)
                break label297;
              l = ((i)localObject1).rUJ;
            }
          }
          try
          {
            while (true)
            {
              localObject1 = com.tencent.mm.plugin.story.model.j.rST;
              localObject1 = j.a.cno();
              localObject2 = new com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$c;
              ((StoryVideoView.c)localObject2).<init>(this, localbm, l);
              ((ak)localObject1).post((Runnable)localObject2);
              this.klq.stop();
              reset();
              AppMethodBeat.o(110938);
              return;
              localObject1 = null;
              break;
              l = 0L;
              break label103;
              label297: l = 0L;
            }
          }
          catch (Exception localException1)
          {
            while (true)
            {
              ab.printErrStackTrace(this.TAG, (Throwable)localException1, "reportStopLocalVideo", new Object[0]);
              localbm.ajK();
            }
          }
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, (Throwable)localException2, "stop error", new Object[0]);
        AppMethodBeat.o(110938);
        continue;
        super.stop();
        AppMethodBeat.o(110938);
      }
    }
  }

  public final void stopTimer()
  {
    AppMethodBeat.i(110924);
    ab.c(this.TAG, aZk() + " stopTimer, isLocalVideo:" + this.sqC, new Object[0]);
    super.stopTimer();
    AppMethodBeat.o(110924);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView
 * JD-Core Version:    0.6.2
 */