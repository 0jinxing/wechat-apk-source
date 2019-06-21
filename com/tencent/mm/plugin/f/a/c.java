package com.tencent.mm.plugin.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.at.g;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.List;

public final class c extends a
{
  protected final List<com.tencent.mm.plugin.f.b.a> Q(bi parambi)
  {
    long l = 0L;
    Object localObject1 = null;
    b localb = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(18619);
    if (parambi == null)
    {
      AppMethodBeat.o(18619);
      parambi = localObject3;
      return parambi;
    }
    Object localObject4 = bo.anj(parambi.field_content);
    if (localObject4 != null);
    for (localObject4 = j.b.me((String)localObject4); ; localObject4 = null)
    {
      if (localObject4 == null)
      {
        ab.e("MicroMsg.AppMsgMsgHandler", "content is null");
        AppMethodBeat.o(18619);
        parambi = localObject3;
        break;
      }
      com.tencent.mm.plugin.f.b.a locala = R(parambi);
      int i;
      switch (((j.b)localObject4).type)
      {
      case 3:
      case 4:
      case 5:
      default:
        AppMethodBeat.o(18619);
        parambi = localObject3;
        break;
      case 2:
        localb = am.aUq().aiE(((j.b)localObject4).csD);
        localObject4 = localObject1;
        if (localb != null)
        {
          localObject4 = localb.field_fileFullPath;
          l = e.asZ((String)localObject4);
        }
        locala.field_msgSubType = 30;
        locala.field_path = Gh((String)localObject4);
        locala.field_size = l;
        i = 31;
      case 7:
      case 6:
        while (true)
        {
          localObject1 = o.ahl().I(parambi.field_imgPath, true);
          l = e.asZ((String)localObject1);
          localObject4 = R(parambi);
          ((com.tencent.mm.plugin.f.b.a)localObject4).field_msgSubType = i;
          ((com.tencent.mm.plugin.f.b.a)localObject4).field_path = Gh((String)localObject1);
          ((com.tencent.mm.plugin.f.b.a)localObject4).field_size = l;
          ab.i("MicroMsg.AppMsgMsgHandler", "%s create app msg wx file index app[%s] thumb[%s]", new Object[] { aZm(), locala, localObject4 });
          parambi = new ArrayList();
          parambi.add(locala);
          parambi.add(localObject4);
          AppMethodBeat.o(18619);
          break;
          localObject1 = am.aUq().aiE(((j.b)localObject4).csD);
          localObject4 = localb;
          if (localObject1 != null)
          {
            localObject4 = ((b)localObject1).field_fileFullPath;
            l = e.asZ((String)localObject4);
          }
          locala.field_msgSubType = 32;
          locala.field_path = Gh((String)localObject4);
          locala.field_size = l;
          i = 33;
          continue;
          localObject1 = am.aUq().aiE(((j.b)localObject4).csD);
          localObject4 = localObject2;
          if (localObject1 != null)
          {
            localObject4 = ((b)localObject1).field_fileFullPath;
            l = e.asZ((String)localObject4);
          }
          locala.field_msgSubType = 34;
          locala.field_path = Gh((String)localObject4);
          locala.field_size = l;
          i = 35;
        }
      }
    }
  }

  protected final String aZm()
  {
    AppMethodBeat.i(18620);
    String str = "AppMsg_" + hashCode();
    AppMethodBeat.o(18620);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.a.c
 * JD-Core Version:    0.6.2
 */