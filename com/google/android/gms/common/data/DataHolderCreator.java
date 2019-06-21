package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DataHolderCreator
  implements Parcelable.Creator<DataHolder>
{
  public static final int CONTENT_DESCRIPTION = 0;

  public DataHolder createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(61123);
    int i = SafeParcelReader.validateObjectHeader(paramParcel);
    Bundle localBundle = null;
    int j = 0;
    CursorWindow[] arrayOfCursorWindow = null;
    String[] arrayOfString = null;
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
        arrayOfString = SafeParcelReader.createStringArray(paramParcel, m);
        break;
      case 2:
        arrayOfCursorWindow = (CursorWindow[])SafeParcelReader.createTypedArray(paramParcel, m, CursorWindow.CREATOR);
        break;
      case 3:
        j = SafeParcelReader.readInt(paramParcel, m);
        break;
      case 4:
        localBundle = SafeParcelReader.createBundle(paramParcel, m);
        break;
      case 1000:
        k = SafeParcelReader.readInt(paramParcel, m);
      }
    }
    SafeParcelReader.ensureAtEnd(paramParcel, i);
    paramParcel = new DataHolder(k, arrayOfString, arrayOfCursorWindow, j, localBundle);
    paramParcel.validateContents();
    AppMethodBeat.o(61123);
    return paramParcel;
  }

  public DataHolder[] newArray(int paramInt)
  {
    return new DataHolder[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolderCreator
 * JD-Core Version:    0.6.2
 */