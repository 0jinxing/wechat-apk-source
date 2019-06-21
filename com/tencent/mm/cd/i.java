package com.tencent.mm.cd;

import android.content.ContentValues;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class i
{
  private ap che;
  private BlockingQueue<a> queue;
  private String table;
  h ybK;

  public i(h paramh, String paramString)
  {
    AppMethodBeat.i(59132);
    this.table = null;
    this.che = new ap(Looper.getMainLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(59130);
        if (!i.this.ybK.isOpen())
          AppMethodBeat.o(59130);
        while (true)
        {
          return false;
          i.this.dvy();
          AppMethodBeat.o(59130);
        }
      }
    }
    , false);
    this.queue = new LinkedBlockingQueue();
    this.ybK = paramh;
    this.table = paramString;
    AppMethodBeat.o(59132);
  }

  private int a(a parama)
  {
    int i = 0;
    AppMethodBeat.i(59133);
    if (parama == null)
    {
      ab.w("MicroMsg.MemoryStorage.Holder", "appendToDisk Holder == null. table:%s", new Object[] { this.table });
      i = -2;
      AppMethodBeat.o(59133);
    }
    while (true)
    {
      return i;
      if ((this.ybK == null) || (!this.ybK.isOpen()))
      {
        ab.e("MicroMsg.MemoryStorage.Holder", "appendToDisk diskDB already close. table:%s", new Object[] { this.table });
        i = -3;
        AppMethodBeat.o(59133);
      }
      else
      {
        if (parama.xBj == 2)
          this.ybK.insert(this.table, parama.xDc, parama.values);
        while (true)
        {
          AppMethodBeat.o(59133);
          break;
          if (parama.xBj == 5)
          {
            this.ybK.delete(this.table, parama.ycf, parama.ycg);
          }
          else if (parama.xBj == 1)
          {
            this.ybK.hY(this.table, parama.sql);
          }
          else if (parama.xBj == 4)
          {
            this.ybK.replace(this.table, parama.xDc, parama.values);
          }
          else
          {
            if (parama.xBj != 3)
              break label245;
            this.ybK.update(this.table, parama.values, parama.ycf, parama.ycg);
          }
        }
        label245: i = -1;
        AppMethodBeat.o(59133);
      }
    }
  }

  final int b(a parama)
  {
    AppMethodBeat.i(59135);
    this.queue.add(parama);
    if (this.queue.size() >= 40)
      dvy();
    if (this.che.doT())
      this.che.ae(60000L, 60000L);
    AppMethodBeat.o(59135);
    return 0;
  }

  public final int dvy()
  {
    AppMethodBeat.i(59134);
    ab.d("MicroMsg.MemoryStorage.Holder", "appendAllToDisk table:%s trans:%b queue:%d", new Object[] { this.table, Boolean.valueOf(this.ybK.inTransaction()), Integer.valueOf(this.queue.size()) });
    if (this.queue.isEmpty())
    {
      AppMethodBeat.o(59134);
      return 0;
    }
    long l;
    if (!this.ybK.inTransaction())
      l = this.ybK.iV(Thread.currentThread().getId());
    while (true)
      if (!this.queue.isEmpty())
      {
        a((a)this.queue.poll());
      }
      else
      {
        if (l > 0L)
          this.ybK.mB(l);
        AppMethodBeat.o(59134);
        break;
        l = 0L;
      }
  }

  public static final class a
  {
    public String sql;
    public ContentValues values;
    public int xBj;
    public String xDc;
    public String ycf;
    public String[] ycg;

    public final void T(String[] paramArrayOfString)
    {
      AppMethodBeat.i(59131);
      if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
        AppMethodBeat.o(59131);
      while (true)
      {
        return;
        this.ycg = new String[paramArrayOfString.length];
        for (int i = 0; i < paramArrayOfString.length; i++)
          this.ycg[i] = new String(paramArrayOfString[i]);
        AppMethodBeat.o(59131);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.i
 * JD-Core Version:    0.6.2
 */