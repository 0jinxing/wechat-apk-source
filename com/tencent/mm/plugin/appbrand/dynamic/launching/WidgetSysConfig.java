package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WidgetSysConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetSysConfig> CREATOR;
  public int hfU;
  public int hfV;
  public int hfW;

  static
  {
    AppMethodBeat.i(10934);
    CREATOR = new WidgetSysConfig.1();
    AppMethodBeat.o(10934);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(10933);
    paramParcel.writeInt(this.hfU);
    paramParcel.writeInt(this.hfV);
    paramParcel.writeInt(this.hfW);
    AppMethodBeat.o(10933);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig
 * JD-Core Version:    0.6.2
 */