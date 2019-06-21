package c.t.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

class n$a extends Thread
{
  private String b;

  public n$a(n paramn, String paramString)
  {
    this.b = paramString;
  }

  public void run()
  {
    AppMethodBeat.i(136388);
    e.a(n.a(this.a)).a(this.b);
    n.b(this.a).countDown();
    AppMethodBeat.o(136388);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     c.t.m.c.n.a
 * JD-Core Version:    0.6.2
 */