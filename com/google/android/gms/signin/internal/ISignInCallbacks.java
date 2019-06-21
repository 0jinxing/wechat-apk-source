package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface ISignInCallbacks extends IInterface
{
  public abstract void onAuthAccountComplete(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult);

  public abstract void onGetCurrentAccountComplete(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount);

  public abstract void onRecordConsentComplete(Status paramStatus);

  public abstract void onSaveAccountToSessionStoreComplete(Status paramStatus);

  public abstract void onSignInComplete(SignInResponse paramSignInResponse);

  public static abstract class Stub extends zzb
    implements ISignInCallbacks
  {
    public Stub()
    {
      super();
    }

    public static ISignInCallbacks asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
        if ((localIInterface instanceof ISignInCallbacks))
          paramIBinder = (ISignInCallbacks)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool;
      switch (paramInt1)
      {
      case 5:
      default:
        bool = false;
        return bool;
      case 3:
        onAuthAccountComplete((ConnectionResult)zzc.zza(paramParcel1, ConnectionResult.CREATOR), (AuthAccountResult)zzc.zza(paramParcel1, AuthAccountResult.CREATOR));
      case 4:
      case 6:
      case 7:
      case 8:
      }
      while (true)
      {
        paramParcel2.writeNoException();
        bool = true;
        break;
        onSaveAccountToSessionStoreComplete((Status)zzc.zza(paramParcel1, Status.CREATOR));
        continue;
        onRecordConsentComplete((Status)zzc.zza(paramParcel1, Status.CREATOR));
        continue;
        onGetCurrentAccountComplete((Status)zzc.zza(paramParcel1, Status.CREATOR), (GoogleSignInAccount)zzc.zza(paramParcel1, GoogleSignInAccount.CREATOR));
        continue;
        onSignInComplete((SignInResponse)zzc.zza(paramParcel1, SignInResponse.CREATOR));
      }
    }

    public static class Proxy extends zza
      implements ISignInCallbacks
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
      }

      public void onAuthAccountComplete(ConnectionResult paramConnectionResult, AuthAccountResult paramAuthAccountResult)
      {
        AppMethodBeat.i(61666);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramConnectionResult);
        zzc.zza(localParcel, paramAuthAccountResult);
        transactAndReadExceptionReturnVoid(3, localParcel);
        AppMethodBeat.o(61666);
      }

      public void onGetCurrentAccountComplete(Status paramStatus, GoogleSignInAccount paramGoogleSignInAccount)
      {
        AppMethodBeat.i(61669);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramStatus);
        zzc.zza(localParcel, paramGoogleSignInAccount);
        transactAndReadExceptionReturnVoid(7, localParcel);
        AppMethodBeat.o(61669);
      }

      public void onRecordConsentComplete(Status paramStatus)
      {
        AppMethodBeat.i(61668);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramStatus);
        transactAndReadExceptionReturnVoid(6, localParcel);
        AppMethodBeat.o(61668);
      }

      public void onSaveAccountToSessionStoreComplete(Status paramStatus)
      {
        AppMethodBeat.i(61667);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramStatus);
        transactAndReadExceptionReturnVoid(4, localParcel);
        AppMethodBeat.o(61667);
      }

      public void onSignInComplete(SignInResponse paramSignInResponse)
      {
        AppMethodBeat.i(61670);
        Parcel localParcel = obtainAndWriteInterfaceToken();
        zzc.zza(localParcel, paramSignInResponse);
        transactAndReadExceptionReturnVoid(8, localParcel);
        AppMethodBeat.o(61670);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.ISignInCallbacks
 * JD-Core Version:    0.6.2
 */