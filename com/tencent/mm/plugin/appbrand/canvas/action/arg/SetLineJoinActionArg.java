package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetLineJoinActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetLineJoinActionArg> CREATOR;
  public String hdm;

  static
  {
    AppMethodBeat.i(103526);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103526);
  }

  public SetLineJoinActionArg()
  {
  }

  public SetLineJoinActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103524);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103524);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetLineJoinActionArg))
      {
        AppMethodBeat.o(103524);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103524);
      }
      else
      {
        paramObject = (SetLineJoinActionArg)paramObject;
        bool = Objects.equals(this.hdm, paramObject.hdm);
        AppMethodBeat.o(103524);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103525);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdm });
    AppMethodBeat.o(103525);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103521);
    super.i(paramParcel);
    this.hdm = paramParcel.readString();
    AppMethodBeat.o(103521);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103522);
    super.j(paramJSONObject);
    this.hdm = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103522);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103523);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdm);
    AppMethodBeat.o(103523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg
 * JD-Core Version:    0.6.2
 */