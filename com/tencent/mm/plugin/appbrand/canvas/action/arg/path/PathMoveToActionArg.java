package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONObject;

public class PathMoveToActionArg extends BasePathActionArg
{
  public static final Parcelable.Creator<PathMoveToActionArg> CREATOR;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103621);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103621);
  }

  public PathMoveToActionArg()
  {
  }

  public PathMoveToActionArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(103620);
    if (!super.equals(paramObject))
      AppMethodBeat.o(103620);
    while (true)
    {
      return bool;
      if ((paramObject instanceof PathMoveToActionArg))
      {
        paramObject = (PathMoveToActionArg)paramObject;
        if ((paramObject.x == this.x) && (paramObject.y == this.y))
        {
          bool = true;
          AppMethodBeat.o(103620);
        }
        else
        {
          AppMethodBeat.o(103620);
        }
      }
      else
      {
        AppMethodBeat.o(103620);
      }
    }
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103619);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    AppMethodBeat.o(103619);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103617);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    AppMethodBeat.o(103617);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103618);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    AppMethodBeat.o(103618);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg
 * JD-Core Version:    0.6.2
 */