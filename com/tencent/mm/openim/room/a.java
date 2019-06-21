package com.tencent.mm.openim.room;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.b.f;
import com.tencent.mm.openim.b.k;
import com.tencent.mm.openim.b.m;
import com.tencent.mm.openim.room.a.b.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import java.util.List;

public final class a
  implements com.tencent.mm.roomsdk.a.a.a
{
  public final com.tencent.mm.roomsdk.a.c.a D(String paramString, int paramInt)
  {
    AppMethodBeat.i(78955);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new f(paramString, paramInt);
    AppMethodBeat.o(78955);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a E(String paramString, int paramInt)
  {
    AppMethodBeat.i(78958);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(false);
    if (paramInt == 0);
    for (paramInt = 1; ; paramInt = 2)
    {
      localc.xvc = new com.tencent.mm.openim.d.c(paramString, paramInt);
      AppMethodBeat.o(78958);
      return localc;
    }
  }

  public final com.tencent.mm.roomsdk.a.c.d Ju()
  {
    AppMethodBeat.i(78948);
    com.tencent.mm.roomsdk.a.c.d locald = new com.tencent.mm.roomsdk.a.c.d();
    AppMethodBeat.o(78948);
    return locald;
  }

  public final com.tencent.mm.roomsdk.a.c.a L(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78956);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new m(paramString2, paramString1);
    AppMethodBeat.o(78956);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a M(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78959);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(false);
    localc.xvc = new com.tencent.mm.openim.d.g(paramString1, paramString2);
    AppMethodBeat.o(78959);
    return localc;
  }

  public final com.tencent.mm.roomsdk.a.c.a N(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78960);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(false);
    localc.xvc = new com.tencent.mm.openim.d.b(paramString1, paramString2);
    AppMethodBeat.o(78960);
    return localc;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString, List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(78951);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new com.tencent.mm.openim.b.d(paramString, b.a.an(paramList));
    AppMethodBeat.o(78951);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(78950);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new com.tencent.mm.openim.b.a(paramString1, b.a.an(paramList), paramString2);
    AppMethodBeat.o(78950);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString1, List<String> paramList, String paramString2, bi parambi)
  {
    AppMethodBeat.i(78953);
    paramString2 = com.tencent.mm.roomsdk.a.c.a.pa(false);
    paramString2.tRR = new k(paramString1, b.a.an(paramList));
    AppMethodBeat.o(78953);
    return paramString2;
  }

  public final void a(ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(78963);
    if (paramBoolean)
    {
      paramad.NB();
      if (t.e(paramad))
      {
        paramad.hu(43);
        paramad.iC(com.tencent.mm.platformtools.g.vp(paramad.Oi()));
        paramad.iD(com.tencent.mm.platformtools.g.vo(paramad.Oi()));
        paramad.iF(com.tencent.mm.platformtools.g.vo(paramad.Oj()));
        paramad.iG(paramad.Oj());
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().b(paramad.field_username, paramad);
      ((com.tencent.mm.openim.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.a.class)).vf(paramad.field_username);
      AppMethodBeat.o(78963);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.openim.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.a.class)).vg(paramad.field_username);
      AppMethodBeat.o(78963);
    }
  }

  public final com.tencent.mm.roomsdk.a.c.a b(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(78949);
    paramString = com.tencent.mm.roomsdk.a.c.a.pa(false);
    paramString.tRR = new com.tencent.mm.openim.b.c(b.a.an(paramList));
    AppMethodBeat.o(78949);
    return paramString;
  }

  public final com.tencent.mm.roomsdk.a.c.a c(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(78962);
    paramString2 = com.tencent.mm.roomsdk.a.c.a.pb(false);
    if (paramBoolean);
    for (int i = 1; ; i = 2)
    {
      paramString2.xvc = new com.tencent.mm.openim.d.e(paramString1, i);
      AppMethodBeat.o(78962);
      return paramString2;
    }
  }

  public final com.tencent.mm.roomsdk.a.c.a c(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(78952);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new k(paramString, b.a.an(paramList));
    AppMethodBeat.o(78952);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a j(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78961);
    paramString2 = com.tencent.mm.roomsdk.a.c.a.pb(false);
    paramString2.xvc = new com.tencent.mm.openim.d.d(paramString1, paramString3);
    AppMethodBeat.o(78961);
    return paramString2;
  }

  public final com.tencent.mm.roomsdk.a.c.a kd(String paramString)
  {
    AppMethodBeat.i(78954);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(false);
    localb.tRR = new com.tencent.mm.openim.b.e(paramString);
    AppMethodBeat.o(78954);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a ke(String paramString)
  {
    AppMethodBeat.i(78957);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(false);
    localc.xvc = new com.tencent.mm.openim.d.j(paramString);
    AppMethodBeat.o(78957);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.room.a
 * JD-Core Version:    0.6.2
 */