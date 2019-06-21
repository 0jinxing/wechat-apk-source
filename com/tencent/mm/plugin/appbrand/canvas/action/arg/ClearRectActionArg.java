package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONObject;

public class ClearRectActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<ClearRectActionArg> CREATOR;
  public float height;
  public float width;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103315);
    CREATOR = new ClearRectActionArg.1();
    AppMethodBeat.o(103315);
  }

  public ClearRectActionArg()
  {
  }

  public ClearRectActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103313);
    if (this == paramObject)
      AppMethodBeat.o(103313);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ClearRectActionArg))
      {
        AppMethodBeat.o(103313);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103313);
        bool = false;
      }
      else
      {
        paramObject = (ClearRectActionArg)paramObject;
        if ((Float.compare(paramObject.x, this.x) == 0) && (Float.compare(paramObject.y, this.y) == 0) && (Float.compare(paramObject.width, this.width) == 0) && (Float.compare(paramObject.height, this.height) == 0))
        {
          AppMethodBeat.o(103313);
        }
        else
        {
          AppMethodBeat.o(103313);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103314);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.width), Float.valueOf(this.height) });
    AppMethodBeat.o(103314);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103310);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.width = paramParcel.readFloat();
    this.height = paramParcel.readFloat();
    AppMethodBeat.o(103310);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103312);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.width = g.d(paramJSONObject, 2);
    this.height = g.d(paramJSONObject, 3);
    AppMethodBeat.o(103312);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103311);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.width);
    paramParcel.writeFloat(this.height);
    AppMethodBeat.o(103311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg
 * JD-Core Version:    0.6.2
 */