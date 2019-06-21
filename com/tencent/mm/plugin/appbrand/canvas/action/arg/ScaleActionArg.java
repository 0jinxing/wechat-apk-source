package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ScaleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<ScaleActionArg> CREATOR;
  public float hcX;
  public float hcY;

  static
  {
    AppMethodBeat.i(103440);
    CREATOR = new ScaleActionArg.1();
    AppMethodBeat.o(103440);
  }

  public ScaleActionArg()
  {
  }

  public ScaleActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103437);
    if (this == paramObject)
      AppMethodBeat.o(103437);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof ScaleActionArg))
      {
        AppMethodBeat.o(103437);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103437);
        bool = false;
      }
      else
      {
        paramObject = (ScaleActionArg)paramObject;
        if ((Float.compare(paramObject.hcX, this.hcX) == 0) && (Float.compare(paramObject.hcY, this.hcY) == 0))
        {
          AppMethodBeat.o(103437);
        }
        else
        {
          AppMethodBeat.o(103437);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103438);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hcX), Float.valueOf(this.hcY) });
    AppMethodBeat.o(103438);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103435);
    super.i(paramParcel);
    this.hcX = paramParcel.readFloat();
    this.hcY = paramParcel.readFloat();
    AppMethodBeat.o(103435);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103436);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.hcX = ((float)paramJSONObject.optDouble(0));
    this.hcY = ((float)paramJSONObject.optDouble(1));
    AppMethodBeat.o(103436);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103439);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hcX);
    paramParcel.writeFloat(this.hcY);
    AppMethodBeat.o(103439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg
 * JD-Core Version:    0.6.2
 */