package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class GoogleSignInAccountCreator
  implements Parcelable.Creator<GoogleSignInAccount>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public GoogleSignInAccount createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(60346);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Uri localUri = null;
    String str5 = null;
    long l = 0L;
    String str6 = null;
    ArrayList localArrayList = null;
    String str7 = null;
    String str8 = null;
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
        str1 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 3:
        str2 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 4:
        str3 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 5:
        str4 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 6:
        localUri = (Uri)SafeParcelReader.createParcelable(paramParcel, k, Uri.CREATOR);
        break;
      case 7:
        str5 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 8:
        l = SafeParcelReader.readLong(paramParcel, k);
        break;
      case 9:
        str6 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 10:
        localArrayList = SafeParcelReader.createTypedList(paramParcel, k, Scope.CREATOR);
        break;
      case 11:
        str7 = SafeParcelReader.createString(paramParcel, k);
        break;
      case 12:
        str8 = SafeParcelReader.createString(paramParcel, k);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new GoogleSignInAccount(j, str1, str2, str3, str4, localUri, str5, l, str6, localArrayList, str7, str8);
    AppMethodBeat.o(60346);
    return paramParcel;
  }

  public GoogleSignInAccount[] newArray(int paramInt)
  {
    return new GoogleSignInAccount[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignInAccountCreator
 * JD-Core Version:    0.6.2
 */