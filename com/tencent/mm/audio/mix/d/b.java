package com.tencent.mm.audio.mix.d;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends i
{
  private j clH;
  public boolean clI = false;
  public k clJ;

  public b(j paramj, String paramString)
  {
    super(paramString);
    this.clH = paramj;
  }

  public final boolean Dv()
  {
    if (this.clJ == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void b(k paramk)
  {
    AppMethodBeat.i(137050);
    this.clJ = paramk;
    this.cmn = System.currentTimeMillis();
    AppMethodBeat.o(137050);
  }

  public final void reset()
  {
    this.clI = false;
  }

  public final void run()
  {
    AppMethodBeat.i(137049);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeTask", "run task %s", new Object[] { this.name });
    if (this.clI)
      AppMethodBeat.o(137049);
    while (true)
    {
      return;
      Process.setThreadPriority(-16);
      this.clH.a(this.clJ);
      this.clH.a(this);
      this.clI = true;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeTask", "run task %s end", new Object[] { this.name });
      AppMethodBeat.o(137049);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.d.b
 * JD-Core Version:    0.6.2
 */