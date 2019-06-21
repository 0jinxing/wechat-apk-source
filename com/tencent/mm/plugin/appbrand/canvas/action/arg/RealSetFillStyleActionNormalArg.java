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

public class RealSetFillStyleActionNormalArg extends RealSetFillStyleActionArg
{
  public static final Parcelable.Creator<RealSetFillStyleActionNormalArg> CREATOR;
  public int color;

  static
  {
    AppMethodBeat.i(103379);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103379);
  }

  public RealSetFillStyleActionNormalArg()
  {
  }

  public RealSetFillStyleActionNormalArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103372);
    paramd = paramd.hcF;
    paramd.setShader(null);
    paramd.setColor(this.color);
    AppMethodBeat.o(103372);
    return true;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103376);
    if (this == paramObject)
      AppMethodBeat.o(103376);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetFillStyleActionNormalArg))
      {
        AppMethodBeat.o(103376);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103376);
        bool = false;
      }
      else
      {
        paramObject = (RealSetFillStyleActionNormalArg)paramObject;
        if (this.color == paramObject.color)
        {
          AppMethodBeat.o(103376);
        }
        else
        {
          AppMethodBeat.o(103376);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103375);
    super.f(paramJSONArray);
    paramJSONArray = paramJSONArray.optJSONArray(1);
    if ((paramJSONArray == null) || (paramJSONArray.length() < 4))
      AppMethodBeat.o(103375);
    while (true)
    {
      return;
      this.color = g.n(paramJSONArray);
      AppMethodBeat.o(103375);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103377);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.color) });
    AppMethodBeat.o(103377);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103373);
    super.i(paramParcel);
    this.color = paramParcel.readInt();
    AppMethodBeat.o(103373);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103378);
    super.j(paramJSONObject);
    AppMethodBeat.o(103378);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103374);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.color);
    AppMethodBeat.o(103374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionNormalArg
 * JD-Core Version:    0.6.2
 */