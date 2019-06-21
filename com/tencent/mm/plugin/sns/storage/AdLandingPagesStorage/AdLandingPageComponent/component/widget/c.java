package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
{
  public boolean caA;
  private RecyclerView iJP;
  public Map<Integer, c.a> qYL;
  private LinearLayoutManager qYM;
  public c.b rcF;

  public c(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(37486);
    this.qYL = new HashMap();
    this.caA = true;
    this.iJP = paramRecyclerView;
    if ((paramRecyclerView.getLayoutManager() == null) || (!(paramRecyclerView.getLayoutManager() instanceof LinearLayoutManager)))
    {
      paramRecyclerView = new IllegalArgumentException("set LinearLayoutManger to RecyclerView first");
      AppMethodBeat.o(37486);
      throw paramRecyclerView;
    }
    if ((paramRecyclerView.getAdapter() == null) || (!(paramRecyclerView.getAdapter() instanceof c.b)))
    {
      paramRecyclerView = new IllegalArgumentException("set Adapter which implemented ExposureListener to RecyclerView first");
      AppMethodBeat.o(37486);
      throw paramRecyclerView;
    }
    this.rcF = ((c.b)paramRecyclerView.getAdapter());
    this.qYM = ((LinearLayoutManager)paramRecyclerView.getLayoutManager());
    this.iJP.a(new c.c(this, paramRecyclerView, (LinearLayoutManager)paramRecyclerView.getLayoutManager()));
    AppMethodBeat.o(37486);
  }

  private void fm(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37489);
    if (paramInt1 <= paramInt2)
    {
      c.a locala1 = (c.a)this.qYL.get(Integer.valueOf(paramInt1));
      c.a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new c.a(this, (byte)0);
        this.qYL.put(Integer.valueOf(paramInt1), locala2);
      }
      if (this.rcF.Du(paramInt1))
      {
        if (locala2.qVK)
          break label104;
        this.rcF.a(paramInt1, this);
        locala2.cpm();
      }
      while (true)
      {
        paramInt1++;
        break;
        label104: if (this.rcF.Dv(paramInt1))
          this.rcF.Dw(paramInt1);
      }
    }
    AppMethodBeat.o(37489);
  }

  public final void cpX()
  {
    AppMethodBeat.i(37487);
    if (!this.caA)
      AppMethodBeat.o(37487);
    while (true)
    {
      return;
      cpl();
      int i = this.qYM.iQ();
      int j = this.qYM.iS();
      Iterator localIterator = this.qYL.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if ((((Integer)localEntry.getKey()).intValue() < i) || (((Integer)localEntry.getKey()).intValue() > j))
        {
          if (((c.a)localEntry.getValue()).qVK)
          {
            this.rcF.Dt(((Integer)localEntry.getKey()).intValue());
            ((c.a)localEntry.getValue()).cpn();
          }
        }
        else if (((c.a)localEntry.getValue()).qVK)
          if (!this.rcF.Du(((Integer)localEntry.getKey()).intValue()))
          {
            this.rcF.Dt(((Integer)localEntry.getKey()).intValue());
            ((c.a)localEntry.getValue()).cpn();
          }
          else if (this.rcF.Dv(((Integer)localEntry.getKey()).intValue()))
          {
            this.rcF.Dw(((Integer)localEntry.getKey()).intValue());
          }
      }
      AppMethodBeat.o(37487);
    }
  }

  public final void cpY()
  {
    AppMethodBeat.i(37490);
    int i;
    int j;
    if (this.qYM != null)
    {
      i = this.qYM.iQ();
      j = this.qYM.iS();
      ab.d("RecyclerViewExposureMgr", "disappear [%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
      if ((i != j) || (i != -1))
        break label137;
      ab.i("RecyclerViewExposureMgr", "no exposuring child");
      AppMethodBeat.o(37490);
    }
    label137: 
    while (true)
      if (i <= j)
      {
        c.a locala = (c.a)this.qYL.get(Integer.valueOf(i));
        if ((locala != null) && (locala.qVK))
        {
          this.rcF.Dt(i);
          locala.cpn();
        }
        i++;
      }
      else
      {
        AppMethodBeat.o(37490);
        break;
      }
  }

  public final void cpl()
  {
    AppMethodBeat.i(37488);
    if (!this.caA)
      AppMethodBeat.o(37488);
    while (true)
    {
      return;
      if (this.qYM != null)
      {
        int i = this.qYM.iQ();
        int j = this.qYM.iS();
        ab.d("RecyclerViewExposureMgr", "appear [%d, %d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if ((i == j) && (i == -1))
        {
          ab.i("RecyclerViewExposureMgr", "no exposuring child");
          AppMethodBeat.o(37488);
        }
        else
        {
          fm(i, j);
        }
      }
      else
      {
        AppMethodBeat.o(37488);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c
 * JD-Core Version:    0.6.2
 */