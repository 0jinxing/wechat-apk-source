package com.tencent.mm.plugin.exdevice.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.exdevice.f.a.i;
import com.tencent.mm.plugin.exdevice.f.a.k;
import com.tencent.mm.plugin.exdevice.model.ac;
import com.tencent.mm.plugin.exdevice.model.ac.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.sport.ui.SportChartView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.ach;
import com.tencent.mm.protocal.protobuf.cyk;
import com.tencent.mm.protocal.protobuf.mq;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.a;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class ExdeviceProfileUI extends MMActivity
  implements com.tencent.mm.plugin.exdevice.f.b.e, c
{
  private static int lCl = 0;
  private boolean UP;
  private int eOf;
  private String hZn;
  private String igi;
  private String lBO;
  private com.tencent.mm.plugin.exdevice.f.b.a.a lBP;
  private ArrayList<String> lBQ;
  private cyk lBR;
  private ExdeviceProfileAffectedUserView lBS;
  private ImageView lBT;
  private ListView lBU;
  private ExdeviceProfileListHeader lBV;
  private MMSwitchBtn lBW;
  private SportChartView lBX;
  private a lBY;
  private View lBZ;
  private boolean lBt;
  private boolean lBu;
  private int lBv;
  private List<mq> lBy;
  private volatile boolean lCa;
  private String lCb;
  private String lCc;
  private List<com.tencent.mm.plugin.sport.a.e> lCd;
  private ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> lCe;
  private List<ach> lCf;
  private int lCg;
  private com.tencent.mm.plugin.exdevice.a.b<i> lCh;
  private n.d lCi;
  private com.tencent.mm.plugin.exdevice.a.b<com.tencent.mm.plugin.exdevice.f.a.h> lCj;
  private com.tencent.mm.plugin.exdevice.a.b<com.tencent.mm.plugin.exdevice.f.a.g> lCk;
  private Runnable lCm;
  private com.tencent.mm.plugin.exdevice.a.b<com.tencent.mm.plugin.exdevice.f.a.g> lCn;
  private List<String> lCo;
  private com.tencent.mm.plugin.exdevice.a.b<k> lCp;
  private k lCq;
  private com.tencent.mm.sdk.b.c<mc> lCr;
  private GestureDetector lCs;
  private MMPullDownView.a lCt;
  private boolean lvJ;
  private List<String> lvZ;
  private String lvw;
  private List<String> lwa;
  private com.tencent.mm.ui.base.p lzK;
  private String mAppName;
  private Context mContext;
  private TextPaint oz;

  public ExdeviceProfileUI()
  {
    AppMethodBeat.i(20061);
    this.UP = false;
    this.lzK = null;
    this.lCh = new com.tencent.mm.plugin.exdevice.a.b()
    {
    };
    this.oz = new TextPaint(1);
    this.eOf = 0;
    this.lCi = new ExdeviceProfileUI.29(this);
    this.lCj = new ExdeviceProfileUI.31(this);
    this.lCk = new ExdeviceProfileUI.2(this);
    this.lCm = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(20036);
        BackwardSupportUtil.c.a(ExdeviceProfileUI.z(ExdeviceProfileUI.this));
        if (ExdeviceProfileUI.z(ExdeviceProfileUI.this).getCount() > 0)
          BackwardSupportUtil.c.b(ExdeviceProfileUI.z(ExdeviceProfileUI.this), ExdeviceProfileUI.z(ExdeviceProfileUI.this).getCount() - 1);
        AppMethodBeat.o(20036);
      }
    };
    this.lCn = new ExdeviceProfileUI.15(this);
    this.lCp = new ExdeviceProfileUI.17(this);
    this.lCr = new ExdeviceProfileUI.21(this);
    this.lCt = new ExdeviceProfileUI.25(this);
    AppMethodBeat.o(20061);
  }

  private void I(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(20075);
    Object localObject = ((com.tencent.mm.plugin.sport.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sport.a.b.class)).V(paramLong1, paramLong2);
    HashSet localHashSet = new HashSet();
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.plugin.sport.a.e locale;
    if (this.lCd != null)
    {
      Iterator localIterator = this.lCd.iterator();
      while (localIterator.hasNext())
      {
        locale = (com.tencent.mm.plugin.sport.a.e)localIterator.next();
        if (localHashSet.add(locale.field_date))
          localArrayList.add(locale);
      }
    }
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      locale = (com.tencent.mm.plugin.sport.a.e)((Iterator)localObject).next();
      if (localHashSet.add(locale.field_date))
        localArrayList.add(locale);
    }
    Collections.sort(localArrayList);
    this.lCd = localArrayList;
    if (this.lBX != null)
      this.lBX.dD(this.lCd);
    AppMethodBeat.o(20075);
  }

  private void bpM()
  {
    AppMethodBeat.i(20063);
    this.lCe = ad.boY().bpk();
    if (this.lCe != null)
    {
      ab.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: follow size:%s, %s", new Object[] { Integer.valueOf(this.lCe.size()), this.lCe.toString() });
      if (bo.ek(this.lCe))
        break label99;
      this.lBv = this.lCe.size();
      AppMethodBeat.o(20063);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: follow is null");
      break;
      label99: this.lBv = 0;
      AppMethodBeat.o(20063);
    }
  }

  private void bpN()
  {
    AppMethodBeat.i(20064);
    runOnUiThread(new ExdeviceProfileUI.27(this));
    AppMethodBeat.o(20064);
  }

  private void bpO()
  {
    AppMethodBeat.i(20067);
    runOnUiThread(new ExdeviceProfileUI.3(this));
    AppMethodBeat.o(20067);
  }

  private void bpP()
  {
    AppMethodBeat.i(20069);
    String str = r.Yz();
    if (this.lBZ != null)
      this.lBZ.setVisibility(8);
    if ((!bo.isNullOrNil(str)) && (str.equals(this.igi)))
    {
      if ((this.lBP != null) && (bo.isNullOrNil(this.lBP.field_championUrl)) && (this.lBZ != null))
        this.lBZ.setVisibility(0);
      if (this.lBV == null)
        break label150;
      this.lBV.setOnClickListener(new ExdeviceProfileUI.11(this));
      AppMethodBeat.o(20069);
    }
    while (true)
    {
      return;
      if ((this.lBP != null) && (!bo.isNullOrNil(this.lBP.field_championUrl)) && (this.lBV != null))
        this.lBV.setOnClickListener(new ExdeviceProfileUI.13(this));
      label150: AppMethodBeat.o(20069);
    }
  }

  private void bpQ()
  {
    AppMethodBeat.i(20070);
    if (this.lBP != null)
    {
      if ((this.hZn == this.lBP.field_championUrl) || ((this.hZn != null) && (this.hZn.equals(this.lBP.field_championUrl))))
        break label99;
      com.tencent.mm.plugin.exdevice.f.a.e.a(this, this.lBT, this.lBP.field_championUrl);
      this.hZn = this.lBP.field_championUrl;
      AppMethodBeat.o(20070);
    }
    while (true)
    {
      return;
      this.lBT.setImageResource(2131689920);
      this.hZn = null;
      label99: AppMethodBeat.o(20070);
    }
  }

  public final void b(String paramString, com.tencent.mm.plugin.exdevice.f.b.d paramd)
  {
    AppMethodBeat.i(20072);
    if (("HardDeviceChampionInfo".equals(paramString)) && (this.igi.equals(paramd.username)))
    {
      ab.d("MicroMsg.Sport.ExdeviceProfileUI", "hy: url may changed. maybe reload background");
      this.lBP = ad.bpa().Kr(this.igi);
      runOnUiThread(new ExdeviceProfileUI.16(this));
    }
    AppMethodBeat.o(20072);
  }

  public final void bpR()
  {
    AppMethodBeat.i(20073);
    runOnUiThread(new ExdeviceProfileUI.18(this));
    if (this.lCq != null)
      aw.Rg().c(this.lCq);
    this.lCq = new k(this.lCp);
    aw.Rg().a(this.lCq, 0);
    AppMethodBeat.o(20073);
  }

  public final void bpS()
  {
    AppMethodBeat.i(20074);
    com.tencent.mm.plugin.sport.a.d.kT(17);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.igi);
    aw.Rg().a(new com.tencent.mm.plugin.exdevice.f.a.g(localArrayList, this.lCk), 0);
    AppMethodBeat.o(20074);
  }

  public final int getLayoutId()
  {
    return 2130969433;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(20071);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.exdevice.f.a.e.a(this, paramInt1, paramInt2, paramIntent, this.mAppName))
    {
      AppMethodBeat.o(20071);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(20071);
      break;
      if (paramInt2 == -1)
      {
        Toast.makeText(this, 2131303493, 1).show();
        AppMethodBeat.o(20071);
        break;
        if (paramInt2 == -1)
        {
          if (paramIntent == null);
          String str2;
          for (String str1 = null; ; str1 = paramIntent.getStringExtra("Select_Conv_User"))
          {
            str2 = ac.dG(this);
            if ((str1 != null) && (str1.length() != 0))
              break label155;
            ab.e("MicroMsg.Sport.ExdeviceProfileUI", "select conversation failed, toUser is null.");
            AppMethodBeat.o(20071);
            break;
          }
          label155: ac.a(this, str1, str2, paramIntent.getStringExtra("custom_send_text"), this.lCc);
          com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getResources().getString(2131297050));
          AppMethodBeat.o(20071);
          break;
          if (paramInt2 == -1)
          {
            paramIntent = bo.P(paramIntent.getStringExtra("Select_Contact").split(","));
            if (paramIntent == null)
            {
              AppMethodBeat.o(20071);
              break;
            }
            if (this.lzK != null)
              this.lzK.show();
            aw.Rg().a(new com.tencent.mm.plugin.exdevice.f.a.g(paramIntent, this.lCn), 0);
          }
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20062);
    super.onCreate(paramBundle);
    this.mContext = this.mController.ylL;
    paramBundle = getIntent();
    bpM();
    this.igi = paramBundle.getStringExtra("username");
    this.lBO = paramBundle.getStringExtra("usernickname");
    paramBundle = r.Yz();
    if (paramBundle != null)
      this.lBt = paramBundle.equals(this.igi);
    this.mAppName = getIntent().getStringExtra("app_username");
    this.lBu = ad.boY().Kp(this.igi);
    ab.d("MicroMsg.Sport.ExdeviceProfileUI", "is follow %s", new Object[] { Boolean.valueOf(this.lBu) });
    boolean bool;
    if (!bo.isNullOrNil(this.igi))
      bool = true;
    while (true)
    {
      Assert.assertTrue(bool);
      this.lBP = ad.bpa().Kr(this.igi);
      this.lBQ = getIntent().getStringArrayListExtra("key_affected_semi");
      getString(2131297061);
      this.lzK = com.tencent.mm.ui.base.h.b(this, getString(2131300968), new ExdeviceProfileUI.4(this));
      this.lBS = ((ExdeviceProfileAffectedUserView)findViewById(2131823703));
      this.lBT = ((ImageView)findViewById(2131823700));
      this.lBU = ((ListView)findViewById(2131823702));
      paramBundle = (MMPullDownView)findViewById(2131823138);
      this.lBS.setAffectedUserInfo(this.lBQ);
      bpQ();
      this.lBZ = findViewById(2131823701);
      this.lCs = new GestureDetector(this.mController.ylL, new ExdeviceProfileUI.a(this, (byte)0));
      paramBundle.setIsBottomShowAll(false);
      paramBundle.setTopViewVisible(false);
      paramBundle.setBottomViewVisible(false);
      paramBundle.setIsBottomShowAll(false);
      paramBundle.setIsTopShowAll(false);
      paramBundle.setCanOverScrool(true);
      paramBundle.setOnInterceptTouchEventListener(this.lCt);
      paramBundle.setAtBottomCallBack(new ExdeviceProfileUI.5(this));
      paramBundle.setAtTopCallBack(new ExdeviceProfileUI.6(this));
      paramBundle.setOnBottomLoadDataListener(new ExdeviceProfileUI.7(this));
      paramBundle.setOnScrollChangedListener(new ExdeviceProfileUI.8(this));
      localObject1 = new ExdeviceProfileListHeader(this);
      int i = com.tencent.mm.plugin.exdevice.j.b.J(this, getResources().getDimensionPixelSize(2131427616));
      Object localObject2 = getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject2).widthPixels > ((DisplayMetrics)localObject2).heightPixels)
      {
        j = getResources().getDimensionPixelSize(2131427562);
        label450: int k = getResources().getDimensionPixelSize(2131427626);
        int m = getResources().getDimensionPixelSize(2131427625);
        localObject2 = getWindowManager().getDefaultDisplay();
        k = ((Display)localObject2).getHeight() / 2 - i - j - k / 2 - m;
        if (((Display)localObject2).getHeight() > 0)
        {
          m = k;
          if (k > 0);
        }
        else
        {
          m = getResources().getDimensionPixelSize(2131427610);
        }
        ((ExdeviceProfileListHeader)localObject1).setMinimumHeight(m);
        ((ExdeviceProfileListHeader)localObject1).setMinimumWidth(((Display)localObject2).getWidth());
        ((ExdeviceProfileListHeader)localObject1).setTag(Integer.valueOf(((Display)localObject2).getHeight() / 2 - i - j));
        this.lBV = ((ExdeviceProfileListHeader)localObject1);
        this.lBU.addHeaderView(this.lBV, null, false);
        this.lBY = new a(this.mController.ylL, this.mAppName, this.lBt, this.igi);
        this.lBY.lBs = this;
        this.lBU.setAdapter(this.lBY);
        this.lBU.setOnScrollListener(new ExdeviceProfileUI.9(this));
        this.lBS.setUsername(this.igi);
        this.lBZ.setOnClickListener(new ExdeviceProfileUI.10(this));
        paramBundle.setCanOverScrool(false);
        paramBundle = new RelativeLayout.LayoutParams(com.tencent.mm.bz.a.gd(this), ((Integer)this.lBV.getTag()).intValue());
        this.lBT.setLayoutParams(paramBundle);
        bpP();
        ad.bpf().a(this);
        aw.Rg().a(new i(this.igi, bo.nullAsNil(this.mAppName), this.lCh), 0);
      }
      try
      {
        this.eOf = getResources().getDimensionPixelSize(2131427635);
        if (this.eOf <= 0)
          this.eOf = 60;
        ab.d("MicroMsg.Sport.ExdeviceProfileUI", "ap: ellipsizeWidth: %s", new Object[] { Integer.valueOf(this.eOf) });
        if (this.lBt)
        {
          paramBundle = getString(2131299360);
          M(paramBundle);
          setBackBtn(new ExdeviceProfileUI.28(this));
          ab.i("MicroMsg.Sport.ExdeviceProfileUI", "mUsername:" + this.igi);
          if (r.Yz().equals(this.igi))
          {
            paramBundle = new sd();
            paramBundle.cOe.action = 3;
            com.tencent.mm.sdk.b.a.xxA.a(paramBundle, com.tencent.mm.sdk.g.d.xDG.cin());
          }
          AppMethodBeat.o(20062);
          return;
          bool = false;
          continue;
          j = getResources().getDimensionPixelSize(2131427563);
          break label450;
        }
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.Sport.ExdeviceProfileUI", paramBundle, "", new Object[0]);
          if (this.eOf <= 0)
            this.eOf = 60;
        }
      }
      finally
      {
        if (this.eOf <= 0)
          this.eOf = 60;
        AppMethodBeat.o(20062);
      }
    }
    paramBundle = this.igi;
    int j = this.eOf;
    Object localObject1 = s.mJ(paramBundle);
    if ((paramBundle.equalsIgnoreCase((String)localObject1)) && (!bo.isNullOrNil(this.lBO)));
    for (paramBundle = j.b(this.mController.ylL, this.lBO); ; paramBundle = j.b(this.mController.ylL, (CharSequence)localObject1))
    {
      localObject1 = TextUtils.ellipsize(paramBundle, this.oz, j, TextUtils.TruncateAt.END);
      ab.d("MicroMsg.Sport.ExdeviceProfileUI", " width: %d, ap: username %s, ellipseize username %s", new Object[] { Integer.valueOf(j), paramBundle, localObject1 });
      paramBundle = j.b(this, getString(2131299364, new Object[] { localObject1 }));
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20068);
    if (this.lCq != null)
      aw.Rg().c(this.lCq);
    this.lCr.dead();
    this.UP = true;
    super.onDestroy();
    ad.bpf().b(this);
    AppMethodBeat.o(20068);
  }

  public void onPause()
  {
    AppMethodBeat.i(20065);
    super.onPause();
    AppMethodBeat.o(20065);
  }

  public void onResume()
  {
    AppMethodBeat.i(20066);
    super.onResume();
    ab.v("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI: onResume");
    bpM();
    bpN();
    if (!this.lBt)
    {
      ad.boY().Kp(this.igi);
      bpO();
    }
    AppMethodBeat.o(20066);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI
 * JD-Core Version:    0.6.2
 */