package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class LoadStickerItemManager$1
  implements Comparator<String>
{
  private int getFrameIndex(String paramString)
  {
    AppMethodBeat.i(81810);
    int i = Integer.parseInt(paramString.substring(paramString.lastIndexOf('_') + 1, paramString.lastIndexOf('.')));
    AppMethodBeat.o(81810);
    return i;
  }

  private String getImageName(String paramString)
  {
    AppMethodBeat.i(81809);
    paramString = paramString.substring(0, paramString.lastIndexOf('_'));
    AppMethodBeat.o(81809);
    return paramString;
  }

  public final int compare(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81808);
    try
    {
      String str1 = getImageName(paramString1);
      String str2 = getImageName(paramString2);
      if (str1.equals(str2))
      {
        int i = getFrameIndex(paramString1);
        j = getFrameIndex(paramString2);
        j = i - j;
        AppMethodBeat.o(81808);
      }
      while (true)
      {
        return j;
        j = str1.compareTo(str2);
        AppMethodBeat.o(81808);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        int j = 0;
        AppMethodBeat.o(81808);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadStickerItemManager.1
 * JD-Core Version:    0.6.2
 */