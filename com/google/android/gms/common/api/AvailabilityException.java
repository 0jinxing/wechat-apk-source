package com.google.android.gms.common.api;

import android.support.v4.f.a;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zzh;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AvailabilityException extends Exception
{
  private final a<zzh<?>, ConnectionResult> zzcc;

  public AvailabilityException(a<zzh<?>, ConnectionResult> parama)
  {
    this.zzcc = parama;
  }

  public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> paramGoogleApi)
  {
    AppMethodBeat.i(60481);
    paramGoogleApi = paramGoogleApi.zzm();
    if (this.zzcc.get(paramGoogleApi) != null);
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkArgument(bool, "The given API was not part of the availability request.");
      paramGoogleApi = (ConnectionResult)this.zzcc.get(paramGoogleApi);
      AppMethodBeat.o(60481);
      return paramGoogleApi;
    }
  }

  public String getMessage()
  {
    AppMethodBeat.i(60482);
    Object localObject1 = new ArrayList();
    Object localObject2 = this.zzcc.keySet().iterator();
    int i = 1;
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (zzh)((Iterator)localObject2).next();
      Object localObject4 = (ConnectionResult)this.zzcc.get(localObject3);
      if (((ConnectionResult)localObject4).isSuccess())
        i = 0;
      localObject3 = ((zzh)localObject3).zzq();
      localObject4 = String.valueOf(localObject4);
      ((List)localObject1).add(String.valueOf(localObject3).length() + 2 + String.valueOf(localObject4).length() + (String)localObject3 + ": " + (String)localObject4);
    }
    localObject2 = new StringBuilder();
    if (i != 0)
      ((StringBuilder)localObject2).append("None of the queried APIs are available. ");
    while (true)
    {
      ((StringBuilder)localObject2).append(TextUtils.join("; ", (Iterable)localObject1));
      localObject1 = ((StringBuilder)localObject2).toString();
      AppMethodBeat.o(60482);
      return localObject1;
      ((StringBuilder)localObject2).append("Some of the queried APIs are unavailable. ");
    }
  }

  public final a<zzh<?>, ConnectionResult> zzl()
  {
    return this.zzcc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.AvailabilityException
 * JD-Core Version:    0.6.2
 */