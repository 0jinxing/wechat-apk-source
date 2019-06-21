package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.statusbar.c.a;
import com.tencent.mm.ui.statusbar.d;

public class SnsUserUI extends MMActivity
  implements h.a
{
  private long eEO;
  private int ehv;
  private long fAq;
  private com.tencent.mm.sdk.b.c hAA;
  private String igi;
  private com.tencent.matrix.trace.e.b mnM;
  private View plv;
  private c.a plx;
  private as rCS;
  private SnsUIAction rCT;
  private am.a rCU;
  private SnsUIAction.a rCV;
  private RelativeLayout rCW;
  private TextView rCX;
  private int rCY;
  private Runnable rCZ;
  private boolean rjn;
  private String ryC;
  private boolean ryD;
  private int ryE;
  private boolean ryx;
  private MenuItem.OnMenuItemClickListener rzm;

  public SnsUserUI()
  {
    AppMethodBeat.i(39814);
    this.ryx = false;
    this.rCW = null;
    this.rCX = null;
    this.rCY = 0;
    this.rCZ = new SnsUserUI.1(this);
    this.eEO = 0L;
    this.fAq = 0L;
    this.mnM = new SnsUserUI.14(this);
    this.rzm = new SnsUserUI.7(this);
    this.hAA = new SnsUserUI.10(this);
    AppMethodBeat.o(39814);
  }

  private void cuG()
  {
    AppMethodBeat.i(39824);
    if (com.tencent.mm.r.a.bH(this))
      AppMethodBeat.o(39824);
    while (true)
    {
      return;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 18, "", "");
      ab.d("MicroMsg.SnsUserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
      if (!bool)
      {
        AppMethodBeat.o(39824);
      }
      else
      {
        bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.RECORD_AUDIO", 18, "", "");
        ab.d("MicroMsg.SnsUserUI", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this });
        if (!bool)
        {
          AppMethodBeat.o(39824);
        }
        else
        {
          Intent localIntent = new Intent();
          n.G(this.mController.ylL, localIntent);
          AppMethodBeat.o(39824);
        }
      }
    }
  }

  public final void a(boolean paramBoolean1, String paramString1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39822);
    af.bCo().removeCallbacks(this.rCZ);
    String str;
    if (this.rCS != null)
    {
      this.rCS.rvv = paramBoolean2;
      this.rCS.rmL = paramString1;
      str = this.rCS.lQD;
      if (paramString1.compareTo(str) < 0)
      {
        ab.i("MicroMsg.SnsUserUI", "onNpAddSize addsize %s %s", new Object[] { paramString1, str });
        this.rCS.ctK();
        this.rCS.crP();
      }
    }
    else
    {
      if ((!paramBoolean3) || (this.ryC.equals(this.igi)))
        break label161;
      this.rCT.koC = true;
      this.rCT.bf(paramInt, paramString2);
      AppMethodBeat.o(39822);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SnsUserUI", "onNpAddSize addsize passed %s %s", new Object[] { paramString1, str });
      break;
      label161: if ((this.ryC.equals(this.igi)) && (paramLong != 0L))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xQk, Long.valueOf(paramLong));
        this.rCS.kI(paramLong);
      }
      this.rCT.koC = paramBoolean1;
      if (paramBoolean1)
        this.rCT.lc(false);
      AppMethodBeat.o(39822);
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, boolean paramBoolean3, boolean paramBoolean4, int paramInt, long paramLong, String paramString2)
  {
    AppMethodBeat.i(39821);
    String str;
    if (this.rCS != null)
    {
      this.rCS.rmL = paramString1;
      str = this.rCS.lQD;
      if (paramString1.compareTo(str) < 0)
      {
        ab.i("MicroMsg.SnsUserUI", "onFpSetSize addsize %s %s isNeedNP %s", new Object[] { paramString1, str, Boolean.valueOf(paramBoolean1) });
        this.rCS.ctK();
        this.rCS.crP();
      }
    }
    else
    {
      if (((!paramBoolean4) && (bo.isNullOrNil(paramString2))) || (this.ryC.equals(this.igi)))
        break label180;
      this.rCT.koC = true;
      this.rCT.bf(paramInt, paramString2);
    }
    while (true)
    {
      if (paramBoolean3)
        this.rCT.qQt.cti();
      AppMethodBeat.o(39821);
      return;
      ab.i("MicroMsg.SnsUserUI", "onFpSetSize addsize passed %s %s isNeedNP %s", new Object[] { paramString1, str, Boolean.valueOf(paramBoolean1) });
      break;
      label180: if ((this.ryC.equals(this.igi)) && (paramLong != 0L))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xQk, Long.valueOf(paramLong));
        this.rCS.kI(paramLong);
      }
      this.rCT.koC = paramBoolean2;
      if (paramBoolean2)
        this.rCT.lc(false);
      else if (paramBoolean1)
        this.rCU.b(this.rCV.getType(), this.igi, this.rjn, this.ryE);
    }
  }

  public final int getLayoutId()
  {
    return 2130970795;
  }

  public final void initView()
  {
    AppMethodBeat.i(39820);
    this.rCW = ((RelativeLayout)findViewById(2131827839));
    this.rCX = ((TextView)findViewById(2131827840));
    this.rCW.post(new SnsUserUI.15(this));
    this.rCS = new as(this, new SnsUserUI.16(this), this.igi, new SnsUserUI.17(this));
    this.rCT.nDp.setAdapter(this.rCS);
    this.rCT.nDp.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
      }
    });
    this.rCT.nDp.postDelayed(new SnsUserUI.2(this), 500L);
    setBackBtn(this.rzm, 2131230737);
    AppMethodBeat.o(39820);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39827);
    ab.i("MicroMsg.SnsUserUI", "on activity result, %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((5985 == paramInt1) && (paramInt2 == -1))
    {
      finish();
      AppMethodBeat.o(39827);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      this.rCT.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(39827);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(39825);
    finish();
    AppMethodBeat.o(39825);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39815);
    if (this.mController != null)
      this.mController.aC(2, false);
    this.ylm = true;
    super.onCreate(paramBundle);
    if (!g.RN().QY())
    {
      finish();
      AppMethodBeat.o(39815);
      return;
    }
    this.plv = findViewById(2131820940);
    label76: String str1;
    String str2;
    if ((this.plv == null) || (!com.tencent.mm.ui.statusbar.c.zzP))
    {
      getWindow().getDecorView().setSystemUiVisibility(1280);
      xE(this.mController.ylL.getResources().getColor(2131690597));
      b(new SnsUserUI.11(this), new SnsUserUI.12(this));
      this.rCU = af.cnv();
      this.ryE = getIntent().getIntExtra("sns_source", 0);
      this.igi = getIntent().getStringExtra("sns_userName");
      if (this.igi == null)
        this.igi = "";
      g.RQ();
      this.ryD = ((j)g.K(j.class)).XM().aoJ(this.igi);
      this.ryC = r.Yz();
      this.rjn = this.ryC.equals(this.igi);
      paramBundle = af.cnt();
      str1 = bo.bc(getIntent().getStringExtra("sns_signature"), "");
      str2 = bo.bc(getIntent().getStringExtra("sns_nickName"), "");
      if ((this.igi != null) && (!this.igi.equals("")))
        break label529;
    }
    label529: for (paramBundle = paramBundle.aoO(this.ryC); ; paramBundle = paramBundle.aoO(this.igi))
    {
      String str3 = str2;
      Object localObject = str1;
      if (paramBundle != null)
      {
        str3 = str2;
        localObject = str1;
        if ((int)paramBundle.ewQ > 0)
        {
          localObject = paramBundle.signature;
          str3 = paramBundle.Oi();
          ab.i("MicroMsg.SnsUserUI", "contact:user[%s] id[%d] nickname[%s]", new Object[] { paramBundle.field_username, Integer.valueOf((int)paramBundle.ewQ), str3 });
        }
      }
      this.rCT = new SnsUIAction(this);
      this.rCT.a(this.ryC, this.igi, str3, (String)localObject, this.ryD, this.rjn, this.ryE);
      paramBundle = this.rCT;
      localObject = new SnsUserUI.13(this);
      this.rCV = ((SnsUIAction.a)localObject);
      paramBundle.rBP = ((SnsUIAction.a)localObject);
      this.rCT.onCreate();
      getIntent().setExtrasClassLoader(getClass().getClassLoader());
      initView();
      com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
      AppMethodBeat.o(39815);
      break;
      localObject = com.tencent.mm.ui.statusbar.c.az(this);
      paramBundle = new SnsUserUI.4(this);
      this.plx = paramBundle;
      ((com.tencent.mm.ui.statusbar.c)localObject).a(paramBundle);
      getWindow().getDecorView().requestApplyInsets();
      d.a(getWindow());
      break label76;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39816);
    af.bCo().removeCallbacks(this.rCZ);
    this.ryx = true;
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.u(getIntent());
    if (localb != null)
    {
      localb.update();
      localb.ajK();
    }
    if ((this.rCT != null) && (this.rCT.tipDialog != null))
    {
      this.rCT.tipDialog.dismiss();
      this.rCT.tipDialog = null;
    }
    g.RQ();
    if ((g.RN().QY()) && (this.rCU != null))
      this.rCU.a(this, this.rCV.getType());
    if (this.rCT != null)
      this.rCT.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(39816);
  }

  public void onDrag()
  {
    AppMethodBeat.i(39817);
    super.onDrag();
    AppMethodBeat.o(39817);
  }

  public void onPause()
  {
    AppMethodBeat.i(39819);
    WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSNSUserScrollEnable, this.ehv);
    this.ehv = 0;
    this.rCT.onPause();
    super.onPause();
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      com.tencent.matrix.trace.f.c localc = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localc != null)
        localc.b(this.mnM);
    }
    if (bo.anT() > this.fAq);
    for (long l = bo.anT() - this.fAq; ; l = 1L)
    {
      this.fAq = l;
      WXHardCoderJNI.reportFPS(704, WXHardCoderJNI.hcSNSUserScrollAction, 1, this.eEO, this.fAq);
      this.eEO = 0L;
      this.fAq = 0L;
      AppMethodBeat.o(39819);
      return;
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(39828);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.SnsUserUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(39828);
      return;
    }
    ab.i("MicroMsg.SnsUserUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 18:
    }
    label216: 
    while (true)
    {
      AppMethodBeat.o(39828);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cuG();
        AppMethodBeat.o(39828);
        break;
      }
      if ("android.permission.CAMERA".equals(paramArrayOfString[0]));
      for (paramInt = 2131301920; ; paramInt = 2131301928)
      {
        if (paramArrayOfInt[0] == 0)
          break label216;
        h.a(this, getString(paramInt), getString(2131301936), getString(2131300878), getString(2131296868), false, new SnsUserUI.8(this), new SnsUserUI.9(this));
        break;
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(39818);
    this.fAq = bo.anT();
    if ((com.tencent.matrix.a.isInstalled()) && (com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class) != null))
    {
      localObject = ((com.tencent.matrix.trace.a)com.tencent.matrix.a.yK().F(com.tencent.matrix.trace.a.class)).bYx;
      if (localObject != null)
        ((com.tencent.matrix.trace.f.c)localObject).a(this.mnM);
    }
    if (this.rCS != null)
      this.rCS.notifyDataSetChanged();
    setRequestedOrientation(-1);
    if (!this.rjn)
      enableOptionMenu(false);
    while (true)
    {
      setBackBtn(this.rzm, 2131230737);
      if (!this.rjn)
        break;
      setMMTitle(2131303740);
      this.rCT.onResume();
      super.onResume();
      AppMethodBeat.o(39818);
      return;
      b(getString(2131303715), 2131230749, new SnsUserUI.3(this));
    }
    ab.d("MicroMsg.SnsUserUI", "SnsUserUI, userName:%s, title:%s", new Object[] { this.igi, this.rCT.title });
    Object localObject = af.cnt().aoO(this.igi);
    if (localObject != null)
      ab.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is not null");
    for (localObject = ((com.tencent.mm.n.a)localObject).Oj(); ; localObject = this.rCT.title)
    {
      setMMTitle(i.K((CharSequence)localObject));
      break;
      ab.d("MicroMsg.SnsUserUI", "SnsUserUI, contact is null, title:%s", new Object[] { this.rCT.title });
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public boolean supportNavigationSwipeBack()
  {
    AppMethodBeat.i(39826);
    boolean bool = super.supportNavigationSwipeBack();
    AppMethodBeat.o(39826);
    return bool;
  }

  public final void xE(int paramInt)
  {
    AppMethodBeat.i(39823);
    super.xE(paramInt);
    if ((Build.VERSION.SDK_INT >= 21) && (this.plv != null))
    {
      this.plv.setBackgroundColor(getWindow().getStatusBarColor());
      d.a(getWindow());
    }
    AppMethodBeat.o(39823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI
 * JD-Core Version:    0.6.2
 */