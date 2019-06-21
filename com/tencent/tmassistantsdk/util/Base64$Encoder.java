package com.tencent.tmassistantsdk.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

class Base64$Encoder extends Base64.Coder
{
  private static final byte[] ENCODE;
  private static final byte[] ENCODE_WEBSAFE;
  public static final int LINE_GROUPS = 19;
  private final byte[] alphabet;
  private int count;
  public final boolean do_cr;
  public final boolean do_newline;
  public final boolean do_padding;
  private final byte[] tail;
  int tailLen;

  static
  {
    AppMethodBeat.i(76216);
    if (!Base64.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      ENCODE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      ENCODE_WEBSAFE = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      AppMethodBeat.o(76216);
      return;
    }
  }

  public Base64$Encoder(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76214);
    this.output = paramArrayOfByte;
    boolean bool2;
    if ((paramInt & 0x1) == 0)
    {
      bool2 = true;
      this.do_padding = bool2;
      if ((paramInt & 0x2) != 0)
        break label116;
      bool2 = true;
      label40: this.do_newline = bool2;
      if ((paramInt & 0x4) == 0)
        break label122;
      bool2 = bool1;
      label55: this.do_cr = bool2;
      if ((paramInt & 0x8) != 0)
        break label128;
      paramArrayOfByte = ENCODE;
      label72: this.alphabet = paramArrayOfByte;
      this.tail = new byte[2];
      this.tailLen = 0;
      if (!this.do_newline)
        break label135;
    }
    label128: label135: for (paramInt = 19; ; paramInt = -1)
    {
      this.count = paramInt;
      AppMethodBeat.o(76214);
      return;
      bool2 = false;
      break;
      label116: bool2 = false;
      break label40;
      label122: bool2 = false;
      break label55;
      paramArrayOfByte = ENCODE_WEBSAFE;
      break label72;
    }
  }

  public int maxOutputSize(int paramInt)
  {
    return paramInt * 8 / 5 + 10;
  }

  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(76215);
    byte[] arrayOfByte1 = this.alphabet;
    byte[] arrayOfByte2 = this.output;
    int i = 0;
    int j = this.count;
    int k = paramInt2 + paramInt1;
    int m;
    switch (this.tailLen)
    {
    default:
      paramInt2 = -1;
      m = paramInt1;
      paramInt1 = paramInt2;
      label67: if (paramInt1 != -1)
      {
        arrayOfByte2[0] = ((byte)arrayOfByte1[(paramInt1 >> 18 & 0x3F)]);
        arrayOfByte2[1] = ((byte)arrayOfByte1[(paramInt1 >> 12 & 0x3F)]);
        arrayOfByte2[2] = ((byte)arrayOfByte1[(paramInt1 >> 6 & 0x3F)]);
        paramInt2 = 4;
        arrayOfByte2[3] = ((byte)arrayOfByte1[(paramInt1 & 0x3F)]);
        paramInt1 = j - 1;
        if (paramInt1 == 0)
        {
          paramInt1 = paramInt2;
          if (this.do_cr)
          {
            paramInt1 = 5;
            arrayOfByte2[4] = ((byte)13);
          }
          i = paramInt1 + 1;
          arrayOfByte2[paramInt1] = ((byte)10);
          paramInt2 = 19;
          paramInt1 = i;
        }
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      label176: if (m + 3 <= k)
      {
        i = (paramArrayOfByte[m] & 0xFF) << 16 | (paramArrayOfByte[(m + 1)] & 0xFF) << 8 | paramArrayOfByte[(m + 2)] & 0xFF;
        arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(i >> 18 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 1)] = ((byte)arrayOfByte1[(i >> 12 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 2)] = ((byte)arrayOfByte1[(i >> 6 & 0x3F)]);
        arrayOfByte2[(paramInt1 + 3)] = ((byte)arrayOfByte1[(i & 0x3F)]);
        m += 3;
        paramInt1 += 4;
        paramInt2--;
        if (paramInt2 != 0)
          break label1231;
        if (!this.do_cr)
          break label1228;
        paramInt2 = paramInt1 + 1;
        arrayOfByte2[paramInt1] = ((byte)13);
        paramInt1 = paramInt2;
      }
      label777: label955: label1225: label1228: 
      while (true)
      {
        i = paramInt1 + 1;
        arrayOfByte2[paramInt1] = ((byte)10);
        paramInt2 = 19;
        paramInt1 = i;
        break label176;
        paramInt2 = -1;
        m = paramInt1;
        paramInt1 = paramInt2;
        break label67;
        if (paramInt1 + 2 > k)
          break;
        m = this.tail[0];
        paramInt2 = paramInt1 + 1;
        int n = paramArrayOfByte[paramInt1];
        paramInt1 = paramArrayOfByte[paramInt2];
        this.tailLen = 0;
        paramInt1 = (m & 0xFF) << 16 | (n & 0xFF) << 8 | paramInt1 & 0xFF;
        m = paramInt2 + 1;
        break label67;
        if (paramInt1 + 1 > k)
          break;
        n = this.tail[0];
        paramInt2 = this.tail[1];
        m = paramInt1 + 1;
        paramInt1 = paramArrayOfByte[paramInt1];
        this.tailLen = 0;
        paramInt1 = (n & 0xFF) << 16 | (paramInt2 & 0xFF) << 8 | paramInt1 & 0xFF;
        break label67;
        if (paramBoolean)
        {
          if (m - this.tailLen == k - 1)
          {
            i = 0;
            if (this.tailLen > 0)
            {
              paramArrayOfByte = this.tail;
              i = 1;
              j = paramArrayOfByte[0];
            }
            while (true)
            {
              j = (j & 0xFF) << 4;
              this.tailLen -= i;
              n = paramInt1 + 1;
              arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(j >> 6 & 0x3F)]);
              i = n + 1;
              arrayOfByte2[n] = ((byte)arrayOfByte1[(j & 0x3F)]);
              paramInt1 = i;
              if (this.do_padding)
              {
                j = i + 1;
                arrayOfByte2[i] = ((byte)61);
                paramInt1 = j + 1;
                arrayOfByte2[j] = ((byte)61);
              }
              i = paramInt1;
              if (this.do_newline)
              {
                i = paramInt1;
                if (this.do_cr)
                {
                  arrayOfByte2[paramInt1] = ((byte)13);
                  i = paramInt1 + 1;
                }
                arrayOfByte2[i] = ((byte)10);
                i++;
              }
              j = m;
              if (($assertionsDisabled) || (this.tailLen == 0))
                break;
              paramArrayOfByte = new AssertionError();
              AppMethodBeat.o(76215);
              throw paramArrayOfByte;
              n = m + 1;
              j = paramArrayOfByte[m];
              m = n;
            }
          }
          if (m - this.tailLen == k - 2)
          {
            i = 0;
            if (this.tailLen > 1)
            {
              j = this.tail[0];
              i = 1;
              label758: if (this.tailLen <= 0)
                break label955;
              n = this.tail[i];
              i++;
              j = (n & 0xFF) << 2 | (j & 0xFF) << 10;
              this.tailLen -= i;
              n = paramInt1 + 1;
              arrayOfByte2[paramInt1] = ((byte)arrayOfByte1[(j >> 12 & 0x3F)]);
              i = n + 1;
              arrayOfByte2[n] = ((byte)arrayOfByte1[(j >> 6 & 0x3F)]);
              paramInt1 = i + 1;
              arrayOfByte2[i] = ((byte)arrayOfByte1[(j & 0x3F)]);
              if (!this.do_padding)
                break label1225;
              i = paramInt1 + 1;
              arrayOfByte2[paramInt1] = ((byte)61);
              paramInt1 = i;
            }
          }
        }
        while (true)
        {
          i = paramInt1;
          if (this.do_newline)
          {
            i = paramInt1;
            if (this.do_cr)
            {
              arrayOfByte2[paramInt1] = ((byte)13);
              i = paramInt1 + 1;
            }
            arrayOfByte2[i] = ((byte)10);
            i++;
          }
          j = m;
          break;
          j = paramArrayOfByte[m];
          m++;
          break label758;
          n = paramArrayOfByte[m];
          m++;
          break label777;
          j = m;
          i = paramInt1;
          if (!this.do_newline)
            break;
          j = m;
          i = paramInt1;
          if (paramInt1 <= 0)
            break;
          j = m;
          i = paramInt1;
          if (paramInt2 == 19)
            break;
          if (this.do_cr)
          {
            i = paramInt1 + 1;
            arrayOfByte2[paramInt1] = ((byte)13);
            paramInt1 = i;
          }
          while (true)
          {
            i = paramInt1 + 1;
            arrayOfByte2[paramInt1] = ((byte)10);
            j = m;
            break;
            n = i;
            if (!$assertionsDisabled)
            {
              n = i;
              if (j != k)
              {
                paramArrayOfByte = new AssertionError();
                AppMethodBeat.o(76215);
                throw paramArrayOfByte;
                if (m != k - 1)
                  break label1142;
                arrayOfByte1 = this.tail;
                i = this.tailLen;
                this.tailLen = (i + 1);
                arrayOfByte1[i] = ((byte)paramArrayOfByte[m]);
                n = paramInt1;
              }
            }
            while (true)
            {
              this.op = n;
              this.count = paramInt2;
              AppMethodBeat.o(76215);
              return true;
              label1142: n = paramInt1;
              if (m == k - 2)
              {
                arrayOfByte1 = this.tail;
                i = this.tailLen;
                this.tailLen = (i + 1);
                arrayOfByte1[i] = ((byte)paramArrayOfByte[m]);
                arrayOfByte1 = this.tail;
                i = this.tailLen;
                this.tailLen = (i + 1);
                arrayOfByte1[i] = ((byte)paramArrayOfByte[(m + 1)]);
                n = paramInt1;
              }
            }
          }
        }
      }
      label1231: continue;
      paramInt2 = paramInt1;
      paramInt1 = 4;
      continue;
      paramInt2 = j;
      paramInt1 = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.Base64.Encoder
 * JD-Core Version:    0.6.2
 */