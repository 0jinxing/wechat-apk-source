package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetTextBaseLineActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetTextBaseLineActionArg> CREATOR;
  public String hdq;

  static
  {
    AppMethodBeat.i(103570);
    CREATOR = new SetTextBaseLineActionArg.1();
    AppMethodBeat.o(103570);
  }

  public SetTextBaseLineActionArg()
  {
  }

  public SetTextBaseLineActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103568);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103568);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetTextBaseLineActionArg))
      {
        AppMethodBeat.o(103568);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103568);
      }
      else
      {
        paramObject = (SetTextBaseLineActionArg)paramObject;
        bool = Objects.equals(this.hdq, paramObject.hdq);
        AppMethodBeat.o(103568);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103569);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdq });
    AppMethodBeat.o(103569);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103565);
    super.i(paramParcel);
    this.hdq = paramParcel.readString();
    AppMethodBeat.o(103565);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103566);
    super.j(paramJSONObject);
    this.hdq = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103566);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103567);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdq);
    AppMethodBeat.o(103567);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg
 * JD-Core Version:    0.6.2
 */