package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.ad;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class f
  implements ad
{
  public final boolean a(cl paramcl, int paramInt, String paramString)
  {
    AppMethodBeat.i(27274);
    boolean bool = e.a(paramcl, paramInt, paramString);
    AppMethodBeat.o(27274);
    return bool;
  }

  public final boolean a(cl paramcl, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    AppMethodBeat.i(27272);
    abf localabf = new abf();
    abl localabl = new abl();
    aar localaar = new aar();
    localaar.LE(5);
    localaar.akW(paramString7);
    localaar.akN(paramString3);
    localaar.LD(paramInt);
    localaar.akH(paramString1);
    localaar.akI(paramString2);
    localaar.alf(paramString11);
    paramString2 = new aau();
    paramString2.fiI = paramString1;
    paramString2.wid = paramInt;
    paramString2.fiG = paramString3;
    paramString2.fiK = paramString5;
    paramString2.fiJ = paramString4;
    paramString2.fiL = paramString6;
    paramString2.fiM = paramString9;
    paramString2.fiN = paramString10;
    localaar.a(paramString2);
    localabl.alD(paramString8);
    localabl.alE(r.Yz());
    localabl.LN(0);
    localabl.ml(bo.anU());
    localabf.a(localabl);
    localabf.wiv.add(localaar);
    paramcl.cvA.title = localaar.title;
    paramcl.cvA.desc = localaar.title;
    paramcl.cvA.cvC = localabf;
    paramcl.cvA.type = 4;
    AppMethodBeat.o(27272);
    return true;
  }

  public final boolean a(cl paramcl, long paramLong)
  {
    AppMethodBeat.i(27275);
    boolean bool = e.a(paramcl, paramLong);
    AppMethodBeat.o(27275);
    return bool;
  }

  public final boolean a(cl paramcl, Intent paramIntent)
  {
    AppMethodBeat.i(27273);
    boolean bool = e.a(paramcl, paramIntent);
    AppMethodBeat.o(27273);
    return bool;
  }

  public final boolean a(cl paramcl, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(27276);
    String str = String.format("%s#%s", new Object[] { paramString1, "" });
    abf localabf = new abf();
    abl localabl = new abl();
    localabl.alD(paramString2);
    localabl.LN(2);
    localabl.ml(System.currentTimeMillis());
    localabl.alI(String.valueOf(paramString1));
    localabl.alF(str);
    paramString1 = new aar();
    paramString1.akZ(str);
    paramString1.oY(true);
    paramString1.LE(5);
    paramString1.akH(paramString3);
    paramString1.akI(paramString4);
    paramString1.alg(paramString5);
    paramString1.oX(true);
    localabf.wiv.add(paramString1);
    paramString1 = new abu();
    paramString1.alT(paramString6);
    paramString1.alS(paramString7);
    localabf.b(paramString1);
    localabf.a(localabl);
    paramcl.cvA.cvC = localabf;
    paramcl.cvA.desc = paramString3;
    paramcl.cvA.type = 5;
    AppMethodBeat.o(27276);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.f
 * JD-Core Version:    0.6.2
 */