package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.List;

public final class Metadata
  implements Parcelable
{
  public static final Parcelable.Creator<Metadata> CREATOR;
  public final Metadata.Entry[] beW;

  static
  {
    AppMethodBeat.i(95346);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(95346);
  }

  Metadata(Parcel paramParcel)
  {
    AppMethodBeat.i(95342);
    this.beW = new Metadata.Entry[paramParcel.readInt()];
    for (int i = 0; i < this.beW.length; i++)
      this.beW[i] = ((Metadata.Entry)paramParcel.readParcelable(Metadata.Entry.class.getClassLoader()));
    AppMethodBeat.o(95342);
  }

  public Metadata(List<? extends Metadata.Entry> paramList)
  {
    AppMethodBeat.i(95341);
    this.beW = new Metadata.Entry[paramList.size()];
    paramList.toArray(this.beW);
    AppMethodBeat.o(95341);
  }

  public Metadata(Metadata.Entry[] paramArrayOfEntry)
  {
    this.beW = paramArrayOfEntry;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(95343);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(95343);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
        AppMethodBeat.o(95343);
      }
      else
      {
        paramObject = (Metadata)paramObject;
        bool = Arrays.equals(this.beW, paramObject.beW);
        AppMethodBeat.o(95343);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95344);
    int i = Arrays.hashCode(this.beW);
    AppMethodBeat.o(95344);
    return i;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95345);
    paramParcel.writeInt(this.beW.length);
    Metadata.Entry[] arrayOfEntry = this.beW;
    int i = arrayOfEntry.length;
    for (paramInt = 0; paramInt < i; paramInt++)
      paramParcel.writeParcelable(arrayOfEntry[paramInt], 0);
    AppMethodBeat.o(95345);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.Metadata
 * JD-Core Version:    0.6.2
 */