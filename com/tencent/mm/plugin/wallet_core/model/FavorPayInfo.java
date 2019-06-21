package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavorPayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<FavorPayInfo> CREATOR;
  public String tzb;
  public int tzc;
  public String tzd;
  public String tze;
  public String tzf;
  public List<String> tzg;

  static
  {
    AppMethodBeat.i(46763);
    CREATOR = new FavorPayInfo.1();
    AppMethodBeat.o(46763);
  }

  public FavorPayInfo()
  {
    AppMethodBeat.i(46759);
    this.tzg = new LinkedList();
    AppMethodBeat.o(46759);
  }

  public FavorPayInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(46760);
    this.tzg = new LinkedList();
    this.tzb = paramParcel.readString();
    this.tzc = paramParcel.readInt();
    this.tzd = paramParcel.readString();
    this.tze = paramParcel.readString();
    this.tzf = paramParcel.readString();
    this.tzg = paramParcel.createStringArrayList();
    AppMethodBeat.o(46760);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(46762);
    StringBuffer localStringBuffer = new StringBuffer(String.format("FavorPayInfo %s isNeedBankPay %s needBankType %s defaultFavorCompId %s changeBankcardTips %s", new Object[] { this.tzb, Integer.valueOf(this.tzc), this.tzd, this.tze, this.tzf }));
    if (this.tzg != null)
    {
      localStringBuffer.append("bind_serial_list :");
      localObject = this.tzg.iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        localStringBuffer.append(str + ",");
      }
    }
    Object localObject = localStringBuffer.toString();
    AppMethodBeat.o(46762);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46761);
    paramParcel.writeString(this.tzb);
    paramParcel.writeInt(this.tzc);
    paramParcel.writeString(this.tzd);
    paramParcel.writeString(this.tze);
    paramParcel.writeString(this.tzf);
    paramParcel.writeStringList(this.tzg);
    AppMethodBeat.o(46761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.FavorPayInfo
 * JD-Core Version:    0.6.2
 */