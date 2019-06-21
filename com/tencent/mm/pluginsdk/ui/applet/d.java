package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.sdk.platformtools.bo;

public final class d
  implements p
{
  public final c ajA(String paramString)
  {
    AppMethodBeat.i(11684);
    c.a locala = new c.a();
    locala.ePK = e.rz(paramString);
    locala.ePH = true;
    locala.ePZ = true;
    locala.ePT = 2131231172;
    paramString = locala.ahG();
    AppMethodBeat.o(11684);
    return paramString;
  }

  public final boolean ajy(String paramString)
  {
    AppMethodBeat.i(11682);
    boolean bool = f.kq(paramString);
    AppMethodBeat.o(11682);
    return bool;
  }

  public final Object ajz(String paramString)
  {
    AppMethodBeat.i(11683);
    j localj1 = z.aeV().cH(paramString);
    j localj2;
    if ((localj1 != null) && (!bo.isNullOrNil(localj1.field_userId)))
    {
      localj2 = localj1;
      if (localj1.field_userId.equals(paramString));
    }
    else
    {
      localj2 = new j();
      localj2.field_userId = paramString;
    }
    AppMethodBeat.o(11683);
    return localj2;
  }

  public final String cu(Object paramObject)
  {
    return ((j)paramObject).field_userName;
  }

  public final String cv(Object paramObject)
  {
    return ((j)paramObject).field_headImageUrl;
  }

  public final String cw(Object paramObject)
  {
    return ((j)paramObject).field_userId;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.d
 * JD-Core Version:    0.6.2
 */