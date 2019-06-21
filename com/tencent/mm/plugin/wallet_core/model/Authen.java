package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bo;

public class Authen
  implements Parcelable
{
  public static final Parcelable.Creator<Authen> CREATOR;
  public int bJt;
  public String country;
  public String dtV;
  public String duc;
  public String dud;
  public String fBg;
  public String gIO;
  public String nuN;
  public PayInfo pGr;
  public String pbn;
  public String pbo;
  public String tlk;
  public String token;
  public String tuk;
  public int twb;
  public String twc;
  public String twd;
  public String twe;
  public int twf;
  public String twg;
  public String twh;
  public String twi;
  public String twj;
  public String twk;
  public String twl;
  public String twm;
  public String twn;
  public String two;
  public String twp;
  public String twq;
  public String twr;
  public String tws;
  public String twt;
  public int twu;
  public String twv;
  public String tww;

  static
  {
    AppMethodBeat.i(46699);
    CREATOR = new Authen.1();
    AppMethodBeat.o(46699);
  }

  public Authen()
  {
    AppMethodBeat.i(46697);
    this.twb = 0;
    this.pGr = new PayInfo();
    AppMethodBeat.o(46697);
  }

  public Authen(Parcel paramParcel)
  {
    AppMethodBeat.i(46698);
    this.twb = 0;
    this.pGr = new PayInfo();
    this.bJt = paramParcel.readInt();
    this.twc = paramParcel.readString();
    this.pbn = paramParcel.readString();
    this.pbo = paramParcel.readString();
    this.twd = paramParcel.readString();
    this.twe = paramParcel.readString();
    this.twf = paramParcel.readInt();
    this.tuk = paramParcel.readString();
    this.twg = paramParcel.readString();
    this.twh = paramParcel.readString();
    this.twi = paramParcel.readString();
    this.token = paramParcel.readString();
    this.twl = paramParcel.readString();
    this.twm = paramParcel.readString();
    this.country = paramParcel.readString();
    this.duc = paramParcel.readString();
    this.dud = paramParcel.readString();
    this.fBg = paramParcel.readString();
    this.nuN = paramParcel.readString();
    this.gIO = paramParcel.readString();
    this.dtV = paramParcel.readString();
    this.tlk = paramParcel.readString();
    this.twn = paramParcel.readString();
    this.two = paramParcel.readString();
    this.twk = paramParcel.readString();
    this.twp = paramParcel.readString();
    this.twq = paramParcel.readString();
    this.twr = paramParcel.readString();
    this.tws = paramParcel.readString();
    this.twt = paramParcel.readString();
    this.twu = paramParcel.readInt();
    this.twv = paramParcel.readString();
    this.tww = paramParcel.readString();
    AppMethodBeat.o(46698);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46696);
    paramParcel.writeInt(this.bJt);
    paramParcel.writeString(bo.bc(this.twc, ""));
    paramParcel.writeString(bo.bc(this.pbn, ""));
    paramParcel.writeString(bo.bc(this.pbo, ""));
    paramParcel.writeString(bo.bc(this.twd, ""));
    paramParcel.writeString(bo.bc(this.twe, ""));
    paramParcel.writeInt(this.twf);
    paramParcel.writeString(bo.bc(this.tuk, ""));
    paramParcel.writeString(bo.bc(this.twg, ""));
    paramParcel.writeString(bo.bc(this.twh, ""));
    paramParcel.writeString(bo.bc(this.twi, ""));
    paramParcel.writeString(bo.bc(this.token, ""));
    paramParcel.writeString(bo.bc(this.twl, ""));
    paramParcel.writeString(bo.bc(this.twm, ""));
    paramParcel.writeString(bo.bc(this.country, ""));
    paramParcel.writeString(bo.bc(this.duc, ""));
    paramParcel.writeString(bo.bc(this.dud, ""));
    paramParcel.writeString(bo.bc(this.fBg, ""));
    paramParcel.writeString(bo.bc(this.nuN, ""));
    paramParcel.writeString(bo.bc(this.gIO, ""));
    paramParcel.writeString(bo.bc(this.dtV, ""));
    paramParcel.writeString(bo.bc(this.tlk, ""));
    paramParcel.writeString(bo.bc(this.twn, ""));
    paramParcel.writeString(bo.bc(this.two, ""));
    paramParcel.writeString(bo.bc(this.twk, ""));
    paramParcel.writeString(bo.bc(this.twp, ""));
    paramParcel.writeString(bo.bc(this.twq, ""));
    paramParcel.writeString(bo.bc(this.twr, ""));
    paramParcel.writeString(bo.bc(this.tws, ""));
    paramParcel.writeString(bo.bc(this.twt, ""));
    paramParcel.writeInt(bo.a(Integer.valueOf(this.twu), 0));
    paramParcel.writeString(bo.bc(this.twv, ""));
    paramParcel.writeString(bo.bc(this.tww, ""));
    AppMethodBeat.o(46696);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Authen
 * JD-Core Version:    0.6.2
 */