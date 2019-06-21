package com.tencent.mm.x;

import android.os.Looper;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class a
{
  static a eEQ;
  public b eER;
  ArrayList<WeakReference<a.a>> eES;
  private final int eET;
  private final int eEU;
  private ak handler;
  public boolean initialized;

  public a()
  {
    AppMethodBeat.i(77702);
    this.eER = new b();
    this.eES = new ArrayList();
    this.initialized = false;
    this.eET = 0;
    this.eEU = 1;
    this.handler = new a.1(this, Looper.getMainLooper());
    AppMethodBeat.o(77702);
  }

  private void a(ac.a parama, int paramInt, String paramString)
  {
    AppMethodBeat.i(77709);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
      AppMethodBeat.o(77709);
    }
    while (true)
    {
      return;
      this.eER.b(parama, paramInt, paramString);
      this.handler.sendMessage(this.handler.obtainMessage(0, new a.b(this, parama, paramInt, paramString)));
      AppMethodBeat.o(77709);
    }
  }

  private void e(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(77708);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "updateDataSource NewBadge has not initialized");
      AppMethodBeat.o(77708);
    }
    while (true)
    {
      return;
      this.eER.f(paramInt1, paramInt2, paramString);
      this.handler.sendMessage(this.handler.obtainMessage(0, new a.b(this, paramInt1, paramInt2, paramString)));
      AppMethodBeat.o(77708);
    }
  }

  public static int parseInt(String paramString)
  {
    AppMethodBeat.i(77719);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(77719);
    }
    while (true)
    {
      return i;
      i = bo.ank(paramString);
      AppMethodBeat.o(77719);
    }
  }

  public final void a(ac.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(77705);
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      a(parama, 1, str);
      AppMethodBeat.o(77705);
      return;
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(77720);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "addWatch NewBadge has not initialized");
      AppMethodBeat.o(77720);
    }
    while (true)
    {
      return;
      this.eES.add(new WeakReference(parama));
      AppMethodBeat.o(77720);
    }
  }

  public final boolean a(ac.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(77718);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "queryHasDotSourceValue NewBadge has not initialized");
      AppMethodBeat.o(77718);
    }
    while (true)
    {
      return bool;
      parama = this.eER.f(parama);
      if (parama == null)
      {
        AppMethodBeat.o(77718);
      }
      else if (parseInt(parama.value) == 0)
      {
        AppMethodBeat.o(77718);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77718);
      }
    }
  }

  public final boolean a(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(77714);
    boolean bool;
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
      AppMethodBeat.o(77714);
      bool = false;
    }
    while (true)
    {
      return bool;
      b localb = this.eER;
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSourceKey %s, watcherId %d, type %d", new Object[] { parama, Integer.valueOf(paramInt), Integer.valueOf(2) });
      b.a locala = localb.f(parama);
      if (locala == null)
      {
        ab.d("MicroMsg.NewBadgeDecoder", "[carl] peek, dataSource == null");
        parama = null;
      }
      while (true)
      {
        if (parama != null)
          break label226;
        AppMethodBeat.o(77714);
        bool = false;
        break;
        if ((locala.type & 0x2) == 0)
        {
          ab.d("MicroMsg.NewBadgeDecoder", "[alex] peek, dataSource.type is wrong");
          parama = null;
        }
        else
        {
          b.b localb1 = localb.jy(paramInt);
          if (localb1 != null)
          {
            String str = (String)localb1.eFj.get(parama.name());
            if ((str != null) && (str.equals(locala.cxb)))
            {
              parama = null;
            }
            else
            {
              if (str == null)
              {
                str = localb.PI();
                localb1.eFj.put(parama.name(), str);
                localb.a(localb1);
              }
              parama = locala;
            }
          }
          else
          {
            ab.e("MicroMsg.NewBadgeDecoder", "[carl] peek, watcher == null");
            parama = null;
          }
        }
      }
      label226: if (parseInt(parama.value) == 0)
      {
        AppMethodBeat.o(77714);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(77714);
        bool = true;
      }
    }
  }

  public final boolean a(ac.a parama1, ac.a parama2)
  {
    boolean bool = false;
    AppMethodBeat.i(77711);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
      AppMethodBeat.o(77711);
    }
    while (true)
    {
      return bool;
      parama1 = this.eER.a(parama1, parama2, 1);
      if (parama1 == null)
      {
        AppMethodBeat.o(77711);
      }
      else if (parseInt(parama1.value) == 0)
      {
        AppMethodBeat.o(77711);
      }
      else
      {
        AppMethodBeat.o(77711);
        bool = true;
      }
    }
  }

  public final void b(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(77717);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
      AppMethodBeat.o(77717);
      return;
    }
    b localb = this.eER;
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %s, watcherKey %d", new Object[] { parama, Integer.valueOf(paramInt) });
    b.a locala = localb.f(parama);
    if (locala == null)
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
    while (true)
    {
      this.handler.sendMessage(this.handler.obtainMessage(1, new a.c(this, paramInt, parama)));
      AppMethodBeat.o(77717);
      break;
      b.b localb1 = localb.jy(paramInt);
      b.b localb2 = localb1;
      if (localb1 == null)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
        localb2 = localb.jw(paramInt);
        localb.eFc.put(paramInt, localb2);
      }
      localb2.eFj.put(parama.name(), locala.cxb);
      localb.a(localb2);
    }
  }

  public final void b(ac.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(77707);
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      a(parama, 2, str);
      AppMethodBeat.o(77707);
      return;
    }
  }

  public final void b(a.a parama)
  {
    AppMethodBeat.i(77721);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "removeWatch NewBadge has not initialized");
      AppMethodBeat.o(77721);
    }
    while (true)
    {
      return;
      Object localObject1 = null;
      int i = 0;
      Object localObject2;
      while (i < this.eES.size())
      {
        WeakReference localWeakReference = (WeakReference)this.eES.get(i);
        if ((localWeakReference != null) && (localWeakReference.get() != null))
        {
          localObject2 = localObject1;
          if (localWeakReference.get() != parama);
        }
        else
        {
          localObject2 = localObject1;
          if (localObject1 == null)
            localObject2 = new ArrayList();
          ((ArrayList)localObject2).add(localWeakReference);
        }
        i++;
        localObject1 = localObject2;
      }
      if (localObject1 != null)
      {
        localObject2 = localObject1.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          parama = (WeakReference)((Iterator)localObject2).next();
          this.eES.remove(parama);
        }
        localObject1.clear();
      }
      AppMethodBeat.o(77721);
    }
  }

  public final boolean b(ac.a parama1, ac.a parama2)
  {
    boolean bool = false;
    AppMethodBeat.i(77713);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
      AppMethodBeat.o(77713);
    }
    while (true)
    {
      return bool;
      parama1 = this.eER.a(parama1, parama2, 2);
      if (parama1 == null)
      {
        AppMethodBeat.o(77713);
      }
      else if (parseInt(parama1.value) == 0)
      {
        AppMethodBeat.o(77713);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77713);
      }
    }
  }

  public final boolean bX(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(77710);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "hasNew NewBadge has not initialized");
      AppMethodBeat.o(77710);
    }
    while (true)
    {
      return bool;
      b.a locala = this.eER.F(paramInt1, paramInt2, 1);
      if (locala == null)
      {
        AppMethodBeat.o(77710);
      }
      else if (parseInt(locala.value) == 0)
      {
        AppMethodBeat.o(77710);
      }
      else
      {
        AppMethodBeat.o(77710);
        bool = true;
      }
    }
  }

  public final boolean bY(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(77712);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "hasDot NewBadge has not initialized");
      AppMethodBeat.o(77712);
    }
    while (true)
    {
      return bool;
      b.a locala = this.eER.F(paramInt1, paramInt2, 2);
      if (locala == null)
      {
        AppMethodBeat.o(77712);
      }
      else if (parseInt(locala.value) == 0)
      {
        AppMethodBeat.o(77712);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(77712);
      }
    }
  }

  public final void bZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77715);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
      AppMethodBeat.o(77715);
      return;
    }
    b localb = this.eER;
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %d, watcherId %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b.a locala = localb.jx(paramInt1);
    if (locala == null)
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
    while (true)
    {
      this.handler.sendMessage(this.handler.obtainMessage(1, new a.c(this, paramInt2, paramInt1)));
      AppMethodBeat.o(77715);
      break;
      b.b localb1 = localb.jy(paramInt2);
      b.b localb2 = localb1;
      if (localb1 == null)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
        localb2 = localb.jw(paramInt2);
        localb.eFc.put(paramInt2, localb2);
      }
      localb2.eFi.put(paramInt1, locala.cxb);
      localb.a(localb2);
    }
  }

  public final void c(ac.a parama1, ac.a parama2)
  {
    AppMethodBeat.i(77716);
    if (!this.initialized)
    {
      ab.w("MicroMsg.NewBadge", "markRead NewBadge has not initialized");
      AppMethodBeat.o(77716);
      return;
    }
    b localb = this.eER;
    ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, doWatch %s, watcherKey %s", new Object[] { parama1, parama2 });
    b.a locala = localb.f(parama1);
    if (locala == null)
      ab.d("MicroMsg.NewBadgeDecoder", "[carl] doWatch, dataSource == null");
    while (true)
    {
      this.handler.sendMessage(this.handler.obtainMessage(1, new a.c(this, parama2, parama1)));
      AppMethodBeat.o(77716);
      break;
      b.b localb1 = localb.g(parama2);
      b.b localb2 = localb1;
      if (localb1 == null)
      {
        ab.e("MicroMsg.NewBadgeDecoder", "[carl] doWatch, watcher == null, do some fix");
        localb2 = localb.e(parama2);
        localb.eFd.put(parama2, localb2);
      }
      localb2.eFj.put(parama1.name(), locala.cxb);
      localb.a(localb2);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(77703);
    this.initialized = true;
    this.eER.eFf = g.RP().Ry();
    AppMethodBeat.o(77703);
  }

  public final void x(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(77704);
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      e(paramInt, 1, str);
      AppMethodBeat.o(77704);
      return;
    }
  }

  public final void y(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(77706);
    if (!paramBoolean);
    for (String str = "0"; ; str = "1")
    {
      e(paramInt, 2, str);
      AppMethodBeat.o(77706);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.a
 * JD-Core Version:    0.6.2
 */