package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CommentFrame extends Id3Frame
{
  public static final Parcelable.Creator<CommentFrame> CREATOR;
  public final String aOt;
  public final String description;
  public final String text;

  static
  {
    AppMethodBeat.i(95303);
    CREATOR = new CommentFrame.1();
    AppMethodBeat.o(95303);
  }

  CommentFrame(Parcel paramParcel)
  {
    super("COMM");
    AppMethodBeat.i(95299);
    this.aOt = paramParcel.readString();
    this.description = paramParcel.readString();
    this.text = paramParcel.readString();
    AppMethodBeat.o(95299);
  }

  public CommentFrame(String paramString1, String paramString2, String paramString3)
  {
    super("COMM");
    this.aOt = paramString1;
    this.description = paramString2;
    this.text = paramString3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95300);
    if (this == paramObject)
      AppMethodBeat.o(95300);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95300);
        bool = false;
      }
      else
      {
        paramObject = (CommentFrame)paramObject;
        if ((v.j(this.description, paramObject.description)) && (v.j(this.aOt, paramObject.aOt)) && (v.j(this.text, paramObject.text)))
        {
          AppMethodBeat.o(95300);
        }
        else
        {
          AppMethodBeat.o(95300);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95301);
    int j;
    if (this.aOt != null)
    {
      j = this.aOt.hashCode();
      if (this.description == null)
        break label78;
    }
    label78: for (int k = this.description.hashCode(); ; k = 0)
    {
      if (this.text != null)
        i = this.text.hashCode();
      AppMethodBeat.o(95301);
      return (k + (j + 527) * 31) * 31 + i;
      j = 0;
      break;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95302);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.aOt);
    paramParcel.writeString(this.text);
    AppMethodBeat.o(95302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.CommentFrame
 * JD-Core Version:    0.6.2
 */