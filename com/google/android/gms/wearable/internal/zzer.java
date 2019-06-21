package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzer<T>
{
  private final Map<T, zzhk<T>> zzeb;

  zzer()
  {
    AppMethodBeat.i(71279);
    this.zzeb = new HashMap();
    AppMethodBeat.o(71279);
  }

  public final void zza(IBinder paramIBinder)
  {
    AppMethodBeat.i(71280);
    Map localMap = this.zzeb;
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      try
      {
        zzgz localzzgz = new com/google/android/gms/wearable/internal/zzgz;
        localzzgz.<init>();
        localObject1 = this.zzeb.entrySet().iterator();
        if (!((Iterator)localObject1).hasNext())
          break;
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        Object localObject3 = (zzhk)((Map.Entry)localObject2).getValue();
        try
        {
          Object localObject4 = new com/google/android/gms/wearable/internal/zzd;
          ((zzd)localObject4).<init>((zzhk)localObject3);
          paramIBinder.zza(localzzgz, (zzd)localObject4);
          if (!Log.isLoggable("WearableClient", 3))
            continue;
          localObject4 = String.valueOf(((Map.Entry)localObject2).getKey());
          String str = String.valueOf(localObject3);
          i = String.valueOf(localObject4).length();
          j = String.valueOf(str).length();
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>(i + 27 + j);
          localStringBuilder2.append("onPostInitHandler: added: ").append((String)localObject4).append("/").append(str);
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = String.valueOf(((Map.Entry)localObject2).getKey());
          localObject3 = String.valueOf(localObject3);
          int j = String.valueOf(localObject2).length();
          int i = String.valueOf(localObject3).length();
          StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>(j + 32 + i);
          localStringBuilder1.append("onPostInitHandler: Didn't add: ").append((String)localObject2).append("/").append((String)localObject3);
        }
        continue;
      }
      finally
      {
        AppMethodBeat.o(71280);
      }
      Object localObject1 = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
      if ((localObject1 instanceof zzep))
        paramIBinder = (zzep)localObject1;
      else
        paramIBinder = new zzeq(paramIBinder);
    }
    AppMethodBeat.o(71280);
  }

  public final void zza(zzhg paramzzhg, BaseImplementation.ResultHolder<Status> paramResultHolder, T paramT)
  {
    AppMethodBeat.i(71282);
    synchronized (this.zzeb)
    {
      zzhk localzzhk = (zzhk)this.zzeb.remove(paramT);
      int i;
      if (localzzhk == null)
      {
        if (Log.isLoggable("WearableClient", 2))
        {
          paramzzhg = String.valueOf(paramT);
          i = String.valueOf(paramzzhg).length();
          paramT = new java/lang/StringBuilder;
          paramT.<init>(i + 25);
          paramT.append("remove Listener unknown: ").append(paramzzhg);
        }
        paramzzhg = new com/google/android/gms/common/api/Status;
        paramzzhg.<init>(4002);
        paramResultHolder.setResult(paramzzhg);
        AppMethodBeat.o(71282);
        return;
      }
      localzzhk.clear();
      if (Log.isLoggable("WearableClient", 2))
      {
        localObject = String.valueOf(paramT);
        i = String.valueOf(localObject).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 24);
        localStringBuilder.append("service.removeListener: ").append((String)localObject);
      }
      paramzzhg = (zzep)paramzzhg.getService();
      Object localObject = new com/google/android/gms/wearable/internal/zzet;
      ((zzet)localObject).<init>(this.zzeb, paramT, paramResultHolder);
      paramResultHolder = new com/google/android/gms/wearable/internal/zzfw;
      paramResultHolder.<init>(localzzhk);
      paramzzhg.zza((zzek)localObject, paramResultHolder);
      AppMethodBeat.o(71282);
    }
  }

  public final void zza(zzhg paramzzhg, BaseImplementation.ResultHolder<Status> paramResultHolder, T paramT, zzhk<T> paramzzhk)
  {
    AppMethodBeat.i(71281);
    synchronized (this.zzeb)
    {
      int i;
      if (this.zzeb.get(paramT) != null)
      {
        if (Log.isLoggable("WearableClient", 2))
        {
          paramzzhg = String.valueOf(paramT);
          i = String.valueOf(paramzzhg).length();
          paramT = new java/lang/StringBuilder;
          paramT.<init>(i + 20);
          paramT.append("duplicate listener: ").append(paramzzhg);
        }
        paramzzhg = new com/google/android/gms/common/api/Status;
        paramzzhg.<init>(4001);
        paramResultHolder.setResult(paramzzhg);
        AppMethodBeat.o(71281);
      }
      while (true)
      {
        return;
        Object localObject;
        if (Log.isLoggable("WearableClient", 2))
        {
          localObject = String.valueOf(paramT);
          i = String.valueOf(localObject).length();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(i + 14);
          localStringBuilder.append("new listener: ").append((String)localObject);
        }
        this.zzeb.put(paramT, paramzzhk);
        try
        {
          paramzzhg = (zzep)paramzzhg.getService();
          localObject = new com/google/android/gms/wearable/internal/zzes;
          ((zzes)localObject).<init>(this.zzeb, paramT, paramResultHolder);
          paramResultHolder = new com/google/android/gms/wearable/internal/zzd;
          paramResultHolder.<init>(paramzzhk);
          paramzzhg.zza((zzek)localObject, paramResultHolder);
          AppMethodBeat.o(71281);
        }
        catch (RemoteException paramzzhg)
        {
          if (Log.isLoggable("WearableClient", 3))
          {
            paramResultHolder = String.valueOf(paramT);
            i = String.valueOf(paramResultHolder).length();
            paramzzhk = new java/lang/StringBuilder;
            paramzzhk.<init>(i + 39);
            paramzzhk.append("addListener failed, removing listener: ").append(paramResultHolder);
          }
          this.zzeb.remove(paramT);
          AppMethodBeat.o(71281);
          throw paramzzhg;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzer
 * JD-Core Version:    0.6.2
 */