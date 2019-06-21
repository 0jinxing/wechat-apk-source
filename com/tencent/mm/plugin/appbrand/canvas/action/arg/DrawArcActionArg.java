package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class DrawArcActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<DrawArcActionArg> CREATOR;
  public float hcR;
  public float hcS;
  public float radius;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103331);
    CREATOR = new DrawArcActionArg.1();
    AppMethodBeat.o(103331);
  }

  public DrawArcActionArg()
  {
  }

  public DrawArcActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103329);
    if (this == paramObject)
      AppMethodBeat.o(103329);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof DrawArcActionArg))
      {
        AppMethodBeat.o(103329);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103329);
        bool = false;
      }
      else
      {
        paramObject = (DrawArcActionArg)paramObject;
        if ((Float.compare(paramObject.x, this.x) == 0) && (Float.compare(paramObject.y, this.y) == 0) && (Float.compare(paramObject.radius, this.radius) == 0) && (Float.compare(paramObject.hcR, this.hcR) == 0) && (Float.compare(paramObject.hcS, this.hcS) == 0))
        {
          AppMethodBeat.o(103329);
        }
        else
        {
          AppMethodBeat.o(103329);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103330);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.radius), Float.valueOf(this.hcR), Float.valueOf(this.hcS) });
    AppMethodBeat.o(103330);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103326);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.radius = paramParcel.readFloat();
    this.hcR = paramParcel.readFloat();
    this.hcS = paramParcel.readFloat();
    AppMethodBeat.o(103326);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103327);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.radius = g.d(paramJSONObject, 2);
    this.hcR = ((float)paramJSONObject.optDouble(3));
    this.hcS = ((float)paramJSONObject.optDouble(4));
    AppMethodBeat.o(103327);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103328);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.radius);
    paramParcel.writeFloat(this.hcR);
    paramParcel.writeFloat(this.hcS);
    AppMethodBeat.o(103328);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg
 * JD-Core Version:    0.6.2
 */