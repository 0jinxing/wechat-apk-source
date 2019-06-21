package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class LoadStickerItemManager3D$2
  implements Comparator<String>
{
  private int getFrameIndex(String paramString)
  {
    AppMethodBeat.i(81822);
    int i = Integer.parseInt(paramString.substring(paramString.lastIndexOf('_') + 1, paramString.lastIndexOf('.')));
    AppMethodBeat.o(81822);
    return i;
  }

  private String getImageName(String paramString)
  {
    AppMethodBeat.i(81821);
    paramString = paramString.substring(0, paramString.lastIndexOf('_'));
    AppMethodBeat.o(81821);
    return paramString;
  }

  public final int compare(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81820);
    try
    {
      String str1 = getImageName(paramString1);
      String str2 = getImageName(paramString2);
      if (str1.equals(str2))
      {
        int i = getFrameIndex(paramString1);
        j = getFrameIndex(paramString2);
        j = i - j;
        AppMethodBeat.o(81820);
      }
      while (true)
      {
        return j;
        j = str1.compareTo(str2);
        AppMethodBeat.o(81820);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        int j = 0;
        AppMethodBeat.o(81820);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadStickerItemManager3D.2
 * JD-Core Version:    0.6.2
 */