package com.tencent.mm.plugin.appbrand.dynamic.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WidgetRuntimeConfig
  implements Parcelable
{
  public static final Parcelable.Creator<WidgetRuntimeConfig> CREATOR;
  public String appId;
  public int hog;
  public int hox = 32;
  public boolean hoy = false;
  public boolean hoz = true;

  static
  {
    AppMethodBeat.i(10931);
    CREATOR = new WidgetRuntimeConfig.1();
    AppMethodBeat.o(10931);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(10930);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.hog);
    paramParcel.writeInt(this.hox);
    if (this.hoy)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.hoz)
        break label72;
    }
    label72: for (paramInt = i; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      AppMethodBeat.o(10930);
      return;
      paramInt = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig
 * JD-Core Version:    0.6.2
 */