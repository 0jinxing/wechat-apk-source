package com.tencent.mm.plugin.appbrand.t.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.f.b;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class e
  implements c
{
  protected static byte[] iTy = new byte[0];
  protected d.a iTA;
  private ByteBuffer iTB;
  protected boolean iTC;
  protected boolean iTz;

  public e()
  {
  }

  public e(d.a parama)
  {
    AppMethodBeat.i(73262);
    this.iTA = parama;
    this.iTB = ByteBuffer.wrap(iTy);
    AppMethodBeat.o(73262);
  }

  public e(d paramd)
  {
    AppMethodBeat.i(73263);
    this.iTz = paramd.aOr();
    this.iTA = paramd.aOt();
    this.iTB = paramd.aOq();
    this.iTC = paramd.aOs();
    AppMethodBeat.o(73263);
  }

  public void A(ByteBuffer paramByteBuffer)
  {
    this.iTB = paramByteBuffer;
  }

  public final void a(d.a parama)
  {
    this.iTA = parama;
  }

  public ByteBuffer aOq()
  {
    return this.iTB;
  }

  public final boolean aOr()
  {
    return this.iTz;
  }

  public final boolean aOs()
  {
    return this.iTC;
  }

  public final d.a aOt()
  {
    return this.iTA;
  }

  public final void e(d paramd)
  {
    AppMethodBeat.i(73264);
    ByteBuffer localByteBuffer1 = paramd.aOq();
    if (this.iTB == null)
    {
      this.iTB = ByteBuffer.allocate(localByteBuffer1.remaining());
      localByteBuffer1.mark();
      this.iTB.put(localByteBuffer1);
      localByteBuffer1.reset();
      this.iTz = paramd.aOr();
      AppMethodBeat.o(73264);
      return;
    }
    localByteBuffer1.mark();
    this.iTB.position(this.iTB.limit());
    this.iTB.limit(this.iTB.capacity());
    if (localByteBuffer1.remaining() > this.iTB.remaining())
    {
      ByteBuffer localByteBuffer2 = ByteBuffer.allocate(localByteBuffer1.remaining() + this.iTB.capacity());
      this.iTB.flip();
      localByteBuffer2.put(this.iTB);
      localByteBuffer2.put(localByteBuffer1);
      this.iTB = localByteBuffer2;
    }
    while (true)
    {
      this.iTB.rewind();
      localByteBuffer1.reset();
      break;
      this.iTB.put(localByteBuffer1);
    }
  }

  public final void eM(boolean paramBoolean)
  {
    this.iTz = paramBoolean;
  }

  public final void eN(boolean paramBoolean)
  {
    this.iTC = paramBoolean;
  }

  public String toString()
  {
    AppMethodBeat.i(73265);
    String str = "Framedata{ optcode:" + this.iTA + ", fin:" + this.iTz + ", payloadlength:[pos:" + this.iTB.position() + ", len:" + this.iTB.remaining() + "], payload:" + Arrays.toString(b.Es(new String(this.iTB.array()))) + "}";
    AppMethodBeat.o(73265);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.d.e
 * JD-Core Version:    0.6.2
 */