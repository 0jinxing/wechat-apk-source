package oicq.wlogin_sdk.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Random;

final class a
{
  int contextStart;
  int crypt;
  boolean header;
  byte[] key;
  byte[] out;
  int padding;
  byte[] plain;
  int pos;
  int preCrypt;
  byte[] prePlain;
  Random random;

  a()
  {
    AppMethodBeat.i(96513);
    this.header = true;
    this.random = new Random();
    AppMethodBeat.o(96513);
  }

  private static long A(byte[] paramArrayOfByte, int paramInt)
  {
    long l = 0L;
    for (int i = paramInt; ; i++)
    {
      if (i >= paramInt + 4)
        return l >>> 32 | 0xFFFFFFFF & l;
      l = l << 8 | paramArrayOfByte[i] & 0xFF;
    }
  }

  private byte[] encipher(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96514);
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
      while (true)
      {
        if (i <= 0)
        {
          paramArrayOfByte = new java/io/ByteArrayOutputStream;
          paramArrayOfByte.<init>(8);
          DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
          localDataOutputStream.<init>(paramArrayOfByte);
          localDataOutputStream.writeInt((int)l1);
          localDataOutputStream.writeInt((int)l2);
          localDataOutputStream.close();
          paramArrayOfByte = paramArrayOfByte.toByteArray();
          AppMethodBeat.o(96514);
          return paramArrayOfByte;
        }
        l7 = l7 + 2654435769L & 0xFFFFFFFF;
        l1 = l1 + ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l2 = l2 + ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
        i--;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(96514);
      }
    }
  }

  final boolean F(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(96517);
    this.pos = 0;
    if (this.pos >= 8)
    {
      this.prePlain = am(this.prePlain);
      if (this.prePlain != null)
        break label121;
      AppMethodBeat.o(96517);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.contextStart + this.pos >= paramInt)
      {
        AppMethodBeat.o(96517);
      }
      else
      {
        byte[] arrayOfByte = this.prePlain;
        int i = this.pos;
        arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ paramArrayOfByte[(this.crypt + 0 + this.pos)]));
        this.pos += 1;
        break;
        label121: this.contextStart += 8;
        this.crypt += 8;
        this.pos = 0;
        AppMethodBeat.o(96517);
      }
    }
  }

  final byte[] am(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96515);
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
      while (true)
      {
        if (i <= 0)
        {
          ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
          localByteArrayOutputStream.<init>(8);
          paramArrayOfByte = new java/io/DataOutputStream;
          paramArrayOfByte.<init>(localByteArrayOutputStream);
          paramArrayOfByte.writeInt((int)l1);
          paramArrayOfByte.writeInt((int)l2);
          paramArrayOfByte.close();
          paramArrayOfByte = localByteArrayOutputStream.toByteArray();
          AppMethodBeat.o(96515);
          return paramArrayOfByte;
        }
        l2 = l2 - ((l1 << 4) + l5 ^ l1 + l7 ^ (l1 >>> 5) + l6) & 0xFFFFFFFF;
        l1 = l1 - ((l2 << 4) + l3 ^ l2 + l7 ^ (l2 >>> 5) + l4) & 0xFFFFFFFF;
        l7 = l7 - 2654435769L & 0xFFFFFFFF;
        i--;
      }
    }
    catch (IOException paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(96515);
      }
    }
  }

  final void encrypt8Bytes()
  {
    AppMethodBeat.i(96516);
    this.pos = 0;
    if (this.pos >= 8)
      System.arraycopy(encipher(this.plain), 0, this.out, this.crypt, 8);
    for (this.pos = 0; ; this.pos += 1)
    {
      if (this.pos >= 8)
      {
        System.arraycopy(this.plain, 0, this.prePlain, 0, 8);
        this.preCrypt = this.crypt;
        this.crypt += 8;
        this.pos = 0;
        this.header = false;
        AppMethodBeat.o(96516);
        return;
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
      byte[] arrayOfByte = this.out;
      int i = this.crypt + this.pos;
      arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ this.prePlain[this.pos]));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.tools.a
 * JD-Core Version:    0.6.2
 */