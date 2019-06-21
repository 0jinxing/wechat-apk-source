package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class Orders$ShowInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ShowInfo> CREATOR;
  public String mVA;
  public String name;
  public String tBF;
  public int tBG;
  public String tBH;
  public String tBI;
  public String tBJ;
  public int tBK;
  public String value;

  static
  {
    AppMethodBeat.i(46828);
    CREATOR = new Orders.ShowInfo.1();
    AppMethodBeat.o(46828);
  }

  public Orders$ShowInfo()
  {
  }

  protected Orders$ShowInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46825);
    this.name = paramParcel.readString();
    this.value = paramParcel.readString();
    this.mVA = paramParcel.readString();
    this.tBF = paramParcel.readString();
    this.tBG = paramParcel.readInt();
    this.tBH = paramParcel.readString();
    this.tBI = paramParcel.readString();
    this.tBJ = paramParcel.readString();
    this.tBK = paramParcel.readInt();
    AppMethodBeat.o(46825);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(46826);
    String str = String.format("ShowInfo name:%s, value:%s, nameColor:%s, valueColor:%s, linkType:%s, linkWeApp:%s, linkAddr:%s, linkUrl:%s, textAttr:%s", new Object[] { this.name, this.value, this.mVA, this.tBF, Integer.valueOf(this.tBG), this.tBH, this.tBI, this.tBJ, Integer.valueOf(this.tBK) });
    AppMethodBeat.o(46826);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46827);
    paramParcel.writeString(this.name);
    paramParcel.writeString(this.value);
    paramParcel.writeString(this.mVA);
    paramParcel.writeString(this.tBF);
    paramParcel.writeInt(this.tBG);
    paramParcel.writeString(this.tBH);
    paramParcel.writeString(this.tBI);
    paramParcel.writeString(this.tBJ);
    paramParcel.writeInt(this.tBK);
    AppMethodBeat.o(46827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo
 * JD-Core Version:    0.6.2
 */