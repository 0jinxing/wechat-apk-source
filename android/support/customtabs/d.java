package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface d extends IInterface
{
  public abstract void a(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle);

  public abstract void a(int paramInt, Bundle paramBundle);

  public abstract void b(Bundle paramBundle);

  public abstract void b(String paramString, Bundle paramBundle);

  public abstract void c(String paramString, Bundle paramBundle);

  public static abstract class a extends Binder
    implements d
  {
    public static d a(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
        if ((localIInterface != null) && ((localIInterface instanceof d)))
          paramIBinder = (d)localIInterface;
        else
          paramIBinder = new a(paramIBinder);
      }
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      boolean bool1 = true;
      boolean bool2;
      Object localObject;
      switch (paramInt1)
      {
      default:
      case 1598968902:
        for (bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool2 = bool1)
        {
          return bool2;
          paramParcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        }
      case 2:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        paramInt1 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          a(paramInt1, paramParcel1);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
        }
      case 3:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        localObject = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          b((String)localObject, paramParcel1);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
        }
      case 4:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          b(paramParcel1);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
        }
      case 5:
        paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        localObject = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          c((String)localObject, paramParcel1);
          paramParcel2.writeNoException();
          bool2 = bool1;
          break;
        }
      case 6:
      }
      paramParcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0)
      {
        localObject = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        label333: if (paramParcel1.readInt() == 0)
          break label390;
        bool2 = true;
        label343: if (paramParcel1.readInt() == 0)
          break label396;
      }
      label390: label396: for (paramParcel1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
      {
        a(paramInt1, (Uri)localObject, bool2, paramParcel1);
        paramParcel2.writeNoException();
        bool2 = bool1;
        break;
        localObject = null;
        break label333;
        bool2 = false;
        break label343;
      }
    }

    static final class a
      implements d
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle)
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            localParcel1.writeInt(paramInt);
            if (paramUri != null)
            {
              localParcel1.writeInt(1);
              paramUri.writeToParcel(localParcel1, 0);
              if (paramBoolean)
              {
                paramInt = i;
                localParcel1.writeInt(paramInt);
                if (paramBundle == null)
                  break label135;
                localParcel1.writeInt(1);
                paramBundle.writeToParcel(localParcel1, 0);
                this.mRemote.transact(6, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          paramInt = 0;
          continue;
          label135: localParcel1.writeInt(0);
        }
      }

      public final void a(int paramInt, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.mRemote.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw paramBundle;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }

      public final void b(Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.mRemote.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw paramBundle;
      }

      public final void b(String paramString, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.mRemote.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw paramString;
      }

      public final void c(String paramString, Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          localParcel1.writeString(paramString);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.mRemote.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw paramString;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.customtabs.d
 * JD-Core Version:    0.6.2
 */