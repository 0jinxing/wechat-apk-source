package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class UrlLinkFrame extends Id3Frame
{
  public static final Parcelable.Creator<UrlLinkFrame> CREATOR;
  public final String description;
  public final String url;

  static
  {
    AppMethodBeat.i(95339);
    CREATOR = new UrlLinkFrame.1();
    AppMethodBeat.o(95339);
  }

  UrlLinkFrame(Parcel paramParcel)
  {
    super(paramParcel.readString());
    AppMethodBeat.i(95335);
    this.description = paramParcel.readString();
    this.url = paramParcel.readString();
    AppMethodBeat.o(95335);
  }

  public UrlLinkFrame(String paramString1, String paramString2, String paramString3)
  {
    super(paramString1);
    this.description = paramString2;
    this.url = paramString3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95336);
    if (this == paramObject)
      AppMethodBeat.o(95336);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95336);
        bool = false;
      }
      else
      {
        paramObject = (UrlLinkFrame)paramObject;
        if ((this.id.equals(paramObject.id)) && (v.j(this.description, paramObject.description)) && (v.j(this.url, paramObject.url)))
        {
          AppMethodBeat.o(95336);
        }
        else
        {
          AppMethodBeat.o(95336);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95337);
    int j = this.id.hashCode();
    if (this.description != null);
    for (int k = this.description.hashCode(); ; k = 0)
    {
      if (this.url != null)
        i = this.url.hashCode();
      AppMethodBeat.o(95337);
      return (k + (j + 527) * 31) * 31 + i;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95338);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.url);
    AppMethodBeat.o(95338);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
 * JD-Core Version:    0.6.2
 */