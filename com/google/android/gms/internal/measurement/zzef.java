package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzef extends zzhg
{
  private zzeh zzaet = zzeg.zzaeu;
  private Boolean zzxz;

  zzef(zzgl paramzzgl)
  {
    super(paramzzgl);
  }

  public static long zzhh()
  {
    AppMethodBeat.i(68604);
    long l = ((Long)zzew.zzahl.get()).longValue();
    AppMethodBeat.o(68604);
    return l;
  }

  public static long zzhi()
  {
    AppMethodBeat.i(68605);
    long l = ((Long)zzew.zzagl.get()).longValue();
    AppMethodBeat.o(68605);
    return l;
  }

  public static boolean zzhk()
  {
    AppMethodBeat.i(68607);
    boolean bool = ((Boolean)zzew.zzagh.get()).booleanValue();
    AppMethodBeat.o(68607);
    return bool;
  }

  public final long zza(String paramString, zzex<Long> paramzzex)
  {
    AppMethodBeat.i(68598);
    long l;
    if (paramString == null)
    {
      l = ((Long)paramzzex.get()).longValue();
      AppMethodBeat.o(68598);
    }
    while (true)
    {
      return l;
      paramString = this.zzaet.zze(paramString, paramzzex.getKey());
      if (TextUtils.isEmpty(paramString))
      {
        l = ((Long)paramzzex.get()).longValue();
        AppMethodBeat.o(68598);
      }
      else
      {
        try
        {
          l = ((Long)paramzzex.get(Long.valueOf(Long.parseLong(paramString)))).longValue();
          AppMethodBeat.o(68598);
        }
        catch (NumberFormatException paramString)
        {
          l = ((Long)paramzzex.get()).longValue();
          AppMethodBeat.o(68598);
        }
      }
    }
  }

  final void zza(zzeh paramzzeh)
  {
    this.zzaet = paramzzeh;
  }

  public final int zzar(String paramString)
  {
    AppMethodBeat.i(68596);
    int i = zzb(paramString, zzew.zzagw);
    AppMethodBeat.o(68596);
    return i;
  }

  @VisibleForTesting
  final Boolean zzas(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(68602);
    Preconditions.checkNotEmpty(paramString);
    try
    {
      if (getContext().getPackageManager() == null)
      {
        zzge().zzim().log("Failed to load metadata: PackageManager is null");
        AppMethodBeat.o(68602);
        paramString = localObject;
      }
      while (true)
      {
        return paramString;
        ApplicationInfo localApplicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
        if (localApplicationInfo == null)
        {
          zzge().zzim().log("Failed to load metadata: ApplicationInfo is null");
          AppMethodBeat.o(68602);
          paramString = localObject;
        }
        else if (localApplicationInfo.metaData == null)
        {
          zzge().zzim().log("Failed to load metadata: Metadata bundle is null");
          AppMethodBeat.o(68602);
          paramString = localObject;
        }
        else
        {
          boolean bool = localApplicationInfo.metaData.containsKey(paramString);
          if (!bool)
          {
            AppMethodBeat.o(68602);
            paramString = localObject;
          }
          else
          {
            bool = localApplicationInfo.metaData.getBoolean(paramString);
            paramString = Boolean.valueOf(bool);
            AppMethodBeat.o(68602);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      while (true)
      {
        zzge().zzim().zzg("Failed to load metadata: Package name not found", paramString);
        AppMethodBeat.o(68602);
        paramString = localObject;
      }
    }
  }

  public final boolean zzat(String paramString)
  {
    AppMethodBeat.i(68608);
    boolean bool = "1".equals(this.zzaet.zze(paramString, "gaia_collection_enabled"));
    AppMethodBeat.o(68608);
    return bool;
  }

  public final boolean zzau(String paramString)
  {
    AppMethodBeat.i(68609);
    boolean bool = "1".equals(this.zzaet.zze(paramString, "measurement.event_sampling_enabled"));
    AppMethodBeat.o(68609);
    return bool;
  }

  final boolean zzav(String paramString)
  {
    AppMethodBeat.i(68610);
    boolean bool = zzd(paramString, zzew.zzahu);
    AppMethodBeat.o(68610);
    return bool;
  }

  final boolean zzaw(String paramString)
  {
    AppMethodBeat.i(68611);
    boolean bool = zzd(paramString, zzew.zzahw);
    AppMethodBeat.o(68611);
    return bool;
  }

  final boolean zzax(String paramString)
  {
    AppMethodBeat.i(68612);
    boolean bool = zzd(paramString, zzew.zzahx);
    AppMethodBeat.o(68612);
    return bool;
  }

  final boolean zzay(String paramString)
  {
    AppMethodBeat.i(68615);
    boolean bool = zzd(paramString, zzew.zzahy);
    AppMethodBeat.o(68615);
    return bool;
  }

  final boolean zzaz(String paramString)
  {
    AppMethodBeat.i(68616);
    boolean bool = zzd(paramString, zzew.zzahz);
    AppMethodBeat.o(68616);
    return bool;
  }

  public final int zzb(String paramString, zzex<Integer> paramzzex)
  {
    AppMethodBeat.i(68599);
    int i;
    if (paramString == null)
    {
      i = ((Integer)paramzzex.get()).intValue();
      AppMethodBeat.o(68599);
    }
    while (true)
    {
      return i;
      paramString = this.zzaet.zze(paramString, paramzzex.getKey());
      if (TextUtils.isEmpty(paramString))
      {
        i = ((Integer)paramzzex.get()).intValue();
        AppMethodBeat.o(68599);
      }
      else
      {
        try
        {
          i = ((Integer)paramzzex.get(Integer.valueOf(Integer.parseInt(paramString)))).intValue();
          AppMethodBeat.o(68599);
        }
        catch (NumberFormatException paramString)
        {
          i = ((Integer)paramzzex.get()).intValue();
          AppMethodBeat.o(68599);
        }
      }
    }
  }

  final boolean zzba(String paramString)
  {
    AppMethodBeat.i(68617);
    boolean bool = zzd(paramString, zzew.zzaic);
    AppMethodBeat.o(68617);
    return bool;
  }

  public final double zzc(String paramString, zzex<Double> paramzzex)
  {
    AppMethodBeat.i(68600);
    double d;
    if (paramString == null)
    {
      d = ((Double)paramzzex.get()).doubleValue();
      AppMethodBeat.o(68600);
    }
    while (true)
    {
      return d;
      paramString = this.zzaet.zze(paramString, paramzzex.getKey());
      if (TextUtils.isEmpty(paramString))
      {
        d = ((Double)paramzzex.get()).doubleValue();
        AppMethodBeat.o(68600);
      }
      else
      {
        try
        {
          d = ((Double)paramzzex.get(Double.valueOf(Double.parseDouble(paramString)))).doubleValue();
          AppMethodBeat.o(68600);
        }
        catch (NumberFormatException paramString)
        {
          d = ((Double)paramzzex.get()).doubleValue();
          AppMethodBeat.o(68600);
        }
      }
    }
  }

  public final boolean zzd(String paramString, zzex<Boolean> paramzzex)
  {
    AppMethodBeat.i(68601);
    boolean bool;
    if (paramString == null)
    {
      bool = ((Boolean)paramzzex.get()).booleanValue();
      AppMethodBeat.o(68601);
    }
    while (true)
    {
      return bool;
      paramString = this.zzaet.zze(paramString, paramzzex.getKey());
      if (TextUtils.isEmpty(paramString))
      {
        bool = ((Boolean)paramzzex.get()).booleanValue();
        AppMethodBeat.o(68601);
      }
      else
      {
        bool = ((Boolean)paramzzex.get(Boolean.valueOf(Boolean.parseBoolean(paramString)))).booleanValue();
        AppMethodBeat.o(68601);
      }
    }
  }

  public final boolean zzds()
  {
    AppMethodBeat.i(68597);
    if (this.zzxz == null);
    try
    {
      if (this.zzxz == null)
      {
        Object localObject1 = getContext().getApplicationInfo();
        String str = ProcessUtils.getMyProcessName();
        if (localObject1 != null)
        {
          localObject1 = ((ApplicationInfo)localObject1).processName;
          if ((localObject1 == null) || (!((String)localObject1).equals(str)))
            break label110;
        }
      }
      label110: for (boolean bool = true; ; bool = false)
      {
        this.zzxz = Boolean.valueOf(bool);
        if (this.zzxz == null)
        {
          this.zzxz = Boolean.TRUE;
          zzge().zzim().log("My process not in the list of running processes");
        }
        bool = this.zzxz.booleanValue();
        AppMethodBeat.o(68597);
        return bool;
      }
    }
    finally
    {
      AppMethodBeat.o(68597);
    }
  }

  public final boolean zzhg()
  {
    AppMethodBeat.i(68603);
    Boolean localBoolean = zzas("firebase_analytics_collection_deactivated");
    boolean bool;
    if ((localBoolean != null) && (localBoolean.booleanValue()))
    {
      bool = true;
      AppMethodBeat.o(68603);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(68603);
    }
  }

  public final String zzhj()
  {
    AppMethodBeat.i(68606);
    try
    {
      String str1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { "debug.firebase.analytics.app", "" });
      AppMethodBeat.o(68606);
      return str1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        zzge().zzim().zzg("Could not find SystemProperties class", localClassNotFoundException);
        String str2 = "";
        AppMethodBeat.o(68606);
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
        zzge().zzim().zzg("Could not find SystemProperties.get() method", localNoSuchMethodException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        zzge().zzim().zzg("Could not access SystemProperties.get()", localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      while (true)
        zzge().zzim().zzg("SystemProperties.get() threw an exception", localInvocationTargetException);
    }
  }

  final boolean zzhl()
  {
    AppMethodBeat.i(68613);
    boolean bool = zzd(zzfv().zzah(), zzew.zzahp);
    AppMethodBeat.o(68613);
    return bool;
  }

  final String zzhm()
  {
    AppMethodBeat.i(68614);
    String str = zzfv().zzah();
    Object localObject = zzew.zzahq;
    if (str == null)
    {
      localObject = (String)((zzex)localObject).get();
      AppMethodBeat.o(68614);
    }
    while (true)
    {
      return localObject;
      localObject = (String)((zzex)localObject).get(this.zzaet.zze(str, ((zzex)localObject).getKey()));
      AppMethodBeat.o(68614);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzef
 * JD-Core Version:    0.6.2
 */