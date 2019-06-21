package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.f.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class zzif extends zzhh
{

  @VisibleForTesting
  protected zzie zzaol;
  private volatile zzie zzaom;
  private zzie zzaon;
  private long zzaoo;
  private final Map<Activity, zzie> zzaop;
  private zzie zzaoq;
  private String zzaor;

  public zzif(zzgl paramzzgl)
  {
    super(paramzzgl);
    AppMethodBeat.i(69240);
    this.zzaop = new a();
    AppMethodBeat.o(69240);
  }

  private final void zza(Activity paramActivity, zzie paramzzie, boolean paramBoolean)
  {
    AppMethodBeat.i(69243);
    if (this.zzaom == null);
    for (zzie localzzie1 = this.zzaon; ; localzzie1 = this.zzaom)
    {
      zzie localzzie2 = paramzzie;
      if (paramzzie.zzaoi == null)
        localzzie2 = new zzie(paramzzie.zzul, zzca(paramActivity.getClass().getCanonicalName()), paramzzie.zzaoj);
      this.zzaon = this.zzaom;
      this.zzaoo = zzbt().elapsedRealtime();
      this.zzaom = localzzie2;
      zzgd().zzc(new zzig(this, paramBoolean, localzzie1, localzzie2));
      AppMethodBeat.o(69243);
      return;
    }
  }

  private final void zza(zzie paramzzie)
  {
    AppMethodBeat.i(69244);
    zzft().zzk(zzbt().elapsedRealtime());
    if (zzgc().zzl(paramzzie.zzaok))
      paramzzie.zzaok = false;
    AppMethodBeat.o(69244);
  }

  public static void zza(zzie paramzzie, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(69245);
    if ((paramBundle != null) && (paramzzie != null) && ((!paramBundle.containsKey("_sc")) || (paramBoolean)))
      if (paramzzie.zzul != null)
      {
        paramBundle.putString("_sn", paramzzie.zzul);
        paramBundle.putString("_sc", paramzzie.zzaoi);
        paramBundle.putLong("_si", paramzzie.zzaoj);
        AppMethodBeat.o(69245);
      }
    while (true)
    {
      return;
      paramBundle.remove("_sn");
      break;
      if ((paramBundle != null) && (paramzzie == null) && (paramBoolean))
      {
        paramBundle.remove("_sn");
        paramBundle.remove("_sc");
        paramBundle.remove("_si");
      }
      AppMethodBeat.o(69245);
    }
  }

  @VisibleForTesting
  private static String zzca(String paramString)
  {
    AppMethodBeat.i(69247);
    paramString = paramString.split("\\.");
    if (paramString.length > 0)
    {
      paramString = paramString[(paramString.length - 1)];
      if (paramString.length() <= 100)
        break label54;
      paramString = paramString.substring(0, 100);
      AppMethodBeat.o(69247);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      break;
      label54: AppMethodBeat.o(69247);
    }
  }

  private final zzie zze(Activity paramActivity)
  {
    AppMethodBeat.i(69248);
    Preconditions.checkNotNull(paramActivity);
    zzie localzzie1 = (zzie)this.zzaop.get(paramActivity);
    zzie localzzie2 = localzzie1;
    if (localzzie1 == null)
    {
      localzzie2 = new zzie(null, zzca(paramActivity.getClass().getCanonicalName()), zzgb().zzlb());
      this.zzaop.put(paramActivity, localzzie2);
    }
    AppMethodBeat.o(69248);
    return localzzie2;
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(69249);
    if (paramBundle == null)
      AppMethodBeat.o(69249);
    while (true)
    {
      return;
      paramBundle = paramBundle.getBundle("com.google.firebase.analytics.screen_service");
      if (paramBundle == null)
      {
        AppMethodBeat.o(69249);
      }
      else
      {
        paramBundle = new zzie(paramBundle.getString("name"), paramBundle.getString("referrer_name"), paramBundle.getLong("id"));
        this.zzaop.put(paramActivity, paramBundle);
        AppMethodBeat.o(69249);
      }
    }
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(69253);
    this.zzaop.remove(paramActivity);
    AppMethodBeat.o(69253);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(69251);
    paramActivity = zze(paramActivity);
    this.zzaon = this.zzaom;
    this.zzaoo = zzbt().elapsedRealtime();
    this.zzaom = null;
    zzgd().zzc(new zzih(this, paramActivity));
    AppMethodBeat.o(69251);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(69250);
    zza(paramActivity, zze(paramActivity), false);
    paramActivity = zzft();
    long l = paramActivity.zzbt().elapsedRealtime();
    paramActivity.zzgd().zzc(new zzdx(paramActivity, l));
    AppMethodBeat.o(69250);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(69252);
    if (paramBundle == null)
      AppMethodBeat.o(69252);
    while (true)
    {
      return;
      zzie localzzie = (zzie)this.zzaop.get(paramActivity);
      if (localzzie == null)
      {
        AppMethodBeat.o(69252);
      }
      else
      {
        paramActivity = new Bundle();
        paramActivity.putLong("id", localzzie.zzaoj);
        paramActivity.putString("name", localzzie.zzul);
        paramActivity.putString("referrer_name", localzzie.zzaoi);
        paramBundle.putBundle("com.google.firebase.analytics.screen_service", paramActivity);
        AppMethodBeat.o(69252);
      }
    }
  }

  public final void setCurrentScreen(Activity paramActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(69242);
    zzgd();
    if (!zzgg.isMainThread())
    {
      zzge().zzip().log("setCurrentScreen must be called from the main thread");
      AppMethodBeat.o(69242);
    }
    String str;
    while (true)
    {
      return;
      if (this.zzaom == null)
      {
        zzge().zzip().log("setCurrentScreen cannot be called while no activity active");
        AppMethodBeat.o(69242);
      }
      else if (this.zzaop.get(paramActivity) == null)
      {
        zzge().zzip().log("setCurrentScreen must be called with an activity in the activity lifecycle");
        AppMethodBeat.o(69242);
      }
      else
      {
        str = paramString2;
        if (paramString2 == null)
          str = zzca(paramActivity.getClass().getCanonicalName());
        boolean bool1 = this.zzaom.zzaoi.equals(str);
        boolean bool2 = zzka.zzs(this.zzaom.zzul, paramString1);
        if ((bool1) && (bool2))
        {
          zzge().zziq().log("setCurrentScreen cannot be called with the same class and name");
          AppMethodBeat.o(69242);
        }
        else if ((paramString1 != null) && ((paramString1.length() <= 0) || (paramString1.length() > 100)))
        {
          zzge().zzip().zzg("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(paramString1.length()));
          AppMethodBeat.o(69242);
        }
        else
        {
          if ((str == null) || ((str.length() > 0) && (str.length() <= 100)))
            break;
          zzge().zzip().zzg("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
          AppMethodBeat.o(69242);
        }
      }
    }
    zzfi localzzfi = zzge().zzit();
    if (paramString1 == null);
    for (paramString2 = "null"; ; paramString2 = paramString1)
    {
      localzzfi.zze("Setting current screen to name, class", paramString2, str);
      paramString1 = new zzie(paramString1, str, zzgb().zzlb());
      this.zzaop.put(paramActivity, paramString1);
      zza(paramActivity, paramString1, true);
      AppMethodBeat.o(69242);
      break;
    }
  }

  public final void zza(String paramString, zzie paramzzie)
  {
    AppMethodBeat.i(69246);
    zzab();
    try
    {
      if ((this.zzaor == null) || (this.zzaor.equals(paramString)) || (paramzzie != null))
      {
        this.zzaor = paramString;
        this.zzaoq = paramzzie;
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(69246);
    }
    throw paramString;
  }

  protected final boolean zzhf()
  {
    return false;
  }

  public final zzie zzkc()
  {
    AppMethodBeat.i(69241);
    zzch();
    zzab();
    zzie localzzie = this.zzaol;
    AppMethodBeat.o(69241);
    return localzzie;
  }

  public final zzie zzkd()
  {
    return this.zzaom;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzif
 * JD-Core Version:    0.6.2
 */