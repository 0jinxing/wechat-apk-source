package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.a.a;
import com.tencent.mm.plugin.appbrand.canvas.d;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class RealSetFillStyleActionRadialArg extends RealSetFillStyleActionArg
{
  public static final Parcelable.Creator<RealSetFillStyleActionRadialArg> CREATOR;
  public float hcX;
  public float hcY;
  public int[] hdb;
  public float hdd;
  public float[] positions;

  static
  {
    AppMethodBeat.i(103397);
    CREATOR = new RealSetFillStyleActionRadialArg.1();
    AppMethodBeat.o(103397);
  }

  public RealSetFillStyleActionRadialArg()
  {
  }

  public RealSetFillStyleActionRadialArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103390);
    boolean bool;
    if ((this.hdb == null) || (this.positions == null))
    {
      bool = false;
      AppMethodBeat.o(103390);
    }
    while (true)
    {
      return bool;
      paramd.hcF.setShader(new RadialGradient(this.hcX, this.hcY, this.hdd, this.hdb, this.positions, Shader.TileMode.CLAMP));
      bool = true;
      AppMethodBeat.o(103390);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103391);
    if (this == paramObject)
      AppMethodBeat.o(103391);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetFillStyleActionRadialArg))
      {
        AppMethodBeat.o(103391);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103391);
        bool = false;
      }
      else
      {
        paramObject = (RealSetFillStyleActionRadialArg)paramObject;
        if ((Float.compare(paramObject.hcX, this.hcX) == 0) && (Float.compare(paramObject.hcY, this.hcY) == 0) && (Float.compare(paramObject.hdd, this.hdd) == 0) && (Arrays.equals(this.hdb, paramObject.hdb)) && (Arrays.equals(this.positions, paramObject.positions)))
        {
          AppMethodBeat.o(103391);
        }
        else
        {
          AppMethodBeat.o(103391);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103395);
    super.f(paramJSONArray);
    if (paramJSONArray.length() < 3)
      AppMethodBeat.o(103395);
    while (true)
    {
      return;
      JSONArray localJSONArray = paramJSONArray.optJSONArray(1);
      if ((localJSONArray == null) || (localJSONArray.length() < 3))
      {
        AppMethodBeat.o(103395);
      }
      else
      {
        this.hcX = g.d(localJSONArray, 1);
        this.hcY = g.d(localJSONArray, 2);
        this.hdd = g.d(localJSONArray, 3);
        paramJSONArray = paramJSONArray.optJSONArray(2);
        this.hdb = new int[paramJSONArray.length()];
        this.positions = new float[paramJSONArray.length()];
        for (int i = 0; i < paramJSONArray.length(); i++)
        {
          localJSONArray = paramJSONArray.optJSONArray(i);
          if (localJSONArray.length() >= 2)
          {
            this.positions[i] = ((float)localJSONArray.optDouble(0));
            this.hdb[i] = g.n(localJSONArray.optJSONArray(1));
          }
        }
        AppMethodBeat.o(103395);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103392);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hcX), Float.valueOf(this.hcY), Float.valueOf(this.hdd) });
    int j = Arrays.hashCode(this.hdb);
    int k = Arrays.hashCode(this.positions);
    AppMethodBeat.o(103392);
    return (i * 31 + j) * 31 + k;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103393);
    super.i(paramParcel);
    this.hcX = paramParcel.readFloat();
    this.hcY = paramParcel.readFloat();
    this.hdd = paramParcel.readFloat();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.hdb = new int[i];
      paramParcel.readIntArray(this.hdb);
    }
    i = paramParcel.readInt();
    if (i > 0)
    {
      this.positions = new float[i];
      paramParcel.readFloatArray(this.positions);
    }
    AppMethodBeat.o(103393);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103396);
    super.j(paramJSONObject);
    AppMethodBeat.o(103396);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103394);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hcX);
    paramParcel.writeFloat(this.hcY);
    paramParcel.writeFloat(this.hdd);
    if (this.hdb != null)
    {
      paramParcel.writeInt(this.hdb.length);
      paramParcel.writeIntArray(this.hdb);
      if (this.positions == null)
        break label97;
      paramParcel.writeInt(this.positions.length);
      paramParcel.writeFloatArray(this.positions);
      AppMethodBeat.o(103394);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      break;
      label97: paramParcel.writeInt(0);
      AppMethodBeat.o(103394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg
 * JD-Core Version:    0.6.2
 */