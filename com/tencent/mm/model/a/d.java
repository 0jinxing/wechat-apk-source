package com.tencent.mm.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class d
  implements com.tencent.mm.ai.e
{
  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(118144);
    parama = parama.eAB;
    if ((parama == null) || (parama.vED == null))
    {
      ab.f("MicroMsg.abtest.AbTestMsgExtension", "[Abtest] AbTestMsgExtension failed, invalid cmdAM");
      AppMethodBeat.o(118144);
    }
    while (true)
    {
      return null;
      String str = aa.a(parama.vED);
      com.tencent.mm.kernel.g.RP().Ry().set(328193, str);
      parama = g.aaK();
      long l = System.currentTimeMillis();
      try
      {
        parama.oQ(str);
        str = (String)com.tencent.mm.kernel.g.RP().Ry().get(328197, null);
        if ((bo.isNullOrNil(str)) || ((parama.fnW != null) && (!str.equals(parama.fnW.fnS))))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(328197, parama.fnW.fnS);
          com.tencent.mm.kernel.g.RP().Ry().set(328195, Boolean.FALSE);
          com.tencent.mm.kernel.g.RP().Ry().set(328194, Boolean.FALSE);
          com.tencent.mm.kernel.g.RP().Ry().set(328196, Boolean.FALSE);
          ab.i("MicroMsg.abtest.AbTestManager", "[cpan] new case id or new case id , reset click value.");
        }
        ab.i("MicroMsg.abtest.AbTestManager", "[Abtest] update use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        if (g.aaK().aaI())
          f.oS(g.aaK().fnW.fnS);
        AppMethodBeat.o(118144);
      }
      catch (Exception parama)
      {
        while (true)
          ab.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { parama.toString() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.a.d
 * JD-Core Version:    0.6.2
 */