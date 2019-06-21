package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame
{
  public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
  public final boolean baT;
  private final Id3Frame[] bfr;
  public final String bfs;
  public final boolean bft;
  public final String[] bfu;

  static
  {
    AppMethodBeat.i(95297);
    CREATOR = new ChapterTocFrame.1();
    AppMethodBeat.o(95297);
  }

  ChapterTocFrame(Parcel paramParcel)
  {
    super("CTOC");
    AppMethodBeat.i(95293);
    this.bfs = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.bft = bool2;
      if (paramParcel.readByte() == 0)
        break label114;
    }
    label114: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.baT = bool2;
      this.bfu = paramParcel.createStringArray();
      int j = paramParcel.readInt();
      this.bfr = new Id3Frame[j];
      while (i < j)
      {
        this.bfr[i] = ((Id3Frame)paramParcel.readParcelable(Id3Frame.class.getClassLoader()));
        i++;
      }
      bool2 = false;
      break;
    }
    AppMethodBeat.o(95293);
  }

  public ChapterTocFrame(String paramString, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString, Id3Frame[] paramArrayOfId3Frame)
  {
    super("CTOC");
    this.bfs = paramString;
    this.bft = paramBoolean1;
    this.baT = paramBoolean2;
    this.bfu = paramArrayOfString;
    this.bfr = paramArrayOfId3Frame;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95294);
    if (this == paramObject)
      AppMethodBeat.o(95294);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95294);
        bool = false;
      }
      else
      {
        paramObject = (ChapterTocFrame)paramObject;
        if ((this.bft == paramObject.bft) && (this.baT == paramObject.baT) && (v.j(this.bfs, paramObject.bfs)) && (Arrays.equals(this.bfu, paramObject.bfu)) && (Arrays.equals(this.bfr, paramObject.bfr)))
        {
          AppMethodBeat.o(95294);
        }
        else
        {
          AppMethodBeat.o(95294);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(95295);
    int k;
    if (this.bft)
    {
      k = 1;
      if (!this.baT)
        break label66;
    }
    while (true)
    {
      if (this.bfs != null)
        j = this.bfs.hashCode();
      AppMethodBeat.o(95295);
      return ((k + 527) * 31 + i) * 31 + j;
      k = 0;
      break;
      label66: i = 0;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(95296);
    paramParcel.writeString(this.bfs);
    if (this.bft)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.baT)
        break label95;
    }
    label95: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeStringArray(this.bfu);
      paramParcel.writeInt(this.bfr.length);
      for (paramInt = 0; paramInt < this.bfr.length; paramInt++)
        paramParcel.writeParcelable(this.bfr[paramInt], 0);
      paramInt = 0;
      break;
    }
    AppMethodBeat.o(95296);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.ChapterTocFrame
 * JD-Core Version:    0.6.2
 */