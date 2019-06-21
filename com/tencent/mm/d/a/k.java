package com.tencent.mm.d.a;

import com.eclipsesource.v8.SharedV8ArrayBuffer;
import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class k
  implements e
{
  private final AtomicInteger chI;
  private final Map<Integer, k.a> chJ;
  private final l chK;

  public k(l paraml)
  {
    AppMethodBeat.i(113830);
    this.chK = paraml;
    this.chI = new AtomicInteger(0);
    this.chJ = new HashMap();
    AppMethodBeat.o(113830);
  }

  public final void destroy(int paramInt)
  {
    AppMethodBeat.i(113834);
    if (!this.chJ.containsKey(Integer.valueOf(paramInt)))
    {
      ab.w("MicroMsg.SharedV8ArrayBufferMgr", "destroy: id %d not exist", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(113834);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SharedV8ArrayBufferMgr", "destroy id:%d", new Object[] { Integer.valueOf(paramInt) });
      k.a locala = (k.a)this.chJ.get(Integer.valueOf(paramInt));
      locala.chK.chO.k(new k.a.1(locala));
      this.chJ.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(113834);
    }
  }

  public final int gn(int paramInt)
  {
    AppMethodBeat.i(113831);
    int i = this.chI.addAndGet(1);
    k.a locala = new k.a(paramInt, this.chK);
    this.chJ.put(Integer.valueOf(i), locala);
    ab.i("MicroMsg.SharedV8ArrayBufferMgr", "create capacity:%d, id:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    AppMethodBeat.o(113831);
    return i;
  }

  public final SharedV8ArrayBuffer go(int paramInt)
  {
    AppMethodBeat.i(113832);
    Object localObject;
    if (!this.chJ.containsKey(Integer.valueOf(paramInt)))
    {
      ab.w("MicroMsg.SharedV8ArrayBufferMgr", "get: id %d not exist", new Object[] { Integer.valueOf(paramInt) });
      localObject = null;
      AppMethodBeat.o(113832);
    }
    while (true)
    {
      return localObject;
      localObject = (k.a)this.chJ.get(Integer.valueOf(paramInt));
      if (((k.a)localObject).chM == null)
        ((k.a)localObject).chM = ((k.a)localObject).chK.CB().newSharedV8ArrayBuffer(((k.a)localObject).chL);
      localObject = ((k.a)localObject).chM;
      AppMethodBeat.o(113832);
    }
  }

  public final ByteBuffer gp(int paramInt)
  {
    AppMethodBeat.i(113833);
    ByteBuffer localByteBuffer;
    if (!this.chJ.containsKey(Integer.valueOf(paramInt)))
    {
      ab.w("MicroMsg.SharedV8ArrayBufferMgr", "getBackingStore: id %d not exist", new Object[] { Integer.valueOf(paramInt) });
      localByteBuffer = null;
      AppMethodBeat.o(113833);
    }
    while (true)
    {
      return localByteBuffer;
      localByteBuffer = ((k.a)this.chJ.get(Integer.valueOf(paramInt))).chL;
      AppMethodBeat.o(113833);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.k
 * JD-Core Version:    0.6.2
 */