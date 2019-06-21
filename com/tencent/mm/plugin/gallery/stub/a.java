package com.tencent.mm.plugin.gallery.stub;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface a extends IInterface
{
  public abstract int ND(String paramString);

  public abstract int Na();

  public abstract int Nb();

  public abstract int Nd();

  public abstract void a(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2);

  public abstract void aK(int paramInt, String paramString);

  public abstract void bCv();

  public abstract boolean hC(boolean paramBoolean);

  static final class a$a
    implements a
  {
    private IBinder mRemote;

    a$a(IBinder paramIBinder)
    {
      this.mRemote = paramIBinder;
    }

    public final int ND(String paramString)
    {
      AppMethodBeat.i(21358);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        localParcel1.writeString(paramString);
        this.mRemote.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21358);
      }
      throw paramString;
    }

    public final int Na()
    {
      AppMethodBeat.i(21356);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        this.mRemote.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21356);
      }
    }

    public final int Nb()
    {
      AppMethodBeat.i(21355);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        this.mRemote.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21355);
      }
    }

    public final int Nd()
    {
      AppMethodBeat.i(21353);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        this.mRemote.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21353);
      }
    }

    public final void a(String paramString1, String paramString2, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
    {
      int i = 1;
      AppMethodBeat.i(21354);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        localParcel1.writeString(paramString1);
        localParcel1.writeString(paramString2);
        int j;
        if (paramBoolean1)
        {
          j = 1;
          localParcel1.writeInt(j);
          localParcel1.writeInt(paramInt);
          if (!paramBoolean2)
            break label119;
        }
        label119: for (paramInt = i; ; paramInt = 0)
        {
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          j = 0;
          break;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21354);
      }
      throw paramString1;
    }

    public final void aK(int paramInt, String paramString)
    {
      AppMethodBeat.i(21351);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        localParcel1.writeInt(paramInt);
        localParcel1.writeString(paramString);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21351);
      }
      throw paramString;
    }

    public final IBinder asBinder()
    {
      return this.mRemote;
    }

    public final void bCv()
    {
      AppMethodBeat.i(21352);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        this.mRemote.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21352);
      }
    }

    public final boolean hC(boolean paramBoolean)
    {
      boolean bool = true;
      AppMethodBeat.i(21357);
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.tencent.mm.plugin.gallery.stub.Gallery_AIDL");
        int i;
        if (paramBoolean)
        {
          i = 1;
          localParcel1.writeInt(i);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0)
            break label94;
        }
        label94: for (paramBoolean = bool; ; paramBoolean = false)
        {
          return paramBoolean;
          i = 0;
          break;
        }
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
        AppMethodBeat.o(21357);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.stub.a
 * JD-Core Version:    0.6.2
 */