package com.tencent.mm.plugin.websearch.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Objects;

public class WidgetData$Style
  implements Parcelable
{
  public static final Parcelable.Creator<Style> CREATOR;
  public boolean cNN;
  public int height;
  public String hfo;
  public int offsetX;
  public int offsetY;
  public double ubH;
  public int ubI;
  public int width;

  static
  {
    AppMethodBeat.i(124278);
    CREATOR = new WidgetData.Style.1();
    AppMethodBeat.o(124278);
  }

  public WidgetData$Style()
  {
    this.ubH = 65.0D;
    this.cNN = true;
  }

  protected WidgetData$Style(Parcel paramParcel)
  {
    AppMethodBeat.i(124275);
    this.ubH = 65.0D;
    this.cNN = true;
    this.ubH = paramParcel.readDouble();
    this.ubI = paramParcel.readInt();
    this.offsetX = paramParcel.readInt();
    this.offsetY = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.hfo = paramParcel.readString();
    this.width = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    while (true)
    {
      this.cNN = bool;
      AppMethodBeat.o(124275);
      return;
      bool = false;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(124276);
    if (this == paramObject)
      AppMethodBeat.o(124276);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof Style))
      {
        AppMethodBeat.o(124276);
        bool = false;
      }
      else
      {
        paramObject = (Style)paramObject;
        if ((Double.compare(paramObject.ubH, this.ubH) == 0) && (this.ubI == paramObject.ubI) && (this.offsetX == paramObject.offsetX) && (this.offsetY == paramObject.offsetY) && (this.height == paramObject.height) && (this.width == paramObject.width) && (this.cNN == paramObject.cNN) && (Objects.equals(this.hfo, paramObject.hfo)))
        {
          AppMethodBeat.o(124276);
        }
        else
        {
          AppMethodBeat.o(124276);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(124277);
    int i = Objects.hash(new Object[] { Double.valueOf(this.ubH), Integer.valueOf(this.ubI), Integer.valueOf(this.offsetX), Integer.valueOf(this.offsetY), Integer.valueOf(this.height), this.hfo, Integer.valueOf(this.width), Boolean.valueOf(this.cNN) });
    AppMethodBeat.o(124277);
    return i;
  }

  public String toString()
  {
    AppMethodBeat.i(124273);
    String str = super.toString();
    AppMethodBeat.o(124273);
    return str;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(124274);
    paramParcel.writeDouble(this.ubH);
    paramParcel.writeInt(this.ubI);
    paramParcel.writeInt(this.offsetX);
    paramParcel.writeInt(this.offsetY);
    paramParcel.writeInt(this.height);
    paramParcel.writeString(this.hfo);
    paramParcel.writeInt(this.width);
    if (this.cNN)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(124274);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.WidgetData.Style
 * JD-Core Version:    0.6.2
 */