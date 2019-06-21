package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class y$a$2
  implements Runnable
{
  y$a$2(y.a parama, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50868);
    y.a.acr();
    String str;
    int i;
    if (this.crb.getType() == 150)
    {
      y.a.b(this.fXQ);
      str = ((d)this.crb).fileName;
      y.fXG = str;
      i = ((d)this.crb).retCode;
      y.a.c(this.fXQ);
    }
    while (true)
    {
      long l1 = 0L;
      long l2 = l1;
      if (str != null)
      {
        l2 = l1;
        if (this.fXQ.cqS.get(str) != null)
        {
          l2 = ((g.a)this.fXQ.cqS.get(str)).Mr();
          this.fXQ.cqS.remove(str);
        }
      }
      ab.d("MicroMsg.VideoService", "onSceneEnd SceneType:" + this.crb.getType() + " errtype:" + this.crc + " errCode:" + this.crd + " retCode:" + i + " file:" + str + " time:" + l2);
      if ((this.crc == 3) && (i != 0))
      {
        y.a.f(this.fXQ);
        label226: ab.d("MicroMsg.VideoService", "onSceneEnd  inCnt:" + y.a.access$100() + " stop:" + y.a.g(this.fXQ) + " running:" + y.a.h(this.fXQ) + " recving:" + y.a.i(this.fXQ) + " sending:" + y.a.j(this.fXQ));
        if (y.a.g(this.fXQ) <= 0)
          break label484;
        y.a.a(this.fXQ);
      }
      while (true)
      {
        y.a.alI();
        AppMethodBeat.o(50868);
        while (true)
        {
          return;
          if (this.crb.getType() == 149)
          {
            y.a.d(this.fXQ);
            y.a.e(this.fXQ);
            if ((this.crb instanceof g))
            {
              str = ((g)this.crb).fileName;
              i = ((g)this.crb).retCode;
              break;
            }
            if (!(this.crb instanceof h))
              break label514;
            str = ((h)this.crb).fileName;
            i = 0;
            break;
          }
          ab.e("MicroMsg.VideoService", "onSceneEnd Error SceneType:" + this.crb.getType());
          y.a.alI();
          AppMethodBeat.o(50868);
        }
        if (this.crc == 0)
          break label226;
        y.a.a(this.fXQ, 0);
        break label226;
        label484: if ((!y.a.j(this.fXQ)) && (!y.a.i(this.fXQ)))
          y.a.k(this.fXQ);
      }
      label514: i = 0;
      str = null;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(50869);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(50869);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.y.a.2
 * JD-Core Version:    0.6.2
 */