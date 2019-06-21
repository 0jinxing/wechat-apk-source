package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.a.h;
import com.tencent.mm.plugin.appbrand.canvas.d;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SetStrokeStyleActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetStrokeStyleActionArg> CREATOR;
  public RealSetStrokeStyleActionArg hdp;

  static
  {
    AppMethodBeat.i(103556);
    CREATOR = new SetStrokeStyleActionArg.1();
    AppMethodBeat.o(103556);
  }

  public SetStrokeStyleActionArg()
  {
  }

  public SetStrokeStyleActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103550);
    boolean bool;
    if (this.hdp == null)
    {
      bool = false;
      AppMethodBeat.o(103550);
    }
    while (true)
    {
      return bool;
      bool = this.hdp.a(paramd, paramCanvas);
      AppMethodBeat.o(103550);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(103554);
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(103554);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetStrokeStyleActionArg))
      {
        AppMethodBeat.o(103554);
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103554);
      }
      else
      {
        paramObject = (SetStrokeStyleActionArg)paramObject;
        bool = Objects.equals(this.hdp, paramObject.hdp);
        AppMethodBeat.o(103554);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103555);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.hdp });
    AppMethodBeat.o(103555);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103551);
    super.i(paramParcel);
    this.hdp = ((RealSetStrokeStyleActionArg)paramParcel.readParcelable(SetStrokeStyleActionArg.class.getClassLoader()));
    AppMethodBeat.o(103551);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103553);
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    if (paramJSONObject.length() < 2)
      AppMethodBeat.o(103553);
    while (true)
    {
      return;
      String str = paramJSONObject.optString(0);
      this.hdp = ((RealSetStrokeStyleActionArg)h.ayo().yy(str));
      this.hdp.f(paramJSONObject);
      AppMethodBeat.o(103553);
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(103549);
    super.reset();
    h.ayo().a(this.hdp);
    this.hdp = null;
    AppMethodBeat.o(103549);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103552);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(this.hdp, paramInt);
    AppMethodBeat.o(103552);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg
 * JD-Core Version:    0.6.2
 */