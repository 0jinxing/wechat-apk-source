package com.tencent.mm.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.contact.k;
import com.tencent.mm.ui.conversation.MainUI;
import com.tencent.mm.ui.widget.listview.PullDownListView;
import java.util.HashMap;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
@TargetApi(11)
public class HomeUI
  implements com.tencent.mm.plugin.appbrand.widget.header.a, LauncherUI.b, LauncherUI.c, LauncherUI.d
{
  public static Boolean yiE = Boolean.FALSE;
  public static Boolean yiF = Boolean.FALSE;
  private String cIe;
  private int clickCount;
  View contentView;
  LayoutInflater ezi;
  private boolean gwZ;
  MessageQueue.IdleHandler jQs;
  ActionBar mActionBar;
  private long mSj;
  com.tencent.mm.sdk.b.c qjs;
  boolean qlP;
  private View rKY;
  private final long ryi;
  private long ryj;
  private final HashMap<String, Object> values;
  private TextView yeR;
  View yfm;
  MMFragmentActivity yhZ;
  private String yiA;
  private String yiB;
  private String yiC;
  aa yiD;
  private final long yiG;
  private final long yiH;
  private boolean yiI;
  private int yiJ;
  private int yiK;
  private int yiL;
  HomeUI.a yiM;
  LauncherUI.a yiN;
  h yiO;
  MainTabUI yiP;
  int yiQ;
  int yiR;
  private boolean yiS;
  boolean yiT;
  View.OnLayoutChangeListener yiU;
  private boolean yiV;
  View yiW;
  ImageView yiX;
  View yiY;
  ImageView yiZ;
  private final long yiu;
  public boolean yiv;
  boolean yiw;
  public boolean yix;
  private TextView yiy;
  private boolean yiz;
  View yja;
  MenuItem yjb;
  MenuItem yjc;
  private MenuItem yjd;
  MenuItem yje;
  Menu yjf;
  private boolean yjg;
  Runnable yjh;
  private int yji;
  private LinkedList<Runnable> yjj;
  o yjk;
  private float yjl;

  public HomeUI()
  {
    AppMethodBeat.i(29392);
    this.yiu = 604800000L;
    this.gwZ = true;
    this.yiv = false;
    this.cIe = null;
    this.yix = false;
    this.qlP = false;
    this.yiz = false;
    this.yiG = 432000000L;
    this.yiH = 604800000L;
    this.yiI = true;
    this.yiJ = 0;
    this.yiK = 0;
    this.yiL = 0;
    this.yiM = HomeUI.a.yjr;
    this.yiP = new MainTabUI();
    this.yiQ = 0;
    this.yiR = 0;
    this.yiS = false;
    this.yiT = true;
    this.yiU = new HomeUI.34(this);
    this.yiV = com.tencent.mm.sdk.platformtools.aa.don();
    this.yjg = true;
    this.clickCount = 0;
    this.mSj = 0L;
    this.values = new HashMap();
    this.qjs = new HomeUI.13(this);
    this.jQs = new HomeUI.15(this);
    this.yjh = new HomeUI.16(this);
    this.yji = 0;
    this.ryi = 300L;
    this.ryj = SystemClock.elapsedRealtime();
    this.yjj = new LinkedList();
    this.yjk = new HomeUI.31(this);
    this.yjl = 0.0F;
    AppMethodBeat.o(29392);
  }

  private void MS(int paramInt)
  {
    AppMethodBeat.i(29408);
    if (Build.VERSION.SDK_INT < 21)
    {
      AppMethodBeat.o(29408);
      return;
    }
    int i;
    if ((Build.VERSION.SDK_INT >= 23) && (!com.tencent.mm.compatible.util.h.Mt()))
      i = paramInt;
    while (true)
    {
      if (Math.abs(this.yji - i) >= 50000)
      {
        ab.i("MicroMsg.LauncherUI.HomeUI", "updateStatusBar %s stack: %s", new Object[] { Integer.valueOf(i), com.tencent.mm.platformtools.ah.anW().toString() });
        this.yhZ.getWindow().setStatusBarColor(i);
      }
      this.yji = i;
      AppMethodBeat.o(29408);
      break;
      i = paramInt;
      if (Build.VERSION.SDK_INT >= 21)
        i = ah.s(this.yhZ.getResources().getColor(2131690515), paramInt);
    }
  }

  private void MT(int paramInt)
  {
    AppMethodBeat.i(29415);
    if (this.mActionBar != null)
      this.mActionBar.setBackgroundDrawable(new ColorDrawable(paramInt));
    AppMethodBeat.o(29415);
  }

  private void c(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(29396);
    if (this.rKY != null)
    {
      this.rKY.clearAnimation();
      this.rKY.setVisibility(8);
      if (paramBoolean1.booleanValue())
      {
        if (!paramBoolean2.booleanValue())
          break label89;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(340227, Boolean.TRUE);
        com.tencent.mm.plugin.report.service.h.pYm.a(232L, 0L, 1L, false);
        yiE = Boolean.FALSE;
      }
    }
    while (true)
    {
      this.rKY = null;
      AppMethodBeat.o(29396);
      return;
      label89: aw.ZK();
      com.tencent.mm.model.c.Ry().set(340230, Boolean.TRUE);
      com.tencent.mm.plugin.report.service.h.pYm.a(232L, 5L, 1L, false);
      yiF = Boolean.FALSE;
    }
  }

  private boolean dxh()
  {
    if ((this.yiJ == 2) && (this.yiK == 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean dxt()
  {
    AppMethodBeat.i(29418);
    boolean bool;
    if (!com.tencent.mm.plugin.story.api.n.isShowStoryCheck())
    {
      AppMethodBeat.o(29418);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).isStoryExist(r.Yz()))
      {
        bool = true;
        AppMethodBeat.o(29418);
      }
      else
      {
        AppMethodBeat.o(29418);
        bool = false;
      }
    }
  }

  private void pG(boolean paramBoolean)
  {
    AppMethodBeat.i(29395);
    if (this.rKY != null)
    {
      ab.e("MicroMsg.LauncherUI.HomeUI", "tipsView already shown");
      AppMethodBeat.o(29395);
      return;
    }
    this.rKY = View.inflate(com.tencent.mm.sdk.platformtools.ah.getContext(), 2130970305, null);
    Object localObject = (TextView)this.rKY.findViewById(2131826356);
    if (paramBoolean)
      ((TextView)localObject).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131296401));
    while (true)
    {
      localObject = new FrameLayout.LayoutParams(-2, -2, 53);
      this.rKY.setBackgroundResource(2130839748);
      if (this.contentView != null)
      {
        ((ViewGroup)this.contentView).addView(this.rKY, (ViewGroup.LayoutParams)localObject);
        localObject = AnimationUtils.loadAnimation(com.tencent.mm.sdk.platformtools.ah.getContext(), 2131034253);
        this.rKY.startAnimation((Animation)localObject);
        this.rKY.setOnClickListener(new HomeUI.2(this, paramBoolean));
      }
      AppMethodBeat.o(29395);
      break;
      ((TextView)localObject).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131296399));
    }
  }

  private void pJ(boolean paramBoolean)
  {
    AppMethodBeat.i(29409);
    View localView;
    int i;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localView = this.yhZ.getWindow().getDecorView();
      i = localView.getSystemUiVisibility();
      if (!paramBoolean)
        break label60;
    }
    label60: for (int j = i & 0xFFFFDFFF; ; j = i | 0x2000)
    {
      if (i != j)
        localView.setSystemUiVisibility(j);
      AppMethodBeat.o(29409);
      return;
    }
  }

  @SuppressLint({"RestrictedApi"})
  private void updateTitle()
  {
    AppMethodBeat.i(29393);
    if (!this.yiI)
    {
      AppMethodBeat.o(29393);
      return;
    }
    int i = this.yiP.mbt;
    Object localObject1 = getString(2131296982);
    Object localObject2;
    if (i == 0)
    {
      localObject2 = localObject1;
      if (com.tencent.mm.protocal.d.vxr)
      {
        if (this.yiV)
          localObject2 = (String)localObject1 + getString(2131296513);
      }
      else
      {
        label80: localObject1 = localObject2;
        if (this.yiP.ynE.dyJ() <= 0)
          break label774;
        localObject1 = localObject2;
        if (!this.yiV)
          localObject1 = (String)localObject2 + " ";
        localObject2 = (String)localObject1 + "(" + this.yiP.ynE.dyJ() + ")";
      }
    }
    while (true)
    {
      label165: if (i == 3)
      {
        MS(this.yhZ.getResources().getColor(2131690597));
        if (dxt())
        {
          pJ(true);
          label198: ((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).checkPost();
          this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yhZ.getResources().getColor(2131690597)));
          this.mActionBar.getCustomView().setVisibility(8);
          this.yjg = false;
          if ((this.yiJ != 3) || (this.yiK != 3))
            break label540;
        }
        for (i = 1; ; i = 0)
        {
          if ((i != 0) && (this.yje != null) && (!this.yje.isVisible()))
            this.yje.setVisible(true);
          this.mActionBar.setElevation(0.0F);
          this.mActionBar.fh();
          this.yiy = ((TextView)this.mActionBar.getCustomView().findViewById(16908308));
          if (this.yiy != null)
          {
            this.yiy.setText((CharSequence)localObject2);
            float f = com.tencent.mm.bz.a.am(com.tencent.mm.sdk.platformtools.ah.getContext(), 2131427496) * com.tencent.mm.bz.a.fY(com.tencent.mm.sdk.platformtools.ah.getContext());
            if (this.yiy.getTextSize() != f)
              this.yiy.setTextSize(0, f);
            i = this.yhZ.getResources().getColor(2131690693);
            if ((this.qlP) && (this.yiy.getCurrentTextColor() != i))
              this.yiy.setTextColor(i);
          }
          AppMethodBeat.o(29393);
          break;
          localObject2 = (String)localObject1 + " " + getString(2131296513);
          break label80;
          if (i == 1)
          {
            localObject2 = getString(2131301270);
            break label165;
          }
          if (i == 2)
          {
            localObject2 = getString(2131301268);
            break label165;
          }
          if (i != 3)
            break label774;
          localObject2 = getString(2131301302);
          break label165;
          pJ(false);
          break label198;
        }
      }
      label540: MS(this.yhZ.getResources().getColor(2131690310));
      pJ(this.qlP);
      localObject1 = this.mActionBar.getCustomView().getBackground();
      if ((localObject1 instanceof ColorDrawable))
        if (((ColorDrawable)localObject1).getColor() != this.yhZ.getResources().getColor(2131690310))
          this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yhZ.getResources().getColor(2131690310)));
      while (true)
      {
        if (this.mActionBar.getCustomView().getVisibility() != 0)
          this.mActionBar.getCustomView().setVisibility(0);
        this.yjg = true;
        if ((dxh()) && (this.yjb != null) && (!this.yjb.isVisible()))
          this.yjb.setVisible(true);
        if ((!dxh()) || (this.yjc == null) || (this.yjc.isVisible()))
          break;
        this.yjc.setVisible(true);
        break;
        this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yhZ.getResources().getColor(2131690310)));
      }
      label774: localObject2 = localObject1;
    }
  }

  private static void v(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(29421);
    if (paramView != null)
      if (paramBoolean)
      {
        paramView.setClickable(true);
        paramView.setBackgroundResource(2130837630);
        AppMethodBeat.o(29421);
      }
    while (true)
    {
      return;
      paramView.setClickable(false);
      paramView.setBackgroundResource(2131690597);
      AppMethodBeat.o(29421);
    }
  }

  public final void a(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(29416);
    if (getMainTabUI().dyx() != null)
    {
      MMFragment localMMFragment = getMainTabUI().dyx();
      if ((localMMFragment instanceof MoreTabUI))
      {
        MT(this.yhZ.getResources().getColor(2131690597));
        AppMethodBeat.o(29416);
      }
      while (true)
      {
        return;
        if ((localMMFragment instanceof MainUI))
          break;
        MT(this.yhZ.getResources().getColor(2131690310));
        AppMethodBeat.o(29416);
      }
      if (Math.abs(paramFloat) >= 0.01D)
        break label211;
      MT(this.yhZ.getResources().getColor(2131690597));
      if (!this.yiS)
      {
        this.yiS = true;
        pJ(true);
      }
      v(this.yfm, false);
      v(this.yiW, false);
    }
    while (true)
    {
      if ((paramInt2 != 0) && (this.yiy != null))
        this.yiy.setTextColor(paramInt2);
      if (this.yiZ != null)
        this.yiZ.setAlpha(paramFloat);
      if (this.yiX != null)
        this.yiX.setAlpha(paramFloat);
      AppMethodBeat.o(29416);
      break;
      label211: if (paramFloat >= 1.0F)
      {
        if (this.yiS)
        {
          this.yiS = false;
          pJ(false);
        }
        MT(this.yhZ.getResources().getColor(2131690310));
        v(this.yfm, true);
        v(this.yiW, true);
      }
    }
  }

  public final void a(HomeUI.FitSystemWindowLayoutView paramFitSystemWindowLayoutView, Rect paramRect, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(29405);
    this.yhZ.getWindow().getDecorView().getBottom();
    this.yhZ.getSupportActionBar().getCustomView().getBottom();
    paramFitSystemWindowLayoutView.setActionBarContainer(paramViewGroup);
    paramFitSystemWindowLayoutView.fitSystemWindows(paramRect);
    AppMethodBeat.o(29405);
  }

  public final void aw(Runnable paramRunnable)
  {
    AppMethodBeat.i(29411);
    this.yjj.remove(paramRunnable);
    AppMethodBeat.o(29411);
  }

  final void dwf()
  {
    AppMethodBeat.i(29412);
    if (this.yhZ != null)
      this.yhZ.moveTaskToBack(true);
    if (aw.RK())
      aw.RS().m(new HomeUI.21(this), 500L);
    com.tencent.mm.app.n localn = com.tencent.mm.app.n.Bw();
    localn.ceU = false;
    localn.ceV.removeMessages(-1999);
    localn.ceV.removeMessages(-2999);
    localn.ceV.sendEmptyMessageDelayed(-1999, 3000L);
    localn.ceV.sendEmptyMessageDelayed(-2999, 30000L);
    AppMethodBeat.o(29412);
  }

  final void dxi()
  {
    AppMethodBeat.i(29394);
    if (!aw.RK())
    {
      ab.e("MicroMsg.LauncherUI.HomeUI", "mmcore has not ready");
      AppMethodBeat.o(29394);
    }
    while (true)
    {
      return;
      aw.ZK();
      Boolean localBoolean = Boolean.valueOf(com.tencent.mm.platformtools.ah.e((Boolean)com.tencent.mm.model.c.Ry().get(340227, null)));
      if ((!localBoolean.booleanValue()) && (!k.zmx.booleanValue()))
      {
        yiE = Boolean.TRUE;
        pG(true);
      }
      long l1 = System.currentTimeMillis();
      aw.ZK();
      long l2 = com.tencent.mm.platformtools.ah.d((Long)com.tencent.mm.model.c.Ry().get(340240, null));
      aw.ZK();
      boolean bool1 = com.tencent.mm.platformtools.ah.e((Boolean)com.tencent.mm.model.c.Ry().get(340230, null));
      aw.ZK();
      boolean bool2 = com.tencent.mm.platformtools.ah.e((Boolean)com.tencent.mm.model.c.Ry().get(340228, null));
      aw.ZK();
      boolean bool3 = com.tencent.mm.platformtools.ah.e((Boolean)com.tencent.mm.model.c.Ry().get(340229, null));
      if ((localBoolean.booleanValue()) && (Boolean.valueOf(bool2).booleanValue()) && (Boolean.valueOf(bool3).booleanValue()) && (!Boolean.valueOf(bool1).booleanValue()) && (l1 - l2 >= 432000000L))
      {
        yiF = Boolean.TRUE;
        pG(false);
      }
      AppMethodBeat.o(29394);
    }
  }

  final void dxj()
  {
    AppMethodBeat.i(29397);
    if ((this.yiD == null) || (!aw.RK()))
      AppMethodBeat.o(29397);
    while (true)
    {
      return;
      if (this.yiD.isShowing())
      {
        this.yiD.dismiss();
        AppMethodBeat.o(29397);
      }
      else
      {
        this.yiD.gP();
        AppMethodBeat.o(29397);
      }
    }
  }

  final void dxk()
  {
    AppMethodBeat.i(29399);
    int i;
    if (this.yje != null)
    {
      android.support.v4.view.g.a(this.yje, 2);
      if (this.yjg)
        break label216;
      if (!(this.yiP.dyx() instanceof MoreTabUI))
        break label211;
      MoreTabUI localMoreTabUI = (MoreTabUI)this.yiP.dyx();
      if ((localMoreTabUI.yoh != null) && (localMoreTabUI.yoh.isVisible))
      {
        i = 1;
        if (i == 0)
          break label211;
        i = 1;
        label77: if (i == 0)
          break label216;
        this.yje.setVisible(true);
      }
    }
    else
    {
      label92: if (this.yjc != null)
      {
        if (!this.yjg)
          break label241;
        android.support.v4.view.g.a(this.yjc, 2);
        this.yjc.setVisible(true);
      }
      label125: if (this.yjb != null)
      {
        if (!this.yjg)
          break label266;
        android.support.v4.view.g.a(this.yjb, 2);
        this.yjb.setVisible(true);
      }
      label158: if (this.yjd == null)
        break label322;
      if (this.yjg)
        break label291;
      android.support.v4.view.g.a(this.yjd, 2);
      this.yjd.setVisible(true);
      this.yeR.setVisibility(0);
      AppMethodBeat.o(29399);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label211: i = 0;
      break label77;
      label216: this.yje.setVisible(false);
      this.yje.setEnabled(false);
      break label92;
      label241: this.yjc.setVisible(false);
      this.yjc.setEnabled(false);
      break label125;
      label266: this.yjb.setVisible(false);
      this.yjb.setEnabled(false);
      break label158;
      label291: this.yjd.setVisible(false);
      this.yjd.setEnabled(false);
      this.yeR.setVisibility(8);
      label322: AppMethodBeat.o(29399);
    }
  }

  final void dxl()
  {
    AppMethodBeat.i(29400);
    if (!((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).isFTSIndexReady())
    {
      Toast.makeText(com.tencent.mm.sdk.platformtools.ah.getContext(), 2131302850, 0).show();
      AppMethodBeat.o(29400);
    }
    while (true)
    {
      return;
      int i = this.yiP.mbt;
      if (i == 0)
        getMainTabUI().dyx();
      Intent localIntent = new Intent().putExtra("from_tab_index", i).putExtra("MMActivity.OverrideEnterAnimation", 0).putExtra("MMActivity.OverrideExitAnimation", 0);
      Bundle localBundle = null;
      if (Build.VERSION.SDK_INT >= 21)
        localBundle = ActivityOptions.makeSceneTransitionAnimation(this.yhZ, new Pair[0]).toBundle();
      com.tencent.mm.plugin.fts.a.d.b(this.yhZ, ".ui.FTSMainUI", localIntent, localBundle);
      AppMethodBeat.o(29400);
    }
  }

  final void dxm()
  {
    AppMethodBeat.i(29402);
    boolean bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWL, Boolean.TRUE)).booleanValue();
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWL, Boolean.FALSE);
    com.tencent.mm.plugin.story.g.h localh;
    if (bool)
    {
      this.yiT = false;
      if (this.yja != null)
      {
        this.yja.findViewById(2131820972).setVisibility(8);
        localh = com.tencent.mm.plugin.story.g.h.scu;
        com.tencent.mm.plugin.story.g.h.lo(0L);
      }
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xWL, Boolean.FALSE);
    }
    if (this.yja != null)
    {
      this.yja.findViewById(2131820972).setVisibility(8);
      localh = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.g.h.lo(0L);
    }
    if (!((com.tencent.mm.plugin.story.api.e)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.story.api.e.class)).canPostStory())
    {
      com.tencent.mm.kernel.g.RQ();
      int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWy, Integer.valueOf(0))).intValue();
      com.tencent.mm.ui.base.h.b(this.yhZ, "", this.yhZ.getResources().getString(2131303949, new Object[] { Integer.valueOf(i) }), true);
      AppMethodBeat.o(29402);
    }
    while (true)
    {
      return;
      MMFragmentActivity localMMFragmentActivity = this.yhZ;
      localh = com.tencent.mm.plugin.story.g.h.scu;
      com.tencent.mm.plugin.story.api.n.a(localMMFragmentActivity, 0, com.tencent.mm.plugin.story.g.h.cAI(), 10);
      AppMethodBeat.o(29402);
    }
  }

  public final void dxn()
  {
    AppMethodBeat.i(29403);
    if ((r.Zf().booleanValue()) && ((yiE.booleanValue()) || (yiF.booleanValue())))
    {
      Boolean localBoolean = Boolean.FALSE;
      c(localBoolean, localBoolean);
    }
    this.yiP.dxn();
    AppMethodBeat.o(29403);
  }

  public final void dxo()
  {
    AppMethodBeat.i(29404);
    aw.RS().doK();
    this.yiP.dyC();
    al.d(this.yjh);
    AppMethodBeat.o(29404);
  }

  public final boolean dxp()
  {
    if (this.yiM == HomeUI.a.yjs);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dxq()
  {
    AppMethodBeat.i(29413);
    updateTitle();
    AppMethodBeat.o(29413);
  }

  public final void dxr()
  {
    AppMethodBeat.i(29414);
    this.yiP.dxr();
    AppMethodBeat.o(29414);
  }

  public final void dxs()
  {
    AppMethodBeat.i(29417);
    this.yiP.Nj(180);
    AppMethodBeat.o(29417);
  }

  final void dxu()
  {
    AppMethodBeat.i(29419);
    ImageView localImageView;
    if ((this.yje != null) && (this.yje.getActionView() != null))
    {
      localImageView = (ImageView)this.yje.getActionView().findViewById(2131820915);
      localImageView.setImageDrawable(this.yhZ.getResources().getDrawable(2131231403));
      if (dxt())
      {
        localImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        if (!this.yiT)
          break label160;
        this.yiT = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xWL, Boolean.TRUE)).booleanValue();
        this.yje.getActionView().findViewById(2131820972).setVisibility(0);
        AppMethodBeat.o(29419);
      }
    }
    while (true)
    {
      return;
      localImageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
      break;
      label160: this.yje.getActionView().findViewById(2131820972).setVisibility(8);
      AppMethodBeat.o(29419);
    }
  }

  public MainTabUI getMainTabUI()
  {
    return this.yiP;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(29401);
    String str = this.yhZ.getString(paramInt);
    AppMethodBeat.o(29401);
    return str;
  }

  final void initActionBar()
  {
    AppMethodBeat.i(29407);
    if (this.yiN.dxM())
    {
      ab.w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] isChattingForeground True!");
      AppMethodBeat.o(29407);
      return;
    }
    this.mActionBar.setLogo(new ColorDrawable(this.yhZ.getResources().getColor(17170445)));
    this.mActionBar.fc();
    this.mActionBar.setDisplayHomeAsUpEnabled(false);
    this.mActionBar.fb();
    this.mActionBar.fd();
    this.mActionBar.setCustomView(b.SM().a(this.yhZ, "R.layout.actionbar_title_launcher", 2130968619));
    ImageView localImageView = (ImageView)this.mActionBar.getCustomView().findViewById(2131820974);
    if ((localImageView != null) && (this.qlP))
      localImageView.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    if (this.qlP)
      this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yhZ.getResources().getColor(2131689913)));
    while (true)
    {
      updateTitle();
      this.mActionBar.getCustomView().findViewById(2131820983).setOnClickListener(new HomeUI.17(this));
      AppMethodBeat.o(29407);
      break;
      this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.yhZ.getResources().getColor(2131690310)));
    }
  }

  final void pH(boolean paramBoolean)
  {
    AppMethodBeat.i(29398);
    if ((this.yiD == null) || (this.yiW == null))
      AppMethodBeat.o(29398);
    while (true)
    {
      return;
      if (!aw.RK())
      {
        ab.w("MicroMsg.LauncherUI.HomeUI", "want update more menu new tips, but mmcore not ready");
        AppMethodBeat.o(29398);
      }
      else
      {
        this.yiD.ypJ.pY(paramBoolean);
        if (this.yiD.ypJ.ypC > 0);
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label103;
          this.yiY.setVisibility(0);
          AppMethodBeat.o(29398);
          break;
        }
        label103: this.yiY.setVisibility(8);
        AppMethodBeat.o(29398);
      }
    }
  }

  public final void pI(boolean paramBoolean)
  {
    AppMethodBeat.i(29406);
    if (!paramBoolean)
      initActionBar();
    this.yhZ.supportInvalidateOptionsMenu();
    if (r.Zf().booleanValue())
      dxi();
    this.yiP.dyB();
    AppMethodBeat.o(29406);
  }

  public final void pK(boolean paramBoolean)
  {
    AppMethodBeat.i(29420);
    if ((this.yje != null) && (this.yje.getActionView() != null) && (this.yhZ != null))
      if (this.yhZ.getResources().getConfiguration().orientation == 2)
      {
        this.yje.setVisible(false);
        this.yje.setEnabled(false);
        AppMethodBeat.o(29420);
      }
    while (true)
    {
      return;
      this.yje.setVisible(true);
      this.yje.setEnabled(true);
      ImageView localImageView = (ImageView)this.yje.getActionView().findViewById(2131820915);
      localImageView.setImageDrawable(this.yhZ.getResources().getDrawable(2131231403));
      if (paramBoolean)
        localImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
      while (true)
      {
        if (!this.yiT)
          break label210;
        this.yje.getActionView().findViewById(2131820972).setVisibility(0);
        AppMethodBeat.o(29420);
        break;
        localImageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
      }
      label210: this.yje.getActionView().findViewById(2131820972).setVisibility(8);
      AppMethodBeat.o(29420);
    }
  }

  public final void setTitleBarDoubleClickListener(Runnable paramRunnable)
  {
    AppMethodBeat.i(29410);
    if (!this.yjj.contains(paramRunnable))
      this.yjj.add(paramRunnable);
    AppMethodBeat.o(29410);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI
 * JD-Core Version:    0.6.2
 */