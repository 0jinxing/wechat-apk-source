package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.o;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.ui.OfflineVideoView;
import com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class x extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a
{
  public static int rbL = 999;
  private Context context;
  private boolean eCM;
  private ak fbD;
  private String hGF;
  private View iVh;
  int iZo;
  private long oKj;
  private int playCount;
  public int qEo;
  public int qEp;
  public int qEq;
  ImageView raN;
  private boolean raO;
  private TextView raQ;
  boolean raV;
  private boolean raX;
  private boolean raY;
  private boolean raZ;
  private OfflineVideoView rbF;
  private int rbG;
  private int rbH;
  int rbI;
  int rbJ;
  private boolean rbK;
  private boolean rba;
  boolean rbb;
  boolean rbc;
  private int rbd;
  private int rbe;
  private int rbf;
  int rbh;

  public x(Context paramContext, o paramo, ViewGroup paramViewGroup)
  {
    super(paramContext, paramo, paramViewGroup);
    AppMethodBeat.i(37285);
    this.oKj = 0L;
    this.rbe = 0;
    this.playCount = 0;
    this.rbf = 0;
    this.rbH = 0;
    this.qEo = 0;
    this.qEp = 0;
    this.qEq = 0;
    this.rbh = 0;
    this.rbI = 0;
    this.raV = true;
    this.rbJ = 0;
    this.iZo = 0;
    this.rbd = 0;
    this.raX = false;
    this.raY = true;
    this.raZ = false;
    this.rbb = true;
    this.rbc = true;
    this.rba = false;
    this.context = paramContext;
    this.fbD = new ak(Looper.getMainLooper());
    AppMethodBeat.o(37285);
  }

  private void bgC()
  {
    AppMethodBeat.i(37289);
    if (this.rba)
    {
      ab.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "last download fail ,try again");
      this.rbF.bwD();
      AppMethodBeat.o(37289);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "starting play");
      if ((!this.rbK) && (!TextUtils.isEmpty(this.hGF)))
      {
        this.rbF.Mj(this.hGF);
        this.rbK = true;
      }
      this.fbD.post(new x.6(this));
      this.oKj = System.currentTimeMillis();
      this.playCount += 1;
      AppMethodBeat.o(37289);
    }
  }

  private void cpN()
  {
    AppMethodBeat.i(37290);
    ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "pause play");
    this.fbD.post(new x.7(this));
    if (this.oKj != 0L)
    {
      this.rbe = ((int)(this.rbe + (System.currentTimeMillis() - this.oKj)));
      this.oKj = 0L;
    }
    AppMethodBeat.o(37290);
  }

  private boolean cpR()
  {
    AppMethodBeat.i(37288);
    Intent localIntent;
    String str1;
    String str2;
    String str3;
    JSONObject localJSONObject;
    if (!bo.isNullOrNil(((o)this.qZo).qWf))
    {
      localIntent = new Intent();
      localIntent.putExtra("sns_landig_pages_from_source", 14);
      localIntent.putExtra("sns_landig_pages_origin_from_source", cpC().qXp);
      localIntent.putExtra("sns_landing_pages_ux_info", cpC().qPj);
      localIntent.putExtra("sns_landing_pages_xml", "");
      localIntent.putExtra("sns_landing_pages_canvasid", ((o)this.qZo).qWf);
      localIntent.putExtra("sns_landing_pages_canvas_ext", ((o)this.qZo).qWg);
      localIntent.putExtra("sns_landing_pages_no_store", ((o)this.qZo).qWh);
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
      if (((this.context instanceof Activity)) && (cpC().qXr == 2))
      {
        str1 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_sessionId");
        str2 = ((Activity)this.context).getIntent().getStringExtra("sns_landing_pages_ad_buffer");
        if (!bo.isNullOrNil(str1))
        {
          str3 = String.valueOf(System.currentTimeMillis() / 1000L);
          localJSONObject = new JSONObject();
        }
      }
    }
    try
    {
      localJSONObject.put("sessionId", str3);
      localJSONObject.put("cid", ((o)this.qZo).qWO);
      Object localObject;
      if (!bo.isNullOrNil(str2))
      {
        localObject = str2;
        localJSONObject.put("adBuffer", localObject);
        localJSONObject.put("preSessionId", str1);
        label279: localIntent.putExtra("sns_landing_pages_search_extra", localJSONObject.toString());
        localIntent.putExtra("sns_landing_pages_sessionId", str3);
        localIntent.putExtra("sns_landing_pages_ad_buffer", str2);
        localObject = new int[2];
        this.rbF.getLocationOnScreen((int[])localObject);
        localIntent.putExtra("img_gallery_top", localObject[1]);
        localIntent.putExtra("img_gallery_left", localObject[0]);
        localIntent.putExtra("img_gallery_width", this.rbF.getWidth());
        localIntent.putExtra("img_gallery_height", this.rbF.getHeight());
        d.b(this.context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
        AppMethodBeat.o(37288);
      }
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        localObject = "";
        break;
        AppMethodBeat.o(37288);
      }
    }
    catch (Exception localException)
    {
      break label279;
    }
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37297);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      AppMethodBeat.o(37297);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramJSONObject.put("sightDuration", this.rbG * 1000);
        paramJSONObject.put("playTimeInterval", this.rbe);
        paramJSONObject.put("playCount", this.playCount);
        paramJSONObject.put("playCompletedCount", this.rbf);
        paramJSONObject.put("clickVoiceControlCount", this.rbh);
        if (this.raZ);
        for (Object localObject1 = "1"; ; localObject1 = "0")
        {
          paramJSONObject.put("isAutoPlay", localObject1);
          if (((o)this.qZo).type == 61)
            paramJSONObject.put("clickSightCount", this.rbI);
          Object localObject2;
          if (!this.rbc)
          {
            localObject1 = ag.ck(((o)this.qZo).qWF);
            localObject2 = new org/json/JSONObject;
            ((JSONObject)localObject2).<init>();
            ((JSONObject)localObject2).put("urlMd5", localObject1);
            ((JSONObject)localObject2).put("needDownload", 1);
            paramJSONObject.put("sightUrlInfo", localObject2);
          }
          if (!this.rbb)
          {
            localObject2 = ag.ck(((o)this.qZo).qWG);
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
            ((JSONObject)localObject1).put("urlMd5", localObject2);
            ((JSONObject)localObject1).put("needDownload", 1);
            paramJSONObject.put("thumbUrlInfo", localObject1);
          }
          paramJSONObject.put("streamVideoEnterCount", this.rbH);
          paramJSONObject.put("streamVideoPlayCount", this.qEo);
          paramJSONObject.put("streamVideoPlayCompleteCount", this.qEp);
          paramJSONObject.put("streamVideoTotalPlayTimeInMs", this.qEq);
          AppMethodBeat.o(37297);
          bool = true;
          break;
        }
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.Sns.AdLandingPageSightVideoComponent", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37297);
        bool = false;
      }
    }
  }

  public final void coY()
  {
    AppMethodBeat.i(37291);
    super.coY();
    this.raN.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231393));
    this.rbF.setMute(true);
    this.raV = true;
    AppMethodBeat.o(37291);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37295);
    super.coZ();
    OfflineVideoView localOfflineVideoView = this.rbF;
    ab.d("MicroMsg.OfflineVideoView", "%d on destroy %s", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()), bo.dpG() });
    ab.i("MicroMsg.OfflineVideoView", "%d logic unInit", new Object[] { Integer.valueOf(localOfflineVideoView.hashCode()) });
    localOfflineVideoView.kkp.removeCallbacksAndMessages(null);
    localOfflineVideoView.klw.stopTimer();
    if (localOfflineVideoView.klq != null)
      localOfflineVideoView.klq.stop();
    AppMethodBeat.o(37295);
  }

  public final void cpA()
  {
    AppMethodBeat.i(37299);
    super.cpA();
    String str = h.gj("adId", ((o)this.qZo).qWG);
    cpN();
    if (com.tencent.mm.vfs.e.ct(str))
    {
      this.rbF.Zz(str);
      this.rbF.a(false, 0.0F);
    }
    AppMethodBeat.o(37299);
  }

  public final void cpQ()
  {
    AppMethodBeat.i(37287);
    o localo = (o)this.qZo;
    if (bo.isNullOrNil(localo.qWH))
    {
      ab.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
      AppMethodBeat.o(37287);
    }
    while (true)
    {
      return;
      if (!(this.context instanceof Activity))
      {
        ab.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
        AppMethodBeat.o(37287);
      }
      else
      {
        ab.v("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click, jumpto [%s]", new Object[] { localo.qWH });
        Intent localIntent = new Intent();
        localIntent.setClass(this.context, VideoAdPlayerUI.class);
        localIntent.putExtra("IsAd", true);
        localIntent.putExtra("KMediaId", ag.ck(localo.qWH));
        localIntent.putExtra("KThumUrl", localo.qWG);
        localIntent.putExtra("KStremVideoUrl", localo.qWH);
        localIntent.putExtra("ForceLandscape", true);
        localIntent.putExtra("ShareBtnHidden", 1);
        localIntent.putExtra("KComponentCid", cpy());
        ((Activity)this.context).startActivityForResult(localIntent, rbL);
        this.rbH += 1;
        AppMethodBeat.o(37287);
      }
    }
  }

  public final void cpa()
  {
    AppMethodBeat.i(37293);
    super.cpa();
    AppMethodBeat.o(37293);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37294);
    super.cpb();
    cpN();
    if ((!this.raX) && (!this.raY))
      AppMethodBeat.o(37294);
    while (true)
    {
      return;
      this.raY = false;
      this.raX = false;
      if (this.rbd == 1)
        this.rbd = 2;
      ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "disappear handleType %d", new Object[] { Integer.valueOf(this.rbd) });
      AppMethodBeat.o(37294);
    }
  }

  public final void cpc()
  {
    AppMethodBeat.i(37296);
    super.cpc();
    int i = cpw();
    int j = getView().getHeight();
    ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "inScreenHeight %d, height %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if ((i == 0) || (j == 0))
      AppMethodBeat.o(37296);
    while (true)
    {
      return;
      this.rbJ = i;
      this.iZo = j;
      if (i < 0)
      {
        AppMethodBeat.o(37296);
      }
      else
      {
        ab.d("MicroMsg.Sns.AdLandingPageSightVideoComponent", "appeared handleType %d", new Object[] { Integer.valueOf(this.rbd) });
        if (i >= j * 0.5F)
        {
          if ((this.raX) && (!this.raY))
          {
            AppMethodBeat.o(37296);
          }
          else
          {
            this.raY = false;
            this.raX = true;
            if (this.rbd == 0)
            {
              if (this.raV)
                coY();
              while (true)
              {
                this.rbd = 1;
                bgC();
                AppMethodBeat.o(37296);
                break;
                cpd();
              }
            }
            if (this.rbd == 2)
            {
              if (this.raV)
                coY();
              while (true)
              {
                bgC();
                this.rbd = 1;
                AppMethodBeat.o(37296);
                break;
                cpd();
              }
            }
            if (this.rbd == 3)
            {
              if (this.raV)
                coY();
              while (true)
              {
                bgC();
                AppMethodBeat.o(37296);
                break;
                cpd();
              }
            }
          }
        }
        else
        {
          this.raY = false;
          this.raX = false;
          cpN();
          if (this.rbd == 1)
            this.rbd = 2;
          AppMethodBeat.o(37296);
        }
      }
    }
  }

  public final void cpd()
  {
    AppMethodBeat.i(37292);
    super.cpd();
    this.raN.setImageDrawable(com.tencent.mm.bz.a.g(this.context, 2131231394));
    this.rbF.setMute(false);
    this.raV = false;
    AppMethodBeat.o(37292);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37286);
    if (!com.tencent.mm.vfs.e.ct(h.gj("adId", ((o)this.qZo).qWG)))
      this.rbb = false;
    if (!com.tencent.mm.vfs.e.ct(Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages/adId_stream_" + ag.ck(((o)this.qZo).qWF)))
      this.rbc = false;
    Object localObject1 = this.contentView.findViewById(2131827641);
    Object localObject2 = (ViewGroup)((View)localObject1).findViewById(2131827642);
    this.rbF = new OfflineVideoView(this.context);
    ((ViewGroup)localObject2).addView(this.rbF, new LinearLayout.LayoutParams(-1, -1));
    RelativeLayout.LayoutParams localLayoutParams;
    if (((o)this.qZo).qWL == 0)
      if ((int)((o)this.qZo).width > 0)
      {
        i = this.ieu;
        localLayoutParams = new RelativeLayout.LayoutParams(i, (int)(i * ((o)this.qZo).height / ((o)this.qZo).width));
        ((ViewGroup)localObject2).setLayoutParams(localLayoutParams);
        ((View)localObject1).setLayoutParams(localLayoutParams);
        localObject2 = h.gj("adId", ((o)this.qZo).qWG);
        if (!com.tencent.mm.vfs.e.ct((String)localObject2))
          break label942;
        this.rbF.Zz((String)localObject2);
        label250: this.raQ = ((TextView)((View)localObject1).findViewById(2131827572));
        this.raQ.setText(this.context.getString(2131298922));
        this.iVh = ((View)localObject1).findViewById(2131827636);
        if (this.iVh != null)
        {
          localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
          localObject2 = this.iVh.getParent();
          if ((localObject2 instanceof ViewGroup))
            ((ViewGroup)localObject2).removeView(this.iVh);
          ((ViewGroup)localObject1).addView(this.iVh, localLayoutParams);
        }
        this.raN = ((ImageView)((View)localObject1).findViewById(2131827637));
        this.raN.setVisibility(0);
        this.raN.setOnClickListener(new x.2(this));
        this.raN.setPadding(0, 0, com.tencent.mm.bz.a.fromDPToPix(this.context, 8), com.tencent.mm.bz.a.fromDPToPix(this.context, 13));
        localObject2 = this.raN.getParent();
        if ((localObject2 instanceof ViewGroup))
          ((ViewGroup)localObject2).removeView(this.raN);
        ((ViewGroup)localObject1).addView(this.raN);
        this.rbF.setVideoCallback(new x.3(this));
        this.raN.setVisibility(8);
        this.rbF.setOnClickListener(new x.4(this));
        localObject1 = (o)this.qZo;
        if ((((o)localObject1).cuu != 1) || (((o)localObject1).qWI.length() <= 0) || (((o)localObject1).qWH.length() <= 0))
          break label973;
      }
    label942: label973: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject1 = this.contentView.findViewById(2131827643);
        ((View)localObject1).setVisibility(0);
        localObject2 = (Button)((View)localObject1).findViewById(2131827644);
        ((Button)localObject2).setTextColor(((o)this.qZo).qWJ);
        ((Button)localObject2).setText(((o)this.qZo).qWI);
        ((Button)localObject2).setOnClickListener(new x.5(this));
        ((View)localObject1).findViewById(2131827645).setBackgroundColor(((o)this.qZo).qWK);
      }
      AppMethodBeat.o(37286);
      return;
      ((ViewGroup)localObject2).setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, this.iev));
      ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, this.iev));
      break;
      if (((o)this.qZo).qWL == 1)
      {
        int j;
        if (((o)this.qZo).width / this.ieu > ((o)this.qZo).height / this.iev)
        {
          j = this.ieu;
          i = (int)(j * ((o)this.qZo).height / ((o)this.qZo).width) + 1;
        }
        while (true)
        {
          localLayoutParams = new RelativeLayout.LayoutParams(j, i);
          localLayoutParams.leftMargin = ((this.ieu - j) / 2);
          localLayoutParams.rightMargin = localLayoutParams.leftMargin;
          localLayoutParams.topMargin = ((this.iev - i) / 2);
          localLayoutParams.bottomMargin = localLayoutParams.topMargin;
          ((ViewGroup)localObject2).setLayoutParams(localLayoutParams);
          ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(this.ieu, this.iev));
          break;
          i = this.iev;
          j = (int)(i * ((o)this.qZo).width / ((o)this.qZo).height) + 1;
        }
      }
      if (((o)this.qZo).qWL != 2)
        break;
      localLayoutParams = new RelativeLayout.LayoutParams((int)((o)this.qZo).width, (int)((o)this.qZo).height);
      ((ViewGroup)localObject2).setLayoutParams(localLayoutParams);
      ((View)localObject1).setLayoutParams(new RelativeLayout.LayoutParams(localLayoutParams));
      break;
      h.c("adId", ((o)this.qZo).qWG, false, 1000000001, new x.1(this));
      break label250;
    }
  }

  protected final void cpp()
  {
    AppMethodBeat.i(37298);
    ab.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", getClass().getName() + "not support update now");
    AppMethodBeat.o(37298);
  }

  protected final int getLayout()
  {
    return 2130970729;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x
 * JD-Core Version:    0.6.2
 */