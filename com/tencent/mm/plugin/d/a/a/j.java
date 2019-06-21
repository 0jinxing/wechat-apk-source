package com.tencent.mm.plugin.d.a.a;

import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class j
{
  protected byte jFt = (byte)0;
  protected byte[] jFu = null;
  protected int mLength = -1;

  public final boolean a(a parama)
  {
    boolean bool = false;
    if (parama.getSize() == 0)
      ab.w("MicroMsg.exdevice.TLVBase", "autoBuffer is null or nil");
    while (true)
    {
      return bool;
      byte[] arrayOfByte = new byte[1];
      parama.Q(arrayOfByte, 1);
      int i = arrayOfByte[0];
      if (i + 1 > parama.getSize())
      {
        ab.w("MicroMsg.exdevice.TLVBase", "lengthInt(%d) + 1 > autoBuffer.getSize()(%d)", new Object[] { Integer.valueOf(i), Integer.valueOf(parama.getSize()) });
      }
      else if (i <= 1)
      {
        ab.w("MicroMsg.exdevice.TLVBase", "length(%d) <= 1", new Object[] { Integer.valueOf(i) });
      }
      else
      {
        this.mLength = i;
        parama.Q(arrayOfByte, 1);
        this.jFt = ((byte)arrayOfByte[0]);
        this.jFu = new byte[this.mLength - 1];
        parama.Q(this.jFu, this.jFu.length);
        bool = as(this.jFu);
      }
    }
  }

  abstract boolean as(byte[] paramArrayOfByte);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.j
 * JD-Core Version:    0.6.2
 */