package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShareInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ShareInfo> CREATOR;
  public String bQh;
  public String bQi;

  static
  {
    AppMethodBeat.i(131482);
    CREATOR = new ShareInfo.1();
    AppMethodBeat.o(131482);
  }

  private ShareInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(131481);
    this.bQi = paramParcel.readString();
    this.bQh = paramParcel.readString();
    AppMethodBeat.o(131481);
  }

  public ShareInfo(String paramString1, String paramString2)
  {
    this.bQi = paramString1;
    this.bQh = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131480);
    paramParcel.writeString(this.bQi);
    paramParcel.writeString(this.bQh);
    AppMethodBeat.o(131480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo
 * JD-Core Version:    0.6.2
 */