package com.tencent.mm.plugin.wallet_core.model.mall;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class MallFunction
  implements Parcelable
{
  public static final Parcelable.Creator<MallFunction> CREATOR;
  public String cOI;
  public String cRS;
  public String nmz;
  public String olO;
  public String olP;
  public String pFP;
  public String tDl;
  public ArrayList<String> tDm;
  public MallNews tDn;
  public String tDo;
  public int tDp;
  public int type;

  static
  {
    AppMethodBeat.i(47006);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(47006);
  }

  public MallFunction()
  {
    this.tDp = 0;
  }

  public MallFunction(Parcel paramParcel)
  {
    AppMethodBeat.i(47004);
    this.tDp = 0;
    this.pFP = paramParcel.readString();
    this.cOI = paramParcel.readString();
    this.tDl = paramParcel.readString();
    this.olO = paramParcel.readString();
    this.olP = paramParcel.readString();
    this.cRS = paramParcel.readString();
    this.nmz = paramParcel.readString();
    this.tDm = new ArrayList();
    paramParcel.readStringList(this.tDm);
    this.tDn = ((MallNews)paramParcel.readParcelable(MallNews.class.getClassLoader()));
    this.type = paramParcel.readInt();
    this.tDo = paramParcel.readString();
    this.tDp = paramParcel.readInt();
    AppMethodBeat.o(47004);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(47005);
    paramParcel.writeString(this.pFP);
    paramParcel.writeString(this.cOI);
    paramParcel.writeString(this.tDl);
    paramParcel.writeString(this.olO);
    paramParcel.writeString(this.olP);
    paramParcel.writeString(this.cRS);
    paramParcel.writeString(this.nmz);
    paramParcel.writeStringList(this.tDm);
    paramParcel.writeParcelable(this.tDn, paramInt);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.tDo);
    paramParcel.writeInt(this.tDp);
    AppMethodBeat.o(47005);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.mall.MallFunction
 * JD-Core Version:    0.6.2
 */