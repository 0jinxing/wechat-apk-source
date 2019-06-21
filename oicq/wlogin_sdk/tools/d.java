package oicq.wlogin_sdk.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Random;

public final class d
{
  public static byte[] a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96557);
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramInt);
    paramArrayOfByte1 = new a();
    int i = arrayOfByte.length;
    paramArrayOfByte1.plain = new byte[8];
    paramArrayOfByte1.prePlain = new byte[8];
    paramArrayOfByte1.pos = 1;
    paramArrayOfByte1.padding = 0;
    paramArrayOfByte1.preCrypt = 0;
    paramArrayOfByte1.crypt = 0;
    paramArrayOfByte1.key = paramArrayOfByte2;
    paramArrayOfByte1.header = true;
    paramArrayOfByte1.pos = ((i + 10) % 8);
    if (paramArrayOfByte1.pos != 0)
      paramArrayOfByte1.pos = (8 - paramArrayOfByte1.pos);
    paramArrayOfByte1.out = new byte[paramArrayOfByte1.pos + i + 10];
    paramArrayOfByte1.plain[0] = ((byte)(byte)(paramArrayOfByte1.random.nextInt() & 0xF8 | paramArrayOfByte1.pos));
    paramInt = 1;
    if (paramInt > paramArrayOfByte1.pos)
    {
      paramArrayOfByte1.pos += 1;
      paramInt = 0;
      label167: if (paramInt < 8)
        break label244;
      paramArrayOfByte1.padding = 1;
    }
    while (true)
    {
      if (paramArrayOfByte1.padding > 2)
      {
        paramInt = 0;
        if (i > 0)
          break label326;
        paramArrayOfByte1.padding = 1;
        label198: if (paramArrayOfByte1.padding <= 7)
          break label389;
        paramArrayOfByte1 = paramArrayOfByte1.out;
        AppMethodBeat.o(96557);
        return paramArrayOfByte1;
        paramArrayOfByte1.plain[paramInt] = ((byte)(byte)(paramArrayOfByte1.random.nextInt() & 0xFF));
        paramInt++;
        break;
        label244: paramArrayOfByte1.prePlain[paramInt] = ((byte)0);
        paramInt++;
        break label167;
      }
      if (paramArrayOfByte1.pos < 8)
      {
        paramArrayOfByte2 = paramArrayOfByte1.plain;
        paramInt = paramArrayOfByte1.pos;
        paramArrayOfByte1.pos = (paramInt + 1);
        paramArrayOfByte2[paramInt] = ((byte)(byte)(paramArrayOfByte1.random.nextInt() & 0xFF));
        paramArrayOfByte1.padding += 1;
      }
      if (paramArrayOfByte1.pos == 8)
        paramArrayOfByte1.encrypt8Bytes();
    }
    label326: if (paramArrayOfByte1.pos < 8)
    {
      paramArrayOfByte2 = paramArrayOfByte1.plain;
      int j = paramArrayOfByte1.pos;
      paramArrayOfByte1.pos = (j + 1);
      int k = paramInt + 1;
      paramArrayOfByte2[j] = ((byte)arrayOfByte[paramInt]);
      i--;
      paramInt = k;
    }
    while (true)
    {
      if (paramArrayOfByte1.pos == 8)
        paramArrayOfByte1.encrypt8Bytes();
      break;
      label389: if (paramArrayOfByte1.pos < 8)
      {
        paramArrayOfByte2 = paramArrayOfByte1.plain;
        paramInt = paramArrayOfByte1.pos;
        paramArrayOfByte1.pos = (paramInt + 1);
        paramArrayOfByte2[paramInt] = ((byte)0);
        paramArrayOfByte1.padding += 1;
      }
      if (paramArrayOfByte1.pos != 8)
        break label198;
      paramArrayOfByte1.encrypt8Bytes();
      break label198;
    }
  }

  public static byte[] decrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(96558);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte1, paramInt1, arrayOfByte, 0, paramInt2);
    a locala = new a();
    int i = arrayOfByte.length;
    locala.preCrypt = 0;
    locala.crypt = 0;
    locala.key = paramArrayOfByte2;
    paramArrayOfByte1 = new byte[8];
    if ((i % 8 != 0) || (i < 16))
    {
      paramArrayOfByte1 = null;
      AppMethodBeat.o(96558);
    }
    while (true)
    {
      return paramArrayOfByte1;
      locala.prePlain = locala.am(arrayOfByte);
      locala.pos = (locala.prePlain[0] & 0x7);
      paramInt2 = i - locala.pos - 10;
      if (paramInt2 >= 0)
        break;
      paramArrayOfByte1 = null;
      AppMethodBeat.o(96558);
    }
    paramInt1 = 0;
    label135: if (paramInt1 >= 8)
    {
      locala.out = new byte[paramInt2];
      locala.preCrypt = 0;
      locala.crypt = 8;
      locala.contextStart = 8;
      locala.pos += 1;
      locala.padding = 1;
    }
    while (true)
    {
      if (locala.padding > 2)
      {
        paramInt1 = 0;
        label198: if (paramInt2 != 0)
          break label309;
        locala.padding = 1;
        label208: if (locala.padding < 8)
          break label418;
        paramArrayOfByte1 = locala.out;
        AppMethodBeat.o(96558);
        break;
        paramArrayOfByte1[paramInt1] = ((byte)0);
        paramInt1++;
        break label135;
      }
      if (locala.pos < 8)
      {
        locala.pos += 1;
        locala.padding += 1;
      }
      if (locala.pos == 8)
      {
        if (!locala.F(arrayOfByte, i))
        {
          paramArrayOfByte1 = null;
          AppMethodBeat.o(96558);
          break;
          label309: if (locala.pos < 8)
          {
            locala.out[paramInt1] = ((byte)(byte)(paramArrayOfByte1[(locala.preCrypt + 0 + locala.pos)] ^ locala.prePlain[locala.pos]));
            paramInt1++;
            locala.pos += 1;
            paramInt2--;
          }
          while (true)
          {
            if (locala.pos == 8)
            {
              locala.preCrypt = (locala.crypt - 8);
              if (!locala.F(arrayOfByte, i))
              {
                paramArrayOfByte1 = null;
                AppMethodBeat.o(96558);
                break;
                label418: if (locala.pos < 8)
                {
                  if ((paramArrayOfByte1[(locala.preCrypt + 0 + locala.pos)] ^ locala.prePlain[locala.pos]) != 0)
                  {
                    paramArrayOfByte1 = null;
                    AppMethodBeat.o(96558);
                    break;
                  }
                  locala.pos += 1;
                }
                if (locala.pos == 8)
                {
                  locala.preCrypt = locala.crypt;
                  if (!locala.F(arrayOfByte, i))
                  {
                    paramArrayOfByte1 = null;
                    AppMethodBeat.o(96558);
                    break;
                  }
                  paramArrayOfByte1 = arrayOfByte;
                }
                locala.padding += 1;
                break label208;
              }
              paramArrayOfByte1 = arrayOfByte;
              break label198;
            }
            break label198;
          }
        }
        paramArrayOfByte1 = arrayOfByte;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.tools.d
 * JD-Core Version:    0.6.2
 */