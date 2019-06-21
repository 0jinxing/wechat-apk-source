package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class GoogleSignInOptionsCreator
  implements Parcelable.Creator<GoogleSignInOptions>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public GoogleSignInOptions createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(60380);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    ArrayList localArrayList1 = null;
    String str1 = null;
    String str2 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    Account localAccount = null;
    ArrayList localArrayList2 = null;
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
        localArrayList2 = SafeParcelReader.createTypedList(paramParcel, k, Scope.CREATOR);
        break;
      case 3:
        localAccount = (Account)SafeParcelReader.createParcelable(paramParcel, k, Account.CREATOR);
        break;
      case 4:
        bool3 = SafeParcelReader.readBoolean(paramParcel, k);
        break;
      case 5:
        bool2 = SafeParcelReader.readBoolean(paramParcel, k);
        break;
      case 6:
        bool1 = SafeParcelReader.readBoolean(paramParcel, k);
        break;
      case 7:
        str2 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 8:
        str1 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 9:
        localArrayList1 = SafeParcelReader.createTypedList(paramParcel, k, GoogleSignInOptionsExtensionParcelable.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new GoogleSignInOptions(j, localArrayList2, localAccount, bool3, bool2, bool1, str2, str1, localArrayList1);
    AppMethodBeat.o(60380);
    return paramParcel;
  }

  public GoogleSignInOptions[] newArray(int paramInt)
  {
    return new GoogleSignInOptions[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInOptionsCreator
 * JD-Core Version:    0.6.2
 */