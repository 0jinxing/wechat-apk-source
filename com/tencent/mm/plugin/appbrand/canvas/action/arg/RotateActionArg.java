package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class RotateActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<RotateActionArg> CREATOR;
  public float hde;

  static
  {
    AppMethodBeat.i(103433);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103433);
  }

  public RotateActionArg()
  {
  }

  public RotateActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103431);
    if (this == paramObject)
      AppMethodBeat.o(103431);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RotateActionArg))
      {
        AppMethodBeat.o(103431);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103431);
        bool = false;
      }
      else if (Float.compare(((RotateActionArg)paramObject).hde, this.hde) == 0)
      {
        AppMethodBeat.o(103431);
      }
      else
      {
        AppMethodBeat.o(103431);
        bool = false;
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103432);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hde) });
    AppMethodBeat.o(103432);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103428);
    super.i(paramParcel);
    this.hde = paramParcel.readFloat();
    AppMethodBeat.o(103428);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103429);
    super.j(paramJSONObject);
    this.hde = ((float)paramJSONObject.optJSONArray("data").optDouble(0));
    AppMethodBeat.o(103429);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103430);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hde);
    AppMethodBeat.o(103430);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RotateActionArg
 * JD-Core Version:    0.6.2
 */