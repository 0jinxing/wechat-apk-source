package com.bumptech.glide.c.d.e;

import com.bumptech.glide.b.c;
import com.bumptech.glide.b.d;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

final class a$b
{
  private final Queue<d> aDb;

  a$b()
  {
    AppMethodBeat.i(92298);
    this.aDb = j.dn(0);
    AppMethodBeat.o(92298);
  }

  final void a(d paramd)
  {
    try
    {
      AppMethodBeat.i(92300);
      paramd.aym = null;
      paramd.ayn = null;
      this.aDb.offer(paramd);
      AppMethodBeat.o(92300);
      return;
    }
    finally
    {
      paramd = finally;
    }
    throw paramd;
  }

  final d c(ByteBuffer paramByteBuffer)
  {
    try
    {
      AppMethodBeat.i(92299);
      Object localObject1 = (d)this.aDb.poll();
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new com/bumptech/glide/b/d;
        ((d)localObject2).<init>();
      }
      ((d)localObject2).aym = null;
      Arrays.fill(((d)localObject2).ayl, (byte)0);
      localObject1 = new com/bumptech/glide/b/c;
      ((c)localObject1).<init>();
      ((d)localObject2).ayn = ((c)localObject1);
      ((d)localObject2).blockSize = 0;
      ((d)localObject2).aym = paramByteBuffer.asReadOnlyBuffer();
      ((d)localObject2).aym.position(0);
      ((d)localObject2).aym.order(ByteOrder.LITTLE_ENDIAN);
      AppMethodBeat.o(92299);
      return localObject2;
    }
    finally
    {
    }
    throw paramByteBuffer;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.e.a.b
 * JD-Core Version:    0.6.2
 */