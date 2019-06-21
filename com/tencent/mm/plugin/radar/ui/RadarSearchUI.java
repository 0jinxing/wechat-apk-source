package com.tencent.mm.plugin.radar.ui;

import a.f.b.t;
import a.f.b.y;
import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tb;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.radar.b.e.e;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ae;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/ui/RadarSearchUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "()V", "REQUEST_CODE_GDPR_LOCATION_USE_SCENE", "", "mRadarViewController", "Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "getMRadarViewController", "()Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "mRadarViewController$delegate", "Lkotlin/Lazy;", "shouldCheckPermission", "", "getSystemService", "", "name", "", "hideTalkRoomeStatusBar", "", "isHide", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onResumeAfterMPermissionGranted", "radarUsagePlusOne", "Companion", "plugin-radar_release"})
@com.tencent.mm.ui.base.a(19)
public final class RadarSearchUI extends MMBaseActivity
{
  private static final String TAG = "MicroMsg.RadarSearchUI";
  public static final RadarSearchUI.a pCF;
  private boolean gwZ;
  private final a.f pCD;
  private final int pCE;

  static
  {
    AppMethodBeat.i(102991);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(RadarSearchUI.class), "mRadarViewController", "getMRadarViewController()Lcom/tencent/mm/plugin/radar/ui/RadarViewController;")) };
    pCF = new RadarSearchUI.a((byte)0);
    TAG = "MicroMsg.RadarSearchUI";
    AppMethodBeat.o(102991);
  }

  public RadarSearchUI()
  {
    AppMethodBeat.i(103003);
    a.f.b.j.p(this, "receiver$0");
    a.f.a.a locala = (a.f.a.a)new i.a(this);
    this.pCD = a.g.a(a.k.AUn, locala);
    this.gwZ = true;
    this.pCE = 30764;
    AppMethodBeat.o(103003);
  }

  private final RadarViewController cdI()
  {
    AppMethodBeat.i(102992);
    RadarViewController localRadarViewController = (RadarViewController)this.pCD.getValue();
    AppMethodBeat.o(102992);
    return localRadarViewController;
  }

  private final void cdJ()
  {
    AppMethodBeat.i(102995);
    kb(true);
    com.tencent.mm.plugin.radar.b.d locald = com.tencent.mm.plugin.radar.b.d.pBq;
    com.tencent.mm.plugin.radar.b.d.cdx();
    locald = com.tencent.mm.plugin.radar.b.d.pBq;
    com.tencent.mm.plugin.radar.b.d.cdy();
    if ((cdI().getRadarStatus() == e.e.pBM) || (cdI().getRadarStatus() == e.e.pBN))
    {
      cdI().onResume();
      cdI().cdA();
      cdI().getWaveView().cdU();
    }
    AppMethodBeat.o(102995);
  }

  private static void kb(boolean paramBoolean)
  {
    AppMethodBeat.i(103001);
    tb localtb = new tb();
    localtb.cPn.cPo = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localtb);
    AppMethodBeat.o(103001);
  }

  public final Object getSystemService(String paramString)
  {
    AppMethodBeat.i(103002);
    a.f.b.j.p(paramString, "name");
    Object localObject = super.getSystemService(paramString);
    if ((localObject != null) && (a.f.b.j.j("layout_inflater", paramString)))
    {
      paramString = com.tencent.mm.ui.v.a((LayoutInflater)localObject);
      AppMethodBeat.o(103002);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(103002);
      paramString = localObject;
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(102999);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == this.pCE)
      if (paramIntent != null)
      {
        paramIntent = paramIntent.getBundleExtra("result_data");
        if ((paramIntent != null) && (paramIntent.getString("go_next", "").equals("gdpr_auth_location")))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVP, Boolean.TRUE);
          com.tencent.mm.pluginsdk.permission.b.b((Activity)this, "android.permission.ACCESS_COARSE_LOCATION", 64);
          this.gwZ = false;
          AppMethodBeat.o(102999);
        }
      }
    while (true)
    {
      return;
      this.gwZ = true;
      finish();
      AppMethodBeat.o(102999);
      continue;
      this.gwZ = true;
      finish();
      AppMethodBeat.o(102999);
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(102993);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    requestWindowFeature(1);
    setContentView(2130970441);
    paramBundle = cdI();
    Object localObject1 = paramBundle.findViewById(2131826805);
    a.f.b.j.o(localObject1, "findViewById(R.id.radar_main_layer)");
    localObject1 = (RelativeLayout)localObject1;
    Object localObject2 = ((RelativeLayout)localObject1).getLayoutParams();
    if (localObject2 == null)
    {
      paramBundle = new a.v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
      AppMethodBeat.o(102993);
      throw paramBundle;
    }
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localObject2;
    localObject2 = new DisplayMetrics();
    Object localObject3 = paramBundle.getContext();
    if (localObject3 == null)
    {
      paramBundle = new a.v("null cannot be cast to non-null type android.app.Activity");
      AppMethodBeat.o(102993);
      throw paramBundle;
    }
    localObject3 = ((Activity)localObject3).getWindowManager();
    a.f.b.j.o(localObject3, "(context as Activity).windowManager");
    ((WindowManager)localObject3).getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
    localLayoutParams.width = ((DisplayMetrics)localObject2).widthPixels;
    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localLayoutParams);
    localObject1 = paramBundle.getRadarTips();
    ((RadarTipsView)localObject1).getNoviceEducationTips().setOnClickListener((View.OnClickListener)new RadarTipsView.c((RadarTipsView)localObject1));
    localObject2 = paramBundle.getRadarTips();
    ((RadarTipsView)localObject2).pDB = RadarTipsView.pDE;
    localObject1 = d.pCC;
    int i = d.cdH();
    ((RadarTipsView)localObject2).pDt.sendEmptyMessageDelayed(((RadarTipsView)localObject2).pDq, i);
    ((RadarTipsView)localObject2).pDt.sendEmptyMessageDelayed(((RadarTipsView)localObject2).pDp, i + 8000);
    paramBundle.getRadarTips().setPressingDown(true);
    paramBundle.getQuitBtn().setOnClickListener(paramBundle.pDY);
    localObject1 = paramBundle.getQuitBtn().getLayoutParams();
    if (localObject1 == null)
    {
      paramBundle = new a.v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
      AppMethodBeat.o(102993);
      throw paramBundle;
    }
    localObject1 = (RelativeLayout.LayoutParams)localObject1;
    int j = ((RelativeLayout.LayoutParams)localObject1).topMargin;
    i = j;
    if (ae.hD(paramBundle.getContext()))
      i = j + ae.hC(paramBundle.getContext());
    ((RelativeLayout.LayoutParams)localObject1).setMargins(((RelativeLayout.LayoutParams)localObject1).leftMargin, i, ((RelativeLayout.LayoutParams)localObject1).rightMargin, ((RelativeLayout.LayoutParams)localObject1).bottomMargin);
    paramBundle.getQuitBtn().setLayoutParams((ViewGroup.LayoutParams)localObject1);
    localObject1 = paramBundle.getWaveView();
    ((RadarWaveView)localObject1).pEA = ((RadarWaveView)localObject1).findViewById(2131826804);
    ((RadarWaveView)localObject1).pEB = AnimationUtils.loadAnimation(((RadarWaveView)localObject1).getContext(), 2131034239);
    localObject1 = ((RadarWaveView)localObject1).pEB;
    if (localObject1 == null)
      a.f.b.j.dWJ();
    ((Animation)localObject1).setInterpolator((Interpolator)new LinearInterpolator());
    localObject1 = b.a.pCd;
    localObject1 = paramBundle.findViewById(2131826809);
    a.f.b.j.o(localObject1, "findViewById(R.id.self_round_avatar)");
    localObject2 = (ImageView)localObject1;
    localObject1 = r.Yz();
    a.f.b.j.o(localObject1, "ConfigStorageLogic.getUsernameFromUserInfo()");
    b.a.b((ImageView)localObject2, (String)localObject1);
    paramBundle.getMemberDetailView().setListener((RadarMemberView.b)new RadarViewController.e(paramBundle));
    localObject2 = paramBundle.getGrid();
    localObject1 = paramBundle.getContext();
    a.f.b.j.o(localObject1, "context");
    paramBundle.pDV = new RadarViewController.c(paramBundle, (RadarSpecialGridView)localObject2, (Context)localObject1);
    paramBundle.getGrid().setOnItemClickListener((RadarSpecialGridView.a)new RadarViewController.h(paramBundle));
    localObject1 = cdI();
    paramBundle = ((RadarViewController)localObject1).pDU;
    localObject2 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject2, "service(IMessengerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject2).XM().a((n.b)paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)paramBundle.pAO);
    localObject2 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class);
    a.f.b.j.o(localObject2, "plugin(IPluginMessengerFoundation::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)localObject2).getSysCmdMsgExtension().a("addcontact", (bz.a)paramBundle.pAP, true);
    paramBundle = ((RadarViewController)localObject1).pDT;
    if (paramBundle == null)
      a.f.b.j.avw("radarManager");
    com.tencent.mm.kernel.g.Rg().a(425, (com.tencent.mm.ai.f)paramBundle);
    com.tencent.mm.kernel.g.Rg().a(602, (com.tencent.mm.ai.f)paramBundle);
    paramBundle = com.tencent.mm.kernel.g.RP().Ry().get(229377, Integer.valueOf(0));
    if (paramBundle == null)
    {
      paramBundle = new a.v("null cannot be cast to non-null type kotlin.Int");
      AppMethodBeat.o(102993);
      throw paramBundle;
    }
    i = ((Integer)paramBundle).intValue();
    com.tencent.mm.kernel.g.RP().Ry().set(229377, Integer.valueOf(i + 1));
    AppMethodBeat.o(102993);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(102998);
    Object localObject1 = cdI();
    Object localObject2 = ((RadarViewController)localObject1).pDU;
    Object localObject3 = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject3, "service(IMessengerStorage::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject3).XM().b((n.b)localObject2);
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)((com.tencent.mm.plugin.radar.b.c)localObject2).pAO);
    localObject3 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class);
    a.f.b.j.o(localObject3, "plugin(IPluginMessengerFoundation::class.java)");
    ((com.tencent.mm.plugin.messenger.foundation.a.p)localObject3).getSysCmdMsgExtension().b("addcontact", (bz.a)((com.tencent.mm.plugin.radar.b.c)localObject2).pAP, true);
    localObject2 = ((RadarViewController)localObject1).pDT;
    if (localObject2 == null)
      a.f.b.j.avw("radarManager");
    com.tencent.mm.kernel.g.Rg().b(425, (com.tencent.mm.ai.f)localObject2);
    com.tencent.mm.kernel.g.Rg().b(602, (com.tencent.mm.ai.f)localObject2);
    ((com.tencent.mm.plugin.radar.b.e)localObject2).stop();
    localObject3 = ((com.tencent.mm.plugin.radar.b.e)localObject2).fwu;
    if (localObject3 != null)
      ((com.tencent.mm.modelgeo.d)localObject3).c(((com.tencent.mm.plugin.radar.b.e)localObject2).ecy);
    localObject1 = ((RadarViewController)localObject1).getWaveView();
    try
    {
      localObject2 = ((RadarWaveView)localObject1).pEz;
      if (localObject2 != null)
      {
        ((MediaPlayer)localObject2).stop();
        ((MediaPlayer)localObject2).release();
      }
      ((RadarWaveView)localObject1).pEz = null;
      super.onDestroy();
      AppMethodBeat.o(102998);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(RadarWaveView.TAG, (Throwable)localException, "", new Object[0]);
        ab.e(RadarWaveView.TAG, "stop() crash, because of the native mediaplay is null.");
        ((RadarWaveView)localObject1).pEz = null;
      }
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(103000);
    a.f.b.j.p(paramKeyEvent, "event");
    boolean bool = cdI().onKeyDown(paramInt, paramKeyEvent);
    if (bool)
      AppMethodBeat.o(103000);
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(103000);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(102997);
    super.onPause();
    kb(false);
    Object localObject1 = com.tencent.mm.plugin.radar.b.d.pBq;
    long l1;
    if (com.tencent.mm.plugin.radar.b.d.pBm != 0L)
    {
      l1 = com.tencent.mm.plugin.radar.b.d.cdz() - com.tencent.mm.plugin.radar.b.d.pBm;
      localObject1 = d.pCC;
      if (d.jz(l1))
        break label441;
    }
    label441: for (int i = 1; ; i = 0)
    {
      Object localObject2;
      if (i != 0)
      {
        i = com.tencent.mm.plugin.radar.b.d.cEX;
        ab.d(com.tencent.mm.plugin.radar.b.d.TAG, "FoundFriendsCnt %d", new Object[] { Integer.valueOf(i) });
        localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject2 = y.AVH;
        localObject2 = String.format("%d", Arrays.copyOf(new Object[] { Integer.valueOf(i) }, 1));
        a.f.b.j.o(localObject2, "java.lang.String.format(format, *args)");
        ((com.tencent.mm.plugin.report.service.h)localObject1).X(10679, (String)localObject2);
        com.tencent.mm.plugin.radar.b.d.pBj += 1;
        com.tencent.mm.plugin.radar.b.d.pBk = l1 + com.tencent.mm.plugin.radar.b.d.pBk;
        com.tencent.mm.plugin.radar.b.d.pBm = 0L;
      }
      localObject1 = com.tencent.mm.plugin.radar.b.d.pBq;
      if (com.tencent.mm.plugin.radar.b.d.pBl != 0L)
      {
        l1 = System.currentTimeMillis();
        long l2 = com.tencent.mm.plugin.radar.b.d.pBl;
        i = com.tencent.mm.plugin.radar.b.d.pBj;
        float f1 = (float)com.tencent.mm.plugin.radar.b.d.pBk * 1.0F / 1000.0F;
        int j = com.tencent.mm.plugin.radar.b.d.pBn;
        float f2 = (float)(l1 - l2) * 1.0F / 1000.0F;
        ab.d(com.tencent.mm.plugin.radar.b.d.TAG, "RadarAddFriendStat %d,%d,%s,%d,%s", new Object[] { Integer.valueOf(1), Integer.valueOf(i), Float.valueOf(f1), Integer.valueOf(j), Float.valueOf(f2) });
        localObject1 = com.tencent.mm.plugin.report.service.h.pYm;
        localObject2 = y.AVH;
        localObject2 = String.format("%d,%d,%s,%d,%s", Arrays.copyOf(new Object[] { Integer.valueOf(1), Integer.valueOf(i), Float.valueOf(f1), Integer.valueOf(j), Float.valueOf(f2) }, 5));
        a.f.b.j.o(localObject2, "java.lang.String.format(format, *args)");
        ((com.tencent.mm.plugin.report.service.h)localObject1).X(10676, (String)localObject2);
      }
      if ((cdI().getRadarStatus() == e.e.pBM) || (cdI().getRadarStatus() == e.e.pBN))
      {
        localObject1 = cdI().pDT;
        if (localObject1 == null)
          a.f.b.j.avw("radarManager");
        ((com.tencent.mm.plugin.radar.b.e)localObject1).cdB();
        localObject1 = cdI().pDT;
        if (localObject1 == null)
          a.f.b.j.avw("radarManager");
        localObject2 = ((com.tencent.mm.plugin.radar.b.e)localObject1).fwu;
        if (localObject2 != null)
          ((com.tencent.mm.modelgeo.d)localObject2).c(((com.tencent.mm.plugin.radar.b.e)localObject1).ecy);
        cdI().getWaveView().cdV();
      }
      AppMethodBeat.o(102997);
      return;
    }
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(102996);
    a.f.b.j.p(paramArrayOfString, "permissions");
    a.f.b.j.p(paramArrayOfInt, "grantResults");
    if (paramArrayOfInt.length <= 0)
    {
      paramArrayOfString = TAG;
      paramArrayOfInt = Thread.currentThread();
      a.f.b.j.o(paramArrayOfInt, "Thread.currentThread()");
      ab.i(paramArrayOfString, "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramArrayOfInt.getId()) });
      AppMethodBeat.o(102996);
      return;
    }
    String str = TAG;
    int i = paramArrayOfInt[0];
    paramArrayOfString = Thread.currentThread();
    a.f.b.j.o(paramArrayOfString, "Thread.currentThread()");
    ab.i(str, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(paramArrayOfString.getId()) });
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(102996);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        cdJ();
        AppMethodBeat.o(102996);
        break;
      }
      this.gwZ = false;
      com.tencent.mm.ui.base.h.a((Context)this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131301921), false, (DialogInterface.OnClickListener)new RadarSearchUI.b(this), (DialogInterface.OnClickListener)new RadarSearchUI.c(this));
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(102994);
    super.onResume();
    if (this.gwZ)
    {
      Object localObject1 = com.tencent.mm.kernel.g.RP();
      a.f.b.j.o(localObject1, "MMKernel.storage()");
      Object localObject2 = ((com.tencent.mm.kernel.e)localObject1).Ry().get(274436);
      localObject1 = localObject2;
      if (!(localObject2 instanceof String))
        localObject1 = null;
      if (com.tencent.mm.au.b.sO((String)localObject1))
      {
        if (com.tencent.mm.pluginsdk.permission.b.o((Context)this, "android.permission.ACCESS_COARSE_LOCATION"))
          break label236;
        localObject1 = com.tencent.mm.kernel.g.RP();
        a.f.b.j.o(localObject1, "MMKernel.storage()");
        localObject1 = ((com.tencent.mm.kernel.e)localObject1).Ry().get(ac.a.xVP, Boolean.FALSE);
        if (localObject1 == null)
        {
          localObject1 = new a.v("null cannot be cast to non-null type kotlin.Boolean");
          AppMethodBeat.o(102994);
          throw ((Throwable)localObject1);
        }
        if (!((Boolean)localObject1).booleanValue())
        {
          com.tencent.mm.plugin.account.a.b.a.b((Context)this, getString(2131305910, new Object[] { aa.dor() }), this.pCE, true);
          AppMethodBeat.o(102994);
        }
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.pluginsdk.permission.b.b((Activity)this, "android.permission.ACCESS_COARSE_LOCATION", 64);
      AppMethodBeat.o(102994);
      continue;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      ab.i(TAG, "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        AppMethodBeat.o(102994);
      }
      else
      {
        label236: cdJ();
        AppMethodBeat.o(102994);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarSearchUI
 * JD-Core Version:    0.6.2
 */