package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RecordConsentRequestCreator
  implements Parcelable.Creator<RecordConsentRequest>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public RecordConsentRequest createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61684);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    String str = null;
    Scope[] arrayOfScope = null;
    Account localAccount = null;
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
        localAccount = (Account)SafeParcelReader.createParcelable(paramParcel, k, Account.CREATOR);
        break;
      case 3:
        arrayOfScope = (Scope[])SafeParcelReader.createTypedArray(paramParcel, k, Scope.CREATOR);
        break;
      case 4:
        str = SafeParcelReader.createString(paramParcel, k);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new RecordConsentRequest(j, localAccount, arrayOfScope, str);
    AppMethodBeat.o(61684);
    return paramParcel;
  }

  public RecordConsentRequest[] newArray(int paramInt)
  {
    return new RecordConsentRequest[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.RecordConsentRequestCreator
 * JD-Core Version:    0.6.2
 */