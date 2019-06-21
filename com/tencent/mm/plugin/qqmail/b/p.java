package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class p
{
  List<p.a> callbacks;
  long pui;
  private k puj;
  a puk;
  private int pul;
  int pum;
  private int pun;
  int puo;
  int status;

  p(String paramString)
  {
    AppMethodBeat.i(67964);
    this.pui = 0L;
    this.pul = 0;
    this.pum = 1;
    this.pun = 2;
    this.puo = 3;
    this.status = this.pul;
    this.puj = new k(paramString, 1);
    paramString = k.readFromFile(this.puj.ptQ + "address");
    if (paramString != null)
    {
      this.puj.a("address", null, paramString);
      e.deleteFile(this.puj.ptQ + "address");
      if (paramString == null)
        break label218;
    }
    while (true)
    {
      try
      {
        a locala = new com/tencent/mm/plugin/qqmail/b/a;
        locala.<init>();
        this.puk = locala.be(paramString);
        this.callbacks = new ArrayList();
        AppMethodBeat.o(67964);
        return;
        paramString = this.puj.t("address", null);
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.Plugin.MailAddrMgr", paramString, "", new Object[0]);
        this.puk = new a();
        this.puk.Vc("");
        continue;
      }
      label218: this.puk = new a();
      this.puk.Vc("");
    }
  }

  public static o Vj(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(67972);
    if (paramString == null)
    {
      AppMethodBeat.o(67972);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = paramString.trim();
      int i = str.trim().lastIndexOf(" ");
      if (i == -1)
      {
        AppMethodBeat.o(67972);
        paramString = localObject;
      }
      else
      {
        paramString = new o();
        paramString.name = str.substring(0, i);
        paramString.nJq = str.substring(i + 1);
        AppMethodBeat.o(67972);
      }
    }
  }

  public final List<o> Vi(String paramString)
  {
    AppMethodBeat.i(67966);
    Object localObject = this.puk.ptp;
    if (this.status <= this.pum)
    {
      ccq();
      AppMethodBeat.o(67966);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      if ((paramString == null) || (paramString.length() == 0))
      {
        AppMethodBeat.o(67966);
        paramString = (String)localObject;
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          o localo = (o)((Iterator)localObject).next();
          if ((localo != null) && (((localo.name != null) && (localo.name.contains(paramString))) || ((localo.puh != null) && (localo.puh.contains(paramString))) || ((localo.nJq != null) && (localo.nJq.contains(paramString)))))
          {
            a.b(localo);
            localArrayList.add(localo);
          }
        }
        AppMethodBeat.o(67966);
        paramString = localArrayList;
      }
    }
  }

  public final void a(p.a parama)
  {
    AppMethodBeat.i(67968);
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      if ((p.a)localIterator.next() == parama)
        AppMethodBeat.o(67968);
    while (true)
    {
      return;
      this.callbacks.add(parama);
      AppMethodBeat.o(67968);
    }
  }

  public final void b(p.a parama)
  {
    AppMethodBeat.i(67969);
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
    {
      p.a locala = (p.a)localIterator.next();
      if (locala == parama)
      {
        this.callbacks.remove(locala);
        AppMethodBeat.o(67969);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(67969);
    }
  }

  public final void cG(List<o> paramList)
  {
    AppMethodBeat.i(67970);
    a locala = this.puk;
    if ((paramList == null) || (paramList.size() == 0))
    {
      save();
      AppMethodBeat.o(67970);
      return;
    }
    paramList = paramList.iterator();
    label141: 
    while (true)
    {
      label40: o localo1;
      Iterator localIterator;
      if (paramList.hasNext())
      {
        localo1 = (o)paramList.next();
        localIterator = locala.ptp.iterator();
      }
      for (int i = 0; ; i++)
      {
        if (!localIterator.hasNext())
          break label141;
        o localo2 = (o)localIterator.next();
        if (localo2.nJq.equalsIgnoreCase(localo1.nJq))
        {
          locala.Bo(i);
          localo2.pug += 1;
          locala.a(localo2);
          break label40;
          break;
        }
      }
    }
  }

  public final void ccq()
  {
    AppMethodBeat.i(67967);
    if (this.status == this.pun)
      AppMethodBeat.o(67967);
    while (true)
    {
      return;
      if (bo.anU() - this.pui > 600000L)
        break;
      localObject = this.callbacks.iterator();
      while (((Iterator)localObject).hasNext())
        ((p.a)((Iterator)localObject).next()).onComplete();
      AppMethodBeat.o(67967);
    }
    this.status = this.pun;
    HashMap localHashMap = new HashMap();
    if (this.puk.ptn == null);
    for (Object localObject = ""; ; localObject = this.puk.ptn)
    {
      localHashMap.put("syncinfo", localObject);
      ab.d("MicroMsg.Plugin.MailAddrMgr", "%s", new Object[] { "sync~~~" });
      ac.ccC().b("/cgi-bin/syncaddrlist", localHashMap, new p.1(this));
      AppMethodBeat.o(67967);
      break;
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(67965);
    this.callbacks.clear();
    AppMethodBeat.o(67965);
  }

  final void save()
  {
    AppMethodBeat.i(67971);
    try
    {
      this.puj.a("address", null, this.puk.toByteArray());
      AppMethodBeat.o(67971);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Plugin.MailAddrMgr", localIOException, "", new Object[0]);
        AppMethodBeat.o(67971);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.p
 * JD-Core Version:    0.6.2
 */