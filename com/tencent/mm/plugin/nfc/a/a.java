package com.tencent.mm.plugin.nfc.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class a
  implements Serializable
{
  private byte[] oTb;
  private transient int oTc;
  private transient int oTd;
  private transient int oTe;

  public a(String paramString)
  {
    AppMethodBeat.i(23014);
    this.oTb = com.tencent.mm.plugin.nfc.c.a.hexStringToByteArray(paramString);
    parse();
    AppMethodBeat.o(23014);
  }

  public a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23013);
    this.oTb = ((byte[])paramArrayOfByte.clone());
    parse();
    AppMethodBeat.o(23013);
  }

  private void parse()
  {
    int i = 256;
    AppMethodBeat.i(23015);
    if (this.oTb.length < 4)
    {
      localIllegalArgumentException = new IllegalArgumentException("apdu must be at least 4 bytes long");
      AppMethodBeat.o(23015);
      throw localIllegalArgumentException;
    }
    if (this.oTb.length == 4)
      AppMethodBeat.o(23015);
    int j;
    int k;
    while (true)
    {
      return;
      j = this.oTb[4] & 0xFF;
      if (this.oTb.length == 5)
      {
        if (j == 0);
        while (true)
        {
          this.oTd = i;
          AppMethodBeat.o(23015);
          break;
          i = j;
        }
      }
      if (j != 0)
      {
        if (this.oTb.length == j + 5)
        {
          this.oTc = j;
          this.oTe = 5;
          AppMethodBeat.o(23015);
        }
        else
        {
          if (this.oTb.length == j + 6)
          {
            this.oTc = j;
            this.oTe = 5;
            j = this.oTb[(this.oTb.length - 1)] & 0xFF;
            if (j == 0);
            while (true)
            {
              this.oTd = i;
              AppMethodBeat.o(23015);
              break;
              i = j;
            }
          }
          localIllegalArgumentException = new IllegalArgumentException("Invalid APDU: length=" + this.oTb.length + ", b1=" + j);
          AppMethodBeat.o(23015);
          throw localIllegalArgumentException;
        }
      }
      else
      {
        if (this.oTb.length < 7)
        {
          localIllegalArgumentException = new IllegalArgumentException("Invalid APDU: length=" + this.oTb.length + ", b1=" + j);
          AppMethodBeat.o(23015);
          throw localIllegalArgumentException;
        }
        k = (this.oTb[5] & 0xFF) << 8 | this.oTb[6] & 0xFF;
        if (this.oTb.length == 7)
        {
          i = k;
          if (k == 0)
            i = 65536;
          this.oTd = i;
          AppMethodBeat.o(23015);
        }
        else
        {
          if (k == 0)
          {
            localIllegalArgumentException = new IllegalArgumentException("Invalid APDU: length=" + this.oTb.length + ", b1=" + j + ", b2||b3=" + k);
            AppMethodBeat.o(23015);
            throw localIllegalArgumentException;
          }
          if (this.oTb.length == k + 7)
          {
            this.oTc = k;
            this.oTe = 7;
            AppMethodBeat.o(23015);
          }
          else
          {
            if (this.oTb.length != k + 9)
              break;
            this.oTc = k;
            this.oTe = 7;
            j = this.oTb.length - 2;
            i = this.oTb[j];
            j = this.oTb[(j + 1)] & 0xFF | (i & 0xFF) << 8;
            i = j;
            if (j == 0)
              i = 65536;
            this.oTd = i;
            AppMethodBeat.o(23015);
          }
        }
      }
    }
    IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid APDU: length=" + this.oTb.length + ", b1=" + j + ", b2||b3=" + k);
    AppMethodBeat.o(23015);
    throw localIllegalArgumentException;
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    AppMethodBeat.i(23020);
    this.oTb = ((byte[])paramObjectInputStream.readUnshared());
    parse();
    AppMethodBeat.o(23020);
  }

  public final void Ag(int paramInt)
  {
    this.oTd = paramInt;
    this.oTb[(this.oTb.length - 1)] = ((byte)(byte)paramInt);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(23018);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(23018);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof a))
      {
        bool = false;
        AppMethodBeat.o(23018);
      }
      else
      {
        paramObject = (a)paramObject;
        bool = Arrays.equals(this.oTb, paramObject.oTb);
        AppMethodBeat.o(23018);
      }
    }
  }

  public final byte[] getBytes()
  {
    AppMethodBeat.i(23016);
    byte[] arrayOfByte = (byte[])this.oTb.clone();
    AppMethodBeat.o(23016);
    return arrayOfByte;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(23019);
    int i = Arrays.hashCode(this.oTb);
    AppMethodBeat.o(23019);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(23017);
    String str = com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(this.oTb);
    AppMethodBeat.o(23017);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.a.a
 * JD-Core Version:    0.6.2
 */