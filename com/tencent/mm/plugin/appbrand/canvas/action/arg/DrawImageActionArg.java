package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class DrawImageActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<DrawImageActionArg> CREATOR;
  public int aIJ;
  public int aIK;
  public int hcT;
  public int hcU;
  public int hcV;
  public float height;
  public String url;
  public float width;
  public float x;
  public float y;

  static
  {
    AppMethodBeat.i(103338);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(103338);
  }

  public DrawImageActionArg()
  {
  }

  public DrawImageActionArg(Parcel paramParcel)
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
    AppMethodBeat.i(103336);
    if (this == paramObject)
      AppMethodBeat.o(103336);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof DrawImageActionArg))
      {
        AppMethodBeat.o(103336);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103336);
        bool = false;
      }
      else
      {
        paramObject = (DrawImageActionArg)paramObject;
        if ((this.hcT == paramObject.hcT) && (Float.compare(paramObject.x, this.x) == 0) && (Float.compare(paramObject.y, this.y) == 0) && (Float.compare(paramObject.width, this.width) == 0) && (Float.compare(paramObject.height, this.height) == 0) && (this.hcU == paramObject.hcU) && (this.hcV == paramObject.hcV) && (this.aIJ == paramObject.aIJ) && (this.aIK == paramObject.aIK) && (Objects.equals(this.url, paramObject.url)))
        {
          AppMethodBeat.o(103336);
        }
        else
        {
          AppMethodBeat.o(103336);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103337);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.hcT), this.url, Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.width), Float.valueOf(this.height), Integer.valueOf(this.hcU), Integer.valueOf(this.hcV), Integer.valueOf(this.aIJ), Integer.valueOf(this.aIK) });
    AppMethodBeat.o(103337);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103333);
    super.i(paramParcel);
    this.hcT = paramParcel.readInt();
    this.url = paramParcel.readString();
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.width = paramParcel.readFloat();
    this.height = paramParcel.readFloat();
    this.hcU = paramParcel.readInt();
    this.hcV = paramParcel.readInt();
    this.aIJ = paramParcel.readInt();
    this.aIK = paramParcel.readInt();
    AppMethodBeat.o(103333);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103334);
    super.j(paramJSONObject);
    try
    {
      paramJSONObject = paramJSONObject.optJSONArray("data");
      this.hcT = paramJSONObject.length();
      this.url = paramJSONObject.optString(0);
      this.x = g.d(paramJSONObject, 1);
      this.y = g.d(paramJSONObject, 2);
      this.width = g.d(paramJSONObject, 3);
      this.height = g.d(paramJSONObject, 4);
      this.hcU = paramJSONObject.optInt(5);
      this.hcV = paramJSONObject.optInt(6);
      this.aIJ = paramJSONObject.optInt(7);
      this.aIK = paramJSONObject.optInt(8);
      AppMethodBeat.o(103334);
      return;
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        d.printErrStackTrace("DrawImageActionArg", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(103334);
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103335);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.hcT);
    paramParcel.writeString(this.url);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.width);
    paramParcel.writeFloat(this.height);
    paramParcel.writeInt(this.hcU);
    paramParcel.writeInt(this.hcV);
    paramParcel.writeInt(this.aIJ);
    paramParcel.writeInt(this.aIK);
    AppMethodBeat.o(103335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg
 * JD-Core Version:    0.6.2
 */