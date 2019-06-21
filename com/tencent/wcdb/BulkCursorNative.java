package com.tencent.wcdb;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class BulkCursorNative extends Binder
  implements IBulkCursor
{
  public BulkCursorNative()
  {
    attachInterface(this, "android.content.IBulkCursor");
  }

  public static IBulkCursor asInterface(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null)
      localObject = null;
    while (true)
    {
      return localObject;
      IBulkCursor localIBulkCursor = (IBulkCursor)paramIBinder.queryLocalInterface("android.content.IBulkCursor");
      localObject = localIBulkCursor;
      if (localIBulkCursor == null)
        localObject = new BulkCursorProxy(paramIBinder);
    }
  }

  public IBinder asBinder()
  {
    return this;
  }

  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default:
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1:
    case 2:
    case 7:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return bool;
      try
      {
        paramParcel1.enforceInterface("android.content.IBulkCursor");
        paramParcel1 = getWindow(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (paramParcel1 != null)
          break label102;
        paramParcel2.writeInt(0);
      }
      catch (Exception paramParcel1)
      {
        DatabaseUtils.writeExceptionToParcel(paramParcel2, paramParcel1);
      }
      continue;
      label102: paramParcel2.writeInt(1);
      paramParcel1.writeToParcel(paramParcel2, 1);
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      deactivate();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      close();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      paramInt1 = requery(IContentObserver.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      paramParcel2.writeBundle(getExtras());
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      onMove(paramParcel1.readInt());
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      paramParcel1 = getExtras();
      paramParcel2.writeNoException();
      paramParcel2.writeBundle(paramParcel1);
      continue;
      paramParcel1.enforceInterface("android.content.IBulkCursor");
      paramParcel1 = respond(paramParcel1.readBundle(getClass().getClassLoader()));
      paramParcel2.writeNoException();
      paramParcel2.writeBundle(paramParcel1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.BulkCursorNative
 * JD-Core Version:    0.6.2
 */