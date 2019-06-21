package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

public class DrawActionWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<DrawActionWrapper> CREATOR;
  public BaseDrawActionArg hcP;
  public JSONObject hcQ;
  public int type;

  static
  {
    AppMethodBeat.i(103324);
    CREATOR = new DrawActionWrapper.1();
    AppMethodBeat.o(103324);
  }

  public DrawActionWrapper()
  {
  }

  public DrawActionWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(103319);
    this.type = paramParcel.readInt();
    switch (this.type)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(103319);
      while (true)
      {
        return;
        String str = paramParcel.readString();
        try
        {
          paramParcel = new org/json/JSONObject;
          paramParcel.<init>(str);
          this.hcQ = paramParcel;
          AppMethodBeat.o(103319);
        }
        catch (JSONException paramParcel)
        {
          com.tencent.luggage.g.d.printErrStackTrace("DrawActionWrapper", paramParcel, "", new Object[0]);
          AppMethodBeat.o(103319);
        }
      }
      this.hcP = ((BaseDrawActionArg)paramParcel.readParcelable(DrawActionWrapper.class.getClassLoader()));
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final String getMethod()
  {
    AppMethodBeat.i(103321);
    String str;
    switch (this.type)
    {
    default:
      str = "";
      AppMethodBeat.o(103321);
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = this.hcQ.optString("method");
      AppMethodBeat.o(103321);
      continue;
      str = this.hcP.method;
      AppMethodBeat.o(103321);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(103320);
    if (this.hcP != null)
    {
      this.hcP.reset();
      com.tencent.mm.plugin.appbrand.canvas.action.arg.a.c.ayj().a(this.hcP);
    }
    com.tencent.mm.plugin.appbrand.canvas.action.arg.a.d.ayk().hdA.release(this);
    AppMethodBeat.o(103320);
  }

  public String toString()
  {
    AppMethodBeat.i(103322);
    String str = String.format("type %d ,method %s", new Object[] { Integer.valueOf(this.type), getMethod() });
    AppMethodBeat.o(103322);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103323);
    paramParcel.writeInt(this.type);
    switch (this.type)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(103323);
      while (true)
      {
        return;
        paramParcel.writeString(this.hcQ.toString());
        AppMethodBeat.o(103323);
      }
      paramParcel.writeParcelable(this.hcP, paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper
 * JD-Core Version:    0.6.2
 */