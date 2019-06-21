package com.tencent.mm.plugin.expt.hellhound.core.v2.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Instrumentation.ActivityResult;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class HellInstrumentationHijack extends Instrumentation
{
  private e lMJ;
  Instrumentation lMK = null;

  HellInstrumentationHijack(e parame)
  {
    this.lMJ = parame;
  }

  @SuppressLint({"PrivateApi"})
  private Instrumentation.ActivityResult a(Context paramContext, IBinder paramIBinder1, IBinder paramIBinder2, Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73423);
    try
    {
      localMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", new Class[] { Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class });
      localMethod.setAccessible(true);
      if (this.lMK != null)
        ab.d("HellInstrumentationHijack", "execStartActivityOfSystem-0");
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        try
        {
          Method localMethod;
          paramContext = (Instrumentation.ActivityResult)localMethod.invoke(this.lMK, new Object[] { paramContext, paramIBinder1, paramIBinder2, paramActivity, paramIntent, Integer.valueOf(paramInt), paramBundle });
          AppMethodBeat.o(73423);
          return paramContext;
          paramContext = paramContext;
          ab.printErrStackTrace("HellInstrumentationHijack", paramContext, "execStartActivityOfSystem-0 crash", new Object[0]);
          h.pYm.a(932L, 27L, 1L, false);
          paramContext = null;
          AppMethodBeat.o(73423);
          continue;
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", paramContext, "execStartActivityOfSystem-1 crash", new Object[0]);
          ab.e("HellInstrumentationHijack", "gStartActivityRet-0: " + b.lMF);
          j(b.lMF, paramIntent);
          paramContext = null;
          AppMethodBeat.o(73423);
          continue;
        }
        paramContext = null;
        AppMethodBeat.o(73423);
      }
    }
  }

  @SuppressLint({"PrivateApi"})
  private Instrumentation.ActivityResult a(Context paramContext, IBinder paramIBinder1, IBinder paramIBinder2, String paramString, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73424);
    try
    {
      localMethod = Instrumentation.class.getDeclaredMethod("execStartActivity", new Class[] { Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class });
      localMethod.setAccessible(true);
      if (this.lMK == null);
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        try
        {
          Method localMethod;
          ab.d("HellInstrumentationHijack", "execStartActivityOfSystem-1");
          paramContext = (Instrumentation.ActivityResult)localMethod.invoke(this.lMK, new Object[] { paramContext, paramIBinder1, paramIBinder2, paramString, paramIntent, Integer.valueOf(paramInt), paramBundle });
          AppMethodBeat.o(73424);
          return paramContext;
          paramContext = paramContext;
          ab.printErrStackTrace("HellInstrumentationHijack", paramContext, "execStartActivityOfSystem-1-0", new Object[0]);
          AppMethodBeat.o(73424);
          paramContext = null;
          continue;
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", paramContext, "execStartActivityOfSystem-1-1", new Object[0]);
          ab.e("HellInstrumentationHijack", "gStartActivityRet-1: " + b.lMF);
          j(b.lMF, paramIntent);
          AppMethodBeat.o(73424);
          paramContext = null;
          continue;
        }
        AppMethodBeat.o(73424);
        paramContext = null;
      }
    }
  }

  private static void j(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(73425);
    try
    {
      Method localMethod = Instrumentation.class.getDeclaredMethod("checkStartActivityResult", new Class[] { Integer.TYPE, Object.class });
      localMethod.setAccessible(true);
      localMethod.invoke(null, new Object[] { Integer.valueOf(paramInt), paramObject });
      AppMethodBeat.o(73425);
      return;
    }
    catch (Exception paramObject)
    {
      while (true)
      {
        ab.printErrStackTrace("HellInstrumentationHijack", paramObject, "_checkStartActivityResult-0", new Object[0]);
        AppMethodBeat.o(73425);
      }
    }
  }

  private void u(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(73426);
    if ((paramContext == null) || (paramIntent == null))
    {
      AppMethodBeat.o(73426);
      return;
    }
    if ((paramContext instanceof Activity));
    for (paramContext = (Activity)paramContext; ; paramContext = null)
    {
      try
      {
        this.lMJ.a(paramContext, paramIntent);
        AppMethodBeat.o(73426);
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("HellInstrumentationHijack", paramContext, "Instru-callbackStartActivity callback exception", new Object[0]);
        AppMethodBeat.o(73426);
      }
      break;
    }
  }

  public void callActivityOnCreate(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(73412);
    ab.d("HellInstrumentationHijack", "Instru.callActivityOnCreate: " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.c(paramActivity.getIntent(), paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnCreate(paramActivity, paramBundle);
          AppMethodBeat.o(73412);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnCreate callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnCreate", new Object[0]);
          try
          {
            super.callActivityOnCreate(paramActivity, paramBundle);
            AppMethodBeat.o(73412);
          }
          catch (Exception paramActivity)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnCreate 1", new Object[0]);
            h.pYm.a(932L, 28L, 1L, false);
            AppMethodBeat.o(73412);
          }
          continue;
        }
        super.callActivityOnCreate(paramActivity, paramBundle);
        AppMethodBeat.o(73412);
      }
    }
  }

  public void callActivityOnCreate(Activity paramActivity, Bundle paramBundle, PersistableBundle paramPersistableBundle)
  {
    AppMethodBeat.i(73413);
    ab.d("HellInstrumentationHijack", "Instru.callActivityOnCreate activity: " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.c(paramActivity.getIntent(), paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          if (Build.VERSION.SDK_INT >= 21)
            this.lMK.callActivityOnCreate(paramActivity, paramBundle, paramPersistableBundle);
          AppMethodBeat.o(73413);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnCreate callback ", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnCreate ", new Object[0]);
          try
          {
            super.callActivityOnCreate(paramActivity, paramBundle, paramPersistableBundle);
            AppMethodBeat.o(73413);
          }
          catch (Exception paramActivity)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnCreate 2", new Object[0]);
            h.pYm.a(932L, 29L, 1L, false);
            AppMethodBeat.o(73413);
          }
          continue;
        }
        super.callActivityOnCreate(paramActivity, paramBundle, paramPersistableBundle);
        AppMethodBeat.o(73413);
      }
    }
  }

  public void callActivityOnDestroy(Activity paramActivity)
  {
    AppMethodBeat.i(73418);
    ab.d("HellInstrumentationHijack", "Instru-callActivityOnDestroy: activity = " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.J(paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnDestroy(paramActivity);
          AppMethodBeat.o(73418);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnDestroy callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnDestroy", new Object[0]);
          try
          {
            super.callActivityOnDestroy(paramActivity);
            AppMethodBeat.o(73418);
          }
          catch (Exception paramActivity)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", paramActivity, "Instru.callActivityOnDestroy 2", new Object[0]);
            AppMethodBeat.o(73418);
          }
          continue;
        }
        super.callActivityOnDestroy(paramActivity);
        AppMethodBeat.o(73418);
      }
    }
  }

  public void callActivityOnNewIntent(Activity paramActivity, Intent paramIntent)
  {
    AppMethodBeat.i(73414);
    ab.d("HellInstrumentationHijack", "Instru.callActivityOnNewIntent = " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.d(paramIntent, paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnNewIntent(paramActivity, paramIntent);
          AppMethodBeat.o(73414);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnNewIntent callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnNewIntent", new Object[0]);
          try
          {
            super.callActivityOnNewIntent(paramActivity, paramIntent);
            AppMethodBeat.o(73414);
          }
          catch (Exception paramActivity)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnNewIntent 2", new Object[0]);
            h.pYm.a(932L, 30L, 1L, false);
            AppMethodBeat.o(73414);
          }
          continue;
        }
        super.callActivityOnNewIntent(paramActivity, paramIntent);
        AppMethodBeat.o(73414);
      }
    }
  }

  public void callActivityOnPause(Activity paramActivity)
  {
    AppMethodBeat.i(73416);
    ab.d("HellInstrumentationHijack", "Instru-callActivityOnPause: activity = " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.H(paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnPause(paramActivity);
          AppMethodBeat.o(73416);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnResume callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnResume", new Object[0]);
        }
        super.callActivityOnPause(paramActivity);
        AppMethodBeat.o(73416);
      }
    }
  }

  public void callActivityOnResume(Activity paramActivity)
  {
    AppMethodBeat.i(73415);
    ab.d("HellInstrumentationHijack", "Instru-callActivityOnResume: " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.G(paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnResume(paramActivity);
          AppMethodBeat.o(73415);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnResume callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnResume", new Object[0]);
          try
          {
            super.callActivityOnResume(paramActivity);
            AppMethodBeat.o(73415);
          }
          catch (Exception localException3)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", localException3, "Instru.callActivityOnResume 2", new Object[0]);
            h.pYm.a(932L, 31L, 1L, false);
            ab.d("HellInstrumentationHijack", "Instru:sIsTopOfTaskRet = " + b.lME);
            try
            {
              Object localObject1 = Class.forName("android.app.Activity");
              Object localObject2 = ((Class)localObject1).getDeclaredField("mActivityTransitionState");
              ((Field)localObject2).setAccessible(true);
              Object localObject3 = ((Field)localObject2).get(paramActivity);
              localObject2 = Class.forName("android.app.ActivityTransitionState").getDeclaredMethod("onResume", new Class[] { Activity.class, Boolean.TYPE });
              ((Method)localObject2).setAccessible(true);
              ((Method)localObject2).invoke(localObject3, new Object[] { paramActivity, Boolean.valueOf(b.lME) });
              localObject1 = ((Class)localObject1).getDeclaredField("mCalled");
              ((Field)localObject1).setAccessible(true);
              ((Field)localObject1).set(paramActivity, Boolean.TRUE);
              AppMethodBeat.o(73415);
            }
            catch (Exception paramActivity)
            {
              ab.printErrStackTrace("HellInstrumentationHijack", paramActivity, "Instru:resume-e2", new Object[0]);
              h.pYm.a(932L, 81L, 1L, false);
              AppMethodBeat.o(73415);
            }
          }
          continue;
        }
        super.callActivityOnResume(paramActivity);
        AppMethodBeat.o(73415);
      }
    }
  }

  public void callActivityOnStop(Activity paramActivity)
  {
    AppMethodBeat.i(73417);
    ab.d("HellInstrumentationHijack", "Instru-callActivityOnStop: activity = " + paramActivity.getClass().getCanonicalName());
    try
    {
      if (this.lMJ != null)
        this.lMJ.I(paramActivity);
      if (this.lMK == null);
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.lMK.callActivityOnStop(paramActivity);
          AppMethodBeat.o(73417);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("HellInstrumentationHijack", localException1, "Instru.callActivityOnStop callback", new Object[0]);
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException2, "Instru.callActivityOnStop", new Object[0]);
          try
          {
            super.callActivityOnStop(paramActivity);
            AppMethodBeat.o(73417);
          }
          catch (Exception paramActivity)
          {
            ab.printErrStackTrace("HellInstrumentationHijack", paramActivity, "Instru.callActivityOnStop 2", new Object[0]);
            h.pYm.a(932L, 32L, 1L, false);
            AppMethodBeat.o(73417);
          }
          continue;
        }
        super.callActivityOnStop(paramActivity);
        AppMethodBeat.o(73417);
      }
    }
  }

  public Instrumentation.ActivityResult execStartActivity(Context paramContext, IBinder paramIBinder1, IBinder paramIBinder2, Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73421);
    ab.i("HellInstrumentationHijack", "execStartActivity-Activity-Target, fromActivity: " + paramContext.getClass().getCanonicalName());
    u(paramContext, paramIntent);
    paramContext = a(paramContext, paramIBinder1, paramIBinder2, paramActivity, paramIntent, paramInt, paramBundle);
    AppMethodBeat.o(73421);
    return paramContext;
  }

  public Instrumentation.ActivityResult execStartActivity(Context paramContext, IBinder paramIBinder1, IBinder paramIBinder2, String paramString, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(73422);
    ab.i("HellInstrumentationHijack", "execStartActivity-String-Target, fromActivity: " + paramContext.getClass().getCanonicalName());
    u(paramContext, paramIntent);
    paramContext = a(paramContext, paramIBinder1, paramIBinder2, paramString, paramIntent, paramInt, paramBundle);
    AppMethodBeat.o(73422);
    return paramContext;
  }

  public Activity newActivity(Class<?> paramClass, Context paramContext, IBinder paramIBinder, Application paramApplication, Intent paramIntent, ActivityInfo paramActivityInfo, CharSequence paramCharSequence, Activity paramActivity, String paramString, Object paramObject)
  {
    AppMethodBeat.i(73420);
    if (this.lMK != null);
    while (true)
    {
      try
      {
        Activity localActivity = this.lMK.newActivity(paramClass, paramContext, paramIBinder, paramApplication, paramIntent, paramActivityInfo, paramCharSequence, paramActivity, paramString, paramObject);
        paramClass = localActivity;
        AppMethodBeat.o(73420);
        return paramClass;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("HellInstrumentationHijack", localException, "Instru.newActivity crash", new Object[0]);
        try
        {
          paramClass = super.newActivity(paramClass, paramContext, paramIBinder, paramApplication, paramIntent, paramActivityInfo, paramCharSequence, paramActivity, paramString, paramObject);
          AppMethodBeat.o(73420);
        }
        catch (Exception paramClass)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException, "Instru.newActivity crash 2", new Object[0]);
          h.pYm.a(932L, 34L, 1L, false);
          paramClass = null;
          AppMethodBeat.o(73420);
        }
        continue;
      }
      paramClass = super.newActivity(paramClass, paramContext, paramIBinder, paramApplication, paramIntent, paramActivityInfo, paramCharSequence, paramActivity, paramString, paramObject);
      AppMethodBeat.o(73420);
    }
  }

  public Activity newActivity(ClassLoader paramClassLoader, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(73419);
    ab.d("HellInstrumentationHijack", "Instru-newActivity: ".concat(String.valueOf(paramString)));
    if (this.lMK != null);
    while (true)
    {
      try
      {
        Activity localActivity = this.lMK.newActivity(paramClassLoader, paramString, paramIntent);
        paramClassLoader = localActivity;
        AppMethodBeat.o(73419);
        return paramClassLoader;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("HellInstrumentationHijack", localException, "Instru.newActivity", new Object[0]);
        try
        {
          paramClassLoader = super.newActivity(paramClassLoader, paramString, paramIntent);
          AppMethodBeat.o(73419);
        }
        catch (Exception paramClassLoader)
        {
          ab.printErrStackTrace("HellInstrumentationHijack", localException, "Instru.newActivity 1", new Object[0]);
          h.pYm.a(932L, 33L, 1L, false);
          paramClassLoader = null;
          AppMethodBeat.o(73419);
        }
        continue;
      }
      paramClassLoader = super.newActivity(paramClassLoader, paramString, paramIntent);
      AppMethodBeat.o(73419);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.HellInstrumentationHijack
 * JD-Core Version:    0.6.2
 */