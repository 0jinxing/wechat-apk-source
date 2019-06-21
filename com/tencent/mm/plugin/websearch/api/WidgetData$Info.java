package com.tencent.mm.plugin.websearch.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;

public class WidgetData$Info
  implements Parcelable
{
  public static final Parcelable.Creator<Info> CREATOR;
  public String bCu;
  public String csB;
  public String csu;
  public String downloadUrl;
  public int fmr;
  public String fpS;
  public String hlm;
  public String iconUrl;
  public String kcx;
  public String label;
  public String ubA;
  public String ubB;
  public long ubC;
  public String ubD;
  public boolean ubE;
  public String ubw;
  public String ubx;
  public String uby;
  public int ubz;
  public String userName;
  public int version;

  static
  {
    AppMethodBeat.i(124265);
    CREATOR = new WidgetData.Info.1();
    AppMethodBeat.o(124265);
  }

  public WidgetData$Info()
  {
  }

  protected WidgetData$Info(Parcel paramParcel)
  {
    AppMethodBeat.i(124264);
    this.fmr = paramParcel.readInt();
    this.ubw = paramParcel.readString();
    this.bCu = paramParcel.readString();
    this.ubx = paramParcel.readString();
    this.uby = paramParcel.readString();
    this.csu = paramParcel.readString();
    this.csB = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.ubz = paramParcel.readInt();
    this.version = paramParcel.readInt();
    this.ubA = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.downloadUrl = paramParcel.readString();
    this.ubB = paramParcel.readString();
    this.hlm = paramParcel.readString();
    this.label = paramParcel.readString();
    this.ubC = paramParcel.readLong();
    this.fpS = paramParcel.readString();
    this.ubD = paramParcel.readString();
    this.kcx = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.ubE = bool;
      AppMethodBeat.o(124264);
      return;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(124261);
    if (this == paramObject)
      AppMethodBeat.o(124261);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Info))
      {
        AppMethodBeat.o(124261);
        bool = false;
      }
      else
      {
        paramObject = (Info)paramObject;
        if ((this.fmr == paramObject.fmr) && (this.ubz == paramObject.ubz) && (this.version == paramObject.version) && (this.ubC == paramObject.ubC) && (this.ubE == paramObject.ubE) && (Objects.equals(this.ubw, paramObject.ubw)) && (Objects.equals(this.bCu, paramObject.bCu)) && (Objects.equals(this.ubx, paramObject.ubx)) && (Objects.equals(this.uby, paramObject.uby)) && (Objects.equals(this.csu, paramObject.csu)) && (Objects.equals(this.csB, paramObject.csB)) && (Objects.equals(this.userName, paramObject.userName)) && (Objects.equals(this.ubA, paramObject.ubA)) && (Objects.equals(this.iconUrl, paramObject.iconUrl)) && (Objects.equals(this.downloadUrl, paramObject.downloadUrl)) && (Objects.equals(this.ubB, paramObject.ubB)) && (Objects.equals(this.hlm, paramObject.hlm)) && (Objects.equals(this.label, paramObject.label)) && (Objects.equals(this.fpS, paramObject.fpS)) && (Objects.equals(this.ubD, paramObject.ubD)) && (Objects.equals(this.kcx, paramObject.kcx)))
        {
          AppMethodBeat.o(124261);
        }
        else
        {
          AppMethodBeat.o(124261);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(124262);
    int i = Objects.hash(new Object[] { Integer.valueOf(this.fmr), this.ubw, this.bCu, this.ubx, this.uby, this.csu, this.csB, this.userName, Integer.valueOf(this.ubz), Integer.valueOf(this.version), this.ubA, this.iconUrl, this.downloadUrl, this.ubB, this.hlm, this.label, Long.valueOf(this.ubC), this.fpS, this.ubD, this.kcx, Boolean.valueOf(this.ubE) });
    AppMethodBeat.o(124262);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(124260);
    String str = String.format("appid:%s, srcAppid %s, permission %d, pathPath: %s", new Object[] { this.csB, this.fpS, Long.valueOf(this.ubC), this.csu });
    AppMethodBeat.o(124260);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(124263);
    paramParcel.writeInt(this.fmr);
    paramParcel.writeString(this.ubw);
    paramParcel.writeString(this.bCu);
    paramParcel.writeString(this.ubx);
    paramParcel.writeString(this.uby);
    paramParcel.writeString(this.csu);
    paramParcel.writeString(this.csB);
    paramParcel.writeString(this.userName);
    paramParcel.writeInt(this.ubz);
    paramParcel.writeInt(this.version);
    paramParcel.writeString(this.ubA);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.downloadUrl);
    paramParcel.writeString(this.ubB);
    paramParcel.writeString(this.hlm);
    paramParcel.writeString(this.label);
    paramParcel.writeLong(this.ubC);
    paramParcel.writeString(this.fpS);
    paramParcel.writeString(this.ubD);
    paramParcel.writeString(this.kcx);
    if (this.ubE)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(124263);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.WidgetData.Info
 * JD-Core Version:    0.6.2
 */