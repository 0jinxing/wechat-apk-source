package com.tencent.mm.plugin.exdevice.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.nio.ByteBuffer;
import junit.framework.Assert;

public final class a
{
  private final int lFA;
  private ByteBuffer lFB;
  private ByteBuffer lFC;

  public a(int paramInt)
  {
    AppMethodBeat.i(20237);
    this.lFA = 1024;
    ab.d("MicroMsg.exdevice.AutoBuffer", "******AutoBuffer****** capacity = ".concat(String.valueOf(paramInt)));
    if (paramInt >= 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      this.lFC = ByteBuffer.allocate(paramInt);
      this.lFB = this.lFC.asReadOnlyBuffer();
      if (this.lFC == null)
        break label100;
      bool2 = true;
      label71: Assert.assertTrue(bool2);
      if (this.lFB == null)
        break label105;
    }
    label100: label105: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      AppMethodBeat.o(20237);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label71;
    }
  }

  private int getCapacity()
  {
    AppMethodBeat.i(20238);
    ab.d("MicroMsg.exdevice.AutoBuffer", "getCapacity = " + this.lFC.capacity());
    int i = this.lFC.capacity();
    AppMethodBeat.o(20238);
    return i;
  }

  public final void Q(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(20241);
    Assert.assertTrue(true);
    if (paramInt >= 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramArrayOfByte.length < 0)
        break label110;
      bool2 = true;
      label32: Assert.assertTrue(bool2);
      if (paramArrayOfByte.length < paramInt + 0)
        break label116;
      bool2 = true;
      label48: Assert.assertTrue(bool2);
      if (this.lFB.remaining() < paramInt)
        break label122;
    }
    label110: label116: label122: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertTrue(bool2);
      ab.d("MicroMsg.exdevice.AutoBuffer", "readByte dstOffset = 0 byteCount = ".concat(String.valueOf(paramInt)));
      this.lFB.get(paramArrayOfByte, 0, paramInt);
      AppMethodBeat.o(20241);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label32;
      bool2 = false;
      break label48;
    }
  }

  public final void R(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(20242);
    Assert.assertTrue(true);
    boolean bool2;
    if (paramInt >= 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (paramArrayOfByte == null)
        break label152;
      bool2 = bool1;
      label31: Assert.assertTrue(bool2);
      ab.d("MicroMsg.exdevice.AutoBuffer", "writeByte srcOffset = 0 byteCount = ".concat(String.valueOf(paramInt)));
      if (paramInt <= this.lFC.remaining())
        break label158;
      ab.d("MicroMsg.exdevice.AutoBuffer", "byteCount > mWriteStream.remaining() Recalloc");
      ByteBuffer localByteBuffer = ByteBuffer.allocate(getCapacity() + paramInt + 1024);
      int i = this.lFB.position();
      localByteBuffer.put(this.lFC.array());
      localByteBuffer.put(paramArrayOfByte, 0, paramInt);
      this.lFC = localByteBuffer;
      this.lFB = localByteBuffer.asReadOnlyBuffer();
      this.lFB.position(i);
      AppMethodBeat.o(20242);
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      label152: bool2 = false;
      break label31;
      label158: this.lFC.put(paramArrayOfByte, 0, paramInt);
      AppMethodBeat.o(20242);
    }
  }

  public final int getSize()
  {
    AppMethodBeat.i(20239);
    ab.d("MicroMsg.exdevice.AutoBuffer", "size = " + this.lFC.position());
    int i = this.lFC.position();
    AppMethodBeat.o(20239);
    return i;
  }

  public final short readShort()
  {
    AppMethodBeat.i(20240);
    if (getSize() <= 1)
    {
      IOException localIOException = new IOException("There is only one byte in array");
      AppMethodBeat.o(20240);
      throw localIOException;
    }
    short s = this.lFB.getShort();
    ab.d("MicroMsg.exdevice.AutoBuffer", "getShort = ".concat(String.valueOf(s)));
    AppMethodBeat.o(20240);
    return s;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.j.a
 * JD-Core Version:    0.6.2
 */