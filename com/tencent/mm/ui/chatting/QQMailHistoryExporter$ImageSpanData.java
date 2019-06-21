package com.tencent.mm.ui.chatting;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class QQMailHistoryExporter$ImageSpanData
  implements Parcelable
{
  public static final Parcelable.Creator<ImageSpanData> CREATOR;
  int coc;
  int endPos;
  String path;
  private int thumbnail = 0;

  static
  {
    AppMethodBeat.i(30969);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(30969);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(30968);
    paramParcel.writeInt(this.coc);
    paramParcel.writeInt(this.endPos);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.thumbnail);
    AppMethodBeat.o(30968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.QQMailHistoryExporter.ImageSpanData
 * JD-Core Version:    0.6.2
 */