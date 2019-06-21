package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.y;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ams;
import com.tencent.mm.protocal.protobuf.amt;
import com.tencent.mm.protocal.protobuf.cxk;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public final class AppBrandProfileUI extends MMActivity
  implements k.a
{
  private static final int iHp;
  private static final int iHq;
  private static final int iHr;
  private static final int iHs;
  private static final int iHt;
  private static final int iHu;
  private static final int iHv;
  private u iFD;
  private ImageView iFW;
  private LinkedList<cxk> iHA;
  private LinearLayout iHB;
  private ImageView iHC;
  private TextView iHD;
  private TextView iHE;
  private TextView iHF;
  private RatingBar iHG;
  private TextView iHH;
  private LinearLayout iHI;
  private RecyclerView iHJ;
  private LinearLayout iHK;
  private LinearLayout iHL;
  private LinearLayout iHM;
  private TextView iHN;
  private AppBrandNearbyShowcaseView iHO;
  private LinearLayout iHP;
  private FrameLayout iHQ;
  private TextView iHR;
  private TextView iHS;
  private LinearLayout iHT;
  private ImageView iHU;
  private LinearLayout iHV;
  private AppBrandNearbyShowcaseView iHW;
  private TextView iHX;
  private int iHY;
  private com.tencent.mm.ui.widget.a.d iHZ;
  private long iHw;
  private boolean iHx;
  private boolean iHy;
  private int iHz;
  private WxaExposedParams iIa;
  private boolean iIb;
  private b.f iIc;
  private b.f iId;
  private b.f iIe;
  private String igi;

  static
  {
    AppMethodBeat.i(133082);
    iHp = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 24);
    iHq = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 20);
    iHr = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 2);
    iHs = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 40);
    iHt = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 44);
    iHu = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 32);
    iHv = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 4);
    AppMethodBeat.o(133082);
  }

  public AppBrandProfileUI()
  {
    AppMethodBeat.i(133055);
    this.iHw = 0L;
    this.iHx = false;
    this.iHy = false;
    this.iHz = 0;
    this.iHA = new LinkedList();
    this.iIb = false;
    AppMethodBeat.o(133055);
  }

  public static void a(Context paramContext, String paramString1, int paramInt, String paramString2, WxaExposedParams paramWxaExposedParams, Bundle paramBundle, ActivityStarterIpcDelegate paramActivityStarterIpcDelegate)
  {
    AppMethodBeat.i(133056);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(133056);
    while (true)
    {
      return;
      Context localContext = paramContext;
      if (paramContext == null)
        localContext = ah.getContext();
      paramContext = new Intent(localContext, AppBrandProfileUI.class).putExtra("key_username", paramString1).putExtra("key_from_scene", paramInt).putExtra("key_scene_note", paramString2).putExtra("key_can_swipe_back", true).putExtra("key_scene_exposed_params", paramWxaExposedParams).putExtra("key_extra_bundle", paramBundle);
      if (paramWxaExposedParams != null)
      {
        paramString1 = new Bundle();
        paramString1.putInt("stat_scene", 6);
        paramString1.putString("stat_app_id", paramWxaExposedParams.appId);
        paramString1.putString("stat_url", paramWxaExposedParams.pageId);
        paramContext.putExtra("_stat_obj", paramString1);
      }
      paramContext.putExtra("KEY_DELEGATED_ACTIVITY_STARTER", paramActivityStarterIpcDelegate);
      if (!(localContext instanceof Activity))
        paramContext.addFlags(268435456);
      localContext.startActivity(paramContext);
      AppMethodBeat.o(133056);
    }
  }

  private void aMm()
  {
    AppMethodBeat.i(133069);
    if (!bo.isNullOrNil(this.igi))
    {
      ab.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile start");
      ams localams = new ams();
      localams.username = this.igi;
      b.a locala = new b.a();
      locala.fsI = 2921;
      locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getprofileinfo";
      locala.fsJ = localams;
      locala.fsK = new amt();
      com.tencent.mm.ipcinvoker.wx_extension.b.a(locala.acD(), new AppBrandProfileUI.a(this));
    }
    AppMethodBeat.o(133069);
  }

  private void aMn()
  {
    AppMethodBeat.i(133070);
    if ((this.iHA != null) && (this.iHA.size() > 0))
    {
      this.iHQ.setVisibility(0);
      this.iHT.setVisibility(0);
      this.iHR.setVisibility(8);
      this.iHW.setIconGap(iHt);
      this.iHW.setIconSize(iHs);
      this.iHW.setIconLayerCount(Math.min(this.iHA.size(), 4));
      if (this.iId == null)
        this.iId = new com.tencent.mm.plugin.appbrand.ui.b.a(iHu);
      if (this.iIe == null)
        this.iIe = new com.tencent.mm.plugin.appbrand.ui.b.a(iHv);
      int i = 0;
      if (i < this.iHW.getChildCount())
      {
        String str;
        label167: com.tencent.mm.modelappbrand.a.b localb;
        ImageView localImageView;
        if (this.iHA.size() > i)
        {
          str = ((cxk)this.iHA.get(i)).nSa;
          localb = com.tencent.mm.modelappbrand.a.b.abR();
          localImageView = this.iHW.qf(i);
          if ((str != null) && (!str.startsWith("http")))
            break label225;
        }
        label225: for (b.f localf = this.iId; ; localf = this.iIe)
        {
          localb.a(localImageView, str, 2130838444, localf);
          i++;
          break;
          str = null;
          break label167;
        }
      }
      if (this.iHz == 1)
        if (this.iHx)
        {
          this.iHS.setText(getString(2131296787));
          if (!this.iHx)
            break label419;
          this.iHS.setCompoundDrawablesWithIntrinsicBounds(2130837754, 0, 0, 0);
          label283: if (this.iHz <= 4)
            break label435;
          this.iHU.setVisibility(0);
          this.iHV.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(133037);
              AppBrandProfileUI.g(AppBrandProfileUI.this);
              AppMethodBeat.o(133037);
            }
          });
        }
    }
    while (true)
    {
      this.iHR.setOnClickListener(new AppBrandProfileUI.13(this));
      this.iHS.setOnClickListener(new AppBrandProfileUI.14(this));
      AppMethodBeat.o(133070);
      return;
      this.iHS.setText(String.format(getString(2131296789), new Object[] { Integer.valueOf(this.iHz) }));
      break;
      this.iHS.setText(String.format(getString(2131296789), new Object[] { Integer.valueOf(this.iHz) }));
      break;
      label419: this.iHS.setCompoundDrawablesWithIntrinsicBounds(2130837753, 0, 0, 0);
      break label283;
      label435: this.iHU.setVisibility(8);
      this.iHV.setOnClickListener(null);
      continue;
      this.iHQ.setVisibility(0);
      this.iHR.setVisibility(0);
      this.iHT.setVisibility(8);
    }
  }

  private void c(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(133067);
    String str1;
    if (this.iFD == null)
    {
      str1 = null;
      if (!bo.isNullOrNil(str1))
        break label43;
      AppMethodBeat.o(133067);
    }
    while (true)
    {
      return;
      str1 = this.iFD.appId;
      break;
      label43: int i = getIntent().getIntExtra("key_from_scene", 3);
      String str2 = bo.nullAsNil(getIntent().getStringExtra("key_scene_note"));
      int j = 0;
      WxaAttributes localWxaAttributes = f.auO().e(str1, new String[] { "appInfo", "brandIconURL", "nickname" });
      if (localWxaAttributes != null)
        j = localWxaAttributes.ayJ().fmr;
      j += 1000;
      ab.d("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "stev report(%s), appId %s, scene %s, sceneNote %s, eventId %s, result %s, appType %s", new Object[] { Integer.valueOf(13919), str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(j) });
      h.pYm.e(13919, new Object[] { str1, Integer.valueOf(i), str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(j) });
      this.iHY = i;
      AppMethodBeat.o(133067);
    }
  }

  private void dl(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133066);
    c(paramInt1, paramInt2, bo.anT());
    AppMethodBeat.o(133066);
  }

  private void eF(boolean paramBoolean)
  {
    AppMethodBeat.i(133068);
    com.tencent.mm.sdk.g.d.post(new AppBrandProfileUI.4(this, paramBoolean), "AppBrandProfile");
    AppMethodBeat.o(133068);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133064);
    if ((paramm.hsh == 3) && ((paramm.obj instanceof String)) && (!bo.isNullOrNil(this.igi)) && (this.igi.equals((String)paramm.obj)))
      eF(false);
    AppMethodBeat.o(133064);
  }

  public final boolean apx()
  {
    return true;
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(133058);
    super.dealContentView(paramView);
    ScrollView localScrollView = new ScrollView(this);
    localScrollView.setVerticalScrollBarEnabled(false);
    localScrollView.setOverScrollMode(2);
    localScrollView.setBackgroundResource(2131689715);
    localScrollView.setFillViewport(true);
    this.iHB = new LinearLayout(this);
    this.iHB.setOrientation(1);
    this.iHB.setFocusable(true);
    this.iHB.setFocusableInTouchMode(true);
    localScrollView.addView(this.iHB, new FrameLayout.LayoutParams(-1, -1));
    ((FrameLayout)paramView).addView(localScrollView);
    AppMethodBeat.o(133058);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initActivityCloseAnimation()
  {
    AppMethodBeat.i(133065);
    if (this.iIb)
      AppMethodBeat.o(133065);
    while (true)
    {
      return;
      super.initActivityCloseAnimation();
      AppMethodBeat.o(133065);
    }
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(133060);
    if (Build.VERSION.SDK_INT >= 21)
      super.finishAfterTransition();
    while (true)
    {
      dl(6, 1);
      AppMethodBeat.o(133060);
      return;
      super.finish();
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133057);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_username");
    this.igi = paramBundle;
    if (bo.isNullOrNil(paramBundle))
    {
      finish();
      AppMethodBeat.o(133057);
    }
    while (true)
    {
      return;
      if ((getIntent().getExtras() != null) && (!getIntent().getExtras().containsKey("key_extra_bundle")))
        getIntent().getExtras().putBundle("key_extra_bundle", Bundle.EMPTY);
      getIntent().setExtrasClassLoader(getClassLoader());
      this.iIa = ((WxaExposedParams)getIntent().getParcelableExtra("key_scene_exposed_params"));
      setBackBtn(new AppBrandProfileUI.1(this));
      addIconOptionMenu(0, 2131296975, 2130839555, new AppBrandProfileUI.11(this));
      setMMTitle("");
      dyb();
      xE(-1);
      paramBundle = LayoutInflater.from(this).inflate(2130968709, this.iHB, true);
      paramBundle.setClickable(false);
      paramBundle.setLongClickable(false);
      this.iHC = ((ImageView)paramBundle.findViewById(2131821282));
      this.iHD = ((TextView)paramBundle.findViewById(2131821283));
      this.iHE = ((TextView)paramBundle.findViewById(2131821285));
      this.iHF = ((TextView)paramBundle.findViewById(2131821288));
      this.iHG = ((RatingBar)paramBundle.findViewById(2131821289));
      this.iHH = ((TextView)paramBundle.findViewById(2131821286));
      this.iHI = ((LinearLayout)paramBundle.findViewById(2131821287));
      this.iFW = ((ImageView)paramBundle.findViewById(2131821284));
      this.iHK = ((LinearLayout)paramBundle.findViewById(2131821299));
      this.iHJ = ((RecyclerView)paramBundle.findViewById(2131821300));
      this.iHJ.setItemAnimator(new y());
      Object localObject = new LinearLayoutManager();
      ((LinearLayoutManager)localObject).setOrientation(0);
      this.iHJ.setLayoutManager((RecyclerView.i)localObject);
      this.iHJ.a(new AppBrandProfileUI.18(this));
      this.iHL = ((LinearLayout)paramBundle.findViewById(2131821301));
      this.iHM = ((LinearLayout)paramBundle.findViewById(2131821302));
      this.iHN = ((TextView)paramBundle.findViewById(2131821304));
      this.iHO = ((AppBrandNearbyShowcaseView)paramBundle.findViewById(2131821303));
      this.iHO.setIconGap(iHq);
      this.iHO.setIconSize(iHp + iHr * 2);
      localObject = this.iHM;
      if (((View)localObject).getVisibility() == 0)
        ((View)localObject).animate().setDuration(200L).alpha(0.0F).withEndAction(new AppBrandProfileUI.15(this, (View)localObject)).start();
      this.iHQ = ((FrameLayout)paramBundle.findViewById(2131821292));
      this.iHR = ((TextView)paramBundle.findViewById(2131821293));
      this.iHS = ((TextView)paramBundle.findViewById(2131821295));
      this.iHU = ((ImageView)paramBundle.findViewById(2131821298));
      this.iHW = ((AppBrandNearbyShowcaseView)paramBundle.findViewById(2131821297));
      this.iHV = ((LinearLayout)paramBundle.findViewById(2131821296));
      this.iHT = ((LinearLayout)paramBundle.findViewById(2131821294));
      this.iHX = ((TextView)paramBundle.findViewById(2131821310));
      this.iHP = ((LinearLayout)paramBundle.findViewById(2131821306));
      this.iHP.setVisibility(0);
      this.iHP.setOnClickListener(new AppBrandProfileUI.19(this));
      localObject = paramBundle.findViewById(2131821290);
      paramBundle = paramBundle.findViewById(2131821291);
      ((View)localObject).setOnClickListener(new AppBrandProfileUI.16(this));
      paramBundle.setOnClickListener(new AppBrandProfileUI.17(this));
      eF(true);
      aMm();
      AppMethodBeat.o(133057);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133063);
    super.onDestroy();
    p.ayH().d(this);
    AppMethodBeat.o(133063);
  }

  public final void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(133059);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (!bo.isNullOrNil(this.igi))
      p.ayH().d(this);
    paramIntent = getIntent().getStringExtra("key_username");
    this.igi = paramIntent;
    if (bo.isNullOrNil(paramIntent))
    {
      finish();
      AppMethodBeat.o(133059);
    }
    while (true)
    {
      return;
      eF(true);
      aMm();
      AppMethodBeat.o(133059);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(133062);
    super.onPause();
    o.a(this, new AppBrandProfileUI.21(this));
    AppMethodBeat.o(133062);
  }

  public final void onResume()
  {
    AppMethodBeat.i(133061);
    super.onResume();
    if (getSwipeBackLayout() != null)
      getSwipeBackLayout().setEnableGesture(getIntent().getBooleanExtra("key_can_swipe_back", true));
    o.a(this, new AppBrandProfileUI.20(this));
    AppMethodBeat.o(133061);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI
 * JD-Core Version:    0.6.2
 */