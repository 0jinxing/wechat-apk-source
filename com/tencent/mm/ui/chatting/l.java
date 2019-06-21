package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.plugin.appbrand.r.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

public final class l
{
  public static j.b a(String paramString, p paramp)
  {
    AppMethodBeat.i(30594);
    j.b localb = new j.b();
    localb.title = paramp.title;
    localb.description = paramp.fjz;
    localb.type = 33;
    localb.fiP = paramp.fjC;
    localb.fiO = paramp.fjD;
    localb.fiQ = paramp.fjG;
    localb.fiZ = paramp.fjF;
    localb.fja = paramp.fjE;
    localb.fiS = "";
    localb.fiR = 2;
    localb.url = paramp.url;
    localb.fjb = paramp.fjI;
    localb.cMm = ("wxapp_" + paramp.fjG + paramp.fjD);
    localb.cMg = paramp.fjC;
    localb.cMh = paramp.fjJ;
    paramp = new com.tencent.mm.af.a();
    paramp.feY = false;
    paramp.feZ = "";
    localb.a(paramp);
    if (bo.isNullOrNil(localb.thumburl))
    {
      paramString = com.tencent.mm.ah.o.act().qo(paramString);
      if (paramString != null)
        localb.thumburl = paramString.ack();
    }
    AppMethodBeat.o(30594);
    return localb;
  }

  public static void b(String paramString1, j.b paramb, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(30593);
    try
    {
      byte[] arrayOfByte = new byte[0];
      Object localObject2 = localObject1;
      if (!bo.isNullOrNil(paramString2))
        if (!paramString2.startsWith("http://"))
        {
          localObject2 = localObject1;
          if (!paramString2.startsWith("https://"));
        }
        else
        {
          localObject2 = b.abR().a(paramString2, null);
        }
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
      {
        ab.i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
        paramString2 = new java/io/ByteArrayOutputStream;
        paramString2.<init>();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, paramString2);
      }
      for (paramString2 = paramString2.toByteArray(); t.kH(paramString1); paramString2 = arrayOfByte)
      {
        i = 1;
        com.tencent.mm.pluginsdk.model.app.l.a(paramb, paramb.fiQ, paramb.title, paramString1, null, paramString2);
        com.tencent.mm.plugin.report.service.h.pYm.e(14127, new Object[] { paramb.fiQ, paramb.fiP, paramb.fiO, paramb.title, paramb.description, "", paramb.url, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(i), paramString1 });
        AppMethodBeat.o(30593);
        return;
        ab.e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ChattingEditModeSendToAppBrand", paramString1, "", new Object[0]);
        ab.e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", new Object[] { paramString1.getLocalizedMessage() });
        AppMethodBeat.o(30593);
        continue;
        int i = 0;
      }
    }
  }

  public static void eU(List<bi> paramList)
  {
    AppMethodBeat.i(30596);
    aw.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(30590);
        Object localObject1 = this.ibp;
        if (!bo.ek((List)localObject1))
        {
          localObject1 = ((List)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            Object localObject2 = (bi)((Iterator)localObject1).next();
            if (((bi)localObject2).drC())
            {
              localObject2 = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(((cy)localObject2).field_msgId, ((cy)localObject2).field_content).fjr;
              if (localObject2 != null)
              {
                Iterator localIterator = ((List)localObject2).iterator();
                while (localIterator.hasNext())
                {
                  localObject2 = (p)localIterator.next();
                  if ((!bo.isNullOrNil(((p)localObject2).fjH)) && (com.tencent.mm.af.l.mg(((p)localObject2).fjC)))
                    b.abR().a(new l.2((p)localObject2), ((p)localObject2).fjH, null, ((com.tencent.mm.modelappbrand.i)g.K(com.tencent.mm.modelappbrand.i.class)).cq(112, 90));
                }
              }
            }
          }
        }
        AppMethodBeat.o(30590);
      }
    });
    AppMethodBeat.o(30596);
  }

  public static boolean f(bi parambi, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(30595);
    if (parambi == null)
      AppMethodBeat.o(30595);
    while (true)
    {
      return bool;
      if (!parambi.drC())
      {
        AppMethodBeat.o(30595);
      }
      else
      {
        parambi = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content).fjr;
        if (!bo.ek(parambi))
        {
          int i;
          if (paramInt >= 0)
          {
            i = paramInt;
            if (paramInt < parambi.size());
          }
          else
          {
            i = 0;
          }
          if (com.tencent.mm.af.l.mg(((p)parambi.get(i)).fjC))
          {
            bool = true;
            AppMethodBeat.o(30595);
          }
        }
        else
        {
          AppMethodBeat.o(30595);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.l
 * JD-Core Version:    0.6.2
 */