package com.tencent.tmassistantsdk.downloadclient;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class TMAssistantDownloadTaskInfo$1
  implements Parcelable.Creator<TMAssistantDownloadTaskInfo>
{
  public final TMAssistantDownloadTaskInfo createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(75675);
    paramParcel = new TMAssistantDownloadTaskInfo(paramParcel.readString(), paramParcel.readString(), paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong(), paramParcel.readString());
    AppMethodBeat.o(75675);
    return paramParcel;
  }

  public final TMAssistantDownloadTaskInfo[] newArray(int paramInt)
  {
    return new TMAssistantDownloadTaskInfo[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo.1
 * JD-Core Version:    0.6.2
 */