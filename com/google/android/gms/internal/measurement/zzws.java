package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.support.v4.content.f;
import javax.annotation.Nullable;

public abstract class zzws<T>
{
  private static final Object zzbnc = new Object();
  private static boolean zzbnd = false;
  private static volatile Boolean zzbne = null;
  private static volatile Boolean zzbnf = null;

  @SuppressLint({"StaticFieldLeak"})
  private static Context zzqx = null;
  private final zzxc zzbng;
  final String zzbnh;
  private final String zzbni;
  private final T zzbnj;
  private T zzbnk = null;
  private volatile zzwp zzbnl = null;
  private volatile SharedPreferences zzbnm = null;

  private zzws(zzxc paramzzxc, String paramString, T paramT)
  {
    if (zzxc.zza(paramzzxc) == null)
      throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    this.zzbng = paramzzxc;
    String str1 = String.valueOf(zzxc.zzb(paramzzxc));
    String str2 = String.valueOf(paramString);
    if (str2.length() != 0)
    {
      str2 = str1.concat(str2);
      this.zzbni = str2;
      paramzzxc = String.valueOf(zzxc.zzc(paramzzxc));
      paramString = String.valueOf(paramString);
      if (paramString.length() == 0)
        break label130;
    }
    label130: for (paramzzxc = paramzzxc.concat(paramString); ; paramzzxc = new String(paramzzxc))
    {
      this.zzbnh = paramzzxc;
      this.zzbnj = paramT;
      return;
      str2 = new String(str1);
      break;
    }
  }

  public static void init(Context paramContext)
  {
    synchronized (zzbnc)
    {
      if ((Build.VERSION.SDK_INT >= 24) && (paramContext.isDeviceProtectedStorage()));
      Context localContext;
      do
      {
        if (zzqx != paramContext)
          zzbne = null;
        zzqx = paramContext;
        zzbnd = false;
        return;
        localContext = paramContext.getApplicationContext();
      }
      while (localContext == null);
      paramContext = localContext;
    }
  }

  private static zzws<Double> zza(zzxc paramzzxc, String paramString, double paramDouble)
  {
    return new zzwz(paramzzxc, paramString, Double.valueOf(paramDouble));
  }

  private static zzws<Integer> zza(zzxc paramzzxc, String paramString, int paramInt)
  {
    return new zzwx(paramzzxc, paramString, Integer.valueOf(paramInt));
  }

  private static zzws<Long> zza(zzxc paramzzxc, String paramString, long paramLong)
  {
    return new zzww(paramzzxc, paramString, Long.valueOf(paramLong));
  }

  private static zzws<String> zza(zzxc paramzzxc, String paramString1, String paramString2)
  {
    return new zzxa(paramzzxc, paramString1, paramString2);
  }

  private static zzws<Boolean> zza(zzxc paramzzxc, String paramString, boolean paramBoolean)
  {
    return new zzwy(paramzzxc, paramString, Boolean.valueOf(paramBoolean));
  }

  private static <V> V zza(zzxb<V> paramzzxb)
  {
    try
    {
      Object localObject = paramzzxb.zzsc();
      paramzzxb = localObject;
      return paramzzxb;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
      {
        long l = Binder.clearCallingIdentity();
        try
        {
          paramzzxb = paramzzxb.zzsc();
          Binder.restoreCallingIdentity(l);
        }
        finally
        {
          Binder.restoreCallingIdentity(l);
        }
      }
    }
  }

  static boolean zzd(String paramString, boolean paramBoolean)
  {
    try
    {
      zzwv localzzwv;
      if (zzsa())
      {
        localzzwv = new com/google/android/gms/internal/measurement/zzwv;
        localzzwv.<init>(paramString, false);
      }
      for (paramBoolean = ((Boolean)zza(localzzwv)).booleanValue(); ; paramBoolean = false)
        return paramBoolean;
    }
    catch (SecurityException paramString)
    {
      while (true)
        paramBoolean = false;
    }
  }

  @Nullable
  @TargetApi(24)
  private final T zzry()
  {
    Object localObject;
    if (!zzd("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false))
    {
      if (zzxc.zza(this.zzbng) != null)
      {
        if (this.zzbnl == null)
          this.zzbnl = zzwp.zza(zzqx.getContentResolver(), zzxc.zza(this.zzbng));
        localObject = (String)zza(new zzwt(this, this.zzbnl));
        if (localObject != null)
        {
          localObject = zzey((String)localObject);
          return localObject;
        }
      }
    }
    else
    {
      localObject = String.valueOf(this.zzbnh);
      if (((String)localObject).length() == 0)
        break label104;
      "Bypass reading Phenotype values for flag: ".concat((String)localObject);
    }
    while (true)
    {
      localObject = null;
      break;
      label104: new String("Bypass reading Phenotype values for flag: ");
    }
  }

  @Nullable
  private final T zzrz()
  {
    String str;
    if (zzsa())
    {
      try
      {
        Object localObject = new com/google/android/gms/internal/measurement/zzwu;
        ((zzwu)localObject).<init>(this);
        localObject = (String)zza((zzxb)localObject);
        if (localObject == null)
          break label59;
        localObject = zzey((String)localObject);
        return localObject;
      }
      catch (SecurityException localSecurityException)
      {
        str = String.valueOf(this.zzbnh);
        if (str.length() == 0)
          break label64;
      }
      "Unable to read GServices for flag: ".concat(str);
    }
    while (true)
    {
      label59: str = null;
      break;
      label64: new String("Unable to read GServices for flag: ");
    }
  }

  private static boolean zzsa()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (zzbne == null)
    {
      if (zzqx != null)
      {
        bool1 = bool2;
        if (f.f(zzqx, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0)
          bool1 = true;
        zzbne = Boolean.valueOf(bool1);
      }
    }
    else
      bool1 = zzbne.booleanValue();
    return bool1;
  }

  public final T get()
  {
    if (zzqx == null)
      throw new IllegalStateException("Must call PhenotypeFlag.init() first");
    Object localObject1 = zzry();
    if (localObject1 != null);
    while (true)
    {
      return localObject1;
      Object localObject2 = zzrz();
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = this.zzbnj;
    }
  }

  protected abstract T zzey(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzws
 * JD-Core Version:    0.6.2
 */