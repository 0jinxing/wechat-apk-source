package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.rf;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.model.d.a;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.b;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SnsSightPlayerUI extends MMActivity
  implements d.a, b.b
{
  private float aKM;
  private float aKN;
  private boolean bZi;
  private bau cNr;
  private int cPL;
  public com.tencent.mm.ui.tools.j contextMenuHelper;
  private int cvd;
  private String czD;
  private int duration;
  private String ePJ;
  private boolean foa;
  private com.tencent.mm.model.d iaf;
  private GestureDetector iay;
  private String imagePath;
  n.d jOb;
  Bundle jWy;
  private boolean jYD;
  com.tencent.mm.ui.tools.e jYE;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  com.tencent.mm.pluginsdk.ui.tools.e klq;
  private VelocityTracker mVelocityTracker;
  private int mik;
  private TextView mlK;
  private boolean mlN;
  private ImageView mmX;
  private boolean qFG;
  private int qxZ;
  private TextView qyR;
  private boolean qyS;
  ViewGroup qzb;
  private int qzj;
  private int qzk;
  public int qzr;
  private com.tencent.mm.plugin.sns.storage.n ros;
  private int rpA;
  private int rpB;
  private float rpz;
  private boolean ruY;
  private boolean rvb;
  private boolean rvc;
  private boolean rvd;
  private h rwL;
  private String rwM;
  private TextView rwN;
  private MMPinProgressBtn rwO;
  private com.tencent.mm.plugin.sns.storage.a rwP;
  private String rwQ;
  private RelativeLayout rwR;
  View.OnCreateContextMenuListener rwS;
  private String thumbPath;

  public SnsSightPlayerUI()
  {
    AppMethodBeat.i(39269);
    this.rwL = new h("SnsSightPlayerUI");
    this.ePJ = "";
    this.imagePath = "";
    this.czD = "";
    this.rwM = "";
    this.qFG = false;
    this.klq = null;
    this.qyR = null;
    this.rwN = null;
    this.rwO = null;
    this.cvd = 0;
    this.duration = 0;
    this.cPL = 0;
    this.qxZ = 0;
    this.mik = 0;
    this.qyS = false;
    this.ruY = false;
    this.qzj = 0;
    this.qzk = 0;
    this.bZi = false;
    this.mlN = false;
    this.ros = null;
    this.rwP = null;
    this.cNr = null;
    this.thumbPath = "";
    this.rwQ = "";
    this.mlK = null;
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.aKM = 0.0F;
    this.aKN = 0.0F;
    this.rvb = false;
    this.rvc = false;
    this.rvd = false;
    this.rpz = 1.0F;
    this.rpA = 0;
    this.rpB = 0;
    this.foa = false;
    this.rwS = new SnsSightPlayerUI.5(this);
    this.jOb = new SnsSightPlayerUI.6(this);
    this.qzr = 0;
    AppMethodBeat.o(39269);
  }

  private void Ef(int paramInt)
  {
    AppMethodBeat.i(39284);
    if (!this.qFG)
    {
      AppMethodBeat.o(39284);
      return;
    }
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (this.klq.isPlaying())
    {
      if (this.duration == 0)
        this.duration = this.klq.getDuration();
      this.rwL.CI(this.duration);
      this.rwL.qEs.qFu = bo.yz();
      locala = this.rwL.qEs;
      if (paramInt != 2)
        break label156;
    }
    label156: for (paramInt = 2; ; paramInt = 1)
    {
      locala.qFt = paramInt;
      this.rwL.qEs.qFs = 2;
      ab.i("MicroMsg.SnsSightPlayerUI", "duration " + this.duration + " orient " + this.rwL.qEs.qFt);
      AppMethodBeat.o(39284);
      break;
    }
  }

  private void ag(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(39283);
    if ((this.qzk == 0) || (this.qzj == 0))
    {
      localObject = getResources().getDisplayMetrics();
      this.qzk = ((DisplayMetrics)localObject).heightPixels;
      this.qzj = ((DisplayMetrics)localObject).widthPixels;
    }
    Object localObject = this.qzb.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.rwN.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
    if (paramInt == 1)
    {
      localLayoutParams1.width = this.qzj;
      localLayoutParams1.height = ((int)(this.qzj * 1.0D * 240.0D / 320.0D));
      localLayoutParams.addRule(12, 0);
      localLayoutParams.addRule(1, 0);
      localLayoutParams.addRule(11, -1);
      localLayoutParams.addRule(3, this.qzb.getId());
      findViewById(2131823800).setVisibility(0);
    }
    while (true)
    {
      ab.i("MicroMsg.SnsSightPlayerUI", "orientation " + paramInt + " " + localLayoutParams1.width + " " + localLayoutParams1.height);
      ((View)this.klq).setLayoutParams(localLayoutParams1);
      if ((this.klq instanceof com.tencent.mm.plugin.sight.decode.a.a))
        ((com.tencent.mm.plugin.sight.decode.a.a)this.klq).fi(localLayoutParams1.width, localLayoutParams1.height);
      ((ViewGroup.LayoutParams)localObject).height = localLayoutParams1.height;
      ((ViewGroup.LayoutParams)localObject).width = localLayoutParams1.width;
      this.qyR.setLayoutParams(localLayoutParams);
      this.qzb.setLayoutParams((ViewGroup.LayoutParams)localObject);
      ((View)this.klq).requestLayout();
      if (!paramBoolean)
        Ef(paramInt);
      AppMethodBeat.o(39283);
      return;
      localLayoutParams1.height = this.qzj;
      localLayoutParams1.width = ((int)(this.qzj * 1.0D * 320.0D / 240.0D));
      localLayoutParams.addRule(11, 0);
      localLayoutParams.addRule(3, 0);
      localLayoutParams.addRule(12, -1);
      localLayoutParams.addRule(1, this.qzb.getId());
      findViewById(2131823800).setVisibility(8);
    }
  }

  private void cpN()
  {
    AppMethodBeat.i(39273);
    ab.i("MicroMsg.SnsSightPlayerUI", "snsSightplayui pauseplay");
    this.klq.pause();
    this.klq.onDetach();
    this.iaf.cy(false);
    AppMethodBeat.o(39273);
  }

  private void kB(boolean paramBoolean)
  {
    AppMethodBeat.i(39272);
    this.klq.start();
    this.duration = this.klq.getDuration();
    ab.i("MicroMsg.SnsSightPlayerUI", "startplay get duration " + this.duration);
    this.iaf.a(this);
    com.tencent.mm.plugin.sns.a.b.a.a locala;
    if (paramBoolean)
    {
      locala = this.rwL.qEs;
      if (getResources().getConfiguration().orientation != 2)
        break label127;
    }
    label127: for (int i = 2; ; i = 1)
    {
      locala.qFt = i;
      this.rwL.qEs.qFu = bo.yz();
      this.rwL.qEs.qFs = 2;
      AppMethodBeat.o(39272);
      return;
    }
  }

  public final void Xw(String paramString)
  {
  }

  public final void bcW()
  {
    AppMethodBeat.i(39278);
    int i = this.qzb.getWidth();
    int j = this.qzb.getHeight();
    int k = j;
    if (this.kks != 0)
    {
      k = j;
      if (this.kkt != 0)
        k = (int)(i / this.kks * this.kkt);
    }
    this.jYE.hw(i, k);
    this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
    if (this.rpz != 1.0D)
    {
      int m = com.tencent.mm.ui.ae.fr(this.mController.ylL);
      this.jYE.zEZ = (1.0F / this.rpz);
      if ((this.rpA != 0) || (this.rpB != 0))
      {
        j = (int)(this.qzb.getWidth() / 2 * (1.0F - this.rpz));
        i = this.rpA;
        k = (int)((m + this.qzb.getHeight()) / 2 - k / 2 * this.rpz + this.rpB);
        this.jYE.hy(j + i, k);
      }
    }
    this.jYE.a(this.qzb, this.mmX, new SnsSightPlayerUI.4(this), null);
    AppMethodBeat.o(39278);
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39281);
    ab.i("MicroMsg.SnsSightPlayerUI", "onSightFinish ".concat(String.valueOf(paramString)));
    if ((this.qFG) && (!bo.isNullOrNil(paramString)) && (this.cNr != null) && (paramString.equals(this.cNr.Id)) && (com.tencent.mm.vfs.e.ct(this.ePJ)))
    {
      this.rwL.qEk = 1;
      this.klq.setVideoPath(this.ePJ);
      kB(true);
      if (this.rwO != null)
        this.rwO.setVisibility(8);
    }
    AppMethodBeat.o(39281);
  }

  public final void cmu()
  {
  }

  public void finish()
  {
    AppMethodBeat.i(39271);
    if (!this.foa)
    {
      super.finish();
      this.foa = true;
    }
    AppMethodBeat.o(39271);
  }

  public final int getForceOrientation()
  {
    return 7;
  }

  public final int getLayoutId()
  {
    return 2130970797;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39280);
    if (4097 == paramInt1)
    {
      if (-1 == paramInt2)
      {
        Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bo.P(((String)localObject1).split(",")).iterator();
        String str2;
        label152: Object localObject3;
        cfh localcfh;
        label245: 
        do
        {
          if (!localIterator.hasNext())
            break label806;
          str2 = (String)localIterator.next();
          if (this.cvd == 0)
          {
            localObject1 = af.cnF().YT(this.czD);
            if (localObject1 != null)
            {
              if (!t.kH(str2))
                break;
              localObject2 = new rf();
              ((rf)localObject2).cNk.cFc = i.j((com.tencent.mm.plugin.sns.storage.n)localObject1);
              ((rf)localObject2).cNk.cwT = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU();
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            }
          }
          localObject2 = this.ros.cqu();
          if (!this.qFG)
            break label681;
          localObject3 = this.ros.cqo();
          localcfh = new cfh();
          localcfh.wid = this.cNr.rEd;
          localcfh.fiG = this.cNr.wEO;
          if (((TimeLineObject)localObject2).xfI.wbJ != 15)
            break label628;
          localcfh.fiM = this.rwP.qPj;
          localcfh.fiN = ((TimeLineObject)localObject2).Id;
          if (!bo.isNullOrNil(this.cNr.wES))
            break label657;
          localObject1 = ((TimeLineObject)localObject2).xfF;
          localcfh.fiI = ((String)localObject1);
          if (!bo.isNullOrNil(this.cNr.wER))
            break label669;
          localObject1 = this.cNr.wEH;
          localcfh.fiL = ((String)localObject1);
          if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUn == 0))
          {
            localcfh.fiK = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUp;
            localcfh.fiJ = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUo;
          }
          if (localObject3 != null)
            localcfh.fiK = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qTA;
          i = i.Xr(this.ePJ);
          ab.i("MicroMsg.SnsSightPlayerUI", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d streamvideothumburl %s, duration: %s", new Object[] { str2, this.ePJ, this.imagePath, this.cNr.wEO, Integer.valueOf(this.cNr.rEd), localcfh.fiL, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.g.bOk().a(this, str2, this.ePJ, this.imagePath, 43, i, localcfh, ((TimeLineObject)localObject2).rjC);
          if (str1 != null)
            com.tencent.mm.plugin.messenger.a.g.bOk().eZ(str1, str2);
          com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
        }
        while (!this.qFG);
        label265: label294: label460: i.a(new SnsAdClick(this.cvd, 5, this.ros.field_snsId, 12, 0));
        boolean bool = t.kH(str2);
        Object localObject2 = j.d.qFe;
        if (bool)
        {
          localObject1 = j.c.qFb;
          label542: localObject3 = j.e.qFl;
          if (!bool)
            break label768;
        }
        label768: for (int i = com.tencent.mm.model.n.mA(str2); ; i = 0)
        {
          com.tencent.mm.plugin.sns.a.b.j.a((j.d)localObject2, (j.c)localObject1, (j.e)localObject3, i, this.ros, this.cvd);
          break;
          localObject2 = new rg();
          ((rg)localObject2).cNl.cFc = i.j((com.tencent.mm.plugin.sns.storage.n)localObject1);
          ((rg)localObject2).cNl.cwT = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          break label152;
          label628: localcfh.fiM = ((TimeLineObject)localObject2).xfN.fiM;
          localcfh.fiN = ((TimeLineObject)localObject2).xfN.fiN;
          break label245;
          label657: localObject1 = this.cNr.wES;
          break label265;
          label669: localObject1 = this.cNr.wER;
          break label294;
          label681: i = i.Xr(this.ePJ);
          ab.i("MicroMsg.SnsSightPlayerUI", "send sight to %s, videopath %s, thumbpath %s, duration: %s", new Object[] { str2, this.ePJ, this.imagePath, Integer.valueOf(i) });
          com.tencent.mm.plugin.messenger.a.g.bOk().a(this, str2, this.ePJ, this.imagePath, 43, i, ((TimeLineObject)localObject2).rjC);
          break label460;
          localObject1 = j.c.qFa;
          break label542;
        }
      }
      if (this.qFG)
        i.a(new SnsAdClick(this.cvd, 5, this.ros.field_snsId, 13, 0));
    }
    label806: super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(39280);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(39279);
    bcW();
    AppMethodBeat.o(39279);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(39282);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.SnsSightPlayerUI", "onConfigurationChanged " + paramConfiguration.orientation + " " + this.qzr);
    if (this.qzr == paramConfiguration.orientation)
      AppMethodBeat.o(39282);
    while (true)
    {
      return;
      int i = paramConfiguration.orientation;
      ag(paramConfiguration.orientation, false);
      this.qzr = paramConfiguration.orientation;
      AppMethodBeat.o(39282);
    }
  }

  public void onCreate(final Bundle paramBundle)
  {
    AppMethodBeat.i(39270);
    getIntent().setExtrasClassLoader(getClass().getClassLoader());
    this.cvd = getIntent().getIntExtra("intent_from_scene", -1);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    af.cnA().a(this);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(getResources().getColor(2131689761));
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      getWindow().setFlags(201327616, 201327616);
      this.jWy = paramBundle;
      this.iaf = new com.tencent.mm.model.d();
      this.ePJ = getIntent().getStringExtra("intent_videopath");
      this.imagePath = getIntent().getStringExtra("intent_thumbpath");
      this.czD = getIntent().getStringExtra("intent_localid");
      this.qFG = getIntent().getBooleanExtra("intent_isad", false);
      this.ros = af.cnF().YT(this.czD);
      if (!this.qFG)
        break label344;
      if (this.ros != null)
        break label240;
    }
    label240: Object localObject1;
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
        break label344;
      finish();
      AppMethodBeat.o(39270);
      return;
      getWindow().setFlags(1024, 1024);
      break;
      this.cNr = ((bau)this.ros.cqu().xfI.wbK.get(0));
      paramBundle = an.fZ(af.getAccSnsPath(), this.cNr.Id);
      localObject1 = i.k(this.cNr);
      this.rwQ = (paramBundle + (String)localObject1);
      this.thumbPath = (paramBundle + i.e(this.cNr));
    }
    label344: if (com.tencent.mm.r.a.Cc() != null)
      com.tencent.mm.r.a.Cc().Id();
    if (this.ros != null)
      if (this.cvd == 2)
      {
        paramBundle = this.ros.cqr();
        label381: this.rwP = paramBundle;
        this.rwL.qEm = bo.yz();
        this.rwR = ((RelativeLayout)findViewById(2131821333));
        this.rwR.setOnTouchListener(new SnsSightPlayerUI.1(this));
        ab.d("MicroMsg.SnsSightPlayerUI", com.tencent.mm.compatible.util.g.Mp() + " initView: fullpath:" + this.ePJ + ", imagepath:" + this.imagePath);
        this.jYE = new com.tencent.mm.ui.tools.e(this.mController.ylL);
        this.mmX = ((ImageView)findViewById(2131822079));
        this.mmX.setLayerType(2, null);
        this.qyR = ((TextView)findViewById(2131823800));
        this.rwO = ((MMPinProgressBtn)findViewById(2131827547));
        this.qzb = ((ViewGroup)findViewById(2131823992));
        this.klq = com.tencent.mm.pluginsdk.ui.tools.q.fT(this.mController.ylL);
        paramBundle = new LinearLayout.LayoutParams(-1, -2);
        this.mlK = ((TextView)findViewById(2131827573));
        this.qzb.addView((View)this.klq, 0, paramBundle);
        this.rwN = ((TextView)findViewById(2131827845));
        this.rwN.setText("");
        if (!this.qFG)
          this.rwN.setVisibility(8);
        if (!this.qFG)
          break label1306;
        if (this.cNr != null)
          break label983;
        this.mlK.setVisibility(8);
        label672: com.tencent.mm.pluginsdk.ui.tools.p.a(this.mlK, (VideoSightView)this.klq);
        label686: this.klq.setVideoCallback(new SnsSightPlayerUI.9(this));
        findViewById(2131823992).setOnClickListener(new SnsSightPlayerUI.10(this));
        ((View)this.klq).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(39264);
            SnsSightPlayerUI.this.bcW();
            AppMethodBeat.o(39264);
          }
        });
        this.iay = new GestureDetector(this.mController.ylL, new SnsSightPlayerUI.12(this));
        ((View)this.klq).setOnTouchListener(new SnsSightPlayerUI.13(this));
        if (!com.tencent.mm.vfs.e.ct(this.ePJ))
          break label1318;
        if (this.ePJ != null)
        {
          this.klq.stop();
          this.klq.setVideoPath(this.ePJ);
        }
        this.rwO.setVisibility(8);
      }
    for (this.rwL.qEk = 1; ; this.rwL.qEk = 0)
    {
      ab.d("MicroMsg.SnsSightPlayerUI", System.currentTimeMillis() - l + " initView end");
      paramBundle = new tn();
      paramBundle.cPI.type = 1;
      com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
      if (this.contextMenuHelper == null)
        this.contextMenuHelper = new com.tencent.mm.ui.tools.j(this.mController.ylL);
      this.contextMenuHelper.a((View)this.klq, this.rwS, this.jOb);
      ((View)this.klq).post(new SnsSightPlayerUI.14(this));
      AppMethodBeat.o(39270);
      break;
      paramBundle = this.ros.cqq();
      break label381;
      paramBundle = null;
      break label381;
      label983: if (bo.isNullOrNil(this.cNr.wEO))
      {
        ab.i("MicroMsg.SnsSightPlayerUI", "onCreate: there is no attachurl, show more info btn");
        paramBundle = this.ros.cqu();
        Object localObject2 = this.ros.cqo();
        localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUo;
        localObject2 = ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUp;
        if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil((String)localObject2)))
        {
          this.mlK.setVisibility(0);
          this.mlK.setText((CharSequence)localObject1);
          this.mlK.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(39256);
              Object localObject;
              String str;
              if (j.b.qET.value != 0)
              {
                localObject = j.a.qEN;
                str = paramBundle.Id;
                if (SnsSightPlayerUI.a(SnsSightPlayerUI.this) != null)
                  break label186;
              }
              label186: for (paramAnonymousView = ""; ; paramAnonymousView = SnsSightPlayerUI.a(SnsSightPlayerUI.this).qPj)
              {
                com.tencent.mm.plugin.sns.a.b.j.a((j.a)localObject, str, paramAnonymousView, 1, j.b.qET.value, paramBundle.jBB, null, paramBundle.Id, 0L, 0, 0);
                localObject = new Intent();
                paramAnonymousView = new Bundle();
                paramAnonymousView.putString("key_snsad_statextstr", paramBundle.rjC);
                ((Intent)localObject).putExtra("jsapiargs", paramAnonymousView);
                ((Intent)localObject).putExtra("rawUrl", this.mlW);
                ((Intent)localObject).putExtra("useJs", true);
                i.a(new SnsAdClick(SnsSightPlayerUI.b(SnsSightPlayerUI.this), 5, SnsSightPlayerUI.c(SnsSightPlayerUI.this).field_snsId, 18, 0));
                new ak(Looper.getMainLooper()).post(new SnsSightPlayerUI.7.1(this, (Intent)localObject));
                AppMethodBeat.o(39256);
                return;
              }
            }
          });
          break label672;
        }
        this.mlK.setVisibility(8);
        break label672;
      }
      localObject1 = getResources().getString(2131303579);
      paramBundle = (Bundle)localObject1;
      if (this.cNr.rEd / 60 > 0)
        paramBundle = (String)localObject1 + getResources().getString(2131303581, new Object[] { Integer.valueOf(this.cNr.rEd / 60) });
      localObject1 = paramBundle;
      if (this.cNr.rEd % 60 > 0)
        localObject1 = paramBundle + getResources().getString(2131303582, new Object[] { Integer.valueOf(this.cNr.rEd % 60) });
      paramBundle = (String)localObject1 + getResources().getString(2131303580);
      this.mlK.setText(paramBundle);
      this.mlK.setVisibility(0);
      this.mlK.setOnClickListener(new SnsSightPlayerUI.8(this));
      break label672;
      label1306: this.mlK.setVisibility(8);
      break label686;
      label1318: af.cnA().a(this.cNr, 6, null, az.xYU);
      this.rwO.setVisibility(0);
      this.rwO.dKB();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39274);
    super.onDestroy();
    int i;
    label51: int k;
    label155: com.tencent.mm.bt.b localb1;
    label184: com.tencent.mm.bt.b localb2;
    if (this.qFG)
    {
      if (this.ros != null)
        break label477;
      localObject = "";
      if (this.ros != null)
      {
        String str = this.rwL.cmf();
        if (this.ros != null)
          break label488;
        i = 0;
        long l1 = this.rwL.qEl - this.rwL.fQe;
        long l2 = l1;
        if (l1 < 0L)
        {
          ab.e("MicroMsg.SnsSightPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", new Object[] { Integer.valueOf(this.rwL.qEl), Long.valueOf(this.rwL.fQe) });
          l2 = this.rwL.qEl;
        }
        int j = (int)l2;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.ai.p localp = com.tencent.mm.kernel.g.RO().eJo;
        if (this.cvd != 0)
          break label499;
        k = 1;
        int m = this.rwL.qEl;
        if (this.cvd != 2)
          break label505;
        localb1 = this.ros.crd().cqy();
        if (this.cvd != 2)
          break label520;
        localb2 = this.ros.crd().cqz();
        label204: localp.a(new com.tencent.mm.plugin.sns.a.b.d((String)localObject, k, 2, m, null, null, 2, str, -1, i, j, j, 0, localb1, localb2), 0);
      }
    }
    ab.d("MicroMsg.SnsSightPlayerUI", "on dismiss");
    if ((this.qFG) && (this.ros != null) && (this.ros.DI(32)))
      com.tencent.mm.plugin.sns.a.b.j.a(j.b.qET, j.a.qEO, this.ros, this.cvd);
    af.cnA().b(this);
    Object localObject = com.tencent.mm.modelsns.b.u(getIntent());
    boolean bool;
    if (localObject != null)
    {
      if (!this.qFG)
        break label541;
      if (bo.isNullOrNil(this.cNr.wEO))
        break label535;
      bool = true;
      label332: ((com.tencent.mm.modelsns.b)localObject).cS(bool);
    }
    while (true)
    {
      ((com.tencent.mm.modelsns.b)localObject).update();
      ((com.tencent.mm.modelsns.b)localObject).ajK();
      if (com.tencent.mm.r.a.Cc() != null)
        com.tencent.mm.r.a.Cc().Ic();
      if (this.klq != null)
      {
        this.klq.setVideoCallback(null);
        this.klq.stop();
        this.klq.onDetach();
      }
      if (!this.qyS)
      {
        localObject = new tn();
        ((tn)localObject).cPI.type = 0;
        ((tn)localObject).cPI.cPJ = this.qxZ;
        ((tn)localObject).cPI.cPK = this.mik;
        ((tn)localObject).cPI.cPL = this.cPL;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      }
      this.iaf.cy(false);
      AppMethodBeat.o(39274);
      return;
      label477: localObject = this.rwP.hnw;
      break;
      label488: i = this.ros.cre();
      break label51;
      label499: k = 2;
      break label155;
      label505: localb1 = this.ros.crd().cqw();
      break label184;
      label520: localb2 = this.ros.crd().cqx();
      break label204;
      label535: bool = false;
      break label332;
      label541: ((com.tencent.mm.modelsns.b)localObject).cS(false);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(39277);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    ab.i("MicroMsg.SnsSightPlayerUI", "onpause  ".concat(String.valueOf(i)));
    Ef(i);
    if (!this.ruY)
    {
      cpN();
      ab.v("check", "onclick");
      new ak().post(new SnsSightPlayerUI.2(this));
    }
    while (true)
    {
      if (this.rwL != null)
        this.rwL.fQd = bo.yz();
      AppMethodBeat.o(39277);
      return;
      cpN();
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39276);
    super.onResume();
    if (!this.bZi)
    {
      ab.i("MicroMsg.SnsSightPlayerUI", "initOrientation ".concat(String.valueOf(getResources().getConfiguration().orientation)));
      if (getResources().getConfiguration().orientation == 2)
        ag(getResources().getConfiguration().orientation, true);
      this.bZi = true;
    }
    if ((this.qzk == 0) || (this.qzj == 0))
    {
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      this.qzk = localDisplayMetrics.heightPixels;
      this.qzj = localDisplayMetrics.widthPixels;
    }
    if ((this.ruY) && (com.tencent.mm.vfs.e.ct(this.ePJ)))
    {
      kB(false);
      this.ruY = false;
    }
    if (this.rwL != null)
      this.rwL.onResume();
    AppMethodBeat.o(39276);
  }

  public void onStart()
  {
    AppMethodBeat.i(39275);
    Bundle localBundle = this.jWy;
    if (!this.jYD)
    {
      this.jYD = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.kkq = getIntent().getIntExtra("img_gallery_top", 0);
        this.kkr = getIntent().getIntExtra("img_gallery_left", 0);
        this.kks = getIntent().getIntExtra("img_gallery_width", 0);
        this.kkt = getIntent().getIntExtra("img_gallery_height", 0);
        this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
        if (localBundle == null)
          this.qzb.getViewTreeObserver().addOnPreDrawListener(new SnsSightPlayerUI.3(this));
      }
    }
    super.onStart();
    AppMethodBeat.o(39275);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI
 * JD-Core Version:    0.6.2
 */