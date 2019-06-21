package com.tencent.mm.plugin.recharge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MallRechargeProduct
  implements Parcelable
{
  public static final Parcelable.Creator<MallRechargeProduct> CREATOR;
  public String appId;
  public String cwg;
  public int fmR;
  public boolean isDefault;
  public String lcC;
  public String pFP;
  public String pFQ;
  public float pFR;
  public float pFS;
  public boolean pFT;
  public int pFU;
  public int pFV;
  public final boolean pFW;
  public boolean pFX;

  static
  {
    AppMethodBeat.i(44192);
    CREATOR = new MallRechargeProduct.1();
    AppMethodBeat.o(44192);
  }

  public MallRechargeProduct(Parcel paramParcel)
  {
    AppMethodBeat.i(44190);
    this.pFR = 0.0F;
    this.pFS = 0.0F;
    this.pFX = true;
    this.pFP = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.cwg = paramParcel.readString();
    this.lcC = paramParcel.readString();
    this.pFQ = paramParcel.readString();
    this.pFR = paramParcel.readFloat();
    this.pFS = paramParcel.readFloat();
    if (paramParcel.readInt() == 1)
    {
      bool2 = true;
      this.pFT = bool2;
      this.pFU = paramParcel.readInt();
      this.pFV = paramParcel.readInt();
      if (paramParcel.readInt() != 1)
        break label162;
      bool2 = true;
      label123: this.isDefault = bool2;
      if (paramParcel.readInt() != 1)
        break label167;
    }
    label162: label167: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.pFW = bool2;
      this.fmR = paramParcel.readInt();
      AppMethodBeat.o(44190);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label123;
    }
  }

  public MallRechargeProduct(boolean paramBoolean)
  {
    this.pFR = 0.0F;
    this.pFS = 0.0F;
    this.pFX = true;
    this.pFW = paramBoolean;
  }

  public static void a(MallRechargeProduct paramMallRechargeProduct1, MallRechargeProduct paramMallRechargeProduct2)
  {
    paramMallRechargeProduct2.appId = paramMallRechargeProduct1.appId;
    paramMallRechargeProduct2.pFP = paramMallRechargeProduct1.pFP;
    paramMallRechargeProduct2.cwg = paramMallRechargeProduct1.cwg;
    paramMallRechargeProduct2.lcC = paramMallRechargeProduct1.lcC;
    paramMallRechargeProduct2.pFQ = paramMallRechargeProduct1.pFQ;
    paramMallRechargeProduct2.pFR = paramMallRechargeProduct1.pFR;
    paramMallRechargeProduct2.pFS = paramMallRechargeProduct1.pFS;
    paramMallRechargeProduct2.pFT = paramMallRechargeProduct1.pFT;
    paramMallRechargeProduct2.pFU = paramMallRechargeProduct1.pFU;
    paramMallRechargeProduct2.pFV = paramMallRechargeProduct1.pFV;
    paramMallRechargeProduct2.isDefault = paramMallRechargeProduct1.isDefault;
    paramMallRechargeProduct2.pFX = paramMallRechargeProduct1.pFX;
    paramMallRechargeProduct2.fmR = paramMallRechargeProduct1.fmR;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean isValid()
  {
    if ((this.pFT) && (this.pFU <= 0));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(44191);
    paramParcel.writeString(this.pFP);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.cwg);
    paramParcel.writeString(this.lcC);
    paramParcel.writeString(this.pFQ);
    paramParcel.writeFloat(this.pFR);
    paramParcel.writeFloat(this.pFS);
    if (this.pFT)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.pFU);
      paramParcel.writeInt(this.pFV);
      if (!this.isDefault)
        break label140;
      paramInt = 1;
      label102: paramParcel.writeInt(paramInt);
      if (!this.pFW)
        break label145;
    }
    label140: label145: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.fmR);
      AppMethodBeat.o(44191);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label102;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.MallRechargeProduct
 * JD-Core Version:    0.6.2
 */