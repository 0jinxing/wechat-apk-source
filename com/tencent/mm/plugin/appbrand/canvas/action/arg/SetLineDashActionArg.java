package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SetLineDashActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetLineDashActionArg> CREATOR;
  public float[] hdk = null;
  public float hdl = 1.4E-45F;

  static
  {
    AppMethodBeat.i(103519);
    CREATOR = new SetLineDashActionArg.1();
    AppMethodBeat.o(103519);
  }

  public SetLineDashActionArg()
  {
  }

  public SetLineDashActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103517);
    if (this == paramObject)
      AppMethodBeat.o(103517);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetLineDashActionArg))
      {
        AppMethodBeat.o(103517);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103517);
        bool = false;
      }
      else
      {
        paramObject = (SetLineDashActionArg)paramObject;
        if ((Float.compare(paramObject.hdl, this.hdl) == 0) && (Arrays.equals(this.hdk, paramObject.hdk)))
        {
          AppMethodBeat.o(103517);
        }
        else
        {
          AppMethodBeat.o(103517);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103518);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Float.valueOf(this.hdl) });
    int j = Arrays.hashCode(this.hdk);
    AppMethodBeat.o(103518);
    return i * 31 + j;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103514);
    super.i(paramParcel);
    int i = paramParcel.readInt();
    if (i > 0)
    {
      this.hdk = new float[i];
      paramParcel.readFloatArray(this.hdk);
    }
    this.hdl = paramParcel.readFloat();
    AppMethodBeat.o(103514);
  }

  public final void j(JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(103515);
    super.j(paramJSONObject);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
    if (localJSONArray.length() < 2)
      AppMethodBeat.o(103515);
    while (true)
    {
      return;
      try
      {
        paramJSONObject = localJSONArray.getJSONArray(0);
        if (paramJSONObject == null)
        {
          AppMethodBeat.o(103515);
        }
        else
        {
          this.hdk = new float[paramJSONObject.length()];
          while (i < this.hdk.length)
          {
            this.hdk[i] = g.d(paramJSONObject, i);
            i++;
          }
          this.hdl = g.d(localJSONArray, 1);
          AppMethodBeat.o(103515);
        }
      }
      catch (JSONException paramJSONObject)
      {
        AppMethodBeat.o(103515);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103516);
    super.writeToParcel(paramParcel, paramInt);
    if (this.hdk != null)
    {
      paramParcel.writeInt(this.hdk.length);
      paramParcel.writeFloatArray(this.hdk);
    }
    paramParcel.writeFloat(this.hdl);
    AppMethodBeat.o(103516);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg
 * JD-Core Version:    0.6.2
 */