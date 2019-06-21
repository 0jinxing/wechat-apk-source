package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ma;
import com.tencent.mm.g.a.qv;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.e;
import com.tencent.mm.plugin.sns.model.AdlandingRemoteServiceConnectedReceiver;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.ac;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.l;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.m;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.b.f;
import com.tencent.mm.plugin.sns.storage.b.g;
import com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.snackbar.a.b;
import com.tencent.mm.vfs.e;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

@com.tencent.mm.ui.base.a(32)
public class SnsAdNativeLandingPagesUI extends MMActivity
{
  private boolean aGz;
  String cFc;
  public int cvd;
  private long edh;
  public String hcx;
  private String hya;
  private long iBA;
  private int ieu;
  private int iev;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  String lvA;
  String lvz;
  protected a.b mUw;
  private ImageView mmX;
  public String qPj;
  public String qTL;
  private String qTM;
  private int qUA;
  private int qUe;
  String qVw;
  public int qXp;
  public int qXr;
  public Map<String, String> qXs;
  private ac rdd;
  public LinkedList<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g> rnM;
  private ImageView rnN;
  private ImageView rnO;
  private ImageView rnP;
  private TextView rnQ;
  Bundle rnR;
  private boolean rnS;
  private String rnT;
  private String rnU;
  private String rnV;
  private String rnW;
  private String rnX;
  private ImageView rnY;
  String rnZ;
  private Map<String, SnsAdLandingPageFloatView> roA;
  private BroadcastReceiver roB;
  private BroadcastReceiver roC;
  private ContentFragment.a roD;
  private ViewPager.OnPageChangeListener roE;
  private AdLandingPagesProxy.e roF;
  private com.tencent.mm.sdk.b.c<ma> roG;
  private com.tencent.mm.sdk.b.c<qv> roH;
  private Map<Integer, ContentFragment> roI;
  private BroadcastReceiver roJ;
  private com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i roK;
  private p roL;
  String roa;
  public boolean rob;
  com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k roc;
  boolean rod;
  private int roe;
  private boolean rof;
  private String rog;
  private String roh;
  private String roi;
  private String roj;
  private AdlandingDummyViewPager rok;
  private int rol;
  private int rom;
  private com.tencent.mm.sdk.platformtools.ak ron;
  private FrameLayout roo;
  private View rop;
  private View roq;
  private boolean ror;
  private com.tencent.mm.plugin.sns.storage.n ros;
  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h> rot;
  private com.tencent.mm.plugin.sns.ui.b.b rou;
  private com.tencent.mm.plugin.sns.ui.b.c rov;
  private volatile boolean rox;
  private boolean roy;
  public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v roz;
  private long startTime;
  public String uin;
  private Map<String, String> values;

