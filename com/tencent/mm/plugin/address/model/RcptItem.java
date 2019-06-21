package com.tencent.mm.plugin.address.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RcptItem
  implements Parcelable
{
  public static final Parcelable.Creator<RcptItem> CREATOR;
  public String code;
  public String gIO;
  public boolean gIP;
  public String name;

  static
  {
    AppMethodBeat.i(16759);
    CREATOR = new RcptItem.1();
    AppMethodBeat.o(16759);
  }

  public RcptItem()
  {
    this.name = "";
    this.code = "";
    this.gIO = "";
    this.gIP = false;
  }

  public RcptItem(Parcel paramParcel)
  {
    AppMethodBeat.i(16757);
    this.name = "";
    this.code = "";
    this.gIO = "";
    this.gIP = false;
    this.name = paramParcel.readString();
    this.code = paramParcel.readString();
    this.gIO = paramParcel.readString();
    AppMethodBeat.o(16757);
  }

  public RcptItem(String paramString1, String paramString2, String paramString3)
  {
    this.name = "";
    this.code = "";
    this.gIO = "";
    this.gIP = false;
    this.name = paramString1;
    this.code = paramString2;
    this.gIO = paramString3;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(16758);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.code);
    paramParcel.writeString(this.gIO);
    AppMethodBeat.o(16758);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.RcptItem
 * JD-Core Version:    0.6.2
 */