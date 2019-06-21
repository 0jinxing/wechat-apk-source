package com.tencent.tencentmap.mapsdk.maps.a;

import java.util.ArrayList;

public abstract class ey
  implements Cloneable
{
  ArrayList<Object> a = null;

  public ey a()
  {
    ey localey;
    try
    {
      localey = (ey)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList1 = this.a;
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        localey.a = localArrayList2;
        int i = localArrayList1.size();
        for (int j = 0; j < i; j++)
          localey.a.add(localArrayList1.get(j));
      }
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
    return localey;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ey
 * JD-Core Version:    0.6.2
 */