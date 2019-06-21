package com.tencent.mm.chatroom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.chatroom.c.h;
import com.tencent.mm.chatroom.c.k;
import com.tencent.mm.chatroom.c.m;
import com.tencent.mm.chatroom.c.n;
import com.tencent.mm.chatroom.c.o;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbr;
import com.tencent.mm.protocal.protobuf.bbs;
import com.tencent.mm.protocal.protobuf.bbu;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.roomsdk.a.c.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.List;

public final class a
  implements com.tencent.mm.roomsdk.a.a.a
{
  public String TAG = "MicroMsg.DefaultChatRoom";

  public final com.tencent.mm.roomsdk.a.c.a D(String paramString, int paramInt)
  {
    AppMethodBeat.i(103865);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new k(paramString, paramInt);
    AppMethodBeat.o(103865);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a E(String paramString, int paramInt)
  {
    AppMethodBeat.i(103868);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(true);
    localc.xvc = new com.tencent.mm.chatroom.e.b(paramString, paramInt);
    AppMethodBeat.o(103868);
    return localc;
  }

  public final d Ju()
  {
    AppMethodBeat.i(103858);
    d locald = new d();
    AppMethodBeat.o(103858);
    return locald;
  }

  public final com.tencent.mm.roomsdk.a.c.a L(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103866);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new n(paramString1, paramString2);
    AppMethodBeat.o(103866);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a M(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103869);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(true);
    bbu localbbu = new bbu();
    localbbu.vEi = new bts().alV(bo.nullAsNil(paramString1));
    localbbu.wGe = new bts().alV(bo.nullAsNil(paramString2));
    localc.xvc = new j.a(27, localbbu);
    AppMethodBeat.o(103869);
    return localc;
  }

  public final com.tencent.mm.roomsdk.a.c.a N(String paramString1, String paramString2)
  {
    AppMethodBeat.i(103870);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new o(paramString1, paramString2);
    AppMethodBeat.o(103870);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString, List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(103861);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new h(paramString, paramList, paramInt);
    AppMethodBeat.o(103861);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString1, List<String> paramList, String paramString2)
  {
    AppMethodBeat.i(103860);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new com.tencent.mm.chatroom.c.e(paramString1, paramList, paramString2);
    AppMethodBeat.o(103860);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a a(String paramString1, List<String> paramList, String paramString2, bi parambi)
  {
    AppMethodBeat.i(103863);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new m(paramString1, paramList, paramString2, parambi);
    AppMethodBeat.o(103863);
    return localb;
  }

  public final void a(ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(103873);
    if (paramBoolean)
    {
      t.r(paramad);
      AppMethodBeat.o(103873);
    }
    while (true)
    {
      return;
      t.u(paramad);
      AppMethodBeat.o(103873);
    }
  }

  public final com.tencent.mm.roomsdk.a.c.a b(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(103859);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new com.tencent.mm.chatroom.c.g(paramString, paramList);
    AppMethodBeat.o(103859);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a c(String paramString1, String paramString2, boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(103872);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(true);
    bbs localbbs = new bbs();
    localbbs.vEf = paramString1;
    localbbs.jBB = paramString2;
    localbbs.wGd = 1;
    if (paramBoolean);
    while (true)
    {
      localbbs.pXD = i;
      localc.xvc = new j.a(49, localbbs);
      AppMethodBeat.o(103872);
      return localc;
      i = 2;
    }
  }

  public final com.tencent.mm.roomsdk.a.c.a c(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(103862);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new m(paramString, paramList);
    AppMethodBeat.o(103862);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a j(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(103871);
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(true);
    bbr localbbr = new bbr();
    localbbr.vEf = paramString1;
    localbbr.jBB = paramString2;
    localbbr.vXl = bo.nullAsNil(paramString3);
    localc.xvc = new j.a(48, localbbr);
    AppMethodBeat.o(103871);
    return localc;
  }

  public final com.tencent.mm.roomsdk.a.c.a kd(String paramString)
  {
    AppMethodBeat.i(103864);
    com.tencent.mm.roomsdk.a.c.b localb = com.tencent.mm.roomsdk.a.c.a.pa(true);
    localb.tRR = new com.tencent.mm.chatroom.c.i(paramString);
    AppMethodBeat.o(103864);
    return localb;
  }

  public final com.tencent.mm.roomsdk.a.c.a ke(String paramString)
  {
    AppMethodBeat.i(103867);
    ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new com.tencent.mm.az.c(paramString));
    com.tencent.mm.roomsdk.a.c.c localc = com.tencent.mm.roomsdk.a.c.a.pb(true);
    localc.xvc = new com.tencent.mm.chatroom.e.c((String)com.tencent.mm.kernel.g.RP().Ry().get(2, null), paramString);
    AppMethodBeat.o(103867);
    return localc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.a
 * JD-Core Version:    0.6.2
 */