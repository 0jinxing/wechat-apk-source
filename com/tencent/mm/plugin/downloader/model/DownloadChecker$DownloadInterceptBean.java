package com.tencent.mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.a.a.d;
import com.tencent.mm.plugin.downloader.c.b.b;
import com.tencent.mm.plugin.downloader.c.b.f;
import com.tencent.mm.plugin.downloader.c.b.j;
import com.tencent.mm.sdk.platformtools.ab;

class DownloadChecker$DownloadInterceptBean
  implements Parcelable
{
  public static final Parcelable.Creator<DownloadInterceptBean> CREATOR;
  public String appId;
  public String appName;
  public int cBA;
  public boolean csN;
  public String cvZ;
  public String downloadUrl;
  public String iconUrl;
  public int kMp;
  public String kMq;
  public String kMr;
  public boolean kMs;
  public String packageName;
  public long size;

  static
  {
    AppMethodBeat.i(2349);
    CREATOR = new DownloadChecker.DownloadInterceptBean.1();
    AppMethodBeat.o(2349);
  }

  public DownloadChecker$DownloadInterceptBean()
  {
  }

  private DownloadChecker$DownloadInterceptBean(Parcel paramParcel)
  {
    AppMethodBeat.i(2346);
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.csN = bool2;
      this.kMp = paramParcel.readInt();
      this.kMq = paramParcel.readString();
      this.appId = paramParcel.readString();
      this.appName = paramParcel.readString();
      this.iconUrl = paramParcel.readString();
      this.downloadUrl = paramParcel.readString();
      this.kMr = paramParcel.readString();
      this.size = paramParcel.readLong();
      this.packageName = paramParcel.readString();
      this.cvZ = paramParcel.readString();
      this.cBA = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label141;
    }
    label141: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.kMs = bool2;
      AppMethodBeat.o(2346);
      return;
      bool2 = false;
      break;
    }
  }

  static boolean a(d paramd)
  {
    AppMethodBeat.i(2348);
    boolean bool;
    if ((paramd == null) || (paramd.kKr == null) || (paramd.kKr.kLy == null) || (paramd.kKr.kLy.kLn == null) || (!URLUtil.isNetworkUrl(paramd.kKr.kLy.kLn.egm)))
    {
      ab.i("MicroMsg.DownloadChecker", "downloadInfo is invalid");
      bool = false;
      AppMethodBeat.o(2348);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(2348);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(2347);
    if (this.csN)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.kMp);
      paramParcel.writeString(this.kMq);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.appName);
      paramParcel.writeString(this.iconUrl);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeString(this.kMr);
      paramParcel.writeLong(this.size);
      paramParcel.writeString(this.packageName);
      paramParcel.writeString(this.cvZ);
      paramParcel.writeInt(this.cBA);
      if (!this.kMs)
        break label137;
    }
    label137: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(2347);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.DownloadChecker.DownloadInterceptBean
 * JD-Core Version:    0.6.2
 */