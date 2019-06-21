package com.google.b.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class j
{
  private static int a(float[] paramArrayOfFloat, int[] paramArrayOfInt, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(57322);
    Arrays.fill(paramArrayOfByte, (byte)0);
    int i = 0;
    int j = paramInt;
    paramInt = i;
    while (paramInt < 6)
    {
      paramArrayOfInt[paramInt] = ((int)Math.ceil(paramArrayOfFloat[paramInt]));
      int k = paramArrayOfInt[paramInt];
      i = j;
      if (j > k)
      {
        Arrays.fill(paramArrayOfByte, (byte)0);
        i = k;
      }
      if (i == k)
        paramArrayOfByte[paramInt] = ((byte)(byte)(paramArrayOfByte[paramInt] + 1));
      paramInt++;
      j = i;
    }
    AppMethodBeat.o(57322);
    return j;
  }

  public static String a(String paramString, l paraml, com.google.b.b paramb1, com.google.b.b paramb2)
  {
    int i = 0;
    AppMethodBeat.i(57320);
    a locala = new a();
    c localc = new c();
    m localm = new m();
    n localn = new n();
    f localf = new f();
    b localb = new b();
    h localh = new h(paramString);
    localh.bzI = paraml;
    localh.bzJ = paramb1;
    localh.bzK = paramb2;
    int j;
    if ((paramString.startsWith("[)>\03605\035")) && (paramString.endsWith("\036\004")))
    {
      localh.d('ì');
      localh.bzO = 2;
      localh.pos += 7;
      j = i;
    }
    while (localh.vy())
    {
      new g[] { locala, localc, localm, localn, localf, localb }[j].a(localh);
      if (localh.bzM >= 0)
      {
        j = localh.bzM;
        localh.bzM = -1;
        continue;
        j = i;
        if (paramString.startsWith("[)>\03606\035"))
        {
          j = i;
          if (paramString.endsWith("\036\004"))
          {
            localh.d('í');
            localh.bzO = 2;
            localh.pos += 7;
            j = i;
          }
        }
      }
    }
    int k = localh.bzL.length();
    localh.vB();
    i = localh.bzN.bzW;
    if ((k < i) && (j != 0) && (j != 5))
      localh.d('þ');
    paramString = localh.bzL;
    if (paramString.length() < i)
      paramString.append('');
    if (paramString.length() < i)
    {
      j = (paramString.length() + 1) * 149 % 253 + 1 + 129;
      if (j <= 254);
      while (true)
      {
        paramString.append((char)j);
        break;
        j -= 254;
      }
    }
    paramString = localh.bzL.toString();
    AppMethodBeat.o(57320);
    return paramString;
  }

  static int b(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(57321);
    if (paramInt1 >= paramCharSequence.length())
    {
      AppMethodBeat.o(57321);
      paramInt1 = paramInt2;
    }
    while (true)
    {
      return paramInt1;
      float[] arrayOfFloat;
      if (paramInt2 == 0)
      {
        arrayOfFloat = new float[6];
        float[] tmp38_36 = arrayOfFloat;
        tmp38_36[0] = 0.0F;
        float[] tmp42_38 = tmp38_36;
        tmp42_38[1] = 1.0F;
        float[] tmp46_42 = tmp42_38;
        tmp46_42[2] = 1.0F;
        float[] tmp50_46 = tmp46_42;
        tmp50_46[3] = 1.0F;
        float[] tmp54_50 = tmp50_46;
        tmp54_50[4] = 1.0F;
        float[] tmp58_54 = tmp54_50;
        tmp58_54[5] = 1.25F;
        tmp58_54;
        label64: paramInt2 = 0;
      }
      label66: int[] arrayOfInt;
      char c;
      int j;
      label294: label331: label346: label383: 
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                if (paramInt1 + paramInt2 == paramCharSequence.length())
                {
                  paramCharSequence = new byte[6];
                  arrayOfInt = new int[6];
                  paramInt2 = a(arrayOfFloat, arrayOfInt, 2147483647, paramCharSequence);
                  paramInt1 = s(paramCharSequence);
                  if (arrayOfInt[0] == paramInt2)
                  {
                    AppMethodBeat.o(57321);
                    paramInt1 = i;
                    break;
                    arrayOfFloat = new float[6];
                    tmp131_129 = arrayOfFloat;
                    tmp131_129[0] = 1.0F;
                    tmp135_131 = tmp131_129;
                    tmp135_131[1] = 2.0F;
                    tmp139_135 = tmp135_131;
                    tmp139_135[2] = 2.0F;
                    tmp143_139 = tmp139_135;
                    tmp143_139[3] = 2.0F;
                    tmp147_143 = tmp143_139;
                    tmp147_143[4] = 2.0F;
                    tmp151_147 = tmp147_143;
                    tmp151_147[5] = 2.25F;
                    tmp151_147;
                    arrayOfFloat[paramInt2] = 0.0F;
                    break label64;
                  }
                  if ((paramInt1 == 1) && (paramCharSequence[5] > 0))
                  {
                    paramInt1 = 5;
                    AppMethodBeat.o(57321);
                    break;
                  }
                  if ((paramInt1 == 1) && (paramCharSequence[4] > 0))
                  {
                    AppMethodBeat.o(57321);
                    paramInt1 = 4;
                    break;
                  }
                  if ((paramInt1 == 1) && (paramCharSequence[2] > 0))
                  {
                    paramInt1 = 2;
                    AppMethodBeat.o(57321);
                    break;
                  }
                  if ((paramInt1 == 1) && (paramCharSequence[3] > 0))
                  {
                    AppMethodBeat.o(57321);
                    paramInt1 = 3;
                    break;
                  }
                  AppMethodBeat.o(57321);
                  paramInt1 = 1;
                  break;
                }
                c = paramCharSequence.charAt(paramInt1 + paramInt2);
                j = paramInt2 + 1;
                if (isDigit(c))
                {
                  arrayOfFloat[0] += 0.5F;
                  if ((c != ' ') && ((c < '0') || (c > '9')) && ((c < 'A') || (c > 'Z')))
                    break label622;
                  paramInt2 = 1;
                  if (paramInt2 == 0)
                    break label627;
                  arrayOfFloat[1] += 0.6666667F;
                  if ((c != ' ') && ((c < '0') || (c > '9')) && ((c < 'a') || (c > 'z')))
                    break label663;
                  paramInt2 = 1;
                  if (paramInt2 == 0)
                    break label668;
                  arrayOfFloat[2] += 0.6666667F;
                  if (!f(c))
                    break label704;
                  arrayOfFloat[3] += 0.6666667F;
                  if ((c < ' ') || (c > '^'))
                    break label740;
                  paramInt2 = 1;
                  if (paramInt2 == 0)
                    break label745;
                  arrayOfFloat[4] += 0.75F;
                }
                byte[] arrayOfByte;
                while (true)
                {
                  arrayOfFloat[5] += 1.0F;
                  paramInt2 = j;
                  if (j < 4)
                    break label66;
                  arrayOfInt = new int[6];
                  arrayOfByte = new byte[6];
                  a(arrayOfFloat, arrayOfInt, 2147483647, arrayOfByte);
                  paramInt2 = s(arrayOfByte);
                  if ((arrayOfInt[0] >= arrayOfInt[5]) || (arrayOfInt[0] >= arrayOfInt[1]) || (arrayOfInt[0] >= arrayOfInt[2]) || (arrayOfInt[0] >= arrayOfInt[3]) || (arrayOfInt[0] >= arrayOfInt[4]))
                    break label781;
                  AppMethodBeat.o(57321);
                  paramInt1 = i;
                  break;
                  if (e(c))
                  {
                    arrayOfFloat[0] = ((float)Math.ceil(arrayOfFloat[0]));
                    arrayOfFloat[0] += 2.0F;
                    break label294;
                  }
                  arrayOfFloat[0] = ((float)Math.ceil(arrayOfFloat[0]));
                  arrayOfFloat[0] += 1.0F;
                  break label294;
                  paramInt2 = 0;
                  break label331;
                  if (e(c))
                  {
                    arrayOfFloat[1] += 2.666667F;
                    break label346;
                  }
                  arrayOfFloat[1] += 1.333333F;
                  break label346;
                  paramInt2 = 0;
                  break label383;
                  if (e(c))
                  {
                    arrayOfFloat[2] += 2.666667F;
                    break label398;
                  }
                  arrayOfFloat[2] += 1.333333F;
                  break label398;
                  if (e(c))
                  {
                    arrayOfFloat[3] += 4.333334F;
                    break label417;
                  }
                  arrayOfFloat[3] += 3.333333F;
                  break label417;
                  paramInt2 = 0;
                  break label433;
                  if (e(c))
                    arrayOfFloat[4] += 4.25F;
                  else
                    arrayOfFloat[4] += 3.25F;
                }
                if ((arrayOfInt[5] < arrayOfInt[0]) || (arrayOfByte[1] + arrayOfByte[2] + arrayOfByte[3] + arrayOfByte[4] == 0))
                {
                  paramInt1 = 5;
                  AppMethodBeat.o(57321);
                  break;
                }
                if ((paramInt2 == 1) && (arrayOfByte[4] > 0))
                {
                  AppMethodBeat.o(57321);
                  paramInt1 = 4;
                  break;
                }
                if ((paramInt2 == 1) && (arrayOfByte[2] > 0))
                {
                  paramInt1 = 2;
                  AppMethodBeat.o(57321);
                  break;
                }
                if ((paramInt2 == 1) && (arrayOfByte[3] > 0))
                {
                  AppMethodBeat.o(57321);
                  paramInt1 = 3;
                  break;
                }
                paramInt2 = j;
              }
              while (arrayOfInt[1] + 1 >= arrayOfInt[0]);
              paramInt2 = j;
            }
            while (arrayOfInt[1] + 1 >= arrayOfInt[5]);
            paramInt2 = j;
          }
          while (arrayOfInt[1] + 1 >= arrayOfInt[4]);
          paramInt2 = j;
        }
        while (arrayOfInt[1] + 1 >= arrayOfInt[2]);
        if (arrayOfInt[1] < arrayOfInt[3])
        {
          AppMethodBeat.o(57321);
          paramInt1 = 1;
          break;
        }
        paramInt2 = j;
      }
      while (arrayOfInt[1] != arrayOfInt[3]);
      label398: label417: label433: label622: label627: for (paramInt1 = paramInt1 + j + 1; ; paramInt1++)
      {
        if (paramInt1 >= paramCharSequence.length())
          break label1047;
        c = paramCharSequence.charAt(paramInt1);
        if (g(c))
        {
          AppMethodBeat.o(57321);
          paramInt1 = 3;
          break;
        }
        if (!f(c))
          break label1047;
      }
      label663: label668: label704: label740: label745: AppMethodBeat.o(57321);
      label781: label1047: paramInt1 = 1;
    }
  }

  static boolean e(char paramChar)
  {
    if ((paramChar >= '') && (paramChar <= 'ÿ'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean f(char paramChar)
  {
    AppMethodBeat.i(57323);
    boolean bool;
    if ((g(paramChar)) || (paramChar == ' ') || ((paramChar >= '0') && (paramChar <= '9')) || ((paramChar >= 'A') && (paramChar <= 'Z')))
    {
      bool = true;
      AppMethodBeat.o(57323);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57323);
    }
  }

  private static boolean g(char paramChar)
  {
    if ((paramChar == '\r') || (paramChar == '*') || (paramChar == '>'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static void h(char paramChar)
  {
    AppMethodBeat.i(57324);
    Object localObject = Integer.toHexString(paramChar);
    localObject = "0000".substring(0, 4 - ((String)localObject).length()) + (String)localObject;
    localObject = new IllegalArgumentException("Illegal character: " + paramChar + " (0x" + (String)localObject + ')');
    AppMethodBeat.o(57324);
    throw ((Throwable)localObject);
  }

  static boolean isDigit(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9'));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static int s(byte[] paramArrayOfByte)
  {
    int i = 0;
    int k;
    for (int j = 0; i < 6; j = k + j)
    {
      k = paramArrayOfByte[i];
      i++;
    }
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.c.a.j
 * JD-Core Version:    0.6.2
 */