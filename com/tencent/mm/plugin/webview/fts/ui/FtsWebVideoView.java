package com.tencent.mm.plugin.webview.fts.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.ui.WebSearchDotPercentIndicator;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar;
import com.tencent.mm.plugin.websearch.ui.WebSearchWebVideoViewControlBar.2;
import com.tencent.mm.plugin.webview.fts.c.b.a;
import com.tencent.mm.plugin.webview.fts.c.c;
import com.tencent.mm.plugin.webview.fts.c.d;
import com.tencent.mm.plugin.webview.fts.c.d.1;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public class FtsWebVideoView extends RelativeLayout
{
  public boolean eif;
  private TextView hYN;
  private LinearLayout hYT;
  private TextView hYV;
  private ImageView hYW;
  private ImageView hYX;
  private String hZb;
  private int hZc;
  private boolean hZe;
  private boolean hZg;
  private boolean hZk;
  private boolean hZl;
  private String hZn;
  private boolean isLoading;
  private String mAppId;
  private boolean mAutoPlay;
  private ImageView sDt;
  private ImageView uco;
  private FtsWebVideoView.b ugO;
  public FtsVideoWrapper ugP;
  public WebSearchWebVideoViewControlBar ugQ;
  private View ugR;
  private View ugS;
  private WebSearchDotPercentIndicator ugT;
  private View ugU;
  private Button ugV;
  private TextView ugW;
  private TextView ugX;
  private boolean ugY;
  private a ugZ;
  private FtsWebVideoView.a uha;
  private int uhb;
  private d uhc;
  private b.a uhd;
  private int uhe;
  private boolean uhf;
  private long uhg;
  private View uhh;
  private View uhi;
  private FtsWebVideoView.c uhj;
  public BroadcastReceiver uhk;
  private String url;

  public FtsWebVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(5864);
    this.ugO = FtsWebVideoView.b.uhm;
    this.uhj = FtsWebVideoView.c.uhq;
    this.uhk = new FtsWebVideoView.10(this);
    init(paramContext);
    AppMethodBeat.o(5864);
  }

  public FtsWebVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(5865);
    this.ugO = FtsWebVideoView.b.uhm;
    this.uhj = FtsWebVideoView.c.uhq;
    this.uhk = new FtsWebVideoView.10(this);
    init(paramContext);
    AppMethodBeat.o(5865);
  }

  public FtsWebVideoView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(5863);
    this.ugO = FtsWebVideoView.b.uhm;
    this.uhj = FtsWebVideoView.c.uhq;
    this.uhk = new FtsWebVideoView.10(this);
    setAutoPlay(paramBoolean);
    init(paramContext);
    AppMethodBeat.o(5863);
  }

  private void aEY()
  {
    AppMethodBeat.i(5893);
    this.ugZ = new a(getContext(), this, new FtsWebVideoView.12(this));
    AppMethodBeat.o(5893);
  }

  private void aFa()
  {
    AppMethodBeat.i(5894);
    this.ugP.setIMMVideoViewCallback(new h.b()
    {
      public final void c(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(5848);
        ab.i("MicroMsg.FtsWebVideoView", "onError errorMsg=%s what=%d extra=%d", new Object[] { paramAnonymousString3, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        h.pYm.e(14911, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), FtsWebVideoView.n(FtsWebVideoView.this), at.gB(FtsWebVideoView.this.getContext()) });
        if (FtsWebVideoView.h(FtsWebVideoView.this) != null)
        {
          paramAnonymousString2 = FtsWebVideoView.h(FtsWebVideoView.this);
          ab.e("MicroMsg.JsApiVideoCallback", "onError what %d, extra %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          paramAnonymousString2.clean();
        }
        try
        {
          paramAnonymousString1 = new org/json/JSONObject;
          paramAnonymousString1.<init>();
          paramAnonymousString1.put("errCode", paramAnonymousInt1);
          paramAnonymousString1.put("errMsg", String.valueOf(paramAnonymousInt2));
          paramAnonymousString2.aM(paramAnonymousString2.a(7, paramAnonymousString1));
          FtsWebVideoView.this.pause();
          FtsWebVideoView.a(FtsWebVideoView.this, FtsWebVideoView.this.getContext().getString(2131304246, new Object[] { paramAnonymousInt1 + ":" + paramAnonymousInt2 }), FtsWebVideoView.this.getContext().getString(2131304271));
          AppMethodBeat.o(5848);
          return;
        }
        catch (JSONException paramAnonymousString1)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.JsApiVideoCallback", paramAnonymousString1, null, new Object[0]);
        }
      }

      public final void cp(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5849);
        ab.i("MicroMsg.FtsWebVideoView", "onPrepared");
        paramAnonymousString1 = FtsWebVideoView.o(FtsWebVideoView.this);
        paramAnonymousString1.iaB = -1;
        paramAnonymousString1.iaC = 0;
        paramAnonymousString1.iaA = 0.0F;
        FtsWebVideoView.c(FtsWebVideoView.this).nG(FtsWebVideoView.f(FtsWebVideoView.this));
        AppMethodBeat.o(5849);
      }

      public final void cq(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5850);
        ab.i("MicroMsg.FtsWebVideoView", "onVideoEnded");
        if (FtsWebVideoView.h(FtsWebVideoView.this) != null)
        {
          paramAnonymousString1 = FtsWebVideoView.h(FtsWebVideoView.this);
          ab.d("MicroMsg.JsApiVideoCallback", "onVideoEnded %s", new Object[] { paramAnonymousString1.toString() });
          paramAnonymousString1.aFW();
        }
        try
        {
          paramAnonymousString1.aM(paramAnonymousString1.a(3, null));
          if (FtsWebVideoView.p(FtsWebVideoView.this))
          {
            FtsWebVideoView.this.ar(0, true);
            AppMethodBeat.o(5850);
            return;
          }
        }
        catch (JSONException paramAnonymousString1)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.JsApiVideoCallback", paramAnonymousString1, null, new Object[0]);
            continue;
            FtsWebVideoView.this.ar(0, false);
            FtsWebVideoView.this.pause();
            FtsWebVideoView.q(FtsWebVideoView.this);
            FtsWebVideoView.r(FtsWebVideoView.this).setImageResource(2130838889);
            FtsWebVideoView.c(FtsWebVideoView.this).setVisibility(8);
            AppMethodBeat.o(5850);
          }
        }
      }

      public final void cr(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5852);
        ab.i("MicroMsg.FtsWebVideoView", "onVideoPause");
        if ((FtsWebVideoView.h(FtsWebVideoView.this) != null) && (FtsWebVideoView.h(FtsWebVideoView.this) != null))
        {
          paramAnonymousString1 = FtsWebVideoView.h(FtsWebVideoView.this);
          ab.d("MicroMsg.JsApiVideoCallback", "onVideoPause %s", new Object[] { paramAnonymousString1.toString() });
          paramAnonymousString1.aFW();
        }
        while (true)
        {
          try
          {
            paramAnonymousString1.aM(paramAnonymousString1.a(2, null));
            AppMethodBeat.o(5852);
            return;
          }
          catch (JSONException paramAnonymousString1)
          {
            ab.printErrStackTrace("MicroMsg.JsApiVideoCallback", paramAnonymousString1, null, new Object[0]);
          }
          AppMethodBeat.o(5852);
        }
      }

      public final void cs(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5853);
        ab.i("MicroMsg.FtsWebVideoView", "onVideoPlay, isLive:%b", new Object[] { Boolean.valueOf(FtsWebVideoView.t(FtsWebVideoView.this)) });
        if (FtsWebVideoView.h(FtsWebVideoView.this) != null)
        {
          paramAnonymousString1 = FtsWebVideoView.h(FtsWebVideoView.this);
          ab.d("MicroMsg.JsApiVideoCallback", "onVideoPlay %s", new Object[] { paramAnonymousString1.toString() });
          paramAnonymousString1.iat = 0;
          if (paramAnonymousString1.ias == null)
            paramAnonymousString1.ias = new ap(new d.1(paramAnonymousString1), true);
          paramAnonymousString1.ias.ae(250L, 250L);
        }
        try
        {
          paramAnonymousString1.aM(paramAnonymousString1.a(1, null));
          if ((FtsWebVideoView.u(FtsWebVideoView.this) > 0L) && (FtsWebVideoView.u(FtsWebVideoView.this) != 9223372036854775807L))
          {
            long l = System.currentTimeMillis() - FtsWebVideoView.u(FtsWebVideoView.this);
            h.pYm.e(14909, new Object[] { Long.valueOf(l), Long.valueOf(System.currentTimeMillis()), Long.valueOf(l), at.gB(FtsWebVideoView.this.getContext()), FtsWebVideoView.n(FtsWebVideoView.this) });
          }
          AppMethodBeat.o(5853);
          return;
        }
        catch (JSONException paramAnonymousString1)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.JsApiVideoCallback", paramAnonymousString1, null, new Object[0]);
        }
      }

      public final void ct(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5854);
        ab.i("MicroMsg.FtsWebVideoView", "onVideoWaiting");
        FtsWebVideoView.c(FtsWebVideoView.this).cHe();
        FtsWebVideoView.a(FtsWebVideoView.this, true);
        AppMethodBeat.o(5854);
      }

      public final void cu(String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(5855);
        ab.i("MicroMsg.FtsWebVideoView", "onVideoWaitingEnd");
        FtsWebVideoView.a(FtsWebVideoView.this, false);
        FtsWebVideoView.c(FtsWebVideoView.this).cHf();
        FtsWebVideoView.c(FtsWebVideoView.this).aFE();
        AppMethodBeat.o(5855);
      }

      public final void d(String paramAnonymousString1, String paramAnonymousString2, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(5851);
        ab.i("MicroMsg.FtsWebVideoView", "onGetVideoSize width=%d height=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (FtsWebVideoView.s(FtsWebVideoView.this) == FtsWebVideoView.b.uhm)
        {
          paramAnonymousString2 = FtsWebVideoView.this;
          if (paramAnonymousInt1 >= paramAnonymousInt2)
            break label96;
        }
        label96: for (paramAnonymousString1 = FtsWebVideoView.b.uho; ; paramAnonymousString1 = FtsWebVideoView.b.uhn)
        {
          FtsWebVideoView.a(paramAnonymousString2, paramAnonymousString1);
          ab.i("MicroMsg.FtsWebVideoView", "onGetVideoSize adjust direction from AUTO to %s", new Object[] { FtsWebVideoView.s(FtsWebVideoView.this) });
          AppMethodBeat.o(5851);
          return;
        }
      }
    });
    AppMethodBeat.o(5894);
  }

  private void aZb()
  {
    AppMethodBeat.i(5901);
    this.ugQ = new WebSearchWebVideoViewControlBar(getContext());
    this.ugQ.setVisibility(8);
    this.ugQ.setEnterFullScreenBtnClickListener(new FtsWebVideoView.14(this));
    this.ugQ.setExitFullScreenBtnClickListener(new FtsWebVideoView.2(this));
    this.ugQ.setMuteBtnOnClickListener(new FtsWebVideoView.3(this));
    this.ugQ.setIplaySeekCallback(new FtsWebVideoView.4(this));
    this.ugQ.setOnPlayButtonClickListener(new FtsWebVideoView.5(this));
    this.ugQ.setStatePorter(new FtsWebVideoView.6(this));
    this.ugP.setVideoFooterView(this.ugQ);
    AppMethodBeat.o(5901);
  }

  private void cWu()
  {
    AppMethodBeat.i(5871);
    if (aFb())
    {
      this.uco.setVisibility(0);
      AppMethodBeat.o(5871);
    }
    while (true)
    {
      return;
      this.uco.setVisibility(8);
      AppMethodBeat.o(5871);
    }
  }

  private void cWv()
  {
    AppMethodBeat.i(5877);
    this.ugR.setVisibility(8);
    AppMethodBeat.o(5877);
  }

  private boolean cWw()
  {
    AppMethodBeat.i(5897);
    boolean bool;
    if ((this.hZe) && (!cWx()))
    {
      bool = true;
      AppMethodBeat.o(5897);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5897);
    }
  }

  private boolean cWx()
  {
    AppMethodBeat.i(5898);
    boolean bool;
    if (this.ugR.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(5898);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5898);
    }
  }

  private boolean fo(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(5867);
    Object localObject = this.uhj;
    if (at.isConnected(paramContext))
    {
      if ((this.uhf) || (at.isWifi(paramContext)))
        break label157;
      pause();
      this.uhj = FtsWebVideoView.c.uhr;
      this.ugQ.setVisibility(8);
      String str = getNetUnavailableTip();
      localObject = paramContext.getString(2131304243);
      paramContext.getString(2131304240);
      gZ(str, (String)localObject);
      AppMethodBeat.o(5867);
    }
    while (true)
    {
      return bool;
      if (localObject == FtsWebVideoView.c.uhs)
      {
        this.uhh.setVisibility(0);
        this.uhi.setVisibility(8);
        this.ugR.setVisibility(0);
        postDelayed(new FtsWebVideoView.11(this, paramContext), 200L);
      }
      while (true)
      {
        AppMethodBeat.o(5867);
        break;
        fp(paramContext);
      }
      label157: bool = true;
      AppMethodBeat.o(5867);
    }
  }

  private void fp(Context paramContext)
  {
    AppMethodBeat.i(5868);
    this.uhj = FtsWebVideoView.c.uhs;
    pause();
    gZ(paramContext.getString(2131304258), paramContext.getString(2131304271));
    AppMethodBeat.o(5868);
  }

  private void gZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(5870);
    cWv();
    this.uhh.setVisibility(8);
    this.uhi.setVisibility(0);
    this.ugQ.setVisibility(8);
    this.ugR.setVisibility(0);
    if (!TextUtils.isEmpty(paramString1))
    {
      this.ugX.setText(paramString1);
      this.ugX.setVisibility(0);
      if (TextUtils.isEmpty(paramString2))
        break label139;
      this.ugV.setText(paramString2);
      this.ugV.setVisibility(0);
    }
    while (true)
    {
      this.ugS.setVisibility(0);
      this.ugU.setVisibility(8);
      this.ugW.setVisibility(8);
      cWu();
      AppMethodBeat.o(5870);
      return;
      this.ugX.setVisibility(8);
      break;
      label139: this.ugV.setVisibility(8);
    }
  }

  private String getNetUnavailableTip()
  {
    AppMethodBeat.i(5869);
    Object localObject;
    if (this.uhe == 0)
    {
      localObject = getContext().getString(2131304260);
      AppMethodBeat.o(5869);
      return localObject;
    }
    Context localContext = getContext();
    long l = this.uhe;
    if (l < 0L)
      localObject = "";
    while (true)
    {
      localObject = localContext.getString(2131304259, new Object[] { localObject });
      AppMethodBeat.o(5869);
      break;
      localObject = new BigDecimal(l);
      float f = ((BigDecimal)localObject).divide(new BigDecimal(1048576), 2, 0).floatValue();
      if (f > 1.0F)
      {
        localObject = (int)f + "M";
      }
      else
      {
        f = ((BigDecimal)localObject).divide(new BigDecimal(1024), 2, 0).floatValue();
        localObject = (int)f + "K";
      }
    }
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(5866);
    LayoutInflater.from(paramContext).inflate(2130969642, this);
    this.ugP = ((FtsVideoWrapper)findViewById(2131821402));
    this.hYN = ((TextView)findViewById(2131821370));
    this.ugR = findViewById(2131824278);
    this.ugS = findViewById(2131824281);
    this.hYT = ((LinearLayout)findViewById(2131821409));
    this.ugT = ((WebSearchDotPercentIndicator)findViewById(2131821412));
    this.hYV = ((TextView)findViewById(2131821411));
    this.hYW = ((ImageView)findViewById(2131821410));
    this.hYX = ((ImageView)findViewById(2131821404));
    this.uhh = findViewById(2131821891);
    this.uhi = findViewById(2131824282);
    this.ugT.setDotsNum(8);
    this.sDt = ((ImageView)findViewById(2131824280));
    this.ugU = findViewById(2131824279);
    this.ugW = ((TextView)findViewById(2131824285));
    this.ugV = ((Button)findViewById(2131824284));
    this.ugX = ((TextView)findViewById(2131824283));
    this.uco = ((ImageView)findViewById(2131821418));
    this.ugW.setOnClickListener(new FtsWebVideoView.1(this));
    this.uco.setOnClickListener(new FtsWebVideoView.7(this));
    this.ugV.setOnClickListener(new FtsWebVideoView.8(this));
    this.ugU.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(5834);
        FtsWebVideoView.this.cg(true);
        FtsWebVideoView.c(FtsWebVideoView.this).aFE();
        AppMethodBeat.o(5834);
      }
    });
    aEY();
    aFa();
    aZb();
    paramContext.registerReceiver(this.uhk, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    cWv();
    AppMethodBeat.o(5866);
  }

  private boolean isLive()
  {
    boolean bool = false;
    AppMethodBeat.i(5903);
    ab.i("MicroMsg.FtsWebVideoView", "isLive %b %b", new Object[] { Boolean.valueOf(this.hZk), Boolean.valueOf(this.ugP.isLive()) });
    if ((this.hZk) || (this.ugP.isLive()))
    {
      AppMethodBeat.o(5903);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(5903);
    }
  }

  private void setCover(String paramString)
  {
    AppMethodBeat.i(5884);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(5884);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.hZn))
      {
        ab.i("MicroMsg.FtsWebVideoView", "setCover mCoverUrl not null");
        AppMethodBeat.o(5884);
      }
      else
      {
        AppMethodBeat.o(5884);
      }
    }
  }

  public final boolean aFb()
  {
    AppMethodBeat.i(5900);
    boolean bool;
    if (this.uha == null)
    {
      ab.w("MicroMsg.FtsWebVideoView", "isInFullScreen mFullScreenDelegate null");
      bool = false;
      AppMethodBeat.o(5900);
    }
    while (true)
    {
      return bool;
      bool = this.uha.isFullScreen();
      AppMethodBeat.o(5900);
    }
  }

  public final void ar(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(5881);
    ab.i("MicroMsg.FtsWebVideoView", "seek to position=%d current=%d isLive=%b", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.ugP.getCurrPosSec()), Boolean.valueOf(this.hZk) });
    if (isLive())
      AppMethodBeat.o(5881);
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.ugP.e(paramInt, paramBoolean);
        AppMethodBeat.o(5881);
      }
      else
      {
        this.ugP.s(paramInt);
        AppMethodBeat.o(5881);
      }
    }
  }

  public final void bL(String paramString, int paramInt)
  {
    AppMethodBeat.i(5880);
    ab.i("MicroMsg.FtsWebVideoView", "setVideoPath path=%s isLive=%s", new Object[] { paramString, Boolean.FALSE });
    this.url = paramString;
    if (bo.isNullOrNil(paramString))
    {
      ab.v("MicroMsg.FtsWebVideoView", "setVideoPath videoPath empty");
      AppMethodBeat.o(5880);
    }
    while (true)
    {
      return;
      stop();
      this.hZk = false;
      this.ugP.c(false, paramString, paramInt);
      if (this.ugQ != null)
        this.ugQ.setVideoTotalTime(paramInt);
      if (this.uhb > 0)
        this.ugP.s(this.uhb);
      if (this.mAutoPlay)
      {
        ab.i("MicroMsg.FtsWebVideoView", "setVideoPath autoPlay");
        cg(false);
      }
      if (paramString.startsWith("wxfile://"))
        setCover(paramString);
      AppMethodBeat.o(5880);
    }
  }

  public final void cg(boolean paramBoolean)
  {
    AppMethodBeat.i(5876);
    ab.i("MicroMsg.FtsWebVideoView", "start");
    cWv();
    if ((paramBoolean) && (!fo(getContext())))
    {
      ab.i("MicroMsg.FtsWebVideoView", "start network is not wifi");
      AppMethodBeat.o(5876);
    }
    while (true)
    {
      return;
      this.uhj = FtsWebVideoView.c.uhq;
      if (this.ugP.isPlaying())
      {
        AppMethodBeat.o(5876);
      }
      else
      {
        if (this.hZe)
        {
          WebSearchWebVideoViewControlBar localWebSearchWebVideoViewControlBar = this.ugQ;
          if (localWebSearchWebVideoViewControlBar.hZL == null)
            localWebSearchWebVideoViewControlBar.hZL = new ap(new WebSearchWebVideoViewControlBar.2(localWebSearchWebVideoViewControlBar), true);
          localWebSearchWebVideoViewControlBar.aFP();
          localWebSearchWebVideoViewControlBar.hZL.stopTimer();
          localWebSearchWebVideoViewControlBar.hZL.ae(500L, 500L);
        }
        this.ugP.start();
        if (this.uhg == 0L)
        {
          this.uhg = System.currentTimeMillis();
          AppMethodBeat.o(5876);
        }
        else
        {
          this.uhg = 9223372036854775807L;
          AppMethodBeat.o(5876);
        }
      }
    }
  }

  public final void er(boolean paramBoolean)
  {
    AppMethodBeat.i(5902);
    if (this.uhc == null)
    {
      AppMethodBeat.o(5902);
      return;
    }
    if (this.ugO == FtsWebVideoView.b.uho);
    for (String str = "vertical"; ; str = "horizontal")
    {
      this.uhc.b(this.hZc, paramBoolean, str);
      cWu();
      AppMethodBeat.o(5902);
      break;
    }
  }

  public d getCallback()
  {
    return this.uhc;
  }

  public String getCookieData()
  {
    return this.hZb;
  }

  public int getCurrPosMs()
  {
    AppMethodBeat.i(5888);
    int i = this.ugP.getCurrPosMs();
    AppMethodBeat.o(5888);
    return i;
  }

  public int getCurrPosSec()
  {
    AppMethodBeat.i(5887);
    int i = this.ugP.getCurrPosSec();
    AppMethodBeat.o(5887);
    return i;
  }

  public int getSystemVolume()
  {
    AppMethodBeat.i(5896);
    int i = ((AudioManager)getContext().getSystemService("audio")).getStreamVolume(3);
    AppMethodBeat.o(5896);
    return i;
  }

  public b.a getUiLifecycleListener()
  {
    return this.uhd;
  }

  public int getVideoSizeByte()
  {
    return this.uhe;
  }

  public int getmVideoPlayerId()
  {
    return this.hZc;
  }

  public final void nH(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(5899);
    ab.i("MicroMsg.FtsWebVideoView", "operateFullScreen toFullScreen=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (this.uha == null)
    {
      ab.w("MicroMsg.FtsWebVideoView", "operateFullScreen mFullScreenDelegate null");
      AppMethodBeat.o(5899);
    }
    while (true)
    {
      return;
      if (paramBoolean == aFb())
      {
        ab.i("MicroMsg.FtsWebVideoView", "operateFullScreen current same");
        AppMethodBeat.o(5899);
      }
      else if (paramBoolean)
      {
        Object localObject = this.uha;
        paramBoolean = bool;
        if (this.ugO != FtsWebVideoView.b.uho)
          paramBoolean = true;
        ((FtsWebVideoView.a)localObject).nI(paramBoolean);
        localObject = this.ugQ;
        ((WebSearchWebVideoViewControlBar)localObject).hZM = true;
        ((WebSearchWebVideoViewControlBar)localObject).aFJ();
        er(true);
        AppMethodBeat.o(5899);
      }
      else
      {
        this.uha.aDF();
        this.ugQ.aDF();
        AppMethodBeat.o(5899);
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(5895);
    a locala;
    boolean bool;
    if ((this.hZg) || (aFb()))
    {
      if (this.ugZ != null)
      {
        locala = this.ugZ;
        if (locala.ugH.cGl())
        {
          int i = paramMotionEvent.getActionMasked();
          if (i == 0)
          {
            locala.iaA = paramMotionEvent.getRawX();
            locala.JB = ((AudioManager)locala.mContext.getSystemService("audio")).getStreamVolume(3);
            locala.hXK = c.cN(locala.mContext);
          }
          locala.iay.onTouchEvent(paramMotionEvent);
          if ((i == 1) || (i == 3))
          {
            if (locala.ugG != a.a.ugM)
              break label178;
            locala.ugH.j(locala.iaC, paramMotionEvent.getRawX() - locala.iaA);
            locala.iaB = -1;
            locala.iaC = 0;
            locala.iaA = 0.0F;
          }
        }
        else
        {
          locala.ugG = a.a.ugJ;
        }
      }
      AppMethodBeat.o(5895);
      bool = true;
    }
    while (true)
    {
      return bool;
      label178: if (locala.ugG == a.a.ugK)
      {
        ((AudioManager)locala.mContext.getSystemService("audio")).getStreamMaxVolume(3);
        locala.ugH.aFl();
        break;
      }
      if (locala.ugG != a.a.ugL)
        break;
      locala.ugH.aFm();
      break;
      if ((paramMotionEvent.getAction() == 0) && (cWw()))
        this.ugQ.nG(this.isLoading);
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(5895);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(5878);
    ab.i("MicroMsg.FtsWebVideoView", "pause");
    cWv();
    if (!this.ugP.isPlaying())
      AppMethodBeat.o(5878);
    while (true)
    {
      return;
      this.ugP.pause();
      AppMethodBeat.o(5878);
    }
  }

  public void setAllowMobileNetPlay(boolean paramBoolean)
  {
    this.uhf = paramBoolean;
  }

  public void setAppId(String paramString)
  {
    AppMethodBeat.i(5872);
    ab.i("MicroMsg.FtsWebVideoView", "setAppId appid=%s", new Object[] { paramString });
    this.mAppId = paramString;
    AppMethodBeat.o(5872);
  }

  public void setAutoPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(5873);
    ab.i("MicroMsg.FtsWebVideoView", "setAutoPlay =%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.mAutoPlay = paramBoolean;
    AppMethodBeat.o(5873);
  }

  public void setCallback(d paramd)
  {
    this.uhc = paramd;
  }

  public void setCookieData(String paramString)
  {
    this.hZb = paramString;
  }

  public final void setCover$16da05f7(String paramString)
  {
    AppMethodBeat.i(5883);
    ab.i("MicroMsg.FtsWebVideoView", "setCover coverUrl=%s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(5883);
    while (true)
    {
      return;
      this.hZn = paramString;
      b.abR().a(this.hYX, paramString, null, null);
      AppMethodBeat.o(5883);
    }
  }

  public void setDisableScroll(boolean paramBoolean)
  {
    AppMethodBeat.i(5890);
    ab.i("MicroMsg.FtsWebVideoView", "setDisableScroll isDisableScroll=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.ugY = paramBoolean;
    AppMethodBeat.o(5890);
  }

  public void setDuration(int paramInt)
  {
    AppMethodBeat.i(5874);
    if (paramInt <= 0)
    {
      ab.i("MicroMsg.FtsWebVideoView", "setDuration error duration=%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(5874);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(5874);
    }
  }

  public void setFullScreenDelegate(FtsWebVideoView.a parama)
  {
    this.uha = parama;
  }

  public void setFullScreenDirection(String paramString)
  {
    AppMethodBeat.i(5889);
    ab.i("MicroMsg.FtsWebVideoView", "setFullScreenDirection %s", new Object[] { paramString });
    if ("horizontal".equalsIgnoreCase(paramString))
    {
      this.ugO = FtsWebVideoView.b.uhn;
      AppMethodBeat.o(5889);
    }
    while (true)
    {
      return;
      if ("vertical".equalsIgnoreCase(paramString))
      {
        this.ugO = FtsWebVideoView.b.uho;
        AppMethodBeat.o(5889);
      }
      else
      {
        this.ugO = FtsWebVideoView.b.uhm;
        AppMethodBeat.o(5889);
      }
    }
  }

  public void setInitialTime(int paramInt)
  {
    AppMethodBeat.i(5892);
    ab.i("MicroMsg.FtsWebVideoView", "setInitialTime initialTime=%d", new Object[] { Integer.valueOf(paramInt) });
    this.uhb = paramInt;
    AppMethodBeat.o(5892);
  }

  public void setIsShowBasicControls(boolean paramBoolean)
  {
    AppMethodBeat.i(5882);
    ab.i("MicroMsg.FtsWebVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZe = paramBoolean;
    AppMethodBeat.o(5882);
  }

  public void setLoop(boolean paramBoolean)
  {
    AppMethodBeat.i(5875);
    ab.i("MicroMsg.FtsWebVideoView", "setLoop loop=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZl = paramBoolean;
    AppMethodBeat.o(5875);
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(5886);
    ab.i("MicroMsg.FtsWebVideoView", "setMute isMute=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.eif = paramBoolean;
    this.ugP.setMute(paramBoolean);
    if (paramBoolean)
    {
      this.ugQ.NO();
      AppMethodBeat.o(5886);
    }
    while (true)
    {
      return;
      this.ugQ.cVM();
      AppMethodBeat.o(5886);
    }
  }

  public void setObjectFit(String paramString)
  {
    AppMethodBeat.i(5885);
    ab.i("MicroMsg.FtsWebVideoView", "setObjectFit objectFit=%s", new Object[] { paramString });
    if ("fill".equalsIgnoreCase(paramString))
    {
      this.ugP.setScaleType(h.d.vhE);
      this.hYX.setScaleType(ImageView.ScaleType.FIT_XY);
      AppMethodBeat.o(5885);
    }
    while (true)
    {
      return;
      if ("cover".equalsIgnoreCase(paramString))
      {
        this.ugP.setScaleType(h.d.vhG);
        this.hYX.setScaleType(ImageView.ScaleType.CENTER_CROP);
        AppMethodBeat.o(5885);
      }
      else
      {
        this.ugP.setScaleType(h.d.vhF);
        this.hYX.setScaleType(ImageView.ScaleType.FIT_CENTER);
        AppMethodBeat.o(5885);
      }
    }
  }

  public void setPageGesture(boolean paramBoolean)
  {
    AppMethodBeat.i(5891);
    ab.i("MicroMsg.FtsWebVideoView", "setPageGesture pageGesture=%b", new Object[] { Boolean.valueOf(paramBoolean) });
    this.hZg = paramBoolean;
    AppMethodBeat.o(5891);
  }

  public void setUiLifecycleListener(b.a parama)
  {
    this.uhd = parama;
  }

  public void setVideoPlayerId(int paramInt)
  {
    this.hZc = paramInt;
  }

  public void setVideoSizeByte(int paramInt)
  {
    this.uhe = paramInt;
  }

  public final void stop()
  {
    AppMethodBeat.i(5879);
    ab.i("MicroMsg.FtsWebVideoView", "stop");
    if (!this.ugP.isPlaying())
      AppMethodBeat.o(5879);
    while (true)
    {
      return;
      this.ugP.stop();
      WebSearchWebVideoViewControlBar localWebSearchWebVideoViewControlBar = this.ugQ;
      if (localWebSearchWebVideoViewControlBar.hZL != null)
        localWebSearchWebVideoViewControlBar.hZL.stopTimer();
      AppMethodBeat.o(5879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView
 * JD-Core Version:    0.6.2
 */