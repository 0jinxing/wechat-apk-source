package com.tencent.mm.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface b extends IInterface
{
  public abstract void a(Intent paramIntent, a parama);

  public abstract void aH(Intent paramIntent);

  public abstract void aI(Intent paramIntent);

  public abstract void aN(Intent paramIntent);

  public static abstract class a extends Binder
    implements b
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.service.IMMServiceStub_AIDL");
    }

    public static b N(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        paramIBinder = null;
      while (true)
      {
        return paramIBinder;
        IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        if ((localIInterface != null) && ((localIInterface instanceof b)))
          paramIBinder = (b)localIInterface;
        else
          paramIBinder = new a(paramIBinder);
      }
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      IInterface localIInterface = null;
      boolean bool;
      switch (paramInt1)
      {
      default:
      case 1598968902:
        for (bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2); ; bool = true)
        {
          return bool;
          paramParcel2.writeString("com.tencent.mm.service.IMMServiceStub_AIDL");
        }
      case 1:
        paramParcel1.enforceInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        Intent localIntent;
        if (paramParcel1.readInt() != 0)
        {
          localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);
          paramParcel1 = paramParcel1.readStrongBinder();
          if (paramParcel1 != null)
            break label144;
          paramParcel1 = localIInterface;
        }
        while (true)
        {
          a(localIntent, paramParcel1);
          paramParcel2.writeNoException();
          bool = true;
          break;
          localIntent = null;
          break label109;
          localIInterface = paramParcel1.queryLocalInterface("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
          if ((localIInterface != null) && ((localIInterface instanceof a)))
            paramParcel1 = (a)localIInterface;
          else
            paramParcel1 = new a.a.a(paramParcel1);
        }
      case 2:
        paramParcel1.enforceInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          aN(paramParcel1);
          paramParcel2.writeNoException();
          bool = true;
          break;
        }
      case 3:
        label109: paramParcel1.enforceInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        label144: if (paramParcel1.readInt() != 0);
        for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
        {
          aH(paramParcel1);
          paramParcel2.writeNoException();
          bool = true;
          break;
        }
      case 4:
      }
      paramParcel1.enforceInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
      if (paramParcel1.readInt() != 0);
      for (paramParcel1 = (Intent)Intent.CREATOR.createFromParcel(paramParcel1); ; paramParcel1 = null)
      {
        aI(paramParcel1);
        paramParcel2.writeNoException();
        bool = true;
        break;
      }
    }

    static final class a
      implements b
    {
      private IBinder mRemote;

      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }

      public final void a(Intent paramIntent, a parama)
      {
        AppMethodBeat.i(115268);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
            if (paramIntent != null)
            {
              localParcel1.writeInt(1);
              paramIntent.writeToParcel(localParcel1, 0);
              if (parama != null)
              {
                paramIntent = parama.asBinder();
                localParcel1.writeStrongBinder(paramIntent);
                this.mRemote.transact(1, localParcel1, localParcel2, 0);
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
            AppMethodBeat.o(115268);
          }
          paramIntent = null;
        }
      }

      public final void aH(Intent paramIntent)
      {
        AppMethodBeat.i(115270);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
          if (paramIntent != null)
          {
            localParcel1.writeInt(1);
            paramIntent.writeToParcel(localParcel1, 0);
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
          AppMethodBeat.o(115270);
        }
        throw paramIntent;
      }

      public final void aI(Intent paramIntent)
      {
        AppMethodBeat.i(115271);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
          if (paramIntent != null)
          {
            localParcel1.writeInt(1);
            paramIntent.writeToParcel(localParcel1, 0);
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
          AppMethodBeat.o(115271);
        }
        throw paramIntent;
      }

      public final void aN(Intent paramIntent)
      {
        AppMethodBeat.i(115269);
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.service.IMMServiceStub_AIDL");
          if (paramIntent != null)
          {
            localParcel1.writeInt(1);
            paramIntent.writeToParcel(localParcel1, 0);
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
          AppMethodBeat.o(115269);
        }
        throw paramIntent;
      }

      public final IBinder asBinder()
      {
        return this.mRemote;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.service.b
 * JD-Core Version:    0.6.2
 */