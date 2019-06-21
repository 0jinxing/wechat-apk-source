package com.tencent.mm.plugin.nfc.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.nfc.c.a;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

public final class c
  implements Serializable
{
  public byte[] oTb;

  public c(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23021);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = new IllegalArgumentException("apdu is null");
      AppMethodBeat.o(23021);
      throw paramArrayOfByte;
    }
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    bd(paramArrayOfByte);
    this.oTb = paramArrayOfByte;
    AppMethodBeat.o(23021);
  }

  private static void bd(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(23022);
    if (paramArrayOfByte.length < 2)
    {
      paramArrayOfByte = new IllegalArgumentException("apdu must be at least 2 bytes long");
      AppMethodBeat.o(23022);
      throw paramArrayOfByte;
    }
    AppMethodBeat.o(23022);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    AppMethodBeat.i(23028);
    this.oTb = ((byte[])paramObjectInputStream.readUnshared());
    bd(this.oTb);
    AppMethodBeat.o(23028);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(23025);
    int i = this.oTb.length;
    this.oTb = Arrays.copyOf(this.oTb, this.oTb.length + paramc.oTb.length - 2);
    i -= 2;
    paramc = (byte[])paramc.oTb.clone();
    int j = paramc.length;
    int k = 0;
    while (k < j)
    {
      int m = paramc[k];
      this.oTb[i] = ((byte)m);
      k++;
      i++;
    }
    AppMethodBeat.o(23025);
  }

  public final short bVw()
  {
    return (short)(this.oTb[(this.oTb.length - 2)] & 0xFF);
  }

  public final short bVx()
  {
    return (short)(this.oTb[(this.oTb.length - 1)] & 0xFF);
  }

  public final boolean bVy()
  {
    AppMethodBeat.i(23023);
    boolean bool;
    if ((short)(bVw() << 8 | bVx()) == -28672)
    {
      bool = true;
      AppMethodBeat.o(23023);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23023);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(23026);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(23026);
    }
    while (true)
    {
      return bool;
      if (!(paramObject instanceof c))
      {
        bool = false;
        AppMethodBeat.o(23026);
      }
      else
      {
        paramObject = (c)paramObject;
        bool = Arrays.equals(this.oTb, paramObject.oTb);
        AppMethodBeat.o(23026);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(23027);
    int i = Arrays.hashCode(this.oTb);
    AppMethodBeat.o(23027);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(23024);
    String str = a.byteArrayToHexString(this.oTb);
    AppMethodBeat.o(23024);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc.a.c
 * JD-Core Version:    0.6.2
 */