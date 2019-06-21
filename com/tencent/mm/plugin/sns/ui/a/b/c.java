package com.tencent.mm.plugin.sns.ui.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.aao;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends a
{
  public c()
  {
    super(new n());
    AppMethodBeat.i(39954);
    dLZ();
    AppMethodBeat.o(39954);
  }

  public final String w(long paramLong, String paramString)
  {
    AppMethodBeat.i(39955);
    ab.d("MicroMsg.SnsTimeLineVending", "updateLitmitSeq %s %s", new Object[] { Integer.valueOf(af.cnv().cod()), paramString });
    Object localObject = af.cnF();
    int i;
    String str;
    if (paramString.equals(""))
    {
      i = af.cnv().cod() / 2;
      str = i.jW(((o)localObject).g(paramLong, i, false));
      localObject = cuP();
      if (!((String)localObject).equals(""))
        break label130;
      paramString = str;
      label89: localObject = af.cnJ().YX("@__weixintimtline").cqL();
      if (((aao)localObject).wfM != 0L)
        break label149;
      AppMethodBeat.o(39955);
    }
    while (true)
    {
      return paramString;
      i = af.cnv().cod();
      break;
      label130: paramString = str;
      if (str.compareTo((String)localObject) < 0)
        break label89;
      paramString = (String)localObject;
      break label89;
      label149: localObject = i.jW(((aao)localObject).wfM);
      if (paramString.equals(""))
      {
        AppMethodBeat.o(39955);
        paramString = (String)localObject;
      }
      else if (((String)localObject).compareTo(paramString) > 0)
      {
        AppMethodBeat.o(39955);
        paramString = (String)localObject;
      }
      else
      {
        AppMethodBeat.o(39955);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.a.b.c
 * JD-Core Version:    0.6.2
 */