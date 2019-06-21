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

public class RealSetStrokeStyleActionRadialArg extends RealSetStrokeStyleActionArg
{
  public static final Parcelable.Creator<RealSetStrokeStyleActionRadialArg> CREATOR;
  public float hcX;
  public float hcY;
  public int[] hdb;
  public float hdd;
  public float[] positions;

  static
  {
    AppMethodBeat.i(103426);
    CREATOR = new RealSetStrokeStyleActionRadialArg.1();
    AppMethodBeat.o(103426);
  }

  public RealSetStrokeStyleActionRadialArg()
  {
  }

  public RealSetStrokeStyleActionRadialArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103419);
    boolean bool;
    if ((this.hdb == null) || (this.positions == null))
    {
      bool = false;
      AppMethodBeat.o(103419);
    }
    while (true)
    {
      return bool;
      paramCanvas = new RadialGradient(this.hcX, this.hcY, this.hdd, this.hdb, this.positions, Shader.TileMode.CLAMP);
      paramd.hcE.setShader(paramCanvas);
      bool = true;
      AppMethodBeat.o(103419);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103420);
    if (this == paramObject)
      AppMethodBeat.o(103420);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetStrokeStyleActionRadialArg))
      {
        AppMethodBeat.o(103420);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103420);
        bool = false;
      }
      else
      {
        paramObject = (RealSetStrokeStyleActionRadialArg)paramObject;
        if ((Float.compare(paramObject.hcX, this.hcX) == 0) && (Float.compare(paramObject.hcY, this.hcY) == 0) && (Float.compare(paramObject.hdd, this.hdd) == 0) && (Arrays.equals(this.hdb, paramObject.hdb)) && (Arrays.equals(this.positions, paramObject.positions)))
        {
          AppMethodBeat.o(103420);
        }
        else
        {
          AppMethodBeat.o(103420);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103424);
    super.f(paramJSONArray);
    if (paramJSONArray.length() < 3)
      AppMethodBeat.o(103424);
    while (true)
    {
      return;
      JSONArray localJSONArray = paramJSONArray.optJSONArray(1);
      if ((localJSONArray == null) || (localJSONArray.length() < 3))
      {
        AppMethodBeat.o(103424);
      }
      else
      {
        this.hcX = g.d(localJSONArray, 1);
        this.hcY = g.d(localJSONArray, 2);
        this.hdd = g.d(localJSONArray, 3);
        localJSONArray = paramJSONArray.optJSONArray(2);
        this.hdb = new int[localJSONArray.length()];
        this.positions = new float[localJSONArray.length()];
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          paramJSONArray = localJSONArray.optJSONArray(i);
          if (paramJSONArray.length() >= 2)
          {
            this.positions[i] = ((float)paramJSONArray.optDouble(0));
            this.hdb[i] = g.n(paramJSONArray.optJSONArray(1));
          }
        }
        AppMethodBeat.o(103424);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103421);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hcX), Float.valueOf(this.hcY), Float.valueOf(this.hdd) });
    int j = Arrays.hashCode(this.hdb);
    int k = Arrays.hashCode(this.positions);
    AppMethodBeat.o(103421);
    return (i * 31 + j) * 31 + k;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103422);
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
    AppMethodBeat.o(103422);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103425);
    super.j(paramJSONObject);
    AppMethodBeat.o(103425);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103423);
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
      AppMethodBeat.o(103423);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      break;
      label97: paramParcel.writeInt(0);
      AppMethodBeat.o(103423);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg
 * JD-Core Version:    0.6.2
 */