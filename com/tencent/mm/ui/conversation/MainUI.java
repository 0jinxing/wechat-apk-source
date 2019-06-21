package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.g.a.st;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.FLock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.AbstractTabChildActivity.AbStractTabFragment;
import com.tencent.mm.ui.HomeUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.q;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MainUI extends AbstractTabChildActivity.AbStractTabFragment
  implements k.a
{
  private View iVx;
  public MMFragmentActivity iWA;
  private View jcl;
  private int[] mkD;
  private h zrd;
  private a zuL;
  public ConversationListView zuW;
  private View zuX;
  private View zuY;
  private TextView zuZ;
  private k zva;
  private d zvb;
  private n zvc;
  private l zvd;
  public com.tencent.mm.plugin.appbrand.widget.header.a zve;
  private MainUI.a zvf;

  public MainUI()
  {
    AppMethodBeat.i(34505);
    this.zuL = new a();
    this.zva = new k();
    this.zvb = new d();
    this.zvc = new n();
    this.zvd = new l();
    this.mkD = new int[2];
    this.jcl = null;
    AppMethodBeat.o(34505);
  }

  private void Px(int paramInt)
  {
    AppMethodBeat.i(34509);
    ViewGroup.LayoutParams localLayoutParams = this.zuW.getLayoutParams();
    Object localObject = localLayoutParams;
    if (localLayoutParams == null)
      localObject = new RelativeLayout.LayoutParams(-1, -2);
    if ((localObject instanceof RelativeLayout.LayoutParams))
    {
      ab.i("MicroMsg.MainUI", "alvinluo setListMargin topMargin: %d", new Object[] { Integer.valueOf(paramInt) });
      ((RelativeLayout.LayoutParams)localObject).topMargin = paramInt;
      this.zuW.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if (this.iVx != null)
      this.iVx.getLayoutParams().height = paramInt;
    AppMethodBeat.o(34509);
  }

  public final void Nj(int paramInt)
  {
    AppMethodBeat.i(34516);
    if (this.zrd != null)
      this.zrd.Pv(paramInt);
    AppMethodBeat.o(34516);
  }

  public final void dHz()
  {
    AppMethodBeat.i(34511);
    if (this.zrd != null)
      this.zrd.dHz();
    AppMethodBeat.o(34511);
  }

  public final void dIR()
  {
    if (this.zrd != null)
      this.zrd.nNp = true;
  }

  public final void dIS()
  {
    AppMethodBeat.i(34527);
    if (this.zrd != null)
    {
      this.zrd.nNp = false;
      this.zrd.dIH();
      if (thisActivity() != null)
        this.zvb.ax(getActivity());
    }
    AppMethodBeat.o(34527);
  }

  public final void dIT()
  {
    AppMethodBeat.i(34514);
    if (this.zrd != null)
      this.zrd.onResume();
    AppMethodBeat.o(34514);
  }

  public final void dIU()
  {
    AppMethodBeat.i(34515);
    if (this.zrd != null)
      this.zrd.onPause();
    AppMethodBeat.o(34515);
  }

  public final void dvY()
  {
    AppMethodBeat.i(34513);
    ab.i("MicroMsg.MainUI", "onTabCreate, %d", new Object[] { Integer.valueOf(hashCode()) });
    if (this.mController != null)
      this.mController.aC(4, false);
    ab.i("MicroMsg.MainUI", "mainUIOnCreate");
    long l = System.currentTimeMillis();
    setMenuVisibility(true);
    aw.RS().doM();
    ab.i("MicroMsg.MainUI", "main ui init view");
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.zuW != null)
    {
      localObject1 = this.zuL;
      if (((a)localObject1).zqz != null)
      {
        ((a)localObject1).ft(((a)localObject1).zqr);
        ((a)localObject1).ft(((a)localObject1).zqs);
        ((a)localObject1).ft(((a)localObject1).zqt);
        ((a)localObject1).ft(((a)localObject1).zqu);
        localObject2 = ((a)localObject1).zqv.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next();
          if ((localObject3 != null) && (((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView() != null))
            ((a)localObject1).zqz.removeFooterView(((com.tencent.mm.pluginsdk.ui.b.b)localObject3).getView());
        }
      }
    }
    this.zuZ = ((TextView)findViewById(2131825719));
    this.zuW = ((ConversationListView)findViewById(2131825718));
    this.iVx = findViewById(2131825717);
    this.zuW.setStatusBarMaskView(this.iVx);
    int i;
    int j;
    if (this.zuW != null)
    {
      i = ak.J(getContext(), -1);
      j = com.tencent.mm.pluginsdk.f.de(this.zuW.getContext());
      ab.i("MicroMsg.MainUI", "alvinluo initListViewPadding actionBarHeight: %d, statusBarHeight: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      localObject3 = new MainUI.9(this);
      if (i <= 0)
        this.zuW.post((Runnable)localObject3);
    }
    else
    {
      localObject3 = (com.tencent.mm.plugin.appbrand.widget.recentview.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.widget.recentview.d.class);
      if (localObject3 != null)
        break label1522;
      ab.e("MicroMsg.MainUI", "alvinluo addDynamicBackgroundView service is null");
      label341: this.zuW.setDrawingCacheEnabled(false);
      this.zuW.setScrollingCacheEnabled(false);
      this.zuY = findViewById(2131825716);
      localObject2 = this.zuW;
      localObject3 = this.zuX;
      localObject1 = this.zuY;
      ((ConversationListView)localObject2).zsr = ((View)localObject3);
      if (((ConversationListView)localObject2).iVo != null)
        ((ConversationListView)localObject2).iVo.e((View)localObject3, (View)localObject1);
      this.zrd = new h(getContext(), this.zuW, new MainUI.4(this));
      this.zrd.setGetViewPositionCallback(new MainUI.5(this));
      this.zrd.setPerformItemClickListener(new MainUI.6(this));
      if (!com.tencent.mm.compatible.util.d.iX(18))
        break label1619;
      com.tencent.mm.blink.b.HQ().o(new MainUI.7(this));
      label490: localObject3 = this.zvd;
      localObject2 = this.zuW;
      localObject1 = this.zrd;
      ((l)localObject3).zqz = ((ListView)localObject2);
      ((l)localObject3).zrd = ((h)localObject1);
      ((ListView)localObject2).setOnScrollListener(((l)localObject3).ein);
      ((h)localObject1).zro = ((l)localObject3).ein;
      al.d(new l.2((l)localObject3));
      this.zvb.ax(getActivity());
      this.zuW.setAdapter(this.zrd);
      this.zuW.setOnItemClickListener(new f(this.zrd, this.zuW, getActivity()));
      this.zuW.setOnItemLongClickListener(new g(this.zrd, this.zuW, getActivity(), this.mkD));
      this.zuW.setonDispatchTouchEventListener(new MainUI.8(this));
      if (this.zve != null)
        this.zuW.setActionBarUpdateCallback(this.zve);
      if (this.iWA != null)
        this.zuW.setActivity(this.iWA);
      if (this.zvf != null)
        i(this.zvf.cui, this.zvf.zvi, this.zvf.zvj);
      this.zuW.setSelection(0);
      localObject3 = this.zva;
      localObject2 = getActivity();
      localObject1 = this.zuL;
      ((k)localObject3).czX = ((Activity)localObject2);
      ((k)localObject3).zuL = ((a)localObject1);
      ((k)localObject3).zuM = this;
      ((k)localObject3).gWO = new WeakReference(localObject2);
      ((k)localObject3).wakeLock = ((PowerManager)((Activity)localObject2).getSystemService("power")).newWakeLock(26, "NetSceneInit Lock");
      aw.Rg().a(-1, (com.tencent.mm.ai.f)localObject3);
      ((k)localObject3).zuI = false;
      com.tencent.mm.sdk.b.a.xxA.c(((k)localObject3).zuN);
      com.tencent.mm.sdk.b.a.xxA.c(((k)localObject3).zuO);
      localObject2 = new File(com.tencent.mm.sdk.platformtools.ah.getContext().getFilesDir(), "DBRecoverStarted");
      if (((File)localObject2).exists())
      {
        com.tencent.mm.plugin.report.e.pXa.g("DBRepair", "Last recovery interrupted.", null);
        ((File)localObject2).delete();
      }
      ((k)localObject3).zuP = new FLock(new File(com.tencent.mm.sdk.platformtools.ah.getContext().getFilesDir(), "MMStarted"));
      if (!((k)localObject3).zuP.dob())
        break label1641;
      ((k)localObject3).zuP.unlock();
      ab.i("MicroMsg.DuplicateDetect", "No data multiple instance detected.");
    }
    while (true)
    {
      ((k)localObject3).zuP.lockRead();
      Object localObject4 = this.zvb;
      localObject3 = this.zrd;
      localObject1 = this.zuW;
      localObject2 = getActivity();
      ((d)localObject4).zrd = ((h)localObject3);
      ((d)localObject4).zqz = ((ListView)localObject1);
      ((d)localObject4).activity = ((Activity)localObject2);
      com.tencent.mm.sdk.b.a.xxA.c(((d)localObject4).zrg);
      com.tencent.mm.sdk.b.a.xxA.c(((d)localObject4).zre);
      com.tencent.mm.sdk.b.a.xxA.c(((d)localObject4).zrf);
      localObject4 = this.zvc;
      localObject3 = this.zrd;
      localObject1 = this.zuW;
      localObject2 = getActivity();
      ((n)localObject4).zrd = ((h)localObject3);
      ((n)localObject4).czX = ((Activity)localObject2);
      ((n)localObject4).zuW = ((ConversationListView)localObject1);
      if (((n)localObject4).kTz == null)
        ((n)localObject4).kTz = new n.3((n)localObject4, new n.1((n)localObject4));
      if (((n)localObject4).zvz == null)
        ((n)localObject4).zvz = new n.4((n)localObject4);
      if (((n)localObject4).zvA == null)
        ((n)localObject4).zvA = new n.5((n)localObject4, (ConversationListView)localObject1);
      com.tencent.mm.sdk.b.a.xxA.c(((n)localObject4).kTz);
      com.tencent.mm.sdk.b.a.xxA.c(((n)localObject4).zvz);
      com.tencent.mm.sdk.b.a.xxA.c(((n)localObject4).zvA);
      ((n)localObject4).jQs = new n.6((n)localObject4);
      Looper.myQueue().addIdleHandler(((n)localObject4).jQs);
      ((ConversationListView)localObject1).post(new n.7((n)localObject4));
      localObject3 = o.ahn();
      ab.i("MicroMsg.AutoGetBigImgLogic", "chattingMaskResId change from " + ((com.tencent.mm.at.b)localObject3).fCX + " to 2130838182");
      ((com.tencent.mm.at.b)localObject3).fCX = 2130838182;
      aw.ZG();
      aw.ZK();
      c.XR().a(this.zrd);
      aw.ZK();
      c.XM().a(this.zrd);
      localObject3 = this.zrd;
      if (((h)localObject3).zrt == null)
        ((h)localObject3).zrt = new h.2((h)localObject3);
      com.tencent.mm.sdk.b.a.xxA.c(((h)localObject3).zrt);
      this.zrd.ztz = new h.b()
      {
        public final void dIJ()
        {
          AppMethodBeat.i(34492);
          MainUI.a(MainUI.this).clearCache();
          aw.ZK();
          c.XR().a(MainUI.a(MainUI.this));
          aw.ZK();
          c.XM().a(MainUI.a(MainUI.this));
          AppMethodBeat.o(34492);
        }
      };
      localObject3 = this.zrd;
      localObject2 = (com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class);
      if ((localObject2 != null) && (((com.tencent.mm.plugin.forcenotify.a.b)localObject2).bxV() != null))
        ((com.tencent.mm.plugin.forcenotify.a.b)localObject2).bxV().c(((h)localObject3).yql);
      l = com.tencent.mm.platformtools.ah.gb(l);
      aw.ZK();
      ab.i("MicroMsg.MainUI", "kevin mainUIOnCreate time:%d uin:%d ver:%x", new Object[] { Long.valueOf(l), Integer.valueOf(c.QF()), Integer.valueOf(com.tencent.mm.protocal.d.vxo) });
      this.zuW.postDelayed(new MainUI.10(this), 200L);
      AppMethodBeat.o(34513);
      return;
      Px(i + j);
      ab.i("MicroMsg.MainUI", "[trySetListViewMargin] statusHeight: %s, actionBarHeight: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      this.zuW.postDelayed((Runnable)localObject3, 100L);
      break;
      label1522: ((com.tencent.mm.plugin.appbrand.widget.recentview.d)localObject3).aOE();
      if (!((com.tencent.mm.plugin.appbrand.widget.recentview.d)localObject3).aOF())
        break label341;
      this.zuX = ((com.tencent.mm.plugin.appbrand.widget.recentview.d)localObject3).dg(getContext());
      if ((this.zuX == null) || (!(this.jcl instanceof ViewGroup)))
        break label341;
      ab.i("MicroMsg.MainUI", "alvinluo addDynamicBackgroundView");
      localObject3 = new ViewGroup.LayoutParams(-1, -1);
      this.zuX.setVisibility(8);
      ((ViewGroup)this.jcl).addView(this.zuX, 0, (ViewGroup.LayoutParams)localObject3);
      break label341;
      label1619: this.zuL.a(getContext(), this.zuW, this.zuZ);
      break label490;
      label1641: ab.w("MicroMsg.DuplicateDetect", "Data multiple instance detected.");
      com.tencent.mm.plugin.report.e.pXa.a(579L, 0L, 1L, true);
    }
  }

  public final void dvZ()
  {
    AppMethodBeat.i(34517);
    ab.i("MicroMsg.MainUI", "onTabResume");
    long l = com.tencent.mm.platformtools.ah.anU();
    Object localObject = this.zvb;
    if (((d)localObject).zrc < 0)
    {
      ab.d("MicroMsg.ConvUnreadHelper", "onTabResume totalUnReadCount %d", new Object[] { Integer.valueOf(((d)localObject).zrc) });
      if (((d)localObject).zrd != null)
        ((d)localObject).zrd.dIH();
    }
    dIT();
    com.tencent.mm.blink.b.HQ().o(new MainUI.11(this));
    ab.d("MicroMsg.MainUI", "start time check dkinit KEVIN mainui TestTimeLayoutTime onTabResume:%d", new Object[] { Long.valueOf(com.tencent.mm.platformtools.ah.gb(l)) });
    localObject = this.zvc;
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.a((com.tencent.mm.bg.a)localObject);
    al.d(new n.8((n)localObject));
    m.hY(((n)localObject).czX);
    if ((((n)localObject).czX != null) && (((n)localObject).czX.getIntent() != null) && (((n)localObject).czX.getIntent().getBooleanExtra("resend_fail_messages", false)))
    {
      al.n(new n.9((n)localObject), 500L);
      ((n)localObject).czX.getIntent().putExtra("resend_fail_messages", false);
    }
    LauncherUI localLauncherUI = (LauncherUI)((n)localObject).czX;
    if (localLauncherUI != null)
      localLauncherUI.getHomeUI().setTitleBarDoubleClickListener(((n)localObject).zky);
    if ((w.a(((n)localObject).czX.getIntent(), "Main_ListToTop", false)) && (((n)localObject).zuW != null))
      ((n)localObject).zuW.post(new n.2((n)localObject));
    w.b(((n)localObject).czX.getIntent(), "Main_ListToTop", false);
    localObject = this.zva;
    int i;
    if (((k)localObject).ehJ == null)
      i = -1;
    while (true)
    {
      ab.i("MicroMsg.InitHelper", "onTabResume tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(((k)localObject).dIP()) });
      ((k)localObject).dIN();
      al.n(new k.7((k)localObject), 100L);
      if ((aw.RK()) && (!this.zva.dIQ()))
      {
        com.tencent.mm.sdk.b.a.xxA.a(new st(), Looper.getMainLooper());
        localObject = new sd();
        ((sd)localObject).cOe.action = 4;
        com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject, com.tencent.mm.sdk.g.d.xDG.cin());
      }
      AppMethodBeat.o(34517);
      return;
      if (((k)localObject).ehJ.isShowing())
        i = 1;
      else
        i = 0;
    }
  }

  public final void dwa()
  {
    AppMethodBeat.i(34518);
    ab.i("MicroMsg.MainUI", "onTabStart");
    AppMethodBeat.o(34518);
  }

  public final void dwb()
  {
    AppMethodBeat.i(34519);
    ab.i("MicroMsg.MainUI", "onTabPause");
    com.tencent.mm.blink.b.HQ().o(new MainUI.2(this));
    Object localObject = this.zva;
    if (((k)localObject).wakeLock.isHeld())
    {
      ab.w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
      ((k)localObject).wakeLock.release();
    }
    hideVKB();
    n localn = this.zvc;
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.b(localn);
    m.dIW();
    localObject = (LauncherUI)localn.czX;
    if (localObject != null)
      ((LauncherUI)localObject).getHomeUI().aw(localn.zky);
    dIU();
    AppMethodBeat.o(34519);
  }

  public final void dwc()
  {
    AppMethodBeat.i(34520);
    ab.i("MicroMsg.MainUI", "onTabStop");
    AppMethodBeat.o(34520);
  }

  public final void dwd()
  {
    AppMethodBeat.i(34521);
    ab.i("MicroMsg.MainUI", "onTabDestroy  acc:%b", new Object[] { Boolean.valueOf(aw.RK()) });
    com.tencent.mm.blink.b.HQ().o(new MainUI.3(this));
    Object localObject = this.zva;
    ((k)localObject).zuP.unlock();
    aw.Rg().b(-1, (com.tencent.mm.ai.f)localObject);
    if (((k)localObject).ehJ != null)
    {
      ((k)localObject).ehJ.dismiss();
      ((k)localObject).ehJ = null;
    }
    com.tencent.mm.sdk.b.a.xxA.d(((k)localObject).zuN);
    com.tencent.mm.sdk.b.a.xxA.d(((k)localObject).zuO);
    localObject = this.zvc;
    if (((n)localObject).kTz != null)
    {
      com.tencent.mm.sdk.b.a.xxA.d(((n)localObject).kTz);
      ((n)localObject).kTz = null;
    }
    com.tencent.mm.sdk.b.a.xxA.d(((n)localObject).zvz);
    com.tencent.mm.sdk.b.a.xxA.d(((n)localObject).zvA);
    if (com.tencent.mm.bg.g.fUs != null)
      com.tencent.mm.bg.g.fUs.b((com.tencent.mm.bg.a)localObject);
    if (aw.RK())
      com.tencent.mm.platformtools.ah.anV();
    localObject = this.zvb;
    com.tencent.mm.sdk.b.a.xxA.d(((d)localObject).zrg);
    com.tencent.mm.sdk.b.a.xxA.d(((d)localObject).zre);
    com.tencent.mm.sdk.b.a.xxA.d(((d)localObject).zrf);
    ((d)localObject).activity = null;
    if ((aw.RK()) && (this.zrd != null))
    {
      aw.ZK();
      c.XR().b(this.zrd);
      aw.ZK();
      c.XM().b(this.zrd);
    }
    if (this.zrd != null)
    {
      localObject = this.zrd;
      if (((h)localObject).zrt != null)
      {
        com.tencent.mm.sdk.b.a.xxA.d(((h)localObject).zrt);
        ((h)localObject).zrt = null;
      }
      this.zrd.ztz = null;
      h localh = this.zrd;
      localh.ztz = null;
      if (localh.yDY != null)
      {
        localh.yDY.clear();
        localh.yDY = null;
      }
      localh.pB(true);
      localh.dww();
      localh.ztC.clear();
      localObject = (com.tencent.mm.plugin.forcenotify.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.forcenotify.a.b.class);
      if ((localObject != null) && (((com.tencent.mm.plugin.forcenotify.a.b)localObject).bxV() != null))
        ((com.tencent.mm.plugin.forcenotify.a.b)localObject).bxV().d(localh.yql);
      ab.i("MicroMsg.ConversationWithCacheAdapter", "clear usernamePositionMap");
    }
    AppMethodBeat.o(34521);
  }

  public final void dwe()
  {
  }

  public final void dwf()
  {
    AppMethodBeat.i(34522);
    ab.i("MicroMsg.MainUI", "turn to bg");
    AppMethodBeat.o(34522);
  }

  public final void dwg()
  {
    AppMethodBeat.i(34523);
    ab.i("MicroMsg.MainUI", "turn to fg");
    AppMethodBeat.o(34523);
  }

  public final void dxc()
  {
    AppMethodBeat.i(34524);
    ab.i("MicroMsg.MainUI", "dkinit onTabSwitchIn");
    k localk = this.zva;
    int i;
    if (localk.ehJ == null)
      i = -1;
    while (true)
    {
      ab.i("MicroMsg.InitHelper", "onTabSwitchIn tip:%d initscene:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(localk.dIP()) });
      if (localk.wakeLock != null)
        localk.dIN();
      if (this.mController != null)
        this.mController.onResume();
      AppMethodBeat.o(34524);
      return;
      if (localk.ehJ.isShowing())
        i = 1;
      else
        i = 0;
    }
  }

  public final void dxd()
  {
    AppMethodBeat.i(34525);
    ab.i("MicroMsg.MainUI", "onTabSwitchOut");
    AppMethodBeat.o(34525);
  }

  public int getLayoutId()
  {
    return 2130970018;
  }

  public View getLayoutView()
  {
    AppMethodBeat.i(34506);
    this.jcl = com.tencent.mm.kiss.a.b.SM().a(getContext(), "R.layout.main", 2130970018);
    View localView = this.jcl;
    AppMethodBeat.o(34506);
    return localView;
  }

  public final void i(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(34510);
    if ((this.zuW instanceof ConversationListView))
    {
      this.zuW.i(paramBoolean1, paramBoolean2, paramBoolean3);
      AppMethodBeat.o(34510);
    }
    while (true)
    {
      return;
      this.zvf = new MainUI.a(this, paramBoolean1, paramBoolean2, paramBoolean3);
      AppMethodBeat.o(34510);
    }
  }

  public boolean noActionBar()
  {
    return true;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(34512);
    super.onConfigurationChanged(paramConfiguration);
    this.zuL.dIn();
    AppMethodBeat.o(34512);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34526);
    ab.i("MicroMsg.MainUI", "onDestroy");
    this.zvd.dIV();
    if (this.zuW != null)
    {
      ConversationListView localConversationListView = this.zuW;
      if (localConversationListView.iVo != null)
        localConversationListView.iVo.onDestroy();
      if (localConversationListView.zrY != null)
        localConversationListView.zrY.onDestroy();
      if (localConversationListView.zsq != null)
        localConversationListView.removeCallbacks(localConversationListView.zsq);
      if (localConversationListView.zsp != null)
        localConversationListView.removeCallbacks(localConversationListView.zsp);
      if (localConversationListView.zso != null)
        localConversationListView.removeCallbacks(localConversationListView.zso);
    }
    super.onDestroy();
    AppMethodBeat.o(34526);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(34528);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
      if ((this.zuW != null) && (this.zuW.dIv()))
      {
        paramKeyEvent = this.zuW;
        ab.i("MicroMsg.ConversationListView", "[closeHeader] delay:%s, type: %d", new Object[] { Long.valueOf(10L), Integer.valueOf(11) });
        if (paramKeyEvent.getFirstVisiblePosition() == 0)
        {
          if (10L > 0L)
          {
            if (paramKeyEvent.zsp != null)
              paramKeyEvent.removeCallbacks(paramKeyEvent.zsp);
            paramKeyEvent.zsp = new ConversationListView.6(paramKeyEvent);
            paramKeyEvent.postDelayed(paramKeyEvent.zsp, 10L);
          }
        }
        else
          AppMethodBeat.o(34528);
      }
    while (true)
    {
      return bool;
      paramKeyEvent.setSelection(0);
      break;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(34528);
      continue;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(34528);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(34508);
    ab.i("MicroMsg.MainUI", "onPause");
    super.onPause();
    if (this.zuW != null)
    {
      ConversationListView localConversationListView = this.zuW;
      if (localConversationListView.iVo != null)
        localConversationListView.iVo.onPause();
    }
    AppMethodBeat.o(34508);
  }

  public void onResume()
  {
    AppMethodBeat.i(34507);
    ab.i("MicroMsg.MainUI", "onResume");
    super.onResume();
    if (this.zuW != null)
    {
      ConversationListView localConversationListView = this.zuW;
      if (localConversationListView.iVo != null)
        localConversationListView.iVo.onResume();
      if ((localConversationListView.zrY != null) && (localConversationListView.zrY.aOV()) && (localConversationListView.iVo.getBottom() < com.tencent.mm.bz.a.fromDPToPix(localConversationListView.getContext(), 100)))
        localConversationListView.e(1.0F, localConversationListView.getResources().getColor(2131689650));
      if (localConversationListView.zrY != null)
        localConversationListView.zrY.onResume();
    }
    AppMethodBeat.o(34507);
  }

  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI
 * JD-Core Version:    0.6.2
 */