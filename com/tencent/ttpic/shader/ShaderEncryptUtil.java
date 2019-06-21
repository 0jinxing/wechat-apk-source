package com.tencent.ttpic.shader;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ShaderEncryptUtil
{
  private static final String TAG;

  static
  {
    AppMethodBeat.i(83734);
    TAG = ShaderEncryptUtil.class.getSimpleName();
    AppMethodBeat.o(83734);
  }

  public static String decrypt(String paramString)
  {
    int i = 3;
    AppMethodBeat.i(83733);
    char[] arrayOfChar = paramString.toCharArray();
    int j = arrayOfChar.length;
    if (j < 3)
      AppMethodBeat.o(83733);
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = new StringBuilder();
      int k;
      if ((arrayOfChar[0] == 'h') && (arrayOfChar[1] == 'f') && (arrayOfChar[2] == 'e'))
      {
        for (i = 3; (i < j) && (arrayOfChar[i] != 'f'); i++)
          localStringBuilder2.append(arrayOfChar[i]);
        Integer.parseInt(localStringBuilder2.toString());
        paramString = new StringBuilder();
        i++;
        if (i < j)
        {
          for (k = -1; (k < 6) && (arrayOfChar[i] != "cdbhil".charAt(k)); k++);
          if (k == 6)
            paramString.append(arrayOfChar[i]);
          while (true)
          {
            i++;
            break;
            for (char c : getChars(Integer.parseInt(paramString.toString()) - k))
              if (c != 0)
                localStringBuilder1.append(c);
            paramString = new StringBuilder();
          }
        }
        paramString = new String(localStringBuilder1);
        AppMethodBeat.o(83733);
      }
      else if ((arrayOfChar[0] == 'm') && (arrayOfChar[1] == 'e') && (arrayOfChar[2] == 'e'))
      {
        while ((i < j) && (arrayOfChar[i] != 'x'))
        {
          localStringBuilder2.append(arrayOfChar[i]);
          i++;
        }
        int n = Integer.parseInt(localStringBuilder2.toString());
        paramString = new StringBuilder();
        ??? = 0;
        k = i + 1;
        i = ???;
        if (k < j)
        {
          if (arrayOfChar[k] == 'x')
          {
            paramString = getChars(Integer.parseInt(paramString.toString()));
            if (n - i >= 4);
            for (??? = 4; ; ??? = n - i)
              for (int i1 = 0; i1 < ???; i1++)
                localStringBuilder1.append(paramString[i1]);
            i += 4;
            paramString = new StringBuilder();
          }
          while (true)
          {
            k++;
            break;
            paramString.append(arrayOfChar[k]);
          }
        }
        paramString = new String(localStringBuilder1);
        AppMethodBeat.o(83733);
      }
      else
      {
        AppMethodBeat.o(83733);
      }
    }
  }

  private static char[] getChars(int paramInt)
  {
    char[] arrayOfChar = new char[4];
    for (int i = 0; i < 4; i++)
      arrayOfChar[i] = ((char)(char)(paramInt >>> i * 8 & 0xFF));
    return arrayOfChar;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.shader.ShaderEncryptUtil
 * JD-Core Version:    0.6.2
 */