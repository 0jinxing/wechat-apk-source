package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.vfs.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends y
  implements b, h.b
{
  private Context context;
  private ak fbD;
  private ProgressBar gtI;
  private View iVh;
  ImageView mOX;
  private long oKj;
  private int playCount;
  AdLandingVideoWrapper raL;
  private VideoPlayerSeekBar raM;
  private ImageView raN;
  boolean raO;
  private ImageView raP;
  private TextView raQ;
  private Runnable raR;
  boolean raS;
  boolean raT;
  boolean raU;
  boolean raV;
  boolean raW;
  private boolean raX;
  private boolean raY;
  private boolean raZ;
  private boolean rba;
  private boolean rbb;
  private boolean rbc;
  int rbd;
  private int rbe;
  private int rbf;
  int rbg;
  int rbh;
  private ac rbi;
  private View.OnClickListener rbj;
  private View.OnClickListener rbk;
  private View.OnClickListener rbl;
  private View.OnClickListener rbm;

  public r(Context paramContext, z paramz, ViewGroup paramViewGroup)
  {
    super(paramContext, paramz, paramViewGroup);
    AppMethodBeat.i(37216);
    this.raS = false;
    this.raT = false;
    this.raU = false;
    this.raV = true;
    this.raW = true;
    this.raX = false;
    this.raY = true;
    this.raZ = false;
    this.rba = false;
    this.rbb = false;
    this.rbc = false;
    this.rbd = 0;
    this.oKj = 0L;
    this.rbe = 0;
    this.playCount = 0;
    this.rbf = 0;
    this.rbg = 0;
    this.rbh = 0;
    this.rbi = null;
    this.rbj = new r.7(this);
    this.rbk = new r.8(this);
    this.rbl = new r.9(this);
    this.rbm = new r.10(this);
    this.context = paramContext;
    this.fbD = new ak(Looper.getMainLooper());
    this.raR = new r.1(this);
    this.rbi = new r.4(this, paramContext);
    AppMethodBeat.o(37216);
  }

  private void bgC()
  {
    AppMethodBeat.i(37218);
    ab.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "starting play");
    if (this.rba)
    {
      ab.i("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "last download fail ,try again");
      this.raL.c(false, ((z)this.qZo).qWH, 0);
      Dp(0);
      this.raL.cpT();
      AppMethodBeat.o(37218);
    }
    while (true)
    {
      return;
      this.fbD.post(new r.11(this));
      this.oKj = System.currentTimeMillis();
      this.playCount += 1;
      AppMethodBeat.o(37218);
    }
  }

  final void Dp(int paramInt)
  {
    AppMethodBeat.i(37221);
    if (this.raL != null)
    {
      this.raP.setVisibility(8);
      if (this.mOX.getVisibility() == 0)
        this.gtI.setVisibility(0);
      this.raL.e(paramInt, true);
    }
    AppMethodBeat.o(37221);
  }

  public final void aFw()
  {
    this.raU = true;
  }

  public final boolean al(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(37228);
    boolean bool;
    if (!super.al(paramJSONObject))
    {
      AppMethodBeat.o(37228);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramJSONObject.put("streamVideoDuraion", this.raL.getVideoDurationSec() * 1000);
        paramJSONObject.put("playTimeInterval", this.rbe);
        paramJSONObject.put("playCount", this.playCount);
        paramJSONObject.put("playCompletedCount", this.rbf);
        paramJSONObject.put("clickPlayControlCount", this.rbg);
        paramJSONObject.put("clickVoiceControlCount", this.rbh);
        if (this.raZ);
        for (String str = "1"; ; str = "0")
        {
          paramJSONObject.put("isAutoPlay", str);
          JSONObject localJSONObject;
          if (!this.rbb)
          {
            str = ag.ck(((z)this.qZo).qXv);
            localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("urlMd5", str);
            localJSONObject.put("needDownload", 1);
            paramJSONObject.put("thumbUrlInfo", localJSONObject);
          }
          if (!this.rbc)
          {
            str = ag.ck(((z)this.qZo).qWH);
            localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>();
            localJSONObject.put("urlMd5", str);
            localJSONObject.put("needDownload", 1);
            paramJSONObject.put("streamVideoUrlInfo", localJSONObject);
          }
          AppMethodBeat.o(37228);
          bool = true;
          break;
        }
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(37228);
        bool = false;
      }
    }
  }

  public final void c(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37232);
    ab.e("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "online play error, %s", new Object[] { paramString3 });
    this.rba = true;
    AppMethodBeat.o(37232);
  }

  public final void coY()
  {
    AppMethodBeat.i(37222);
    super.coY();
    this.raN.setImageDrawable(a.g(this.context, 2130839142));
    this.raL.setMute(true);
    this.raV = true;
    AppMethodBeat.o(37222);
  }

  public final void coZ()
  {
    AppMethodBeat.i(37226);
    super.coZ();
    this.raL.aEX();
    AppMethodBeat.o(37226);
  }

  public final void cp(String paramString1, String paramString2)
  {
    this.rba = false;
  }

  public final void cpA()
  {
    AppMethodBeat.i(37233);
    super.cpA();
    cpN();
    String str = h.gj("adId", ((z)this.qZo).qXv);
    if (e.ct(str))
    {
      this.mOX.setImageBitmap(MMBitmapFactory.decodeFile(str));
      this.mOX.setVisibility(0);
    }
    AppMethodBeat.o(37233);
  }

  final void cpN()
  {
    AppMethodBeat.i(37219);
    ab.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "pause play");
    this.fbD.post(new r.2(this));
    if (this.oKj != 0L)
    {
      this.rbe = ((int)(this.rbe + (System.currentTimeMillis() - this.oKj)));
      this.oKj = 0L;
    }
    AppMethodBeat.o(37219);
  }

  public final void cpa()
  {
    AppMethodBeat.i(37224);
    super.cpa();
    AppMethodBeat.o(37224);
  }

  public final void cpb()
  {
    AppMethodBeat.i(37225);
    super.cpb();
    cpN();
    if ((!this.raX) && (!this.raY))
      AppMethodBeat.o(37225);
    while (true)
    {
      return;
      this.raY = false;
      this.raX = false;
      if (this.rbd == 1)
        this.rbd = 2;
      AppMethodBeat.o(37225);
    }
  }

  public final void cpc()
  {
    AppMethodBeat.i(37227);
    super.cpc();
    int i = cpw();
    int j = getView().getHeight();
    ab.d("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "inScreenHeight %d, height %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if ((i == 0) || (j == 0))
      AppMethodBeat.o(37227);
    while (true)
    {
      return;
      if (i < 0)
      {
        AppMethodBeat.o(37227);
      }
      else if (i >= j * 0.5F)
      {
        if ((this.raX) && (!this.raY))
        {
          AppMethodBeat.o(37227);
        }
        else
        {
          this.raY = false;
          this.raX = true;
          this.mOX.setVisibility(0);
          NetworkInfo localNetworkInfo = ((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
          if ((!this.raW) || ((this.raW) && (localNetworkInfo != null) && (localNetworkInfo.getType() == 1)))
          {
            la(true);
            al.n(new r.3(this), 3000L);
          }
          if (this.raW)
          {
            if ((localNetworkInfo == null) || ((localNetworkInfo != null) && (localNetworkInfo.getType() != 1)))
            {
              this.raP.setVisibility(0);
              this.raZ = false;
              this.raW = false;
              AppMethodBeat.o(37227);
            }
            else
            {
              this.raZ = true;
              this.raW = false;
            }
          }
          else
          {
            if (this.rbd == 0)
              if ((localNetworkInfo != null) && (localNetworkInfo.getType() == 1))
              {
                if (!this.raV)
                  break label299;
                coY();
                label281: this.rbd = 1;
              }
            while (true)
            {
              bgC();
              label299: 
              do
              {
                AppMethodBeat.o(37227);
                break;
                cpd();
                break label281;
                if (this.rbd == 2)
                {
                  if (this.raV)
                    coY();
                  while (true)
                  {
                    bgC();
                    this.rbd = 1;
                    AppMethodBeat.o(37227);
                    break;
                    cpd();
                  }
                }
              }
              while (this.rbd != 3);
              if (this.raV)
                coY();
              else
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
        AppMethodBeat.o(37227);
      }
    }
  }

  public final void cpd()
  {
    AppMethodBeat.i(37223);
    super.cpd();
    this.raN.setImageDrawable(a.g(this.context, 2130839143));
    this.raL.setMute(false);
    this.raV = false;
    AppMethodBeat.o(37223);
  }

  public final void cpk()
  {
    AppMethodBeat.i(37217);
    View localView = this.contentView.findViewById(2131821333);
    localView.setBackgroundColor(-16777216);
    int i = this.ieu;
    int j = this.iev;
    int k = j;
    if (((z)this.qZo).qXw == 1)
    {
      k = j;
      if ((int)((z)this.qZo).width > 0)
        k = i * (int)((z)this.qZo).height / (int)((z)this.qZo).width;
    }
    else
    {
      localView.setPadding((int)((z)this.qZo).qWS, (int)((z)this.qZo).qWQ, (int)((z)this.qZo).qWT, (int)((z)this.qZo).qWR);
    }
    localView.setLayoutParams(new RelativeLayout.LayoutParams(i, k));
    localView.setMinimumHeight(k);
    this.raL = ((AdLandingVideoWrapper)localView.findViewById(2131821402));
    this.raL.setIMMVideoViewCallback(this);
    this.raL.setOnClickListener(this.rbm);
    this.raL.c(false, ((z)this.qZo).qWH, 0);
    this.raL.setIsShowBasicControls(true);
    this.gtI = ((ProgressBar)localView.findViewById(2131821219));
    this.mOX = ((ImageView)localView.findViewById(2131821511));
    Object localObject = h.gj("adId", ((z)this.qZo).qXv);
    if (!e.ct((String)localObject))
      this.rbb = false;
    if (this.rbb)
    {
      this.mOX.setImageBitmap(MMBitmapFactory.decodeFile((String)localObject));
      this.raQ = ((TextView)localView.findViewById(2131827572));
      this.raQ.setText(this.context.getString(2131298922));
      this.iVh = localView.findViewById(2131827636);
      this.iVh.setVisibility(4);
      this.raM = new VideoPlayerSeekBar(this.context);
      this.raM.setVisibility(4);
      if (this.rbi != null)
      {
        localObject = this.rbi;
        if (this.raM.getVisibility() != 0)
          break label669;
      }
    }
    label669: for (boolean bool = true; ; bool = false)
    {
      ((ac)localObject).lb(bool);
      this.raM.setIplaySeekCallback(this);
      this.raM.setOnPlayButtonClickListener(this.rbj);
      localObject = new RelativeLayout.LayoutParams(i - a.fromDPToPix(this.context, 30), -2);
      ((RelativeLayout.LayoutParams)localObject).addRule(12);
      this.raM.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.raL.setVideoFooterView(this.raM);
      this.raN = ((ImageView)localView.findViewById(2131827637));
      this.raN.setVisibility(4);
      this.raN.setOnClickListener(this.rbk);
      this.raN.setPadding(0, 0, a.fromDPToPix(this.context, 8), 0);
      this.raP = ((ImageView)localView.findViewById(2131820981));
      this.raP.setImageDrawable(a.g(this.context, 2131231923));
      this.raP.setVisibility(8);
      this.raP.setOnClickListener(this.rbl);
      ((ViewGroup)this.raM.getParent()).removeView(this.raM);
      ((RelativeLayout.LayoutParams)localObject).bottomMargin = 0;
      ((ViewGroup)localView).addView(this.raM, (ViewGroup.LayoutParams)localObject);
      this.raL.setVideoPlayCallback(new r.6(this));
      AppMethodBeat.o(37217);
      return;
      h.c("adId", ((z)this.qZo).qXv, false, 1000000001, new r.5(this));
      break;
    }
  }

  protected final void cpp()
  {
  }

  public final void cq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37230);
    this.rbf += 1;
    la(true);
    this.raL.rcg.stopTimer();
    if (this.oKj != 0L)
    {
      this.rbe = ((int)(this.rbe + (System.currentTimeMillis() - this.oKj)));
      this.oKj = 0L;
    }
    this.rbd = 5;
    this.raL.akV();
    AppMethodBeat.o(37230);
  }

  public final void cr(String paramString1, String paramString2)
  {
  }

  public final void cs(String paramString1, String paramString2)
  {
    AppMethodBeat.i(37231);
    this.mOX.setVisibility(8);
    this.gtI.setVisibility(8);
    AppMethodBeat.o(37231);
  }

  public final void ct(String paramString1, String paramString2)
  {
  }

  public final void cu(String paramString1, String paramString2)
  {
  }

  public final void d(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
  }

  protected final int getLayout()
  {
    return 2130970726;
  }

  final void la(boolean paramBoolean)
  {
    AppMethodBeat.i(37220);
    if (paramBoolean)
    {
      this.raM.setVisibility(0);
      this.raN.setVisibility(0);
      this.iVh.setVisibility(0);
      if (this.rbi != null)
        this.rbi.lb(true);
      this.fbD.postDelayed(this.raR, 5000L);
      AppMethodBeat.o(37220);
    }
    while (true)
    {
      return;
      this.raU = false;
      this.raM.setVisibility(4);
      this.raN.setVisibility(8);
      this.iVh.setVisibility(4);
      if (this.rbi != null)
        this.rbi.lb(false);
      this.fbD.removeCallbacks(this.raR);
      AppMethodBeat.o(37220);
    }
  }

  public final void oA(int paramInt)
  {
    AppMethodBeat.i(37229);
    ab.i("MicroMsg.Sns.AdLandingPageNewStreamVideoComponent", "onSeek time ".concat(String.valueOf(paramInt)));
    if (this.raV)
      coY();
    while (true)
    {
      Dp(paramInt);
      AppMethodBeat.o(37229);
      return;
      cpe();
      cpd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r
 * JD-Core Version:    0.6.2
 */