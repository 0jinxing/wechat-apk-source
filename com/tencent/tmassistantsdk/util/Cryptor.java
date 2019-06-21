package com.tencent.tmassistantsdk.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public class Cryptor
{
  protected int contextStart;
  protected int crypt;
  protected boolean header;
  protected byte[] key;
  protected byte[] out;
  protected int padding;
  protected byte[] plain;
  protected int pos;
  protected int preCrypt;
  protected byte[] prePlain;
  protected Random random;

  public Cryptor()
  {
    AppMethodBeat.i(76224);
    this.header = true;
    this.random = new Random();
    AppMethodBeat.o(76224);
  }

  private byte[] decipher(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76231);
    paramArrayOfByte = decipher(paramArrayOfByte, 0);
    AppMethodBeat.o(76231);
    return paramArrayOfByte;
  }

  private byte[] decipher(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(76230);
    int i = 16;
    try
    {
      long l1 = getUnsignedInt(paramArrayOfByte, paramInt, 4);
      long l2 = getUnsignedInt(paramArrayOfByte, paramInt + 4, 4);
      long l3 = getUnsignedInt(this.key, 0, 4);
      long l4 = getUnsignedInt(this.key, 4, 4);
      long l5 = getUnsignedInt(this.key, 8, 4);
      long l6 = getUnsignedInt(this.key, 12, 4);
      long l7 = 3816266640L;
      for (paramInt = i; paramInt > 0; paramInt--)
      {
        l2 = l2 - ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
        l1 = l1 - ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l7 = l7 - 2654435769L & 0xFFFFFFFF;
      }
      paramArrayOfByte = new java/io/ByteArrayOutputStream;
      paramArrayOfByte.<init>(8);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l1);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      AppMethodBeat.o(76230);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(76230);
      }
    }
  }

  private boolean decrypt8Bytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool = true;
    AppMethodBeat.i(76233);
    this.pos = 0;
    if (this.pos < 8)
      if (this.contextStart + this.pos >= paramInt2)
        AppMethodBeat.o(76233);
    while (true)
    {
      return bool;
      byte[] arrayOfByte = this.prePlain;
      int i = this.pos;
      arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ paramArrayOfByte[(this.crypt + paramInt1 + this.pos)]));
      this.pos += 1;
      break;
      this.prePlain = decipher(this.prePlain);
      if (this.prePlain == null)
      {
        AppMethodBeat.o(76233);
        bool = false;
      }
      else
      {
        this.contextStart += 8;
        this.crypt += 8;
        this.pos = 0;
        AppMethodBeat.o(76233);
      }
    }
  }

  private byte[] encipher(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(76229);
    int i = 16;
    try
    {
      long l1 = getUnsignedInt(paramArrayOfByte, 0, 4);
      long l2 = getUnsignedInt(paramArrayOfByte, 4, 4);
      long l3 = getUnsignedInt(this.key, 0, 4);
      long l4 = getUnsignedInt(this.key, 4, 4);
      long l5 = getUnsignedInt(this.key, 8, 4);
      long l6 = getUnsignedInt(this.key, 12, 4);
      long l7 = 0L;
      while (i > 0)
      {
        l7 = l7 + 2654435769L & 0xFFFFFFFF;
        l1 = l1 + ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l2 = l2 + ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
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
      AppMethodBeat.o(76229);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(76229);
      }
    }
  }

  private void encrypt8Bytes()
  {
    AppMethodBeat.i(76232);
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
    AppMethodBeat.o(76232);
  }

  private static long getUnsignedInt(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    long l = 0L;
    if (paramInt2 > 8)
      paramInt2 = paramInt1 + 8;
    while (paramInt1 < paramInt2)
    {
      l = l << 8 | paramArrayOfByte[paramInt1] & 0xFF;
      paramInt1++;
      continue;
      paramInt2 = paramInt1 + paramInt2;
    }
    return l >>> 32 | 0xFFFFFFFF & l;
  }

  private int rand()
  {
    AppMethodBeat.i(76234);
    int i = this.random.nextInt();
    AppMethodBeat.o(76234);
    return i;
  }

  public byte[] decrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76226);
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    paramArrayOfByte2 = new byte[paramInt1 + 8];
    if ((paramInt2 % 8 != 0) || (paramInt2 < 16))
      AppMethodBeat.o(76226);
    int i;
    for (paramArrayOfByte1 = null; ; paramArrayOfByte1 = null)
    {
      return paramArrayOfByte1;
      this.prePlain = decipher(paramArrayOfByte1, paramInt1);
      this.pos = (this.prePlain[0] & 0x7);
      i = paramInt2 - this.pos - 10;
      if (i >= 0)
        break;
      AppMethodBeat.o(76226);
    }
    for (int j = paramInt1; j < paramArrayOfByte2.length; j++)
      paramArrayOfByte2[j] = ((byte)0);
    this.out = new byte[i];
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
        if (decrypt8Bytes(paramArrayOfByte1, paramInt1, paramInt2))
          break label484;
        AppMethodBeat.o(76226);
        paramArrayOfByte1 = null;
        break;
      }
      j = 0;
      label233: if (i != 0)
      {
        if (this.pos >= 8)
          break label481;
        this.out[j] = ((byte)(byte)(paramArrayOfByte2[(this.preCrypt + paramInt1 + this.pos)] ^ this.prePlain[this.pos]));
        j++;
        this.pos += 1;
        i--;
      }
      label459: label481: 
      while (true)
      {
        if (this.pos == 8)
        {
          this.preCrypt = (this.crypt - 8);
          if (!decrypt8Bytes(paramArrayOfByte1, paramInt1, paramInt2))
          {
            AppMethodBeat.o(76226);
            paramArrayOfByte1 = null;
            break;
            for (this.padding = 1; ; this.padding += 1)
            {
              if (this.padding >= 8)
                break label459;
              if (this.pos < 8)
              {
                if ((paramArrayOfByte2[(this.preCrypt + paramInt1 + this.pos)] ^ this.prePlain[this.pos]) != 0)
                {
                  AppMethodBeat.o(76226);
                  paramArrayOfByte1 = null;
                  break;
                }
                this.pos += 1;
              }
              if (this.pos == 8)
              {
                this.preCrypt = this.crypt;
                if (!decrypt8Bytes(paramArrayOfByte1, paramInt1, paramInt2))
                {
                  AppMethodBeat.o(76226);
                  paramArrayOfByte1 = null;
                  break;
                }
                paramArrayOfByte2 = paramArrayOfByte1;
              }
            }
            paramArrayOfByte1 = this.out;
            AppMethodBeat.o(76226);
            break;
          }
          paramArrayOfByte2 = paramArrayOfByte1;
          break label233;
        }
        break label233;
      }
      label484: paramArrayOfByte2 = paramArrayOfByte1;
    }
  }

  public byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76225);
    paramArrayOfByte1 = decrypt(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2);
    AppMethodBeat.o(76225);
    return paramArrayOfByte1;
  }

  public byte[] encrypt(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76228);
    this.plain = new byte[8];
    this.prePlain = new byte[8];
    this.pos = 1;
    this.padding = 0;
    this.preCrypt = 0;
    this.crypt = 0;
    this.key = paramArrayOfByte2;
    this.header = true;
    this.pos = ((paramInt2 + 10) % 8);
    if (this.pos != 0)
      this.pos = (8 - this.pos);
    this.out = new byte[this.pos + paramInt2 + 10];
    this.plain[0] = ((byte)(byte)(rand() & 0xF8 | this.pos));
    for (int i = 1; i <= this.pos; i++)
      this.plain[i] = ((byte)(byte)(rand() & 0xFF));
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
        paramArrayOfByte2[i] = ((byte)(byte)(rand() & 0xFF));
        this.padding += 1;
      }
      if (this.pos == 8)
        encrypt8Bytes();
    }
    if (paramInt2 > 0)
    {
      if (this.pos >= 8)
        break label425;
      paramArrayOfByte2 = this.plain;
      int j = this.pos;
      this.pos = (j + 1);
      i = paramInt1 + 1;
      paramArrayOfByte2[j] = ((byte)paramArrayOfByte1[paramInt1]);
      paramInt2--;
      paramInt1 = i;
    }
    label425: 
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
            paramInt1 = this.pos;
            this.pos = (paramInt1 + 1);
            paramArrayOfByte1[paramInt1] = ((byte)0);
            this.padding += 1;
          }
          if (this.pos == 8)
            encrypt8Bytes();
        }
        paramArrayOfByte1 = this.out;
        AppMethodBeat.o(76228);
        return paramArrayOfByte1;
      }
      break;
    }
  }

  public byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(76227);
    paramArrayOfByte1 = encrypt(paramArrayOfByte1, 0, paramArrayOfByte1.length, paramArrayOfByte2);
    AppMethodBeat.o(76227);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.util.Cryptor
 * JD-Core Version:    0.6.2
 */