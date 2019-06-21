package com.tencent.mm.plugin.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.List;

public final class b extends a
{
  protected final List<com.tencent.mm.plugin.f.b.a> Q(bi parambi)
  {
    com.tencent.mm.plugin.f.b.a locala1 = null;
    com.tencent.mm.plugin.f.b.a locala2 = null;
    AppMethodBeat.i(18617);
    if (parambi == null)
    {
      AppMethodBeat.o(18617);
      parambi = locala2;
      return parambi;
    }
    Object localObject = bo.anj(parambi.field_content);
    if (localObject != null);
    for (localObject = j.b.me((String)localObject); ; localObject = null)
    {
      if (localObject == null)
      {
        ab.e("MicroMsg.AppMsgImgMsgHandler", "content is null");
        AppMethodBeat.o(18617);
        parambi = locala2;
        break;
      }
      locala2 = R(parambi);
      com.tencent.mm.pluginsdk.model.app.b localb = am.aUq().aiE(((j.b)localObject).csD);
      long l = 0L;
      localObject = locala1;
      if (localb != null)
      {
        localObject = localb.field_fileFullPath;
        l = e.asZ((String)localObject);
      }
      locala2.field_msgSubType = 30;
      locala2.field_path = Gh((String)localObject);
      locala2.field_size = l;
      localObject = o.ahl().I(parambi.field_imgPath, true);
      l = e.asZ((String)localObject);
      locala1 = R(parambi);
      locala1.field_msgSubType = 31;
      locala1.field_path = Gh((String)localObject);
      locala1.field_size = l;
      ab.i("MicroMsg.AppMsgImgMsgHandler", "%s create app msg wx file index app[%s] thumb[%s]", new Object[] { aZm(), locala2, locala1 });
      parambi = new ArrayList();
      parambi.add(locala2);
      parambi.add(locala1);
      AppMethodBeat.o(18617);
      break;
    }
  }

  protected final String aZm()
  {
    AppMethodBeat.i(18618);
    String str = "AppMsgImg_" + hashCode();
    AppMethodBeat.o(18618);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.b
 * JD-Core Version:    0.6.2
 */