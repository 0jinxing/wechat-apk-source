package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONObject;

public class DrawRectActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<DrawRectActionArg> CREATOR;
  public float height;
  public float width;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103345);
    CREATOR = new DrawRectActionArg.1();
    AppMethodBeat.o(103345);
  }

  public DrawRectActionArg()
  {
  }

  public DrawRectActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103343);
    if (this == paramObject)
      AppMethodBeat.o(103343);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof DrawRectActionArg))
      {
        AppMethodBeat.o(103343);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103343);
        bool = false;
      }
      else
      {
        paramObject = (DrawRectActionArg)paramObject;
        if ((Float.compare(paramObject.x, this.x) == 0) && (Float.compare(paramObject.y, this.y) == 0) && (Float.compare(paramObject.width, this.width) == 0) && (Float.compare(paramObject.height, this.height) == 0))
        {
          AppMethodBeat.o(103343);
        }
        else
        {
          AppMethodBeat.o(103343);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103344);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.width), Float.valueOf(this.height) });
    AppMethodBeat.o(103344);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103340);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.width = paramParcel.readFloat();
    this.height = paramParcel.readFloat();
    AppMethodBeat.o(103340);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103342);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.width = g.d(paramJSONObject, 2);
    this.height = g.d(paramJSONObject, 3);
    AppMethodBeat.o(103342);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103341);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.width);
    paramParcel.writeFloat(this.height);
    AppMethodBeat.o(103341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg
 * JD-Core Version:    0.6.2
 */