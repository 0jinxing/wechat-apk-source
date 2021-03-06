package com.tencent.mm.ui.chatting.b;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.choosemsgfile.compat.b.a;
import com.tencent.mm.choosemsgfile.compat.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.l.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class a
  implements com.tencent.mm.choosemsgfile.compat.b
{
  public final com.tencent.mm.vending.e.a a(long paramLong, final String paramString, b.a parama)
  {
    AppMethodBeat.i(31169);
    if (bo.isNullOrNil(paramString))
    {
      d.e("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect() mediaId is null, return");
      paramString = null;
      AppMethodBeat.o(31169);
    }
    while (true)
    {
      return paramString;
      a.2 local2 = new a.2(this, paramString, parama, paramLong);
      aw.Rg().a(221, local2);
      paramString = new com.tencent.mm.plugin.record.b.e(paramLong, paramString, new a.3(this, parama));
      aw.Rg().a(paramString, 0);
      paramString = new com.tencent.mm.vending.e.a()
      {
        public final void dead()
        {
          AppMethodBeat.i(31163);
          paramString.a(null);
          g.Rg().c(paramString);
          AppMethodBeat.o(31163);
        }
      };
      AppMethodBeat.o(31169);
    }
  }

  public final String a(bi parambi, com.tencent.mm.at.e parame)
  {
    AppMethodBeat.i(31172);
    parambi = com.tencent.mm.ui.chatting.gallery.e.a(parambi, parame);
    AppMethodBeat.o(31172);
    return parambi;
  }

  public final void a(com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    AppMethodBeat.i(31168);
    if (paramb != null)
    {
      paramb.field_status = 101L;
      paramb.field_lastModifyTime = bo.anT();
      am.aUq().a(paramb, new String[0]);
    }
    AppMethodBeat.o(31168);
  }

  public final void a(bi parambi, final b.a parama)
  {
    AppMethodBeat.i(31174);
    l.a(parambi, new l.a()
    {
      public final void gK(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(31164);
        if (parama != null)
          parama.bQ(paramAnonymousInt1, paramAnonymousInt2);
        if ((paramAnonymousInt1 >= paramAnonymousInt2) && (parama != null))
          parama.m(0, "");
        AppMethodBeat.o(31164);
      }
    });
    AppMethodBeat.o(31174);
  }

  public final boolean a(bi parambi, com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    AppMethodBeat.i(31165);
    boolean bool = l.a(parambi, paramb);
    AppMethodBeat.o(31165);
    return bool;
  }

  public final boolean a(String paramString, bi parambi, b.b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(31167);
    if ((bo.isNullOrNil(paramString)) || (parambi == null))
    {
      d.e("MicroMsg.ChooseMsgFileCompat", "mediaId:%s or msg is null, err", new Object[] { paramString });
      AppMethodBeat.o(31167);
      bool = false;
      return bool;
    }
    a.1 local1 = new a.1(this, paramString, paramb);
    aw.Rg().a(728, local1);
    if (!l.d(paramString, parambi));
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        paramb.n(0, "");
        aw.Rg().b(728, local1);
      }
      AppMethodBeat.o(31167);
      break;
    }
  }

  public final boolean c(bi parambi)
  {
    AppMethodBeat.i(31170);
    boolean bool = com.tencent.mm.ui.chatting.gallery.c.c(parambi);
    AppMethodBeat.o(31170);
    return bool;
  }

  public final com.tencent.mm.at.e d(bi parambi)
  {
    AppMethodBeat.i(31171);
    parambi = com.tencent.mm.ui.chatting.gallery.e.d(parambi);
    AppMethodBeat.o(31171);
    return parambi;
  }

  public final String e(bi parambi)
  {
    AppMethodBeat.i(31173);
    parambi = com.tencent.mm.ui.chatting.gallery.c.e(parambi);
    AppMethodBeat.o(31173);
    return parambi;
  }

  public final boolean f(bi parambi)
  {
    AppMethodBeat.i(31175);
    boolean bool = com.tencent.mm.ui.chatting.gallery.c.f(parambi);
    AppMethodBeat.o(31175);
    return bool;
  }

  public final com.tencent.mm.pluginsdk.model.app.b i(String paramString, long paramLong)
  {
    AppMethodBeat.i(31166);
    paramString = l.i(paramString, paramLong);
    AppMethodBeat.o(31166);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.b.a
 * JD-Core Version:    0.6.2
 */