package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class PathArcActionArg extends PathActionArg
{
  public static final Parcelable.Creator<PathArcActionArg> CREATOR;

  static
  {
    AppMethodBeat.i(103598);
    CREATOR = new PathArcActionArg.1();
    AppMethodBeat.o(103598);
  }

  public PathArcActionArg()
  {
  }

  public PathArcActionArg(Parcel paramParcel)
  {
    super(paramParcel);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg
 * JD-Core Version:    0.6.2
 */