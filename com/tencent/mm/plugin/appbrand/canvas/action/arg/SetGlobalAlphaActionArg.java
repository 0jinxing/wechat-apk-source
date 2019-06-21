package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONObject;

public class SetGlobalAlphaActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetGlobalAlphaActionArg> CREATOR;
  public int alpha;

  static
  {
    AppMethodBeat.i(103498);
    CREATOR = new SetGlobalAlphaActionArg.1();
    AppMethodBeat.o(103498);
  }

  public SetGlobalAlphaActionArg()
  {
  }

  public SetGlobalAlphaActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103496);
    if (this == paramObject)
      AppMethodBeat.o(103496);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetGlobalAlphaActionArg))
      {
        AppMethodBeat.o(103496);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103496);
        bool = false;
      }
      else
      {
        paramObject = (SetGlobalAlphaActionArg)paramObject;
        if (this.alpha == paramObject.alpha)
        {
          AppMethodBeat.o(103496);
        }
        else
        {
          AppMethodBeat.o(103496);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103497);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.alpha) });
    AppMethodBeat.o(103497);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103493);
    super.i(paramParcel);
    this.alpha = paramParcel.readInt();
    AppMethodBeat.o(103493);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103494);
    super.j(paramJSONObject);
    this.alpha = g.a(paramJSONObject.optJSONArray("data"), 0);
    AppMethodBeat.o(103494);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103495);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.alpha);
    AppMethodBeat.o(103495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg
 * JD-Core Version:    0.6.2
 */