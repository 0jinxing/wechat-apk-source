package com.tencent.mm.plugin.webview.preload;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TmplParams
  implements Parcelable
{
  public static final Parcelable.Creator<TmplParams> CREATOR;
  public String cvZ;
  public int jSV;
  public String jSY;
  public String jVi;
  public long qOg;
  public String upO;
  public String upP;
  public int upQ;
  public int version;

  static
  {
    AppMethodBeat.i(80450);
    CREATOR = new TmplParams.1();
    AppMethodBeat.o(80450);
  }

  public TmplParams()
  {
    this.jSV = -1;
  }

  public TmplParams(Parcel paramParcel)
  {
    AppMethodBeat.i(80447);
    this.jSV = -1;
    this.jSV = paramParcel.readInt();
    this.version = paramParcel.readInt();
    this.jVi = paramParcel.readString();
    this.upO = paramParcel.readString();
    this.cvZ = paramParcel.readString();
    this.upQ = paramParcel.readInt();
    this.qOg = paramParcel.readLong();
    this.jSY = paramParcel.readString();
    this.upP = paramParcel.readString();
    AppMethodBeat.o(80447);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(80449);
    String str = "TmplParams{version=" + this.version + ", initUrl='" + this.jVi + '\'' + ", initFilePath='" + this.upO + '\'' + ", reportId=" + this.upQ + '}';
    AppMethodBeat.o(80449);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(80448);
    paramParcel.writeInt(this.jSV);
    paramParcel.writeInt(this.version);
    paramParcel.writeString(this.jVi);
    paramParcel.writeString(this.upO);
    paramParcel.writeString(this.cvZ);
    paramParcel.writeInt(this.upQ);
    paramParcel.writeLong(this.qOg);
    paramParcel.writeString(this.jSY);
    paramParcel.writeString(this.upP);
    AppMethodBeat.o(80448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.TmplParams
 * JD-Core Version:    0.6.2
 */