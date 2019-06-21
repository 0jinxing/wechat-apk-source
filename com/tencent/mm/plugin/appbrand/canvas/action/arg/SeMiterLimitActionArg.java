package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SeMiterLimitActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SeMiterLimitActionArg> CREATOR;
  public float hdf;

  static
  {
    AppMethodBeat.i(103447);
    CREATOR = new SeMiterLimitActionArg.1();
    AppMethodBeat.o(103447);
  }

  public SeMiterLimitActionArg()
  {
  }

  public SeMiterLimitActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103445);
    if (this == paramObject)
      AppMethodBeat.o(103445);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SeMiterLimitActionArg))
      {
        AppMethodBeat.o(103445);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103445);
        bool = false;
      }
      else if (Float.compare(((SeMiterLimitActionArg)paramObject).hdf, this.hdf) == 0)
      {
        AppMethodBeat.o(103445);
      }
      else
      {
        AppMethodBeat.o(103445);
        bool = false;
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103446);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hdf) });
    AppMethodBeat.o(103446);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103442);
    super.i(paramParcel);
    this.hdf = paramParcel.readFloat();
    AppMethodBeat.o(103442);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103443);
    super.j(paramJSONObject);
    this.hdf = ((float)paramJSONObject.optJSONArray("data").optDouble(0));
    AppMethodBeat.o(103443);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103444);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hdf);
    AppMethodBeat.o(103444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg
 * JD-Core Version:    0.6.2
 */