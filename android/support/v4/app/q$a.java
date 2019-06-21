package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class q$a extends Binder
  implements q
{
  public static q b(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
      if ((localIInterface != null) && ((localIInterface instanceof q)))
        paramIBinder = (q)localIInterface;
      else
        paramIBinder = new a(paramIBinder);
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
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("android.support.v4.app.INotificationSideChannel");
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      String str = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramParcel2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0);
      for (paramParcel1 = (Notification)Notification.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
      {
        a(str, paramInt1, paramParcel2, paramParcel1);
        bool = true;
        break;
      }
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      b(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString());
      bool = true;
      continue;
      paramParcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      J(paramParcel1.readString());
      bool = true;
    }
  }

  static final class a
    implements q
  {
    private IBinder mRemote;

    a(IBinder paramIBinder)
    {
      this.mRemote = paramIBinder;
    }

    public final void J(String paramString)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString);
        this.mRemote.transact(3, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
      throw paramString;
    }

    public final void a(String paramString1, int paramInt, String paramString2, Notification paramNotification)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString1);
        localParcel.writeInt(paramInt);
        localParcel.writeString(paramString2);
        if (paramNotification != null)
        {
          localParcel.writeInt(1);
          paramNotification.writeToParcel(localParcel, 0);
        }
        while (true)
        {
          this.mRemote.transact(1, localParcel, null, 1);
          return;
          localParcel.writeInt(0);
        }
      }
      finally
      {
        localParcel.recycle();
      }
      throw paramString1;
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }

    public final void b(String paramString1, int paramInt, String paramString2)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
        localParcel.writeString(paramString1);
        localParcel.writeInt(paramInt);
        localParcel.writeString(paramString2);
        this.mRemote.transact(2, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
      throw paramString1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.app.q.a
 * JD-Core Version:    0.6.2
 */