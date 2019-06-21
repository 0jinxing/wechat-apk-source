package com.tencent.tencentmap.mapsdk.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class db
  implements Parcelable
{
  public static final Parcelable.Creator<db> CREATOR;
  public double a;
  public double b;

  static
  {
    AppMethodBeat.i(100990);
    CREATOR = new db.1();
    AppMethodBeat.o(100990);
  }

  public db(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(100984);
    if ((-180.0D <= paramDouble2) && (paramDouble2 < 180.0D));
    for (this.b = paramDouble2; ; this.b = (((paramDouble2 - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D))
    {
      this.a = Math.max(-90.0D, Math.min(90.0D, paramDouble1));
      AppMethodBeat.o(100984);
      return;
    }
  }

  private db(Parcel paramParcel)
  {
    AppMethodBeat.i(100985);
    this.a = paramParcel.readDouble();
    this.b = paramParcel.readDouble();
    AppMethodBeat.o(100985);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(100987);
    if (this == paramObject)
      AppMethodBeat.o(100987);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof db))
      {
        AppMethodBeat.o(100987);
        bool = false;
      }
      else
      {
        paramObject = (db)paramObject;
        if ((Double.doubleToLongBits(this.a) == Double.doubleToLongBits(paramObject.a)) && (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(paramObject.b)))
        {
          AppMethodBeat.o(100987);
        }
        else
        {
          AppMethodBeat.o(100987);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(100986);
    long l = Double.doubleToLongBits(this.a);
    int i = (int)(l ^ l >>> 32);
    l = Double.doubleToLongBits(this.b);
    int j = (int)(l ^ l >>> 32);
    AppMethodBeat.o(100986);
    return (i + 31) * 31 + j;
  }

  public String toString()
  {
    AppMethodBeat.i(100988);
    String str = "lat/lng: (" + this.a + "," + this.b + ")";
    AppMethodBeat.o(100988);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(100989);
    paramParcel.writeDouble(this.a);
    paramParcel.writeDouble(this.b);
    AppMethodBeat.o(100989);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.db
 * JD-Core Version:    0.6.2
 */