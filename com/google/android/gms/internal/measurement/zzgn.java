package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzgn extends zzez
{
  private final zzjr zzajp;
  private Boolean zzanc;
  private String zzand;

  public zzgn(zzjr paramzzjr)
  {
    this(paramzzjr, null);
  }

  private zzgn(zzjr paramzzjr, String paramString)
  {
    AppMethodBeat.i(69090);
    Preconditions.checkNotNull(paramzzjr);
    this.zzajp = paramzzjr;
    this.zzand = null;
    AppMethodBeat.o(69090);
  }

  private final void zzb(zzdz paramzzdz, boolean paramBoolean)
  {
    AppMethodBeat.i(69098);
    Preconditions.checkNotNull(paramzzdz);
    zzc(paramzzdz.packageName, false);
    this.zzajp.zzgb().zzcg(paramzzdz.zzadm);
    AppMethodBeat.o(69098);
  }

  private final void zzc(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(69099);
    if (TextUtils.isEmpty(paramString))
    {
      this.zzajp.zzge().zzim().log("Measurement Service called without app package");
      paramString = new SecurityException("Measurement Service called without app package");
      AppMethodBeat.o(69099);
      throw paramString;
    }
    if (paramBoolean);
    try
    {
      if (this.zzanc == null)
      {
        if ((!"com.google.android.gms".equals(this.zzand)) && (!UidVerifier.isGooglePlayServicesUid(this.zzajp.getContext(), Binder.getCallingUid())))
        {
          paramBoolean = bool;
          if (!GoogleSignatureVerifier.getInstance(this.zzajp.getContext()).isUidGoogleSigned(Binder.getCallingUid()));
        }
        else
        {
          paramBoolean = true;
        }
        this.zzanc = Boolean.valueOf(paramBoolean);
      }
      if (!this.zzanc.booleanValue())
      {
        if ((this.zzand == null) && (GooglePlayServicesUtilLight.uidHasPackageName(this.zzajp.getContext(), Binder.getCallingUid(), paramString)))
          this.zzand = paramString;
        if (!paramString.equals(this.zzand))
        {
          SecurityException localSecurityException1 = new java/lang/SecurityException;
          localSecurityException1.<init>(String.format("Unknown calling package name '%s'.", new Object[] { paramString }));
          AppMethodBeat.o(69099);
          throw localSecurityException1;
        }
      }
    }
    catch (SecurityException localSecurityException2)
    {
      this.zzajp.zzge().zzim().zzg("Measurement Service called with invalid calling package. appId", zzfg.zzbm(paramString));
      AppMethodBeat.o(69099);
      throw localSecurityException2;
    }
    AppMethodBeat.o(69099);
  }

  @VisibleForTesting
  private final void zze(Runnable paramRunnable)
  {
    AppMethodBeat.i(69109);
    Preconditions.checkNotNull(paramRunnable);
    if ((((Boolean)zzew.zzaia.get()).booleanValue()) && (this.zzajp.zzgd().zzjk()))
    {
      paramRunnable.run();
      AppMethodBeat.o(69109);
    }
    while (true)
    {
      return;
      this.zzajp.zzgd().zzc(paramRunnable);
      AppMethodBeat.o(69109);
    }
  }

  public final List<zzjx> zza(zzdz paramzzdz, boolean paramBoolean)
  {
    AppMethodBeat.i(69096);
    zzb(paramzzdz, false);
    Object localObject1 = this.zzajp.zzgd().zzb(new zzhd(this, paramzzdz));
    try
    {
      Object localObject2 = (List)((Future)localObject1).get();
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(((List)localObject2).size());
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        zzjz localzzjz = (zzjz)((Iterator)localObject2).next();
        if ((paramBoolean) || (!zzka.zzci(localzzjz.name)))
        {
          zzjx localzzjx = new com/google/android/gms/internal/measurement/zzjx;
          localzzjx.<init>(localzzjz);
          ((List)localObject1).add(localzzjx);
        }
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", zzfg.zzbm(paramzzdz.packageName), localInterruptedException);
      paramzzdz = null;
      AppMethodBeat.o(69096);
      while (true)
      {
        return paramzzdz;
        AppMethodBeat.o(69096);
        paramzzdz = localInterruptedException;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      label128: break label128;
    }
  }

  public final List<zzed> zza(String paramString1, String paramString2, zzdz paramzzdz)
  {
    AppMethodBeat.i(69106);
    zzb(paramzzdz, false);
    paramString1 = this.zzajp.zzgd().zzb(new zzgv(this, paramzzdz, paramString1, paramString2));
    try
    {
      paramString1 = (List)paramString1.get();
      AppMethodBeat.o(69106);
      return paramString1;
    }
    catch (InterruptedException paramString1)
    {
      while (true)
      {
        this.zzajp.zzge().zzim().zzg("Failed to get conditional user properties", paramString1);
        paramString1 = Collections.emptyList();
        AppMethodBeat.o(69106);
      }
    }
    catch (ExecutionException paramString1)
    {
      label53: break label53;
    }
  }

  public final List<zzjx> zza(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(69105);
    zzc(paramString1, true);
    paramString2 = this.zzajp.zzgd().zzb(new zzgu(this, paramString1, paramString2, paramString3));
    try
    {
      paramString3 = (List)paramString2.get();
      paramString2 = new java/util/ArrayList;
      paramString2.<init>(paramString3.size());
      Iterator localIterator = paramString3.iterator();
      while (localIterator.hasNext())
      {
        paramString3 = (zzjz)localIterator.next();
        if ((paramBoolean) || (!zzka.zzci(paramString3.name)))
        {
          zzjx localzzjx = new com/google/android/gms/internal/measurement/zzjx;
          localzzjx.<init>(paramString3);
          paramString2.add(localzzjx);
        }
      }
    }
    catch (InterruptedException paramString2)
    {
      this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", zzfg.zzbm(paramString1), paramString2);
      paramString1 = Collections.emptyList();
      AppMethodBeat.o(69105);
      while (true)
      {
        return paramString1;
        AppMethodBeat.o(69105);
        paramString1 = paramString2;
      }
    }
    catch (ExecutionException paramString2)
    {
      label126: break label126;
    }
  }

  public final List<zzjx> zza(String paramString1, String paramString2, boolean paramBoolean, zzdz paramzzdz)
  {
    AppMethodBeat.i(69104);
    zzb(paramzzdz, false);
    paramString1 = this.zzajp.zzgd().zzb(new zzgt(this, paramzzdz, paramString1, paramString2));
    try
    {
      paramString2 = (List)paramString1.get();
      paramString1 = new java/util/ArrayList;
      paramString1.<init>(paramString2.size());
      paramString2 = paramString2.iterator();
      while (paramString2.hasNext())
      {
        zzjz localzzjz = (zzjz)paramString2.next();
        if ((paramBoolean) || (!zzka.zzci(localzzjz.name)))
        {
          zzjx localzzjx = new com/google/android/gms/internal/measurement/zzjx;
          localzzjx.<init>(localzzjz);
          paramString1.add(localzzjx);
        }
      }
    }
    catch (InterruptedException paramString1)
    {
      this.zzajp.zzge().zzim().zze("Failed to get user attributes. appId", zzfg.zzbm(paramzzdz.packageName), paramString1);
      paramString1 = Collections.emptyList();
      AppMethodBeat.o(69104);
      while (true)
      {
        return paramString1;
        AppMethodBeat.o(69104);
      }
    }
    catch (ExecutionException paramString1)
    {
      label127: break label127;
    }
  }

  public final void zza(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(69100);
    zze(new zzhf(this, paramString2, paramString3, paramString1, paramLong));
    AppMethodBeat.o(69100);
  }

  public final void zza(zzdz paramzzdz)
  {
    AppMethodBeat.i(69097);
    zzb(paramzzdz, false);
    zze(new zzhe(this, paramzzdz));
    AppMethodBeat.o(69097);
  }

  public final void zza(zzed paramzzed, zzdz paramzzdz)
  {
    AppMethodBeat.i(69102);
    Preconditions.checkNotNull(paramzzed);
    Preconditions.checkNotNull(paramzzed.zzaep);
    zzb(paramzzdz, false);
    zzed localzzed = new zzed(paramzzed);
    localzzed.packageName = paramzzdz.packageName;
    if (paramzzed.zzaep.getValue() == null)
    {
      zze(new zzgp(this, localzzed, paramzzdz));
      AppMethodBeat.o(69102);
    }
    while (true)
    {
      return;
      zze(new zzgq(this, localzzed, paramzzdz));
      AppMethodBeat.o(69102);
    }
  }

  public final void zza(zzeu paramzzeu, zzdz paramzzdz)
  {
    AppMethodBeat.i(69092);
    Preconditions.checkNotNull(paramzzeu);
    zzb(paramzzdz, false);
    zze(new zzgy(this, paramzzeu, paramzzdz));
    AppMethodBeat.o(69092);
  }

  public final void zza(zzeu paramzzeu, String paramString1, String paramString2)
  {
    AppMethodBeat.i(69093);
    Preconditions.checkNotNull(paramzzeu);
    Preconditions.checkNotEmpty(paramString1);
    zzc(paramString1, true);
    zze(new zzgz(this, paramzzeu, paramString1));
    AppMethodBeat.o(69093);
  }

  public final void zza(zzjx paramzzjx, zzdz paramzzdz)
  {
    AppMethodBeat.i(69095);
    Preconditions.checkNotNull(paramzzjx);
    zzb(paramzzdz, false);
    if (paramzzjx.getValue() == null)
    {
      zze(new zzhb(this, paramzzjx, paramzzdz));
      AppMethodBeat.o(69095);
    }
    while (true)
    {
      return;
      zze(new zzhc(this, paramzzjx, paramzzdz));
      AppMethodBeat.o(69095);
    }
  }

  public final byte[] zza(zzeu paramzzeu, String paramString)
  {
    AppMethodBeat.i(69094);
    Preconditions.checkNotEmpty(paramString);
    Preconditions.checkNotNull(paramzzeu);
    zzc(paramString, true);
    this.zzajp.zzge().zzis().zzg("Log and bundle. event", this.zzajp.zzga().zzbj(paramzzeu.name));
    long l1 = this.zzajp.zzbt().nanoTime() / 1000000L;
    Object localObject1 = this.zzajp.zzgd().zzc(new zzha(this, paramzzeu, paramString));
    try
    {
      byte[] arrayOfByte = (byte[])((Future)localObject1).get();
      localObject1 = arrayOfByte;
      if (arrayOfByte == null)
      {
        this.zzajp.zzge().zzim().zzg("Log and bundle returned null. appId", zzfg.zzbm(paramString));
        localObject1 = new byte[0];
      }
      long l2 = this.zzajp.zzbt().nanoTime() / 1000000L;
      this.zzajp.zzge().zzis().zzd("Log and bundle processed. event, size, time_ms", this.zzajp.zzga().zzbj(paramzzeu.name), Integer.valueOf(localObject1.length), Long.valueOf(l2 - l1));
      AppMethodBeat.o(69094);
      return localObject1;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        this.zzajp.zzge().zzim().zzd("Failed to log and bundle. appId, event, error", zzfg.zzbm(paramString), this.zzajp.zzga().zzbj(paramzzeu.name), localInterruptedException);
        Object localObject2 = null;
        AppMethodBeat.o(69094);
      }
    }
    catch (ExecutionException localExecutionException)
    {
      label209: break label209;
    }
  }

  public final void zzb(zzdz paramzzdz)
  {
    AppMethodBeat.i(69091);
    zzb(paramzzdz, false);
    zze(new zzgo(this, paramzzdz));
    AppMethodBeat.o(69091);
  }

  public final void zzb(zzed paramzzed)
  {
    AppMethodBeat.i(69103);
    Preconditions.checkNotNull(paramzzed);
    Preconditions.checkNotNull(paramzzed.zzaep);
    zzc(paramzzed.packageName, true);
    zzed localzzed = new zzed(paramzzed);
    if (paramzzed.zzaep.getValue() == null)
    {
      zze(new zzgr(this, localzzed));
      AppMethodBeat.o(69103);
    }
    while (true)
    {
      return;
      zze(new zzgs(this, localzzed));
      AppMethodBeat.o(69103);
    }
  }

  public final String zzc(zzdz paramzzdz)
  {
    AppMethodBeat.i(69101);
    zzb(paramzzdz, false);
    paramzzdz = this.zzajp.zzh(paramzzdz);
    AppMethodBeat.o(69101);
    return paramzzdz;
  }

  public final void zzd(zzdz paramzzdz)
  {
    AppMethodBeat.i(69108);
    zzc(paramzzdz.packageName, false);
    zze(new zzgx(this, paramzzdz));
    AppMethodBeat.o(69108);
  }

  public final List<zzed> zze(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(69107);
    zzc(paramString1, true);
    paramString1 = this.zzajp.zzgd().zzb(new zzgw(this, paramString1, paramString2, paramString3));
    try
    {
      paramString1 = (List)paramString1.get();
      AppMethodBeat.o(69107);
      return paramString1;
    }
    catch (InterruptedException paramString1)
    {
      while (true)
      {
        this.zzajp.zzge().zzim().zzg("Failed to get conditional user properties", paramString1);
        paramString1 = Collections.emptyList();
        AppMethodBeat.o(69107);
      }
    }
    catch (ExecutionException paramString1)
    {
      label53: break label53;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgn
 * JD-Core Version:    0.6.2
 */