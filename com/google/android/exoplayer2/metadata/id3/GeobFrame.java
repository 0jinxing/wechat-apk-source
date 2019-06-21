package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class GeobFrame extends Id3Frame
{
  public static final Parcelable.Creator<GeobFrame> CREATOR;
  public final byte[] data;
  public final String description;
  public final String filename;
  public final String mimeType;

  static
  {
    AppMethodBeat.i(95309);
    CREATOR = new GeobFrame.1();
    AppMethodBeat.o(95309);
  }

  GeobFrame(Parcel paramParcel)
  {
    super("GEOB");
    AppMethodBeat.i(95305);
    this.mimeType = paramParcel.readString();
    this.filename = paramParcel.readString();
    this.description = paramParcel.readString();
    this.data = paramParcel.createByteArray();
    AppMethodBeat.o(95305);
  }

  public GeobFrame(String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    super("GEOB");
    this.mimeType = paramString1;
    this.filename = paramString2;
    this.description = paramString3;
    this.data = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95306);
    if (this == paramObject)
      AppMethodBeat.o(95306);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95306);
        bool = false;
      }
      else
      {
        paramObject = (GeobFrame)paramObject;
        if ((v.j(this.mimeType, paramObject.mimeType)) && (v.j(this.filename, paramObject.filename)) && (v.j(this.description, paramObject.description)) && (Arrays.equals(this.data, paramObject.data)))
        {
          AppMethodBeat.o(95306);
        }
        else
        {
          AppMethodBeat.o(95306);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95307);
    int j;
    if (this.mimeType != null)
    {
      j = this.mimeType.hashCode();
      if (this.filename == null)
        break label93;
    }
    label93: for (int k = this.filename.hashCode(); ; k = 0)
    {
      if (this.description != null)
        i = this.description.hashCode();
      int m = Arrays.hashCode(this.data);
      AppMethodBeat.o(95307);
      return ((k + (j + 527) * 31) * 31 + i) * 31 + m;
      j = 0;
      break;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95308);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.filename);
    paramParcel.writeString(this.description);
    paramParcel.writeByteArray(this.data);
    AppMethodBeat.o(95308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.GeobFrame
 * JD-Core Version:    0.6.2
 */