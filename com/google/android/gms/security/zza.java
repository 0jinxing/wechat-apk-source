package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zza extends AsyncTask<Void, Void, Integer>
{
  zza(Context paramContext, ProviderInstaller.ProviderInstallListener paramProviderInstallListener)
  {
  }

  private final Integer zza(Void[] paramArrayOfVoid)
  {
    AppMethodBeat.i(90506);
    try
    {
      ProviderInstaller.installIfNeeded(this.val$context);
      paramArrayOfVoid = Integer.valueOf(0);
      AppMethodBeat.o(90506);
      return paramArrayOfVoid;
    }
    catch (GooglePlayServicesRepairableException paramArrayOfVoid)
    {
      while (true)
      {
        paramArrayOfVoid = Integer.valueOf(paramArrayOfVoid.getConnectionStatusCode());
        AppMethodBeat.o(90506);
      }
    }
    catch (GooglePlayServicesNotAvailableException paramArrayOfVoid)
    {
      while (true)
      {
        paramArrayOfVoid = Integer.valueOf(paramArrayOfVoid.errorCode);
        AppMethodBeat.o(90506);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.security.zza
 * JD-Core Version:    0.6.2
 */