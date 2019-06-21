package com.tencent.mm.plugin.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback;
import com.tencent.mm.plugin.wepkg.downloader.WePkgDownloader.IWepkgUpdateCallback.RetCode;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class WepkgDownloadProcessTask extends BaseWepkgProcessTask
{
  public static final Parcelable.Creator<WepkgDownloadProcessTask> CREATOR;
  public String cSY;
  public String cvZ;
  public String downloadUrl;
  public int fileType;
  public String gSP;
  public Runnable hww;
  public int uWQ;
  public String uXe;
  public long uXf;
  public WePkgDownloader.IWepkgUpdateCallback.RetCode uXg;
  public String version;

  static
  {
    AppMethodBeat.i(63546);
    CREATOR = new WepkgDownloadProcessTask.2();
    AppMethodBeat.o(63546);
  }

  public WepkgDownloadProcessTask()
  {
  }

  private WepkgDownloadProcessTask(Parcel paramParcel)
  {
    AppMethodBeat.i(63540);
    g(paramParcel);
    AppMethodBeat.o(63540);
  }

  public final void a(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(63544);
    paramParcel.writeInt(this.fileType);
    paramParcel.writeString(this.cSY);
    paramParcel.writeString(this.uXe);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeLong(this.uXf);
    paramParcel.writeString(this.version);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeInt(this.uWQ);
    paramParcel.writeString(this.gSP);
    paramParcel.writeParcelable(this.uXg, paramInt);
    AppMethodBeat.o(63544);
  }

  public final void asP()
  {
    AppMethodBeat.i(63541);
    aBV();
    WePkgDownloader.IWepkgUpdateCallback local1 = new WePkgDownloader.IWepkgUpdateCallback()
    {
      public final void a(String paramAnonymousString1, String paramAnonymousString2, WePkgDownloader.IWepkgUpdateCallback.RetCode paramAnonymousRetCode)
      {
        AppMethodBeat.i(63538);
        ab.i("MicroMsg.Wepkg.WepkgDownloadProcessTask", "onPkgUpdatingCallback errCode:%s", new Object[] { paramAnonymousRetCode });
        WepkgDownloadProcessTask.this.cSY = paramAnonymousString1;
        WepkgDownloadProcessTask.this.gSP = paramAnonymousString2;
        WepkgDownloadProcessTask.this.uXg = paramAnonymousRetCode;
        WepkgDownloadProcessTask.this.aBW();
        WepkgDownloadProcessTask.a(WepkgDownloadProcessTask.this);
        AppMethodBeat.o(63538);
      }
    };
    if (this.fileType == 1)
    {
      WePkgDownloader.dgx().a(this.cSY, local1);
      AppMethodBeat.o(63541);
    }
    while (true)
    {
      return;
      WePkgDownloader.dgx().a(this.fileType, bo.nullAsNil(this.cSY), "", bo.nullAsNil(this.uXe), bo.nullAsNil(this.downloadUrl), this.uXf, bo.nullAsNil(this.version), "", bo.nullAsNil(this.cvZ), this.uWQ, local1);
      AppMethodBeat.o(63541);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(63542);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(63542);
  }

  public final void m(Parcel paramParcel)
  {
    AppMethodBeat.i(63543);
    this.fileType = paramParcel.readInt();
    this.cSY = paramParcel.readString();
    this.uXe = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.uXf = paramParcel.readLong();
    this.version = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    this.uWQ = paramParcel.readInt();
    this.gSP = paramParcel.readString();
    this.uXg = ((WePkgDownloader.IWepkgUpdateCallback.RetCode)paramParcel.readParcelable(WePkgDownloader.IWepkgUpdateCallback.RetCode.class.getClassLoader()));
    AppMethodBeat.o(63543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.WepkgDownloadProcessTask
 * JD-Core Version:    0.6.2
 */