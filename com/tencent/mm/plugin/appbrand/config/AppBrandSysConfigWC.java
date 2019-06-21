package com.tencent.mm.plugin.appbrand.config;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandSysConfigWC extends AppBrandSysConfigLU
{
  public static final Parcelable.Creator<AppBrandSysConfigWC> CREATOR;
  public boolean hhg;
  public boolean hhh;
  public int hhi;

  static
  {
    AppMethodBeat.i(129846);
    CREATOR = new AppBrandSysConfigWC.1();
    AppMethodBeat.o(129846);
  }

  public AppBrandSysConfigWC()
  {
  }

  public AppBrandSysConfigWC(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(129844);
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hhg = bool2;
      if (paramParcel.readInt() != 1)
        break label60;
    }
    label60: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hhh = bool2;
      this.hhi = paramParcel.readInt();
      AppMethodBeat.o(129844);
      return;
      bool2 = false;
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(129845);
    super.writeToParcel(paramParcel, paramInt);
    if (this.hhg)
    {
      paramInt = 1;
      int j = paramInt;
      paramParcel.writeByte(j);
      if (!this.hhh)
        break label67;
    }
    label67: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.hhi);
      AppMethodBeat.o(129845);
      return;
      paramInt = 0;
      int k = paramInt;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC
 * JD-Core Version:    0.6.2
 */