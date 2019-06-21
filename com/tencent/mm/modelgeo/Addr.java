package com.tencent.mm.modelgeo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public class Addr
  implements Parcelable
{
  public static final Parcelable.Creator<Addr> CREATOR;
  public String country;
  public String fBg;
  public String fBh;
  public String fBi;
  public String fBj;
  public String fBk;
  public String fBl;
  public String fBm;
  public String fBn;
  public String fBo;
  public String fBp;
  public String fBq;
  public float fBr;
  public float fBs;
  public Object tag = "";

  static
  {
    AppMethodBeat.i(78102);
    CREATOR = new Addr.1();
    AppMethodBeat.o(78102);
  }

  public final String agv()
  {
    AppMethodBeat.i(78100);
    String str = bo.bc(this.fBj, "") + bo.bc(this.fBk, "") + bo.bc(this.fBl, "") + bo.bc(this.fBm, "") + bo.bc(this.fBn, "");
    AppMethodBeat.o(78100);
    return str;
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(78099);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("address='" + this.fBg + '\'');
    ((StringBuilder)localObject).append(", country='" + this.country + '\'');
    ((StringBuilder)localObject).append(", administrative_area_level_1='" + this.fBh + '\'');
    ((StringBuilder)localObject).append(", locality='" + this.fBi + '\'');
    ((StringBuilder)localObject).append(", locality_shi='" + this.fBj + '\'');
    ((StringBuilder)localObject).append(", sublocality='" + this.fBk + '\'');
    ((StringBuilder)localObject).append(", neighborhood='" + this.fBl + '\'');
    ((StringBuilder)localObject).append(", route='" + this.fBm + '\'');
    ((StringBuilder)localObject).append(", streetNum='" + this.fBn + '\'');
    ((StringBuilder)localObject).append(", roughAddr='" + this.fBo + '\'');
    ((StringBuilder)localObject).append(", poi_name='" + this.fBp + '\'');
    ((StringBuilder)localObject).append(", lat=" + this.fBr);
    ((StringBuilder)localObject).append(", lng=" + this.fBs);
    ((StringBuilder)localObject).append(", tag=" + this.tag);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(78099);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(78101);
    paramParcel.writeString(bo.bc(this.fBg, ""));
    paramParcel.writeString(bo.bc(this.country, ""));
    paramParcel.writeString(bo.bc(this.fBh, ""));
    paramParcel.writeString(bo.bc(this.fBi, ""));
    paramParcel.writeString(bo.bc(this.fBj, ""));
    paramParcel.writeString(bo.bc(this.fBk, ""));
    paramParcel.writeString(bo.bc(this.fBl, ""));
    paramParcel.writeString(bo.bc(this.fBm, ""));
    paramParcel.writeString(bo.bc(this.fBn, ""));
    paramParcel.writeString(bo.bc(this.fBo, ""));
    paramParcel.writeString(bo.bc(this.fBp, ""));
    paramParcel.writeFloat(this.fBr);
    paramParcel.writeFloat(this.fBs);
    AppMethodBeat.o(78101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.Addr
 * JD-Core Version:    0.6.2
 */