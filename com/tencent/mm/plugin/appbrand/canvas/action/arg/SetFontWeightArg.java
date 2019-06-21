package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetFontWeightArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetFontWeightArg> CREATOR;
  public String hdi;

  static
  {
    AppMethodBeat.i(103491);
    CREATOR = new SetFontWeightArg.1();
    AppMethodBeat.o(103491);
  }

  public SetFontWeightArg()
  {
  }

  public SetFontWeightArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(103489);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103489);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetFontWeightArg))
      {
        AppMethodBeat.o(103489);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103489);
      }
      else
      {
        paramObject = (SetFontWeightArg)paramObject;
        bool = Objects.equals(this.hdi, paramObject.hdi);
        AppMethodBeat.o(103489);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103490);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdi });
    AppMethodBeat.o(103490);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103486);
    super.i(paramParcel);
    this.hdi = paramParcel.readString();
    AppMethodBeat.o(103486);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103487);
    super.j(paramJSONObject);
    this.hdi = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103487);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103488);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdi);
    AppMethodBeat.o(103488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg
 * JD-Core Version:    0.6.2
 */