package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DefaultDrawActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<DefaultDrawActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103317);
    CREATOR = new DefaultDrawActionArg.1();
    AppMethodBeat.o(103317);
  }

  public DefaultDrawActionArg()
  {
  }

  public DefaultDrawActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.DefaultDrawActionArg
 * JD-Core Version:    0.6.2
 */