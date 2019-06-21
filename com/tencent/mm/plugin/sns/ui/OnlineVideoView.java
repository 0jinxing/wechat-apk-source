package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.model.d.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.HashMap;

public class OnlineVideoView extends RelativeLayout
  implements d.a, ae.a, e.a
{
  private int cNW;
  private boolean cNX;
  private int cNY;
  private bau cNr;
  private String czD;
  private int duration;
  private boolean eif;
  private int fDG;
  private com.tencent.mm.model.d iaf;
  ak kkp;
  private com.tencent.mm.pluginsdk.ui.tools.e klq;
  private ap klw;
  private Context mContext;
  boolean mOO;
  ImageView mmB;
  private RelativeLayout mmW;
  private TextView mqf;
  private boolean mqg;
  private boolean mqh;
  private int mqi;
  private ProgressBar mqj;
  private MMPinProgressBtn mqk;
  private com.tencent.mm.plugin.n.b orK;
  private az qFT;
  private c qNa;
  private ap rcg;
  private boolean rkY;
  private e.e rlb;
  private int rlf;
  String rlg;
  private boolean rlh;
  private OnlineVideoView.a rli;
  private TextView rlj;
  private ae rlk;
  private boolean rll;
  private boolean rlm;
  private int rln;
  private int rlo;
  private long rlp;
  private long rlq;
  private b.b rlr;
  private c rls;
  private c rlt;
  private long rlu;
  private int rlv;

  public OnlineVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public OnlineVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38407);
    this.rlf = 0;
    this.mOO = false;
    this.mqg = false;
    this.eif = false;
    this.cNr = null;
    this.rlh = false;
    this.rlk = null;
    this.rlm = false;
    this.duration = 0;
    this.rln = 0;
    this.rlo = 0;
    this.rlp = 0L;
    this.rlq = 0L;
    this.mqi = 0;
    this.kkp = new ak(Looper.getMainLooper());
    this.rcg = new ap(new OnlineVideoView.16(this), true);
    this.klw = new ap(new OnlineVideoView.17(this), true);
    this.rlr = new b.b()
    {
      public final void Xw(String paramAnonymousString)
      {
      }

      public final void bj(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
      }

      public final void bk(String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(38386);
        OnlineVideoView.o(OnlineVideoView.this).postDelayed(new OnlineVideoView.2.1(this, paramAnonymousBoolean, paramAnonymousString), 100L);
        AppMethodBeat.o(38386);
      }

      public final void cmu()
      {
      }
    };
    this.rls = new c()
    {
    };
    this.rlt = new OnlineVideoView.4(this);
    this.qNa = new OnlineVideoView.5(this);
    this.rlb = new OnlineVideoView.6(this);
    this.orK = new OnlineVideoView.7(this);
    this.mContext = paramContext;
    ab.i("MicroMsg.OnlineVideoView", "%d ui init view.", new Object[] { Integer.valueOf(hashCode()) });
    LayoutInflater.from(paramContext).inflate(2130970831, this);
    this.mmB = ((ImageView)findViewById(2131822133));
    this.mmW = ((RelativeLayout)findViewById(2131822134));
    this.rlj = ((TextView)findViewById(2131822135));
    this.rlj.setVisibility(8);
    this.mqk = ((MMPinProgressBtn)findViewById(2131822136));
    this.mqj = ((ProgressBar)findViewById(2131821891));
    this.mqf = ((TextView)findViewById(2131822138));
    com.tencent.mm.modelcontrol.d.afF();
    if (com.tencent.mm.modelcontrol.d.afO())
    {
      this.mqh = true;
      this.klq = new VideoPlayerTextureView(paramContext);
      ((VideoPlayerTextureView)this.klq).setIOnlineCache(this.orK);
      ((VideoPlayerTextureView)this.klq).setOpenWithNoneSurface(true);
      h.pYm.a(354L, 148L, 1L, false);
    }
    while (true)
    {
      this.klq.setVideoCallback(this);
      paramContext = new RelativeLayout.LayoutParams(-1, -2);
      paramContext.addRule(13);
      this.mmW.addView((View)this.klq, paramContext);
      a(false, 0.0F);
      AppMethodBeat.o(38407);
      return;
      this.mqh = false;
      this.klq = new VideoTextureView(paramContext);
      h.pYm.a(354L, 149L, 1L, false);
    }
  }

  private void C(boolean paramBoolean, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(38420);
    if (this.cNr == null)
    {
      ab.w("MicroMsg.OnlineVideoView", "%d start download video but media is null.", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(38420);
    }
    int i;
    while (true)
    {
      return;
      if (this.rlk == null)
      {
        ab.w("MicroMsg.OnlineVideoView", "%d start download video but helper is null.", new Object[] { Integer.valueOf(hashCode()) });
        AppMethodBeat.o(38420);
      }
      else if (this.cNr.wEG == 2)
      {
        ab.w("MicroMsg.OnlineVideoView", "%d it start download video, url type is weixin", new Object[] { Integer.valueOf(hashCode()) });
        this.rlf = 3;
        af.cnA().a(this.cNr, 4, null, this.qFT);
        AppMethodBeat.o(38420);
      }
      else
      {
        if (paramBoolean)
          break;
        com.tencent.mm.modelcontrol.d.afF();
        if (!com.tencent.mm.modelcontrol.d.afN())
          break;
        ab.i("MicroMsg.OnlineVideoView", "%d it start online download video", new Object[] { Integer.valueOf(hashCode()) });
        this.rlf = 1;
        i = paramInt;
        if (paramInt == 0)
          i = 30;
        paramBoolean = bool;
        this.rlk.a(this.cNr, this.fDG, this.czD, paramBoolean, i);
        AppMethodBeat.o(38420);
      }
    }
    ab.i("MicroMsg.OnlineVideoView", "%d it start offline download video", new Object[] { Integer.valueOf(hashCode()) });
    this.rlf = 2;
    if (paramInt != 0);
    while (true)
    {
      paramBoolean = false;
      i = paramInt;
      break;
      paramInt = 31;
    }
  }

  private void DS(int paramInt)
  {
    AppMethodBeat.i(38415);
    String str = an.fZ(af.getAccSnsPath(), this.cNr.Id) + i.e(this.cNr);
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("image_path", str);
    localIntent.putExtra("Retr_Msg_Type", 11);
    ab.i("MicroMsg.OnlineVideoView", "send video path %s reqCode %d", new Object[] { str, Integer.valueOf(paramInt) });
    com.tencent.mm.bp.d.b(this.mContext, ".ui.transmit.SelectConversationUI", localIntent, paramInt);
    this.cNY = 0;
    AppMethodBeat.o(38415);
  }

  private void a(boolean paramBoolean, float paramFloat)
  {
    AppMethodBeat.i(38418);
    this.kkp.post(new OnlineVideoView.11(this, paramBoolean, paramFloat));
    AppMethodBeat.o(38418);
  }

  private void aNt()
  {
    AppMethodBeat.i(38421);
    this.kkp.post(new OnlineVideoView.13(this));
    AppMethodBeat.o(38421);
  }

  private void af(final int paramInt, final boolean paramBoolean)
  {
    AppMethodBeat.i(38416);
    this.kkp.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(38384);
        Object localObject1 = af.cnF().YT(OnlineVideoView.a(OnlineVideoView.this));
        if (localObject1 == null)
          AppMethodBeat.o(38384);
        while (true)
        {
          return;
          ab.i("MicroMsg.OnlineVideoView", "fav download video[%s] farFromScene %d isFromMain %b", new Object[] { OnlineVideoView.a(OnlineVideoView.this), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
          Object localObject2 = new cl();
          ((cl)localObject2).cvA.cvH = paramInt;
          ((cl)localObject2).cvA.activity = ((Activity)OnlineVideoView.b(OnlineVideoView.this));
          com.tencent.mm.plugin.sns.j.a.a((cl)localObject2, (n)localObject1);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          if (((cl)localObject2).cvB.ret == 0)
            OnlineVideoView.csi();
          while (true)
          {
            if (paramBoolean)
            {
              localObject2 = new rb();
              ((rb)localObject2).cNg.cwT = ((n)localObject1).cqU();
              ((rb)localObject2).cNg.cFc = i.j((n)localObject1);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            }
            OnlineVideoView.c(OnlineVideoView.this);
            if (OnlineVideoView.d(OnlineVideoView.this) == null)
              break label322;
            if (!bo.isNullOrNil(OnlineVideoView.d(OnlineVideoView.this).getVideoPath()))
              break label286;
            ab.i("MicroMsg.OnlineVideoView", "%d had not set video path to play", new Object[] { Integer.valueOf(OnlineVideoView.this.hashCode()) });
            localObject1 = aq.a(OnlineVideoView.a(OnlineVideoView.this), OnlineVideoView.e(OnlineVideoView.this));
            if (!bo.isNullOrNil((String)localObject1))
              OnlineVideoView.this.bq((String)localObject1, false);
            AppMethodBeat.o(38384);
            break;
            OnlineVideoView.csj();
          }
          label286: if (!OnlineVideoView.d(OnlineVideoView.this).isPlaying())
          {
            OnlineVideoView.d(OnlineVideoView.this).start();
            AppMethodBeat.o(38384);
          }
          else
          {
            label322: AppMethodBeat.o(38384);
          }
        }
      }
    });
    AppMethodBeat.o(38416);
  }

  private void bJc()
  {
    AppMethodBeat.i(38422);
    this.kkp.post(new OnlineVideoView.14(this));
    AppMethodBeat.o(38422);
  }

  private void bwD()
  {
    AppMethodBeat.i(38419);
    String str;
    if (!this.mOO)
    {
      str = aq.a(this.czD, this.cNr);
      ab.i("MicroMsg.OnlineVideoView", "%d toggleVideo local id %s finish path %s isPreview %b", new Object[] { Integer.valueOf(hashCode()), this.czD, str, Boolean.valueOf(this.mOO) });
      if (bo.isNullOrNil(str))
        break label124;
      ab.i("MicroMsg.OnlineVideoView", "%d sns video already download finish, play now", new Object[] { Integer.valueOf(hashCode()) });
      a(true, 0.0F);
      bq(str, false);
      AppMethodBeat.o(38419);
    }
    while (true)
    {
      return;
      str = this.rlg;
      break;
      label124: a(false, 0.0F);
      C(false, 0);
      aNt();
      AppMethodBeat.o(38419);
    }
  }

  private boolean bwE()
  {
    boolean bool = false;
    AppMethodBeat.i(38428);
    if (!this.rll)
      AppMethodBeat.o(38428);
    while (true)
    {
      return bool;
      com.tencent.mm.kernel.g.RQ();
      bool = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xQl, false);
      AppMethodBeat.o(38428);
    }
  }

  private void csd()
  {
    AppMethodBeat.i(38417);
    long l = bo.yz();
    String str1 = aq.a(this.czD, this.cNr);
    String str2 = u.uu(str1);
    if (bo.isNullOrNil(str2))
    {
      Toast.makeText(this.mContext, this.mContext.getString(2131304256), 1).show();
      h.pYm.a(354L, 222L, 1L, false);
    }
    while (true)
    {
      this.rlh = false;
      ab.i("MicroMsg.OnlineVideoView", "%d save downloaded video finish %d %s", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(bo.az(l)), str1 });
      this.kkp.post(new OnlineVideoView.10(this));
      AppMethodBeat.o(38417);
      return;
      Toast.makeText(this.mContext, this.mContext.getString(2131304257, new Object[] { str2 }), 1).show();
      com.tencent.mm.sdk.f.a.a(str2, this.mContext);
      h.pYm.a(354L, 221L, 1L, false);
    }
  }

  private void csg()
  {
    AppMethodBeat.i(38433);
    this.rlu = bo.anU();
    ab.d("MicroMsg.OnlineVideoView", "%d notePlayVideo notePlayVideo %d ", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(this.rlu) });
    AppMethodBeat.o(38433);
  }

  private void csh()
  {
    AppMethodBeat.i(38434);
    if (this.rlu > 0L)
      this.rlv = ((int)(this.rlv + (bo.anU() - this.rlu) / 1000L));
    ab.i("MicroMsg.OnlineVideoView", "%d notePauseVideo playVideoDuration %d ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.rlv) });
    this.rlu = 0L;
    AppMethodBeat.o(38434);
  }

  public final void EA()
  {
    AppMethodBeat.i(38427);
    ab.i("MicroMsg.OnlineVideoView", "%d on completion", new Object[] { Integer.valueOf(hashCode()) });
    if (this.rli == null)
      if ((com.tencent.mm.compatible.util.d.iX(18)) || (!this.mqh))
      {
        yI(0);
        AppMethodBeat.o(38427);
      }
    while (true)
    {
      return;
      if (this.klq != null)
      {
        String str = this.klq.getVideoPath();
        this.klq.stop();
        bq(str, this.rll);
      }
      AppMethodBeat.o(38427);
    }
  }

  public final void a(bau parambau, String paramString, int paramInt)
  {
    AppMethodBeat.i(38410);
    this.czD = paramString;
    this.fDG = paramInt;
    paramString = az.dtl();
    paramString.oyB = this.fDG;
    this.qFT = paramString;
    if (this.cNr != parambau)
    {
      this.cNr = parambau;
      boolean bool = af.cnC().b(this.cNr, this.mmB, 2130837968, this.mContext.hashCode(), this.qFT);
      ab.i("MicroMsg.OnlineVideoView", "%d fresh thumb image %b", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(bool) });
    }
    this.mOO = false;
    ab.i("MicroMsg.OnlineVideoView", "%d set video data[%s, %d] isPreview %b ", new Object[] { Integer.valueOf(hashCode()), this.czD, Integer.valueOf(this.fDG), Boolean.valueOf(this.mOO) });
    AppMethodBeat.o(38410);
  }

  public final void akX()
  {
    AppMethodBeat.i(38431);
    ab.i("MicroMsg.OnlineVideoView", "%d pauseByDataBlock", new Object[] { Integer.valueOf(hashCode()) });
    csh();
    aNt();
    if (this.klq.isPlaying())
    {
      ab.i("MicroMsg.OnlineVideoView", "%d pause play", new Object[] { Integer.valueOf(hashCode()) });
      csh();
      this.klq.pause();
    }
    AppMethodBeat.o(38431);
  }

  public final void bq(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(38429);
    ab.i("MicroMsg.OnlineVideoView", "%d prepare video isOnlinePlay %b filePath %s", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.OnlineVideoView", "%d prepare video but filepath is null.", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(38429);
      return;
    }
    this.rll = paramBoolean;
    if (this.klq != null)
    {
      if (this.rlo == -3)
        break label218;
      if ((this.klq instanceof VideoPlayerTextureView))
      {
        ((VideoPlayerTextureView)this.klq).setNeedResetExtractor(bwE());
        ((VideoPlayerTextureView)this.klq).setIsOnlineVideoType(paramBoolean);
      }
      this.klq.setOneTimeVideoTextureUpdateCallback(this.rlb);
      this.klq.setVideoPath(paramString);
      a(true, 0.0F);
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RQ();
      if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xPd, Integer.valueOf(0))).intValue() == 1)
      {
        this.mqf.setText(com.tencent.mm.plugin.sight.base.d.RK(paramString));
        this.mqf.setVisibility(0);
      }
      AppMethodBeat.o(38429);
      break;
      label218: ab.i("MicroMsg.OnlineVideoView", "%d prepare video reset source", new Object[] { Integer.valueOf(hashCode()) });
      if ((this.klq instanceof VideoPlayerTextureView))
        ((VideoPlayerTextureView)this.klq).dlA();
      yI(this.rln);
    }
  }

  protected final void cV(boolean paramBoolean)
  {
    AppMethodBeat.i(38423);
    if (this.rll)
      if (paramBoolean)
      {
        al.d(new OnlineVideoView.15(this));
        AppMethodBeat.o(38423);
      }
    while (true)
    {
      return;
      this.rcg.ae(500L, 500L);
      AppMethodBeat.o(38423);
      continue;
      this.klw.ae(500L, 500L);
      AppMethodBeat.o(38423);
    }
  }

  public final void csb()
  {
    AppMethodBeat.i(38408);
    ab.d("MicroMsg.OnlineVideoView", "%d register sns ui event", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.xxA.c(this.rlt);
    AppMethodBeat.o(38408);
  }

  public final void csc()
  {
    AppMethodBeat.i(38409);
    ab.d("MicroMsg.OnlineVideoView", "%d unRegister sns ui event", new Object[] { Integer.valueOf(hashCode()) });
    com.tencent.mm.sdk.b.a.xxA.d(this.rlt);
    AppMethodBeat.o(38409);
  }

  protected final void cse()
  {
    AppMethodBeat.i(38424);
    this.rcg.stopTimer();
    this.klw.stopTimer();
    AppMethodBeat.o(38424);
  }

  public final boolean csf()
  {
    boolean bool = true;
    AppMethodBeat.i(38430);
    ab.i("MicroMsg.OnlineVideoView", "%d resumeByDataGain", new Object[] { Integer.valueOf(hashCode()) });
    if (!this.klq.isPlaying())
    {
      csg();
      bool = this.klq.start();
      bJc();
    }
    AppMethodBeat.o(38430);
    return bool;
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public int getPlayErrorCode()
  {
    return this.mqi;
  }

  public int getPlayVideoDuration()
  {
    AppMethodBeat.i(38435);
    if (this.rlv < 0)
      this.rlv = 0;
    ab.i("MicroMsg.OnlineVideoView", "%d get play video duration [%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.rlv) });
    int i = this.rlv;
    AppMethodBeat.o(38435);
    return i;
  }

  public int getUiStayTime()
  {
    int i = 0;
    if ((this.rlq > 0L) && (this.rlp > 0L));
    for (int j = (int)(this.rlq - this.rlp); ; j = 0)
    {
      if (j < 0)
        j = i;
      while (true)
        return j;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(38414);
    ab.d("MicroMsg.OnlineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    this.rlq = bo.anU();
    ab.i("MicroMsg.OnlineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(hashCode()) });
    csh();
    this.klq.stop();
    com.tencent.mm.sdk.b.a.xxA.d(this.qNa);
    com.tencent.mm.sdk.b.a.xxA.d(this.rls);
    af.cnA().b(this.rlr);
    cse();
    this.kkp.removeCallbacksAndMessages(null);
    if (this.rlk != null)
    {
      this.rlk.csk();
      this.rlk.clear();
    }
    if (com.tencent.mm.r.a.Cc() != null)
      com.tencent.mm.r.a.Cc().Ic();
    if (this.iaf != null)
      this.iaf.cy(false);
    this.iaf = null;
    this.cNr = null;
    this.czD = null;
    this.rlk = null;
    this.rlo = 0;
    AppMethodBeat.o(38414);
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38425);
    ab.e("MicroMsg.OnlineVideoView", "%d on play video error what %d extra %d. isOnlinePlay %b isMMVideoPlayer[%b]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(this.rll), Boolean.valueOf(this.mqh) });
    Object localObject1;
    if (this.rll)
    {
      h.pYm.a(354L, 230L, 1L, false);
      this.mqi = paramInt2;
      csh();
      localObject1 = this.klq.getVideoPath();
      this.rln = (this.klq.getCurrentPosition() / 1000);
      if (!this.rll)
        break label394;
      if (paramInt1 != -2)
        break label345;
      this.klq.stop();
    }
    while (true)
    {
      try
      {
        aNt();
        if (this.rlk != null)
        {
          localObject1 = this.rlk;
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((ae)localObject1).fUL + 0 + "_-1";
          if (!((ae)localObject1).rlC.containsKey(localObject2))
          {
            ab.i("MicroMsg.OnlineVideoViewHelper", "request all data. [%s]", new Object[] { ((ae)localObject1).fUL });
            com.tencent.mm.modelvideo.o.alm();
            com.tencent.mm.al.e.k(((ae)localObject1).fUL, 0, -1);
            ((ae)localObject1).rlC.put(localObject2, Integer.valueOf(0));
            h.pYm.a(354L, 207L, 1L, false);
            h.pYm.e(13836, new Object[] { Integer.valueOf(403), Long.valueOf(bo.anT()), "" });
          }
          ((ae)localObject1).fUP = 5;
          ((ae)localObject1).fUU = true;
          ((ae)localObject1).fUX = false;
        }
        csh();
        AppMethodBeat.o(38425);
        return;
        h.pYm.a(354L, 231L, 1L, false);
        break;
        label345: if (paramInt1 == -3)
        {
          this.rlo = paramInt1;
          this.klq.pause();
          continue;
        }
        cse();
        this.klq.stop();
        continue;
      }
      catch (Exception localException)
      {
        AppMethodBeat.o(38425);
        continue;
      }
      label394: this.klq.stop();
      this.mqg = true;
      a(false, 0.0F);
      if (!bo.isNullOrNil(localException))
      {
        ab.w("MicroMsg.OnlineVideoView", "%d start third player to play", new Object[] { Integer.valueOf(hashCode()) });
        this.kkp.post(new OnlineVideoView.8(this, localException));
      }
      AppMethodBeat.o(38425);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(38413);
    ab.d("MicroMsg.OnlineVideoView", "%d on pause %s ", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    cse();
    if (this.klq != null)
      this.klq.stop();
    AppMethodBeat.o(38413);
  }

  public final void onResume()
  {
    AppMethodBeat.i(38412);
    ab.d("MicroMsg.OnlineVideoView", "%d on resume %s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    this.rlp = bo.anU();
    if (this.rlk == null)
    {
      ab.i("MicroMsg.OnlineVideoView", "%d logic init, create new helper and add listener.", new Object[] { Integer.valueOf(hashCode()) });
      this.rlk = new ae(this);
      com.tencent.mm.sdk.b.a.xxA.c(this.qNa);
      com.tencent.mm.sdk.b.a.xxA.c(this.rls);
      af.cnA().a(this.rlr);
      this.iaf = new com.tencent.mm.model.d();
      this.iaf.a(this);
      if (com.tencent.mm.r.a.Cc() != null)
        com.tencent.mm.r.a.Cc().Id();
    }
    if (!this.mqg)
      bwD();
    this.rkY = true;
    AppMethodBeat.o(38412);
  }

  public final void pL()
  {
    AppMethodBeat.i(38426);
    ab.i("MicroMsg.OnlineVideoView", "%d onPrepared playErrorCode[%d] onErrorPlayTimeSec[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.mqi), Integer.valueOf(this.rln) });
    this.mqi = 0;
    if (this.rln > 0)
    {
      yI(this.rln);
      this.rln = 0;
      AppMethodBeat.o(38426);
    }
    while (true)
    {
      return;
      this.rlo = 0;
      bJc();
      csg();
      this.klq.start();
      this.duration = (this.klq.getDuration() / 1000);
      ab.i("MicroMsg.OnlineVideoView", "%d start play duration %d sns local id %s ", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.duration), this.czD });
      cV(false);
      AppMethodBeat.o(38426);
    }
  }

  public void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(38411);
    this.eif = paramBoolean;
    this.klq.setMute(this.eif);
    AppMethodBeat.o(38411);
  }

  public void setVideoCallback(OnlineVideoView.a parama)
  {
    this.rli = parama;
  }

  public final void yI(int paramInt)
  {
    AppMethodBeat.i(38432);
    ab.i("MicroMsg.OnlineVideoView", "%d seek second %d afterSeekPlay %b", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(paramInt), Boolean.TRUE });
    this.rlo = 0;
    bJc();
    this.klq.d(paramInt * 1000, true);
    cV(false);
    AppMethodBeat.o(38432);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.OnlineVideoView
 * JD-Core Version:    0.6.2
 */