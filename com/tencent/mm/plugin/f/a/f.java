package com.tencent.mm.plugin.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.List;

public final class f extends a
{
  protected final List<com.tencent.mm.plugin.f.b.a> Q(bi parambi)
  {
    AppMethodBeat.i(18625);
    if (parambi == null)
    {
      parambi = null;
      AppMethodBeat.o(18625);
    }
    while (true)
    {
      return parambi;
      com.tencent.mm.plugin.f.b.a locala = R(parambi);
      parambi = q.getFullPath(parambi.field_imgPath);
      long l = e.cs(parambi);
      locala.field_msgSubType = 10;
      locala.field_path = Gh(parambi);
      locala.field_size = l;
      ab.i("MicroMsg.VoiceMsgHandler", "%s create voice wx file index voice[%s]", new Object[] { aZm(), locala });
      parambi = new ArrayList();
      parambi.add(locala);
      AppMethodBeat.o(18625);
    }
  }

  protected final String aZm()
  {
    AppMethodBeat.i(18626);
    String str = "voice_" + hashCode();
    AppMethodBeat.o(18626);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.f
 * JD-Core Version:    0.6.2
 */