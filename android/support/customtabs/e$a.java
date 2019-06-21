package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class e$a extends Binder
  implements e
{
  public e$a()
  {
    attachInterface(this, "android.support.customtabs.ICustomTabsService");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    boolean bool1 = true;
    switch (paramInt1)
    {
    default:
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return bool1;
      paramParcel2.writeString("android.support.customtabs.ICustomTabsService");
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      paramParcel1.readLong();
      boolean bool2 = bi();
      paramParcel2.writeNoException();
      paramInt1 = i1;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      bool2 = a(d.a.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      d locald = d.a.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0)
        Uri.CREATOR.createFromParcel(paramParcel1);
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1.createTypedArrayList(Bundle.CREATOR);
      bool2 = b(locald);
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool2)
        paramInt1 = 1;
      paramParcel2.writeInt(paramInt1);
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
      paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        Bundle.CREATOR.createFromParcel(paramParcel1);
      paramParcel1 = bl();
      paramParcel2.writeNoException();
      if (paramParcel1 != null)
      {
        paramParcel2.writeInt(1);
        paramParcel1.writeToParcel(paramParcel2, 1);
      }
      else
      {
        paramParcel2.writeInt(0);
        continue;
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        locald = d.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0)
          Bundle.CREATOR.createFromParcel(paramParcel1);
        bool2 = c(locald);
        paramParcel2.writeNoException();
        paramInt1 = k;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        locald = d.a.a(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0)
          Uri.CREATOR.createFromParcel(paramParcel1);
        bool2 = d(locald);
        paramParcel2.writeNoException();
        paramInt1 = m;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        locald = d.a.a(paramParcel1.readStrongBinder());
        paramParcel1.readString();
        if (paramParcel1.readInt() != 0)
          Bundle.CREATOR.createFromParcel(paramParcel1);
        paramInt1 = e(locald);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        continue;
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
        locald = d.a.a(paramParcel1.readStrongBinder());
        paramParcel1.readInt();
        if (paramParcel1.readInt() != 0)
          Uri.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() != 0)
          Bundle.CREATOR.createFromParcel(paramParcel1);
        bool2 = f(locald);
        paramParcel2.writeNoException();
        paramInt1 = n;
        if (bool2)
          paramInt1 = 1;
        paramParcel2.writeInt(paramInt1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.customtabs.e.a
 * JD-Core Version:    0.6.2
 */