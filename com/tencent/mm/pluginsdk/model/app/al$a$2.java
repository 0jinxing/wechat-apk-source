package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.record.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class al$a$2
  implements Runnable
{
  al$a$2(al.a parama, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    long l1 = 0L;
    int i = 0;
    AppMethodBeat.i(27395);
    al.a.Fc();
    long l2;
    long l3;
    if (this.crb.getType() == 222)
    {
      ab.d("MicroMsg.SceneAppMsg", "onSceneEnd  SendAppMsg errtype:" + this.crc + " errCode:" + this.crd);
      i = 0;
      l2 = -1L;
      l3 = l1;
      if (l2 != -1L)
      {
        l3 = l1;
        if (this.vcN.cqS.get(Long.valueOf(l2)) != null)
        {
          l3 = ((g.a)this.vcN.cqS.get(Long.valueOf(l2))).Mr();
          this.vcN.cqS.remove(Long.valueOf(l2));
        }
      }
      ab.d("MicroMsg.SceneAppMsg", "onSceneEnd SceneType:" + this.crb.getType() + " errtype:" + this.crc + " errCode:" + this.crd + " retCode:" + i + " rowid:" + l2 + " time:" + l3);
      if (this.crc != 0)
        al.a.d(this.vcN);
      ab.d("MicroMsg.SceneAppMsg", "onSceneEnd  inCnt:" + al.a.access$000() + " stop:" + al.a.e(this.vcN) + " running:" + al.a.f(this.vcN) + " recving:" + al.a.g(this.vcN) + " sending:" + al.a.h(this.vcN));
      if (al.a.e(this.vcN) <= 0)
        break label672;
      al.a.i(this.vcN);
    }
    while (true)
    {
      al.a.Fd();
      AppMethodBeat.o(27395);
      while (true)
      {
        return;
        if (this.crb.getType() == 221)
        {
          al.a.a(this.vcN);
          l2 = ((e)this.crb).pJl;
          i = ((e)this.crb).retCode;
          break;
        }
        if (this.crb.getType() == 220)
        {
          al.a.b(this.vcN);
          l3 = ((ai)this.crb).pJl;
          int j = ((ai)this.crb).retCode;
          Object localObject1 = (ai)this.crb;
          label466: Object localObject2;
          if (((ai)localObject1).pJj == null)
          {
            localObject1 = null;
            localObject2 = (ai)this.crb;
            if (((ai)localObject2).pJj != null)
              break label619;
          }
          label619: for (l2 = 0L; ; l2 = ((ai)localObject2).pJj.field_msgInfoId)
          {
            localObject2 = (String)al.a.c(this.vcN).remove(Long.valueOf(l2));
            if (!bo.isNullOrNil(((ai)this.crb).fFa))
              i = 1;
            if ((i == 0) && (!bo.isNullOrNil((String)localObject1)))
            {
              b localb = new b();
              am.aUq().b(l3, localb);
              if (localb.xDa == l3)
              {
                l.a(localb.field_msgInfoId, (String)localObject1, null);
                ab.d("MicroMsg.SceneAppMsg", "onSceneEnd, finish update app attach, start send app msg");
                al.a.A(localb.field_msgInfoId, (String)localObject2);
              }
            }
            i = j;
            l2 = l3;
            break;
            localObject1 = ((ai)localObject1).pJj.field_mediaSvrId;
            break label466;
          }
        }
        ab.e("MicroMsg.SceneAppMsg", "onSceneEnd Error SceneType:" + this.crb.getType());
        al.a.Fd();
        AppMethodBeat.o(27395);
      }
      label672: if ((!al.a.h(this.vcN)) && (!al.a.g(this.vcN)))
        al.a.j(this.vcN);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(27396);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(27396);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.al.a.2
 * JD-Core Version:    0.6.2
 */