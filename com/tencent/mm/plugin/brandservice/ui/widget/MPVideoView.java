package com.tencent.mm.plugin.brandservice.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.af.r;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandDotPercentIndicator;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.g;
import com.tencent.mm.plugin.appbrand.jsapi.video.l;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.pluginsdk.ui.applet.e;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class MPVideoView extends RelativeLayout
{
  private int Yp;
  private TextView hYN;
  private View hYQ;
  private View hYR;
  private TextView hYS;
  private LinearLayout hYT;
  private AppBrandDotPercentIndicator hYU;
  private TextView hYV;
  private ImageView hYW;
  private ImageView hYX;
  private ImageView hYY;
  private ImageView hYZ;
  private FrameLayout hZa;
  private String hZb;
  private boolean hZe;
  private boolean hZg;
  private boolean hZh;
  private l hZi;
  private boolean hZk;
  private boolean hZl;
  private double hZm;
  private String hZn;
  private boolean hZo;
  private boolean hZp;
  private boolean hZq;
  private boolean hZr;
  private int hZs;
  private boolean hZu;
  private boolean hZv;
  private boolean hZw;
  private String ien;
  private MPVideoWrapper jZp;
  private MPVideoViewControlBar jZq;
  private MPVideoView.a jZr;
  private MPVideoView.b jZs;
  private boolean jZt;
  private View.OnTouchListener jZu;
  private com.tencent.mm.plugin.brandservice.ui.timeline.video.b jZv;
  private int jZw;
  private long jZx;
  private long jZy;
  private boolean mAutoPlay;
  private int mDuration;
  private boolean mIsMute;

  public MPVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(14520);
    this.Yp = -1;
    this.mIsMute = false;
    this.hZw = false;
    this.jZt = false;
    this.jZw = 0;
    this.jZx = 0L;
    this.jZy = 0L;
    init(paramContext);
    AppMethodBeat.o(14520);
  }

  public MPVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(14521);
    this.Yp = -1;
    this.mIsMute = false;
    this.hZw = false;
    this.jZt = false;
    this.jZw = 0;
    this.jZx = 0L;
    this.jZy = 0L;
    init(paramContext);
    AppMethodBeat.o(14521);
  }

  public static String a(r paramr)
  {
    AppMethodBeat.i(14546);
    if (paramr.fjQ == 0);
    for (String str = "@T"; ; str = "@S")
    {
      paramr = q.v(paramr.fjT.fjx, paramr.type, str);
      AppMethodBeat.o(14546);
      return paramr;
    }
  }

  private void aEY()
  {
    AppMethodBeat.i(14563);
    this.hZi = new l(getContext(), this, new MPVideoView.6(this));
    AppMethodBeat.o(14563);
  }

  private void aFa()
  {
    AppMethodBeat.i(14564);
    this.jZp.setIMMVideoViewCallback(new MPVideoView.7(this));
    AppMethodBeat.o(14564);
  }

  private boolean aFd()
  {
    AppMethodBeat.i(14572);
    boolean bool;
    if ((this.hZp) && (!this.jZp.isLive()) && (!aFf()))
    {
      bool = true;
      AppMethodBeat.o(14572);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14572);
    }
  }

  private boolean aFe()
  {
    AppMethodBeat.i(14573);
    boolean bool;
    if ((!aFf()) && (((!aFb()) && (this.hZg)) || ((aFb()) && (this.hZh))))
    {
      bool = true;
      AppMethodBeat.o(14573);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14573);
    }
  }

  private boolean aFf()
  {
    AppMethodBeat.i(14574);
    boolean bool;
    if (this.hYQ.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(14574);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14574);
    }
  }

  private void aYZ()
  {
    AppMethodBeat.i(14552);
    ab.i("MicroMsg.MPVideoView", "enableProgressGesture %b", new Object[] { Boolean.TRUE });
    this.hZp = true;
    AppMethodBeat.o(14552);
  }

  private void aZa()
  {
    AppMethodBeat.i(14554);
    this.jZp.setScaleType(d.g.iaj);
    this.hYX.setScaleType(ImageView.ScaleType.FIT_CENTER);
    AppMethodBeat.o(14554);
  }

  private void aZb()
  {
    AppMethodBeat.i(14568);
    this.jZq = new MPVideoViewControlBar(getContext());
    this.jZp.setVideoFooterView(this.jZq);
    this.jZq.setVisibility(8);
    this.jZq.setFullScreenBtnOnClickListener(new MPVideoView.8(this));
    this.jZq.setIplaySeekCallback(new MPVideoView.9(this));
    this.jZq.setOnPlayButtonClickListener(new MPVideoView.10(this));
    this.jZq.setStatePorter(new MPVideoView.11(this));
    this.jZq.setMuteBtnOnClickListener(new MPVideoView.12(this));
    this.jZq.setExitFullScreenBtnOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(14487);
        MPVideoView.this.j(false, MPVideoView.C(MPVideoView.this));
        AppMethodBeat.o(14487);
      }
    });
    this.jZq.setOnVisibilityChangedListener(new MPVideoView.3(this));
    this.jZq.setOnUpdateProgressLenListener(new MPVideoView.4(this));
    this.jZp.setControlBar(this.jZq);
    AppMethodBeat.o(14568);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(14522);
    LayoutInflater.from(paramContext).inflate(2130970256, this);
    this.jZp = ((MPVideoWrapper)findViewById(2131821402));
    this.hYN = ((TextView)findViewById(2131821370));
    this.hYQ = findViewById(2131821403);
    this.hYR = findViewById(2131821405);
    this.hYS = ((TextView)findViewById(2131821407));
    this.hYT = ((LinearLayout)findViewById(2131821409));
    this.hYU = ((AppBrandDotPercentIndicator)findViewById(2131821412));
    this.hYV = ((TextView)findViewById(2131821411));
    this.hYW = ((ImageView)findViewById(2131821410));
    this.hYX = ((ImageView)findViewById(2131821404));
    this.hYY = ((ImageView)findViewById(2131821415));
    this.hYZ = ((ImageView)findViewById(2131821414));
    this.hZa = ((FrameLayout)findViewById(2131821413));
    this.hYU.setDotsNum(8);
    ((ImageView)findViewById(2131821406)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(14486);
        MPVideoView.this.start();
        AppMethodBeat.o(14486);
      }
    });
    aEY();
    aFa();
    aZb();
    aZa();
    initParam();
    AppMethodBeat.o(14522);
  }

  private void initParam()
  {
    AppMethodBeat.i(14523);
    setShowProgress(true);
    setShowControlProgress(true);
    setPageGesture(false);
    setPageGestureInFullscreen(true);
    setEnablePlayGesture(true);
    setShowMuteBtn(true);
    setShowFullScreenBtn(true);
    setShowPlayBtn(true);
    setShowCenterPlayBtn(false);
    aYZ();
    setVideoSource(0);
    setConsumeTouchEvent(false);
    setIsShowBasicControls(true);
    setAutoHideTitle(true);
    setAutoHideTitle(false);
    AppMethodBeat.o(14523);
  }

  private boolean isLive()
  {
    boolean bool = false;
    AppMethodBeat.i(14571);
    ab.i("MicroMsg.MPVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.hZk), Boolean.valueOf(this.jZp.isLive()) });
    if ((this.hZk) || (this.jZp.isLive()))
    {
      AppMethodBeat.o(14571);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(14571);
    }
  }

  private static String ox(int paramInt)
  {
    AppMethodBeat.i(14569);
    String str = oy(paramInt / 60) + ":" + oy(paramInt % 60);
    AppMethodBeat.o(14569);
    return str;
  }

  private static String oy(int paramInt)
  {
    AppMethodBeat.i(14570);
    String str;
    if (paramInt < 10)
    {
      str = "0".concat(String.valueOf(paramInt));
      AppMethodBeat.o(14570);
    }
    while (true)
    {
      return str;
      str = String.valueOf(paramInt);
      AppMethodBeat.o(14570);
    }
  }

  private void setCover(String paramString)
  {
    AppMethodBeat.i(14548);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(14548);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.hZn))
      {
        ab.i("MicroMsg.MPVideoView", "setCover mCoverUrl not null");
        AppMethodBeat.o(14548);
      }
      else
      {
        com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new MPVideoView.5(this, paramString), 0L);
        AppMethodBeat.o(14548);
      }
    }
  }

  private void stop()
  {
    AppMethodBeat.i(14539);
    ab.i("MicroMsg.MPVideoView", "stop");
    if (!this.jZp.isPlaying())
      AppMethodBeat.o(14539);
    while (true)
    {
      return;
      this.jZp.stop();
      this.jZq.aFO();
      AppMethodBeat.o(14539);
    }
  }

  public final void a(ImageView paramImageView, String paramString, int paramInt1, int paramInt2, r paramr)
  {
    AppMethodBeat.i(14547);
    ab.i("MicroMsg.MPVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(14547);
    while (true)
    {
      return;
      this.hZn = paramString;
      paramImageView.setContentDescription(getContext().getString(2131298119));
      a locala = o.ahp();
      paramString = this.hZn;
      c.a locala1 = new c.a();
      locala1.ePH = true;
      locala1 = locala1.ct(paramInt1, paramInt2);
      locala1.fGV = new f();
      locala1.ePJ = a(paramr);
      locala.a(paramString, paramImageView, locala1.ahG(), null, new e(0, paramInt1, paramInt2, null));
      AppMethodBeat.o(14547);
    }
  }

  public final void aEX()
  {
    AppMethodBeat.i(14542);
    ab.i("MicroMsg.MPVideoView", "onUIDestroy");
    ab.i("MicroMsg.MPVideoView", "clean");
    stop();
    this.jZp.aEX();
    this.jZq.onDestroy();
    AppMethodBeat.o(14542);
  }

  public final boolean aFb()
  {
    AppMethodBeat.i(14567);
    boolean bool;
    if (this.jZr == null)
    {
      ab.w("MicroMsg.MPVideoView", "isInFullScreen mFullScreenDelegate null");
      bool = false;
      AppMethodBeat.o(14567);
    }
    while (true)
    {
      return bool;
      bool = this.jZr.isFullScreen();
      AppMethodBeat.o(14567);
    }
  }

  public final void akV()
  {
    AppMethodBeat.i(14541);
    ab.i("MicroMsg.MPVideoView", "onUIPause");
    this.jZp.akV();
    AppMethodBeat.o(14541);
  }

  public final void akW()
  {
    AppMethodBeat.i(14540);
    ab.i("MicroMsg.MPVideoView", "onUIResume");
    if (this.hZw)
    {
      ab.i("MicroMsg.MPVideoView", "onUIResume, should skip ui resume");
      this.hZw = false;
      AppMethodBeat.o(14540);
    }
    while (true)
    {
      return;
      this.jZp.akW();
      AppMethodBeat.o(14540);
    }
  }

  public final void bL(String paramString, int paramInt)
  {
    AppMethodBeat.i(14543);
    ab.i("MicroMsg.MPVideoView", "setVideoPath path=%s isLive=%s", new Object[] { paramString, Boolean.FALSE });
    if (bo.isNullOrNil(paramString))
    {
      ab.v("MicroMsg.MPVideoView", "setVideoPath videoPath empty");
      AppMethodBeat.o(14543);
    }
    while (true)
    {
      return;
      this.ien = paramString;
      stop();
      this.hZk = false;
      this.jZp.setVideoSource(this.hZs);
      this.jZp.c(false, paramString, paramInt);
      if (this.hZm > 0.0D)
        this.jZp.e(this.hZm, this.mAutoPlay);
      if (this.mAutoPlay)
      {
        ab.i("MicroMsg.MPVideoView", "setVideoPath autoPlay");
        start();
      }
      setCover(paramString);
      setMute(this.mIsMute);
      AppMethodBeat.o(14543);
    }
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(14544);
    ab.i("MicroMsg.MPVideoView", "seek to position=%s current=%d isLive=%b", new Object[] { Double.valueOf(paramDouble), Integer.valueOf(this.jZp.getCurrPosSec()), Boolean.valueOf(this.hZk) });
    if (isLive())
      AppMethodBeat.o(14544);
    while (true)
    {
      return;
      this.hYQ.setVisibility(8);
      if (paramBoolean)
      {
        this.jZp.e(paramDouble, paramBoolean);
        AppMethodBeat.o(14544);
      }
      else
      {
        this.jZp.s(paramDouble);
        AppMethodBeat.o(14544);
      }
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(14558);
    int i;
    if (this.jZp != null)
    {
      i = this.jZp.getCacheTimeSec();
      AppMethodBeat.o(14558);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14558);
    }
  }

  public String getCookieData()
  {
    return this.hZb;
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(14557);
    int i = this.jZp.getCurrPosMs();
    AppMethodBeat.o(14557);
    return i;
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(14556);
    int i = this.jZp.getCurrPosSec();
    AppMethodBeat.o(14556);
    return i;
  }

  public int getDuration()
  {
    AppMethodBeat.i(14535);
    int i;
    if (this.mDuration > 0)
    {
      i = this.mDuration;
      AppMethodBeat.o(14535);
    }
    while (true)
    {
      return i;
      i = this.jZp.getVideoDurationSec();
      AppMethodBeat.o(14535);
    }
  }

  public int getEndPlayTime()
  {
    AppMethodBeat.i(14529);
    int i;
    if ((getCurrPosMs() == 0) && (this.jZw != 0))
    {
      i = getDuration() * 1000;
      AppMethodBeat.o(14529);
    }
    while (true)
    {
      return i;
      i = getCurrPosMs();
      AppMethodBeat.o(14529);
    }
  }

  public long getRealPlayTime()
  {
    AppMethodBeat.i(14528);
    if ((this.jZx == 0L) && (this.jZy != 0L) && (this.jZw != 0))
      this.jZx = (System.currentTimeMillis() - this.jZy);
    long l = this.jZx;
    AppMethodBeat.o(14528);
    return l;
  }

  public String getVideoPath()
  {
    return this.ien;
  }

  public final void j(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(14566);
    ab.i("MicroMsg.MPVideoView", "operateFullScreen toFullScreen:%b direction:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.jZr == null)
    {
      ab.w("MicroMsg.MPVideoView", "operateFullScreen mFullScreenDelegate null");
      AppMethodBeat.o(14566);
    }
    while (true)
    {
      return;
      if (paramBoolean != aFb())
        break;
      ab.i("MicroMsg.MPVideoView", "operateFullScreen current same");
      AppMethodBeat.o(14566);
    }
    if (paramInt == -1)
      if (this.Yp == -1)
      {
        paramInt = 90;
        label95: ab.i("MicroMsg.MPVideoView", "operateFullScreen target direction:%d", new Object[] { Integer.valueOf(paramInt) });
      }
    while (true)
    {
      if (paramBoolean)
      {
        this.jZr.on(paramInt);
        this.jZq.aFH();
        AppMethodBeat.o(14566);
        break;
        paramInt = this.Yp;
        break label95;
      }
      this.jZr.aDF();
      this.jZq.aDF();
      AppMethodBeat.o(14566);
      break;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(14565);
    if (this.jZu != null)
      this.jZu.onTouch(this, paramMotionEvent);
    boolean bool2;
    if (this.hZv)
    {
      bool2 = true;
      if (!bool2)
        break label82;
      if (this.hZi != null)
        this.hZi.z(paramMotionEvent);
      AppMethodBeat.o(14565);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = aFd();
      if (aFe())
        break;
      bool2 = false;
      break;
      label82: if (paramMotionEvent.getAction() == 0)
      {
        if ((this.hZe) && (!this.hZr))
          this.jZq.aFG();
        if ((this.hYQ.getVisibility() != 0) && (this.hZu))
          this.jZq.aEZ();
      }
      if (this.hZo)
      {
        AppMethodBeat.o(14565);
        bool2 = bool1;
      }
      else
      {
        bool2 = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(14565);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(14538);
    ab.i("MicroMsg.MPVideoView", "pause");
    if (!this.jZp.isPlaying())
      AppMethodBeat.o(14538);
    while (true)
    {
      return;
      this.jZp.pause();
      AppMethodBeat.o(14538);
    }
  }

  public void setAutoHideTitle(boolean paramBoolean)
  {
    this.jZt = paramBoolean;
  }

  public void setAutoPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(14532);
    ab.i("MicroMsg.MPVideoView", "setAutoPlay =%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mAutoPlay = paramBoolean;
    if (this.jZw == 0)
      this.jZw = 1;
    AppMethodBeat.o(14532);
  }

  public void setBizVideoControlBar(com.tencent.mm.plugin.brandservice.ui.timeline.video.b paramb)
  {
    this.jZv = paramb;
  }

  public void setConsumeTouchEvent(boolean paramBoolean)
  {
    AppMethodBeat.i(14524);
    ab.i("MicroMsg.MPVideoView", "setConsumeTouchEvent value=%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZo = paramBoolean;
    AppMethodBeat.o(14524);
  }

  public void setCookieData(String paramString)
  {
    this.hZb = paramString;
  }

  public void setCustomOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.jZu = paramOnTouchListener;
  }

  public void setDuration(int paramInt)
  {
    AppMethodBeat.i(14534);
    if (paramInt <= 0)
    {
      ab.i("MicroMsg.MPVideoView", "setDuration error duration=%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(14534);
    }
    while (true)
    {
      return;
      this.hYS.setText(ox(paramInt));
      this.mDuration = paramInt;
      AppMethodBeat.o(14534);
    }
  }

  public void setEnablePlayGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(14531);
    ab.i("MicroMsg.MPVideoView", "setEnablePlayGesture: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZv = paramBoolean;
    AppMethodBeat.o(14531);
  }

  public void setFullScreenDelegate(MPVideoView.a parama)
  {
    this.jZr = parama;
  }

  public void setFullScreenDirection(int paramInt)
  {
    AppMethodBeat.i(14559);
    ab.i("MicroMsg.MPVideoView", "setFullScreenDirection %d", new Object[] { Integer.valueOf(paramInt) });
    this.Yp = paramInt;
    AppMethodBeat.o(14559);
  }

  public void setInitialTime(double paramDouble)
  {
    AppMethodBeat.i(14562);
    ab.i("MicroMsg.MPVideoView", "setInitialTime initialTime=%s", new Object[] { Double.valueOf(paramDouble) });
    this.hZm = paramDouble;
    AppMethodBeat.o(14562);
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(14545);
    ab.i("MicroMsg.MPVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZe = paramBoolean;
    if (this.jZq != null)
      if (this.hZe)
      {
        this.jZq.aFD();
        AppMethodBeat.o(14545);
      }
    while (true)
    {
      return;
      this.jZq.setVisibility(8);
      AppMethodBeat.o(14545);
    }
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(14536);
    ab.i("MicroMsg.MPVideoView", "setLoop loop=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZl = paramBoolean;
    AppMethodBeat.o(14536);
  }

  public void setMPVideoViewCallBack(MPVideoView.b paramb)
  {
    this.jZs = paramb;
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(14555);
    ab.i("MicroMsg.MPVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mIsMute = paramBoolean;
    this.jZp.setMute(paramBoolean);
    this.jZq.setMuteBtnState(paramBoolean);
    AppMethodBeat.o(14555);
  }

  public void setPageGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(14560);
    ab.i("MicroMsg.MPVideoView", "setPageGesture pageGesture=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZg = paramBoolean;
    AppMethodBeat.o(14560);
  }

  public void setPageGestureInFullscreen(boolean paramBoolean)
  {
    AppMethodBeat.i(14561);
    ab.i("MicroMsg.MPVideoView", "setPageGestureInFullscreen pageGestureInFullscreen=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZh = paramBoolean;
    AppMethodBeat.o(14561);
  }

  public void setPlayBtnPosition(String paramString)
  {
    AppMethodBeat.i(14530);
    ab.i("MicroMsg.MPVideoView", "setPlayBtnPosition: %s", new Object[] { paramString });
    if ((!bo.isNullOrNil(paramString)) && (paramString.equalsIgnoreCase("center")))
    {
      this.jZq.setPlayBtnInCenterPosition(true);
      AppMethodBeat.o(14530);
    }
    while (true)
    {
      return;
      this.jZq.setPlayBtnInCenterPosition(false);
      AppMethodBeat.o(14530);
    }
  }

  public void setShowCenterPlayBtn(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(14553);
    ab.i("MicroMsg.MPVideoView", "setPlayBtnInCenterPosition %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZr = paramBoolean;
    View localView = this.hYQ;
    if (paramBoolean)
    {
      j = 0;
      localView.setVisibility(j);
      localView = this.hYR;
      if (!paramBoolean)
        break label105;
    }
    label105: for (int j = i; ; j = 8)
    {
      localView.setVisibility(j);
      if ((this.hZr) && (this.jZq != null))
        this.jZq.setVisibility(8);
      AppMethodBeat.o(14553);
      return;
      j = 8;
      break;
    }
  }

  public void setShowControlProgress(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(14527);
    ab.i("MicroMsg.MPVideoView", "setShowControlProgress %b", new Object[] { Boolean.valueOf(paramBoolean) });
    MPVideoViewControlBar localMPVideoViewControlBar = this.jZq;
    if ((paramBoolean) && (!isLive()));
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      localMPVideoViewControlBar.setShowControlProgress(paramBoolean);
      AppMethodBeat.o(14527);
      return;
    }
  }

  public void setShowFullScreenBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14550);
    ab.i("MicroMsg.MPVideoView", "setShowFullScreenBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jZq.setShowFullScreenBtn(paramBoolean);
    AppMethodBeat.o(14550);
  }

  public void setShowMuteBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14525);
    ab.i("MicroMsg.MPVideoView", "showMuteBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jZq.setShowMuteBtn(paramBoolean);
    AppMethodBeat.o(14525);
  }

  public void setShowPlayBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(14551);
    ab.i("MicroMsg.MPVideoView", "setShowPlayBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.jZq.setShowPlayBtn(paramBoolean);
    AppMethodBeat.o(14551);
  }

  public void setShowProgress(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(14549);
    ab.i("MicroMsg.MPVideoView", "setShowProgress %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZq = paramBoolean;
    MPVideoViewControlBar localMPVideoViewControlBar = this.jZq;
    if ((paramBoolean) && (!isLive()));
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      localMPVideoViewControlBar.setShowProgress(paramBoolean);
      AppMethodBeat.o(14549);
      return;
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(14526);
    ab.i("MicroMsg.MPVideoView", "setTitle %s", new Object[] { paramString });
    this.jZq.setTitle(paramString);
    AppMethodBeat.o(14526);
  }

  public void setVideoSource(int paramInt)
  {
    AppMethodBeat.i(14533);
    ab.i("MicroMsg.MPVideoView", "setVideoSource =%d", new Object[] { Integer.valueOf(paramInt) });
    this.hZs = paramInt;
    AppMethodBeat.o(14533);
  }

  public final void start()
  {
    AppMethodBeat.i(14537);
    ab.i("MicroMsg.MPVideoView", "start");
    if (this.jZp.isPlaying())
      AppMethodBeat.o(14537);
    while (true)
    {
      return;
      if (this.hZe)
        this.jZq.aFN();
      this.hYQ.setVisibility(8);
      this.jZp.start();
      AppMethodBeat.o(14537);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView
 * JD-Core Version:    0.6.2
 */