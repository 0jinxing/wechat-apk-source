package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.a.g;
import com.tencent.mm.plugin.appbrand.canvas.d;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetFillStyleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetFillStyleActionArg> CREATOR;
  public RealSetFillStyleActionArg hdg;

  static
  {
    AppMethodBeat.i(103456);
    CREATOR = new SetFillStyleActionArg.1();
    AppMethodBeat.o(103456);
  }

  public SetFillStyleActionArg()
  {
  }

  public SetFillStyleActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103450);
    boolean bool;
    if (this.hdg == null)
    {
      bool = false;
      AppMethodBeat.o(103450);
    }
    while (true)
    {
      return bool;
      bool = this.hdg.a(paramd, paramCanvas);
      AppMethodBeat.o(103450);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(103454);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103454);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetFillStyleActionArg))
      {
        AppMethodBeat.o(103454);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103454);
      }
      else
      {
        paramObject = (SetFillStyleActionArg)paramObject;
        bool = Objects.equals(this.hdg, paramObject.hdg);
        AppMethodBeat.o(103454);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103455);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdg });
    AppMethodBeat.o(103455);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103451);
    super.i(paramParcel);
    this.hdg = ((RealSetFillStyleActionArg)paramParcel.readParcelable(SetFillStyleActionArg.class.getClassLoader()));
    AppMethodBeat.o(103451);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103453);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    if (paramJSONObject.length() < 2)
      AppMethodBeat.o(103453);
    while (true)
    {
      return;
      String str = paramJSONObject.optString(0);
      this.hdg = ((RealSetFillStyleActionArg)g.ayn().yy(str));
      this.hdg.f(paramJSONObject);
      AppMethodBeat.o(103453);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(103449);
    super.reset();
    g.ayn().a(this.hdg);
    this.hdg = null;
    AppMethodBeat.o(103449);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103452);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.hdg, paramInt);
    AppMethodBeat.o(103452);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg
 * JD-Core Version:    0.6.2
 */