package com.tencent.map.lib.mapstructure;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hl;

public class TappedElement
{
  private static final int BUILDING_ID_LENGTH = 128;
  private static final int BUILDING_NAME_LENGTH = 68;
  private static final int FLOOR_NAME_LENGTH = 32;
  public static final int TYPE_ANNO = 1;
  public static final int TYPE_ANNO_INDOOR_MAP = 1;
  public static final int TYPE_BLOCKROUTE_ANNO = 7;
  public static final int TYPE_COMPASS = 3;
  public static final int TYPE_INDOORMAP_AREA = 8;
  public static final int TYPE_LINE = 5;
  public static final int TYPE_LOCATION_MARKER = 6;
  public static final int TYPE_NONE = 0;
  public String buildingId;
  public String buildingName;
  public String floorName;
  public long itemId;
  public int itemType;
  public String name;
  public int nameLen;
  public int pixelX;
  public int pixelY;
  public int type;

  public static TappedElement fromBytes(byte[] paramArrayOfByte)
  {
    int i = 20;
    AppMethodBeat.i(98164);
    TappedElement localTappedElement = new TappedElement();
    byte[] arrayOfByte1 = new byte[4];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, 4);
    localTappedElement.type = hl.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 4, arrayOfByte1, 0, 4);
    localTappedElement.pixelX = hl.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 8, arrayOfByte1, 0, 4);
    localTappedElement.pixelY = hl.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 12, arrayOfByte1, 0, 4);
    localTappedElement.itemType = hl.a(arrayOfByte1);
    System.arraycopy(paramArrayOfByte, 16, arrayOfByte1, 0, 4);
    localTappedElement.nameLen = hl.a(arrayOfByte1);
    byte[] arrayOfByte2;
    if (localTappedElement.type != 7)
    {
      arrayOfByte2 = new byte[64];
      System.arraycopy(paramArrayOfByte, 20, arrayOfByte2, 0, 64);
      i = 84;
      if (localTappedElement.type == 8)
        break label298;
    }
    label298: for (localTappedElement.name = hl.d(arrayOfByte2); ; localTappedElement.name = hl.a(arrayOfByte2, "UTF-8"))
    {
      System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, 4);
      int j = hl.a(arrayOfByte1);
      i += 4;
      System.arraycopy(paramArrayOfByte, i, arrayOfByte1, 0, 4);
      localTappedElement.itemId = (hl.a(arrayOfByte1) + (j << 32));
      i += 4;
      if (localTappedElement.itemType == 1)
      {
        arrayOfByte2 = new byte[''];
        System.arraycopy(paramArrayOfByte, i, arrayOfByte2, 0, 128);
        i += 128;
        localTappedElement.buildingId = hl.a(arrayOfByte2, "UTF-8");
        arrayOfByte2 = new byte[68];
        System.arraycopy(paramArrayOfByte, i, arrayOfByte2, 0, 68);
        localTappedElement.buildingName = hl.d(arrayOfByte2);
        arrayOfByte2 = new byte[32];
        System.arraycopy(paramArrayOfByte, i + 68, arrayOfByte2, 0, 32);
        localTappedElement.floorName = hl.a(arrayOfByte2, "UTF-8");
      }
      AppMethodBeat.o(98164);
      return localTappedElement;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.mapstructure.TappedElement
 * JD-Core Version:    0.6.2
 */