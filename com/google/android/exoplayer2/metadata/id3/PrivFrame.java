package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class PrivFrame extends Id3Frame
{
  public static final Parcelable.Creator<PrivFrame> CREATOR;
  public final byte[] bfA;
  public final String bfz;

  static
  {
    AppMethodBeat.i(95327);
    CREATOR = new PrivFrame.1();
    AppMethodBeat.o(95327);
  }

  PrivFrame(Parcel paramParcel)
  {
    super("PRIV");
    AppMethodBeat.i(95323);
    this.bfz = paramParcel.readString();
    this.bfA = paramParcel.createByteArray();
    AppMethodBeat.o(95323);
  }

  public PrivFrame(String paramString, byte[] paramArrayOfByte)
  {
    super("PRIV");
    this.bfz = paramString;
    this.bfA = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95324);
    if (this == paramObject)
      AppMethodBeat.o(95324);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95324);
        bool = false;
      }
      else
      {
        paramObject = (PrivFrame)paramObject;
        if ((v.j(this.bfz, paramObject.bfz)) && (Arrays.equals(this.bfA, paramObject.bfA)))
        {
          AppMethodBeat.o(95324);
        }
        else
        {
          AppMethodBeat.o(95324);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95325);
    if (this.bfz != null);
    for (int i = this.bfz.hashCode(); ; i = 0)
    {
      int j = Arrays.hashCode(this.bfA);
      AppMethodBeat.o(95325);
      return (i + 527) * 31 + j;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95326);
    paramParcel.writeString(this.bfz);
    paramParcel.writeByteArray(this.bfA);
    AppMethodBeat.o(95326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.PrivFrame
 * JD-Core Version:    0.6.2
 */