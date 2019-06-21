package com.tencent.matrix.resource.c.a;

import java.util.HashMap;
import java.util.Map;

public enum c
{
  private static Map<Integer, c> bXM;
  private int mId;
  private int mSize;

  static
  {
    int i = 0;
    bXD = new c("OBJECT", 0, 2, 0);
    bXE = new c("BOOLEAN", 1, 4, 1);
    bXF = new c("CHAR", 2, 5, 2);
    bXG = new c("FLOAT", 3, 6, 4);
    bXH = new c("DOUBLE", 4, 7, 8);
    bXI = new c("BYTE", 5, 8, 1);
    bXJ = new c("SHORT", 6, 9, 2);
    bXK = new c("INT", 7, 10, 4);
    bXL = new c("LONG", 8, 11, 8);
    bXN = new c[] { bXD, bXE, bXF, bXG, bXH, bXI, bXJ, bXK, bXL };
    bXM = new HashMap();
    c[] arrayOfc = values();
    int j = arrayOfc.length;
    while (i < j)
    {
      c localc = arrayOfc[i];
      bXM.put(Integer.valueOf(localc.mId), localc);
      i++;
    }
  }

  private c(int paramInt1, int paramInt2)
  {
    this.mId = paramInt1;
    this.mSize = paramInt2;
  }

  public static c fW(int paramInt)
  {
    return (c)bXM.get(Integer.valueOf(paramInt));
  }

  public final int getSize(int paramInt)
  {
    if (this.mSize != 0)
      paramInt = this.mSize;
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.c.a.c
 * JD-Core Version:    0.6.2
 */