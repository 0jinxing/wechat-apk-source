package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame
{
  public static final Parcelable.Creator<ApicFrame> CREATOR;
  public final int bfk;
  public final byte[] bfl;
  public final String description;
  public final String mimeType;

  static
  {
    AppMethodBeat.i(95279);
    CREATOR = new ApicFrame.1();
    AppMethodBeat.o(95279);
  }

  ApicFrame(Parcel paramParcel)
  {
    super("APIC");
    AppMethodBeat.i(95275);
    this.mimeType = paramParcel.readString();
    this.description = paramParcel.readString();
    this.bfk = paramParcel.readInt();
    this.bfl = paramParcel.createByteArray();
    AppMethodBeat.o(95275);
  }

  public ApicFrame(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    super("APIC");
    this.mimeType = paramString1;
    this.description = paramString2;
    this.bfk = paramInt;
    this.bfl = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95276);
    if (this == paramObject)
      AppMethodBeat.o(95276);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95276);
        bool = false;
      }
      else
      {
        paramObject = (ApicFrame)paramObject;
        if ((this.bfk == paramObject.bfk) && (v.j(this.mimeType, paramObject.mimeType)) && (v.j(this.description, paramObject.description)) && (Arrays.equals(this.bfl, paramObject.bfl)))
        {
          AppMethodBeat.o(95276);
        }
        else
        {
          AppMethodBeat.o(95276);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95277);
    int j = this.bfk;
    if (this.mimeType != null);
    for (int k = this.mimeType.hashCode(); ; k = 0)
    {
      if (this.description != null)
        i = this.description.hashCode();
      int m = Arrays.hashCode(this.bfl);
      AppMethodBeat.o(95277);
      return ((k + (j + 527) * 31) * 31 + i) * 31 + m;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95278);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.description);
    paramParcel.writeInt(this.bfk);
    paramParcel.writeByteArray(this.bfl);
    AppMethodBeat.o(95278);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ApicFrame
 * JD-Core Version:    0.6.2
 */