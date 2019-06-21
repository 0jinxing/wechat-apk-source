package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class RealSetStrokeStyleActionNormalArg extends RealSetStrokeStyleActionArg
{
  public static final Parcelable.Creator<RealSetStrokeStyleActionNormalArg> CREATOR;
  public int color;

  static
  {
    AppMethodBeat.i(103417);
    CREATOR = new RealSetStrokeStyleActionNormalArg.1();
    AppMethodBeat.o(103417);
  }

  public RealSetStrokeStyleActionNormalArg()
  {
  }

  public RealSetStrokeStyleActionNormalArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103410);
    paramd.hcE.setColor(this.color);
    AppMethodBeat.o(103410);
    return true;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103412);
    if (this == paramObject)
      AppMethodBeat.o(103412);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetStrokeStyleActionNormalArg))
      {
        AppMethodBeat.o(103412);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103412);
        bool = false;
      }
      else
      {
        paramObject = (RealSetStrokeStyleActionNormalArg)paramObject;
        if (this.color == paramObject.color)
        {
          AppMethodBeat.o(103412);
        }
        else
        {
          AppMethodBeat.o(103412);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103415);
    super.f(paramJSONArray);
    paramJSONArray = paramJSONArray.optJSONArray(1);
    if ((paramJSONArray == null) || (paramJSONArray.length() < 4))
      AppMethodBeat.o(103415);
    while (true)
    {
      return;
      this.color = g.n(paramJSONArray);
      AppMethodBeat.o(103415);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103413);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.color) });
    AppMethodBeat.o(103413);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103411);
    super.i(paramParcel);
    this.color = paramParcel.readInt();
    AppMethodBeat.o(103411);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103416);
    super.j(paramJSONObject);
    AppMethodBeat.o(103416);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103414);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.color);
    AppMethodBeat.o(103414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionNormalArg
 * JD-Core Version:    0.6.2
 */