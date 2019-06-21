package com.tencent.mm.plugin.appbrand.menu;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.luggage.sdk.customize.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.bo;

class MenuDelegate_EnableDebug$SetAppDebugModeTask extends MainProcessTask
{
  public static final Parcelable.Creator<SetAppDebugModeTask> CREATOR;
  public String appId;
  public boolean enable;

  static
  {
    AppMethodBeat.i(102135);
    CREATOR = new MenuDelegate_EnableDebug.SetAppDebugModeTask.1();
    AppMethodBeat.o(102135);
  }

  public final void asP()
  {
    AppMethodBeat.i(102132);
    String str = this.appId;
    boolean bool = this.enable;
    c localc = ((b)e.B(b.class)).xH();
    if ((bo.isNullOrNil(str)) || (localc == null))
      AppMethodBeat.o(102132);
    while (true)
    {
      return;
      localc.bG(str + "_AppDebugEnabled", String.valueOf(bool));
      AppMethodBeat.o(102132);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102133);
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.enable = bool;
      AppMethodBeat.o(102133);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102134);
    paramParcel.writeString(this.appId);
    if (this.enable)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(102134);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug.SetAppDebugModeTask
 * JD-Core Version:    0.6.2
 */