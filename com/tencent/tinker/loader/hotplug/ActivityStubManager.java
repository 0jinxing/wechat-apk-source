package com.tencent.tinker.loader.hotplug;

import java.util.HashMap;
import java.util.Map;

public class ActivityStubManager
{
  private static Map<String, String> ACW = new HashMap();
  private static final int[] ACX = { 10, 3 };
  private static final int[] ACY = { 10, 3 };
  private static final int[] ACZ = { 10, 3 };
  private static final int[] ADa = { 10, 3 };
  private static final int[] ADb = { 0, 0 };
  private static final int[] ADc = { 0, 0 };
  private static final int[] ADd = { 0, 0 };
  private static final int[] ADe = { 0, 0 };

  private ActivityStubManager()
  {
    throw new UnsupportedOperationException();
  }

  public static String y(String paramString, int paramInt, boolean paramBoolean)
  {
    String str = (String)ACW.get(paramString);
    if (str != null)
    {
      paramString = str;
      return paramString;
    }
    int[] arrayOfInt1;
    int[] arrayOfInt2;
    label62: label88: int i;
    switch (paramInt)
    {
    default:
      str = ActivityStubs.ADg;
      arrayOfInt1 = ADb;
      arrayOfInt2 = ACX;
      if (paramBoolean)
      {
        str = str + "_T";
        paramInt = 1;
        i = arrayOfInt1[paramInt];
        arrayOfInt1[paramInt] = (i + 1);
        if (i < arrayOfInt2[paramInt])
          break label206;
        arrayOfInt1[paramInt] = 0;
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    label206: for (paramInt = 0; ; paramInt = i)
    {
      str = String.format(str, new Object[] { Integer.valueOf(paramInt) });
      ACW.put(paramString, str);
      paramString = str;
      break;
      str = ActivityStubs.ADh;
      arrayOfInt1 = ADc;
      arrayOfInt2 = ACY;
      break label62;
      str = ActivityStubs.ADi;
      arrayOfInt1 = ADd;
      arrayOfInt2 = ACZ;
      break label62;
      str = ActivityStubs.ADj;
      arrayOfInt1 = ADe;
      arrayOfInt2 = ADa;
      break label62;
      paramInt = 0;
      break label88;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.hotplug.ActivityStubManager
 * JD-Core Version:    0.6.2
 */