package com.tencent.mm.plugin.appbrand.ui.recents;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.FragmentActivity;
import android.support.v7.h.d;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.support.v7.widget.RecyclerView.v;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.plugin.appbrand.appusage.j;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.appusage.w.c;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.plugin.appbrand.ui.d.1;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.n.d;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class AppBrandLauncherRecentsList extends AppBrandLauncherUI.Fragment
{
  private int huR;
  private final com.tencent.mm.sdk.platformtools.al iLa;
  private final r iMA;
  private AppBrandLauncherRecentsList.d iMB;
  private View iMC;
  private View iMD;
  private a iME;
  private e iMF;
  private final p iMG;
  private int iMH;
  private int iMI;
  private boolean iMJ;
  private boolean iMK;
  private String iML;
  private final d iMM;
  private final AppBrandLauncherRecentsList.b iMN;
  private final k.a iMO;
  private final k.a iMP;
  private final k.a iMQ;
  private final k.a iMR;
  private final AppBrandLauncherRecentsList.c iMS;
  private boolean iMT;
  private Dialog iMU;
  private final int iMk;
  private final boolean iMl;
  private final boolean iMm;
  private final boolean iMn;
  private final k iMo;
  private final Bundle iMp;
  private final AtomicLong iMq;
  private final AtomicLong iMr;
  private final AtomicBoolean iMs;
  private final AtomicLong iMt;
  private final AtomicBoolean iMu;
  private LoadMoreRecyclerView iMv;
  private LinearLayoutManager iMw;
  private t iMx;
  private final m iMy;
  private final AppBrandLauncherRecentsList.a iMz;

  public AppBrandLauncherRecentsList()
  {
    this(true);
  }

  @SuppressLint({"ValidFragment"})
  public AppBrandLauncherRecentsList(boolean paramBoolean)
  {
    AppMethodBeat.i(133396);
    this.iMp = new Bundle();
    this.iMq = new AtomicLong(-1L);
    this.iMr = new AtomicLong(-1L);
    this.iMs = new AtomicBoolean(false);
    this.iMt = new AtomicLong(9223372036854775807L);
    this.iMu = new AtomicBoolean(false);
    this.iMy = new m();
    this.iLa = new com.tencent.mm.sdk.platformtools.al("AppBrandLauncherUI#RecentsListUI");
    this.iMz = new AppBrandLauncherRecentsList.a(this);
    this.iMA = new r();
    this.iMG = new p();
    this.iMH = 3;
    this.iMI = 0;
    this.iMJ = false;
    this.iMK = false;
    this.iMM = new AppBrandLauncherRecentsList.15(this);
    this.iMN = new AppBrandLauncherRecentsList.b(this, (byte)0);
    this.iMO = new AppBrandLauncherRecentsList.16(this);
    this.iMP = new AppBrandLauncherRecentsList.17(this);
    this.iMQ = new AppBrandLauncherRecentsList.18(this);
    this.iMR = new AppBrandLauncherRecentsList.19(this);
    this.iMS = new AppBrandLauncherRecentsList.c(this, (byte)0);
    this.iMT = false;
    this.huR = 0;
    this.iMU = null;
    Bundle localBundle = new Bundle(1);
    localBundle.putBoolean("showHeader", paramBoolean);
    setArguments(localBundle);
    this.iMl = com.tencent.mm.plugin.appbrand.appusage.t.axG();
    this.iMm = com.tencent.mm.plugin.appbrand.appusage.t.axH();
    if ((bp.dpL()) && (g.RP().Ry().getBoolean(ac.a.xOa, false)))
    {
      paramBoolean = true;
      this.iMn = paramBoolean;
      this.iMk = com.tencent.mm.plugin.appbrand.appusage.t.axI();
      if ((!this.iMl) || (this.iMm))
        break label377;
    }
    label377: for (paramBoolean = bool; ; paramBoolean = false)
    {
      this.iMo = new k(paramBoolean);
      AppMethodBeat.o(133396);
      return;
      paramBoolean = false;
      break;
    }
  }

  private boolean aNl()
  {
    boolean bool = true;
    AppMethodBeat.i(133397);
    if (this.iMu.get())
      AppMethodBeat.o(133397);
    while (true)
    {
      return bool;
      FragmentActivity localFragmentActivity = getActivity();
      if ((localFragmentActivity == null) || (localFragmentActivity.isFinishing()))
      {
        AppMethodBeat.o(133397);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(133397);
      }
    }
  }

  private void aoX()
  {
    AppMethodBeat.i(133406);
    if (this.iMU != null)
      this.iMU.dismiss();
    this.iMU = null;
    AppMethodBeat.o(133406);
  }

  public final void aMf()
  {
    AppMethodBeat.i(133401);
    if (this.iMv != null)
      this.iMv.smoothScrollToPosition(0);
    AppMethodBeat.o(133401);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(133405);
    getActivity();
    this.iMw = new AppBrandLauncherRecentsList.3(this);
    this.iMw.an(false);
    this.iMv = new AppBrandLauncherRecentsList.4(this, getContext());
    this.iMv.setVerticalScrollBarEnabled(true);
    ((FrameLayout)this.WL).addView(this.iMv, new ViewGroup.LayoutParams(-1, -1));
    this.iMv.b(new AppBrandLauncherRecentsList.g(this, (byte)0));
    this.iMv.setItemAnimator(this.iMG);
    this.iMG.b(this.iMS);
    this.iMG.b(this.iMN);
    Object localObject1 = new t(this.iMy);
    Object localObject2 = new AppBrandLauncherRecentsList.d(this, (byte)0);
    this.iMB = ((AppBrandLauncherRecentsList.d)localObject2);
    ((t)localObject1).iPq.put(AppBrandRecentTaskInfo.class.hashCode(), localObject2);
    this.iMx = ((t)localObject1);
    this.iMx.jR();
    this.iMx.a(this.iMS);
    this.iMv.setAdapter(this.iMx);
    this.iMv.a(new f((byte)0));
    if ((getArguments() != null) && (!getArguments().getBoolean("showHeader", true)))
    {
      getActivity();
      this.iME = new a.1();
    }
    while (true)
    {
      this.iMF = new e(getContext(), this.iMv);
      this.iMF.eJ(true);
      this.iMv.setLoadingView(this.iMF.apJ);
      this.iMv.fh(false);
      this.iMv.setOnLoadingStateChangedListener(new AppBrandLauncherRecentsList.7(this));
      aoX();
      FragmentActivity localFragmentActivity = getActivity();
      localObject2 = View.inflate(localFragmentActivity, 2130968766, null);
      localObject1 = new i(localFragmentActivity, 2131493039);
      ((i)localObject1).setContentView((View)localObject2);
      ((i)localObject1).setCancelable(true);
      ((i)localObject1).setCanceledOnTouchOutside(false);
      ((i)localObject1).setOnCancelListener(new d.1(localFragmentActivity, (i)localObject1));
      this.iMU = ((Dialog)localObject1);
      this.iMU.show();
      this.iMG.iON = false;
      this.iMq.set(bo.anU());
      this.iLa.ae(new AppBrandLauncherRecentsList.11(this));
      AppMethodBeat.o(133405);
      return;
      this.iME = new f(getActivity(), this.iMv, false, false);
      this.iMv.addHeaderView(this.iME.aNi());
      this.iME.aNi().setVisibility(8);
      this.iME.aNh();
      localObject2 = LayoutInflater.from(getContext()).inflate(2130968715, this.iMv, false);
      this.iMv.addHeaderView((View)localObject2);
      this.iMC = ((View)localObject2);
      this.iMC.setVisibility(8);
    }
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(133404);
    super.onActivityCreated(paramBundle);
    if ((getActivity() != null) && (getActivity().getIntent() != null))
    {
      this.iMH = getActivity().getIntent().getIntExtra("extra_get_usage_reason", this.iMH);
      this.iMI = getActivity().getIntent().getIntExtra("extra_get_usage_prescene", this.iMI);
    }
    AppMethodBeat.o(133404);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133403);
    super.onDestroy();
    this.iMu.set(true);
    AppBrandLauncherRecentsList.a.b(this.iMz);
    AppMethodBeat.o(133403);
  }

  public final void onDestroyView()
  {
    AppMethodBeat.i(133400);
    super.onDestroyView();
    if (this.iME != null)
      this.iME.onDetached();
    if (this.iMF != null)
      this.iMF.onDetached();
    if (this.iMx != null)
      this.iMx.b(this.iMS);
    if (this.iMB != null)
    {
      this.iMB.iNm.clear();
      this.iMB = null;
    }
    if ((!g.RN().eJb) || (com.tencent.mm.kernel.a.QT()));
    while (true)
    {
      this.iLa.oAl.quit();
      this.iMq.set(-1L);
      this.iMr.set(-1L);
      this.iMs.set(false);
      this.iMt.set(9223372036854775807L);
      this.iMG.c(this.iMS);
      this.iMG.c(this.iMN);
      AppMethodBeat.o(133400);
      return;
      com.tencent.mm.plugin.appbrand.config.p.ayH().d(this.iMQ);
      com.tencent.mm.plugin.appbrand.app.f.auT().d(this.iMP);
      ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).d(this.iMO);
      j.axh().d(this.iMR);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(133399);
    this.iMT = false;
    super.onPause();
    try
    {
      if (this.iMv != null)
        this.iMv.setLayoutFrozen(true);
      AppMethodBeat.o(133399);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        Looper.myQueue().addIdleHandler(new AppBrandLauncherRecentsList.2(this));
        AppMethodBeat.o(133399);
      }
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(133398);
    this.iMT = true;
    super.onResume();
    if (this.iMv != null)
      this.iMv.setLayoutFrozen(false);
    int i = this.huR + 1;
    this.huR = i;
    if (i > 1)
    {
      if (this.iME != null)
        this.iME.onResume();
      N(new AppBrandLauncherRecentsList.20(this));
    }
    AppMethodBeat.o(133398);
  }

  public final void setScene(int paramInt)
  {
    AppMethodBeat.i(133402);
    super.setScene(paramInt);
    this.iMp.putInt("launcher_ui_enter_scene", paramInt);
    AppMethodBeat.o(133402);
  }

  final class e extends RecyclerView.v
    implements View.OnClickListener, View.OnCreateContextMenuListener, n.d
  {
    View goc;
    TextView iNn;
    TextView iNo;
    TextView iNp;
    TextView iNq;
    ImageView iNr;
    View iNs;
    com.tencent.mm.ui.widget.b.a iNt;
    final int iNu;
    final int iNv;

    e(View arg2)
    {
      super();
      AppMethodBeat.i(133387);
      this.iNu = 1;
      this.iNv = 2;
      this.goc = localView.findViewById(2131821128);
      this.iNn = ((TextView)localView.findViewById(2131820649));
      this.iNo = ((TextView)localView.findViewById(2131821186));
      this.iNp = ((TextView)localView.findViewById(2131821153));
      this.iNq = ((TextView)localView.findViewById(2131821225));
      this.iNr = ((ImageView)localView.findViewById(2131820915));
      this.iNs = localView.findViewById(2131821224);
      localView.setOnClickListener(this);
      this.iNt = new com.tencent.mm.ui.widget.b.a(this.apJ.getContext())
      {
        public final boolean dn(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(133382);
          if (AppBrandLauncherRecentsList.e.this.apJ.getParent() != null)
            AppBrandLauncherRecentsList.e.this.apJ.getParent().requestDisallowInterceptTouchEvent(true);
          boolean bool = super.dn(paramAnonymousInt1, paramAnonymousInt2);
          AppMethodBeat.o(133382);
          return bool;
        }

        public final void onDismiss()
        {
          AppMethodBeat.i(133383);
          if (AppBrandLauncherRecentsList.e.this.apJ.getParent() != null)
            AppBrandLauncherRecentsList.e.this.apJ.getParent().requestDisallowInterceptTouchEvent(false);
          super.onDismiss();
          AppMethodBeat.o(133383);
        }
      };
      this.iNt.c(this.apJ, this, this);
      AppMethodBeat.o(133387);
    }

    private int aNp()
    {
      AppMethodBeat.i(133388);
      int i = AppBrandLauncherRecentsList.d(AppBrandLauncherRecentsList.this).S(this);
      AppMethodBeat.o(133388);
      return i;
    }

    final AppBrandRecentTaskInfo aNq()
    {
      AppMethodBeat.i(133389);
      try
      {
        AppBrandRecentTaskInfo localAppBrandRecentTaskInfo = (AppBrandRecentTaskInfo)AppBrandLauncherRecentsList.b(AppBrandLauncherRecentsList.this).pW(aNp());
        AppMethodBeat.o(133389);
        return localAppBrandRecentTaskInfo;
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", localException, "getAppInfo", new Object[0]);
          Object localObject = null;
          AppMethodBeat.o(133389);
        }
      }
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(133392);
      paramView = aNq();
      if (paramView == null)
      {
        AppMethodBeat.o(133392);
        return;
      }
      AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
      localAppBrandStatObject.scene = 1001;
      switch (AppBrandLauncherRecentsList.this.gOW)
      {
      case 12:
      default:
      case 11:
      case 10:
      case 13:
      }
      while (true)
      {
        AppBrandLaunchProxyUI.a(AppBrandLauncherRecentsList.this.getActivity(), paramView.csl, null, paramView.gVs, -1, localAppBrandStatObject, null, null);
        if ((AppBrandLauncherRecentsList.this.getActivity() != null) && ((AppBrandLauncherRecentsList.this.getActivity() instanceof AppBrandLauncherUI)))
        {
          paramView = ((AppBrandLauncherUI)AppBrandLauncherRecentsList.this.getActivity()).iGM;
          if (paramView != null)
            paramView.haa[7] = "1";
        }
        AppMethodBeat.o(133392);
        break;
        localAppBrandStatObject.cOq = 12;
        continue;
        localAppBrandStatObject.cOq = 11;
        continue;
        localAppBrandStatObject.cOq = 13;
      }
    }

    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      AppMethodBeat.i(133390);
      paramContextMenuInfo = aNq();
      if (paramContextMenuInfo == null)
      {
        AppMethodBeat.o(133390);
        return;
      }
      if (AppBrandLauncherRecentsList.n(AppBrandLauncherRecentsList.this))
      {
        paramView = this.apJ.getContext();
        if (!paramContextMenuInfo.had)
          break label95;
      }
      label95: for (int i = 2131296854; ; i = 2131296851)
      {
        paramContextMenu.add(0, 1, 0, paramView.getString(i));
        paramContextMenu.add(0, 2, 0, this.apJ.getContext().getString(2131296703));
        AppMethodBeat.o(133390);
        break;
      }
    }

    public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
    {
      AppMethodBeat.i(133391);
      AppBrandRecentTaskInfo localAppBrandRecentTaskInfo = aNq();
      if ((localAppBrandRecentTaskInfo == null) || (paramMenuItem == null))
        AppMethodBeat.o(133391);
      while (true)
      {
        return;
        label62: String str;
        switch (AppBrandLauncherRecentsList.this.getActivity().getIntent().getIntExtra("extra_get_usage_reason", 3))
        {
        default:
          paramInt = 1;
          if (paramInt == 7)
            str = com.tencent.mm.plugin.appbrand.report.e.aLd();
          break;
        case 9:
        }
        while (true)
          if (1 == paramMenuItem.getItemId())
          {
            if ((!AppBrandLauncherRecentsList.i(AppBrandLauncherRecentsList.this)) && (AppBrandLauncherRecentsList.a(AppBrandLauncherRecentsList.this).aNw().size() >= AppBrandLauncherRecentsList.A(AppBrandLauncherRecentsList.this)) && (!localAppBrandRecentTaskInfo.had))
            {
              if (AppBrandLauncherRecentsList.this.getActivity() != null)
                h.a(AppBrandLauncherRecentsList.this.getActivity(), AppBrandLauncherRecentsList.this.getResources().getString(2131296596, new Object[] { Integer.valueOf(AppBrandLauncherRecentsList.A(AppBrandLauncherRecentsList.this)) }), "", AppBrandLauncherRecentsList.this.getResources().getString(2131296994), false, null);
              AppMethodBeat.o(133391);
              break;
              paramInt = 7;
              break label62;
              if (TextUtils.isEmpty(AppBrandLauncherRecentsList.z(AppBrandLauncherRecentsList.this)))
                AppBrandLauncherRecentsList.a(AppBrandLauncherRecentsList.this, com.tencent.mm.plugin.appbrand.report.e.aLc());
              str = AppBrandLauncherRecentsList.z(AppBrandLauncherRecentsList.this);
              continue;
            }
            AppBrandLauncherRecentsList.B(AppBrandLauncherRecentsList.this).aa(new AppBrandLauncherRecentsList.e.2(this, localAppBrandRecentTaskInfo, paramInt, str));
            AppBrandLauncherRecentsList.h(AppBrandLauncherRecentsList.this).iON = true;
            AppMethodBeat.o(133391);
            break;
          }
        if (2 == paramMenuItem.getItemId())
        {
          if ((localAppBrandRecentTaskInfo.had) && (!AppBrandLauncherRecentsList.i(AppBrandLauncherRecentsList.this)))
            AppBrandLauncherRecentsList.B(AppBrandLauncherRecentsList.this).aa(new AppBrandLauncherRecentsList.e.3(this, localAppBrandRecentTaskInfo, paramInt, str));
          AppBrandLauncherRecentsList.a(AppBrandLauncherRecentsList.this).pV(aNp());
          AppBrandLauncherRecentsList.h(AppBrandLauncherRecentsList.this).iON = true;
          AppBrandLauncherRecentsList.g(AppBrandLauncherRecentsList.this).aNo();
          AppBrandLauncherRecentsList.b(AppBrandLauncherRecentsList.this).ci(aNp());
          AppBrandLauncherRecentsList.c(AppBrandLauncherRecentsList.this);
          com.tencent.mm.plugin.appbrand.appusage.al.j(localAppBrandRecentTaskInfo.csl, localAppBrandRecentTaskInfo.appId, localAppBrandRecentTaskInfo.gVs);
        }
        AppMethodBeat.o(133391);
      }
    }
  }

  final class f extends RecyclerView.m
    implements Runnable
  {
    private f()
    {
    }

    public final void c(RecyclerView paramRecyclerView, int paramInt)
    {
      AppMethodBeat.i(133393);
      paramRecyclerView = AppBrandLauncherRecentsList.this;
      if (paramInt == 2);
      for (boolean bool = true; ; bool = false)
      {
        AppBrandLauncherRecentsList.a(paramRecyclerView, bool);
        if (paramInt == 0)
          AppBrandLauncherRecentsList.this.N(this);
        AppMethodBeat.o(133393);
        return;
      }
    }

    public final void run()
    {
      AppMethodBeat.i(133394);
      if ((AppBrandLauncherRecentsList.d(AppBrandLauncherRecentsList.this) != null) && (AppBrandLauncherRecentsList.q(AppBrandLauncherRecentsList.this) != null) && (AppBrandLauncherRecentsList.b(AppBrandLauncherRecentsList.this) != null) && (AppBrandLauncherRecentsList.E(AppBrandLauncherRecentsList.this) != null))
      {
        int i = AppBrandLauncherRecentsList.q(AppBrandLauncherRecentsList.this).iQ();
        int j = AppBrandLauncherRecentsList.q(AppBrandLauncherRecentsList.this).iS();
        while (i <= j)
        {
          RecyclerView.v localv = AppBrandLauncherRecentsList.d(AppBrandLauncherRecentsList.this).cf(i);
          if ((localv instanceof AppBrandLauncherRecentsList.e))
          {
            AppBrandRecentTaskInfo localAppBrandRecentTaskInfo = ((AppBrandLauncherRecentsList.e)localv).aNq();
            if (localAppBrandRecentTaskInfo != null)
              AppBrandLauncherRecentsList.E(AppBrandLauncherRecentsList.this).b((AppBrandLauncherRecentsList.e)localv, localAppBrandRecentTaskInfo.hac);
          }
          i++;
        }
      }
      AppMethodBeat.o(133394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList
 * JD-Core Version:    0.6.2
 */