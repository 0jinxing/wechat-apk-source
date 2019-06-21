package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BulkCursorProxy
  implements IBulkCursor
{
  private Bundle mExtras;
  private IBinder mRemote;

  public BulkCursorProxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
    this.mExtras = null;
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }

  public final void close()
  {
    AppMethodBeat.i(11970);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11970);
    }
  }

  public final void deactivate()
  {
    AppMethodBeat.i(11969);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(2, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11969);
    }
  }

  public final Bundle getExtras()
  {
    AppMethodBeat.i(11972);
    Parcel localParcel1;
    Parcel localParcel2;
    if (this.mExtras == null)
    {
      localParcel1 = Parcel.obtain();
      localParcel2 = Parcel.obtain();
    }
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      this.mRemote.transact(5, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      this.mExtras = localParcel2.readBundle(getClass().getClassLoader());
      localParcel1.recycle();
      localParcel2.recycle();
      Bundle localBundle = this.mExtras;
      AppMethodBeat.o(11972);
      return localBundle;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11972);
    }
  }

  public final CursorWindow getWindow(int paramInt)
  {
    AppMethodBeat.i(11967);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(1, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      CursorWindow localCursorWindow = null;
      if (localParcel2.readInt() == 1)
        localCursorWindow = CursorWindow.newFromParcel(localParcel2);
      return localCursorWindow;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11967);
    }
  }

  public final void onMove(int paramInt)
  {
    AppMethodBeat.i(11968);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeInt(paramInt);
      this.mRemote.transact(4, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11968);
    }
  }

  public final int requery(IContentObserver paramIContentObserver)
  {
    AppMethodBeat.i(11971);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeStrongInterface(paramIContentObserver);
      boolean bool = this.mRemote.transact(3, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      int i;
      if (!bool)
        i = -1;
      while (true)
      {
        return i;
        i = localParcel2.readInt();
        this.mExtras = localParcel2.readBundle(getClass().getClassLoader());
      }
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11971);
    }
    throw paramIContentObserver;
  }

  public final Bundle respond(Bundle paramBundle)
  {
    AppMethodBeat.i(11973);
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.content.IBulkCursor");
      localParcel1.writeBundle(paramBundle);
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      DatabaseUtils.readExceptionFromParcel(localParcel2);
      paramBundle = localParcel2.readBundle(getClass().getClassLoader());
      return paramBundle;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
      AppMethodBeat.o(11973);
    }
    throw paramBundle;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.BulkCursorProxy
 * JD-Core Version:    0.6.2
 */