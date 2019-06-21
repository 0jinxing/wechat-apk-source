package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c
{
  public static boolean a(cl paramcl, c.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(6572);
    if (!parama.valid())
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or wrapper is invalid");
      paramcl.cvA.cvG = 2131299622;
      bool = false;
      AppMethodBeat.o(6572);
    }
    while (true)
    {
      return bool;
      abf localabf = new abf();
      abl localabl = new abl();
      aar localaar = new aar();
      localaar.akN(parama.url);
      localaar.akH(parama.title);
      localaar.akI(parama.desc);
      localaar.akQ(parama.thumbUrl);
      localaar.alf(parama.cMn);
      localaar.oX(true);
      localaar.oY(true);
      localaar.LE(5);
      abu localabu = new abu();
      localabu.alT(parama.thumbUrl);
      localabf.b(localabu);
      localabl.alD(r.Yz());
      localabl.alE(r.Yz());
      localabl.LN(3);
      localabl.ml(bo.anU());
      localabl.alJ(parama.csB);
      localabl.alK(parama.url);
      paramcl.cvA.title = localaar.title;
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 5;
      localabf.a(localabl);
      localabf.wiv.add(localaar);
      AppMethodBeat.o(6572);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.c
 * JD-Core Version:    0.6.2
 */