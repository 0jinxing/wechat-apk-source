package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ResolveAccountResponseCreator
  implements Parcelable.Creator<ResolveAccountResponse>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public ResolveAccountResponse createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61370);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    boolean bool1 = false;
    boolean bool2 = false;
    ConnectionResult localConnectionResult = null;
    IBinder localIBinder = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(k))
      {
      default:
        SafeParcelReader.skipUnknownField(paramParcel, k);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, k);
        break;
      case 2:
        localIBinder = SafeParcelReader.readIBinder(paramParcel, k);
        break;
      case 3:
        localConnectionResult = (ConnectionResult)SafeParcelReader.createParcelable(paramParcel, k, ConnectionResult.CREATOR);
        break;
      case 4:
        bool2 = SafeParcelReader.readBoolean(paramParcel, k);
        break;
      case 5:
        bool1 = SafeParcelReader.readBoolean(paramParcel, k);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new ResolveAccountResponse(j, localIBinder, localConnectionResult, bool2, bool1);
    AppMethodBeat.o(61370);
    return paramParcel;
  }

  public ResolveAccountResponse[] newArray(int paramInt)
  {
    return new ResolveAccountResponse[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResolveAccountResponseCreator
 * JD-Core Version:    0.6.2
 */