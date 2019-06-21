package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetShadowActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetShadowActionArg> CREATOR;
  public int color;
  public float hdo;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103547);
    CREATOR = new SetShadowActionArg.1();
    AppMethodBeat.o(103547);
  }

  public SetShadowActionArg()
  {
  }

  public SetShadowActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103545);
    if (this == paramObject)
      AppMethodBeat.o(103545);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetShadowActionArg))
      {
        AppMethodBeat.o(103545);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103545);
        bool = false;
      }
      else
      {
        paramObject = (SetShadowActionArg)paramObject;
        if ((Float.compare(paramObject.x, this.x) == 0) && (Float.compare(paramObject.y, this.y) == 0) && (Float.compare(paramObject.hdo, this.hdo) == 0) && (this.color == paramObject.color))
        {
          AppMethodBeat.o(103545);
        }
        else
        {
          AppMethodBeat.o(103545);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103546);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.hdo), Integer.valueOf(this.color) });
    AppMethodBeat.o(103546);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103542);
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.hdo = paramParcel.readFloat();
    this.color = paramParcel.readInt();
    AppMethodBeat.o(103542);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103544);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    paramJSONObject.length();
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.hdo = g.d(paramJSONObject, 2);
    paramJSONObject = paramJSONObject.optJSONArray(3);
    if ((paramJSONObject == null) || (paramJSONObject.length() < 4))
      AppMethodBeat.o(103544);
    while (true)
    {
      return;
      this.color = g.n(paramJSONObject);
      AppMethodBeat.o(103544);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103543);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.hdo);
    paramParcel.writeInt(this.color);
    AppMethodBeat.o(103543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg
 * JD-Core Version:    0.6.2
 */