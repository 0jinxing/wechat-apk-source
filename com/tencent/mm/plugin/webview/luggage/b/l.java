package com.tencent.mm.plugin.webview.luggage.b;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.webview.luggage.FavUrlTask;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class l
{
  protected Map<Integer, a> mUk;
  protected List<m> ukU;

  public l()
  {
    AppMethodBeat.i(6446);
    this.ukU = new LinkedList();
    this.mUk = new HashMap();
    bDs();
    bDt();
    AppMethodBeat.o(6446);
  }

  private void a(a parama)
  {
    AppMethodBeat.i(6448);
    this.mUk.put(Integer.valueOf(parama.id), parama);
    AppMethodBeat.o(6448);
  }

  private void h(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6450);
    this.ukU.add(new m(paramInt, paramString, paramBoolean));
    AppMethodBeat.o(6450);
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.luggage.d paramd, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(6452);
    if (paramMenuItem == null)
      AppMethodBeat.o(6452);
    while (true)
    {
      return;
      int i = paramMenuItem.getItemId();
      Iterator localIterator = this.ukU.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        paramMenuItem = (m)localIterator.next();
      }
      while ((paramMenuItem == null) || (paramMenuItem.id != i));
      while (true)
      {
        paramMenuItem = (a)this.mUk.get(Integer.valueOf(paramMenuItem.id));
        if (paramMenuItem != null)
          break label108;
        AppMethodBeat.o(6452);
        break;
        paramMenuItem = null;
      }
      label108: paramMenuItem.a(paramContext, paramd);
      AppMethodBeat.o(6452);
    }
  }

  public final void aeg(String paramString)
  {
    AppMethodBeat.i(6455);
    Iterator localIterator = this.ukU.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (localm.name.equals(paramString))
        if (!localm.ukV)
        {
          localm.imK = true;
          AppMethodBeat.o(6455);
        }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(6455);
    }
  }

  public final void aeh(String paramString)
  {
    AppMethodBeat.i(6456);
    Iterator localIterator = this.ukU.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (localm.name.equals(paramString))
      {
        localm.imK = false;
        AppMethodBeat.o(6456);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(6456);
    }
  }

  public final void b(Context paramContext, com.tencent.mm.plugin.webview.luggage.d paramd, com.tencent.mm.ui.base.l paraml)
  {
    AppMethodBeat.i(6451);
    Iterator localIterator = this.ukU.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (m)localIterator.next();
      if (!((m)localObject).imK)
      {
        localObject = (a)this.mUk.get(Integer.valueOf(((m)localObject).id));
        if (localObject != null)
          ((a)localObject).a(paramContext, paramd, paraml);
      }
    }
    AppMethodBeat.o(6451);
  }

  protected void bDs()
  {
    AppMethodBeat.i(6447);
    a(new f());
    a(new j());
    a(new k());
    a(new g());
    a(new d());
    a(new b());
    a(new c());
    a(new e());
    a(new h());
    a(new i());
    AppMethodBeat.o(6447);
  }

  protected void bDt()
  {
    AppMethodBeat.i(6449);
    this.ukU = new LinkedList();
    h(35, "menuItem:minimize", true);
    h(1, "menuItem:share:appMessage", false);
    h(2, "menuItem:share:timeline", false);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 3;
    AppBrandMainProcessService.b(localFavUrlTask);
    if (localFavUrlTask.uhK)
    {
      h(3, "menuItem:favorite", false);
      h(12, "menuItem:editTag", false);
    }
    h(31, "menuItem:search", true);
    h(6, "menuItem:copyUrl", false);
    h(7, "menuItem:openWithSafari", false);
    h(27, "menuItem:finish", true);
    h(28, "menuItem:refresh", true);
    AppMethodBeat.o(6449);
  }

  public final void cXc()
  {
    AppMethodBeat.i(6453);
    Iterator localIterator = this.ukU.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!localm.ukV)
        localm.imK = true;
    }
    AppMethodBeat.o(6453);
  }

  public final void cXd()
  {
    AppMethodBeat.i(6454);
    Iterator localIterator = this.ukU.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!localm.ukV)
        localm.imK = false;
    }
    AppMethodBeat.o(6454);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.b.l
 * JD-Core Version:    0.6.2
 */