package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GoogleCertificatesQueryCreator
  implements Parcelable.Creator<GoogleCertificatesQuery>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public GoogleCertificatesQuery createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89390);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    boolean bool = false;
    IBinder localIBinder = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(j))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, j);
        break;
      case 1:
        str = SafeParcelReader.createString(paramParcel, j);
        break;
      case 2:
        localIBinder = SafeParcelReader.readIBinder(paramParcel, j);
        break;
      case 3:
        bool = SafeParcelReader.readBoolean(paramParcel, j);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new GoogleCertificatesQuery(str, localIBinder, bool);
    AppMethodBeat.o(89390);
    return paramParcel;
  }

  public GoogleCertificatesQuery[] newArray(int paramInt)
  {
    return new GoogleCertificatesQuery[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.GoogleCertificatesQueryCreator
 * JD-Core Version:    0.6.2
 */