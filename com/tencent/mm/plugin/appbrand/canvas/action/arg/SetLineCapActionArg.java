package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetLineCapActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetLineCapActionArg> CREATOR;
  public String hdj;

  static
  {
    AppMethodBeat.i(103512);
    CREATOR = new SetLineCapActionArg.1();
    AppMethodBeat.o(103512);
  }

  public SetLineCapActionArg()
  {
  }

  public SetLineCapActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103510);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103510);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetLineCapActionArg))
      {
        AppMethodBeat.o(103510);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103510);
      }
      else
      {
        paramObject = (SetLineCapActionArg)paramObject;
        bool = Objects.equals(this.hdj, paramObject.hdj);
        AppMethodBeat.o(103510);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103511);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdj });
    AppMethodBeat.o(103511);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103507);
    super.i(paramParcel);
    this.hdj = paramParcel.readString();
    AppMethodBeat.o(103507);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103508);
    super.j(paramJSONObject);
    this.hdj = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103508);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103509);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hdj);
    AppMethodBeat.o(103509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg
 * JD-Core Version:    0.6.2
 */