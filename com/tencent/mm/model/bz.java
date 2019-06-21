package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class bz
  implements com.tencent.mm.ai.e
{
  private Map<String, List<a>> fnI;
  private Map<String, List<a>> fnJ;
  private Map<String, List<o>> fnK;
  private Map<String, n> fnL;

  public bz()
  {
    AppMethodBeat.i(59932);
    this.fnI = new HashMap();
    this.fnJ = new HashMap();
    this.fnK = new HashMap();
    this.fnL = new ConcurrentHashMap();
    AppMethodBeat.o(59932);
  }

  @Deprecated
  private void a(String paramString, e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(59940);
    if (paramBoolean);
    while (true)
    {
      synchronized (this.fnJ)
      {
        paramString = (List)???.get(paramString);
        if ((paramString == null) || (paramString.isEmpty()))
        {
          ab.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
          AppMethodBeat.o(59940);
          return;
          ??? = this.fnI;
        }
      }
      ab.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(paramString.size()) });
      paramString = paramString.iterator();
      while (paramString.hasNext())
        ((a)paramString.next()).a(parama);
      AppMethodBeat.o(59940);
    }
  }

  public final void a(e.c paramc)
  {
  }

  @Deprecated
  public final void a(String paramString, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(59933);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
    {
      AppMethodBeat.o(59933);
      return;
    }
    if (paramBoolean);
    while (true)
    {
      Object localObject;
      while (true)
      {
        synchronized (this.fnJ)
        {
          localObject = (List)???.get(paramString);
          if (localObject != null)
            break label140;
          localObject = new java/util/LinkedList;
          ((LinkedList)localObject).<init>();
          ???.put(paramString, localObject);
          paramString = (String)localObject;
        }
        try
        {
          if (!paramString.contains(parama))
            paramString.add(parama);
          AppMethodBeat.o(59933);
          break;
          ??? = this.fnI;
          continue;
          paramString = finally;
          throw paramString;
        }
        finally
        {
          AppMethodBeat.o(59933);
        }
      }
      label140: paramString = (String)localObject;
    }
  }

  public final void a(String paramString, n paramn)
  {
    AppMethodBeat.i(59937);
    if ((bo.isNullOrNil(paramString)) || (paramn == null))
      AppMethodBeat.o(59937);
    while (true)
    {
      return;
      if (this.fnL.containsKey(paramString))
        ab.w("MicroMsg.SysCmdMsgExtension", "NewXmlConsumer for %s has exist! %s", new Object[] { paramString, bo.dpG() });
      this.fnL.put(paramString, paramn);
      AppMethodBeat.o(59937);
    }
  }

  public final void a(String paramString, o paramo)
  {
    AppMethodBeat.i(59935);
    if ((bo.isNullOrNil(paramString)) || (paramo == null))
    {
      AppMethodBeat.o(59935);
      return;
    }
    while (true)
    {
      Object localObject;
      while (true)
      {
        synchronized (this.fnK)
        {
          localObject = (List)this.fnK.get(paramString);
          if (localObject != null)
            break label127;
          localObject = new java/util/LinkedList;
          ((LinkedList)localObject).<init>();
          this.fnK.put(paramString, localObject);
          paramString = (String)localObject;
        }
        try
        {
          if (!paramString.contains(paramo))
            paramString.add(paramo);
          AppMethodBeat.o(59935);
          break;
          paramString = finally;
          throw paramString;
        }
        finally
        {
          AppMethodBeat.o(59935);
        }
      }
      label127: paramString = (String)localObject;
    }
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(59939);
    Object localObject1 = parama.eAB;
    switch (((cm)localObject1).nao)
    {
    default:
      ab.w("MicroMsg.SysCmdMsgExtension", "cmdAM msgType is %d, ignore, return now", new Object[] { Integer.valueOf(((cm)localObject1).nao) });
      AppMethodBeat.o(59939);
      parama = null;
    case 10001:
    case 10002:
    }
    while (true)
    {
      return parama;
      a(aa.a(((cm)localObject1).vEB), parama, false);
      com.tencent.mm.plugin.report.e.pXa.X(10395, String.valueOf(((cm)localObject1).ptF));
      AppMethodBeat.o(59939);
      parama = null;
      continue;
      Object localObject2 = aa.a(((cm)localObject1).vED);
      if (bo.isNullOrNil((String)localObject2))
      {
        ab.e("MicroMsg.SysCmdMsgExtension", "null msg content");
        AppMethodBeat.o(59939);
        parama = null;
      }
      else
      {
        String str;
        if (((String)localObject2).startsWith("~SEMI_XML~"))
        {
          localObject1 = be.amR((String)localObject2);
          if (localObject1 == null)
          {
            ab.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject2 });
            AppMethodBeat.o(59939);
            parama = null;
          }
          else
          {
            str = "brand_service";
            label184: ab.d("MicroMsg.SysCmdMsgExtension", "recieve a syscmd_newxml %s subType %s", new Object[] { localObject2, str });
            if (str != null)
              a(str, parama, true);
          }
        }
        else
        {
          while (true)
          {
            synchronized (this.fnK)
            {
              localObject2 = (List)this.fnK.get(str);
              if ((localObject2 == null) || (((List)localObject2).isEmpty()))
              {
                ab.w("MicroMsg.SysCmdMsgExtension", "listener list is empty, return now");
                localObject2 = (n)this.fnL.get(str);
                if (localObject2 == null)
                  break label603;
                parama = ((n)localObject2).a(str, (Map)localObject1, parama);
                AppMethodBeat.o(59939);
                break;
                int i = ((String)localObject2).indexOf("<sysmsg");
                if (i != -1)
                {
                  localObject1 = ((String)localObject2).substring(i);
                  ab.d("MicroMsg.SysCmdMsgExtension", "oneliang, msg content:%s,sub content:%s", new Object[] { localObject2, localObject1 });
                  localObject1 = br.z((String)localObject1, "sysmsg");
                  if (localObject1 == null)
                  {
                    ab.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
                    AppMethodBeat.o(59939);
                    parama = null;
                    break;
                  }
                  str = (String)((Map)localObject1).get(".sysmsg.$type");
                  break label184;
                }
                i = ((String)localObject2).indexOf("<appmsg");
                if (i != -1)
                {
                  ab.i("MicroMsg.SysCmdMsgExtension", "msgContent start with <appmsg");
                  localObject1 = ((String)localObject2).substring(i);
                  ab.d("MicroMsg.SysCmdMsgExtension", "oneliang, msg content:%s,sub content:%s", new Object[] { localObject2, localObject1 });
                  localObject1 = br.z((String)localObject1, "appmsg");
                  if (localObject1 == null)
                  {
                    ab.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
                    AppMethodBeat.o(59939);
                    parama = null;
                    break;
                  }
                  str = (String)((Map)localObject1).get(".appmsg.title");
                  break label184;
                }
                ab.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg or <appmsg");
                AppMethodBeat.o(59939);
                parama = null;
              }
            }
            ab.i("MicroMsg.SysCmdMsgExtension", "listener list size is %d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
            try
            {
              ??? = ((List)localObject2).iterator();
              while (((Iterator)???).hasNext())
                ((o)((Iterator)???).next()).onNewXmlReceived(str, (Map)localObject1, parama);
            }
            finally
            {
              AppMethodBeat.o(59939);
            }
          }
          label603: ab.e("MicroMsg.SysCmdMsgExtension", "no NewXmlConsumer to consume cmd %s!!", new Object[] { str });
          AppMethodBeat.o(59939);
          parama = null;
        }
      }
    }
  }

  @Deprecated
  public final void b(String paramString, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(59934);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
      AppMethodBeat.o(59934);
    while (true)
    {
      return;
      if (paramBoolean)
        synchronized (this.fnJ)
        {
          label34: paramString = (List)???.get(paramString);
          if (paramString == null)
            break label109;
        }
      try
      {
        paramString.remove(parama);
        AppMethodBeat.o(59934);
        continue;
        ??? = this.fnI;
        break label34;
        paramString = finally;
        throw paramString;
      }
      finally
      {
        AppMethodBeat.o(59934);
      }
      label109: AppMethodBeat.o(59934);
    }
  }

  public final void b(String paramString, n arg2)
  {
    AppMethodBeat.i(59938);
    if ((bo.isNullOrNil(paramString)) || (??? == null))
      AppMethodBeat.o(59938);
    while (true)
    {
      return;
      synchronized (this.fnL)
      {
        this.fnL.remove(paramString);
        AppMethodBeat.o(59938);
      }
    }
  }

  public final void b(String paramString, o paramo)
  {
    AppMethodBeat.i(59936);
    if ((bo.isNullOrNil(paramString)) || (paramo == null))
      AppMethodBeat.o(59936);
    while (true)
    {
      return;
      synchronized (this.fnK)
      {
        paramString = (List)this.fnK.get(paramString);
        if (paramString == null)
          break label94;
      }
      try
      {
        paramString.remove(paramo);
        AppMethodBeat.o(59936);
        continue;
        paramString = finally;
        throw paramString;
      }
      finally
      {
        AppMethodBeat.o(59936);
      }
      label94: AppMethodBeat.o(59936);
    }
  }

  public static abstract interface a
  {
    public abstract void a(e.a parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bz
 * JD-Core Version:    0.6.2
 */