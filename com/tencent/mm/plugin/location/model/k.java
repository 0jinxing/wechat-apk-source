package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.pluginsdk.location.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  implements f
{
  private List<a> callbacks;
  az fBz;
  int h;
  LinkedList<com.tencent.mm.pluginsdk.location.b> nKb;
  com.tencent.mm.pluginsdk.location.b nKc;
  int w;

  public k()
  {
    AppMethodBeat.i(113335);
    this.fBz = new az(1, "location_worker");
    this.nKb = new LinkedList();
    this.nKc = null;
    this.callbacks = new ArrayList();
    this.w = 300;
    this.h = 300;
    start();
    AppMethodBeat.o(113335);
  }

  public static String b(com.tencent.mm.pluginsdk.location.b paramb)
  {
    AppMethodBeat.i(113339);
    String str = com.tencent.mm.a.g.x(paramb.toString().getBytes());
    paramb = c.XX() + str.charAt(0) + str.charAt(1) + "/" + str.charAt(3) + str.charAt(4) + "/";
    if (!com.tencent.mm.vfs.e.ct(paramb))
      new com.tencent.mm.vfs.b(paramb).mkdirs();
    paramb = paramb + "static_map_" + str;
    AppMethodBeat.o(113339);
    return paramb;
  }

  private void iB(boolean paramBoolean)
  {
    AppMethodBeat.i(113340);
    ab.i("MicroMsg.StaticMapServer", "httpgetStaticmapDone %b", new Object[] { Boolean.valueOf(paramBoolean) });
    Iterator localIterator;
    a locala;
    if (paramBoolean)
    {
      if (this.nKc != null)
      {
        localIterator = this.callbacks.iterator();
        while (localIterator.hasNext())
        {
          locala = (a)localIterator.next();
          if (locala != null)
            locala.a(b(this.nKc), this.nKc);
        }
      }
    }
    else if (this.nKc != null)
    {
      localIterator = this.callbacks.iterator();
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if (locala != null)
          locala.a(this.nKc);
      }
    }
    this.nKc = null;
    agx();
    AppMethodBeat.o(113340);
  }

  private void start()
  {
    AppMethodBeat.i(113336);
    com.tencent.mm.kernel.g.Rg().a(648, this);
    AppMethodBeat.o(113336);
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(113333);
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      if (parama.equals((a)localIterator.next()))
        AppMethodBeat.o(113333);
    while (true)
    {
      return;
      this.callbacks.add(parama);
      ab.i("MicroMsg.StaticMapServer", "addMapCallBack " + this.callbacks.size());
      if (this.callbacks.size() == 1)
        start();
      AppMethodBeat.o(113333);
    }
  }

  final void agx()
  {
    AppMethodBeat.i(113338);
    if ((this.nKc == null) && (this.nKb.size() > 0))
      this.nKc = ((com.tencent.mm.pluginsdk.location.b)this.nKb.removeFirst());
    while (true)
    {
      try
      {
        i = Integer.valueOf(bo.bc(com.tencent.mm.m.g.Nu().getValue("StaticMapGetClient"), "")).intValue();
        ab.i("MicroMsg.StaticMapServer", "run local %d", new Object[] { Integer.valueOf(i) });
        if (i == 0)
        {
          g localg = new g(this.nKc.fBr, this.nKc.fBs, this.nKc.cED + 1, this.w, this.h, b(this.nKc), aa.dor());
          com.tencent.mm.kernel.g.Rg().a(localg, 0);
          AppMethodBeat.o(113338);
          return;
        }
      }
      catch (Exception localException)
      {
        int i = 0;
        continue;
        i = this.w;
        int j = this.h;
        if (i * j > 270000)
        {
          i = (int)(i / 1.2D);
          j = (int)(j / 1.2D);
          continue;
        }
        if (bo.gT(ah.getContext()))
        {
          str = String.format("https://maps.googleapis.com/maps/api/staticmap?size=%dx%d&center=%f,%f&zoom=%d&format=jpg&language=%s&sensor=true", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(this.nKc.fBr), Float.valueOf(this.nKc.fBs), Integer.valueOf(this.nKc.cED), aa.dor() });
          this.fBz.e(new k.a(this, true, str, b(this.nKc)));
          AppMethodBeat.o(113338);
          continue;
        }
        String str = String.format("http://st.map.qq.com/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(this.nKc.fBs), Float.valueOf(this.nKc.fBr), Integer.valueOf(this.nKc.cED) });
        this.fBz.e(new k.a(this, false, str, b(this.nKc)));
      }
      AppMethodBeat.o(113338);
    }
  }

  public final void b(a parama)
  {
    AppMethodBeat.i(113334);
    this.callbacks.remove(parama);
    ab.i("MicroMsg.StaticMapServer", "removeCallback " + this.callbacks.size());
    if (this.callbacks.size() == 0)
    {
      ab.i("MicroMsg.StaticMapServer", "clean task");
      this.nKb.clear();
      this.nKc = null;
      stop();
    }
    AppMethodBeat.o(113334);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(113341);
    if (paramm.getType() == 648)
      if ((paramInt1 == 0) && (paramInt2 == 0) && (this.nKc != null))
      {
        iB(true);
        AppMethodBeat.o(113341);
      }
    while (true)
    {
      return;
      iB(false);
      AppMethodBeat.o(113341);
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(113337);
    ab.i("MicroMsg.StaticMapServer", "stop static map server");
    com.tencent.mm.kernel.g.Rg().b(648, this);
    AppMethodBeat.o(113337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.k
 * JD-Core Version:    0.6.2
 */