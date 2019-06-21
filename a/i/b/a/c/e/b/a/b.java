package a.i.b.a.c.e.b.a;

import a.aa;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class b
{
  private static final boolean Byl;

  static
  {
    AppMethodBeat.i(121302);
    boolean bool;
    if (!b.class.desiredAssertionStatus())
      bool = true;
    while (true)
    {
      $assertionsDisabled = bool;
      try
      {
        String str = System.getProperty("kotlin.jvm.serialization.use8to7");
        Byl = "true".equals(str);
        AppMethodBeat.o(121302);
        return;
        bool = false;
      }
      catch (SecurityException localSecurityException)
      {
        while (true)
          Object localObject = null;
      }
    }
  }

  public static byte[] af(String[] paramArrayOfString)
  {
    int i = 0;
    AppMethodBeat.i(121299);
    String[] arrayOfString1 = paramArrayOfString;
    int j;
    if (paramArrayOfString.length > 0)
    {
      arrayOfString1 = paramArrayOfString;
      if (!paramArrayOfString[0].isEmpty())
      {
        j = paramArrayOfString[0].charAt(0);
        if (j == 0)
        {
          String[] arrayOfString2 = ag(paramArrayOfString);
          j.p(arrayOfString2, "strings");
          int k = arrayOfString2.length;
          j = 0;
          int m = 0;
          while (j < k)
          {
            m += arrayOfString2[j].length();
            j++;
          }
          paramArrayOfString = new byte[m];
          int n = arrayOfString2.length;
          m = 0;
          j = 0;
          while (m < n)
          {
            arrayOfString1 = arrayOfString2[m];
            int i1 = arrayOfString1.length() - 1;
            if (i1 >= 0)
            {
              int i2 = 0;
              while (true)
              {
                k = j + 1;
                paramArrayOfString[j] = ((byte)(byte)arrayOfString1.charAt(i2));
                j = k;
                if (i2 == i1)
                  break;
                i2++;
                j = k;
              }
            }
            m++;
          }
          m = i;
          if (j == paramArrayOfString.length)
            m = 1;
          if ((aa.AUz) && (m == 0))
          {
            paramArrayOfString = (Throwable)new AssertionError("Should have reached the end");
            AppMethodBeat.o(121299);
            throw paramArrayOfString;
          }
          AppMethodBeat.o(121299);
        }
      }
    }
    while (true)
    {
      return paramArrayOfString;
      arrayOfString1 = paramArrayOfString;
      if (j == 65535)
        arrayOfString1 = ag(paramArrayOfString);
      paramArrayOfString = ah(arrayOfString1);
      cv(paramArrayOfString);
      paramArrayOfString = cw(paramArrayOfString);
      AppMethodBeat.o(121299);
    }
  }

  private static String[] ag(String[] paramArrayOfString)
  {
    AppMethodBeat.i(121300);
    paramArrayOfString = (String[])paramArrayOfString.clone();
    paramArrayOfString[0] = paramArrayOfString[0].substring(1);
    AppMethodBeat.o(121300);
    return paramArrayOfString;
  }

  private static byte[] ah(String[] paramArrayOfString)
  {
    AppMethodBeat.i(121301);
    int i = paramArrayOfString.length;
    int j = 0;
    int k = 0;
    String str;
    while (j < i)
    {
      str = paramArrayOfString[j];
      if ((!$assertionsDisabled) && (str.length() > 65535))
      {
        paramArrayOfString = new AssertionError("String is too long: " + str.length());
        AppMethodBeat.o(121301);
        throw paramArrayOfString;
      }
      k += str.length();
      j++;
    }
    byte[] arrayOfByte = new byte[k];
    int m = paramArrayOfString.length;
    k = 0;
    for (j = 0; j < m; j++)
    {
      str = paramArrayOfString[j];
      int n = str.length();
      i = 0;
      while (i < n)
      {
        arrayOfByte[k] = ((byte)(byte)str.charAt(i));
        i++;
        k++;
      }
    }
    AppMethodBeat.o(121301);
    return arrayOfByte;
  }

  private static void cv(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    while (i < j)
    {
      paramArrayOfByte[i] = ((byte)(byte)(paramArrayOfByte[i] + 127 & 0x7F));
      i++;
    }
  }

  private static byte[] cw(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length * 7 / 8;
    byte[] arrayOfByte = new byte[i];
    int j = 0;
    int k = 0;
    int m = 0;
    if (j < i)
    {
      int n = paramArrayOfByte[m];
      m++;
      arrayOfByte[j] = ((byte)(byte)(((n & 0xFF) >>> k) + ((paramArrayOfByte[m] & (1 << k + 1) - 1) << 7 - k)));
      if (k == 6)
        m++;
      for (k = 0; ; k++)
      {
        j++;
        break;
      }
    }
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.b
 * JD-Core Version:    0.6.2
 */