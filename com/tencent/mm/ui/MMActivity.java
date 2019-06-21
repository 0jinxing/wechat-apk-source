package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.c;
import com.tencent.mm.plugin.appbrand.widget.input.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

@com.tencent.mm.ui.base.a(0)
public abstract class MMActivity extends MMFragmentActivity
  implements ad
{
  private static String ylp;
  String className;
  public a ifE = null;
  public q mController = new q()
  {
    protected final String bJj()
    {
      AppMethodBeat.i(105987);
      String str = MMActivity.this.bJj();
      AppMethodBeat.o(105987);
      return str;
    }

    protected final void dealContentView(View paramAnonymousView)
    {
      AppMethodBeat.i(105986);
      MMActivity.this.dealContentView(paramAnonymousView);
      AppMethodBeat.o(105986);
    }

    protected final boolean dxT()
    {
      AppMethodBeat.i(105991);
      boolean bool = MMActivity.this.dxT();
      AppMethodBeat.o(105991);
      return bool;
    }

    protected final String getClassName()
    {
      AppMethodBeat.i(105990);
      String str = MMActivity.this.getClass().getName();
      AppMethodBeat.o(105990);
      return str;
    }

    protected final int getLayoutId()
    {
      AppMethodBeat.i(105985);
      int i = MMActivity.this.getLayoutId();
      AppMethodBeat.o(105985);
      return i;
    }

    protected final View getLayoutView()
    {
      return null;
    }

    public final boolean needShowIdcError()
    {
      AppMethodBeat.i(105993);
      boolean bool = MMActivity.this.needShowIdcError();
      AppMethodBeat.o(105993);
      return bool;
    }

    public final boolean noActionBar()
    {
      AppMethodBeat.i(105992);
      boolean bool = MMActivity.this.noActionBar();
      AppMethodBeat.o(105992);
      return bool;
    }

    protected final void onCreateBeforeSetContentView()
    {
      AppMethodBeat.i(105989);
      MMActivity.this.onCreateBeforeSetContentView();
      AppMethodBeat.o(105989);
    }

    public final void onKeyboardStateChanged()
    {
      AppMethodBeat.i(105988);
      MMActivity.this.onKeyboardStateChanged();
      AppMethodBeat.o(105988);
    }
  };
  public boolean uiu = false;
  protected boolean ylk = false;
  protected boolean yll = false;
  protected boolean ylm = false;
  private ViewGroup yln = null;
  private View ylo;
  private long ylq = 0L;
  private long ylr = 0L;
  private long yls = 0L;

  static
  {
    if (Build.VERSION.SDK_INT >= 19);
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      ylp = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ylp = null;
    }
  }

  public static Locale bM(Context paramContext, String paramString)
  {
    return q.bM(paramContext, paramString);
  }

  public static void dxV()
  {
    q.dxV();
  }

  public static Locale initLanguage(Context paramContext)
  {
    return q.initLanguage(paramContext);
  }

  public static void showVKB(Activity paramActivity)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)paramActivity.getSystemService("input_method");
    if (localInputMethodManager == null);
    while (true)
    {
      return;
      paramActivity = paramActivity.getCurrentFocus();
      if ((paramActivity != null) && (paramActivity.getWindowToken() != null))
        localInputMethodManager.toggleSoftInput(0, 2);
    }
  }

  public void AM(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
    if (paramInt == 0)
      this.mController.showTitleView();
    while (true)
    {
      return;
      this.mController.hideTitleView();
    }
  }

  public void M(CharSequence paramCharSequence)
  {
    this.mController.M(paramCharSequence);
  }

  public final void MY(int paramInt)
  {
    this.mController.ylQ.setVisibility(paramInt);
  }

  public final void MZ(int paramInt)
  {
    this.mController.setTitleLogo(0, paramInt);
  }

  public final void Na(int paramInt)
  {
    this.mController.updateOptionMenuIcon(0, paramInt);
  }

  public final void Nb(int paramInt)
  {
    this.mController.Nb(paramInt);
  }

  public final void Nc(int paramInt)
  {
    q localq = this.mController;
    localq.ylT = paramInt;
    if (localq.ylS != null)
      localq.ylS.setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    if ((localq.ylQ != null) && (localq.ylQ.getVisibility() == 0))
      localq.ylQ.setTextColor(paramInt);
    if ((localq.jcI != null) && (localq.jcI.getVisibility() == 0))
      localq.jcI.setTextColor(paramInt);
    if ((localq.yeP != null) && (localq.yeP.getVisibility() == 0))
      localq.yeP.getDrawable().setColorFilter(paramInt, PorterDuff.Mode.SRC_ATOP);
    while (true)
    {
      return;
      if ((localq.yeR != null) && (localq.yeR.getVisibility() == 0))
        localq.yeR.setTextColor(paramInt);
    }
  }

  public final void Nd(int paramInt)
  {
    q localq = this.mController;
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
    {
      localq.ylJ = bool;
      localq.dym();
      return;
    }
  }

  public final void Ne(int paramInt)
  {
    if (this.ylo != null)
      this.ylo.setVisibility(paramInt);
  }

  public final void a(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.updateOptionMenuListener(paramInt, paramOnMenuItemClickListener, null);
  }

  public final void a(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.addIconOptionMenu(0, paramInt, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public final void a(int paramInt, String paramString, Drawable paramDrawable, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    q localq = this.mController;
    q.b localb = q.b.ymt;
    q.a locala = new q.a();
    locala.yfi = paramInt;
    locala.ymq = paramDrawable;
    locala.text = paramString;
    locala.gzB = paramOnMenuItemClickListener;
    locala.mlV = null;
    locala.ymr = localb;
    localq.Nf(locala.yfi);
    localq.yfa.add(locala);
    new com.tencent.mm.sdk.platformtools.ak().postDelayed(new q.7(localq), 200L);
  }

  public final void a(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, q.b paramb)
  {
    this.mController.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener, null, paramb);
  }

  public final void a(o paramo)
  {
    this.mController.addSearchMenu(true, paramo);
  }

  public final void a(Class<?> paramClass, Intent paramIntent)
  {
    paramIntent.setClass(this, paramClass);
    startActivity(paramIntent);
  }

  public final void a(String paramString, int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    q localq = this.mController;
    q.b localb = q.b.ymt;
    q.a locala = new q.a();
    locala.yfi = 0;
    locala.text = paramString;
    locala.textColor = paramInt;
    locala.gzB = paramOnMenuItemClickListener;
    locala.mlV = null;
    locala.ymr = localb;
    localq.Nf(locala.yfi);
    localq.yfa.add(locala);
    new com.tencent.mm.sdk.platformtools.ak().postDelayed(new q.8(localq), 200L);
  }

  public final void aA(Class<?> paramClass)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this, paramClass);
    startActivity(localIntent);
  }

  protected void aBS()
  {
    if (getForceOrientation() == -1)
    {
      this.ylk = getSharedPreferences(ah.doA(), 0).getBoolean("settings_landscape_mode", false);
      if (this.ylk)
        setRequestedOrientation(-1);
    }
    while (true)
    {
      return;
      setRequestedOrientation(1);
      continue;
      setRequestedOrientation(getForceOrientation());
    }
  }

  public final boolean aRp()
  {
    return this.mController.hideVKB();
  }

  public void addDialog(Dialog paramDialog)
  {
    this.mController.addDialog(paramDialog);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener);
  }

  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramInt3, paramOnMenuItemClickListener, paramOnLongClickListener);
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
  }

  public void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addTextOptionMenu(paramInt, paramString, paramOnMenuItemClickListener);
  }

  public boolean apx()
  {
    return false;
  }

  public void aqX()
  {
    this.mController.hideVKB();
  }

  public final void b(a parama, Intent paramIntent, int paramInt)
  {
    this.ifE = parama;
    startActivityForResult(paramIntent, paramInt);
  }

  public final void b(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    q localq = this.mController;
    if (localq.mActionBar == null);
    while (true)
    {
      return;
      localq.mActionBar.getCustomView().setOnClickListener(new q.5(localq, paramRunnable1, paramRunnable2));
    }
  }

  public final void b(String paramString, int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.addIconOptionMenu(0, paramString, paramInt, paramOnMenuItemClickListener);
  }

  protected String bJj()
  {
    return "";
  }

  public final void bn(float paramFloat)
  {
    this.mController.bn(paramFloat);
  }

  protected void dealContentView(View paramView)
  {
    setContentView(paramView);
  }

  @Deprecated
  public final void dxR()
  {
    this.yll = true;
  }

  @Deprecated
  public final void dxS()
  {
    this.ylm = true;
  }

  protected boolean dxT()
  {
    return false;
  }

  public final AppCompatActivity dxU()
  {
    return this.mController.ylL;
  }

  public final void dxW()
  {
    Object localObject = this.mController;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject = ((q)localObject).ylL.getWindow().getDecorView();
      ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x2000);
    }
  }

  public final boolean dxX()
  {
    Iterator localIterator = this.mController.yfa.iterator();
    q.a locala;
    do
    {
      if (!localIterator.hasNext())
        break;
      locala = (q.a)localIterator.next();
    }
    while (locala.yfi != 0);
    for (boolean bool = locala.enable; ; bool = false)
      return bool;
  }

  public final boolean dxY()
  {
    Iterator localIterator = this.mController.yfa.iterator();
    q.a locala;
    do
    {
      if (!localIterator.hasNext())
        break;
      locala = (q.a)localIterator.next();
    }
    while (locala.yfi != 0);
    for (boolean bool = locala.aIB; ; bool = false)
      return bool;
  }

  public final void dxZ()
  {
    q localq = this.mController;
    if (localq.ylS != null)
      localq.ylS.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
  }

  public final void dya()
  {
    Object localObject = this.mController;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localObject = ((q)localObject).ylL.getWindow().getDecorView();
      ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() & 0xFFFFFFEF);
    }
  }

  public final void dyb()
  {
    q localq = this.mController;
    if (Build.VERSION.SDK_INT >= 21)
      localq.getSupportActionBar().setElevation(0.0F);
  }

  public final void dyc()
  {
    q localq = this.mController;
    if (Build.VERSION.SDK_INT >= 21)
      localq.getSupportActionBar().setElevation(1.0F);
  }

  public final int dyd()
  {
    return this.mController.dyj();
  }

  public final void dye()
  {
    this.ifE = null;
  }

  public final void dyf()
  {
    q localq = this.mController;
    localq.ylS.setVisibility(8);
    localq.ylR.setVisibility(8);
  }

  public final void dyg()
  {
    if (!ak.hw(this.mController.ylL))
      ab.w("MicroMsg.MMActivity", "has not NavigationBar!");
    while (true)
    {
      return;
      if (this.ylo == null)
      {
        this.ylo = new View(this.mController.ylL);
        ((ViewGroup)getWindow().getDecorView()).addView(this.ylo);
      }
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, ak.fr(this.mController.ylL));
      localLayoutParams.gravity = 80;
      this.ylo.setLayoutParams(localLayoutParams);
      this.ylo.setBackgroundColor(-637534208);
      this.ylo.setVisibility(8);
    }
  }

  public final String dyh()
  {
    Object localObject1 = "";
    Object localObject2 = getCallingActivity();
    if (localObject2 != null)
    {
      localObject1 = ((ComponentName)localObject2).getPackageName();
      ab.i("MicroMsg.MMActivity", "get calling activity, %s", new Object[] { localObject1 });
    }
    localObject2 = localObject1;
    Object localObject3;
    if (bo.isNullOrNil((String)localObject1))
    {
      localObject2 = localObject1;
      if (Build.VERSION.SDK_INT >= 22)
        localObject3 = localObject1;
    }
    try
    {
      localObject2 = new com/tencent/mm/compatible/loader/c;
      localObject3 = localObject1;
      ((c)localObject2).<init>(this, "mReferrer", null);
      localObject3 = localObject1;
      Object localObject4 = ((c)localObject2).get();
      localObject2 = localObject1;
      if (localObject4 != null)
      {
        localObject3 = localObject1;
        localObject2 = (String)localObject4;
      }
      localObject3 = localObject2;
      ab.i("MicroMsg.MMActivity", "get referrer, %s", new Object[] { localObject2 });
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject1 = localObject2;
        if (Build.VERSION.SDK_INT >= 22)
        {
          localObject3 = getReferrer();
          localObject1 = localObject2;
          if (localObject3 != null)
          {
            localObject1 = ((Uri)localObject3).getAuthority();
            ab.i("MicroMsg.MMActivity", "get referrer, %s", new Object[] { localObject1 });
          }
        }
      }
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MMActivity", localException, "get mReferrer error", new Object[0]);
        localObject2 = localObject3;
      }
    }
  }

  public final long dyi()
  {
    if (this.ylr != 0L);
    for (long l = this.ylr - this.ylq + this.yls; ; l = bo.yz() - this.ylq + this.yls)
    {
      if (l < 0L)
        ab.w("MicroMsg.MMActivity", "%d get activity browse time is error, may be something warn here.[%d %d %d %d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l), Long.valueOf(this.ylq), Long.valueOf(this.ylr), Long.valueOf(this.yls) });
      ab.v("MicroMsg.MMActivity", "%d get activity browse time [%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(l) });
      return l;
    }
  }

  public final void enableBackMenu(boolean paramBoolean)
  {
    this.mController.enableBackMenu(paramBoolean);
  }

  public final void enableOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.d(false, paramInt, paramBoolean);
  }

  public final void enableOptionMenu(boolean paramBoolean)
  {
    this.mController.d(true, -1, paramBoolean);
  }

  public void finish()
  {
    super.finish();
    int i = w.a(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
    int j = w.a(getIntent(), "MMActivity.OverrideExitAnimation", -1);
    if (i != -1)
      super.overridePendingTransition(i, j);
  }

  public final void fullScreenNoTitleBar(boolean paramBoolean)
  {
    this.mController.fullScreenNoTitleBar(paramBoolean);
  }

  public final View getContentView()
  {
    return this.mController.contentView;
  }

  public final q getController()
  {
    return this.mController;
  }

  protected int getForceOrientation()
  {
    return -1;
  }

  protected abstract int getLayoutId();

  public final void hideTitleView()
  {
    this.mController.hideTitleView();
  }

  public void hideVKB(View paramView)
  {
    this.mController.hideVKB(paramView);
  }

  protected void initSwipeBack()
  {
    super.initSwipeBack();
    View localView;
    if ((getSwipeBackLayout() != null) && (getSwipeBackLayout().getChildCount() > 0))
    {
      localView = getSwipeBackLayout().getChildAt(0);
      getSwipeBackLayout().removeView(localView);
      if (!this.yll)
        break label97;
    }
    label97: for (this.yln = new b(this); ; this.yln = new FrameLayout(this))
    {
      this.yln.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      getSwipeBackLayout().addView(this.yln);
      getSwipeBackLayout().setContentView(this.yln);
      return;
    }
  }

  @Deprecated
  protected void initView()
  {
  }

  public boolean needShowIdcError()
  {
    return true;
  }

  public boolean noActionBar()
  {
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.ifE != null)
      this.ifE.c(paramInt1, paramInt2, paramIntent);
    this.ifE = null;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
  }

  public void onCreate(Bundle paramBundle)
  {
    if (!this.ylm)
      this.yll = true;
    super.onCreate(paramBundle);
    if (isHideStatusBar())
      this.yll = false;
    this.mController.a(getApplicationContext(), this);
    initNavigationSwipeBack();
    xE(getResources().getColor(2131690310));
    bn(com.tencent.mm.bz.a.am(this, 2131427496) * com.tencent.mm.bz.a.fY(this));
  }

  protected void onCreateBeforeSetContentView()
  {
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    if (this.mController.onCreateOptionsMenu(paramMenu));
    for (boolean bool = true; ; bool = super.onCreateOptionsMenu(paramMenu))
      return bool;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.mController.hq(this);
    this.uiu = true;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.mController.onKeyDown(paramInt, paramKeyEvent));
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  @TargetApi(17)
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool1 = true;
    if (this.mController.onKeyUp(paramInt, paramKeyEvent));
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = super.onKeyUp(paramInt, paramKeyEvent);
        bool1 = bool2;
      }
      catch (Exception paramKeyEvent)
      {
        ab.printErrStackTrace("MicroMsg.MMActivity", paramKeyEvent, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new Object[0]);
      }
    }
  }

  public void onKeyboardStateChanged()
  {
  }

  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return this.mController.onOptionsItemSelected(paramMenuItem);
  }

  public void onPause()
  {
    long l = System.currentTimeMillis();
    ac.bL(2, this.className);
    super.onPause();
    this.mController.onPause();
    boolean bool = isFinishing();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity onPause: %d ms, isFinishing %B, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Boolean.valueOf(bool), Integer.valueOf(hashCode()) });
    this.ylr = bo.yz();
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.mController.onPrepareOptionsMenu(paramMenu);
    return super.onPrepareOptionsMenu(paramMenu);
  }

  public void onResume()
  {
    long l = System.currentTimeMillis();
    ac.bL(1, this.className);
    super.onResume();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - l));
    this.mController.onResume();
    ab.v("MicroMsg.INIT", "KEVIN MMActivity onResume :%dms, hash:#0x%x", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(hashCode()) });
    if (this.ylr > this.ylq)
      this.yls += this.ylr - this.ylq;
    this.ylq = bo.yz();
    this.ylr = 0L;
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 11)
      super.onSaveInstanceState(paramBundle);
  }

  public void onStart()
  {
    aBS();
    super.onStart();
  }

  public void onSwipeBack()
  {
    if (!apx())
      this.mController.callBackMenu();
    super.onSwipeBack();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void pO(boolean paramBoolean)
  {
    q localq = this.mController;
    localq.qlP = paramBoolean;
    localq.dyo();
    localq.dyn();
  }

  public final void pP(boolean paramBoolean)
  {
    q localq = this.mController;
    if (localq.ylS != null)
    {
      if (!paramBoolean)
        break label25;
      localq.ylS.setVisibility(0);
    }
    while (true)
    {
      return;
      label25: localq.ylS.setVisibility(8);
    }
  }

  public final void removeAllOptionMenu()
  {
    this.mController.removeAllOptionMenu();
  }

  public final boolean removeOptionMenu(int paramInt)
  {
    return this.mController.removeOptionMenu(paramInt);
  }

  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, 0);
  }

  public void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    this.mController.setBackBtn(paramOnMenuItemClickListener, paramInt);
  }

  public final void setBackGroundColorResource(int paramInt)
  {
    this.mController.setBackGroundColorResource(paramInt);
  }

  public final void setMMSubTitle(int paramInt)
  {
    this.mController.setMMSubTitle(paramInt);
  }

  public void setMMSubTitle(String paramString)
  {
    this.mController.setMMSubTitle(paramString);
  }

  public final void setMMTitle(int paramInt)
  {
    this.mController.setMMTitle(paramInt);
  }

  public void setMMTitle(String paramString)
  {
    this.mController.setMMTitle(paramString);
  }

  public void setScreenEnable(boolean paramBoolean)
  {
    this.mController.setScreenEnable(paramBoolean);
  }

  public final void setTitleBarDoubleClickListener(Runnable paramRunnable)
  {
    this.mController.setTitleBarDoubleClickListener(paramRunnable);
  }

  public final void setTitleMuteIconVisibility(int paramInt)
  {
    this.mController.setTitleMuteIconVisibility(paramInt);
  }

  public final void setTitleVisibility(int paramInt)
  {
    this.mController.setTitleVisibility(paramInt);
  }

  public final void showHomeBtn(boolean paramBoolean)
  {
    this.mController.showHomeBtn(paramBoolean);
  }

  public void showOptionMenu(int paramInt, boolean paramBoolean)
  {
    this.mController.e(false, paramInt, paramBoolean);
  }

  public void showOptionMenu(boolean paramBoolean)
  {
    this.mController.e(true, -1, paramBoolean);
  }

  public void showVKB()
  {
    q.showVKB(this.mController.ylL);
  }

  public void ta(int paramInt)
  {
    q localq = this.mController;
    if (localq.mActionBar != null)
      localq.ylQ.setTextColor(paramInt);
  }

  public final void updateOptionMenuText(int paramInt, String paramString)
  {
    this.mController.updateOptionMenuText(paramInt, paramString);
  }

  public final void x(Drawable paramDrawable)
  {
    q localq = this.mController;
    if ((localq.mActionBar != null) && (localq.ylS != null) && (paramDrawable != null))
    {
      localq.ylS.setImageDrawable(paramDrawable);
      paramDrawable.invalidateSelf();
    }
  }

  public void xE(int paramInt)
  {
    this.mController.xE(paramInt);
  }

  public static abstract interface a
  {
    public abstract void c(int paramInt1, int paramInt2, Intent paramIntent);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMActivity
 * JD-Core Version:    0.6.2
 */