package com.tencent.mm.loader.g.a;

import a.f.b.j;
import a.l;
import com.tencent.mm.loader.h.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/loader/loader/cfg/DefaultRetrySg;", "Lcom/tencent/mm/loader/loader/cfg/ILoaderRetryStrategy;", "()V", "retryCount", "", "(I)V", "retryTime", "(II)V", "MAX_URL_SIZE", "mRetryMap", "Lcom/tencent/mm/loader/model/MMLRUMap;", "", "Lcom/tencent/mm/loader/loader/cfg/DefaultRetrySg$RecentDownInfo;", "canRetry", "", "task", "Lcom/tencent/mm/loader/loader/IWorkTask;", "RecentDownInfo", "libimageloader_release"})
public final class a
  implements c
{
  private final d<String, a.a> eQt;
  private final int eRr;
  private final int eRs;
  private final int retryCount;

  public a()
  {
    this(5);
  }

  public a(int paramInt)
  {
    this.retryCount = paramInt;
    this.eRs = 2147483647;
    this.eRr = 100;
    this.eQt = new d(this.eRr);
  }

  public final boolean b(com.tencent.mm.loader.g.c paramc)
  {
    j.p(paramc, "task");
    boolean bool;
    if (this.eQt.aj(paramc.Pc()))
    {
      long l = bo.anT();
      a.a locala1 = (a.a)this.eQt.ai(paramc.Pc());
      if ((locala1.eRu >= this.retryCount) && (l - locala1.eRt < this.eRs))
      {
        ab.w("DefaultRetrySg", "check block by recentdown: " + paramc.Pc() + " count " + locala1.eRu + "  time: " + (l - locala1.eRt));
        bool = false;
        return bool;
      }
      a.a locala2 = locala1;
      if (l - locala1.eRt > this.eRs)
      {
        ab.v("DefaultRetrySg", "reset: " + paramc.Pc());
        locala2 = new a.a(this, l, 0);
      }
      locala2.eRu += 1;
      locala2.eRt = l;
      this.eQt.put(paramc.Pc(), locala2);
    }
    while (true)
    {
      bool = true;
      break;
      this.eQt.put(paramc.Pc(), new a.a(this, bo.anT(), 1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.g.a.a
 * JD-Core Version:    0.6.2
 */