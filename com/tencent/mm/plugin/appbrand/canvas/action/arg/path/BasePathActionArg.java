package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;

public class BasePathActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<BasePathActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103587);
    CREATOR = new BasePathActionArg.1();
    AppMethodBeat.o(103587);
  }

  public BasePathActionArg()
  {
  }

  protected BasePathActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103586);
    super.writeToParcel(paramParcel, paramInt);
    AppMethodBeat.o(103586);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg
 * JD-Core Version:    0.6.2
 */