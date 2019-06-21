package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SetTransformActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetTransformActionArg> CREATOR;
  public float hdr;
  public float hds;
  public float scaleX;
  public float scaleY;
  public float translateX;
  public float translateY;

  static
  {
    AppMethodBeat.i(103577);
    CREATOR = new SetTransformActionArg.1();
    AppMethodBeat.o(103577);
  }

  public SetTransformActionArg()
  {
  }

  public SetTransformActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103575);
    if (this == paramObject)
      AppMethodBeat.o(103575);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetTransformActionArg))
      {
        AppMethodBeat.o(103575);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103575);
        bool = false;
      }
      else
      {
        paramObject = (SetTransformActionArg)paramObject;
        if ((Float.compare(paramObject.scaleX, this.scaleX) == 0) && (Float.compare(paramObject.hdr, this.hdr) == 0) && (Float.compare(paramObject.hds, this.hds) == 0) && (Float.compare(paramObject.scaleY, this.scaleY) == 0) && (Float.compare(paramObject.translateX, this.translateX) == 0) && (Float.compare(paramObject.translateY, this.translateY) == 0))
        {
          AppMethodBeat.o(103575);
        }
        else
        {
          AppMethodBeat.o(103575);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103576);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.scaleX), Float.valueOf(this.hdr), Float.valueOf(this.hds), Float.valueOf(this.scaleY), Float.valueOf(this.translateX), Float.valueOf(this.translateY) });
    AppMethodBeat.o(103576);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103572);
    super.i(paramParcel);
    this.scaleX = paramParcel.readFloat();
    this.hdr = paramParcel.readFloat();
    this.hds = paramParcel.readFloat();
    this.scaleY = paramParcel.readFloat();
    this.translateX = paramParcel.readFloat();
    this.translateY = paramParcel.readFloat();
    AppMethodBeat.o(103572);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103573);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    try
    {
      this.scaleX = ((float)paramJSONObject.getDouble(0));
      this.hdr = ((float)paramJSONObject.getDouble(1));
      this.hds = ((float)paramJSONObject.getDouble(2));
      this.scaleY = ((float)paramJSONObject.getDouble(3));
      this.translateX = g.c(paramJSONObject, 4);
      this.translateY = g.c(paramJSONObject, 5);
      AppMethodBeat.o(103573);
      return;
    }
    catch (JSONException paramJSONObject)
    {
      while (true)
      {
        d.printErrStackTrace("SetTransformActionArg", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(103573);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103574);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.scaleY);
    paramParcel.writeFloat(this.hdr);
    paramParcel.writeFloat(this.hds);
    paramParcel.writeFloat(this.scaleY);
    paramParcel.writeFloat(this.translateX);
    paramParcel.writeFloat(this.translateY);
    AppMethodBeat.o(103574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg
 * JD-Core Version:    0.6.2
 */