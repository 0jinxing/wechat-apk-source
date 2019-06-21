package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetFontFamilyActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetFontFamilyActionArg> CREATOR;
  public String bnS;

  static
  {
    AppMethodBeat.i(103470);
    CREATOR = new SetFontFamilyActionArg.1();
    AppMethodBeat.o(103470);
  }

  public SetFontFamilyActionArg()
  {
  }

  public SetFontFamilyActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103468);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103468);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetFontFamilyActionArg))
      {
        AppMethodBeat.o(103468);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103468);
      }
      else
      {
        paramObject = (SetFontFamilyActionArg)paramObject;
        bool = Objects.equals(this.bnS, paramObject.bnS);
        AppMethodBeat.o(103468);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103469);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.bnS });
    AppMethodBeat.o(103469);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103465);
    super.i(paramParcel);
    this.bnS = paramParcel.readString();
    AppMethodBeat.o(103465);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103466);
    super.j(paramJSONObject);
    this.bnS = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103466);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103467);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.bnS);
    AppMethodBeat.o(103467);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg
 * JD-Core Version:    0.6.2
 */