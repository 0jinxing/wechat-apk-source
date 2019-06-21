package com.tencent.mm.plugin.appbrand.t.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.t.c.c;
import java.nio.ByteBuffer;

public final class b extends e
  implements a
{
  static final ByteBuffer iTq;
  private int code;
  private String hTq;

  static
  {
    AppMethodBeat.i(73258);
    iTq = ByteBuffer.allocate(0);
    AppMethodBeat.o(73258);
  }

  public b()
  {
    super(d.a.iTw);
    AppMethodBeat.i(73251);
    eM(true);
    AppMethodBeat.o(73251);
  }

  public b(int paramInt, String paramString)
  {
    super(d.a.iTw);
    AppMethodBeat.i(73252);
    eM(true);
    if (paramString == null)
      paramString = "";
    while (true)
    {
      int i = paramInt;
      if (paramInt == 1015)
      {
        paramString = "";
        i = 1005;
      }
      if (i == 1005)
      {
        if (paramString.length() > 0)
        {
          paramString = new com.tencent.mm.plugin.appbrand.t.c.b("A close frame must have a closecode if it has a reason");
          AppMethodBeat.o(73252);
          throw paramString;
        }
        AppMethodBeat.o(73252);
      }
      while (true)
      {
        return;
        paramString = com.tencent.mm.plugin.appbrand.t.f.b.Es(paramString);
        ByteBuffer localByteBuffer1 = ByteBuffer.allocate(4);
        localByteBuffer1.putInt(i);
        localByteBuffer1.position(2);
        ByteBuffer localByteBuffer2 = ByteBuffer.allocate(paramString.length + 2);
        localByteBuffer2.put(localByteBuffer1);
        localByteBuffer2.put(paramString);
        localByteBuffer2.rewind();
        A(localByteBuffer2);
        AppMethodBeat.o(73252);
      }
    }
  }

  private void aOo()
  {
    AppMethodBeat.i(73253);
    this.code = 1005;
    Object localObject = super.aOq();
    ((ByteBuffer)localObject).mark();
    if (((ByteBuffer)localObject).remaining() >= 2)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
      localByteBuffer.position(2);
      localByteBuffer.putShort(((ByteBuffer)localObject).getShort());
      localByteBuffer.position(0);
      this.code = localByteBuffer.getInt();
      if ((this.code == 1006) || (this.code == 1015) || (this.code == 1005) || (this.code > 4999) || (this.code < 1000) || (this.code == 1004))
      {
        localObject = new c("closecode must not be sent over the wire: " + this.code);
        AppMethodBeat.o(73253);
        throw ((Throwable)localObject);
      }
    }
    ((ByteBuffer)localObject).reset();
    AppMethodBeat.o(73253);
  }

  private void aOp()
  {
    AppMethodBeat.i(73254);
    if (this.code == 1005)
    {
      this.hTq = com.tencent.mm.plugin.appbrand.t.f.b.B(super.aOq());
      AppMethodBeat.o(73254);
    }
    while (true)
    {
      return;
      ByteBuffer localByteBuffer = super.aOq();
      int i = localByteBuffer.position();
      try
      {
        localByteBuffer.position(localByteBuffer.position() + 2);
        this.hTq = com.tencent.mm.plugin.appbrand.t.f.b.B(localByteBuffer);
        localByteBuffer.position(i);
        AppMethodBeat.o(73254);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        c localc = new com/tencent/mm/plugin/appbrand/t/c/c;
        localc.<init>(localIllegalArgumentException);
        AppMethodBeat.o(73254);
        throw localc;
      }
      finally
      {
        localByteBuffer.position(i);
        AppMethodBeat.o(73254);
      }
    }
  }

  public final void A(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(73256);
    super.A(paramByteBuffer);
    aOo();
    aOp();
    AppMethodBeat.o(73256);
  }

  public final int aOn()
  {
    return this.code;
  }

  public final ByteBuffer aOq()
  {
    AppMethodBeat.i(73257);
    ByteBuffer localByteBuffer;
    if (this.code == 1005)
    {
      localByteBuffer = iTq;
      AppMethodBeat.o(73257);
    }
    while (true)
    {
      return localByteBuffer;
      localByteBuffer = super.aOq();
      AppMethodBeat.o(73257);
    }
  }

  public final String getMessage()
  {
    return this.hTq;
  }

  public final String toString()
  {
    AppMethodBeat.i(73255);
    String str = super.toString() + "code: " + this.code;
    AppMethodBeat.o(73255);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t.d.b
 * JD-Core Version:    0.6.2
 */