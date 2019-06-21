package com.tencent.mm.plugin.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FileDownloadTaskInfo
  implements Parcelable
{
  public static Parcelable.Creator<FileDownloadTaskInfo> CREATOR;
  public String appId;
  public int cBA;
  public String cvZ;
  public long id;
  public long jrb;
  public long kNr;
  public boolean kNs;
  public boolean kNt;
  public boolean kNu;
  public String path;
  public int status;
  public String url;

  static
  {
    AppMethodBeat.i(2449);
    CREATOR = new FileDownloadTaskInfo.1();
    AppMethodBeat.o(2449);
  }

  public FileDownloadTaskInfo()
  {
    this.id = -1L;
    this.url = "";
    this.status = 0;
    this.path = "";
    this.cvZ = "";
    this.appId = "";
    this.kNr = 0L;
    this.jrb = 0L;
    this.kNs = false;
    this.cBA = 2;
    this.kNt = false;
    this.kNu = false;
  }

  private FileDownloadTaskInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(2448);
    this.id = -1L;
    this.url = "";
    this.status = 0;
    this.path = "";
    this.cvZ = "";
    this.appId = "";
    this.kNr = 0L;
    this.jrb = 0L;
    this.kNs = false;
    this.cBA = 2;
    this.kNt = false;
    this.kNu = false;
    this.id = paramParcel.readLong();
    this.url = paramParcel.readString();
    this.status = paramParcel.readInt();
    this.path = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.kNr = paramParcel.readLong();
    this.jrb = paramParcel.readLong();
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.kNs = bool2;
      this.cBA = paramParcel.readInt();
      if (paramParcel.readByte() != 1)
        break label207;
      bool2 = true;
      label175: this.kNt = bool2;
      if (paramParcel.readByte() != 1)
        break label212;
    }
    label207: label212: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.kNu = bool2;
      AppMethodBeat.o(2448);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label175;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(2447);
    paramParcel.writeLong(this.id);
    paramParcel.writeString(this.url);
    paramParcel.writeInt(this.status);
    paramParcel.writeString(this.path);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeString(this.appId);
    paramParcel.writeLong(this.kNr);
    paramParcel.writeLong(this.jrb);
    if (this.kNs)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.cBA);
      if (!this.kNt)
        break label137;
      paramInt = 1;
      label104: paramParcel.writeByte((byte)paramInt);
      if (!this.kNu)
        break label142;
    }
    label137: label142: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(2447);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label104;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo
 * JD-Core Version:    0.6.2
 */