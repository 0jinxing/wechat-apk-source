package com.tencent.map.lib.mapstructure;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hl;

public class MapRouteSectionWithName
{
  public static final int kMaxRoadNameLength = 128;
  public int color;
  public int endNum;
  public String roadName;
  public int startNum;

  public static int byteLength()
  {
    return 140;
  }

  public byte[] toBytes()
  {
    AppMethodBeat.i(98163);
    byte[] arrayOfByte1 = new byte[byteLength()];
    System.arraycopy(hl.a(this.startNum), 0, arrayOfByte1, 0, 4);
    System.arraycopy(hl.a(this.endNum), 0, arrayOfByte1, 4, 4);
    System.arraycopy(hl.a(this.color), 0, arrayOfByte1, 8, 4);
    byte[] arrayOfByte2 = hl.a(this.roadName);
    if (arrayOfByte2.length < 128)
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 12, arrayOfByte2.length);
    while (true)
    {
      AppMethodBeat.o(98163);
      return arrayOfByte1;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 12, 128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.mapstructure.MapRouteSectionWithName
 * JD-Core Version:    0.6.2
 */