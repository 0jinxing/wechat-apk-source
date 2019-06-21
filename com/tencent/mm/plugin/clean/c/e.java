package com.tencent.mm.plugin.clean.c;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.a.a.a;
import com.tencent.mm.plugin.clean.c.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

public final class e extends Thread
  implements a.a
{
  private long endTime;
  private ak fbD;
  private boolean isStop;
  private ArrayList<a> kwA;
  private int kwB;
  private b kwh;
  private int kwj;
  private int kwk;
  private h kwz;
  private long startTime;

  public e(b paramb, h paramh, ArrayList<a> paramArrayList)
  {
    AppMethodBeat.i(18703);
    this.kwj = 0;
    this.kwk = 0;
    this.kwB = 0;
    this.startTime = 0L;
    this.endTime = 0L;
    this.fbD = new ak(Looper.getMainLooper());
    this.kwh = paramb;
    this.kwz = paramh;
    this.kwA = paramArrayList;
    AppMethodBeat.o(18703);
  }

  private void bfJ()
  {
    AppMethodBeat.i(18705);
    this.endTime = System.currentTimeMillis();
    ab.i("MicroMsg.DeleteFileController", "totalUserTime:%d", new Object[] { Long.valueOf(bfK()) });
    if ((this.kwz != null) && (!this.isStop))
      this.fbD.post(new e.2(this));
    AppMethodBeat.o(18705);
  }

  private long bfK()
  {
    return this.endTime - this.startTime;
  }

  public final void a(com.tencent.mm.plugin.clean.c.a.a parama)
  {
    AppMethodBeat.i(18707);
    interrupt();
    this.kwk += 1;
    if ((this.kwz != null) && (!this.isStop))
      this.fbD.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(18700);
          e.c(e.this).dP(e.a(e.this), e.b(e.this));
          AppMethodBeat.o(18700);
        }
      });
    if (this.kwk == this.kwj)
      bfJ();
    AppMethodBeat.o(18707);
  }

  public final void bgb()
  {
    AppMethodBeat.i(18706);
    ab.i("MicroMsg.DeleteFileController", "stop analyseController");
    this.isStop = true;
    interrupt();
    AppMethodBeat.o(18706);
  }

  public final void run()
  {
    AppMethodBeat.i(18704);
    this.startTime = System.currentTimeMillis();
    this.kwj = this.kwA.size();
    ab.d("MicroMsg.DeleteFileController", "totalTaskCount=%d", new Object[] { Integer.valueOf(this.kwj) });
    if (this.kwj == 0)
    {
      bfJ();
      AppMethodBeat.o(18704);
    }
    while (true)
    {
      return;
      for (int i = 0; (!this.isStop) && (i < this.kwA.size()); i++)
      {
        a locala = (a)this.kwA.get(i);
        ab.d("MicroMsg.DeleteFileController", "while loop index=%d | filePath=%s", new Object[] { Integer.valueOf(i), locala.filePath });
        e.a locala1 = new e.a(this, locala);
        while (!this.kwh.b(locala1))
          try
          {
            Thread.sleep(100L);
          }
          catch (InterruptedException localInterruptedException)
          {
          }
        ab.d("MicroMsg.DeleteFileController", "Start task： filePath＝%s", new Object[] { locala.filePath });
      }
      AppMethodBeat.o(18704);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.e
 * JD-Core Version:    0.6.2
 */