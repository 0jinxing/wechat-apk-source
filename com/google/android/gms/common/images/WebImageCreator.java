package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WebImageCreator
  implements Parcelable.Creator<WebImage>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public WebImage createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61255);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Uri localUri = null;
    int j = 0;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(n))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, n);
        break;
      case 1:
        m = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 2:
        localUri = (Uri)SafeParcelReader.createParcelable(paramParcel, n, Uri.CREATOR);
        break;
      case 3:
        k = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 4:
        j = SafeParcelReader.readInt(paramParcel, n);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new WebImage(m, localUri, k, j);
    AppMethodBeat.o(61255);
    return paramParcel;
  }

  public WebImage[] newArray(int paramInt)
  {
    return new WebImage[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.WebImageCreator
 * JD-Core Version:    0.6.2
 */