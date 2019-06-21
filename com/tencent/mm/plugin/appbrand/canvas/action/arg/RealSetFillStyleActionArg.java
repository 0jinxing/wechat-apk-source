package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;

public class RealSetFillStyleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<RealSetFillStyleActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103361);
    CREATOR = new RealSetFillStyleActionArg.1();
    AppMethodBeat.o(103361);
  }

  public RealSetFillStyleActionArg()
  {
  }

  public RealSetFillStyleActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public void f(JSONArray paramJSONArray)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg
 * JD-Core Version:    0.6.2
 */