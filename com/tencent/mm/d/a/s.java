package com.tencent.mm.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class s
  implements f
{
  private final AtomicInteger ciB;
  private final AtomicInteger ciC;
  private final HashMap<Integer, ByteBuffer> ciD;

  public s()
  {
    AppMethodBeat.i(113887);
    this.ciB = new AtomicInteger(0);
    this.ciC = new AtomicInteger(0);
    this.ciD = new HashMap();
    AppMethodBeat.o(113887);
  }

  public final int Cv()
  {
    AppMethodBeat.i(113888);
    Integer localInteger = Integer.valueOf(this.ciB.addAndGet(1));
    this.ciD.put(localInteger, null);
    ab.i("V8EngineBufferStore", "generateId:%d", new Object[] { localInteger });
    int i = localInteger.intValue();
    AppMethodBeat.o(113888);
    return i;
  }

  public final void a(int paramInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(113890);
    if (paramByteBuffer == null)
      AppMethodBeat.o(113890);
    while (true)
    {
      return;
      ByteBuffer localByteBuffer;
      if (paramByteBuffer == null)
        localByteBuffer = paramByteBuffer;
      while (true)
      {
        if (localByteBuffer.isDirect())
          break label78;
        ab.i("V8EngineBufferStore", "setBuffer: cannot convert to direct buffer");
        AppMethodBeat.o(113890);
        break;
        if (paramByteBuffer.isDirect())
          localByteBuffer = paramByteBuffer;
        else if (!paramByteBuffer.hasArray())
          localByteBuffer = paramByteBuffer;
        else
          localByteBuffer = q.al(paramByteBuffer.array());
      }
      label78: if (!this.ciD.containsKey(Integer.valueOf(paramInt)))
      {
        ab.i("V8EngineBufferStore", "setBuffer: already in the store");
        AppMethodBeat.o(113890);
      }
      else
      {
        ab.i("V8EngineBufferStore", "setBuffer %d isDirect:%b remains[%d]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramByteBuffer.isDirect()), Integer.valueOf(this.ciC.addAndGet(paramByteBuffer.capacity())) });
        this.ciD.put(Integer.valueOf(paramInt), localByteBuffer);
        AppMethodBeat.o(113890);
      }
    }
  }

  public final ByteBuffer gq(int paramInt)
  {
    AppMethodBeat.i(113889);
    if (!this.ciD.containsKey(Integer.valueOf(paramInt)))
    {
      ab.i("V8EngineBufferStore", "getBuffer:%d not contains", new Object[] { Integer.valueOf(paramInt) });
      localByteBuffer = null;
      AppMethodBeat.o(113889);
      return localByteBuffer;
    }
    ByteBuffer localByteBuffer = (ByteBuffer)this.ciD.get(Integer.valueOf(paramInt));
    this.ciD.remove(Integer.valueOf(paramInt));
    if (localByteBuffer == null);
    for (int i = 0; ; i = localByteBuffer.capacity())
    {
      ab.i("V8EngineBufferStore", "getBuffer:%d remains[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.ciC.addAndGet(-i)) });
      AppMethodBeat.o(113889);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.s
 * JD-Core Version:    0.6.2
 */