package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MallNews
  implements Parcelable
{
  public static final Parcelable.Creator<MallNews> CREATOR;
  public String cxb;
  public String fsT;
  public int showType;
  public String ssr;
  public int tBn;
  public int tDA;
  public String tDB;
  public String tDC;
  public String tDt;
  public String tDu;
  public String tDv;
  public String tDw;
  public String tDx;
  public int tDy;
  public String tDz;
  public String type;

  static
  {
    AppMethodBeat.i(47020);
    CREATOR = new MallNews.1();
    AppMethodBeat.o(47020);
  }

  public MallNews(Parcel paramParcel)
  {
    AppMethodBeat.i(47017);
    this.tDt = "0";
    this.tDu = "0";
    this.fsT = paramParcel.readString();
    this.ssr = paramParcel.readString();
    this.cxb = paramParcel.readString();
    this.tDv = paramParcel.readString();
    this.tDw = paramParcel.readString();
    this.tDx = paramParcel.readString();
    this.tDy = paramParcel.readInt();
    this.tDz = paramParcel.readString();
    this.tDt = paramParcel.readString();
    this.tDu = paramParcel.readString();
    this.showType = paramParcel.readInt();
    this.tDB = paramParcel.readString();
    this.tBn = paramParcel.readInt();
    this.tDC = paramParcel.readString();
    AppMethodBeat.o(47017);
  }

  public MallNews(String paramString)
  {
    this.tDt = "0";
    this.tDu = "0";
    this.fsT = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(47016);
    if ((paramObject instanceof MallNews))
    {
      paramObject = (MallNews)paramObject;
      if ((this.fsT == null) || (!this.fsT.equals(paramObject.fsT)))
        AppMethodBeat.o(47016);
    }
    while (true)
    {
      return bool;
      if ((this.ssr == null) || (!this.ssr.equals(paramObject.ssr)))
      {
        AppMethodBeat.o(47016);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(47016);
        continue;
        AppMethodBeat.o(47016);
      }
    }
  }

  public String toString()
  {
    AppMethodBeat.i(47019);
    String str = String.format("functionId : %s, activityId : %s, ticket : %s, activityMsg : %s, activityLink : %s, activityIconLink : %s, showFlag : %s, orgStr : %s, activityTips: %s, activityType: %d, activityUrl: %s", new Object[] { this.fsT, this.ssr, this.cxb, this.tDv, this.tDw, this.tDx, this.tDt, this.tDB, this.tDz, Integer.valueOf(this.tBn), this.tDC });
    AppMethodBeat.o(47019);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(47018);
    paramParcel.writeString(this.fsT);
    paramParcel.writeString(this.ssr);
    paramParcel.writeString(this.cxb);
    paramParcel.writeString(this.tDv);
    paramParcel.writeString(this.tDw);
    paramParcel.writeString(this.tDx);
    paramParcel.writeInt(this.tDy);
    paramParcel.writeString(this.tDz);
    paramParcel.writeString(this.tDt);
    paramParcel.writeString(this.tDu);
    paramParcel.writeInt(this.showType);
    paramParcel.writeString(this.tDB);
    paramParcel.writeInt(this.tBn);
    paramParcel.writeString(this.tDC);
    AppMethodBeat.o(47018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.mall.MallNews
 * JD-Core Version:    0.6.2
 */