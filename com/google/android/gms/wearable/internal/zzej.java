package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.internal.wearable.zzb;

public abstract class zzej extends zzb
  implements zzei
{
  public zzej()
  {
    super("com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
  }

  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 2)
    {
      zza(paramParcel1.readInt(), paramParcel1.readInt());
      paramParcel2.writeNoException();
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzej
 * JD-Core Version:    0.6.2
 */