package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class a
{
  public static void a(s params, int paramInt)
  {
    AppMethodBeat.i(50621);
    if (params == null)
    {
      ab.w("MicroMsg.AtomStatUtil", "report moov location, but video info is null.");
      AppMethodBeat.o(50621);
      return;
    }
    long l1 = bo.yz();
    o.all();
    String str = t.uh(params.getFileName());
    long l2 = 0L;
    long l3 = 0L;
    int i;
    Object localObject;
    long l4;
    if (c.vC(str))
    {
      i = 1;
      localObject = new b();
      l4 = ((b)localObject).vB(str);
      if (((b)localObject).gjR != null)
      {
        l2 = ((b)localObject).gjR.gjN;
        label92: l3 = l2;
        l2 = l4;
      }
    }
    while (true)
    {
      long l5 = params.cKK;
      localObject = s.ue(params.alw());
      l4 = params.frO;
      params = new StringBuilder();
      params.append(l5).append(";").append((String)localObject).append(";");
      params.append(l4).append(";");
      params.append(i).append(";").append(l2).append(";");
      params.append(l3).append(";").append(paramInt);
      params = params.toString();
      ab.d("MicroMsg.AtomStatUtil", "report moov content : " + params + " cost time: " + bo.az(l1));
      h.pYm.e(11098, new Object[] { Integer.valueOf(8000), params });
      AppMethodBeat.o(50621);
      break;
      l2 = 0L;
      break label92;
      ab.i("MicroMsg.AtomStatUtil", "download video finish, but it is not mp4 file.");
      i = 0;
    }
  }

  public static void j(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(50622);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.w("MicroMsg.AtomStatUtil", "report video remuxing but path is null.");
      AppMethodBeat.o(50622);
    }
    while (true)
    {
      return;
      try
      {
        long l1 = e.asZ(paramString1);
        long l2 = e.asZ(paramString2);
        int i = (int)(100L * l2 / l1);
        paramString1 = new java/lang/StringBuilder;
        paramString1.<init>();
        paramString1.append(paramInt).append(";").append(l1).append(";");
        paramString1.append(l2).append(";").append(i);
        paramString1 = paramString1.toString();
        ab.d("MicroMsg.AtomStatUtil", "report video remuxing : ".concat(String.valueOf(paramString1)));
        h.pYm.e(11098, new Object[] { Integer.valueOf(8001), paramString1 });
        AppMethodBeat.o(50622);
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.AtomStatUtil", paramString1, "", new Object[0]);
        ab.e("MicroMsg.AtomStatUtil", "reportVideoRemuxing error : " + paramString1.toString());
        AppMethodBeat.o(50622);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.a
 * JD-Core Version:    0.6.2
 */