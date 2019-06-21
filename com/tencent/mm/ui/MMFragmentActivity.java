package com.tencent.mm.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import android.nfc.tech.NfcA;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.SwipeBackLayout.a;
import com.tencent.mm.ui.widget.h.a;
import com.tencent.mm.vending.e.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class MMFragmentActivity extends AppCompatActivity
  implements SwipeBackLayout.a, h.a, com.tencent.mm.vending.e.b
{
  public static final long ANIMATION_DURATION = 320L;
  public static final String EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM = "extra_use_system_default_enter_exit_anim";
  private static final String TAG = "MicroMsg.MMFragmentActivity";
  public static final float WIDTH_SETTLE_FACT = 3.5F;
  String className;
  private a mActivityAnimStyle;
  private View mContentViewForSwipeBack;
  private boolean mIsPaused;
  private com.tencent.mm.vending.a.a mLifeCycleKeeper;
  private b mNfcFilterHelper;
  private SwipeBackLayout mSwipeBackLayout;
  private boolean mSwiping;
  ArrayList<WeakReference<MMFragment>> record;

  public MMFragmentActivity()
  {
    AppMethodBeat.i(106054);
    this.record = new ArrayList();
    this.mLifeCycleKeeper = new com.tencent.mm.vending.a.a();
    this.mActivityAnimStyle = new a();
    this.mContentViewForSwipeBack = null;
    AppMethodBeat.o(106054);
  }

  public String appendMemLog()
  {
    AppMethodBeat.i(106057);
    long l1 = Runtime.getRuntime().totalMemory();
    long l2 = Runtime.getRuntime().freeMemory();
    String str = String.format("Runtime: [%s:%s:%s] Native: [%s:%s:%s] ", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l1 - l2), Long.valueOf(Debug.getNativeHeapSize()), Long.valueOf(Debug.getNativeHeapAllocatedSize()), Long.valueOf(Debug.getNativeHeapFreeSize()) });
    AppMethodBeat.o(106057);
    return str;
  }

  protected boolean convertActivityFromTranslucent()
  {
    return true;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(106100);
    boolean bool;
    if ((isSupportNavigationSwipeBack()) && (paramKeyEvent.getKeyCode() == 4) && (getSwipeBackLayout().dkx()))
    {
      ab.w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
      bool = true;
      AppMethodBeat.o(106100);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(106100);
    }
  }

  public boolean enableActivityAnimation()
  {
    boolean bool1 = false;
    AppMethodBeat.i(106079);
    Intent localIntent = getIntent();
    if (localIntent != null);
    for (boolean bool2 = localIntent.getBooleanExtra("extra_use_system_default_enter_exit_anim", false); ; bool2 = false)
    {
      if (bool2)
      {
        AppMethodBeat.o(106079);
        bool2 = bool1;
      }
      while (true)
      {
        return bool2;
        bool2 = true;
        AppMethodBeat.o(106079);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(106082);
    super.finish();
    initActivityCloseAnimation();
    AppMethodBeat.o(106082);
  }

  public boolean forceRemoveNoMatchOnPath()
  {
    return false;
  }

  public MMFragment getCurrentFragmet()
  {
    AppMethodBeat.i(106075);
    int i = this.record.size();
    MMFragment localMMFragment;
    if (i == 0)
    {
      AppMethodBeat.o(106075);
      localMMFragment = null;
    }
    while (true)
    {
      return localMMFragment;
      localMMFragment = (MMFragment)((WeakReference)this.record.get(i - 1)).get();
      if ((localMMFragment != null) && (localMMFragment.isShowing()))
      {
        AppMethodBeat.o(106075);
      }
      else
      {
        AppMethodBeat.o(106075);
        localMMFragment = null;
      }
    }
  }

  public Resources getResources()
  {
    AppMethodBeat.i(106096);
    Resources localResources;
    if ((ah.getContext().getAssets() != null) && (ah.getResources() != null))
    {
      localResources = ah.getResources();
      AppMethodBeat.o(106096);
    }
    while (true)
    {
      return localResources;
      localResources = super.getResources();
      AppMethodBeat.o(106096);
    }
  }

  public SwipeBackLayout getSwipeBackLayout()
  {
    return this.mSwipeBackLayout;
  }

  public Object getSystemService(String paramString)
  {
    AppMethodBeat.i(106095);
    if (("clipboard".equals(paramString)) && (getApplicationContext() != null))
    {
      paramString = getApplicationContext().getSystemService(paramString);
      AppMethodBeat.o(106095);
    }
    while (true)
    {
      return paramString;
      Object localObject = super.getSystemService(paramString);
      if ("layout_inflater".equals(paramString))
      {
        paramString = v.a((LayoutInflater)localObject);
        AppMethodBeat.o(106095);
      }
      else
      {
        AppMethodBeat.o(106095);
        paramString = localObject;
      }
    }
  }

  protected void initActivityCloseAnimation()
  {
    AppMethodBeat.i(106081);
    if (enableActivityAnimation())
      if (com.tencent.mm.ui.base.b.aE(getClass()))
      {
        super.overridePendingTransition(a.yni, a.ynj);
        AppMethodBeat.o(106081);
      }
    while (true)
    {
      return;
      if ((com.tencent.mm.ui.base.b.aB(getClass()) & 0x4) != 0);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label73;
        com.tencent.mm.ui.base.b.hM(this);
        AppMethodBeat.o(106081);
        break;
      }
      label73: com.tencent.mm.ui.base.b.hN(this);
      AppMethodBeat.o(106081);
    }
  }

  protected void initActivityOpenAnimation(Intent paramIntent)
  {
    AppMethodBeat.i(106080);
    int i;
    if (enableActivityAnimation())
      if (paramIntent == null)
      {
        paramIntent = null;
        if (paramIntent == null)
          break label97;
        paramIntent = com.tencent.mm.ui.base.b.d(paramIntent);
        if ((com.tencent.mm.ui.base.b.aqL(paramIntent) & 0x2) != 0)
          break label68;
        i = 1;
        label39: if (i == 0)
          break label73;
        super.overridePendingTransition(a.yng, a.ynh);
        AppMethodBeat.o(106080);
      }
    while (true)
    {
      return;
      paramIntent = paramIntent.getComponent();
      break;
      label68: i = 0;
      break label39;
      label73: if (!com.tencent.mm.ui.base.b.aqN(paramIntent))
      {
        com.tencent.mm.ui.base.b.hK(this);
        AppMethodBeat.o(106080);
      }
      else
      {
        com.tencent.mm.ui.base.b.hN(this);
        label97: AppMethodBeat.o(106080);
      }
    }
  }

  public boolean initNavigationSwipeBack()
  {
    boolean bool = true;
    AppMethodBeat.i(106093);
    if (com.tencent.mm.compatible.util.d.iW(19))
    {
      if ((!com.tencent.mm.ui.base.b.aD(getClass())) || (!convertActivityFromTranslucent()))
        break label62;
      if (al.isMainThread())
        com.tencent.mm.ui.base.b.au(this);
    }
    if (isSupportNavigationSwipeBack())
    {
      initSwipeBack();
      AppMethodBeat.o(106093);
    }
    while (true)
    {
      return bool;
      label62: if ((com.tencent.mm.ui.base.b.aB(getClass()) & 0x10) != 0);
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) || (!al.isMainThread()))
          break label97;
        com.tencent.mm.ui.base.b.au(this);
        break;
      }
      label97: break;
      AppMethodBeat.o(106093);
      bool = false;
    }
  }

  protected void initSwipeBack()
  {
    AppMethodBeat.i(106094);
    ViewGroup localViewGroup1 = (ViewGroup)getWindow().getDecorView();
    this.mSwipeBackLayout = ((SwipeBackLayout)LayoutInflater.from(this).inflate(2130970910, localViewGroup1, false));
    this.mSwipeBackLayout.init();
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    getWindow().getDecorView().setBackgroundDrawable(null);
    ViewGroup localViewGroup2 = (ViewGroup)localViewGroup1.getChildAt(0);
    localViewGroup2.setBackgroundResource(2131690597);
    localViewGroup1.removeView(localViewGroup2);
    this.mSwipeBackLayout.addView(localViewGroup2);
    this.mSwipeBackLayout.setContentView(localViewGroup2);
    localViewGroup1.addView(this.mSwipeBackLayout);
    this.mSwipeBackLayout.setSwipeGestureDelegate(this);
    AppMethodBeat.o(106094);
  }

  public boolean isHideStatusBar()
  {
    AppMethodBeat.i(106092);
    boolean bool;
    if ((com.tencent.mm.ui.base.b.aB(getClass()) & 0x20) != 0)
    {
      bool = true;
      AppMethodBeat.o(106092);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(106092);
    }
  }

  public boolean isPaused()
  {
    return this.mIsPaused;
  }

  public final boolean isSupportNavigationSwipeBack()
  {
    boolean bool = false;
    AppMethodBeat.i(106091);
    if ((com.tencent.mm.compatible.util.d.iW(19)) && (com.tencent.mm.compatible.i.b.Ml()))
      if ((supportNavigationSwipeBack()) && (com.tencent.mm.ui.base.b.aD(getClass())))
      {
        bool = true;
        AppMethodBeat.o(106091);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(106091);
      continue;
      AppMethodBeat.o(106091);
    }
  }

  public boolean isSwiping()
  {
    return this.mSwiping;
  }

  public void keep(com.tencent.mm.vending.e.a parama)
  {
    AppMethodBeat.i(106055);
    this.mLifeCycleKeeper.zWX.keep(parama);
    AppMethodBeat.o(106055);
  }

  public void onCancel()
  {
    this.mSwiping = false;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(106101);
    super.onConfigurationChanged(paramConfiguration);
    if (getSupportActionBar() != null)
    {
      paramConfiguration = (ViewGroup)findViewById(2131820939);
      if (paramConfiguration != null)
      {
        paramConfiguration = paramConfiguration.findViewById(2131820941);
        if ((paramConfiguration != null) && ((paramConfiguration instanceof Toolbar)))
        {
          Toolbar localToolbar = (Toolbar)paramConfiguration;
          paramConfiguration = localToolbar.getLayoutParams();
          if (paramConfiguration != null)
            paramConfiguration.height = com.tencent.mm.compatible.util.a.bG(this);
          localToolbar.setLayoutParams(paramConfiguration);
        }
      }
    }
    AppMethodBeat.o(106101);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(106056);
    this.className = getClass().getName();
    ac.bL(3, this.className);
    super.onCreate(paramBundle);
    this.mNfcFilterHelper = new b((byte)0);
    paramBundle = this.mNfcFilterHelper;
    try
    {
      paramBundle.ynk = NfcAdapter.getDefaultAdapter(paramBundle.yno);
      paramBundle.init();
      ab.i("MicroMsg.MMFragmentActivity", "checktask onCreate:%s#0x%x, taskid:%d, task:%s appendMemLog:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), bo.gU(this), appendMemLog() });
      AppMethodBeat.o(106056);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MMFragmentActivity", localThrowable, "", new Object[0]);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(106058);
    ab.i("MicroMsg.MMFragmentActivity", "checktask onDestroy:%s#0x%x task:%s appendMemLog:%s", new Object[] { getClass().getSimpleName(), Integer.valueOf(hashCode()), bo.gU(this), appendMemLog() });
    this.mLifeCycleKeeper.zWX.dead();
    super.onDestroy();
    if (("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER)) && (Build.VERSION.SDK_INT == 24));
    try
    {
      if (b.a.eOw == null)
      {
        localObject1 = Class.forName("android.rms.iaware.FastgrabConfigReader");
        b.a.eOw = (Class)localObject1;
        localObject1 = ((Class)localObject1).getDeclaredField("mFastgrabConfigReader");
        b.a.field_mFastgrabConfigReader = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
        localObject1 = b.a.eOw.getDeclaredField("mContext");
        b.a.field_mContext = (Field)localObject1;
        ((Field)localObject1).setAccessible(true);
      }
      Object localObject1 = b.a.field_mFastgrabConfigReader.get(b.a.eOw);
      if (b.a.field_mContext.get(localObject1) == this)
        b.a.field_mContext.set(localObject1, null);
      label168: if (("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER)) && (Build.VERSION.SDK_INT == 24));
      try
      {
        if (b.b.aIl == null)
        {
          localObject1 = Class.forName("android.gestureboost.GestureBoostManager");
          b.b.aIl = (Class)localObject1;
          localObject1 = ((Class)localObject1).getDeclaredField("sGestureBoostManager");
          b.b.eOx = (Field)localObject1;
          ((Field)localObject1).setAccessible(true);
          localObject1 = b.b.aIl.getDeclaredField("mContext");
          b.b.eOy = (Field)localObject1;
          ((Field)localObject1).setAccessible(true);
        }
        localObject1 = b.b.eOx.get(null);
        if (localObject1 != null)
          b.b.eOy.set(localObject1, null);
        try
        {
          label261: if ((Build.VERSION.SDK_INT >= 23) && (Build.MANUFACTURER.equalsIgnoreCase("samsung")))
          {
            Object localObject2 = ah.getContext().getSystemService(Class.forName("com.samsung.android.content.clipboard.SemClipboardManager"));
            localObject1 = localObject2.getClass().getDeclaredField("mContext");
            ((Field)localObject1).setAccessible(true);
            ((Field)localObject1).set(localObject2, ah.getContext());
          }
          label318: ab.i("MicroMsg.MMFragmentActivity", "Activity dump [%s]", new Object[] { com.tencent.mm.ac.a.SY() });
          AppMethodBeat.o(106058);
          return;
        }
        catch (Throwable localThrowable1)
        {
          break label318;
        }
      }
      catch (Throwable localThrowable2)
      {
        break label261;
      }
    }
    catch (Throwable localThrowable3)
    {
      break label168;
    }
  }

  public void onDrag()
  {
    this.mSwiping = true;
  }

  public void onPause()
  {
    AppMethodBeat.i(106061);
    ac.bL(2, this.className);
    this.mIsPaused = true;
    super.onPause();
    if (isSupportNavigationSwipeBack())
    {
      if (getSwipeBackLayout() != null)
        getSwipeBackLayout().setEnableGesture(false);
      if (!isFinishing())
        com.tencent.mm.ui.widget.h.a(this);
    }
    b localb;
    if (this.mNfcFilterHelper != null)
    {
      localb = this.mNfcFilterHelper;
      if (localb.ynk == null);
    }
    try
    {
      localb.ynk.disableForegroundDispatch(localb.yno);
      this.mLifeCycleKeeper.zWY.dead();
      AppMethodBeat.o(106061);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.MMFragmentActivity", "lo-nfc-onPause: exp:" + localException.getLocalizedMessage());
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(106062);
    ac.bL(1, this.className);
    this.mIsPaused = false;
    super.onResume();
    if (isSupportNavigationSwipeBack())
    {
      com.tencent.mm.ui.widget.h.b(this);
      onSwipe(1.0F);
      if (getSwipeBackLayout() != null)
      {
        getSwipeBackLayout().setEnableGesture(true);
        getSwipeBackLayout().zOp = false;
      }
    }
    b localb;
    if (this.mNfcFilterHelper != null)
    {
      localb = this.mNfcFilterHelper;
      if (localb.ynk != null)
        if ((localb.ynl == null) || (localb.ynm == null) || (localb.ynn == null))
          localb.init();
    }
    while (true)
    {
      try
      {
        localb.ynk.enableForegroundDispatch(localb.yno, localb.ynl, localb.ynm, localb.ynn);
        AppMethodBeat.o(106062);
        return;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMFragmentActivity", "lo-nfc-onResume: exp:" + localException.getLocalizedMessage());
      }
      AppMethodBeat.o(106062);
    }
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    AppMethodBeat.i(106076);
    if (Build.VERSION.SDK_INT < 11)
      super.onSaveInstanceState(paramBundle);
    AppMethodBeat.o(106076);
  }

  public void onSettle(boolean paramBoolean, int paramInt)
  {
    long l = 160L;
    AppMethodBeat.i(106098);
    ab.v("ashutest", "ashutest:: on settle %B, speed %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt) });
    if (this.mContentViewForSwipeBack == null)
      this.mContentViewForSwipeBack = ae.a(getWindow(), getSupportActionBar().getCustomView());
    View localView = this.mContentViewForSwipeBack;
    if (paramBoolean)
    {
      if (paramInt > 0);
      while (true)
      {
        com.tencent.mm.ui.tools.h.a(localView, l, 0.0F, null);
        AppMethodBeat.o(106098);
        return;
        l = 320L;
      }
    }
    if (paramInt > 0);
    while (true)
    {
      com.tencent.mm.ui.tools.h.a(localView, l, localView.getWidth() * -1 / 3.5F, null);
      AppMethodBeat.o(106098);
      break;
      l = 320L;
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(106060);
    super.onStart();
    AppMethodBeat.o(106060);
  }

  public void onStop()
  {
    AppMethodBeat.i(106059);
    this.mLifeCycleKeeper.zWZ.dead();
    super.onStop();
    AppMethodBeat.o(106059);
  }

  public void onSwipe(float paramFloat)
  {
    AppMethodBeat.i(106097);
    ab.v("ashutest", "ashutest::on swipe %f, duration %d", new Object[] { Float.valueOf(paramFloat), Long.valueOf(320L) });
    View localView;
    if (this.mContentViewForSwipeBack == null)
    {
      Window localWindow = getWindow();
      if (getSupportActionBar() != null)
      {
        localView = getSupportActionBar().getCustomView();
        this.mContentViewForSwipeBack = ae.a(localWindow, localView);
      }
    }
    else
    {
      localView = this.mContentViewForSwipeBack;
      if (Float.compare(1.0F, paramFloat) > 0)
        break label100;
      com.tencent.mm.ui.tools.h.s(localView, 0.0F);
      AppMethodBeat.o(106097);
    }
    while (true)
    {
      return;
      localView = null;
      break;
      label100: com.tencent.mm.ui.tools.h.s(localView, localView.getWidth() / 3.5F * (1.0F - paramFloat) * -1.0F);
      AppMethodBeat.o(106097);
    }
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(106099);
    if (!isFinishing())
      finish();
    getWindow().getDecorView().setVisibility(8);
    overridePendingTransition(0, 0);
    this.mSwiping = false;
    AppMethodBeat.o(106099);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public boolean popBackStackImmediate()
  {
    AppMethodBeat.i(106073);
    boolean bool;
    if (this.record.size() == 0)
    {
      bool = false;
      AppMethodBeat.o(106073);
    }
    while (true)
    {
      return bool;
      this.record.remove(this.record.size() - 1);
      bool = getSupportFragmentManager().popBackStackImmediate();
      AppMethodBeat.o(106073);
    }
  }

  public void putActivityCloseAnimation(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106078);
    if (enableActivityAnimation())
    {
      a.yni = paramInt1;
      a.ynj = paramInt2;
    }
    super.overridePendingTransition(paramInt1, paramInt2);
    AppMethodBeat.o(106078);
  }

  public void putActivityOpenAnimation(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106077);
    if (enableActivityAnimation())
    {
      a.yng = paramInt1;
      a.ynh = paramInt2;
    }
    super.overridePendingTransition(paramInt1, paramInt2);
    AppMethodBeat.o(106077);
  }

  @TargetApi(11)
  public void startActivities(Intent[] paramArrayOfIntent)
  {
    AppMethodBeat.i(106084);
    super.startActivities(paramArrayOfIntent);
    initActivityOpenAnimation(null);
    AppMethodBeat.o(106084);
  }

  @TargetApi(16)
  public void startActivities(Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(106083);
    if (d.a(this, this.mIsPaused, paramArrayOfIntent, new Object[] { paramBundle }))
      AppMethodBeat.o(106083);
    while (true)
    {
      return;
      super.startActivities(paramArrayOfIntent, paramBundle);
      initActivityOpenAnimation(null);
      AppMethodBeat.o(106083);
    }
  }

  public void startActivity(Intent paramIntent)
  {
    AppMethodBeat.i(106085);
    super.startActivity(paramIntent);
    initActivityOpenAnimation(paramIntent);
    AppMethodBeat.o(106085);
  }

  @TargetApi(16)
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(106086);
    super.startActivity(paramIntent, paramBundle);
    initActivityOpenAnimation(paramIntent);
    AppMethodBeat.o(106086);
  }

  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(106087);
    super.startActivityForResult(paramIntent, paramInt);
    initActivityOpenAnimation(paramIntent);
    AppMethodBeat.o(106087);
  }

  @TargetApi(16)
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(106088);
    if (d.a(this, this.mIsPaused, new Intent[] { paramIntent }, new Object[] { Integer.valueOf(paramInt), paramBundle }))
      AppMethodBeat.o(106088);
    while (true)
    {
      return;
      super.startActivityForResult(paramIntent, paramInt, paramBundle);
      initActivityOpenAnimation(paramIntent);
      AppMethodBeat.o(106088);
    }
  }

  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(106089);
    super.startActivityFromFragment(paramFragment, paramIntent, paramInt);
    initActivityOpenAnimation(paramIntent);
    AppMethodBeat.o(106089);
  }

  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(106090);
    if (d.a(this, this.mIsPaused, new Intent[] { paramIntent }, new Object[] { paramFragment, Integer.valueOf(paramInt) }))
      AppMethodBeat.o(106090);
    while (true)
    {
      return;
      super.startActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
      AppMethodBeat.o(106090);
    }
  }

  public void supportInvalidateOptionsMenu()
  {
    AppMethodBeat.i(106102);
    if ((getCurrentFragmet() != null) && (getCurrentFragmet().interceptSupportInvalidateOptionsMenu()))
      AppMethodBeat.o(106102);
    while (true)
    {
      return;
      super.supportInvalidateOptionsMenu();
      AppMethodBeat.o(106102);
    }
  }

  public boolean supportNavigationSwipeBack()
  {
    return true;
  }

  public void switchFragment(Fragment paramFragment, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(106074);
    if ((paramFragment == null) || (paramInt1 == 0))
    {
      AppMethodBeat.o(106074);
      return;
    }
    i locali = getSupportFragmentManager();
    m localm = locali.beginTransaction();
    if (paramBoolean2)
      localm.r(paramInt2, paramInt3);
    if (locali.findFragmentById(paramInt1) != null)
      if (paramFragment.isHidden())
        localm.b(paramFragment);
    while (true)
    {
      if (paramBoolean1)
        localm.dg();
      localm.commit();
      locali.executePendingTransactions();
      AppMethodBeat.o(106074);
      break;
      localm.a(paramInt1, paramFragment, paramFragment.getTag());
    }
  }

  public void switchFragmentActivity(Fragment paramFragment)
  {
    AppMethodBeat.i(106071);
    if (paramFragment == null)
      AppMethodBeat.o(106071);
    while (true)
    {
      return;
      switchFragmentActivity(paramFragment, paramFragment.getId());
      AppMethodBeat.o(106071);
    }
  }

  public void switchFragmentActivity(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(106072);
    switchFragment(paramFragment, paramInt, true, true, 2131034216, 2131034221);
    this.record.add(new WeakReference((MMFragment)paramFragment));
    AppMethodBeat.o(106072);
  }

  public void switchFragmentInternalBackwardWithAnim(Fragment paramFragment)
  {
    AppMethodBeat.i(106067);
    switchFragmentInternalBackwardWithAnim(paramFragment, paramFragment.getId());
    AppMethodBeat.o(106067);
  }

  public void switchFragmentInternalBackwardWithAnim(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(106068);
    switchFragment(paramFragment, paramInt, false, true, 2131034261, 2131034266);
    AppMethodBeat.o(106068);
  }

  public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment paramFragment, int paramInt, View paramView)
  {
    AppMethodBeat.i(106070);
    switchFragment(paramFragment, paramInt, false, true, 0, 2131034266);
    if (paramView == null)
      AppMethodBeat.o(106070);
    while (true)
    {
      return;
      paramFragment = AnimationUtils.loadAnimation(this, 2131034261);
      if (paramFragment != null)
        paramView.startAnimation(paramFragment);
      paramView.setVisibility(0);
      AppMethodBeat.o(106070);
    }
  }

  public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment paramFragment, View paramView)
  {
    AppMethodBeat.i(106069);
    if (paramFragment == null)
      AppMethodBeat.o(106069);
    while (true)
    {
      return;
      switchFragmentInternalBackwardWithAnimLeftSelfView(paramFragment, paramFragment.getId(), paramView);
      AppMethodBeat.o(106069);
    }
  }

  public void switchFragmentInternalFarwardWithAnim(Fragment paramFragment)
  {
    AppMethodBeat.i(106065);
    if (paramFragment == null)
      AppMethodBeat.o(106065);
    while (true)
    {
      return;
      switchFragmentInternalFarwardWithAnim(paramFragment, paramFragment.getId());
      AppMethodBeat.o(106065);
    }
  }

  public void switchFragmentInternalFarwardWithAnim(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(106066);
    switchFragment(paramFragment, paramInt, false, true, 2131034265, 2131034262);
    AppMethodBeat.o(106066);
  }

  public void switchFragmentInternalWithoutAnim(Fragment paramFragment)
  {
    AppMethodBeat.i(106063);
    if (paramFragment == null)
      AppMethodBeat.o(106063);
    while (true)
    {
      return;
      switchFragmentInternalWithoutAnim(paramFragment, paramFragment.getId());
      AppMethodBeat.o(106063);
    }
  }

  public void switchFragmentInternalWithoutAnim(Fragment paramFragment, int paramInt)
  {
    AppMethodBeat.i(106064);
    switchFragment(paramFragment, paramInt, false, false, 0, 0);
    AppMethodBeat.o(106064);
  }

  protected com.tencent.mm.vending.e.b theCreate()
  {
    return this.mLifeCycleKeeper.zWX;
  }

  protected com.tencent.mm.vending.e.b theResume()
  {
    return this.mLifeCycleKeeper.zWY;
  }

  protected com.tencent.mm.vending.e.b theStart()
  {
    return this.mLifeCycleKeeper.zWY;
  }

  public static final class a
  {
    public static int ync;
    public static int ynd;
    public static int yne;
    public static int ynf;
    public static int yng;
    public static int ynh;
    public static int yni;
    public static int ynj;

    static
    {
      int i = 2131034130;
      AppMethodBeat.i(106052);
      boolean bool1 = com.tencent.mm.compatible.util.d.iW(19);
      boolean bool2 = com.tencent.mm.compatible.i.b.Ml() & bool1;
      if (bool2)
      {
        j = 2131034265;
        ync = j;
        if (!bool2)
          break label102;
        j = 2131034262;
        label38: ynd = j;
        j = i;
        if (bool2)
          j = 2131034261;
        yne = j;
        if (!bool2)
          break label108;
      }
      label102: label108: for (int j = 2131034266; ; j = 2131034221)
      {
        ynf = j;
        yng = ync;
        ynh = ynd;
        yni = yne;
        ynj = ynf;
        AppMethodBeat.o(106052);
        return;
        j = 2131034216;
        break;
        j = 2131034130;
        break label38;
      }
    }

    public static void dyv()
    {
      int i = 2131034130;
      AppMethodBeat.i(106051);
      w localw = q.eth;
      boolean bool = w.Md();
      ab.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle swipbackType = ".concat(String.valueOf(bool)));
      if (!bool)
      {
        AppMethodBeat.o(106051);
        return;
      }
      bool = com.tencent.mm.compatible.util.d.iW(19);
      bool = com.tencent.mm.compatible.i.b.Ml() & bool;
      ab.i("MicroMsg.MMFragmentActivity", "lm: setAnimationStyle supportSwipe = ".concat(String.valueOf(bool)));
      if (bool)
      {
        j = 2131034265;
        label73: ync = j;
        if (!bool)
          break label150;
        j = 2131034262;
        label84: ynd = j;
        j = i;
        if (bool)
          j = 2131034261;
        yne = j;
        if (!bool)
          break label156;
      }
      label150: label156: for (int j = 2131034266; ; j = 2131034221)
      {
        ynf = j;
        yng = ync;
        ynh = ynd;
        yni = yne;
        ynj = ynf;
        AppMethodBeat.o(106051);
        break;
        j = 2131034216;
        break label73;
        j = 2131034130;
        break label84;
      }
    }
  }

  final class b
  {
    NfcAdapter ynk = null;
    PendingIntent ynl;
    IntentFilter[] ynm;
    String[][] ynn;

    private b()
    {
    }

    final void init()
    {
      AppMethodBeat.i(106053);
      Object localObject = new Intent();
      ((Intent)localObject).setClassName(ah.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI");
      ((Intent)localObject).addFlags(536870912);
      this.ynl = PendingIntent.getActivity(MMFragmentActivity.this, 0, (Intent)localObject, 0);
      IntentFilter localIntentFilter = new IntentFilter("android.nfc.action.NDEF_DISCOVERED");
      try
      {
        localIntentFilter.addDataType("*/*");
        localObject = new IntentFilter("android.nfc.action.TECH_DISCOVERED");
        ((IntentFilter)localObject).addDataScheme("vnd.android.nfc");
        this.ynm = new IntentFilter[] { localIntentFilter, localObject, new IntentFilter("android.nfc.action.TAG_DISCOVERED") };
        this.ynn = new String[][] { { NfcA.class.getName(), IsoDep.class.getName() } };
        AppMethodBeat.o(106053);
        return;
      }
      catch (IntentFilter.MalformedMimeTypeException localMalformedMimeTypeException)
      {
        RuntimeException localRuntimeException = new RuntimeException("fail", localMalformedMimeTypeException);
        AppMethodBeat.o(106053);
        throw localRuntimeException;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMFragmentActivity
 * JD-Core Version:    0.6.2
 */