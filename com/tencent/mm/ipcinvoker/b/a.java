package com.tencent.mm.ipcinvoker.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a extends IInterface
{
  public abstract void a(Bundle paramBundle, String paramString, b paramb);

  public abstract Bundle f(Bundle paramBundle, String paramString);

  static final class a$a
    implements a
  {
    private IBinder mRemote;

    a$a(IBinder paramIBinder)
    {
      this.mRemote = paramIBinder;
    }

    public final void a(Bundle paramBundle, String paramString, b paramb)
    {
      Object localObject = null;
      AppMethodBeat.i(114070);
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
        if (paramBundle != null)
        {
          localParcel.writeInt(1);
          paramBundle.writeToParcel(localParcel, 0);
        }
        while (true)
        {
          localParcel.writeString(paramString);
          paramBundle = localObject;
          if (paramb != null)
            paramBundle = paramb.asBinder();
          localParcel.writeStrongBinder(paramBundle);
          this.mRemote.transact(1, localParcel, null, 1);
          return;
          localParcel.writeInt(0);
        }
      }
      finally
      {
        localParcel.recycle();
        AppMethodBeat.o(114070);
      }
      throw paramBundle;
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }

    public final Bundle f(Bundle paramBundle, String paramString)
    {
      AppMethodBeat.i(114071);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      while (true)
      {
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            this.mRemote.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
            {
              paramBundle = (Bundle)Bundle.CREATOR.createFromParcel(localParcel2);
              return paramBundle;
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
          AppMethodBeat.o(114071);
        }
        paramBundle = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.b.a
 * JD-Core Version:    0.6.2
 */