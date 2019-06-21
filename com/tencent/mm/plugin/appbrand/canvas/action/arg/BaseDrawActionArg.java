package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import com.tencent.mm.plugin.appbrand.canvas.d;
import org.json.JSONObject;

public abstract class BaseDrawActionArg
  implements DrawActionArg
{
  public String method;

  public BaseDrawActionArg()
  {
  }

  public BaseDrawActionArg(Parcel paramParcel)
  {
    this.method = paramParcel.readString();
  }

  @Deprecated
  public BaseDrawActionArg(Parcel paramParcel, byte paramByte)
  {
    i(paramParcel);
  }

  public boolean a(d paramd, Canvas paramCanvas)
  {
    return false;
  }

  public boolean ayg()
  {
    return false;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramObject == this)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((paramObject instanceof BaseDrawActionArg))
      {
        paramObject = (BaseDrawActionArg)paramObject;
        bool2 = bool1;
        if (this.method != paramObject.method)
          if (this.method != null)
          {
            bool2 = bool1;
            if (this.method.equals(paramObject.method));
          }
          else
          {
            bool2 = false;
          }
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public int hashCode()
  {
    return super.hashCode();
  }

  @Deprecated
  public void i(Parcel paramParcel)
  {
    this.method = paramParcel.readString();
  }

  public void j(JSONObject paramJSONObject)
  {
    this.method = paramJSONObject.optString("method");
  }

  public void reset()
  {
  }

  public String toString()
  {
    return String.format("method %s", new Object[] { this.method });
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.method);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
 * JD-Core Version:    0.6.2
 */