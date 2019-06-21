package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public final class v
{
  private int contextStart;
  private int crypt;
  private boolean header;
  private byte[] key;
  private byte[] out;
  private int padding;
  private byte[] plain;
  private int pos;
  private int preCrypt;
  private byte[] prePlain;
  private Random random;

  public v()
  {
    AppMethodBeat.i(91187);
    this.header = true;
    this.random = new Random();
    AppMethodBeat.o(91187);
  }

  private static long A(byte[] paramArrayOfByte, int paramInt)
  {
    long l = 0L;
    for (int i = paramInt; i < paramInt + 4; i++)
      l = l << 8 | paramArrayOfByte[i] & 0xFF;
    return l & 0xFFFFFFFF;
  }

  private boolean F(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(91195);
    this.pos = 0;
    if (this.pos < 8)
      if (this.contextStart + this.pos >= paramInt)
        AppMethodBeat.o(91195);
    while (true)
    {
      return bool;
      byte[] arrayOfByte = this.prePlain;
      int i = this.pos;
      arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ paramArrayOfByte[(this.crypt + 0 + this.pos)]));
      this.pos += 1;
      break;
      this.prePlain = am(this.prePlain);
      if (this.prePlain == null)
      {
        AppMethodBeat.o(91195);
        bool = false;
      }
      else
      {
        this.contextStart += 8;
        this.crypt += 8;
        this.pos = 0;
        AppMethodBeat.o(91195);
      }
    }
  }

  private byte[] a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(91190);
    this.plain = new byte[8];
    this.prePlain = new byte[8];
    this.pos = 1;
    this.padding = 0;
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    this.header = true;
    this.pos = ((paramInt + 10) % 8);
    if (this.pos != 0)
      this.pos = (8 - this.pos);
    this.out = new byte[this.pos + paramInt + 10];
    this.plain[0] = ((byte)(byte)(this.random.nextInt() & 0xF8 | this.pos));
    for (int i = 1; i <= this.pos; i++)
      this.plain[i] = ((byte)(byte)(this.random.nextInt() & 0xFF));
    this.pos += 1;
    for (i = 0; i < 8; i++)
      this.prePlain[i] = ((byte)0);
    this.padding = 1;
    while (this.padding <= 2)
    {
      if (this.pos < 8)
      {
        paramArrayOfByte2 = this.plain;
        i = this.pos;
        this.pos = (i + 1);
        paramArrayOfByte2[i] = ((byte)(byte)(this.random.nextInt() & 0xFF));
        this.padding += 1;
      }
      if (this.pos == 8)
        encrypt8Bytes();
    }
    int j = 0;
    i = paramInt;
    paramInt = j;
    if (i > 0)
    {
      if (this.pos >= 8)
        break label439;
      paramArrayOfByte2 = this.plain;
      int k = this.pos;
      this.pos = (k + 1);
      j = paramInt + 1;
      paramArrayOfByte2[k] = ((byte)paramArrayOfByte1[paramInt]);
      i--;
      paramInt = j;
    }
    label439: 
    while (true)
    {
      if (this.pos == 8)
      {
        encrypt8Bytes();
        break;
        this.padding = 1;
        while (this.padding <= 7)
        {
          if (this.pos < 8)
          {
            paramArrayOfByte1 = this.plain;
            paramInt = this.pos;
            this.pos = (paramInt + 1);
            paramArrayOfByte1[paramInt] = ((byte)0);
            this.padding += 1;
          }
          if (this.pos == 8)
            encrypt8Bytes();
        }
        paramArrayOfByte1 = this.out;
        AppMethodBeat.o(91190);
        return paramArrayOfByte1;
      }
      break;
    }
  }

  private byte[] am(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(91193);
    int i = 16;
    try
    {
      long l1 = A(paramArrayOfByte, 0);
      long l2 = A(paramArrayOfByte, 4);
      long l3 = A(this.key, 0);
      long l4 = A(this.key, 4);
      long l5 = A(this.key, 8);
      long l6 = A(this.key, 12);
      long l7 = 3816266640L;
      while (i > 0)
      {
        l2 = l2 - ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
        l1 = l1 - ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l7 = l7 - 2654435769L & 0xFFFFFFFF;
        i--;
      }
      paramArrayOfByte = new java/io/ByteArrayOutputStream;
      paramArrayOfByte.<init>(8);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l1);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      AppMethodBeat.o(91193);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(91193);
      }
    }
  }

  private byte[] b(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    int i = 0;
    AppMethodBeat.i(91188);
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    paramArrayOfByte2 = new byte[8];
    if ((paramInt % 8 != 0) || (paramInt < 16))
    {
      AppMethodBeat.o(91188);
      paramArrayOfByte1 = null;
    }
    int j;
    while (true)
    {
      return paramArrayOfByte1;
      this.prePlain = am(paramArrayOfByte1);
      if (this.prePlain == null)
      {
        AppMethodBeat.o(91188);
        paramArrayOfByte1 = null;
      }
      else
      {
        this.pos = (this.prePlain[0] & 0x7);
        j = paramInt - this.pos - 10;
        if (j >= 0)
          break;
        AppMethodBeat.o(91188);
        paramArrayOfByte1 = null;
      }
    }
    for (int k = 0; k < 8; k++)
      paramArrayOfByte2[k] = ((byte)0);
    this.out = new byte[j];
    this.preCrypt = 0;
    this.crypt = 8;
    this.contextStart = 8;
    this.pos += 1;
    this.padding = 1;
    while (true)
    {
      if (this.padding <= 2)
      {
        if (this.pos < 8)
        {
          this.pos += 1;
          this.padding += 1;
        }
        if (this.pos != 8)
          continue;
        if (F(paramArrayOfByte1, paramInt))
          break label491;
        AppMethodBeat.o(91188);
        paramArrayOfByte1 = null;
        break;
      }
      k = i;
      label246: if (j != 0)
      {
        if (this.pos >= 8)
          break label488;
        this.out[k] = ((byte)(byte)(paramArrayOfByte2[(this.preCrypt + 0 + this.pos)] ^ this.prePlain[this.pos]));
        k++;
        this.pos += 1;
        j--;
      }
      label467: label488: 
      while (true)
      {
        if (this.pos == 8)
        {
          this.preCrypt = (this.crypt - 8);
          if (!F(paramArrayOfByte1, paramInt))
          {
            AppMethodBeat.o(91188);
            paramArrayOfByte1 = null;
            break;
            for (this.padding = 1; ; this.padding += 1)
            {
              if (this.padding >= 8)
                break label467;
              if (this.pos < 8)
              {
                if ((paramArrayOfByte2[(this.preCrypt + 0 + this.pos)] ^ this.prePlain[this.pos]) != 0)
                {
                  AppMethodBeat.o(91188);
                  paramArrayOfByte1 = null;
                  break;
                }
                this.pos += 1;
              }
              if (this.pos == 8)
              {
                this.preCrypt = this.crypt;
                if (!F(paramArrayOfByte1, paramInt))
                {
                  AppMethodBeat.o(91188);
                  paramArrayOfByte1 = null;
                  break;
                }
                paramArrayOfByte2 = paramArrayOfByte1;
              }
            }
            paramArrayOfByte1 = this.out;
            AppMethodBeat.o(91188);
            break;
          }
          paramArrayOfByte2 = paramArrayOfByte1;
          break label246;
        }
        break label246;
      }
      label491: paramArrayOfByte2 = paramArrayOfByte1;
    }
  }

  private byte[] encipher(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(91192);
    int i = 16;
    try
    {
      long l1 = A(paramArrayOfByte, 0);
      long l2 = A(paramArrayOfByte, 4);
      long l3 = A(this.key, 0);
      long l4 = A(this.key, 4);
      long l5 = A(this.key, 8);
      long l6 = A(this.key, 12);
      long l7 = 0L;
      while (i > 0)
      {
        l7 = l7 + 2654435769L & 0xFFFFFFFF;
        l1 = l1 + ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l2 = l2 + ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
        i--;
      }
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>(8);
      paramArrayOfByte = new java/io/DataOutputStream;
      paramArrayOfByte.<init>(localByteArrayOutputStream);
      paramArrayOfByte.writeInt((int)l1);
      paramArrayOfByte.writeInt((int)l2);
      paramArrayOfByte.close();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(91192);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(91192);
      }
    }
  }

  private void encrypt8Bytes()
  {
    AppMethodBeat.i(91194);
    this.pos = 0;
    byte[] arrayOfByte;
    int i;
    if (this.pos < 8)
    {
      if (this.header)
      {
        arrayOfByte = this.plain;
        i = this.pos;
        arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ this.prePlain[this.pos]));
      }
      while (true)
      {
        this.pos += 1;
        break;
        arrayOfByte = this.plain;
        i = this.pos;
        arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ this.out[(this.preCrypt + this.pos)]));
      }
    }
    System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
    for (this.pos = 0; this.pos < 8; this.pos += 1)
    {
      arrayOfByte = this.out;
      i = this.crypt + this.pos;
      arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ this.prePlain[this.pos]));
    }
    System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
    this.preCrypt = this.crypt;
    this.crypt += 8;
    this.pos = 0;
    this.header = false;
    AppMethodBeat.o(91194);
  }

  public final byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(91189);
    paramArrayOfByte1 = b(paramArrayOfByte1, paramArrayOfByte1.length, paramArrayOfByte2);
    AppMethodBeat.o(91189);
    return paramArrayOfByte1;
  }

  public final byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(91191);
    paramArrayOfByte1 = a(paramArrayOfByte1, paramArrayOfByte1.length, paramArrayOfByte2);
    AppMethodBeat.o(91191);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.v
 * JD-Core Version:    0.6.2
 */