package com.tencent.magicbrush.handler.image;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 enum b
{
  private static int bUn;
  ExecutorService bUo;

  static
  {
    AppMethodBeat.i(115983);
    bUm = new b("INSTANCE");
    bUp = new b[] { bUm };
    bUn = Runtime.getRuntime().availableProcessors() + 1;
    AppMethodBeat.o(115983);
  }

  private b()
  {
    AppMethodBeat.i(115982);
    this.bUo = null;
    this.bUo = Executors.newFixedThreadPool(Math.max(bUn, 5));
    AppMethodBeat.o(115982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.image.b
 * JD-Core Version:    0.6.2
 */