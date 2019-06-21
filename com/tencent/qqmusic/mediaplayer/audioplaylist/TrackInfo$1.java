package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TrackInfo$1
  implements Parcelable.Creator<TrackInfo>
{
  public final TrackInfo createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(111090);
    int i = paramParcel.readInt();
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    long l1 = paramParcel.readLong();
    long l2 = paramParcel.readLong();
    String str3 = paramParcel.readString();
    String str4 = paramParcel.readString();
    paramParcel = new TrackInfo(i);
    paramParcel.setFilePath(str1);
    paramParcel.setTitle(str2);
    paramParcel.setStartPosition(l1);
    paramParcel.setEndPostion(l2);
    paramParcel.setPerformer(str3);
    paramParcel.setAlbum(str4);
    AppMethodBeat.o(111090);
    return paramParcel;
  }

  public final TrackInfo[] newArray(int paramInt)
  {
    return new TrackInfo[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo.1
 * JD-Core Version:    0.6.2
 */