package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
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

public class RealSetStrokeStyleActionLinearArg extends RealSetStrokeStyleActionArg
{
  public static final Parcelable.Creator<RealSetStrokeStyleActionLinearArg> CREATOR;
  public float hcX;
  public float hcY;
  public float hcZ;
  public float hda;
  public int[] hdb;
  public float[] positions;

  static
  {
    AppMethodBeat.i(103408);
    CREATOR = new RealSetStrokeStyleActionLinearArg.1();
    AppMethodBeat.o(103408);
  }

  public RealSetStrokeStyleActionLinearArg()
  {
  }

  public RealSetStrokeStyleActionLinearArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final boolean a(d paramd, Canvas paramCanvas)
  {
    AppMethodBeat.i(103401);
    boolean bool;
    if ((this.hdb == null) || (this.positions == null))
    {
      bool = false;
      AppMethodBeat.o(103401);
    }
    while (true)
    {
      return bool;
      paramCanvas = new LinearGradient(this.hcX, this.hcY, this.hcZ, this.hda, this.hdb, this.positions, Shader.TileMode.CLAMP);
      paramd.hcE.setShader(paramCanvas);
      bool = true;
      AppMethodBeat.o(103401);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103402);
    if (this == paramObject)
      AppMethodBeat.o(103402);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof RealSetStrokeStyleActionLinearArg))
      {
        AppMethodBeat.o(103402);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103402);
        bool = false;
      }
      else
      {
        paramObject = (RealSetStrokeStyleActionLinearArg)paramObject;
        if ((Float.compare(paramObject.hcX, this.hcX) == 0) && (Float.compare(paramObject.hcY, this.hcY) == 0) && (Float.compare(paramObject.hcZ, this.hcZ) == 0) && (Float.compare(paramObject.hda, this.hda) == 0) && (Arrays.equals(this.hdb, paramObject.hdb)) && (Arrays.equals(this.positions, paramObject.positions)))
        {
          AppMethodBeat.o(103402);
        }
        else
        {
          AppMethodBeat.o(103402);
          bool = false;
        }
      }
    }
  }

  public final void f(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103406);
    super.f(paramJSONArray);
    if (paramJSONArray.length() < 3)
      AppMethodBeat.o(103406);
    while (true)
    {
      return;
      JSONArray localJSONArray = paramJSONArray.optJSONArray(1);
      if ((localJSONArray == null) || (localJSONArray.length() < 4))
      {
        AppMethodBeat.o(103406);
      }
      else
      {
        this.hcX = g.d(localJSONArray, 0);
        this.hcY = g.d(localJSONArray, 1);
        this.hcZ = g.d(localJSONArray, 2);
        this.hda = g.d(localJSONArray, 3);
        paramJSONArray = paramJSONArray.optJSONArray(2);
        if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
        {
          AppMethodBeat.o(103406);
        }
        else
        {
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
          AppMethodBeat.o(103406);
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103403);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hcX), Float.valueOf(this.hcY), Float.valueOf(this.hcZ), Float.valueOf(this.hda) });
    int j = Arrays.hashCode(this.hdb);
    int k = Arrays.hashCode(this.positions);
    AppMethodBeat.o(103403);
    return (i * 31 + j) * 31 + k;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103404);
    super.i(paramParcel);
    this.hcX = paramParcel.readFloat();
    this.hcY = paramParcel.readFloat();
    this.hcZ = paramParcel.readFloat();
    this.hda = paramParcel.readFloat();
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
    AppMethodBeat.o(103404);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103407);
    super.j(paramJSONObject);
    AppMethodBeat.o(103407);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103405);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.hcX);
    paramParcel.writeFloat(this.hcY);
    paramParcel.writeFloat(this.hcZ);
    paramParcel.writeFloat(this.hda);
    if (this.hdb != null)
    {
      paramParcel.writeInt(this.hdb.length);
      paramParcel.writeIntArray(this.hdb);
      if (this.positions == null)
        break label105;
      paramParcel.writeInt(this.positions.length);
      paramParcel.writeFloatArray(this.positions);
      AppMethodBeat.o(103405);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      break;
      label105: paramParcel.writeInt(0);
      AppMethodBeat.o(103405);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg
 * JD-Core Version:    0.6.2
 */