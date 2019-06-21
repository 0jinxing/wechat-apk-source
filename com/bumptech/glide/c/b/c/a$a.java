package com.bumptech.glide.c.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ThreadFactory;

final class a$a
  implements ThreadFactory
{
  final a.b aDC;
  final boolean aDD;
  private int aDE;
  private final String name;

  a$a(String paramString, a.b paramb, boolean paramBoolean)
  {
    this.name = paramString;
    this.aDC = paramb;
    this.aDD = paramBoolean;
  }

  public final Thread newThread(Runnable paramRunnable)
  {
    try
    {
      AppMethodBeat.i(92003);
      a.a.1 local1 = new com/bumptech/glide/c/b/c/a$a$1;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("glide-");
      local1.<init>(this, paramRunnable, this.name + "-thread-" + this.aDE);
      this.aDE += 1;
      AppMethodBeat.o(92003);
      return local1;
    }
    finally
    {
      paramRunnable = finally;
    }
    throw paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.a.a
 * JD-Core Version:    0.6.2
 */