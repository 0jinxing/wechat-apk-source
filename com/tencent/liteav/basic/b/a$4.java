package com.tencent.liteav.basic.b;

import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

class a$4
  implements Runnable
{
  a$4(a parama)
  {
  }

  public void run()
  {
    AppMethodBeat.i(66067);
    com.tencent.liteav.basic.g.b localb;
    while ((a.b(this.a) != null) && (!a.b(this.a).isEmpty()) && (!a.c(this.a)))
    {
      this.a.c();
      localb = a.d(this.a);
      if (localb == null)
        break;
      if ((localb != null) && (a.e(this.a) != null))
        a.e(this.a).b(localb);
    }
    long l2;
    while ((!a.f(this.a).isEmpty()) && (a.e(this.a) != null))
    {
      localb = (com.tencent.liteav.basic.g.b)a.f(this.a).getFirst();
      l1 = a.e(this.a).o();
      l2 = l1;
      if (0L == l1)
        l2 = a.g(this.a);
      if (localb.g > l2)
        break;
      a.e(this.a).c(localb);
      a.f(this.a).removeFirst();
    }
    long l1 = TXCTimeUtil.getTimeTick();
    if (l1 > a.h(this.a) + 200L)
    {
      a.b(this.a, a.i(this.a) + this.a.d());
      a.j(this.a);
      l2 = this.a.e();
      a.c(this.a, a.k(this.a) + l2);
      a.l(this.a);
      if (a.m(this.a) > 0L)
        a.d(this.a, a.k(this.a) / a.m(this.a));
      if (l2 > a.n(this.a))
        a.e(this.a, l2);
      a.a(this.a, l1);
    }
    if (a.o(this.a))
      a.p(this.a);
    AppMethodBeat.o(66067);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.b.a.4
 * JD-Core Version:    0.6.2
 */