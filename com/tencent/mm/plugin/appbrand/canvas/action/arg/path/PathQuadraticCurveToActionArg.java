package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONObject;

public class PathQuadraticCurveToActionArg extends BasePathActionArg
{
  public static final Parcelable.Creator<PathQuadraticCurveToActionArg> CREATOR;
  public float x1;
  public float x2;
  public float y1;
  public float y2;

  static
  {
    AppMethodBeat.i(103627);
    CREATOR = new PathQuadraticCurveToActionArg.1();
    AppMethodBeat.o(103627);
  }

  public PathQuadraticCurveToActionArg()
  {
  }

  public PathQuadraticCurveToActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103626);
    if (!super.equals(paramObject))
      AppMethodBeat.o(103626);
    while (true)
    {
      return bool;
      if ((paramObject instanceof PathQuadraticCurveToActionArg))
      {
        paramObject = (PathQuadraticCurveToActionArg)paramObject;
        if ((paramObject.x1 == this.x1) && (paramObject.y1 == this.y1) && (paramObject.x2 == this.x2) && (paramObject.y2 == this.y2))
        {
          bool = true;
          AppMethodBeat.o(103626);
        }
        else
        {
          AppMethodBeat.o(103626);
        }
      }
      else
      {
        AppMethodBeat.o(103626);
      }
    }
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103625);
    super.i(paramParcel);
    this.x1 = paramParcel.readFloat();
    this.y1 = paramParcel.readFloat();
    this.x2 = paramParcel.readFloat();
    this.y2 = paramParcel.readFloat();
    AppMethodBeat.o(103625);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103623);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x1 = g.d(paramJSONObject, 0);
    this.y1 = g.d(paramJSONObject, 1);
    this.x2 = g.d(paramJSONObject, 2);
    this.y2 = g.d(paramJSONObject, 3);
    AppMethodBeat.o(103623);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103624);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x1);
    paramParcel.writeFloat(this.y1);
    paramParcel.writeFloat(this.x2);
    paramParcel.writeFloat(this.y2);
    AppMethodBeat.o(103624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg
 * JD-Core Version:    0.6.2
 */