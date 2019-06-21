package com.tencent.mm.pluginsdk.model.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ReportUtil$ReportArgs
  implements Parcelable
{
  public static final Parcelable.Creator<ReportArgs> CREATOR;
  public int Cn;
  public String Iw;
  public int errCode;
  public String openId;
  public String transaction;

  static
  {
    AppMethodBeat.i(27387);
    CREATOR = new ReportUtil.ReportArgs.1();
    AppMethodBeat.o(27387);
  }

  public ReportUtil$ReportArgs()
  {
  }

  private ReportUtil$ReportArgs(Parcel paramParcel)
  {
    AppMethodBeat.i(27386);
    this.Iw = paramParcel.readString();
    this.errCode = paramParcel.readInt();
    this.transaction = paramParcel.readString();
    this.openId = paramParcel.readString();
    AppMethodBeat.o(27386);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(27385);
    paramParcel.writeString(this.Iw);
    paramParcel.writeInt(this.errCode);
    paramParcel.writeString(this.transaction);
    paramParcel.writeString(this.openId);
    AppMethodBeat.o(27385);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ReportUtil.ReportArgs
 * JD-Core Version:    0.6.2
 */