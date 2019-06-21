package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.EventInterceptor;
import com.google.android.gms.measurement.AppMeasurement.OnEventListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public final class zzhk extends zzhh
{

  @VisibleForTesting
  protected zzid zzanp;
  private AppMeasurement.EventInterceptor zzanq;
  private final Set<AppMeasurement.OnEventListener> zzanr;
  private boolean zzans;
  private final AtomicReference<String> zzant;

  @VisibleForTesting
  protected boolean zzanu;

  protected zzhk(zzgl paramzzgl)
  {
    super(paramzzgl);
    AppMethodBeat.i(69149);
    this.zzanr = new CopyOnWriteArraySet();
    this.zzanu = true;
    this.zzant = new AtomicReference();
    AppMethodBeat.o(69149);
  }

  private final void zza(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    AppMethodBeat.i(69181);
    long l = zzbt().currentTimeMillis();
    Preconditions.checkNotNull(paramConditionalUserProperty);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mName);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mOrigin);
    Preconditions.checkNotNull(paramConditionalUserProperty.mValue);
    paramConditionalUserProperty.mCreationTimestamp = l;
    String str = paramConditionalUserProperty.mName;
    Object localObject1 = paramConditionalUserProperty.mValue;
    if (zzgb().zzcf(str) != 0)
    {
      zzge().zzim().zzg("Invalid conditional user property name", zzga().zzbl(str));
      AppMethodBeat.o(69181);
    }
    while (true)
    {
      return;
      if (zzgb().zzi(str, localObject1) != 0)
      {
        zzge().zzim().zze("Invalid conditional user property value", zzga().zzbl(str), localObject1);
        AppMethodBeat.o(69181);
      }
      else
      {
        Object localObject2 = zzgb().zzj(str, localObject1);
        if (localObject2 == null)
        {
          zzge().zzim().zze("Unable to normalize conditional user property value", zzga().zzbl(str), localObject1);
          AppMethodBeat.o(69181);
        }
        else
        {
          paramConditionalUserProperty.mValue = localObject2;
          l = paramConditionalUserProperty.mTriggerTimeout;
          if ((!TextUtils.isEmpty(paramConditionalUserProperty.mTriggerEventName)) && ((l > 15552000000L) || (l < 1L)))
          {
            zzge().zzim().zze("Invalid conditional user property timeout", zzga().zzbl(str), Long.valueOf(l));
            AppMethodBeat.o(69181);
          }
          else
          {
            l = paramConditionalUserProperty.mTimeToLive;
            if ((l > 15552000000L) || (l < 1L))
            {
              zzge().zzim().zze("Invalid conditional user property time to live", zzga().zzbl(str), Long.valueOf(l));
              AppMethodBeat.o(69181);
            }
            else
            {
              zzgd().zzc(new zzhr(this, paramConditionalUserProperty));
              AppMethodBeat.o(69181);
            }
          }
        }
      }
    }
  }

  private final void zza(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    AppMethodBeat.i(69164);
    if (paramBundle == null)
    {
      paramBundle = new Bundle();
      zzgd().zzc(new zzic(this, paramString1, paramString2, paramLong, paramBundle, paramBoolean1, paramBoolean2, paramBoolean3, paramString3));
      AppMethodBeat.o(69164);
      return;
    }
    Bundle localBundle = new Bundle(paramBundle);
    Iterator localIterator = localBundle.keySet().iterator();
    while (true)
    {
      paramBundle = localBundle;
      if (!localIterator.hasNext())
        break;
      paramBundle = (String)localIterator.next();
      Object localObject = localBundle.get(paramBundle);
      if ((localObject instanceof Bundle))
      {
        localBundle.putBundle(paramBundle, new Bundle((Bundle)localObject));
      }
      else
      {
        int i;
        if ((localObject instanceof Parcelable[]))
        {
          paramBundle = (Parcelable[])localObject;
          for (i = 0; i < paramBundle.length; i++)
            if ((paramBundle[i] instanceof Bundle))
              paramBundle[i] = new Bundle((Bundle)paramBundle[i]);
        }
        else if ((localObject instanceof ArrayList))
        {
          localObject = (ArrayList)localObject;
          for (i = 0; i < ((ArrayList)localObject).size(); i++)
          {
            paramBundle = ((ArrayList)localObject).get(i);
            if ((paramBundle instanceof Bundle))
              ((ArrayList)localObject).set(i, new Bundle((Bundle)paramBundle));
          }
        }
      }
    }
  }

  private final void zza(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    AppMethodBeat.i(69167);
    zzgd().zzc(new zzhm(this, paramString1, paramString2, paramObject, paramLong));
    AppMethodBeat.o(69167);
  }

  private final void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    AppMethodBeat.i(69163);
    zza(paramString1, paramString2, zzbt().currentTimeMillis(), paramBundle, true, paramBoolean2, paramBoolean3, null);
    AppMethodBeat.o(69163);
  }

  private final void zza(String paramString1, String paramString2, Object paramObject, long paramLong)
  {
    AppMethodBeat.i(69168);
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    zzab();
    zzch();
    if (!this.zzacw.isEnabled())
    {
      zzge().zzis().log("User property not set since app measurement is disabled");
      AppMethodBeat.o(69168);
    }
    while (true)
    {
      return;
      if (!this.zzacw.zzjv())
      {
        AppMethodBeat.o(69168);
      }
      else
      {
        zzge().zzis().zze("Setting user property (FE)", zzga().zzbj(paramString2), paramObject);
        paramString1 = new zzjx(paramString2, paramLong, paramObject, paramString1);
        zzfx().zzb(paramString1);
        AppMethodBeat.o(69168);
      }
    }
  }

  private final void zza(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    AppMethodBeat.i(69184);
    long l = zzbt().currentTimeMillis();
    Preconditions.checkNotEmpty(paramString2);
    AppMeasurement.ConditionalUserProperty localConditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
    localConditionalUserProperty.mAppId = paramString1;
    localConditionalUserProperty.mName = paramString2;
    localConditionalUserProperty.mCreationTimestamp = l;
    if (paramString3 != null)
    {
      localConditionalUserProperty.mExpiredEventName = paramString3;
      localConditionalUserProperty.mExpiredEventParams = paramBundle;
    }
    zzgd().zzc(new zzhs(this, localConditionalUserProperty));
    AppMethodBeat.o(69184);
  }

  @VisibleForTesting
  private final Map<String, Object> zzb(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(69192);
    if (zzgd().zzjk())
    {
      zzge().zzim().log("Cannot get user properties from analytics worker thread");
      paramString1 = Collections.emptyMap();
      AppMethodBeat.o(69192);
    }
    while (true)
    {
      return paramString1;
      zzgd();
      if (zzgg.isMainThread())
      {
        zzge().zzim().log("Cannot get user properties from main thread");
        paramString1 = Collections.emptyMap();
        AppMethodBeat.o(69192);
      }
      else
      {
        synchronized (new AtomicReference())
        {
          zzgg localzzgg = this.zzacw.zzgd();
          zzhu localzzhu = new com/google/android/gms/internal/measurement/zzhu;
          localzzhu.<init>(this, ???, paramString1, paramString2, paramString3, paramBoolean);
          localzzgg.zzc(localzzhu);
          try
          {
            ???.wait(5000L);
            paramString2 = (List)???.get();
            if (paramString2 == null)
            {
              zzge().zzip().log("Timed out waiting for get user properties");
              paramString1 = Collections.emptyMap();
              AppMethodBeat.o(69192);
            }
          }
          catch (InterruptedException paramString1)
          {
            while (true)
              zzge().zzip().zzg("Interrupted waiting for get user properties", paramString1);
          }
        }
        paramString1 = new a(paramString2.size());
        paramString3 = paramString2.iterator();
        while (paramString3.hasNext())
        {
          paramString2 = (zzjx)paramString3.next();
          paramString1.put(paramString2.name, paramString2.getValue());
        }
        AppMethodBeat.o(69192);
      }
    }
  }

  private final void zzb(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    AppMethodBeat.i(69185);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramConditionalUserProperty);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mName);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mOrigin);
    Preconditions.checkNotNull(paramConditionalUserProperty.mValue);
    if (!this.zzacw.isEnabled())
    {
      zzge().zzis().log("Conditional property not sent since Firebase Analytics is disabled");
      AppMethodBeat.o(69185);
    }
    while (true)
    {
      return;
      zzjx localzzjx = new zzjx(paramConditionalUserProperty.mName, paramConditionalUserProperty.mTriggeredTimestamp, paramConditionalUserProperty.mValue, paramConditionalUserProperty.mOrigin);
      try
      {
        zzeu localzzeu1 = zzgb().zza(paramConditionalUserProperty.mTriggeredEventName, paramConditionalUserProperty.mTriggeredEventParams, paramConditionalUserProperty.mOrigin, 0L, true, false);
        zzeu localzzeu2 = zzgb().zza(paramConditionalUserProperty.mTimedOutEventName, paramConditionalUserProperty.mTimedOutEventParams, paramConditionalUserProperty.mOrigin, 0L, true, false);
        zzeu localzzeu3 = zzgb().zza(paramConditionalUserProperty.mExpiredEventName, paramConditionalUserProperty.mExpiredEventParams, paramConditionalUserProperty.mOrigin, 0L, true, false);
        paramConditionalUserProperty = new zzed(paramConditionalUserProperty.mAppId, paramConditionalUserProperty.mOrigin, localzzjx, paramConditionalUserProperty.mCreationTimestamp, false, paramConditionalUserProperty.mTriggerEventName, localzzeu2, paramConditionalUserProperty.mTriggerTimeout, localzzeu1, paramConditionalUserProperty.mTimeToLive, localzzeu3);
        zzfx().zzd(paramConditionalUserProperty);
        AppMethodBeat.o(69185);
      }
      catch (IllegalArgumentException paramConditionalUserProperty)
      {
        AppMethodBeat.o(69185);
      }
    }
  }

  private final void zzb(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    AppMethodBeat.i(69165);
    Preconditions.checkNotEmpty(paramString1);
    Preconditions.checkNotEmpty(paramString2);
    Preconditions.checkNotNull(paramBundle);
    zzab();
    zzch();
    if (!this.zzacw.isEnabled())
    {
      zzge().zzis().log("Event not sent since app measurement is disabled");
      AppMethodBeat.o(69165);
    }
    int i;
    int j;
    label318: label324: Object localObject3;
    boolean bool2;
    label473: List localList;
    Bundle localBundle1;
    while (true)
    {
      return;
      if (!this.zzans)
        this.zzans = true;
      try
      {
        Object localObject1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
        try
        {
          ((Class)localObject1).getDeclaredMethod("initialize", new Class[] { Context.class }).invoke(null, new Object[] { getContext() });
          if ((paramBoolean3) && (!"_iap".equals(paramString2)))
          {
            localObject1 = this.zzacw.zzgb();
            if (!((zzka)localObject1).zzq("event", paramString2))
            {
              i = 2;
              if (i == 0)
                break label324;
              zzge().zzio().zzg("Invalid public event name. Event will not be logged (FE)", zzga().zzbj(paramString2));
              this.zzacw.zzgb();
              paramString1 = zzka.zza(paramString2, 40, true);
              if (paramString2 == null)
                break label318;
              j = paramString2.length();
              this.zzacw.zzgb().zza(i, "_ev", paramString1, j);
              AppMethodBeat.o(69165);
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
            zzge().zzip().zzg("Failed to invoke Tag Manager's initialize() method", localException);
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        while (true)
        {
          zzge().zzir().log("Tag Manager is not found and thus will not be used");
          continue;
          if (!localClassNotFoundException.zza("event", AppMeasurement.Event.zzacx, paramString2))
          {
            i = 13;
          }
          else if (!localClassNotFoundException.zza("event", 40, paramString2))
          {
            i = 2;
          }
          else
          {
            i = 0;
            continue;
            j = 0;
          }
        }
        localObject3 = zzfy().zzkc();
        if ((localObject3 != null) && (!paramBundle.containsKey("_sc")))
          ((zzie)localObject3).zzaok = true;
        if ((paramBoolean1) && (paramBoolean3));
        for (boolean bool1 = true; ; bool1 = false)
        {
          zzif.zza((zzie)localObject3, paramBundle, bool1);
          bool2 = "am".equals(paramString1);
          bool1 = zzka.zzci(paramString2);
          if ((!paramBoolean1) || (this.zzanq == null) || (bool1) || (bool2))
            break label473;
          zzge().zzis().zze("Passing event to registered event handler (FE)", zzga().zzbj(paramString2), zzga().zzb(paramBundle));
          this.zzanq.interceptEvent(paramString1, paramString2, paramBundle, paramLong);
          AppMethodBeat.o(69165);
          break;
        }
        if (!this.zzacw.zzjv())
        {
          AppMethodBeat.o(69165);
        }
        else
        {
          j = zzgb().zzcd(paramString2);
          if (j != 0)
          {
            zzge().zzio().zzg("Invalid event name. Event will not be logged (FE)", zzga().zzbj(paramString2));
            zzgb();
            paramString1 = zzka.zza(paramString2, 40, true);
            if (paramString2 != null);
            for (i = paramString2.length(); ; i = 0)
            {
              this.zzacw.zzgb().zza(paramString3, j, "_ev", paramString1, i);
              AppMethodBeat.o(69165);
              break;
            }
          }
          localList = CollectionUtils.listOf(new String[] { "_o", "_sn", "_sc", "_si" });
          localBundle1 = zzgb().zza(paramString2, paramBundle, localList, paramBoolean3, true);
          if (localBundle1 == null)
            break label663;
        }
      }
    }
    label663: Object localObject2;
    if ((!localBundle1.containsKey("_sc")) || (!localBundle1.containsKey("_si")))
    {
      localObject2 = null;
      if (localObject2 != null)
        break label1240;
      localObject2 = localObject3;
    }
    label1034: label1184: label1190: label1193: label1237: label1240: 
    while (true)
    {
      localObject3 = new ArrayList();
      ((List)localObject3).add(localBundle1);
      long l = zzgb().zzlc().nextLong();
      i = 0;
      paramBundle = (String[])localBundle1.keySet().toArray(new String[paramBundle.size()]);
      Arrays.sort(paramBundle);
      int k = paramBundle.length;
      j = 0;
      label745: if (j < k)
      {
        String str = paramBundle[j];
        Object localObject4 = localBundle1.get(str);
        zzgb();
        localObject4 = zzka.zze(localObject4);
        if (localObject4 == null)
          break label1237;
        localBundle1.putInt(str, localObject4.length);
        int m = 0;
        while (true)
          if (m < localObject4.length)
          {
            Bundle localBundle2 = localObject4[m];
            zzif.zza((zzie)localObject2, localBundle2, true);
            localBundle2 = zzgb().zza("_ep", localBundle2, localList, paramBoolean3, false);
            localBundle2.putString("_en", paramString2);
            localBundle2.putLong("_eid", l);
            localBundle2.putString("_gn", str);
            localBundle2.putInt("_ll", localObject4.length);
            localBundle2.putInt("_i", m);
            ((List)localObject3).add(localBundle2);
            m++;
            continue;
            localObject2 = new zzie(localBundle1.getString("_sn"), localBundle1.getString("_sc"), Long.valueOf(localBundle1.getLong("_si")).longValue());
            break;
          }
        i = localObject4.length + i;
      }
      while (true)
      {
        j++;
        break label745;
        if (i != 0)
        {
          localBundle1.putLong("_eid", l);
          localBundle1.putInt("_epc", i);
        }
        for (i = 0; i < ((List)localObject3).size(); i++)
        {
          localObject2 = (Bundle)((List)localObject3).get(i);
          if (i != 0)
          {
            j = 1;
            if (j == 0)
              break label1184;
            paramBundle = "_ep";
            ((Bundle)localObject2).putString("_o", paramString1);
            if (!paramBoolean2)
              break label1190;
            localObject2 = zzgb().zzd((Bundle)localObject2);
          }
          while (true)
          {
            zzge().zzis().zze("Logging event (FE)", zzga().zzbj(paramString2), zzga().zzb((Bundle)localObject2));
            paramBundle = new zzeu(paramBundle, new zzer((Bundle)localObject2), paramString1, paramLong);
            zzfx().zzb(paramBundle, paramString3);
            if (bool2)
              break label1193;
            paramBundle = this.zzanr.iterator();
            while (paramBundle.hasNext())
              ((AppMeasurement.OnEventListener)paramBundle.next()).onEvent(paramString1, paramString2, new Bundle((Bundle)localObject2), paramLong);
            j = 0;
            break;
            paramBundle = paramString2;
            break label1034;
          }
        }
        if ((zzfy().zzkc() != null) && ("_ae".equals(paramString2)))
          zzgc().zzl(true);
        AppMethodBeat.o(69165);
        break;
      }
    }
  }

  private final void zzc(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    AppMethodBeat.i(69186);
    zzab();
    zzch();
    Preconditions.checkNotNull(paramConditionalUserProperty);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mName);
    if (!this.zzacw.isEnabled())
    {
      zzge().zzis().log("Conditional property not cleared since Firebase Analytics is disabled");
      AppMethodBeat.o(69186);
    }
    while (true)
    {
      return;
      zzjx localzzjx = new zzjx(paramConditionalUserProperty.mName, 0L, null, null);
      try
      {
        zzeu localzzeu = zzgb().zza(paramConditionalUserProperty.mExpiredEventName, paramConditionalUserProperty.mExpiredEventParams, paramConditionalUserProperty.mOrigin, paramConditionalUserProperty.mCreationTimestamp, true, false);
        paramConditionalUserProperty = new zzed(paramConditionalUserProperty.mAppId, paramConditionalUserProperty.mOrigin, localzzjx, paramConditionalUserProperty.mCreationTimestamp, paramConditionalUserProperty.mActive, paramConditionalUserProperty.mTriggerEventName, null, paramConditionalUserProperty.mTriggerTimeout, null, paramConditionalUserProperty.mTimeToLive, localzzeu);
        zzfx().zzd(paramConditionalUserProperty);
        AppMethodBeat.o(69186);
      }
      catch (IllegalArgumentException paramConditionalUserProperty)
      {
        AppMethodBeat.o(69186);
      }
    }
  }

  @VisibleForTesting
  private final List<AppMeasurement.ConditionalUserProperty> zzf(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(69189);
    if (zzgd().zzjk())
    {
      zzge().zzim().log("Cannot get conditional user properties from analytics worker thread");
      paramString1 = Collections.emptyList();
      AppMethodBeat.o(69189);
    }
    while (true)
    {
      return paramString1;
      zzgd();
      if (zzgg.isMainThread())
      {
        zzge().zzim().log("Cannot get conditional user properties from main thread");
        paramString1 = Collections.emptyList();
        AppMethodBeat.o(69189);
      }
      else
      {
        Object localObject2;
        synchronized (new AtomicReference())
        {
          localObject2 = this.zzacw.zzgd();
          localObject3 = new com/google/android/gms/internal/measurement/zzht;
          ((zzht)localObject3).<init>(this, (AtomicReference)???, paramString1, paramString2, paramString3);
          ((zzgg)localObject2).zzc((Runnable)localObject3);
          try
          {
            ???.wait(5000L);
            ??? = (List)((AtomicReference)???).get();
            if (??? == null)
            {
              zzge().zzip().zzg("Timed out waiting for get conditional user properties", paramString1);
              paramString1 = Collections.emptyList();
              AppMethodBeat.o(69189);
            }
          }
          catch (InterruptedException paramString3)
          {
            while (true)
              zzge().zzip().zze("Interrupted waiting for get conditional user properties", paramString1, paramString3);
          }
        }
        paramString3 = new ArrayList(((List)???).size());
        Object localObject3 = ((List)???).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          ??? = (zzed)((Iterator)localObject3).next();
          localObject2 = new AppMeasurement.ConditionalUserProperty();
          ((AppMeasurement.ConditionalUserProperty)localObject2).mAppId = paramString1;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mOrigin = paramString2;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mCreationTimestamp = ((zzed)???).creationTimestamp;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mName = ((zzed)???).zzaep.name;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mValue = ((zzed)???).zzaep.getValue();
          ((AppMeasurement.ConditionalUserProperty)localObject2).mActive = ((zzed)???).active;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mTriggerEventName = ((zzed)???).triggerEventName;
          if (((zzed)???).zzaeq != null)
          {
            ((AppMeasurement.ConditionalUserProperty)localObject2).mTimedOutEventName = ((zzed)???).zzaeq.name;
            if (((zzed)???).zzaeq.zzafq != null)
              ((AppMeasurement.ConditionalUserProperty)localObject2).mTimedOutEventParams = ((zzed)???).zzaeq.zzafq.zzif();
          }
          ((AppMeasurement.ConditionalUserProperty)localObject2).mTriggerTimeout = ((zzed)???).triggerTimeout;
          if (((zzed)???).zzaer != null)
          {
            ((AppMeasurement.ConditionalUserProperty)localObject2).mTriggeredEventName = ((zzed)???).zzaer.name;
            if (((zzed)???).zzaer.zzafq != null)
              ((AppMeasurement.ConditionalUserProperty)localObject2).mTriggeredEventParams = ((zzed)???).zzaer.zzafq.zzif();
          }
          ((AppMeasurement.ConditionalUserProperty)localObject2).mTriggeredTimestamp = ((zzed)???).zzaep.zzaqz;
          ((AppMeasurement.ConditionalUserProperty)localObject2).mTimeToLive = ((zzed)???).timeToLive;
          if (((zzed)???).zzaes != null)
          {
            ((AppMeasurement.ConditionalUserProperty)localObject2).mExpiredEventName = ((zzed)???).zzaes.name;
            if (((zzed)???).zzaes.zzafq != null)
              ((AppMeasurement.ConditionalUserProperty)localObject2).mExpiredEventParams = ((zzed)???).zzaes.zzafq.zzif();
          }
          paramString3.add(localObject2);
        }
        AppMethodBeat.o(69189);
        paramString1 = paramString3;
      }
    }
  }

  private final void zzi(boolean paramBoolean)
  {
    AppMethodBeat.i(69156);
    zzab();
    zzch();
    zzge().zzis().zzg("Setting app measurement enabled (FE)", Boolean.valueOf(paramBoolean));
    zzgf().setMeasurementEnabled(paramBoolean);
    if (zzgg().zzaz(zzfv().zzah()))
      if ((this.zzacw.isEnabled()) && (this.zzanu))
      {
        zzge().zzis().log("Recording app launch after enabling measurement for the first time (FE)");
        zzkb();
        AppMethodBeat.o(69156);
      }
    while (true)
    {
      return;
      zzfx().zzke();
      AppMethodBeat.o(69156);
      continue;
      zzfx().zzke();
      AppMethodBeat.o(69156);
    }
  }

  public final void clearConditionalUserProperty(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(69182);
    zza(null, paramString1, paramString2, paramBundle);
    AppMethodBeat.o(69182);
  }

  public final void clearConditionalUserPropertyAs(String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    AppMethodBeat.i(69183);
    Preconditions.checkNotEmpty(paramString1);
    zzfr();
    zza(paramString1, paramString2, paramString3, paramBundle);
    AppMethodBeat.o(69183);
  }

  public final Task<String> getAppInstanceId()
  {
    AppMethodBeat.i(69170);
    try
    {
      Object localObject = zzgf().zzja();
      if (localObject != null)
      {
        localObject = Tasks.forResult(localObject);
        AppMethodBeat.o(69170);
      }
      while (true)
      {
        return localObject;
        ExecutorService localExecutorService = zzgd().zzjl();
        localObject = new com/google/android/gms/internal/measurement/zzho;
        ((zzho)localObject).<init>(this);
        localObject = Tasks.call(localExecutorService, (Callable)localObject);
        AppMethodBeat.o(69170);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        zzge().zzip().log("Failed to schedule task for getAppInstanceId");
        Task localTask = Tasks.forException(localException);
        AppMethodBeat.o(69170);
      }
    }
  }

  public final List<AppMeasurement.ConditionalUserProperty> getConditionalUserProperties(String paramString1, String paramString2)
  {
    AppMethodBeat.i(69187);
    paramString1 = zzf(null, paramString1, paramString2);
    AppMethodBeat.o(69187);
    return paramString1;
  }

  public final List<AppMeasurement.ConditionalUserProperty> getConditionalUserPropertiesAs(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(69188);
    Preconditions.checkNotEmpty(paramString1);
    zzfr();
    paramString1 = zzf(paramString1, paramString2, paramString3);
    AppMethodBeat.o(69188);
    return paramString1;
  }

  public final Map<String, Object> getUserProperties(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(69190);
    paramString1 = zzb(null, paramString1, paramString2, paramBoolean);
    AppMethodBeat.o(69190);
    return paramString1;
  }

  public final Map<String, Object> getUserPropertiesAs(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(69191);
    Preconditions.checkNotEmpty(paramString1);
    zzfr();
    paramString1 = zzb(paramString1, paramString2, paramString3, paramBoolean);
    AppMethodBeat.o(69191);
    return paramString1;
  }

  public final void logEvent(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(69160);
    if ((this.zzanq == null) || (zzka.zzci(paramString2)));
    for (boolean bool = true; ; bool = false)
    {
      zza(paramString1, paramString2, paramBundle, true, bool, false, null);
      AppMethodBeat.o(69160);
      return;
    }
  }

  public final void registerOnMeasurementEventListener(AppMeasurement.OnEventListener paramOnEventListener)
  {
    AppMethodBeat.i(69177);
    zzch();
    Preconditions.checkNotNull(paramOnEventListener);
    if (!this.zzanr.add(paramOnEventListener))
      zzge().zzip().log("OnEventListener already registered");
    AppMethodBeat.o(69177);
  }

  public final void resetAnalyticsData()
  {
    AppMethodBeat.i(69174);
    long l = zzbt().currentTimeMillis();
    zzgd().zzc(new zzhq(this, l));
    AppMethodBeat.o(69174);
  }

  public final void setConditionalUserProperty(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    AppMethodBeat.i(69179);
    Preconditions.checkNotNull(paramConditionalUserProperty);
    paramConditionalUserProperty = new AppMeasurement.ConditionalUserProperty(paramConditionalUserProperty);
    if (!TextUtils.isEmpty(paramConditionalUserProperty.mAppId))
      zzge().zzip().log("Package name should be null when calling setConditionalUserProperty");
    paramConditionalUserProperty.mAppId = null;
    zza(paramConditionalUserProperty);
    AppMethodBeat.o(69179);
  }

  public final void setConditionalUserPropertyAs(AppMeasurement.ConditionalUserProperty paramConditionalUserProperty)
  {
    AppMethodBeat.i(69180);
    Preconditions.checkNotNull(paramConditionalUserProperty);
    Preconditions.checkNotEmpty(paramConditionalUserProperty.mAppId);
    zzfr();
    zza(new AppMeasurement.ConditionalUserProperty(paramConditionalUserProperty));
    AppMethodBeat.o(69180);
  }

  public final void setEventInterceptor(AppMeasurement.EventInterceptor paramEventInterceptor)
  {
    AppMethodBeat.i(69176);
    zzab();
    zzch();
    if ((paramEventInterceptor != null) && (paramEventInterceptor != this.zzanq))
      if (this.zzanq != null)
        break label54;
    label54: for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool, "EventInterceptor already set.");
      this.zzanq = paramEventInterceptor;
      AppMethodBeat.o(69176);
      return;
    }
  }

  public final void setMeasurementEnabled(boolean paramBoolean)
  {
    AppMethodBeat.i(69155);
    zzch();
    zzgd().zzc(new zzhz(this, paramBoolean));
    AppMethodBeat.o(69155);
  }

  public final void setMinimumSessionDuration(long paramLong)
  {
    AppMethodBeat.i(69157);
    zzgd().zzc(new zzia(this, paramLong));
    AppMethodBeat.o(69157);
  }

  public final void setSessionTimeoutDuration(long paramLong)
  {
    AppMethodBeat.i(69158);
    zzgd().zzc(new zzib(this, paramLong));
    AppMethodBeat.o(69158);
  }

  public final void setUserProperty(String paramString1, String paramString2, Object paramObject)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(69166);
    Preconditions.checkNotEmpty(paramString1);
    long l = zzbt().currentTimeMillis();
    int k = zzgb().zzcf(paramString2);
    if (k != 0)
    {
      zzgb();
      paramString1 = zzka.zza(paramString2, 24, true);
      i = j;
      if (paramString2 != null)
        i = paramString2.length();
      this.zzacw.zzgb().zza(k, "_ev", paramString1, i);
      AppMethodBeat.o(69166);
    }
    while (true)
    {
      return;
      if (paramObject != null)
      {
        j = zzgb().zzi(paramString2, paramObject);
        if (j != 0)
        {
          zzgb();
          paramString1 = zzka.zza(paramString2, 24, true);
          if (((paramObject instanceof String)) || ((paramObject instanceof CharSequence)))
            i = String.valueOf(paramObject).length();
          this.zzacw.zzgb().zza(j, "_ev", paramString1, i);
          AppMethodBeat.o(69166);
        }
        else
        {
          paramObject = zzgb().zzj(paramString2, paramObject);
          if (paramObject != null)
            zza(paramString1, paramString2, l, paramObject);
          AppMethodBeat.o(69166);
        }
      }
      else
      {
        zza(paramString1, paramString2, l, null);
        AppMethodBeat.o(69166);
      }
    }
  }

  public final void unregisterOnMeasurementEventListener(AppMeasurement.OnEventListener paramOnEventListener)
  {
    AppMethodBeat.i(69178);
    zzch();
    Preconditions.checkNotNull(paramOnEventListener);
    if (!this.zzanr.remove(paramOnEventListener))
      zzge().zzip().log("OnEventListener had not been registered");
    AppMethodBeat.o(69178);
  }

  final void zza(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(69161);
    zzab();
    if ((this.zzanq == null) || (zzka.zzci(paramString2)));
    for (boolean bool = true; ; bool = false)
    {
      zzb(paramString1, paramString2, zzbt().currentTimeMillis(), paramBundle, true, bool, false, null);
      AppMethodBeat.o(69161);
      return;
    }
  }

  public final void zza(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    AppMethodBeat.i(69162);
    zza(paramString1, paramString2, paramLong, paramBundle, false, true, true, null);
    AppMethodBeat.o(69162);
  }

  public final void zza(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(69159);
    if ((this.zzanq == null) || (zzka.zzci(paramString2)));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      zza(paramString1, paramString2, paramBundle, true, paramBoolean, true, null);
      AppMethodBeat.o(69159);
      return;
    }
  }

  final String zzae(long paramLong)
  {
    AppMethodBeat.i(69173);
    synchronized (new AtomicReference())
    {
      zzgg localzzgg = zzgd();
      Object localObject1 = new com/google/android/gms/internal/measurement/zzhp;
      ((zzhp)localObject1).<init>(this, ???);
      localzzgg.zzc((Runnable)localObject1);
      try
      {
        ???.wait(paramLong);
        localObject1 = (String)???.get();
        AppMethodBeat.o(69173);
        return localObject1;
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
        {
          zzge().zzip().log("Interrupted waiting for app instance id");
          Object localObject2 = null;
          AppMethodBeat.o(69173);
        }
      }
    }
  }

  final void zzbr(String paramString)
  {
    AppMethodBeat.i(69172);
    this.zzant.set(paramString);
    AppMethodBeat.o(69172);
  }

  protected final boolean zzhf()
  {
    return false;
  }

  public final String zzhm()
  {
    AppMethodBeat.i(69151);
    Object localObject = new AtomicReference();
    localObject = (String)zzgd().zza((AtomicReference)localObject, 15000L, "String test flag value", new zzhv(this, (AtomicReference)localObject));
    AppMethodBeat.o(69151);
    return localObject;
  }

  public final List<zzjx> zzj(boolean paramBoolean)
  {
    AppMethodBeat.i(69169);
    zzch();
    zzge().zzis().log("Fetching user attributes (FE)");
    if (zzgd().zzjk())
    {
      zzge().zzim().log("Cannot get all user properties from analytics worker thread");
      ??? = Collections.emptyList();
      AppMethodBeat.o(69169);
    }
    while (true)
    {
      return ???;
      zzgd();
      if (zzgg.isMainThread())
      {
        zzge().zzim().log("Cannot get all user properties from main thread");
        ??? = Collections.emptyList();
        AppMethodBeat.o(69169);
      }
      else
      {
        synchronized (new AtomicReference())
        {
          zzgg localzzgg = this.zzacw.zzgd();
          zzhn localzzhn = new com/google/android/gms/internal/measurement/zzhn;
          localzzhn.<init>(this, (AtomicReference)???, paramBoolean);
          localzzgg.zzc(localzzhn);
          try
          {
            ???.wait(5000L);
            ??? = (List)((AtomicReference)???).get();
            if (??? == null)
            {
              zzge().zzip().log("Timed out waiting for get user properties");
              ??? = Collections.emptyList();
              AppMethodBeat.o(69169);
            }
          }
          catch (InterruptedException localInterruptedException)
          {
            while (true)
              zzge().zzip().zzg("Interrupted waiting for get user properties", localInterruptedException);
          }
        }
        AppMethodBeat.o(69169);
      }
    }
  }

  public final String zzja()
  {
    AppMethodBeat.i(69171);
    String str = (String)this.zzant.get();
    AppMethodBeat.o(69171);
    return str;
  }

  public final Boolean zzjx()
  {
    AppMethodBeat.i(69150);
    Object localObject = new AtomicReference();
    localObject = (Boolean)zzgd().zza((AtomicReference)localObject, 15000L, "boolean test flag value", new zzhl(this, (AtomicReference)localObject));
    AppMethodBeat.o(69150);
    return localObject;
  }

  public final Long zzjy()
  {
    AppMethodBeat.i(69152);
    Object localObject = new AtomicReference();
    localObject = (Long)zzgd().zza((AtomicReference)localObject, 15000L, "long test flag value", new zzhw(this, (AtomicReference)localObject));
    AppMethodBeat.o(69152);
    return localObject;
  }

  public final Integer zzjz()
  {
    AppMethodBeat.i(69153);
    Object localObject = new AtomicReference();
    localObject = (Integer)zzgd().zza((AtomicReference)localObject, 15000L, "int test flag value", new zzhx(this, (AtomicReference)localObject));
    AppMethodBeat.o(69153);
    return localObject;
  }

  public final Double zzka()
  {
    AppMethodBeat.i(69154);
    Object localObject = new AtomicReference();
    localObject = (Double)zzgd().zza((AtomicReference)localObject, 15000L, "double test flag value", new zzhy(this, (AtomicReference)localObject));
    AppMethodBeat.o(69154);
    return localObject;
  }

  public final void zzkb()
  {
    AppMethodBeat.i(69175);
    zzab();
    zzch();
    if (!this.zzacw.zzjv())
      AppMethodBeat.o(69175);
    while (true)
    {
      return;
      zzfx().zzkb();
      this.zzanu = false;
      String str = zzgf().zzjd();
      if (!TextUtils.isEmpty(str))
      {
        zzfw().zzch();
        if (!str.equals(Build.VERSION.RELEASE))
        {
          Bundle localBundle = new Bundle();
          localBundle.putString("_po", str);
          logEvent("auto", "_ou", localBundle);
        }
      }
      AppMethodBeat.o(69175);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhk
 * JD-Core Version:    0.6.2
 */