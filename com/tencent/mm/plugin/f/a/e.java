package com.tencent.mm.plugin.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.List;

public final class e extends a
{
  protected final List<com.tencent.mm.plugin.f.b.a> Q(bi parambi)
  {
    AppMethodBeat.i(18623);
    if (parambi == null)
    {
      parambi = null;
      AppMethodBeat.o(18623);
    }
    while (true)
    {
      return parambi;
      o.all();
      String str = t.uh(parambi.field_imgPath);
      long l = com.tencent.mm.vfs.e.asZ(str);
      com.tencent.mm.plugin.f.b.a locala1 = R(parambi);
      locala1.field_msgSubType = 1;
      locala1.field_path = Gh(str);
      locala1.field_size = l;
      o.all();
      str = t.ui(parambi.field_imgPath);
      l = com.tencent.mm.vfs.e.asZ(str);
      com.tencent.mm.plugin.f.b.a locala2 = R(parambi);
      locala2.field_msgSubType = 2;
      locala2.field_path = Gh(str);
      locala2.field_size = l;
      ab.i("MicroMsg.VideoMsgHandler", "%s create video wx file index video[%s] thumb[%s]", new Object[] { aZm(), locala1, locala2 });
      parambi = new ArrayList();
      parambi.add(locala1);
      parambi.add(locala2);
      AppMethodBeat.o(18623);
    }
  }

  protected final String aZm()
  {
    AppMethodBeat.i(18624);
    String str = "video_" + hashCode();
    AppMethodBeat.o(18624);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.e
 * JD-Core Version:    0.6.2
 */