  public SnsAdNativeLandingPagesUI()
  {
    AppMethodBeat.i(38656);
    this.rnM = new LinkedList();
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.rnS = false;
    this.rob = false;
    this.iBA = 0L;
    this.edh = 0L;
    this.qXs = new HashMap();
    this.roc = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k();
    this.rod = false;
    this.roe = 0;
    this.rof = false;
    this.ron = new com.tencent.mm.sdk.platformtools.ak();
    this.ror = true;
    this.aGz = false;
    this.roA = new HashMap();
    this.roB = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        boolean bool = true;
        AppMethodBeat.i(38621);
        int i = paramAnonymousIntent.getIntExtra("show", 0);
        paramAnonymousContext = (ContentFragment)((android.support.v4.app.k)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).getAdapter()).getItem(SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).getCurrentItem());
        ab.d("MicroMsg.SnsAdNativeLandingPagesUI", "recv videoProgressbarStatusChangeReceiver show %d", new Object[] { Integer.valueOf(i) });
        if (i == 1)
        {
          paramAnonymousContext.rdi = bool;
          if ((!paramAnonymousContext.cqf()) || (bool))
            break label102;
          paramAnonymousContext.cqd();
          AppMethodBeat.o(38621);
        }
        while (true)
        {
          return;
          bool = false;
          break;
          label102: paramAnonymousContext.cqe();
          AppMethodBeat.o(38621);
        }
      }
    };
    this.roC = new SnsAdNativeLandingPagesUI.12(this);
    this.roD = new SnsAdNativeLandingPagesUI.13(this);
    this.roE = new SnsAdNativeLandingPagesUI.14(this);
    this.roF = new SnsAdNativeLandingPagesUI.15(this);
    this.roG = new com.tencent.mm.sdk.b.c()
    {
    };
    this.roH = new com.tencent.mm.sdk.b.c()
    {
    };
    this.roI = new HashMap();
    this.mUw = new a.b()
    {
      public final void aIu()
      {
        AppMethodBeat.i(38633);
        try
        {
          AdLandingPagesProxy.getInstance().favEditTag();
          AppMethodBeat.o(38633);
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.SnsAdNativeLandingPagesUI", "favorite edittag fail, ex = " + localException.getMessage());
            AppMethodBeat.o(38633);
          }
        }
      }
    };
    this.roJ = new SnsAdNativeLandingPagesUI.9(this);
    this.roK = null;
    this.roL = null;
    AppMethodBeat.o(38656);
  }

  private void IF()
  {
    AppMethodBeat.i(38662);
    List localList = getAllComp();
    Object localObject = this.roA.values().iterator();
    while (((Iterator)localObject).hasNext())
      localList.addAll(((SnsAdLandingPageFloatView)((Iterator)localObject).next()).getAllComp());
    this.iBA += System.currentTimeMillis() - this.startTime;
    this.roc.reH = ((int)this.iBA);
    this.roc.reG = localList.size();
    this.roc.dk(localList);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "landingPage report json %s", new Object[] { this.roc.reK });
    localObject = this.roc.cqm();
    if (this.qXr == 2)
    {
      AdLandingPagesProxy.getInstance().doCgiReportCanvasBrowseInfo(15041, (String)localObject);
      ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "post cgi stat 15041 data: ".concat(String.valueOf(localObject)));
      AppMethodBeat.o(38662);
    }
    while (true)
    {
      return;
      if (AdLandingPagesProxy.getInstance().isRecExpAd(this.roc.cFc))
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(14650, (String)localObject);
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 14650 data: ".concat(String.valueOf(localObject)));
        AppMethodBeat.o(38662);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.X(13387, (String)localObject);
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "post kv stat 13387 data: ".concat(String.valueOf(localObject)));
        AppMethodBeat.o(38662);
      }
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(38668);
    this.ros = AdLandingPagesProxy.getInstance().getSnsInfo(this.cFc);
    AdLandingPagesProxy.getInstance().asyncCacheXml(this.cFc);
    if (this.values == null)
    {
      ab.e("MicroMsg.SnsAdNativeLandingPagesUI", "parse landingpagexml is error,landingpagexml is " + this.rnT);
      AppMethodBeat.o(38668);
      return;
    }
    long l;
    label221: Object localObject2;
    Object localObject3;
    label620: int i;
    if ((this.cvd == 1) || (this.cvd == 2) || (this.cvd == 16) || (this.cvd == 14) || (this.cvd == 9) || (this.cvd == 10))
    {
      l = 0L;
      if (this.ros != null)
      {
        l = this.ros.field_snsId;
        this.qTL = AdLandingPagesProxy.getInstance().getSnsAid(this.cFc);
        this.hcx = AdLandingPagesProxy.getInstance().getSnsTraceid(this.cFc);
        this.qUe = AdLandingPagesProxy.getInstance().getSnsAdType(this.cFc);
        this.qPj = AdLandingPagesProxy.getInstance().getSnsUxInfo(this.cFc);
        this.qTM = AdLandingPagesProxy.getInstance().getSnsAdCanvasExtXml(this.cFc);
      }
      if (this.roa != null)
      {
        localObject1 = this.roa;
        this.values.put("." + this.rnU + ".originSnsId", localObject1);
        this.values.put("." + this.rnU + ".originUxInfo", this.qPj);
        localObject2 = "<" + this.rnU + ">";
        localObject2 = (String)localObject2 + String.format("<originSnsId>%s</originSnsId>", new Object[] { localObject1 });
        localObject2 = (String)localObject2 + String.format("<originUxInfo>%s</originUxInfo>", new Object[] { this.qPj });
        localObject2 = (String)localObject2 + String.format("<originAdType>%d</originAdType>", new Object[] { Integer.valueOf(this.qUe) });
        localObject2 = (String)localObject2 + String.format("<originAid>%s</originAid>", new Object[] { this.qTL });
        localObject3 = (String)localObject2 + String.format("<originTraceId>%s</originTraceId>", new Object[] { this.hcx });
        localObject2 = localObject3;
        if (!bo.isNullOrNil(this.qTM))
          localObject2 = (String)localObject3 + String.format("<originAdCanvasExt>%s</originAdCanvasExt>", new Object[] { this.qTM });
        this.rnT = this.rnT.replace("<" + this.rnU + ">", (CharSequence)localObject2);
        this.roc.qPj = this.qPj;
        this.roc.cFc = ((String)localObject1);
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "reportInfo aid [%s],traceId [%s],adType [%s],uxInfo [%s],adCanvasExtXml [%s]", new Object[] { this.qTL, this.hcx, Integer.valueOf(this.qUe), this.qPj, this.qTM });
        if (bo.isNullOrNil(this.qTM))
          break label1264;
        localObject2 = br.z(this.qTM, "adCardItemList");
        if (localObject2 == null)
          break label1264;
        i = 0;
        label701: if (i <= 0)
          break label2545;
      }
    }
    label1264: label2545: for (Object localObject1 = ".adCardItemList.cardItem" + i; ; localObject1 = ".adCardItemList.cardItem")
    {
      if (((Map)localObject2).containsKey((String)localObject1 + ".cardTpId"))
      {
        localObject3 = bo.bc((String)((Map)localObject2).get((String)localObject1 + ".cardTpId"), "");
        localObject1 = bo.bc((String)((Map)localObject2).get((String)localObject1 + ".cardExt"), "");
        if ((!bo.isNullOrNil((String)localObject3)) && (!bo.isNullOrNil((String)localObject1)))
          this.qXs.put(localObject3, localObject1);
        i++;
        break label701;
        localObject1 = String.valueOf(l);
        break label221;
        this.roc.cFc = ((String)this.values.get("." + this.rnU + ".originSnsId"));
        this.roc.qPj = ((String)this.values.get("." + this.rnU + ".originUxInfo"));
        this.qPj = this.roc.qPj;
        this.roa = this.roc.cFc;
        this.qUe = bo.ank((String)this.values.get("." + this.rnU + ".originAdType"));
        this.qTL = ((String)this.values.get("." + this.rnU + ".originAid"));
        this.hcx = ((String)this.values.get("." + this.rnU + ".originTraceId"));
        if (!bo.isNullOrNil(this.hya))
        {
          localObject1 = br.z(this.hya, "ADInfo");
          this.qPj = bo.bc((String)((Map)localObject1).get(".ADInfo.uxInfo"), "");
          this.roc.qPj = this.qPj;
          this.qTL = bo.bc((String)((Map)localObject1).get(".ADInfo.session_data.aid"), "");
          this.hcx = bo.bc((String)((Map)localObject1).get(".ADInfo.session_data.trace_id"), "");
        }
        localObject1 = Pattern.compile("<originAdCanvasExt>[\\s\\S]*</originAdCanvasExt>").matcher(this.rnT);
        if (!((Matcher)localObject1).find())
          break label620;
        localObject1 = ((Matcher)localObject1).group();
        if (bo.isNullOrNil((String)localObject1))
          break label620;
        this.qTM = ((String)localObject1).replaceAll("</?originAdCanvasExt>", "");
        break label620;
      }
      this.roc.reJ = AdLandingPagesProxy.getInstance().getSnsStatExtBySnsId(bo.anl(this.roc.cFc));
      this.lvA = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareTitle"), "");
      this.lvz = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareWebUrl"), "");
      this.qVw = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareDesc"), "");
      this.qXr = bo.ank(bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.bizId"), ""));
      this.rog = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareAppId"), "");
      this.roh = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareType"), "");
      this.roi = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.userInfo"), "");
      this.rol = bo.ank(bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.disableShareBitSet"), ""));
      this.rom = bo.ank(bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.statusBarStyle"), ""));
      s(this.values, "." + this.rnU);
      this.uin = AdLandingPagesProxy.getInstance().getUin();
      this.roj = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.officialSyncBuffer"), "");
      getIntent().putExtra("sns_landing_pages_adType", this.qUe);
      getIntent().putExtra("sns_landing_pages_rawSnsId", this.roc.cFc);
      if (bo.isNullOrNil(this.qTL))
        this.qTL = bo.bc((String)this.values.get("." + this.rnU + ".originAid"), "");
      if (bo.isNullOrNil(this.hcx))
        this.hcx = bo.bc((String)this.values.get("." + this.rnU + ".originTraceId"), "");
      this.rnM = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.gn(this.rnT, this.rnU);
      if (this.rnM.size() > 0)
      {
        localObject2 = "";
        localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)this.rnM.get(0);
        localObject1 = localObject2;
        if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject3).rej.size() > 0)
        {
          localObject3 = (r)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localObject3).rej.get(0);
          if (!(localObject3 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n))
            break label2386;
          this.rnZ = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject3).qWD;
          localObject1 = localObject2;
        }
      }
      while (true)
      {
        if (this.ros != null)
        {
          localObject2 = this.ros.cqu();
          if ((localObject2 != null) && (((TimeLineObject)localObject2).xfI != null) && (((TimeLineObject)localObject2).xfI.wbK != null) && (!((TimeLineObject)localObject2).xfI.wbK.isEmpty()))
          {
            localObject3 = (bau)((TimeLineObject)localObject2).xfI.wbK.getFirst();
            localObject2 = an.fZ(AdLandingPagesProxy.getInstance().getAccSnsPath(), ((bau)localObject3).Id) + com.tencent.mm.plugin.sns.data.i.j((bau)localObject3);
            localObject3 = ((bau)localObject3).Url;
            if (((String)localObject1).equals(localObject3))
            {
              localObject1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h.gk("adId", (String)localObject3);
              if ((!e.ct((String)localObject1)) && (e.ct((String)localObject2)))
              {
                ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "copy outsideFiel:%s->%s", new Object[] { localObject2, localObject1 });
                e.y((String)localObject2, (String)localObject1);
              }
            }
          }
        }
        this.rnV = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.rightBarTitle"), "");
        this.rnW = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.rightBarCanvasId"), "");
        this.rnX = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.rightBarCanvasExt"), "");
        AppMethodBeat.o(38668);
        break;
        if ((localObject3 instanceof m))
        {
          this.rnZ = ((m)localObject3).qWD;
          localObject1 = localObject2;
        }
        else if ((localObject3 instanceof o))
        {
          this.rnZ = ((o)localObject3).qWG;
          localObject1 = ((o)localObject3).qWF;
        }
        else
        {
          localObject1 = localObject2;
          if ((localObject3 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x))
          {
            localObject3 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x)localObject3;
            localObject1 = localObject2;
            if (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x)localObject3).qWB.isEmpty())
            {
              localObject3 = (l)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.x)localObject3).qWB.getFirst();
              localObject1 = localObject2;
              if (!((l)localObject3).qWB.isEmpty())
              {
                localObject3 = (r)((l)localObject3).qWB.getFirst();
                localObject1 = localObject2;
                if ((localObject3 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n))
                {
                  this.rnZ = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.n)localObject3).qWD;
                  localObject1 = localObject2;
                }
              }
            }
          }
        }
      }
    }
  }

  private String ZD(String paramString)
  {
    AppMethodBeat.i(38681);
    String str = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.shareThumbUrl"), "");
    if (!bo.isNullOrNil(str))
    {
      AppMethodBeat.o(38681);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(38681);
    }
  }

  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g> csA()
  {
    AppMethodBeat.i(38670);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.rnM.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localIterator.next();
      if (localg.rel)
        localArrayList.add(localg);
    }
    AppMethodBeat.o(38670);
    return localArrayList;
  }

  private void csB()
  {
    AppMethodBeat.i(38671);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)this.rok.getAdapter();
    if (localb == null)
    {
      localb = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b(getSupportFragmentManager(), new ArrayList());
      this.rok.setAdapter(localb);
    }
    while (true)
    {
      List localList = csA();
      com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg;
      ContentFragment localContentFragment;
      if (localList.size() > 0)
      {
        localg = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)localList.get(0);
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "loadFirstPage load id %s", new Object[] { Integer.valueOf(localg.id) });
        localContentFragment = (ContentFragment)this.roI.get(Integer.valueOf(localg.id));
        if (localContentFragment != null)
          break label345;
        HashMap localHashMap = new HashMap();
        localHashMap.put("pageInfo", localg);
        localHashMap.put("viewPager", this.rok);
        localHashMap.put("pageDownIconInfo", this.rdd);
        localHashMap.put("is_first_show_page", Boolean.TRUE);
        if (localList.size() == 1)
          localHashMap.put("is_last_shown_page", Boolean.TRUE);
        localHashMap.put("needEnterAnimation", Boolean.valueOf(this.rnS));
        localHashMap.put("needDirectionAnimation", Boolean.valueOf(csE()));
        localHashMap.put("groupListCompShowIndex", Integer.valueOf(this.roe));
        localContentFragment = new ContentFragment();
        localContentFragment.puc = localHashMap;
        localContentFragment.rdn = this.roD;
        this.roI.put(Integer.valueOf(localg.id), localContentFragment);
      }
      while (true)
      {
        if (localContentFragment != null)
          localb.a(localContentFragment, 0);
        localb.notifyDataSetChanged();
        this.rok.setOffscreenPageLimit(localList.size());
        AppMethodBeat.o(38671);
        return;
        label345: localContentFragment.a(localg);
      }
    }
  }

  private void csC()
  {
    AppMethodBeat.i(38672);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b localb = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)this.rok.getAdapter();
    if (localb == null)
    {
      localb = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b(getSupportFragmentManager(), new ArrayList());
      this.rok.setAdapter(localb);
    }
    while (true)
    {
      List localList = csA();
      int i = 0;
      if (i < localList.size())
      {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g localg = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)this.rnM.get(i);
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "loadLandingPages load id %s", new Object[] { Integer.valueOf(localg.id) });
        ContentFragment localContentFragment = (ContentFragment)this.roI.get(Integer.valueOf(localg.id));
        boolean bool;
        label188: label219: int j;
        if (localContentFragment == null)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("pageInfo", localg);
          localHashMap.put("viewPager", this.rok);
          localHashMap.put("pageDownIconInfo", this.rdd);
          if (i == 0)
          {
            bool = true;
            localHashMap.put("is_first_show_page", Boolean.valueOf(bool));
            if (i != localList.size() - 1)
              break label370;
            bool = true;
            localHashMap.put("is_last_shown_page", Boolean.valueOf(bool));
            localHashMap.put("needEnterAnimation", Boolean.valueOf(this.rnS));
            localHashMap.put("needDirectionAnimation", Boolean.valueOf(csE()));
            if (i != 0)
              break label376;
            j = this.roe;
            label281: localHashMap.put("groupListCompShowIndex", Integer.valueOf(j));
            localContentFragment = new ContentFragment();
            localContentFragment.puc = localHashMap;
            if (i == 0)
              localContentFragment.rdn = this.roD;
            this.roI.put(Integer.valueOf(localg.id), localContentFragment);
          }
        }
        while (true)
        {
          if (localContentFragment != null)
            localb.a(localContentFragment, i);
          i++;
          break;
          bool = false;
          break label188;
          label370: bool = false;
          break label219;
          label376: j = 0;
          break label281;
          localContentFragment.a(localg);
        }
      }
      localb.notifyDataSetChanged();
      this.rok.setOffscreenPageLimit(localList.size());
      AppMethodBeat.o(38672);
      return;
    }
  }

  private boolean csD()
  {
    boolean bool = true;
    AppMethodBeat.i(38675);
    if (this.rol != 0)
      if (((this.rol & 0x4) == 0) || ((this.rol & 0x2) == 0) || ((csH()) && (this.qXr == 2)) || ((this.rol & 0x1) == 0))
        AppMethodBeat.o(38675);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38675);
      continue;
      AppMethodBeat.o(38675);
    }
  }

  private boolean csE()
  {
    if ((this.rol & 0x8) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean csF()
  {
    if (this.rom == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean csG()
  {
    AppMethodBeat.i(38676);
    boolean bool;
    if ((!bo.isNullOrNil(this.rnV)) && (!bo.isNullOrNil(this.rnW)))
    {
      bool = true;
      AppMethodBeat.o(38676);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38676);
    }
  }

  private boolean csH()
  {
    if ((this.rol & 0x10) == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private ContentFragment csI()
  {
    AppMethodBeat.i(38679);
    ContentFragment localContentFragment = null;
    if (this.rnM.size() > 0)
      localContentFragment = (ContentFragment)this.roI.get(Integer.valueOf(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)this.rnM.get(this.rok.getCurrentItem())).id));
    AppMethodBeat.o(38679);
    return localContentFragment;
  }

  private SnsAdNativeLandingPagesUI.a csJ()
  {
    AppMethodBeat.i(38680);
    Object localObject = new com.tencent.mm.plugin.sns.storage.b(this.rnT);
    if (((com.tencent.mm.plugin.sns.storage.b)localObject).coS())
    {
      int i = AdLandingPagesProxy.getInstance().getAdVoteIndex(((com.tencent.mm.plugin.sns.storage.b)localObject).qVh.qVu, this.qPj, this.uin);
      if ((i > 0) && (i <= ((com.tencent.mm.plugin.sns.storage.b)localObject).qVh.qVv.size()))
      {
        b.g localg = (b.g)((com.tencent.mm.plugin.sns.storage.b)localObject).qVh.qVv.get(i - 1);
        localObject = new SnsAdNativeLandingPagesUI.a(this, (byte)0);
        if (!bo.isNullOrNil(localg.lvA))
        {
          ((SnsAdNativeLandingPagesUI.a)localObject).lvA = localg.lvA;
          if (bo.isNullOrNil(localg.qVw))
            break label165;
          ((SnsAdNativeLandingPagesUI.a)localObject).qVw = localg.qVw;
          label128: if (bo.isNullOrNil(localg.qVx))
            break label176;
          ((SnsAdNativeLandingPagesUI.a)localObject).qVx = localg.qVx;
          label146: AppMethodBeat.o(38680);
        }
      }
    }
    while (true)
    {
      return localObject;
      ((SnsAdNativeLandingPagesUI.a)localObject).lvA = this.lvA;
      break;
      label165: ((SnsAdNativeLandingPagesUI.a)localObject).qVw = this.qVw;
      break label128;
      label176: ((SnsAdNativeLandingPagesUI.a)localObject).qVx = this.rnZ;
      break label146;
      localObject = null;
      AppMethodBeat.o(38680);
    }
  }

  private String csK()
  {
    AppMethodBeat.i(38682);
    Object localObject = new cdg();
    ((cdg)localObject).xcS = new cdh();
    ((cdg)localObject).xcS.xcW = this.roc.qPj;
    ((cdg)localObject).xcS.xcV = this.roc.cFc;
    ((cdg)localObject).xcS.qUe = this.qUe;
    try
    {
      localObject = Base64.encodeToString(((cdg)localObject).toByteArray(), 2);
      AppMethodBeat.o(38682);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = "";
        AppMethodBeat.o(38682);
      }
    }
  }

  private String csL()
  {
    AppMethodBeat.i(38683);
    String str = this.rnT.replaceAll("(?s)<adCanvasInfoLeft[^>]*>.*?</adCanvasInfoLeft>", "").replaceAll("(?s)<adCanvasInfoRight[^>]*>.*?</adCanvasInfoRight>", "");
    AppMethodBeat.o(38683);
    return str;
  }

  private void csw()
  {
    AppMethodBeat.i(38658);
    AdlandingRemoteServiceConnectedReceiver.b(android.support.v4.content.d.S(this));
    Kh();
    if (this.rnS)
      csB();
    while (true)
    {
      refreshView();
      csy();
      lg(true);
      this.aGz = true;
      AppMethodBeat.o(38658);
      return;
      csC();
    }
  }

  private void csx()
  {
    AppMethodBeat.i(38661);
    Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)this.rok.getAdapter();
    if (localObject == null)
      AppMethodBeat.o(38661);
    while (true)
    {
      return;
      localObject = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)localObject).rdA.iterator();
      while (((Iterator)localObject).hasNext())
        ((ContentFragment)((Iterator)localObject).next()).cpn();
      AppMethodBeat.o(38661);
    }
  }

  private void csy()
  {
    AppMethodBeat.i(38663);
    com.tencent.mm.plugin.report.service.h localh;
    String str1;
    if (this.qUA != 2)
    {
      localh = com.tencent.mm.plugin.report.service.h.pYm;
      str1 = com.tencent.mm.plugin.sns.data.i.jV(com.tencent.mm.plugin.sns.data.i.Xq(this.roc.cFc));
      if (this.qPj != null)
        break label127;
    }
    label127: for (String str2 = ""; ; str2 = this.qPj)
    {
      localh.e(14655, new Object[] { str1, str2, Integer.valueOf(this.roc.reB), Integer.valueOf(this.roc.lgf), Long.valueOf(this.edh), Integer.valueOf(this.qXp), this.roc.hxZ });
      AppMethodBeat.o(38663);
      return;
    }
  }

  private boolean csz()
  {
    AppMethodBeat.i(38664);
    boolean bool;
    if ((this.roo.getChildAt(this.roo.getChildCount() - 2) instanceof SnsAdLandingPageFloatView))
    {
      bool = true;
      AppMethodBeat.o(38664);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(38664);
    }
  }

  private List<com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h> getAllComp()
  {
    AppMethodBeat.i(38673);
    this.rot = new ArrayList();
    Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)this.rok.getAdapter();
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)localObject).rdA.iterator();
      while (((Iterator)localObject).hasNext())
      {
        Fragment localFragment = (Fragment)((Iterator)localObject).next();
        this.rot.addAll(((ContentFragment)localFragment).cqa());
      }
    }
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.dj(this.rot);
    localObject = this.rot;
    AppMethodBeat.o(38673);
    return localObject;
  }

  private void refreshView()
  {
    AppMethodBeat.i(38659);
    Object localObject;
    if ((this.qXr == 2) && (!csF()))
    {
      localObject = (FrameLayout.LayoutParams)this.rok.getLayoutParams();
      ((FrameLayout.LayoutParams)localObject).setMargins(0, 0, 0, com.tencent.mm.ui.ak.fr(this));
      this.rok.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    int i = 2131690691;
    if (!csF())
    {
      i = getResources().getColor(2131689761);
      if ((this.rnM == null) || (this.rnM.size() <= 0) || (bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)this.rnM.getFirst()).hfo)))
        break label317;
      i = Color.parseColor(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.g)this.rnM.getFirst()).hfo);
    }
    label317: 
    while (true)
    {
      this.rop.setBackgroundColor(i);
      i = 2131689761;
      localObject = this.rnN.getDrawable();
      if (localObject != null)
      {
        android.support.v4.a.a.a.a((Drawable)localObject, android.support.v4.content.b.i(this, i));
        this.rnN.setImageDrawable((Drawable)localObject);
      }
      localObject = this.rnO.getDrawable();
      if (localObject != null)
      {
        android.support.v4.a.a.a.a((Drawable)localObject, android.support.v4.content.b.i(this, i));
        this.rnO.setImageDrawable((Drawable)localObject);
      }
      if ((csG()) && (!csH()) && (this.qXr == 2))
      {
        this.rnO.setVisibility(8);
        this.rnQ.setVisibility(0);
        this.rnQ.setText(this.rnV);
        this.rnQ.setOnClickListener(new SnsAdNativeLandingPagesUI.19(this));
        AppMethodBeat.o(38659);
      }
      while (true)
      {
        return;
        if (csD())
        {
          this.rnO.setOnClickListener(new SnsAdNativeLandingPagesUI.2(this));
          AppMethodBeat.o(38659);
        }
        else
        {
          this.rnO.setVisibility(8);
          AppMethodBeat.o(38659);
        }
      }
    }
  }

  private void s(Map<String, String> paramMap, String paramString)
  {
    AppMethodBeat.i(38669);
    String str = (String)paramMap.get(paramString + ".adCanvasInfo.arrowDownIconStyle.iconUrl");
    if (TextUtils.isEmpty(str))
    {
      this.rdd = null;
      AppMethodBeat.o(38669);
      return;
    }
    if (this.rdd == null)
      this.rdd = new ac();
    this.rdd.iconUrl = str;
    int i = bo.ank((String)paramMap.get(paramString + ".adCanvasInfo.sizeType"));
    int j = bo.ank((String)paramMap.get(paramString + ".adCanvasInfo.basicRootFontSize"));
    int k = bo.ank((String)paramMap.get(paramString + ".adCanvasInfo.basicWidth"));
    if ((j == 0) && (i == 1))
      j = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.ren;
    while (true)
    {
      if ((k == 0) && (i == 1))
        k = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.rem;
      while (true)
      {
        this.rdd.qWR = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(bo.anm((String)paramMap.get(paramString + ".adCanvasInfo.arrowDownIconStyle.paddingBottom")), i, k, j);
        this.rdd.width = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(bo.anm((String)paramMap.get(paramString + ".adCanvasInfo.arrowDownIconStyle.layoutWidth")), i, k, j);
        this.rdd.height = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(bo.anm((String)paramMap.get(paramString + ".adCanvasInfo.arrowDownIconStyle.layoutHeight")), i, k, j);
        AppMethodBeat.o(38669);
        break;
      }
    }
  }

  public final void a(r paramr, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, final boolean paramBoolean3)
  {
    AppMethodBeat.i(38687);
    if ((this.roK != null) && (!paramBoolean3))
    {
      ab.w("MicroMsg.SnsAdNativeLandingPagesUI", "bottom sheet appear several times");
      this.roK.cpE();
      if (this.roL != null)
      {
        this.roL.dismiss();
        this.roL = null;
      }
      AppMethodBeat.o(38687);
      return;
    }
    AdLandingPagesProxy.e local10 = new AdLandingPagesProxy.e()
    {
      public final void ao(Object paramAnonymousObject)
      {
      }

      public final void f(int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
      {
        AppMethodBeat.i(38636);
        SnsAdNativeLandingPagesUI.this.lg(false);
        if (paramBoolean3)
        {
          if (SnsAdNativeLandingPagesUI.L(SnsAdNativeLandingPagesUI.this) != null)
            SnsAdNativeLandingPagesUI.L(SnsAdNativeLandingPagesUI.this).cpE();
          if (SnsAdNativeLandingPagesUI.M(SnsAdNativeLandingPagesUI.this) != null)
          {
            SnsAdNativeLandingPagesUI.M(SnsAdNativeLandingPagesUI.this).dismiss();
            SnsAdNativeLandingPagesUI.N(SnsAdNativeLandingPagesUI.this);
          }
        }
        AppMethodBeat.o(38636);
      }
    };
    AppCompatActivity localAppCompatActivity;
    LinearLayout localLinearLayout;
    if (!paramBoolean3)
    {
      localAppCompatActivity = this.mController.ylL;
      localLinearLayout = new LinearLayout(this.mController.ylL);
      if (bo.isNullOrNil(paramr.qWX))
        break label234;
    }
    label234: for (int i = Color.parseColor(paramr.qWX); ; i = -1)
    {
      paramr = al.a(localAppCompatActivity, paramr, localLinearLayout, i);
      this.roK = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i(this.mController.ylL, paramr, paramString1, paramString2, paramString3, paramBoolean1, paramBoolean2);
      paramr = paramr.getView();
      this.roK.qZy = new SnsAdNativeLandingPagesUI.11(this, paramr);
      this.roK.cpD();
      if (!bo.isNullOrNil(paramString1))
      {
        AdLandingPagesProxy.getInstance().doFavOfficialItemScene(paramString1, local10);
        if (paramBoolean3)
          this.roL = com.tencent.mm.ui.base.h.b(this, getString(2131303690), false, null);
      }
      AppMethodBeat.o(38687);
      break;
    }
  }

  public final void bcW()
  {
    AppMethodBeat.i(38677);
    Object localObject2;
    try
    {
      Iterator localIterator = this.roA.values().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (SnsAdLandingPageFloatView)localIterator.next();
        ((SnsAdLandingPageFloatView)localObject2).onPause();
        ((SnsAdLandingPageFloatView)localObject2).setVisibility(8);
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.SnsAdNativeLandingPagesUI", localException, "play exit animation error", new Object[0]);
      finish();
      AppMethodBeat.o(38677);
    }
    while (true)
    {
      return;
      aqX();
      csx();
      IF();
      this.rod = true;
      this.rop.setVisibility(8);
      if (!this.rnS)
      {
        finish();
        AppMethodBeat.o(38677);
      }
      else if (this.rox)
      {
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "is playing animation");
        AppMethodBeat.o(38677);
      }
      else
      {
        ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "run exit animation, %s", new Object[] { Boolean.valueOf(this.rnS) });
        this.rox = true;
        if (isSupportNavigationSwipeBack())
          getSwipeBackLayout().setEnableGesture(false);
        localObject2 = csI().cqa().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h)((Iterator)localObject2).next();
          if ((localObject1 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a))
          {
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).coY();
            ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h)localObject1).cpA();
          }
        }
        Object localObject1 = new com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$5;
        ((SnsAdNativeLandingPagesUI.5)localObject1).<init>(this);
        com.tencent.mm.sdk.platformtools.al.n((Runnable)localObject1, 30L);
        AppMethodBeat.o(38677);
      }
    }
  }

  public boolean convertActivityFromTranslucent()
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970736;
  }

  @TargetApi(16)
  public final void initView()
  {
    AppMethodBeat.i(38674);
    super.initView();
    this.roo = ((FrameLayout)findViewById(2131820987));
    this.roq = findViewById(2131827617);
    this.rok = ((AdlandingDummyViewPager)findViewById(2131827657));
    this.rop = findViewById(2131827618);
    if (ae.hD(this.mController.ylL))
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.roo.getLayoutParams();
      localLayoutParams.height = (this.iev - ae.hC(this));
      localLayoutParams.topMargin = ae.hC(this);
      this.roo.setLayoutParams(localLayoutParams);
      this.mController.xE(getResources().getColor(2131689639));
      com.tencent.mm.ui.b.a(this, true, this.roo);
    }
    while (true)
    {
      this.mmX = ((ImageView)findViewById(2131822079));
      this.rnP = ((ImageView)findViewById(2131827656));
      this.rnN = ((ImageView)findViewById(2131827619));
      this.rnN.setOnClickListener(new SnsAdNativeLandingPagesUI.3(this));
      this.rnO = ((ImageView)findViewById(2131827620));
      this.rnQ = ((TextView)findViewById(2131827659));
      this.rnY = ((ImageView)findViewById(2131827658));
      if (this.rnS)
      {
        this.roo.setAlpha(0.0F);
        this.mmX.setAlpha(0.0F);
        com.tencent.mm.ui.base.b.a(this, null);
      }
      AppMethodBeat.o(38674);
      return;
      com.tencent.mm.ui.b.a(this, false, this.roo);
    }
  }

  public final void lg(boolean paramBoolean)
  {
    AppMethodBeat.i(38686);
    if ((paramBoolean) && (this.qXr == 1))
      AdLandingPagesProxy.getInstance().doDynamicUpdateScene(this.rog, this.roh, this.roi, this.roF);
    if ((this.qXr == 2) && (!bo.isNullOrNil(this.roj)))
      AdLandingPagesProxy.getInstance().doSearchDynamicUpdateScene(this.roj, this.roF);
    this.rof = true;
    AppMethodBeat.o(38686);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(38684);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, this.mController.ylL.getString(2131297050));
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(38684);
      return;
      int i;
      if (paramInt1 == 2)
      {
        if (paramIntent.getBooleanExtra("kfavorite", false))
        {
          i = AdLandingPagesProxy.getInstance().doFav(paramIntent, 42);
          ((com.tencent.mm.plugin.fav.a.v)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.v.class)).a(i, this, this.mUw);
        }
      }
      else if (paramInt1 == com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x.rbL)
        try
        {
          String str = paramIntent.getStringExtra("KComponentCid");
          Iterator localIterator = getAllComp().iterator();
          do
          {
            if (!localIterator.hasNext())
              break;
            localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h)localIterator.next();
          }
          while (!((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h)localObject).cpy().equals(str));
          Object localObject = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject;
          i = paramIntent.getIntExtra("KStreamVideoPlayCount", 0);
          int j = paramIntent.getIntExtra("KStreamVideoPlayCompleteCount", 0);
          int k = paramIntent.getIntExtra("KStreamVideoTotalPlayTimeInMs", 0);
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).qEo = (i + ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).qEo);
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).qEp += j;
          ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x)localObject).qEq += k;
        }
        catch (Exception localException)
        {
        }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(38678);
    bcW();
    AppMethodBeat.o(38678);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38657);
    super.onCreate(paramBundle);
    this.startTime = System.currentTimeMillis();
    this.edh = System.currentTimeMillis();
    this.roc.edh = this.edh;
    ad.ac(this);
    Object localObject = ad.eP(this);
    this.ieu = localObject[0];
    this.iev = localObject[1];
    this.rnR = paramBundle;
    this.mController.hideTitleView();
    this.kkq = getIntent().getIntExtra("img_gallery_top", 0);
    this.kkr = getIntent().getIntExtra("img_gallery_left", 0);
    this.kks = getIntent().getIntExtra("img_gallery_width", 0);
    this.kkt = getIntent().getIntExtra("img_gallery_height", 0);
    getWindow().addFlags(128);
    this.cvd = getIntent().getIntExtra("sns_landig_pages_from_source", 0);
    this.qXp = getIntent().getIntExtra("sns_landig_pages_origin_from_source", 0);
    this.rnT = getIntent().getStringExtra("sns_landing_pages_xml");
    paramBundle = getIntent().getStringExtra("sns_landing_pages_too_large_xml_path");
    if ((bo.isNullOrNil(this.rnT)) && (!bo.isNullOrNil(paramBundle)))
      this.rnT = ad.YM(paramBundle);
    if (bo.isNullOrNil(this.rnT))
    {
      finish();
      initView();
      if (AdLandingPagesProxy.getInstance().isConnected())
        break label877;
      AdLandingPagesProxy.getInstance().connect(new SnsAdNativeLandingPagesUI.18(this));
    }
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.roH);
      AppMethodBeat.o(38657);
      return;
      this.rnT = this.rnT.replaceAll("</*RecXml[\\s|\\S]*?>", "");
      this.roc.qPm = getIntent().getStringExtra("sns_landing_pages_expid");
      this.rnU = getIntent().getStringExtra("sns_landing_pages_xml_prefix");
      this.cFc = getIntent().getStringExtra("sns_landing_pages_share_sns_id");
      this.roa = getIntent().getStringExtra("sns_landing_pages_rawSnsId");
      this.qPj = getIntent().getStringExtra("sns_landing_pages_ux_info");
      this.qTL = getIntent().getStringExtra("sns_landing_pages_aid");
      this.hcx = getIntent().getStringExtra("sns_landing_pages_traceid");
      localObject = getIntent().getStringExtra("sns_landing_pages_search_extra");
      paramBundle = this.roc;
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        if (paramBundle.extra.length() > 0)
          paramBundle.extra += "&";
        paramBundle.extra = (paramBundle.extra + "searchextra=" + URLEncoder.encode((String)localObject));
      }
      paramBundle = getIntent().getStringExtra("sns_landing_pages_extra");
      localObject = this.roc;
      if (!TextUtils.isEmpty(paramBundle))
        ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k)localObject).extra = (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k)localObject).extra + "&extra1=" + URLEncoder.encode(paramBundle));
      this.rob = getIntent().getBooleanExtra("sns_landing_is_native_sight_ad", false);
      this.qUA = getIntent().getIntExtra("sns_landing_pages_rec_src", 0);
      this.roe = getIntent().getIntExtra("sns_landing_pages_from_outer_index", 0);
      this.hya = getIntent().getStringExtra("sns_landing_pages_ad_info");
      this.rnS = getIntent().getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false);
      if (this.rnS)
        this.roc.reB = 0;
      for (this.roc.ecH = 0; ; this.roc.ecH = 1)
      {
        this.roc.lgf = this.cvd;
        this.roc.reC = 0;
        this.roc.reD = 0;
        this.roc.reE = 1;
        this.roc.reF = 0;
        this.roc.qXp = this.qXp;
        if ((this.rnU == null) || ("".equals(this.rnT)))
          this.rnU = "adxml";
        if ((!bo.isNullOrNil(this.rnT)) && (!bo.isNullOrNil(this.rnU)))
          break label808;
        ab.e("MicroMsg.SnsAdNativeLandingPagesUI", "landingPagesXml is " + this.rnT + ",landingPagesXmlPrex is " + this.rnU);
        break;
        this.roc.reB = 1;
      }
      label808: this.values = br.z(this.rnT, this.rnU);
      this.roc.hxZ = bo.bc((String)this.values.get("." + this.rnU + ".adCanvasInfo.canvasId"), "");
      break;
      label877: csw();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(38660);
    getWindow().clearFlags(128);
    if (this.aGz)
    {
      ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "the SnsAdNativeLadingPagesUI is destroy");
      if (!this.rod)
      {
        csx();
        IF();
      }
    }
    this.roA.clear();
    ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)this.rok.getAdapter()).rdA.clear();
    unregisterReceiver(this.roJ);
    com.tencent.mm.sdk.b.a.xxA.d(this.roH);
    AdLandingPagesProxy.getInstance().clearCallback();
    super.onDestroy();
    AppMethodBeat.o(38660);
  }

  public final void onKeyboardStateChanged()
  {
    AppMethodBeat.i(38685);
    super.onKeyboardStateChanged();
    if (this.rok != null)
      this.rok.postDelayed(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(38634);
          if (SnsAdNativeLandingPagesUI.this.mController.ymc != 1)
            ad.ac(SnsAdNativeLandingPagesUI.this);
          if (!SnsAdNativeLandingPagesUI.K(SnsAdNativeLandingPagesUI.this))
          {
            new ArrayList();
            Iterator localIterator = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.b)SnsAdNativeLandingPagesUI.a(SnsAdNativeLandingPagesUI.this).getAdapter()).rdA.iterator();
            while (localIterator.hasNext())
              ((ContentFragment)localIterator.next()).cqb();
          }
          AppMethodBeat.o(38634);
        }
      }
      , 500L);
    AppMethodBeat.o(38685);
  }

  public void onPause()
  {
    AppMethodBeat.i(38666);
    super.onPause();
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "onPause");
    this.roy = true;
    if (this.aGz)
      this.iBA += System.currentTimeMillis() - this.startTime;
    if (csz())
    {
      localObject = this.roA.values().iterator();
      while (((Iterator)localObject).hasNext())
        ((SnsAdLandingPageFloatView)((Iterator)localObject).next()).onPause();
    }
    AdlandingDummyViewPager localAdlandingDummyViewPager = this.rok;
    Object localObject = this.roE;
    localAdlandingDummyViewPager.rcR.remove(localObject);
    android.support.v4.content.d.S(this).unregisterReceiver(this.roB);
    android.support.v4.content.d.S(this).unregisterReceiver(this.roC);
    com.tencent.mm.sdk.b.a.xxA.d(this.roG);
    if (this.roK != null)
      this.roK.cpE();
    AppMethodBeat.o(38666);
  }

  public void onResume()
  {
    AppMethodBeat.i(38665);
    ab.i("MicroMsg.SnsAdNativeLandingPagesUI", "onResume");
    super.onResume();
    ad.ac(this);
    if (csz())
    {
      ((SnsAdLandingPageFloatView)this.roo.getChildAt(this.roo.getChildCount() - 2)).onResume();
      AppMethodBeat.o(38665);
    }
    while (true)
    {
      return;
      this.roy = false;
      AdlandingDummyViewPager localAdlandingDummyViewPager = this.rok;
      ViewPager.OnPageChangeListener localOnPageChangeListener = this.roE;
      localAdlandingDummyViewPager.rcR.add(localOnPageChangeListener);
      android.support.v4.content.d.S(this).a(this.roB, new IntentFilter("com.tencent.mm.adlanding.video_progressbar_change"));
      android.support.v4.content.d.S(this).a(this.roC, new IntentFilter("com.tencent.mm.adlanding.set_uioption"));
      if (this.aGz)
        this.startTime = System.currentTimeMillis();
      registerReceiver(this.roJ, new IntentFilter("android.intent.action.SCREEN_ON"));
      com.tencent.mm.sdk.b.a.xxA.c(this.roG);
      if (this.rof)
        lg(false);
      AppMethodBeat.o(38665);
    }
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(38667);
    this.roc.ecH = 2;
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.k localk = this.roc;
    localk.reF += 1;
    super.onSwipeBack();
    AppMethodBeat.o(38667);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void w(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(38688);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_landig_pages_from_source", 14);
    int i;
    if (this.qXp == 0)
      i = this.cvd;
    while (true)
    {
      localIntent.putExtra("sns_landig_pages_origin_from_source", i);
      localIntent.putExtra("sns_landing_pages_canvasid", paramString1);
      localIntent.putExtra("sns_landing_pages_canvas_ext", paramString2);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
      localIntent.putExtra("sns_landing_pages_no_store", 1);
      String str1 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_sessionId");
      paramString2 = ((Activity)paramContext).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
      String str2;
      JSONObject localJSONObject;
      if (!bo.isNullOrNil(str1))
      {
        str2 = String.valueOf(System.currentTimeMillis() / 1000L);
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("sessionId", str2);
        localJSONObject.put("cid", "");
        if (!bo.isNullOrNil(paramString2));
        for (paramString1 = paramString2; ; paramString1 = "")
        {
          localJSONObject.put("adBuffer", paramString1);
          localJSONObject.put("preSessionId", str1);
          label201: localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
          localIntent.putExtra("sns_landing_pages_sessionId", str2);
          localIntent.putExtra("sns_landing_pages_ad_buffer", paramString2);
          com.tencent.mm.bp.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
          AppMethodBeat.o(38688);
          return;
          i = this.qXp;
          break;
        }
      }
      catch (Exception paramString1)
      {
        break label201;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI
 * JD-Core Version:    0.6.2
 */