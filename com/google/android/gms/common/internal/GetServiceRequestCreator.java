package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GetServiceRequestCreator
  implements Parcelable.Creator<GetServiceRequest>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public GetServiceRequest createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(89611);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    int k = 0;
    int m = 0;
    String str = null;
    IBinder localIBinder = null;
    Scope[] arrayOfScope = null;
    Bundle localBundle = null;
    Account localAccount = null;
    Feature[] arrayOfFeature1 = null;
    Feature[] arrayOfFeature2 = null;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int n = SafeParcelReader.readHeader(paramParcel);
      switch (SafeParcelReader.getFieldId(n))
      {
      case 9:
      default:
        SafeParcelReader.skipUnknownField(paramParcel, n);
        break;
      case 1:
        j = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 2:
        k = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 3:
        m = SafeParcelReader.readInt(paramParcel, n);
        break;
      case 4:
        str = SafeParcelReader.createString(paramParcel, n);
        break;
      case 5:
        localIBinder = SafeParcelReader.readIBinder(paramParcel, n);
        break;
      case 6:
        arrayOfScope = (Scope[])SafeParcelReader.createTypedArray(paramParcel, n, Scope.CREATOR);
        break;
      case 7:
        localBundle = SafeParcelReader.createBundle(paramParcel, n);
        break;
      case 8:
        localAccount = (Account)SafeParcelReader.createParcelable(paramParcel, n, Account.CREATOR);
        break;
      case 10:
        arrayOfFeature1 = (Feature[])SafeParcelReader.createTypedArray(paramParcel, n, Feature.CREATOR);
        break;
      case 11:
        arrayOfFeature2 = (Feature[])SafeParcelReader.createTypedArray(paramParcel, n, Feature.CREATOR);
        break;
      case 12:
        bool = SafeParcelReader.readBoolean(paramParcel, n);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new GetServiceRequest(j, k, m, str, localIBinder, arrayOfScope, localBundle, localAccount, arrayOfFeature1, arrayOfFeature2, bool);
    AppMethodBeat.o(89611);
    return paramParcel;
  }

  public GetServiceRequest[] newArray(int paramInt)
  {
    return new GetServiceRequest[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.GetServiceRequestCreator
 * JD-Core Version:    0.6.2
 */