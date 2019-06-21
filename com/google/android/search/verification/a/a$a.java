package com.google.android.search.verification.a;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class a$a extends Binder
  implements a
{
  public static a g(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
      if ((localIInterface != null) && ((localIInterface instanceof a)))
        paramIBinder = (a)localIInterface;
      else
        paramIBinder = new a.a.a(paramIBinder);
    }
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    switch (paramInt1)
    {
    default:
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    }
    while (true)
    {
      return bool1;
      paramParcel2.writeString("com.google.android.search.verification.api.ISearchActionVerificationService");
      continue;
      paramParcel1.enforceInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
      Intent localIntent;
      if (paramParcel1.readInt() != 0)
      {
        localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
        label90: if (paramParcel1.readInt() == 0)
          break label144;
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        label110: boolean bool2 = a(localIntent, paramParcel1);
        paramParcel2.writeNoException();
        if (!bool2)
          break label149;
      }
      label144: label149: for (paramInt1 = 1; ; paramInt1 = 0)
      {
        paramParcel2.writeInt(paramInt1);
        break;
        localIntent = null;
        break label90;
        paramParcel1 = null;
        break label110;
      }
      paramParcel1.enforceInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
      paramInt1 = getVersion();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.search.verification.a.a.a
 * JD-Core Version:    0.6.2
 */