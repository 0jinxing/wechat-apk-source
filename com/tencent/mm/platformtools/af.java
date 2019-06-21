package com.tencent.mm.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

public final class af
{
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

  public af()
  {
    AppMethodBeat.i(79042);
    this.header = true;
    this.random = new Random();
    AppMethodBeat.o(79042);
  }

  private static long A(byte[] paramArrayOfByte, int paramInt)
  {
    long l = 0L;
    for (int i = paramInt; i < paramInt + 4; i++)
      l = l << 8 | paramArrayOfByte[i] & 0xFF;
    return l & 0xFFFFFFFF;
  }

  private byte[] encipher(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79044);
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
      paramArrayOfByte = new java/io/ByteArrayOutputStream;
      paramArrayOfByte.<init>(8);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localDataOutputStream.<init>(paramArrayOfByte);
      localDataOutputStream.writeInt((int)l1);
      localDataOutputStream.writeInt((int)l2);
      localDataOutputStream.close();
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      AppMethodBeat.o(79044);
      return paramArrayOfByte;
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(79044);
      }
    }
  }

  private void encrypt8Bytes()
  {
    AppMethodBeat.i(79045);
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
    AppMethodBeat.o(79045);
  }

  public final byte[] a(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(79043);
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
        AppMethodBeat.o(79043);
        return paramArrayOfByte1;
      }
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.af
 * JD-Core Version:    0.6.2
 */