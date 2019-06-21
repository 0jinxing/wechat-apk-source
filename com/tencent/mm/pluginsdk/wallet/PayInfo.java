package com.tencent.mm.pluginsdk.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PayInfo
  implements Parcelable
{
  public static final Parcelable.Creator<PayInfo> CREATOR;
  public String aIm;
  public boolean aPn;
  public String appId;
  public int cBS;
  public String cBU;
  public String cBV;
  public String cHI;
  public int cIb;
  public int cIf;
  public int cIg;
  public String cQF;
  public String cwg;
  public String czZ;
  public String eCq;
  public String hHV;
  public String kck;
  public boolean mXg;
  public int pPV;
  public String pPw;
  public String partnerId;
  public int tKd;
  public int tKe;
  public String tRb;
  public int vwe;
  public boolean vwf;
  public String vwg;
  public Bundle vwh;
  public int vwi;
  public long vwj;
  public int vwk;
  public String vwl;
  public String vwm;
  public int vwn;
  public double vwo;
  public String vwp;

  static
  {
    AppMethodBeat.i(70468);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(70468);
  }

  public PayInfo()
  {
    this.cIg = -1;
    this.cIf = 0;
    this.vwe = 0;
    this.mXg = false;
    this.vwf = true;
    this.tKd = 0;
    this.tKe = 0;
    this.vwj = 0L;
    this.cHI = "";
    this.vwk = -1;
    this.vwn = 1;
    this.pPV = 0;
    this.vwo = 0.0D;
    this.vwp = "";
  }

  public PayInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(70465);
    this.cIg = -1;
    this.cIf = 0;
    this.vwe = 0;
    this.mXg = false;
    this.vwf = true;
    this.tKd = 0;
    this.tKe = 0;
    this.vwj = 0L;
    this.cHI = "";
    this.vwk = -1;
    this.vwn = 1;
    this.pPV = 0;
    this.vwo = 0.0D;
    this.vwp = "";
    this.cIf = paramParcel.readInt();
    this.vwe = paramParcel.readInt();
    this.czZ = paramParcel.readString();
    this.eCq = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.tRb = paramParcel.readString();
    this.partnerId = paramParcel.readString();
    this.cQF = paramParcel.readString();
    this.cwg = paramParcel.readString();
    this.aIm = paramParcel.readString();
    this.cIb = paramParcel.readInt();
    this.cIg = paramParcel.readInt();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.mXg = bool2;
      if (paramParcel.readInt() != 1)
        break label376;
      bool2 = true;
      label204: this.vwf = bool2;
      this.vwh = paramParcel.readBundle();
      this.tKd = paramParcel.readInt();
      this.cBU = paramParcel.readString();
      this.cBV = paramParcel.readString();
      this.cBS = paramParcel.readInt();
      this.vwj = paramParcel.readLong();
      this.cHI = paramParcel.readString();
      this.vwl = paramParcel.readString();
      this.vwm = paramParcel.readString();
      this.vwn = paramParcel.readInt();
      this.kck = paramParcel.readString();
      this.hHV = paramParcel.readString();
      this.pPV = paramParcel.readInt();
      this.vwo = paramParcel.readDouble();
      this.vwp = paramParcel.readString();
      if (this.vwp == null)
        this.vwp = "";
      if (paramParcel.readInt() != 1)
        break label381;
    }
    label376: label381: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.aPn = bool2;
      this.pPw = paramParcel.readString();
      AppMethodBeat.o(70465);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label204;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(70467);
    String str = String.format("sense : %d, reqKey : %s, uuid : %s, appId : %s, appSource : %s, partnerId : %s, paySign : %s, productId : %s, soterAuth: %s", new Object[] { Integer.valueOf(this.cIf), this.czZ, this.eCq, this.appId, this.tRb, this.partnerId, this.cQF, this.cwg, this.cHI });
    AppMethodBeat.o(70467);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(70466);
    paramParcel.writeInt(this.cIf);
    paramParcel.writeInt(this.vwe);
    paramParcel.writeString(this.czZ);
    paramParcel.writeString(this.eCq);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.tRb);
    paramParcel.writeString(this.partnerId);
    paramParcel.writeString(this.cQF);
    paramParcel.writeString(this.cwg);
    paramParcel.writeString(this.aIm);
    paramParcel.writeInt(this.cIb);
    paramParcel.writeInt(this.cIg);
    if (this.mXg)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.vwf)
        break label284;
      paramInt = 1;
      label126: paramParcel.writeInt(paramInt);
      paramParcel.writeBundle(this.vwh);
      paramParcel.writeInt(this.tKd);
      paramParcel.writeString(this.cBU);
      paramParcel.writeString(this.cBV);
      paramParcel.writeInt(this.cBS);
      paramParcel.writeLong(this.vwj);
      paramParcel.writeString(this.cHI);
      paramParcel.writeString(this.vwl);
      paramParcel.writeString(this.vwm);
      paramParcel.writeInt(this.vwn);
      paramParcel.writeString(this.kck);
      paramParcel.writeString(this.hHV);
      paramParcel.writeInt(this.pPV);
      paramParcel.writeDouble(this.vwo);
      paramParcel.writeString(this.vwp);
      if (!this.aPn)
        break label289;
    }
    label284: label289: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.pPw);
      AppMethodBeat.o(70466);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label126;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.PayInfo
 * JD-Core Version:    0.6.2
 */