package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONObject;

public class SetLineWidthActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetLineWidthActionArg> CREATOR;
  public float hdn;

  static
  {
    AppMethodBeat.i(103533);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103533);
  }

  public SetLineWidthActionArg()
  {
  }

  public SetLineWidthActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103531);
    if (this == paramObject)
      AppMethodBeat.o(103531);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetLineWidthActionArg))
      {
        AppMethodBeat.o(103531);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103531);
        bool = false;
      }
      else if (Float.compare(((SetLineWidthActionArg)paramObject).hdn, this.hdn) == 0)
      {
        AppMethodBeat.o(103531);
      }
      else
      {
        AppMethodBeat.o(103531);
        bool = false;
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103532);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hdn) });
    AppMethodBeat.o(103532);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103528);
    super.i(paramParcel);
    this.hdn = paramParcel.readFloat();
    AppMethodBeat.o(103528);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103529);
    super.j(paramJSONObject);
    this.hdn = g.d(paramJSONObject.optJSONArray("data"), 0);
    AppMethodBeat.o(103529);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103530);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hdn);
    AppMethodBeat.o(103530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg
 * JD-Core Version:    0.6.2
 */