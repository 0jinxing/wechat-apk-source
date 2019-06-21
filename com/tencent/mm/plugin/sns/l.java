package com.tencent.mm.plugin.sns;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.modelstat.p.a;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cdh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class l
  implements i
{
  public final String I(bi parambi)
  {
    AppMethodBeat.i(35632);
    parambi = p.I(parambi);
    AppMethodBeat.o(35632);
    return parambi;
  }

  public final String a(String paramString, PString paramPString)
  {
    AppMethodBeat.i(35629);
    paramString = p.a(paramString, paramPString);
    AppMethodBeat.o(35629);
    return paramString;
  }

  public final void a(String paramString, v.b paramb, bi parambi)
  {
    AppMethodBeat.i(35630);
    if (parambi.bAA())
    {
      parambi = j.b.me(parambi.field_content);
      if ((parambi != null) && (!bo.isNullOrNil(parambi.cMn)))
        paramb.j(paramString, parambi.cMn);
    }
    AppMethodBeat.o(35630);
  }

  public final void ai(bi parambi)
  {
    AppMethodBeat.i(35631);
    String str = p.I(parambi);
    cdg localcdg;
    if (str != null)
    {
      Object localObject = Base64.decode(str, 0);
      localcdg = new cdg();
      try
      {
        localcdg.parseFrom((byte[])localObject);
        localObject = localcdg.xcS;
        if (localObject == null)
        {
          AppMethodBeat.o(35631);
          return;
        }
      }
      catch (Exception parambi)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SnsStatExtUtil", parambi, "", new Object[0]);
          AppMethodBeat.o(35631);
        }
      }
      if (!parambi.field_talker.endsWith("@chatroom"))
        break label200;
    }
    label200: for (parambi = p.a.fUh.value; ; parambi = p.a.fUg.value)
    {
      ab.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%s), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { parambi, str, localcdg.xcS.xcV, localcdg.xcS.xcW });
      ((c)g.K(c.class)).e(13235, new Object[] { parambi, localcdg.xcS.xcV, localcdg.xcS.xcW });
      AppMethodBeat.o(35631);
      break;
    }
  }

  public final void b(String paramString, d paramd)
  {
    AppMethodBeat.i(35628);
    p.b(paramString, paramd);
    AppMethodBeat.o(35628);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.l
 * JD-Core Version:    0.6.2
 */