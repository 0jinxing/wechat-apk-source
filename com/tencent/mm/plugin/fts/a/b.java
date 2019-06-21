package com.tencent.mm.plugin.fts.a;

import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public abstract class b
  implements k
{
  public boolean aGx;
  private boolean bZq;

  public b()
  {
    ab.i("MicroMsg.FTS.BaseFTS5SearchLogic", "Create %s", new Object[] { getName() });
  }

  protected abstract boolean Pq();

  public a a(i parami)
  {
    return null;
  }

  public void a(String paramString, l paraml, int paramInt, HashMap<String, String> paramHashMap)
  {
  }

  public void addSOSHistory(String paramString)
  {
  }

  public final void create()
  {
    try
    {
      ab.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnCreate %s | isCreated =%b", new Object[] { getName(), Boolean.valueOf(this.bZq) });
      if ((!this.bZq) && (onCreate()))
      {
        ab.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetCreated");
        this.bZq = true;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void deleteSOSHistory()
  {
  }

  public void deleteSOSHistory(String paramString)
  {
  }

  public final void destroy()
  {
    ab.i("MicroMsg.FTS.BaseFTS5SearchLogic", "OnDestroy %s | isDestroyed %b | isCreated %b", new Object[] { getName(), Boolean.valueOf(this.aGx), Boolean.valueOf(this.bZq) });
    if ((!this.aGx) && (this.bZq) && (Pq()))
    {
      ab.i("MicroMsg.FTS.BaseFTS5SearchLogic", "SetDestroyed");
      this.aGx = true;
    }
  }

  public final boolean isCreated()
  {
    return this.bZq;
  }

  protected abstract boolean onCreate();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.b
 * JD-Core Version:    0.6.2
 */