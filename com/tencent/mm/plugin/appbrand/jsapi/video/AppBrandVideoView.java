package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.3;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.4;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.DanmuView.5;
import com.tencent.mm.plugin.appbrand.jsapi.video.danmu.a;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandVideoView extends RelativeLayout
{
  private static AppBrandVideoView.b hYK;
  private int Yp;
  private boolean hLW;
  private boolean hLX;
  private int hLe;
  private RelativeLayout hYL;
  d hYM;
  private TextView hYN;
  private DanmuView hYO;
  d.a hYP;
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
  private int hZc;
  private c hZd;
  private boolean hZe;
  k hZf;
  private boolean hZg;
  private boolean hZh;
  private l hZi;
  private AppBrandVideoView.a hZj;
  private boolean hZk;
  private boolean hZl;
  private double hZm;
  private String hZn;
  private boolean hZo;
  private boolean hZp;
  private boolean hZq;
  private boolean hZr;
  private int hZs;
  private String hZt;
  private boolean hZu;
  private boolean hZv;
  private boolean hZw;
  private String mAppId;
  private boolean mAutoPlay;
  private int mDuration;
  private boolean mIsMute;

  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(126478);
    this.Yp = -1;
    this.hZw = false;
    init(paramContext);
    AppMethodBeat.o(126478);
  }

  public AppBrandVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126479);
    this.Yp = -1;
    this.hZw = false;
    init(paramContext);
    AppMethodBeat.o(126479);
  }

  public <T extends View,  extends d> AppBrandVideoView(Context paramContext, T paramT)
  {
    super(paramContext);
    AppMethodBeat.i(126477);
    this.Yp = -1;
    this.hZw = false;
    this.hYM = ((d)paramT);
    init(paramContext);
    this.hYL.addView(paramT);
    AppMethodBeat.o(126477);
  }

  public static AppBrandVideoView.b aEW()
  {
    return hYK;
  }

  private void aEY()
  {
    AppMethodBeat.i(126523);
    this.hZi = new l(getContext(), this, new AppBrandVideoView.10(this));
    AppMethodBeat.o(126523);
  }

  private void aEZ()
  {
    AppMethodBeat.i(126524);
    this.hYP.aEZ();
    AppMethodBeat.o(126524);
  }

  private void aFa()
  {
    AppMethodBeat.i(126525);
    this.hYM.setIMMVideoViewCallback(new AppBrandVideoView.11(this));
    AppMethodBeat.o(126525);
  }

  private void aFc()
  {
    AppMethodBeat.i(126529);
    this.hYO = ((DanmuView)findViewById(2131821408));
    this.hYO.setDanmuViewCallBack(new AppBrandVideoView.12(this));
    this.hYO.aGm();
    this.hYO.setMaxRunningPerRow(5);
    this.hYO.setPickItemInterval(200);
    this.hYO.hide();
    if ((this.hYM != null) && (((View)this.hYM).getHeight() > 0))
    {
      float f = this.hYO.getYOffset();
      int i = (int)(((View)this.hYM).getHeight() * f);
      f = com.tencent.mm.plugin.appbrand.jsapi.video.danmu.b.cO(getContext());
      this.hYO.setMaxRow((int)(i / f));
    }
    AppMethodBeat.o(126529);
  }

  private boolean aFd()
  {
    AppMethodBeat.i(126535);
    boolean bool;
    if ((this.hZp) && (!this.hYM.isLive()) && (!aFf()))
    {
      bool = true;
      AppMethodBeat.o(126535);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126535);
    }
  }

  private boolean aFe()
  {
    AppMethodBeat.i(126536);
    boolean bool;
    if ((!aFf()) && (((!aFb()) && (this.hZg)) || ((aFb()) && (this.hZh))))
    {
      bool = true;
      AppMethodBeat.o(126536);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126536);
    }
  }

  private boolean aFf()
  {
    AppMethodBeat.i(126537);
    boolean bool;
    if (this.hYQ.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(126537);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(126537);
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(126480);
    LayoutInflater.from(paramContext).inflate(2130968743, this);
    this.hYL = ((RelativeLayout)findViewById(2131821402));
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
    ((ImageView)findViewById(2131821406)).setOnClickListener(new AppBrandVideoView.1(this));
    aEY();
    aFa();
    AppMethodBeat.o(126480);
  }

  private boolean isLive()
  {
    boolean bool = false;
    AppMethodBeat.i(126534);
    ab.i("MicroMsg.AppBrandVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.hZk), Boolean.valueOf(this.hYM.isLive()) });
    if ((this.hZk) || (this.hYM.isLive()))
    {
      AppMethodBeat.o(126534);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(126534);
    }
  }

  private static String ox(int paramInt)
  {
    AppMethodBeat.i(126531);
    String str = oy(paramInt / 60) + ":" + oy(paramInt % 60);
    AppMethodBeat.o(126531);
    return str;
  }

  private static String oy(int paramInt)
  {
    AppMethodBeat.i(126532);
    String str;
    if (paramInt < 10)
    {
      str = "0".concat(String.valueOf(paramInt));
      AppMethodBeat.o(126532);
    }
    while (true)
    {
      return str;
      str = String.valueOf(paramInt);
      AppMethodBeat.o(126532);
    }
  }

  private void setCover(String paramString)
  {
    AppMethodBeat.i(126504);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(126504);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.hZn))
      {
        ab.i("MicroMsg.AppBrandVideoView", "setCover mCoverUrl not null");
        AppMethodBeat.o(126504);
      }
      else
      {
        m.aNS().aa(new AppBrandVideoView.8(this, paramString));
        AppMethodBeat.o(126504);
      }
    }
  }

  public static void setProxy(AppBrandVideoView.b paramb)
  {
    hYK = paramb;
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(126530);
    this.hYP = parama;
    this.hYP.hide();
    this.hYP.setFullScreenBtnOnClickListener(new AppBrandVideoView.13(this));
    this.hYP.setIplaySeekCallback(new AppBrandVideoView.14(this));
    this.hYP.setOnPlayButtonClickListener(new AppBrandVideoView.2(this));
    this.hYP.setStatePorter(new AppBrandVideoView.3(this));
    this.hYP.setMuteBtnOnClickListener(new AppBrandVideoView.4(this));
    this.hYP.setExitFullScreenBtnOnClickListener(new AppBrandVideoView.5(this));
    this.hYP.setOnVisibilityChangedListener(new AppBrandVideoView.6(this));
    this.hYP.setOnUpdateProgressLenListener(new AppBrandVideoView.7(this));
    this.hYM.setControlBar(parama);
    AppMethodBeat.o(126530);
  }

  public final void aEX()
  {
    AppMethodBeat.i(126498);
    ab.i("MicroMsg.AppBrandVideoView", "onUIDestroy");
    clean();
    AppMethodBeat.o(126498);
  }

  public final boolean aFb()
  {
    AppMethodBeat.i(126528);
    boolean bool;
    if (this.hZj == null)
    {
      ab.w("MicroMsg.AppBrandVideoView", "isInFullScreen mFullScreenDelegate null");
      bool = false;
      AppMethodBeat.o(126528);
    }
    while (true)
    {
      return bool;
      bool = this.hZj.isFullScreen();
      AppMethodBeat.o(126528);
    }
  }

  public final void akW()
  {
    AppMethodBeat.i(126496);
    ab.i("MicroMsg.AppBrandVideoView", "onUIResume");
    if (this.hZw)
    {
      ab.i("MicroMsg.AppBrandVideoView", "onUIResume, should skip ui resume");
      this.hZw = false;
      AppMethodBeat.o(126496);
    }
    while (true)
    {
      return;
      this.hYM.akW();
      AppMethodBeat.o(126496);
    }
  }

  public final void clean()
  {
    AppMethodBeat.i(126499);
    ab.i("MicroMsg.AppBrandVideoView", "clean");
    stop();
    this.hYM.aEX();
    if (this.hYO != null)
      this.hYO.clear();
    this.hYP.onDestroy();
    AppMethodBeat.o(126499);
  }

  public final boolean co(String arg1, String paramString2)
  {
    AppMethodBeat.i(126522);
    if (this.hYO == null)
    {
      ab.w("MicroMsg.AppBrandVideoView", " addDanmaku mDanmakuView null");
      aFc();
    }
    int i = g.Ee(paramString2);
    int j = i;
    if (i == 0)
      j = -1;
    paramString2 = new a(getContext(), new SpannableString(???), j, this.hYM.getCurrPosSec());
    DanmuView localDanmuView = this.hYO;
    synchronized (localDanmuView.ibf)
    {
      localDanmuView.ibf.offerFirst(paramString2);
      DanmuView.3 local3 = new com/tencent/mm/plugin/appbrand/jsapi/video/danmu/DanmuView$3;
      local3.<init>(localDanmuView, paramString2);
      com.tencent.mm.sdk.g.d.post(local3, "DanmuView-addItemToWaitingHead");
      AppMethodBeat.o(126522);
      return true;
    }
  }

  public final void d(double paramDouble, boolean paramBoolean)
  {
    AppMethodBeat.i(126501);
    int i = this.hYM.getCurrPosSec();
    ab.i("MicroMsg.AppBrandVideoView", "seek to position=%s current=%d isLive=%b", new Object[] { Double.valueOf(paramDouble), Integer.valueOf(i), Boolean.valueOf(this.hZk) });
    if (isLive())
    {
      AppMethodBeat.o(126501);
      return;
    }
    this.hYQ.setVisibility(8);
    if (paramBoolean)
      this.hYM.e(paramDouble, paramBoolean);
    while (true)
    {
      if ((this.hYO != null) && (i > paramDouble))
      {
        DanmuView localDanmuView = this.hYO;
        i = (int)paramDouble;
        ab.i("MicroMsg.DanmuView", "seekToPlayTime playTime=%d", new Object[] { Integer.valueOf(i) });
        localDanmuView.aGh();
        localDanmuView.aGj();
        localDanmuView.prepare();
        com.tencent.mm.sdk.g.d.post(new DanmuView.5(localDanmuView, i), "DanmuView-seekToPlayTime");
      }
      AppMethodBeat.o(126501);
      break;
      this.hYM.s(paramDouble);
    }
  }

  public final void e(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(126500);
    String str = paramString;
    if (this.hZd != null)
    {
      str = paramString;
      if (this.hZd.asE() != null)
      {
        str = paramString;
        if (this.hZd.asE().ca(paramString))
        {
          paramString = this.hZd.asE().yg(paramString);
          if (paramString != null)
            break label124;
          paramString = null;
          str = paramString;
        }
      }
    }
    ab.i("MicroMsg.AppBrandVideoView", "setVideoPath path=%s isLive=%s", new Object[] { str, Boolean.valueOf(paramBoolean) });
    if (bo.isNullOrNil(str))
    {
      ab.v("MicroMsg.AppBrandVideoView", "setVideoPath videoPath empty");
      AppMethodBeat.o(126500);
    }
    while (true)
    {
      return;
      label124: paramString = "file://" + paramString.getAbsolutePath();
      break;
      stop();
      this.hZk = paramBoolean;
      this.hZt = str;
      this.hYM.setVideoSource(this.hZs);
      this.hYM.c(paramBoolean, str, paramInt);
      if (this.hZm > 0.0D)
        this.hYM.e(this.hZm, this.mAutoPlay);
      Object localObject;
      if (this.hZs == 1)
      {
        paramString = ((e)com.tencent.luggage.a.e.B(e.class)).BR(this.hZt);
        if (paramString != null)
        {
          ab.i("MicroMsg.AppBrandVideoView", "setVideoPath localVideoPath");
          localObject = this.hZt;
          ab.i("MicroMsg.AppBrandVideoView", "leonlad setPreLoadVidePath videoPath=%s", new Object[] { paramString });
          if ((!this.hYM.isPlaying()) && (this.hZt.equalsIgnoreCase((String)localObject)))
          {
            this.hZt = ((String)localObject);
            this.hYM.c(this.hZk, paramString, 0);
            if (this.mAutoPlay)
            {
              ab.i("MicroMsg.AppBrandVideoView", "setPreLoadVidePath autoPlay");
              start();
            }
          }
          if (this.hZf != null)
            paramString = this.hZf;
        }
      }
      try
      {
        JSONObject localJSONObject = paramString.aFV();
        localJSONObject.put("timeStamp", System.currentTimeMillis());
        localJSONObject.put("url", localObject);
        localObject = new com/tencent/mm/plugin/appbrand/jsapi/video/k$a;
        ((k.a)localObject).<init>((byte)0);
        paramString.a((ah)localObject, localJSONObject);
        if (this.mAutoPlay)
        {
          ab.i("MicroMsg.AppBrandVideoView", "setVideoPath autoPlay");
          start();
        }
        setCover(str);
        AppMethodBeat.o(126500);
      }
      catch (JSONException paramString)
      {
        while (true)
          ab.e("MicroMsg.JsApiVideoCallback", "onVideoCanPlay e=%s", new Object[] { paramString });
      }
    }
  }

  public final void eq(boolean paramBoolean)
  {
    AppMethodBeat.i(126508);
    ab.i("MicroMsg.AppBrandVideoView", "enableProgressGesture %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZp = paramBoolean;
    AppMethodBeat.o(126508);
  }

  final void er(boolean paramBoolean)
  {
    AppMethodBeat.i(126533);
    if (this.hZf == null)
      AppMethodBeat.o(126533);
    while (true)
    {
      return;
      this.hZf.c(this.hZc, paramBoolean, this.hLe);
      AppMethodBeat.o(126533);
    }
  }

  public int getCacheTimeSec()
  {
    AppMethodBeat.i(126516);
    int i;
    if (this.hYM != null)
    {
      i = this.hYM.getCacheTimeSec();
      AppMethodBeat.o(126516);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(126516);
    }
  }

  public k getCallback()
  {
    return this.hZf;
  }

  public String getCookieData()
  {
    return this.hZb;
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(126515);
    int i = this.hYM.getCurrPosMs();
    AppMethodBeat.o(126515);
    return i;
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(126514);
    int i = this.hYM.getCurrPosSec();
    AppMethodBeat.o(126514);
    return i;
  }

  public int getDuration()
  {
    AppMethodBeat.i(126491);
    int i;
    if (this.mDuration > 0)
    {
      i = this.mDuration;
      AppMethodBeat.o(126491);
    }
    while (true)
    {
      return i;
      i = this.hYM.getVideoDurationSec();
      AppMethodBeat.o(126491);
    }
  }

  public final void j(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(126527);
    ab.i("MicroMsg.AppBrandVideoView", "operateFullScreen toFullScreen:%b direction:%d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.hZj == null)
    {
      ab.w("MicroMsg.AppBrandVideoView", "operateFullScreen mFullScreenDelegate null");
      AppMethodBeat.o(126527);
    }
    while (true)
    {
      return;
      if (paramBoolean != aFb())
        break;
      ab.i("MicroMsg.AppBrandVideoView", "operateFullScreen current same");
      AppMethodBeat.o(126527);
    }
    if (paramInt == -1)
      if (this.Yp == -1)
      {
        paramInt = 90;
        label95: ab.i("MicroMsg.AppBrandVideoView", "operateFullScreen target direction:%d", new Object[] { Integer.valueOf(paramInt) });
      }
    while (true)
    {
      if (paramBoolean)
      {
        this.hLe = paramInt;
        this.hZj.on(paramInt);
        this.hYP.aFH();
        er(true);
        AppMethodBeat.o(126527);
        break;
        paramInt = this.Yp;
        break label95;
      }
      this.hZj.aDF();
      this.hYP.aDF();
      AppMethodBeat.o(126527);
      break;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(126526);
    boolean bool2;
    if (this.hZv)
    {
      bool2 = true;
      if (!bool2)
        break label63;
      if (this.hZi != null)
        this.hZi.z(paramMotionEvent);
      AppMethodBeat.o(126526);
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
      label63: if ((paramMotionEvent.getAction() == 0) && (this.hZe) && (this.hYQ.getVisibility() != 0))
      {
        this.hYP.aFG();
        if (this.hZu)
          aEZ();
      }
      if (this.hZo)
      {
        AppMethodBeat.o(126526);
        bool2 = bool1;
      }
      else
      {
        bool2 = super.onTouchEvent(paramMotionEvent);
        AppMethodBeat.o(126526);
      }
    }
  }

  public final void ow(int paramInt)
  {
    AppMethodBeat.i(126497);
    ab.i("MicroMsg.AppBrandVideoView", "onUIPause, type:%d", new Object[] { Integer.valueOf(paramInt) });
    if (((paramInt == 2) && (!this.hLX)) || ((paramInt == 1) && (!this.hLW)))
    {
      ab.i("MicroMsg.AppBrandVideoView", "onUIPause, should skip ui pause");
      this.hZw = true;
      AppMethodBeat.o(126497);
    }
    while (true)
    {
      return;
      this.hYM.akV();
      AppMethodBeat.o(126497);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(126494);
    ab.i("MicroMsg.AppBrandVideoView", "pause");
    if (!this.hYM.isPlaying())
      AppMethodBeat.o(126494);
    while (true)
    {
      return;
      this.hYM.pause();
      if ((this.hYO != null) && (this.hYP.aFA()))
        this.hYO.pause();
      AppMethodBeat.o(126494);
    }
  }

  public void setAutoPauseIfNavigate(boolean paramBoolean)
  {
    this.hLW = paramBoolean;
  }

  public void setAutoPauseIfOpenNative(boolean paramBoolean)
  {
    this.hLX = paramBoolean;
  }

  public void setAutoPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(126488);
    ab.i("MicroMsg.AppBrandVideoView", "setAutoPlay =%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mAutoPlay = paramBoolean;
    AppMethodBeat.o(126488);
  }

  public void setCallback(k paramk)
  {
    this.hZf = paramk;
  }

  public void setComponent(c paramc)
  {
    AppMethodBeat.i(126481);
    this.hZd = paramc;
    this.mAppId = paramc.getAppId();
    AppMethodBeat.o(126481);
  }

  public void setConsumeTouchEvent(boolean paramBoolean)
  {
    AppMethodBeat.i(126482);
    ab.i("MicroMsg.AppBrandVideoView", "setConsumeTouchEvent game=%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZo = paramBoolean;
    AppMethodBeat.o(126482);
  }

  public void setCookieData(String paramString)
  {
    this.hZb = paramString;
  }

  public final void setCover$16da05f7(String paramString)
  {
    AppMethodBeat.i(126503);
    ab.i("MicroMsg.AppBrandVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(126503);
    while (true)
    {
      return;
      this.hZn = paramString;
      com.tencent.mm.modelappbrand.a.b.abR().a(this.hYX, paramString, null, null);
      AppMethodBeat.o(126503);
    }
  }

  public void setDanmakuEnable(boolean paramBoolean)
  {
    AppMethodBeat.i(126510);
    ab.i("MicroMsg.AppBrandVideoView", "setDanmakuEnable isEnable=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hYP.setDanmakuBtnOpen(paramBoolean);
    AppMethodBeat.o(126510);
  }

  public void setDanmakuItemList(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(126521);
    if (paramJSONArray == null)
      AppMethodBeat.o(126521);
    while (true)
    {
      return;
      int i;
      ArrayList localArrayList;
      label74: JSONObject localJSONObject;
      if (paramJSONArray != null)
      {
        i = paramJSONArray.length();
        ab.i("MicroMsg.AppBrandVideoView", "setDanmakuItemList length=%d", new Object[] { Integer.valueOf(i) });
        if (this.hYO == null)
        {
          ab.w("MicroMsg.AppBrandVideoView", " setDanmakuItemList mDanmakuView null");
          aFc();
        }
        localArrayList = new ArrayList();
        i = 0;
        if (i >= paramJSONArray.length())
          break label203;
        localJSONObject = paramJSONArray.optJSONObject(i);
        if (localJSONObject != null)
          break label122;
      }
      label122: int j;
      int m;
      for (Object localObject = null; ; localObject = new a(getContext(), new SpannableString((CharSequence)localObject), m, j))
      {
        if (localObject != null)
          localArrayList.add(localObject);
        i++;
        break label74;
        i = 0;
        break;
        j = localJSONObject.optInt("time", 0);
        localObject = localJSONObject.optString("text", "");
        int k = g.Ee(localJSONObject.optString("color", ""));
        m = k;
        if (k == 0)
          m = -1;
      }
      label203: paramJSONArray = this.hYO;
      paramJSONArray.aGh();
      paramJSONArray.aGj();
      paramJSONArray.ibg.clear();
      paramJSONArray.prepare();
      if (localArrayList.isEmpty())
      {
        paramJSONArray.aGi();
        AppMethodBeat.o(126521);
      }
      else
      {
        new DanmuView.4(paramJSONArray, localArrayList).start();
        paramJSONArray.aGi();
        AppMethodBeat.o(126521);
      }
    }
  }

  public void setDuration(int paramInt)
  {
    AppMethodBeat.i(126490);
    if (paramInt <= 0)
    {
      ab.i("MicroMsg.AppBrandVideoView", "setDuration error duration=%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(126490);
    }
    while (true)
    {
      return;
      this.hYS.setText(ox(paramInt));
      this.mDuration = paramInt;
      AppMethodBeat.o(126490);
    }
  }

  public void setEnablePlayGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(126487);
    ab.i("MicroMsg.AppBrandVideoView", "setEnablePlayGesture: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZv = paramBoolean;
    AppMethodBeat.o(126487);
  }

  public void setFullScreenDelegate(AppBrandVideoView.a parama)
  {
    this.hZj = parama;
  }

  public void setFullScreenDirection(int paramInt)
  {
    AppMethodBeat.i(126517);
    ab.i("MicroMsg.AppBrandVideoView", "setFullScreenDirection %d", new Object[] { Integer.valueOf(paramInt) });
    this.Yp = paramInt;
    AppMethodBeat.o(126517);
  }

  public void setInitialTime(double paramDouble)
  {
    AppMethodBeat.i(126520);
    ab.i("MicroMsg.AppBrandVideoView", "setInitialTime initialTime=%s", new Object[] { Double.valueOf(paramDouble) });
    this.hZm = paramDouble;
    AppMethodBeat.o(126520);
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(126502);
    ab.i("MicroMsg.AppBrandVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZe = paramBoolean;
    if (this.hYP != null)
      if (this.hZe)
      {
        this.hYP.aFD();
        AppMethodBeat.o(126502);
      }
    while (true)
    {
      return;
      this.hYP.hide();
      AppMethodBeat.o(126502);
    }
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(126492);
    ab.i("MicroMsg.AppBrandVideoView", "setLoop loop=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZl = paramBoolean;
    AppMethodBeat.o(126492);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(126513);
    ab.i("MicroMsg.AppBrandVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mIsMute = paramBoolean;
    this.hYM.setMute(paramBoolean);
    this.hYP.setMuteBtnState(paramBoolean);
    AppMethodBeat.o(126513);
  }

  public void setObjectFit(String paramString)
  {
    AppMethodBeat.i(126512);
    ab.i("MicroMsg.AppBrandVideoView", "setObjectFit objectFit=%s", new Object[] { paramString });
    if ("fill".equalsIgnoreCase(paramString))
    {
      this.hYM.setScaleType(d.g.iai);
      this.hYX.setScaleType(ImageView.ScaleType.FIT_XY);
      AppMethodBeat.o(126512);
    }
    while (true)
    {
      return;
      if ("cover".equalsIgnoreCase(paramString))
      {
        this.hYM.setScaleType(d.g.iak);
        this.hYX.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AppMethodBeat.o(126512);
      }
      else
      {
        this.hYM.setScaleType(d.g.iaj);
        this.hYX.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AppMethodBeat.o(126512);
      }
    }
  }

  public void setPageGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(126518);
    ab.i("MicroMsg.AppBrandVideoView", "setPageGesture pageGesture=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZg = paramBoolean;
    AppMethodBeat.o(126518);
  }

  public void setPageGestureInFullscreen(boolean paramBoolean)
  {
    AppMethodBeat.i(126519);
    ab.i("MicroMsg.AppBrandVideoView", "setPageGestureInFullscreen pageGestureInFullscreen=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZh = paramBoolean;
    AppMethodBeat.o(126519);
  }

  public void setPlayBtnPosition(String paramString)
  {
    AppMethodBeat.i(126486);
    ab.i("MicroMsg.AppBrandVideoView", "setPlayBtnPosition: %s", new Object[] { paramString });
    if ((!bo.isNullOrNil(paramString)) && (paramString.equalsIgnoreCase("center")))
    {
      this.hYP.setPlayBtnInCenterPosition(true);
      AppMethodBeat.o(126486);
    }
    while (true)
    {
      return;
      this.hYP.setPlayBtnInCenterPosition(false);
      AppMethodBeat.o(126486);
    }
  }

  public void setShowCenterPlayBtn(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(126509);
    ab.i("MicroMsg.AppBrandVideoView", "setPlayBtnInCenterPosition %b", new Object[] { Boolean.valueOf(paramBoolean) });
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
      if ((this.hZr) && (this.hYP != null))
        this.hYP.hide();
      AppMethodBeat.o(126509);
      return;
      j = 8;
      break;
    }
  }

  public void setShowControlProgress(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(126485);
    ab.i("MicroMsg.AppBrandVideoView", "setShowControlProgress %b", new Object[] { Boolean.valueOf(paramBoolean) });
    d.a locala = this.hYP;
    if ((paramBoolean) && (!isLive()));
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      locala.setShowControlProgress(paramBoolean);
      AppMethodBeat.o(126485);
      return;
    }
  }

  public void setShowDanmakuBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(126511);
    ab.i("MicroMsg.AppBrandVideoView", "setShowDanmakuBtn showDanmakuBtn=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      if (this.hYO == null)
        aFc();
      this.hYP.setDanmakuBtnOnClickListener(new AppBrandVideoView.9(this));
    }
    this.hYP.setShowDanmakuBtn(paramBoolean);
    AppMethodBeat.o(126511);
  }

  public void setShowFullScreenBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(126506);
    ab.i("MicroMsg.AppBrandVideoView", "setShowFullScreenBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hYP.setShowFullScreenBtn(paramBoolean);
    AppMethodBeat.o(126506);
  }

  public void setShowMuteBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(126483);
    ab.i("MicroMsg.AppBrandVideoView", "showMuteBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hYP.setShowMuteBtn(paramBoolean);
    AppMethodBeat.o(126483);
  }

  public void setShowPlayBtn(boolean paramBoolean)
  {
    AppMethodBeat.i(126507);
    ab.i("MicroMsg.AppBrandVideoView", "setShowPlayBtn %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hYP.setShowPlayBtn(paramBoolean);
    AppMethodBeat.o(126507);
  }

  public void setShowProgress(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(126505);
    ab.i("MicroMsg.AppBrandVideoView", "setShowProgress %b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZq = paramBoolean;
    d.a locala = this.hYP;
    if ((paramBoolean) && (!isLive()));
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      locala.setShowProgress(paramBoolean);
      AppMethodBeat.o(126505);
      return;
    }
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(126484);
    ab.i("MicroMsg.AppBrandVideoView", "setTitle %s", new Object[] { paramString });
    this.hYP.setTitle(paramString);
    AppMethodBeat.o(126484);
  }

  public void setVideoPlayerId(int paramInt)
  {
    this.hZc = paramInt;
  }

  public void setVideoSource(int paramInt)
  {
    AppMethodBeat.i(126489);
    ab.i("MicroMsg.AppBrandVideoView", "setVideoSource =%d", new Object[] { Integer.valueOf(paramInt) });
    this.hZs = paramInt;
    AppMethodBeat.o(126489);
  }

  public final void start()
  {
    AppMethodBeat.i(126493);
    ab.i("MicroMsg.AppBrandVideoView", "start");
    if (this.hYM.isPlaying())
      AppMethodBeat.o(126493);
    while (true)
    {
      return;
      if (this.hZe)
        this.hYP.aFN();
      this.hYQ.setVisibility(8);
      this.hYM.start();
      if ((this.hYO != null) && (this.hYP.aFA()))
        this.hYO.show();
      ((e)com.tencent.luggage.a.e.B(e.class)).report(this.hZt);
      AppMethodBeat.o(126493);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(126495);
    ab.i("MicroMsg.AppBrandVideoView", "stop");
    if (!this.hYM.isPlaying())
      AppMethodBeat.o(126495);
    while (true)
    {
      return;
      this.hYM.stop();
      this.hYP.aFO();
      if (this.hYO != null)
        this.hYO.hide();
      AppMethodBeat.o(126495);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView
 * JD-Core Version:    0.6.2
 */