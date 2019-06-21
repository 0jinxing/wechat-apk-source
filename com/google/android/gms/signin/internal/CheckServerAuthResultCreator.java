package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class CheckServerAuthResultCreator
  implements Parcelable.Creator<CheckServerAuthResult>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public CheckServerAuthResult createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61661);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    ArrayList localArrayList = null;
    boolean bool = false;
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
        bool = SafeParcelReader.readBoolean(paramParcel, k);
        break;
      case 3:
        localArrayList = SafeParcelReader.createTypedList(paramParcel, k, Scope.CREATOR);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new CheckServerAuthResult(j, bool, localArrayList);
    AppMethodBeat.o(61661);
    return paramParcel;
  }

  public CheckServerAuthResult[] newArray(int paramInt)
  {
    return new CheckServerAuthResult[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.internal.CheckServerAuthResultCreator
 * JD-Core Version:    0.6.2
 */