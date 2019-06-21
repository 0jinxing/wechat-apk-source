package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class f$a extends Binder
  implements f
{
  public f$a()
  {
    attachInterface(this, "android.support.customtabs.IPostMessageService");
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = null;
    String str = null;
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902:
    case 2:
    case 3:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("android.support.customtabs.IPostMessageService");
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      d locald = d.a.a(paramParcel1.readStrongBinder());
      localObject = str;
      if (paramParcel1.readInt() != 0)
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(locald, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      locald = d.a.a(paramParcel1.readStrongBinder());
      str = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      a(locald, str, (Bundle)localObject);
      paramParcel2.writeNoException();
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.customtabs.f.a
 * JD-Core Version:    0.6.2
 */