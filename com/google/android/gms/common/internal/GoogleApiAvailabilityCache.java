package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.Client;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GoogleApiAvailabilityCache
{
  private final SparseIntArray zzug;
  private GoogleApiAvailabilityLight zzuh;

  public GoogleApiAvailabilityCache()
  {
    this(GoogleApiAvailability.getInstance());
    AppMethodBeat.i(61347);
    AppMethodBeat.o(61347);
  }

  public GoogleApiAvailabilityCache(GoogleApiAvailabilityLight paramGoogleApiAvailabilityLight)
  {
    AppMethodBeat.i(61348);
    this.zzug = new SparseIntArray();
    Preconditions.checkNotNull(paramGoogleApiAvailabilityLight);
    this.zzuh = paramGoogleApiAvailabilityLight;
    AppMethodBeat.o(61348);
  }

  public void flush()
  {
    AppMethodBeat.i(61350);
    this.zzug.clear();
    AppMethodBeat.o(61350);
  }

  public int getClientAvailability(Context paramContext, Api.Client paramClient)
  {
    int i = 0;
    AppMethodBeat.i(61349);
    Preconditions.checkNotNull(paramContext);
    Preconditions.checkNotNull(paramClient);
    if (!paramClient.requiresGooglePlayServices())
      AppMethodBeat.o(61349);
    int j;
    while (true)
    {
      return i;
      j = paramClient.getMinApkVersion();
      i = this.zzug.get(j, -1);
      if (i == -1)
        break;
      AppMethodBeat.o(61349);
    }
    int k = 0;
    label68: if (k < this.zzug.size())
    {
      int m = this.zzug.keyAt(k);
      if ((m > j) && (this.zzug.get(m) == 0))
        i = 0;
    }
    while (true)
    {
      k = i;
      if (i == -1)
        k = this.zzuh.isGooglePlayServicesAvailable(paramContext, j);
      this.zzug.put(j, k);
      AppMethodBeat.o(61349);
      i = k;
      break;
      k++;
      break label68;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GoogleApiAvailabilityCache
 * JD-Core Version:    0.6.2
 */