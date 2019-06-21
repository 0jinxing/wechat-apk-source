package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONObject;

public class PathRectActionArg extends BasePathActionArg
{
  public static final Parcelable.Creator<PathRectActionArg> CREATOR;
  public float height;
  public float width;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103633);
    CREATOR = new PathRectActionArg.1();
    AppMethodBeat.o(103633);
  }

  public PathRectActionArg()
  {
  }

  public PathRectActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103632);
    if (!super.equals(paramObject))
      AppMethodBeat.o(103632);
    while (true)
    {
      return bool;
      if ((paramObject instanceof PathRectActionArg))
      {
        paramObject = (PathRectActionArg)paramObject;
        if ((paramObject.x == this.x) && (paramObject.y == this.y) && (paramObject.width == this.width) && (paramObject.height == this.height))
        {
          bool = true;
          AppMethodBeat.o(103632);
        }
        else
        {
          AppMethodBeat.o(103632);
        }
      }
      else
      {
        AppMethodBeat.o(103632);
      }
    }
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103631);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.width = paramParcel.readFloat();
    this.height = paramParcel.readFloat();
    AppMethodBeat.o(103631);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103629);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.width = g.d(paramJSONObject, 2);
    this.height = g.d(paramJSONObject, 3);
    AppMethodBeat.o(103629);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103630);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.width);
    paramParcel.writeFloat(this.height);
    AppMethodBeat.o(103630);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg
 * JD-Core Version:    0.6.2
 */