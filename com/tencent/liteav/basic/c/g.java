package com.tencent.liteav.basic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;

public class g
{
  public static final byte[] a;

  static
  {
    AppMethodBeat.i(66097);
    a = "#PART#".getBytes();
    AppMethodBeat.o(66097);
  }

  public static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(66095);
    paramArrayOfByte2 = new PKCS8EncodedKeySpec(paramArrayOfByte2);
    PrivateKey localPrivateKey = KeyFactory.getInstance("RSA").generatePrivate(paramArrayOfByte2);
    paramArrayOfByte2 = Cipher.getInstance("RSA/None/PKCS1Padding");
    paramArrayOfByte2.init(2, localPrivateKey);
    paramArrayOfByte1 = paramArrayOfByte2.doFinal(paramArrayOfByte1);
    AppMethodBeat.o(66095);
    return paramArrayOfByte1;
  }

  public static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(66096);
    int i = a.length;
    if (i <= 0)
    {
      paramArrayOfByte1 = a(paramArrayOfByte1, paramArrayOfByte2);
      AppMethodBeat.o(66096);
      return paramArrayOfByte1;
    }
    int j = paramArrayOfByte1.length;
    ArrayList localArrayList = new ArrayList(1024);
    int k = 0;
    int m = 0;
    label48: int n;
    byte[] arrayOfByte;
    int i1;
    int i2;
    if (k < j)
    {
      n = paramArrayOfByte1[k];
      if (k == j - 1)
      {
        arrayOfByte = new byte[j - m];
        System.arraycopy(paramArrayOfByte1, m, arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte = a(arrayOfByte, paramArrayOfByte2);
        m = arrayOfByte.length;
        for (n = 0; n < m; n++)
          localArrayList.add(Byte.valueOf(arrayOfByte[n]));
        i1 = k + i;
        i2 = i1 - 1;
        n = 0;
      }
    }
    while (true)
    {
      if (n != 0)
      {
        arrayOfByte = new byte[i2 - i1];
        System.arraycopy(paramArrayOfByte1, i1, arrayOfByte, 0, arrayOfByte.length);
        arrayOfByte = a(arrayOfByte, paramArrayOfByte2);
        k = arrayOfByte.length;
        n = 0;
        while (true)
          if (n < k)
          {
            localArrayList.add(Byte.valueOf(arrayOfByte[n]));
            n++;
            continue;
            if (n != a[0])
              break label417;
            if (i > 1)
            {
              if (k + i >= j)
                break label417;
              int i3 = 1;
              int i4 = 0;
              while (true)
              {
                n = i4;
                i2 = k;
                i1 = m;
                if (i3 >= i)
                  break;
                n = i4;
                i2 = k;
                i1 = m;
                if (a[i3] != paramArrayOfByte1[(k + i3)])
                  break;
                if (i3 == i - 1)
                  i4 = 1;
                i3++;
              }
            }
            n = 1;
            i2 = k;
            i1 = m;
            break;
          }
        m = i2 + i;
        n = m - 1;
      }
      while (true)
      {
        k = n + 1;
        break label48;
        paramArrayOfByte1 = new byte[localArrayList.size()];
        paramArrayOfByte2 = localArrayList.iterator();
        for (n = 0; paramArrayOfByte2.hasNext(); n++)
          paramArrayOfByte1[n] = ((Byte)paramArrayOfByte2.next()).byteValue();
        AppMethodBeat.o(66096);
        break;
        n = i2;
        m = i1;
      }
      label417: n = 0;
      i2 = k;
      i1 = m;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.c.g
 * JD-Core Version:    0.6.2
 */