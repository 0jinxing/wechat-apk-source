package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetFontStyleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetFontStyleActionArg> CREATOR;
  public String hdh;

  static
  {
    AppMethodBeat.i(103484);
    CREATOR = new SetFontStyleActionArg.1();
    AppMethodBeat.o(103484);
  }

  public SetFontStyleActionArg()
  {
  }

  public SetFontStyleActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103482);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103482);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetFontStyleActionArg))
      {
        AppMethodBeat.o(103482);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103482);
      }
      else
      {
        paramObject = (SetFontStyleActionArg)paramObject;
        bool = Objects.equals(this.hdh, paramObject.hdh);
        AppMethodBeat.o(103482);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103483);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdh });
    AppMethodBeat.o(103483);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103479);
    super.i(paramParcel);
    this.hdh = paramParcel.readString();
    AppMethodBeat.o(103479);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103480);
    super.j(paramJSONObject);
    this.hdh = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103480);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103481);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdh);
    AppMethodBeat.o(103481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg
 * JD-Core Version:    0.6.2
 */