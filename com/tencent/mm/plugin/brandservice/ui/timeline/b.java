package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.d;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.q;
import java.util.HashMap;

public final class b
  implements d.a
{
  int jNL;
  public HashMap<Long, Integer> jNM;
  private h jNN;

  public b(h paramh)
  {
    AppMethodBeat.i(14133);
    this.jNM = new HashMap();
    this.jNN = paramh;
    AppMethodBeat.o(14133);
  }

  private void a(com.tencent.mm.at.e parame, q paramq, int paramInt, ImageView paramImageView)
  {
    AppMethodBeat.i(14134);
    if (o.ahm().a(parame.fDy, paramq.field_msgId, 0, Integer.valueOf(paramInt), 2130838182, this, 0, false) == -2)
    {
      ab.w("MicroMsg.BizTimeLineImgMsgHandler", "it is already download image finish, but imgInfo is old, search db and repair.");
      parame = b(paramq);
      if (parame == null)
      {
        ab.w("MicroMsg.BizTimeLineImgMsgHandler", "get imgInfo by db but it is null.");
        AppMethodBeat.o(14134);
      }
    }
    while (true)
    {
      return;
      parame = g(parame);
      if (com.tencent.mm.vfs.e.ct(parame))
        a(parame, paramImageView);
      AppMethodBeat.o(14134);
    }
  }

  private void a(String paramString, ImageView paramImageView)
  {
    AppMethodBeat.i(14136);
    if (this.jNL != 0);
    for (int i = 2130837927; ; i = 0)
    {
      a locala = o.ahp();
      c.a locala1 = new c.a();
      locala1.ePX = "biz_nor_img".concat(String.valueOf(i));
      locala1.ePV = 2131689876;
      locala1.fHe = 1;
      locala.a(paramString, paramImageView, locala1.ahG(), new b.1(this, i));
      AppMethodBeat.o(14136);
      return;
    }
  }

  private static com.tencent.mm.at.e b(q paramq)
  {
    AppMethodBeat.i(14138);
    com.tencent.mm.at.e locale1 = null;
    if (paramq.field_msgId > 0L)
      locale1 = o.ahl().fJ(paramq.field_msgId);
    com.tencent.mm.at.e locale2;
    if (locale1 != null)
    {
      locale2 = locale1;
      if (locale1.fDy > 0L);
    }
    else
    {
      locale2 = locale1;
      if (paramq.field_msgSvrId > 0L)
        locale2 = o.ahl().fI(paramq.field_msgSvrId);
    }
    AppMethodBeat.o(14138);
    return locale2;
  }

  private static String g(com.tencent.mm.at.e parame)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(14137);
    if (parame == null)
    {
      AppMethodBeat.o(14137);
      parame = (com.tencent.mm.at.e)localObject2;
    }
    while (true)
    {
      return parame;
      String str = parame.fDz;
      localObject2 = localObject1;
      if (parame.agQ())
      {
        parame = o.ahl().d(parame);
        localObject2 = localObject1;
        if (parame != null)
        {
          parame = o.ahl().q(parame, "", "");
          localObject2 = localObject1;
          if (com.tencent.mm.vfs.e.ct(parame))
          {
            ab.i("MicroMsg.BizTimeLineImgMsgHandler", "hasHdImg");
            localObject2 = parame;
          }
        }
      }
      parame = (com.tencent.mm.at.e)localObject2;
      if (localObject2 == null)
        parame = o.ahl().q(str, "", "");
      AppMethodBeat.o(14137);
    }
  }

  private int gF(long paramLong)
  {
    AppMethodBeat.i(14140);
    int i;
    if (this.jNM.containsKey(Long.valueOf(paramLong)))
    {
      i = ((Integer)this.jNM.get(Long.valueOf(paramLong))).intValue();
      AppMethodBeat.o(14140);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(14140);
    }
  }

  private void l(long paramLong, int paramInt)
  {
    AppMethodBeat.i(14141);
    this.jNM.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
    AppMethodBeat.o(14141);
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, m paramm)
  {
  }

  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, m paramm)
  {
    AppMethodBeat.i(14139);
    if ((paramInt3 != 0) || (paramInt4 != 0))
    {
      ab.i("MicroMsg.BizTimeLineImgMsgHandler", "onImgTaskEnd errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      if (paramInt4 == -5103059)
      {
        l(paramLong2, 2);
        AppMethodBeat.o(14139);
      }
    }
    while (true)
    {
      return;
      l(paramLong2, 3);
      AppMethodBeat.o(14139);
      continue;
      l(paramLong2, 1);
      this.jNN.aWv();
      AppMethodBeat.o(14139);
    }
  }

  public final void a(q paramq, int paramInt1, ImageView paramImageView, int paramInt2)
  {
    AppMethodBeat.i(14135);
    this.jNL = paramInt2;
    if ((gF(paramq.field_msgId) == 2) || (gF(paramq.field_msgId) == 3))
      AppMethodBeat.o(14135);
    while (true)
    {
      return;
      com.tencent.mm.at.e locale = b(paramq);
      if (locale != null)
      {
        String str = g(locale);
        if (com.tencent.mm.vfs.e.ct(str))
        {
          a(str, paramImageView);
          l(paramq.field_msgId, 1);
          AppMethodBeat.o(14135);
        }
        else
        {
          a(locale, paramq, paramInt1, paramImageView);
          AppMethodBeat.o(14135);
        }
      }
      else
      {
        ab.w("MicroMsg.BizTimeLineImgMsgHandler", "showImg img info is null. %d/%d", new Object[] { Long.valueOf(paramq.field_msgId), Long.valueOf(paramq.field_msgSvrId) });
        AppMethodBeat.o(14135);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.b
 * JD-Core Version:    0.6.2
 */