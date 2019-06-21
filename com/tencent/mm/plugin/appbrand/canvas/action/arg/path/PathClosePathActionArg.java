package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

public class PathClosePathActionArg extends BasePathActionArg
{
  public static final Parcelable.Creator<PathClosePathActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103609);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103609);
  }

  public PathClosePathActionArg()
  {
  }

  public PathClosePathActionArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103608);
    super.j(paramJSONObject);
    AppMethodBeat.o(103608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathClosePathActionArg
 * JD-Core Version:    0.6.2
 */