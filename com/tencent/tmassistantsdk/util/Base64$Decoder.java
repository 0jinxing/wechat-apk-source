package com.tencent.tmassistantsdk.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

class Base64$Decoder extends Base64.Coder
{
  private static final int[] DECODE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int[] DECODE_WEBSAFE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int EQUALS = -2;
  private static final int SKIP = -1;
  private final int[] alphabet;
  private int state;
  private int value;

  public Base64$Decoder(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76213);
    this.output = paramArrayOfByte;
    if ((paramInt & 0x8) == 0);
    for (paramArrayOfByte = DECODE; ; paramArrayOfByte = DECODE_WEBSAFE)
    {
      this.alphabet = paramArrayOfByte;
      this.state = 0;
      this.value = 0;
      AppMethodBeat.o(76213);
      return;
    }
  }

  public int maxOutputSize(int paramInt)
  {
    return paramInt * 3 / 4 + 10;
  }

  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.state == 6)
      paramBoolean = false;
    while (true)
    {
      return paramBoolean;
      int i = paramInt2 + paramInt1;
      paramInt2 = this.state;
      int j = this.value;
      int k = 0;
      byte[] arrayOfByte = this.output;
      int[] arrayOfInt = this.alphabet;
      label46: int m = k;
      int n = j;
      if (paramInt1 < i)
      {
        m = k;
        int i1 = j;
        n = paramInt1;
        if (paramInt2 == 0)
        {
          i1 = paramInt1;
          for (paramInt1 = j; i1 + 4 <= i; paramInt1 = j)
          {
            j = arrayOfInt[(paramArrayOfByte[i1] & 0xFF)] << 18 | arrayOfInt[(paramArrayOfByte[(i1 + 1)] & 0xFF)] << 12 | arrayOfInt[(paramArrayOfByte[(i1 + 2)] & 0xFF)] << 6 | arrayOfInt[(paramArrayOfByte[(i1 + 3)] & 0xFF)];
            paramInt1 = j;
            if (j < 0)
              break;
            arrayOfByte[(k + 2)] = ((byte)(byte)j);
            arrayOfByte[(k + 1)] = ((byte)(byte)(j >> 8));
            arrayOfByte[k] = ((byte)(byte)(j >> 16));
            k += 3;
            i1 += 4;
          }
          m = k;
          n = paramInt1;
          if (i1 < i)
          {
            n = i1;
            i1 = paramInt1;
            m = k;
          }
        }
        else
        {
          paramInt1 = n + 1;
          j = arrayOfInt[(paramArrayOfByte[n] & 0xFF)];
          switch (paramInt2)
          {
          default:
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          }
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
                    do
                    {
                      k = m;
                      j = i1;
                      break;
                      if (j >= 0)
                      {
                        paramInt2++;
                        k = m;
                        break;
                      }
                    }
                    while (j == -1);
                    this.state = 6;
                    paramBoolean = false;
                    break;
                    if (j >= 0)
                    {
                      j = i1 << 6 | j;
                      paramInt2++;
                      k = m;
                      break label46;
                    }
                  }
                  while (j == -1);
                  this.state = 6;
                  paramBoolean = false;
                  break;
                  if (j >= 0)
                  {
                    j = i1 << 6 | j;
                    paramInt2++;
                    k = m;
                    break label46;
                  }
                  if (j == -2)
                  {
                    arrayOfByte[m] = ((byte)(byte)(i1 >> 4));
                    paramInt2 = 4;
                    k = m + 1;
                    j = i1;
                    break label46;
                  }
                }
                while (j == -1);
                this.state = 6;
                paramBoolean = false;
                break;
                if (j >= 0)
                {
                  j = i1 << 6 | j;
                  arrayOfByte[(m + 2)] = ((byte)(byte)j);
                  arrayOfByte[(m + 1)] = ((byte)(byte)(j >> 8));
                  arrayOfByte[m] = ((byte)(byte)(j >> 16));
                  k = m + 3;
                  paramInt2 = 0;
                  break label46;
                }
                if (j == -2)
                {
                  arrayOfByte[(m + 1)] = ((byte)(byte)(i1 >> 2));
                  arrayOfByte[m] = ((byte)(byte)(i1 >> 10));
                  k = m + 2;
                  paramInt2 = 5;
                  j = i1;
                  break label46;
                }
              }
              while (j == -1);
              this.state = 6;
              paramBoolean = false;
              break;
              if (j == -2)
              {
                paramInt2++;
                k = m;
                j = i1;
                break label46;
              }
            }
            while (j == -1);
            this.state = 6;
            paramBoolean = false;
            break;
          }
          while (j == -1);
          this.state = 6;
          paramBoolean = false;
        }
      }
      else if (!paramBoolean)
      {
        this.state = paramInt2;
        this.value = n;
        this.op = m;
        paramBoolean = true;
      }
      else
      {
        paramInt1 = m;
        switch (paramInt2)
        {
        default:
          paramInt1 = m;
        case 0:
        case 1:
        case 2:
        case 3:
          while (true)
          {
            this.state = paramInt2;
            this.op = paramInt1;
            paramBoolean = true;
            break;
            this.state = 6;
            paramBoolean = false;
            break;
            arrayOfByte[m] = ((byte)(byte)(n >> 4));
            paramInt1 = m + 1;
            continue;
            j = m + 1;
            arrayOfByte[m] = ((byte)(byte)(n >> 10));
            paramInt1 = j + 1;
            arrayOfByte[j] = ((byte)(byte)(n >> 2));
          }
        case 4:
        }
        this.state = 6;
        paramBoolean = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.Base64.Decoder
 * JD-Core Version:    0.6.2
 */