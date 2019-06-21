package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetGlobalCompositeOperationActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetGlobalCompositeOperationActionArg> CREATOR;
  public String type;

  static
  {
    AppMethodBeat.i(103505);
    CREATOR = new SetGlobalCompositeOperationActionArg.1();
    AppMethodBeat.o(103505);
  }

  public SetGlobalCompositeOperationActionArg()
  {
  }

  public SetGlobalCompositeOperationActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103503);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103503);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetGlobalCompositeOperationActionArg))
      {
        AppMethodBeat.o(103503);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103503);
      }
      else
      {
        paramObject = (SetGlobalCompositeOperationActionArg)paramObject;
        bool = Objects.equals(this.type, paramObject.type);
        AppMethodBeat.o(103503);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103504);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.type });
    AppMethodBeat.o(103504);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103500);
    super.i(paramParcel);
    this.type = paramParcel.readString();
    AppMethodBeat.o(103500);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103501);
    super.j(paramJSONObject);
    this.type = paramJSONObject.optJSONArray("data").optString(0);
    AppMethodBeat.o(103501);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103502);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.type);
    AppMethodBeat.o(103502);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg
 * JD-Core Version:    0.6.2
 */