package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetTextAlignActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetTextAlignActionArg> CREATOR;
  public String hdq;

  static
  {
    AppMethodBeat.i(103563);
    CREATOR = new SetTextAlignActionArg.1();
    AppMethodBeat.o(103563);
  }

  public SetTextAlignActionArg()
  {
  }

  public SetTextAlignActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103561);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103561);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetTextAlignActionArg))
      {
        AppMethodBeat.o(103561);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103561);
      }
      else
      {
        paramObject = (SetTextAlignActionArg)paramObject;
        bool = Objects.equals(this.hdq, paramObject.hdq);
        AppMethodBeat.o(103561);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103562);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdq });
    AppMethodBeat.o(103562);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103558);
    super.i(paramParcel);
    this.hdq = paramParcel.readString();
    AppMethodBeat.o(103558);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103559);
    super.j(paramJSONObject);
    this.hdq = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103559);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103560);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdq);
    AppMethodBeat.o(103560);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg
 * JD-Core Version:    0.6.2
 */