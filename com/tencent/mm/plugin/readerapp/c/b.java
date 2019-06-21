package com.tencent.mm.plugin.readerapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public final class b
{
  public static boolean a(cl paramcl, bl parambl, int paramInt)
  {
    AppMethodBeat.i(76755);
    boolean bool;
    if ((paramcl == null) || (parambl == null))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      bool = false;
      AppMethodBeat.o(76755);
      return bool;
    }
    abf localabf = new abf();
    abl localabl = new abl();
    aar localaar = new aar();
    localabl.alD("newsapp");
    localabl.alE(r.Yz());
    localabl.alE(r.Yz());
    localabl.LN(1);
    localabl.ml(parambl.fna);
    localabl.alH(parambl.fnf);
    localabl.alK(parambl.getUrl());
    localabl.alL("newsapp");
    localaar.akZ(String.valueOf(parambl.fnf));
    Object localObject;
    if (paramInt == 0)
    {
      localObject = q.v(parambl.aan(), parambl.type, "@T");
      label185: if (!e.ct((String)localObject))
        break label310;
      localaar.akW((String)localObject);
    }
    while (true)
    {
      localaar.LE(5);
      localaar.akH(parambl.getTitle());
      localaar.akI(parambl.getDigest());
      localaar.oX(true);
      localabf.a(localabl);
      localabf.wiv.add(localaar);
      paramcl.cvA.desc = parambl.getTitle();
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 5;
      AppMethodBeat.o(76755);
      bool = true;
      break;
      localObject = q.v(parambl.aan(), parambl.type, "@S");
      break label185;
      label310: localaar.oY(true);
      localaar.akQ(parambl.aan());
      localObject = new abu();
      ((abu)localObject).alT(parambl.aan());
      localabf.b((abu)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.c.b
 * JD-Core Version:    0.6.2
 */