package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzb;
import com.google.android.gms.internal.stable.zzc;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface IAccountAccessor extends IInterface
{
  public abstract Account getAccount();

  public static abstract class Stub extends zzb
    implements IAccountAccessor
  {
    public Stub()
    {
      super();
    }

    public static IAccountAccessor asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if ((localIInterface instanceof IAccountAccessor))
          paramIBinder = (IAccountAccessor)localIInterface;
        else
          paramIBinder = new Proxy(paramIBinder);
      }
    }

    public boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 == 2)
      {
        paramParcel1 = getAccount();
        paramParcel2.writeNoException();
        zzc.zzb(paramParcel2, paramParcel1);
      }
      for (boolean bool = true; ; bool = false)
        return bool;
    }

    public static class Proxy extends zza
      implements IAccountAccessor
    {
      Proxy(IBinder paramIBinder)
      {
        super("com.google.android.gms.common.internal.IAccountAccessor");
      }

      public Account getAccount()
      {
        AppMethodBeat.i(89666);
        Parcel localParcel = transactAndReadException(2, obtainAndWriteInterfaceToken());
        Account localAccount = (Account)zzc.zza(localParcel, Account.CREATOR);
        localParcel.recycle();
        AppMethodBeat.o(89666);
        return localAccount;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.IAccountAccessor
 * JD-Core Version:    0.6.2
 */