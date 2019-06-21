package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class SpellMap
{
  public static HashMap<String, String> ghK;

  static
  {
    AppMethodBeat.i(58735);
    ghK = new HashMap();
    AppMethodBeat.o(58735);
  }

  public static String r(char paramChar)
  {
    String[] arrayOfString = null;
    AppMethodBeat.i(58733);
    int i = s(paramChar);
    Object localObject;
    if (i < 65536)
    {
      localObject = String.valueOf(paramChar);
      AppMethodBeat.o(58733);
    }
    while (true)
    {
      return localObject;
      int j = i >> 16;
      i &= 255;
      if ((j < 129) || (j > 253))
        localObject = null;
      while (true)
      {
        if (localObject != null)
          break label109;
        AppMethodBeat.o(58733);
        localObject = arrayOfString;
        break;
        if ((i < 63) || (i > 254))
          localObject = null;
        else
          localObject = spellGetJni(j - 129, i - 63);
      }
      label109: arrayOfString = ((String)localObject).split(",");
      if ((arrayOfString == null) || (arrayOfString.length < 2))
      {
        AppMethodBeat.o(58733);
      }
      else
      {
        localObject = arrayOfString[0];
        AppMethodBeat.o(58733);
      }
    }
  }

  private static int s(char paramChar)
  {
    AppMethodBeat.i(58734);
    int i;
    if (paramChar <= '')
    {
      AppMethodBeat.o(58734);
      i = paramChar;
    }
    while (true)
    {
      return i;
      try
      {
        byte[] arrayOfByte = String.valueOf(paramChar).getBytes("GBK");
        if ((arrayOfByte != null) && (arrayOfByte.length <= 2) && (arrayOfByte.length > 0))
          break label67;
        AppMethodBeat.o(58734);
        i = 0;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        AppMethodBeat.o(58734);
        i = 0;
      }
      continue;
      label67: if (localUnsupportedEncodingException.length == 1)
      {
        i = localUnsupportedEncodingException[0];
        AppMethodBeat.o(58734);
      }
      else if (localUnsupportedEncodingException.length == 2)
      {
        i = (localUnsupportedEncodingException[0] + 256 << 16) + (localUnsupportedEncodingException[1] + 256);
        AppMethodBeat.o(58734);
      }
      else
      {
        AppMethodBeat.o(58734);
        i = 0;
      }
    }
  }

  public static native String spellGetJni(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.SpellMap
 * JD-Core Version:    0.6.2
 */