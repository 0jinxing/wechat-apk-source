package com.tencent.mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DownloadBigPkgCompleteNotify
  implements Parcelable
{
  public static final Parcelable.Creator<DownloadBigPkgCompleteNotify> CREATOR;
  public String eBS;
  public boolean success;

  static
  {
    AppMethodBeat.i(63459);
    CREATOR = new DownloadBigPkgCompleteNotify.1();
    AppMethodBeat.o(63459);
  }

  private DownloadBigPkgCompleteNotify(Parcel paramParcel)
  {
    AppMethodBeat.i(63458);
    this.eBS = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.success = bool;
      AppMethodBeat.o(63458);
      return;
      bool = false;
    }
  }

  public DownloadBigPkgCompleteNotify(String paramString, boolean paramBoolean)
  {
    this.eBS = paramString;
    this.success = paramBoolean;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63457);
    paramParcel.writeString(this.eBS);
    if (this.success);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(63457);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify
 * JD-Core Version:    0.6.2
 */