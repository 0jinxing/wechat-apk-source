package com.tencent.ttpic.baseutils;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringUtils
{
  public static String removeEmoji(String paramString)
  {
    AppMethodBeat.i(49793);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(49793);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replaceAll("\\[em\\].*?\\[/em\\]", "");
      AppMethodBeat.o(49793);
    }
  }

  public static String removeNoisyChar(String paramString)
  {
    AppMethodBeat.i(49792);
    paramString = paramString.replaceAll("[/~!@#$%^&*\\(\\)_+\\{\\}:<>?\\[\\],./;'`\\-=\\|／～！＠＃＄％＾＆＊（）＿＋｛｝：＜＞？［］，。．／；＇`－＝｜、]+", "");
    AppMethodBeat.o(49792);
    return paramString;
  }

  public static String removeUTF8Emoji(String paramString)
  {
    AppMethodBeat.i(49794);
    Object localObject = new HashSet();
    for (int i = 0; i < paramString.length(); i++)
    {
      int j = Character.getType(paramString.charAt(i));
      if ((j == 19) || (j == 28))
        ((Set)localObject).add(Character.valueOf(paramString.charAt(i)));
    }
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      paramString = paramString.replace(String.valueOf((Character)((Iterator)localObject).next()), "");
    AppMethodBeat.o(49794);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.StringUtils
 * JD-Core Version:    0.6.2
 */