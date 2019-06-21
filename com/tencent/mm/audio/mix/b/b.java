package com.tencent.mm.audio.mix.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.d;
import java.util.ArrayList;

public final class b
{
  private static b ckK;
  private ArrayList<d> ckL;
  private long ckM;
  private int count;
  private Object sLock;
  private int size;

  private b()
  {
    AppMethodBeat.i(136983);
    this.ckL = new ArrayList();
    this.sLock = new Object();
    this.ckM = 3000000L;
    this.size = 0;
    this.count = 0;
    AppMethodBeat.o(136983);
  }

  public static b Di()
  {
    AppMethodBeat.i(136984);
    if (ckK == null);
    try
    {
      if (ckK == null)
      {
        localb = new com/tencent/mm/audio/mix/b/b;
        localb.<init>();
        ckK = localb;
      }
      b localb = ckK;
      AppMethodBeat.o(136984);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(136984);
    }
  }

  public final d Dj()
  {
    AppMethodBeat.i(136985);
    synchronized (this.sLock)
    {
      if (this.ckL.size() > 0)
      {
        locald = (d)this.ckL.remove(this.ckL.size() - 1);
        AppMethodBeat.o(136985);
      }
      while (true)
      {
        return locald;
        if (this.size < this.ckM)
          break;
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "size >= FIX_SIZE, size:%d", new Object[] { Integer.valueOf(this.size) });
        locald = null;
        AppMethodBeat.o(136985);
      }
      this.count += 1;
      this.size = (this.count * 3536);
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "pool tract count:%d", new Object[] { Integer.valueOf(this.count) });
      d locald = new d();
      locald.ckH = true;
      AppMethodBeat.o(136985);
    }
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(136986);
    if ((paramd == null) || (paramd.ckv == null))
      AppMethodBeat.o(136986);
    while (true)
    {
      return;
      if (!paramd.ckH)
      {
        AppMethodBeat.o(136986);
        continue;
      }
      paramd.reset();
      synchronized (this.sLock)
      {
        this.ckL.add(0, paramd);
        AppMethodBeat.o(136986);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.b
 * JD-Core Version:    0.6.2
 */