package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class PathActionArg extends BasePathActionArg
{
  public float hcR;
  public float hdt;
  public boolean hdu;
  public float radius;
  public float x;
  public float y;

  public PathActionArg()
  {
  }

  public PathActionArg(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!super.equals(paramObject))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if ((paramObject instanceof PathActionArg))
      {
        paramObject = (PathActionArg)paramObject;
        bool2 = bool1;
        if (paramObject.x == this.x)
        {
          bool2 = bool1;
          if (paramObject.y == this.y)
          {
            bool2 = bool1;
            if (paramObject.radius == this.radius)
            {
              bool2 = bool1;
              if (paramObject.hcR == this.hcR)
              {
                bool2 = bool1;
                if (paramObject.hdu == this.hdu)
                  bool2 = true;
              }
            }
          }
        }
      }
    }
  }

  public final void i(Parcel paramParcel)
  {
    boolean bool = true;
    super.i(paramParcel);
    this.x = paramParcel.readFloat();
    this.y = paramParcel.readFloat();
    this.radius = paramParcel.readFloat();
    this.hcR = paramParcel.readFloat();
    this.hdt = paramParcel.readFloat();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hdu = bool;
      return;
      bool = false;
    }
  }

  public final void j(JSONObject paramJSONObject)
  {
    super.j(paramJSONObject);
    paramJSONObject = paramJSONObject.optJSONArray("data");
    this.x = g.d(paramJSONObject, 0);
    this.y = g.d(paramJSONObject, 1);
    this.radius = g.d(paramJSONObject, 2);
    this.hcR = ((float)paramJSONObject.optDouble(3));
    this.hdt = ((float)paramJSONObject.optDouble(4));
    this.hdu = paramJSONObject.optBoolean(5);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeFloat(this.x);
    paramParcel.writeFloat(this.y);
    paramParcel.writeFloat(this.radius);
    paramParcel.writeFloat(this.hcR);
    paramParcel.writeFloat(this.hdt);
    if (this.hdu);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg
 * JD-Core Version:    0.6.2
 */