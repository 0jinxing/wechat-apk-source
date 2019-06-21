package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IInAppBillingService$a extends Binder
  implements IInAppBillingService
{
  public IInAppBillingService$a()
  {
    attachInterface(this, "com.android.vending.billing.IInAppBillingService");
  }

  public static IInAppBillingService f(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
      if ((localIInterface != null) && ((localIInterface instanceof IInAppBillingService)))
        paramIBinder = (IInAppBillingService)localIInterface;
      else
        paramIBinder = new IInAppBillingService.a.a(paramIBinder);
    }
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.android.vending.billing.IInAppBillingService");
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramInt1 = b(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool = true;
      continue;
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramInt1 = paramParcel1.readInt();
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
        label167: paramParcel1 = getSkuDetails(paramInt1, str1, str2, paramParcel1);
        paramParcel2.writeNoException();
        if (paramParcel1 == null)
          break label208;
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel1 = null;
        break label167;
        label208: paramParcel2.writeInt(0);
      }
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramParcel1 = a(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramParcel1 = b(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        bool = true;
        break;
        paramParcel2.writeInt(0);
      }
      paramParcel1.enforceInterface("com.android.vending.billing.IInAppBillingService");
      paramInt1 = c(paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readString());
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.android.vending.billing.IInAppBillingService.a
 * JD-Core Version:    0.6.2
 */