package com.tencent.pb.common.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b
{
  public static <E> List<E> H(E[] paramArrayOfE)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 7; i++)
      localArrayList.add(paramArrayOfE[i]);
    return localArrayList;
  }

  public static <E> Map<E, E> I(E[] paramArrayOfE)
  {
    if (paramArrayOfE.length % 2 != 0)
      throw new IllegalArgumentException("length of map is " + paramArrayOfE.length);
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramArrayOfE.length; i += 2)
      localHashMap.put(paramArrayOfE[i], paramArrayOfE[(i + 1)]);
    return localHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.c.b
 * JD-Core Version:    0.6.2
 */