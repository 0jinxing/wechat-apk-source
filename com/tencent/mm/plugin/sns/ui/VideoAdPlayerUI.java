package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.q.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.5;
import com.tencent.mm.plugin.sight.decode.ui.VideoPlayView.6;
import com.tencent.mm.plugin.sns.a.b.h;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.a;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b.a;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(19)
public class VideoAdPlayerUI extends MMActivity
  implements b.a, b.b
{
  private String bssid;
  private String cHr;
  private String cMn;
  private String ePJ;
  private String fiJ;
  private String fiK;
  private String hnw;
  private com.tencent.mm.model.d iaf;
  private boolean isPlaying;
  private boolean qFG;
  private String qWO;
  private VideoPlayView rEa;
  private com.tencent.mm.modelsns.b rEb;
  private String rEc;
  private int rEd;
  private String rEe;
  public String rEf;
  public String rEg;
  private int rEh;
  private int rEi;
  private String rEj;
  private String rEk;
  private String rEl;
  private long rEm;
  private int rEn;
  private int rEo;
  private boolean rEp;
  private boolean rEq;
  private bau rEr;
  private String rEs;
  private int rEt;
  private String[] rEu;
  private String[] rEv;
  private com.tencent.mm.plugin.sns.storage.n ros;
  private h rwL;
  private String ssid;
  private String thumbPath;
  private String thumbUrl;
  private String url;

  public VideoAdPlayerUI()
  {
    AppMethodBeat.i(39917);
    this.rEb = null;
    this.rwL = new h("VideoAdPlayerUI");
    this.ePJ = "";
    this.thumbPath = "";
    this.rEc = "";
    this.url = "";
    this.thumbUrl = "";
    this.cHr = "";
    this.qFG = false;
    this.rEd = 0;
    this.rEe = "";
    this.fiJ = "";
    this.fiK = "";
    this.rEf = "";
    this.rEg = "";
    this.rEh = 0;
    this.rEi = 0;
    this.rEj = "";
    this.rEl = "";
    this.rEm = 0L;
    this.rEn = 0;
    this.rEo = 0;
    this.qWO = "";
    this.hnw = "";
    this.rEp = false;
    this.rEq = false;
    this.rEr = null;
    this.isPlaying = false;
    this.rEu = null;
    this.rEv = null;
    AppMethodBeat.o(39917);
  }

  private void Ef(int paramInt)
  {
    AppMethodBeat.i(39927);
    if (!this.qFG)
    {
      AppMethodBeat.o(39927);
      return;
    }
    this.rwL.CI(this.rEa.getDuration());
    this.rwL.qEs.qFu = bo.yz();
    com.tencent.mm.plugin.sns.a.b.a.a locala = this.rwL.qEs;
    if (paramInt == 2);
    for (paramInt = 2; ; paramInt = 1)
    {
      locala.qFt = paramInt;
      this.rwL.qEs.qFs = 2;
      ab.i("MicroMsg.VideoPlayerUI", "duration  orient " + this.rwL.qEs.qFt);
      AppMethodBeat.o(39927);
      break;
    }
  }

  public final void Xw(String paramString)
  {
  }

  public final void bj(String paramString, boolean paramBoolean)
  {
  }

  public final void bk(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(39925);
    ab.i("MicroMsg.VideoPlayerUI", "onSightFinish ".concat(String.valueOf(paramString)));
    this.rEa.setIsDownloading(false);
    this.rEa.setVideoPath(this.ePJ);
    this.rEa.B(this.rEa.getLastProgresstime());
    this.rEa.setLoop(false);
    if ((this.qFG) && (!bo.isNullOrNil(paramString)) && (this.rEr != null) && (paramString.equals(this.rEr.Id)) && (com.tencent.mm.vfs.e.ct(this.ePJ)))
      this.rwL.qEk = 1;
    AppMethodBeat.o(39925);
  }

  public final void cmu()
  {
  }

  public final void fW(String paramString1, String paramString2)
  {
    AppMethodBeat.i(39924);
    ab.i("MicroMsg.VideoPlayerUI", "isPlaying " + this.rEa.isPlaying());
    if (this.rEa.isPlaying())
      AppMethodBeat.o(39924);
    while (true)
    {
      return;
      this.rEa.setLoop(false);
      if (paramString2.equals(this.rEa.getVideoPath()))
      {
        this.rEa.B(this.rEa.getLastProgresstime());
        this.rEa.start();
        ab.i("MicroMsg.VideoPlayerUI", "onSightProgressstart " + paramString1 + " path: " + paramString2);
        AppMethodBeat.o(39924);
      }
      else
      {
        this.rEa.setVideoPath(paramString2);
        this.rEa.B(this.rEa.getLastProgresstime());
        ab.i("MicroMsg.VideoPlayerUI", "onSightProgresssetVideoPath " + paramString1 + " path: " + paramString2);
        AppMethodBeat.o(39924);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(39921);
    if (this.isPlaying)
      this.rEa.pause();
    if ((this.rwL != null) && (this.qWO != null) && (this.qWO.length() > 0))
    {
      this.rwL.cmg();
      Intent localIntent = new Intent();
      localIntent.putExtra("KComponentCid", this.qWO);
      localIntent.putExtra("KStreamVideoPlayCount", this.rwL.qEo);
      localIntent.putExtra("KStreamVideoPlayCompleteCount", this.rwL.qEp);
      localIntent.putExtra("KStreamVideoTotalPlayTimeInMs", this.rwL.qEq);
      setResult(-1, localIntent);
    }
    super.finish();
    AppMethodBeat.o(39921);
  }

  public final int getForceOrientation()
  {
    if (this.rEq);
    for (int i = 0; ; i = 4)
      return i;
  }

  public final int getLayoutId()
  {
    return 2130970992;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39919);
    ab.i("MicroMsg.VideoPlayerUI", "onActivityResult %d", new Object[] { Integer.valueOf(paramInt1) });
    if (4097 == paramInt1)
    {
      if (-1 == paramInt2)
      {
        Object localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        String str1 = paramIntent.getStringExtra("custom_send_text");
        Iterator localIterator = bo.P(((String)localObject1).split(",")).iterator();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          ab.i("MicroMsg.VideoPlayerUI", "send sight to %s", new Object[] { str2 });
          Object localObject2 = new j.b();
          ((j.b)localObject2).title = this.rEe;
          ((j.b)localObject2).type = 4;
          label161: label183: int i;
          label296: int j;
          label596: String str3;
          String str4;
          int k;
          int m;
          String str5;
          String str6;
          long l;
          int n;
          if (!bo.isNullOrNil(this.rEr.Url))
          {
            ((j.b)localObject2).url = this.rEr.Url;
            if (bo.isNullOrNil(this.rEr.wER))
            {
              localObject1 = this.rEr.wEH;
              ((j.b)localObject2).thumburl = ((String)localObject1);
              ((j.b)localObject2).fiG = this.rEr.wEO;
              ((j.b)localObject2).fiH = this.rEr.rEd;
              ((j.b)localObject2).fiI = this.rEe;
              ((j.b)localObject2).fiK = this.fiK;
              ((j.b)localObject2).fiJ = this.fiJ;
              ((j.b)localObject2).fiL = this.thumbUrl;
              ((j.b)localObject2).fiM = this.rEf;
              ((j.b)localObject2).fiN = this.rEg;
              ((j.b)localObject2).cMn = this.cMn;
              localObject1 = com.tencent.mm.vfs.e.e(this.thumbPath, 0, -1);
              if (localObject1 != null)
                break label725;
              i = 0;
              ab.i("MicroMsg.VideoPlayerUI", "read buf size %d", new Object[] { Integer.valueOf(i) });
              if (q.a.XD() != null)
                q.a.XD().a((j.b)localObject2, "", "", str2, "", (byte[])localObject1);
              if (this.rEt != 0)
              {
                j = this.rwL.qEs.qFq;
                i = j;
                if (this.isPlaying)
                {
                  i = j;
                  if (this.rwL.qEs.qFu != 0L)
                    i = j + (int)(bo.az(this.rwL.qEs.qFu) / 1000L);
                }
                localObject1 = new com.tencent.mm.modelstat.i(13228, "1,3," + i + "," + this.ssid + "," + this.bssid + "," + bo.anT() + "," + this.rEs + "," + this.rEd, (int)bo.anT());
                com.tencent.mm.kernel.g.RQ();
                com.tencent.mm.kernel.g.RO().eJo.a((m)localObject1, 0);
              }
              com.tencent.mm.plugin.messenger.a.g.bOk().eZ(str1, str2);
              if (this.qFG)
                com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(0, 6, this.ros.field_snsId, 12, 0));
              if (this.rEi == 0)
                continue;
              boolean bool = t.kH(str2);
              if (!bool)
                break label733;
              localObject1 = j.c.qFb;
              str3 = this.rEg;
              str4 = this.rEf;
              k = this.rEh;
              m = this.rEi;
              str5 = this.rEj;
              str6 = this.rEk;
              localObject2 = this.rEl;
              l = this.rEm;
              n = this.rEn;
              j = this.rEo;
              if (!bool)
                break label741;
            }
          }
          else
          {
            label725: label733: label741: for (i = com.tencent.mm.model.n.mA(str2); ; i = 0)
            {
              j.a((j.c)localObject1, str3, str4, k, m, str5, str6, (String)localObject2, l, n, j, i);
              break;
              ((j.b)localObject2).url = this.rEr.wEO;
              break label161;
              localObject1 = this.rEr.wER;
              break label183;
              i = localObject1.length;
              break label296;
              localObject1 = j.c.qFa;
              break label596;
            }
          }
        }
        com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131300520));
      }
    }
    else if (4098 == paramInt1)
    {
      if (this.rEi != 0)
        j.a(j.c.qFc, this.rEg, this.rEf, this.rEh, this.rEi, this.rEj, this.rEk, this.rEl, this.rEm, this.rEn, this.rEo, 0);
      if (-1 != paramInt2)
        break label901;
      if (this.qFG)
        com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(0, 6, this.ros.field_snsId, 15, 0));
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(39919);
      return;
      if (!this.qFG)
        break;
      com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(0, 6, this.ros.field_snsId, 13, 0));
      break;
      label901: if (this.qFG)
        com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(0, 6, this.ros.field_snsId, 16, 0));
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(39926);
    super.onConfigurationChanged(paramConfiguration);
    VideoPlayView localVideoPlayView = this.rEa;
    ab.i("MicroMsg.VideoPlayView", "onConfigurationChanged " + paramConfiguration.orientation + " " + localVideoPlayView.qzr);
    if (localVideoPlayView.qzr != paramConfiguration.orientation)
    {
      if (paramConfiguration.orientation != 1)
        break label119;
      localVideoPlayView.update(1);
    }
    while (true)
    {
      localVideoPlayView.qzr = paramConfiguration.orientation;
      if (localVideoPlayView.qzr == 2)
        localVideoPlayView.iVh.setVisibility(8);
      Ef(paramConfiguration.orientation);
      AppMethodBeat.o(39926);
      return;
      label119: localVideoPlayView.update(2);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39918);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if (ae.hD(this.mController.ylL))
      this.mController.xE(getResources().getColor(2131689639));
    this.rEu = new String[] { getString(2131303588), getString(2131303589), getString(2131303587) };
    this.rEv = new String[] { getString(2131303588), getString(2131303589) };
    paramBundle = getIntent().getStringExtra("KSta_SnSId");
    this.ros = af.cnF().YS(com.tencent.mm.plugin.sns.data.i.Xq(paramBundle));
    this.iaf = new com.tencent.mm.model.d();
    this.rEb = com.tencent.mm.modelsns.b.u(getIntent());
    this.ePJ = getIntent().getStringExtra("KFullVideoPath");
    this.rEc = getIntent().getStringExtra("KStremVideoUrl");
    this.thumbUrl = getIntent().getStringExtra("KThumUrl");
    this.cHr = getIntent().getStringExtra("KMediaId");
    this.qFG = getIntent().getBooleanExtra("IsAd", false);
    this.url = getIntent().getStringExtra("KUrl");
    this.rEe = bo.bc(getIntent().getStringExtra("KMediaTitle"), "");
    this.rEd = getIntent().getIntExtra("KMediaVideoTime", 0);
    this.rEp = getIntent().getBooleanExtra("KBlockFav", false);
    this.rEq = getIntent().getBooleanExtra("ForceLandscape", false);
    this.fiJ = getIntent().getStringExtra("StreamWording");
    this.fiK = getIntent().getStringExtra("StremWebUrl");
    this.qWO = getIntent().getStringExtra("KComponentCid");
    this.rEf = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
    this.rEg = getIntent().getStringExtra("KSta_StremVideoPublishId");
    this.rEh = getIntent().getIntExtra("KSta_SourceType", 0);
    this.rEi = getIntent().getIntExtra("KSta_Scene", 0);
    this.rEj = getIntent().getStringExtra("KSta_FromUserName");
    this.rEk = getIntent().getStringExtra("KSta_ChatName");
    this.rEl = getIntent().getStringExtra("KSta_SnSId");
    this.rEm = getIntent().getLongExtra("KSta_MsgId", 0L);
    this.rEn = getIntent().getIntExtra("KSta_FavID", 0);
    this.rEo = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
    this.cMn = getIntent().getStringExtra("KSta_SnsStatExtStr");
    this.hnw = bo.bc(getIntent().getStringExtra("KViewId"), "");
    this.rEs = bo.bc(getIntent().getStringExtra("ReportArgs"), "");
    this.rEt = getIntent().getIntExtra("NeedReportData", 0);
    if (this.rEt != 0)
    {
      this.ssid = at.gE(ah.getContext());
      this.bssid = at.gF(ah.getContext());
    }
    this.rEr = new bau();
    this.rEr.wEH = this.thumbUrl;
    this.rEr.wEO = this.rEc;
    this.rEr.Id = this.cHr;
    this.rEr.Url = this.url;
    this.rEr.wEG = 1;
    this.rEr.rEd = this.rEd;
    this.rwL.qEm = bo.yz();
    ab.i("MicroMsg.VideoPlayerUI", "init streamvideo " + this.rEr.Id + " attachurl:" + this.rEr.wEO + " videoattachTotalTime:" + this.rEr.rEd + " streamvideowording: " + this.fiJ + " streamvideoweburl: " + this.fiK + " mediaTitle: " + this.rEe + " thumburl " + this.thumbUrl + " streamvideoaduxinfo " + this.rEf + " streamvideopublishid " + this.rEg);
    Object localObject1;
    if (bo.isNullOrNil(this.ePJ))
    {
      paramBundle = an.fZ(af.getAccSnsPath(), this.rEr.Id);
      localObject1 = com.tencent.mm.plugin.sns.data.i.k(this.rEr);
      this.ePJ = (paramBundle + (String)localObject1);
    }
    if ((bo.isNullOrNil(this.thumbPath)) || (!com.tencent.mm.vfs.e.ct(this.thumbPath)))
    {
      paramBundle = "attach" + this.rEr.Id;
      localObject1 = an.fZ(af.getAccSnsPath(), paramBundle);
      this.thumbPath = ((String)localObject1 + com.tencent.mm.plugin.sns.data.i.Xa(paramBundle));
    }
    if (!com.tencent.mm.vfs.e.ct(this.thumbPath));
    try
    {
      paramBundle = new com/tencent/mm/protocal/protobuf/bau;
      paramBundle.<init>();
      paramBundle.parseFrom(this.rEr.toByteArray());
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("attach");
      paramBundle.Id = paramBundle.Id;
      localObject1 = new com/tencent/mm/plugin/sns/data/e;
      ((com.tencent.mm.plugin.sns.data.e)localObject1).<init>(this.rEr);
      ((com.tencent.mm.plugin.sns.data.e)localObject1).qFQ = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject1).nQB = this.rEr.Id;
      af.cnA().a(paramBundle, 7, (com.tencent.mm.plugin.sns.data.e)localObject1, az.xYU);
      getWindow().addFlags(128);
      this.rEa = ((VideoPlayView)findViewById(2131828417));
      localObject1 = this.rEa;
      paramBundle = new AdVideoPlayerLoadingBar(this.mController.ylL);
      Object localObject2 = new RelativeLayout.LayoutParams(-1, -2);
      ((RelativeLayout.LayoutParams)localObject2).addRule(12);
      ((RelativeLayout.LayoutParams)localObject2).bottomMargin = ((VideoPlayView)localObject1).getContext().getResources().getDimensionPixelSize(2131427802);
      ((VideoPlayView)localObject1).qzc = paramBundle;
      ((VideoPlayView)localObject1).klq.setPlayProgressCallback(true);
      ((VideoPlayView)localObject1).addView((View)((VideoPlayView)localObject1).qzc, (ViewGroup.LayoutParams)localObject2);
      ((VideoPlayView)localObject1).qzc.setIplaySeekCallback(new VideoPlayView.5((VideoPlayView)localObject1));
      ((VideoPlayView)localObject1).qzc.setOnPlayButtonClickListener(new VideoPlayView.6((VideoPlayView)localObject1));
      ((VideoPlayView)localObject1).qzc.setIsPlay(((VideoPlayView)localObject1).klq.isPlaying());
      if (((VideoPlayView)localObject1).qzc != null)
        ((View)((VideoPlayView)localObject1).qzc).setVisibility(8);
      paramBundle.seek(0);
      this.rEa.setVideoPlayViewEvent(new VideoAdPlayerUI.1(this));
      this.rEa.setVideoTotalTime(this.rEr.rEd);
      if (com.tencent.mm.vfs.e.ct(this.ePJ))
      {
        this.rwL.qEk = 1;
        this.rEa.setVideoPath(this.ePJ);
        this.rEa.setLeftButtonOnClickListener(new VideoAdPlayerUI.2(this));
        this.rEa.setRightButtonOnCliclListener(new VideoAdPlayerUI.3(this));
        localObject1 = this.rEa;
        localObject2 = this.fiJ;
        paramBundle = new VideoAdPlayerUI.4(this);
        ((VideoPlayView)localObject1).qzf = ((String)localObject2);
        ((VideoPlayView)localObject1).qze.setText((CharSequence)localObject2);
        ((VideoPlayView)localObject1).qze.setOnClickListener(paramBundle);
        this.rEa.clq();
        if (getIntent().getIntExtra("ShareBtnHidden", 0) != 0)
        {
          paramBundle = this.rEa;
          if (paramBundle.qzh != null)
          {
            paramBundle.qzi = false;
            paramBundle.qzh.setVisibility(8);
          }
        }
        AppMethodBeat.o(39918);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.e("MicroMsg.VideoPlayerUI", "error for download thumb");
        continue;
        this.rEa.clo();
        this.rEa.setIsDownloading(true);
        af.cnA().a(this.rEr, 6, null, az.xYU);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39920);
    super.onDestroy();
    getWindow().clearFlags(128);
    if (this.rEi != 0)
      j.a(j.a.qEP, this.rEg, this.rEf, this.rEh, this.rEi, this.rEj, this.rEk, this.rEl, this.rEm, this.rEn, this.rEo);
    if (this.qFG)
      if (this.ros != null)
        break label457;
    label457: for (int i = 0; ; i = this.ros.cre())
    {
      Object localObject;
      int j;
      if (this.ros != null)
      {
        localObject = this.rwL.cmf();
        long l1 = this.rwL.qEl - this.rwL.fQe;
        long l2 = l1;
        if (l1 < 0L)
        {
          ab.e("MicroMsg.VideoPlayerUI", "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", new Object[] { Integer.valueOf(this.rwL.qEl), Long.valueOf(this.rwL.fQe) });
          l2 = this.rwL.qEl;
        }
        j = (int)l2;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.sns.a.b.d(this.hnw, 6, 2, this.rwL.qEl, null, null, 2, (String)localObject, -1, i, j, j, 0, this.ros.crd().cqw(), this.ros.crd().cqx()), 0);
      }
      if (this.rEt != 0)
      {
        j = this.rwL.qEs.qFq;
        i = j;
        if (this.isPlaying)
        {
          i = j;
          if (this.rwL.qEs.qFu != 0L)
            i = j + (int)(bo.az(this.rwL.qEs.qFu) / 1000L);
        }
        localObject = new com.tencent.mm.modelstat.i(13228, "1,2," + i + "," + this.ssid + "," + this.bssid + "," + bo.anT() + "," + this.rEs + "," + this.rEd, (int)bo.anT());
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject, 0);
      }
      setResult(-1, getIntent().putExtra("key_activity_browse_time", dyi()));
      AppMethodBeat.o(39920);
      return;
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(39922);
    super.onPause();
    int i = getResources().getConfiguration().orientation;
    ab.i("MicroMsg.VideoPlayerUI", "onpause  ".concat(String.valueOf(i)));
    Ef(i);
    if ((this.rEa != null) && (this.rEa.isPlaying()))
      this.rEa.pause();
    if (this.rEa != null)
    {
      ab.i("MicroMsg.VideoPlayerUI", "onDetach");
      this.rEa.onDetach();
    }
    af.cnA().qHK.remove(this);
    af.cnA().b(this);
    if (this.rwL != null)
      this.rwL.fQd = bo.yz();
    AppMethodBeat.o(39922);
  }

  public void onResume()
  {
    AppMethodBeat.i(39923);
    super.onResume();
    af.cnA().qHK.add(this);
    af.cnA().a(this);
    if (this.rwL != null)
      this.rwL.onResume();
    AppMethodBeat.o(39923);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI
 * JD-Core Version:    0.6.2
 */