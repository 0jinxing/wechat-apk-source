package com.tencent.b.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b$a extends Binder
  implements b
{
  private static final String DESCRIPTOR = "com.tencent.assistant.sdk.SDKActionCallback";
  static final int TRANSACTION_onActionResult = 1;

  public b$a()
  {
    attachInterface(this, "com.tencent.assistant.sdk.SDKActionCallback");
  }

  public static b asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null)
      paramIBinder = null;
    while (true)
    {
      return paramIBinder;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.assistant.sdk.SDKActionCallback");
      if ((localIInterface != null) && ((localIInterface instanceof b)))
        paramIBinder = (b)localIInterface;
      else
        paramIBinder = new b.a.a(paramIBinder);
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
    case 1598968902:
    case 1:
    }
    while (true)
    {
      return bool;
      paramParcel2.writeString("com.tencent.assistant.sdk.SDKActionCallback");
      continue;
      paramParcel1.enforceInterface("com.tencent.assistant.sdk.SDKActionCallback");
      onActionResult(paramParcel1.createByteArray());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.b.a.a.b.a
 * JD-Core Version:    0.6.2
 */