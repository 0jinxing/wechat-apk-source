package com.tencent.mm.plugin.cdndownloader.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CDNTaskInfo
  implements Parcelable
{
  public static final Parcelable.Creator<CDNTaskInfo> CREATOR;
  public String cHr;
  public String downloadUrl;
  public boolean egs;
  public String filePath;
  public String ktq;
  public String ktr;
  public int kts;
  public int ktt;
  public boolean ktu;
  public boolean ktv;
  public boolean ktw;

  static
  {
    AppMethodBeat.i(928);
    CREATOR = new CDNTaskInfo.1();
    AppMethodBeat.o(928);
  }

  public CDNTaskInfo()
  {
  }

  private CDNTaskInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(925);
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.egs = bool2;
      this.downloadUrl = paramParcel.readString();
      this.cHr = paramParcel.readString();
      this.filePath = paramParcel.readString();
      this.ktq = paramParcel.readString();
      this.ktr = paramParcel.readString();
      this.kts = paramParcel.readInt();
      this.ktt = paramParcel.readInt();
      if (paramParcel.readByte() != 1)
        break label125;
      bool2 = true;
      label93: this.ktu = bool2;
      if (paramParcel.readByte() != 1)
        break label130;
    }
    label130: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.ktw = bool2;
      AppMethodBeat.o(925);
      return;
      bool2 = false;
      break;
      label125: bool2 = false;
      break label93;
    }
  }

  public CDNTaskInfo(String paramString)
  {
    this.downloadUrl = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(926);
    boolean bool;
    if ((paramObject == this) || ((paramObject != null) && ((paramObject instanceof CDNTaskInfo)) && (((CDNTaskInfo)paramObject).downloadUrl.equals(this.downloadUrl))))
    {
      bool = true;
      AppMethodBeat.o(926);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(926);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(927);
    int i = this.downloadUrl.hashCode();
    AppMethodBeat.o(927);
    return i;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(924);
    int i;
    if (this.egs)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      paramParcel.writeString(this.downloadUrl);
      paramParcel.writeString(this.cHr);
      paramParcel.writeString(this.filePath);
      paramParcel.writeString(this.ktq);
      paramParcel.writeString(this.ktr);
      paramParcel.writeInt(this.kts);
      paramParcel.writeInt(this.ktt);
      if (!this.ktu)
        break label131;
      i = 1;
      b = i;
      label94: paramParcel.writeByte(b);
      if (!this.ktw)
        break label139;
    }
    label131: label139: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(924);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label94;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo
 * JD-Core Version:    0.6.2
 */