package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class BitmapTeleporterCreator
  implements Parcelable.Creator<BitmapTeleporter>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public BitmapTeleporter createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61017);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(m))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, m);
        break;
      case 1:
        k = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 2:
        localParcelFileDescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(paramParcel, m, ParcelFileDescriptor.CREATOR);
        break;
      case 3:
        j = SafeParcelReader.readInt(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new BitmapTeleporter(k, localParcelFileDescriptor, j);
    AppMethodBeat.o(61017);
    return paramParcel;
  }

  public BitmapTeleporter[] newArray(int paramInt)
  {
    return new BitmapTeleporter[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.BitmapTeleporterCreator
 * JD-Core Version:    0.6.2
 */