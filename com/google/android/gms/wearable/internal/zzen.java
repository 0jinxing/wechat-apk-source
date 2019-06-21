package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.wearable.zzb;
import com.google.android.gms.internal.wearable.zzc;

public abstract class zzen extends zzb
  implements zzem
{
  public zzen()
  {
    super("com.google.android.gms.wearable.internal.IWearableListener");
  }

  public final boolean dispatchTransaction(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool;
    switch (paramInt1)
    {
    default:
      bool = false;
      return bool;
    case 1:
      zza((DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR));
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      bool = true;
      break;
      zza((zzfe)zzc.zza(paramParcel1, zzfe.CREATOR));
      continue;
      zza((zzfo)zzc.zza(paramParcel1, zzfo.CREATOR));
      continue;
      zzb((zzfo)zzc.zza(paramParcel1, zzfo.CREATOR));
      continue;
      onConnectedNodes(paramParcel1.createTypedArrayList(zzfo.CREATOR));
      continue;
      zza((zzl)zzc.zza(paramParcel1, zzl.CREATOR));
      continue;
      zza((zzaw)zzc.zza(paramParcel1, zzaw.CREATOR));
      continue;
      zza((zzah)zzc.zza(paramParcel1, zzah.CREATOR));
      continue;
      zza((zzi)zzc.zza(paramParcel1, zzi.CREATOR));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzen
 * JD-Core Version:    0.6.2
 */