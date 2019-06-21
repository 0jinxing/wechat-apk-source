package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PathArcToActionArg extends PathActionArg
{
  public static final Parcelable.Creator<PathArcToActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103600);
    CREATOR = new PathArcToActionArg.1();
    AppMethodBeat.o(103600);
  }

  public PathArcToActionArg()
  {
  }

  public PathArcToActionArg(Parcel paramParcel)
  {
    super(paramParcel);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcToActionArg
 * JD-Core Version:    0.6.2
 */