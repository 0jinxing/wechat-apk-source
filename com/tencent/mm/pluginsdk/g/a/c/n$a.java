package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n$a<Req extends l> extends f.d<Req>
  implements e
{
  private static final ThreadLocal<j> vfr = new n.a.1();
  private final int vdM;
  private final AtomicInteger vfs;
  public volatile c vft;

  protected n$a(Req paramReq)
  {
    super(paramReq);
    this.vdM = paramReq.vdM;
    this.vfs = new AtomicInteger(this.vdM);
  }

  protected m a(j paramj)
  {
    if (!awe());
    for (paramj = j.a(this); ; paramj = j.a(this))
    {
      return paramj;
      paramj = q.a.diy().ajg(dib());
      if (paramj != null)
      {
        paramj.field_status = 1;
        q.a.diy().h(paramj);
      }
    }
  }

  public boolean awb()
  {
    return false;
  }

  public boolean awc()
  {
    return true;
  }

  public boolean awd()
  {
    return false;
  }

  protected boolean awe()
  {
    return true;
  }

  public boolean awf()
  {
    return true;
  }

  public boolean awg()
  {
    if (this.vfs.decrementAndGet() > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.vft.u(dib(), this.vdM, this.vfs.get());
      return bool;
    }
  }

  public final String dib()
  {
    return ((l)awh()).vdC;
  }

  public final String dis()
  {
    return "GET";
  }

  public final Collection<b> dit()
  {
    Map localMap = ((l)awh()).getRequestHeaders();
    Object localObject1;
    if ((localMap == null) || (localMap.size() == 0))
      localObject1 = null;
    while (true)
    {
      return localObject1;
      Object localObject2 = localMap.keySet();
      if ((localObject2 == null) || (((Set)localObject2).size() == 0))
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = new LinkedList();
        localObject2 = ((Set)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          String str1 = (String)((Iterator)localObject2).next();
          String str2 = (String)localMap.get(str1);
          if (!bo.isNullOrNil(str2))
            ((Collection)localObject1).add(new b(str1, str2));
        }
      }
    }
  }

  public final int diu()
  {
    return ((l)awh()).diu();
  }

  public final String div()
  {
    return "application/x-www-form-urlencoded;charset=utf-8";
  }

  public final int getConnectTimeout()
  {
    return ((l)awh()).getConnectTimeout();
  }

  public final String getFilePath()
  {
    return ((l)awh()).getFilePath();
  }

  public final int getReadTimeout()
  {
    return ((l)awh()).getReadTimeout();
  }

  public String getURL()
  {
    return ((l)awh()).url;
  }

  public boolean gh(long paramLong)
  {
    boolean bool = true;
    this.vft.w(dib(), paramLong);
    long l = bd.dpq();
    ab.i("MicroMsg.ResDownloader.NetworkWorker", "%s: get available size = %d", new Object[] { dib(), Long.valueOf(l) });
    if (l >= paramLong);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final void run()
  {
    m localm = a((j)vfr.get());
    if (localm != null)
      this.vft.a(this, localm);
    while (true)
    {
      return;
      ab.e("MicroMsg.ResDownloader.NetworkWorker", "groupId = %s, performer get null response", new Object[] { awa() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.n.a
 * JD-Core Version:    0.6.2
 */