package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.signin.SignInClient;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzam extends zzat
{
  private final Map<Api.Client, zzal> zzhx;

  public zzam(Map<Api.Client, zzal> paramMap)
  {
    super(paramMap, null);
    Object localObject;
    this.zzhx = localObject;
  }

  public final void zzaq()
  {
    int i = 0;
    AppMethodBeat.i(60752);
    Object localObject1 = new GoogleApiAvailabilityCache(zzaj.zzb(this.zzhv));
    Object localObject2 = new ArrayList();
    ArrayList localArrayList = new ArrayList();
    Object localObject3 = this.zzhx.keySet().iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (Api.Client)((Iterator)localObject3).next();
      if ((((Api.Client)localObject4).requiresGooglePlayServices()) && (!zzal.zza((zzal)this.zzhx.get(localObject4))))
        ((List)localObject2).add(localObject4);
      else
        localArrayList.add(localObject4);
    }
    int j = -1;
    int k;
    int m;
    if (((List)localObject2).isEmpty())
    {
      localObject2 = (ArrayList)localArrayList;
      k = ((ArrayList)localObject2).size();
      while (i < k)
      {
        localObject4 = ((ArrayList)localObject2).get(i);
        i++;
        localObject4 = (Api.Client)localObject4;
        m = ((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zzaj.zza(this.zzhv), (Api.Client)localObject4);
        j = m;
        if (m == 0)
        {
          j = m;
          break label265;
        }
      }
      label207: if (j == 0)
        break label319;
      localObject1 = new ConnectionResult(j, null);
      zzaj.zzd(this.zzhv).zza(new zzan(this, this.zzhv, (ConnectionResult)localObject1));
      AppMethodBeat.o(60752);
    }
    while (true)
    {
      return;
      localObject2 = (ArrayList)localObject2;
      k = ((ArrayList)localObject2).size();
      i = 0;
      label265: if (i >= k)
        break label207;
      localObject4 = ((ArrayList)localObject2).get(i);
      i++;
      localObject4 = (Api.Client)localObject4;
      m = ((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zzaj.zza(this.zzhv), (Api.Client)localObject4);
      j = m;
      if (m == 0)
        break;
      j = m;
      break label207;
      label319: if (zzaj.zze(this.zzhv))
        zzaj.zzf(this.zzhv).connect();
      localObject4 = this.zzhx.keySet().iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = (Api.Client)((Iterator)localObject4).next();
        localObject2 = (BaseGmsClient.ConnectionProgressReportCallbacks)this.zzhx.get(localObject3);
        if ((((Api.Client)localObject3).requiresGooglePlayServices()) && (((GoogleApiAvailabilityCache)localObject1).getClientAvailability(zzaj.zza(this.zzhv), (Api.Client)localObject3) != 0))
          zzaj.zzd(this.zzhv).zza(new zzao(this, this.zzhv, (BaseGmsClient.ConnectionProgressReportCallbacks)localObject2));
        else
          ((Api.Client)localObject3).connect((BaseGmsClient.ConnectionProgressReportCallbacks)localObject2);
      }
      AppMethodBeat.o(60752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.internal.zzam
 * JD-Core Version:    0.6.2
 */