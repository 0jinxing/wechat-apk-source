package com.tencent.mm.plugin.wenote.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.le;
import com.tencent.mm.g.a.le.a;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.v;
import com.tencent.mm.plugin.wenote.model.a.w;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class c
  implements p, com.tencent.mm.plugin.record.a.d
{
  private static void a(com.tencent.mm.plugin.wenote.model.e parame)
  {
    int i = 0;
    AppMethodBeat.i(26592);
    com.tencent.mm.plugin.wenote.model.d locald = com.tencent.mm.plugin.wenote.model.c.ddG().uMN;
    if (locald == null)
      AppMethodBeat.o(26592);
    String str;
    while (true)
    {
      return;
      if (!parame.isFinished())
        break label508;
      if (!com.tencent.mm.a.e.ct(parame.field_path))
      {
        AppMethodBeat.o(26592);
      }
      else
      {
        str = (String)locald.uMS.get(parame.field_dataId);
        if (bo.isNullOrNil(str))
          break label508;
        ab.d("MicroMsg.Note.WNNoteFavCdnChangedListener", "on cdn status change,editorId[%s]", new Object[] { str });
        if ((!parame.field_dataId.endsWith("_t")) || (locald.uMT.get(str) == null))
          break;
        if (((o)locald.uMT.get(str)).getType() == 2)
          ((o)locald.uMT.get(str)).cHg = parame.field_path;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(str, (com.tencent.mm.plugin.wenote.model.a.c)locald.uMT.get(str));
        locald.uMS.remove(parame.field_dataId);
        AppMethodBeat.o(26592);
      }
    }
    Object localObject1;
    Object localObject2;
    if (!str.equals("WeNoteHtmlFile"))
      label403: if (!locald.uMS.containsValue("WeNoteHtmlFile"))
      {
        localObject1 = new le();
        ((le)localObject1).cHe.cGW = str;
        ((le)localObject1).cHe.cHg = parame.field_path;
        ((le)localObject1).cHe.type = 1;
        ((le)localObject1).cHe.itemType = ((o)locald.uMT.get(str)).type;
        if (((le)localObject1).cHe.itemType != 4)
        {
          localObject2 = (o)locald.uMT.get(str);
          if (((le)localObject1).cHe.itemType == 2)
            break label351;
          ((o)localObject2).cHg = parame.field_path;
        }
        while (true)
        {
          ((o)localObject2).uOp = true;
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(str, (com.tencent.mm.plugin.wenote.model.a.c)localObject2);
          if (5 != ((le)localObject1).cHe.itemType)
            break label367;
          AppMethodBeat.o(26592);
          break;
          label351: com.tencent.mm.plugin.wenote.b.c.ht(parame.field_path, ((o)localObject2).cHg);
        }
        label367: if (((le)localObject1).cHe.itemType == 4)
        {
          localObject2 = locald.agV(parame.field_dataId);
          if (localObject2 == null)
          {
            ab.e("MicroMsg.Note.WNNoteFavCdnChangedListener", "favData is null");
            i = 0;
            ((le)localObject1).cHe.cAP = i;
            ((o)locald.uMT.get(str)).cHg = parame.field_path;
            ((o)locald.uMT.get(str)).uOp = true;
            com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(str, (com.tencent.mm.plugin.wenote.model.a.c)locald.uMT.get(str));
          }
        }
        else
        {
          ab.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "WNNote: publish insertevnet:%s,%s", new Object[] { ((le)localObject1).cHe.cGW, ((le)localObject1).cHe.cHg });
          label495: break label619;
        }
      }
    label705: 
    while (true)
    {
      locald.uMS.remove(parame.field_dataId);
      label508: AppMethodBeat.o(26592);
      break;
      i = ((aar)localObject2).duration;
      break label403;
      if (locald.uMP.cHh == -1L);
      for (localObject1 = (w)locald.uMR.get(Long.toString(locald.uMP.cvx)); ; localObject1 = (w)locald.uMR.get(Long.toString(locald.uMP.cHh)))
      {
        if ((localObject1 != null) && (((w)localObject1).uOF != null))
          break label609;
        AppMethodBeat.o(26592);
        break;
      }
      label609: localObject2 = ((w)localObject1).uOF.iterator();
      label619: if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (o)((Iterator)localObject2).next();
        if (!((o)localObject1).uOo.equals(str))
          break label495;
        ((o)localObject1).uOp = true;
        if (((o)localObject1).type == 4)
        {
          v localv = (v)localObject1;
          localv.hNN = com.tencent.mm.plugin.wenote.model.d.uNb;
          localObject2 = locald.agV(parame.field_dataId);
          if (localObject2 == null)
          {
            ab.e("MicroMsg.Note.WNNoteFavCdnChangedListener", "favData is null");
            localv.length = ((int)f.fY(i));
            localv.uOC = f.K(ah.getContext(), localv.length);
            localv.cAP = i;
          }
        }
        while (true)
        {
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().a(str, (com.tencent.mm.plugin.wenote.model.a.c)localObject1);
          break;
          i = ((aar)localObject2).duration;
          break label705;
          if (((o)localObject1).getType() == 2)
            com.tencent.mm.plugin.wenote.b.c.ht(parame.field_path, ((o)locald.uMT.get(str)).cHg);
          else
            ((o)localObject1).cHg = parame.field_path;
        }
        ab.d("MicroMsg.Note.WNNoteFavCdnChangedListener", "WNNote:webview reload");
        if (locald.uMP.cHh == -1L);
        for (localObject1 = (w)locald.uMR.get(Long.toString(locald.uMP.cvx)); ; localObject1 = (w)locald.uMR.get(Long.toString(locald.uMP.cHh)))
        {
          if (localObject1 != null)
            break label888;
          AppMethodBeat.o(26592);
          break;
        }
        try
        {
          label888: ((w)localObject1).uOE = com.tencent.mm.vfs.e.cy(parame.field_path);
          com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().ahd(((w)localObject1).uOE);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.Note.WNNoteFavCdnChangedListener", localException, "", new Object[0]);
        }
      }
    }
  }

  public final void a(int paramInt, i parami)
  {
    AppMethodBeat.i(26591);
    com.tencent.mm.plugin.wenote.model.e locale = new com.tencent.mm.plugin.wenote.model.e();
    locale.field_localId = parami.field_localId;
    locale.field_dataId = parami.field_dataId;
    locale.field_status = parami.field_status;
    locale.field_offset = parami.field_offset;
    locale.field_totalLen = parami.field_totalLen;
    locale.field_path = parami.field_path;
    a(locale);
    AppMethodBeat.o(26591);
  }

  public final void d(com.tencent.mm.plugin.fav.a.c paramc)
  {
    AppMethodBeat.i(26590);
    Object localObject = f.jD(paramc.field_favLocalId);
    if (localObject == null)
    {
      localObject = com.tencent.mm.plugin.wenote.model.c.ddG().uMN;
      if ((localObject == null) || (((com.tencent.mm.plugin.wenote.model.d)localObject).uMP == null))
        AppMethodBeat.o(26590);
    }
    while (true)
    {
      return;
      if (paramc.field_favLocalId != ((com.tencent.mm.plugin.wenote.model.d)localObject).uMP.cHh)
      {
        ab.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "info null and not match localId:%s, %s", new Object[] { Long.valueOf(paramc.field_favLocalId), Long.valueOf(((com.tencent.mm.plugin.wenote.model.d)localObject).uMP.cHh) });
        AppMethodBeat.o(26590);
        continue;
        if (((g)localObject).field_type != 18)
        {
          ab.i("MicroMsg.Note.WNNoteFavCdnChangedListener", "Not Note CDN onCdnStatusChanged %d", new Object[] { Long.valueOf(paramc.field_favLocalId) });
          AppMethodBeat.o(26590);
        }
      }
      else
      {
        if ((paramc.field_status == 3) && (com.tencent.mm.a.e.ct(paramc.field_path)) && (paramc.field_path.endsWith("..htm")))
          f.y(paramc.field_favLocalId, paramc.field_path);
        localObject = new com.tencent.mm.plugin.wenote.model.e();
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_favLocalId = paramc.field_favLocalId;
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_dataId = paramc.field_dataId;
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_status = paramc.field_status;
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_offset = paramc.field_offset;
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_totalLen = paramc.field_totalLen;
        ((com.tencent.mm.plugin.wenote.model.e)localObject).field_path = paramc.field_path;
        a((com.tencent.mm.plugin.wenote.model.e)localObject);
        AppMethodBeat.o(26590);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.a.c
 * JD-Core Version:    0.6.2
 */