package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class TextInformationFrame extends Id3Frame
{
  public static final Parcelable.Creator<TextInformationFrame> CREATOR;
  public final String description;
  public final String value;

  static
  {
    AppMethodBeat.i(95333);
    CREATOR = new TextInformationFrame.1();
    AppMethodBeat.o(95333);
  }

  TextInformationFrame(Parcel paramParcel)
  {
    super(paramParcel.readString());
    AppMethodBeat.i(95329);
    this.description = paramParcel.readString();
    this.value = paramParcel.readString();
    AppMethodBeat.o(95329);
  }

  public TextInformationFrame(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.description = paramString2;
    this.value = paramString3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95330);
    if (this == paramObject)
      AppMethodBeat.o(95330);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95330);
        bool = false;
      }
      else
      {
        paramObject = (TextInformationFrame)paramObject;
        if ((this.id.equals(paramObject.id)) && (v.j(this.description, paramObject.description)) && (v.j(this.value, paramObject.value)))
        {
          AppMethodBeat.o(95330);
        }
        else
        {
          AppMethodBeat.o(95330);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95331);
    int j = this.id.hashCode();
    if (this.description != null);
    for (int k = this.description.hashCode(); ; k = 0)
    {
      if (this.value != null)
        i = this.value.hashCode();
      AppMethodBeat.o(95331);
      return (k + (j + 527) * 31) * 31 + i;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95332);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.value);
    AppMethodBeat.o(95332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.TextInformationFrame
 * JD-Core Version:    0.6.2
 */