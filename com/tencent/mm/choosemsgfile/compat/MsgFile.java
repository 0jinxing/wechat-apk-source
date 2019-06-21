package com.tencent.mm.choosemsgfile.compat;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MsgFile
  implements Parcelable
{
  public static final Parcelable.Creator<MsgFile> CREATOR;
  public String eov;
  public String fileName;
  public String filePath;
  public int fileSize;
  public long timeStamp;
  public String type;

  static
  {
    AppMethodBeat.i(125787);
    CREATOR = new MsgFile.1();
    AppMethodBeat.o(125787);
  }

  public MsgFile()
  {
  }

  protected MsgFile(Parcel paramParcel)
  {
    AppMethodBeat.i(125786);
    this.fileSize = paramParcel.readInt();
    this.filePath = paramParcel.readString();
    this.fileName = paramParcel.readString();
    this.timeStamp = paramParcel.readLong();
    this.type = paramParcel.readString();
    this.eov = paramParcel.readString();
    AppMethodBeat.o(125786);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(125784);
    String str = "MsgFile{fileSize=" + this.fileSize + ", filePath='" + this.filePath + '\'' + ", fileName='" + this.fileName + '\'' + ", timeStamp=" + this.timeStamp + ", type='" + this.type + '\'' + ", fileExt='" + this.eov + '\'' + '}';
    AppMethodBeat.o(125784);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(125785);
    paramParcel.writeInt(this.fileSize);
    paramParcel.writeString(this.filePath);
    paramParcel.writeString(this.fileName);
    paramParcel.writeLong(this.timeStamp);
    paramParcel.writeString(this.type);
    paramParcel.writeString(this.eov);
    AppMethodBeat.o(125785);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.choosemsgfile.compat.MsgFile
 * JD-Core Version:    0.6.2
 */