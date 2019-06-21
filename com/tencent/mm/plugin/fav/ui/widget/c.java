package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class c extends LinearLayout
{
  private View mpJ;
  public View mpK;
  public View mpL;
  private c.a mpM;
  private boolean mpN;
  private boolean mpO;
  private int mpP;

  public c(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(74678);
    this.mpN = false;
    this.mpO = false;
    setOrientation(1);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    this.mpJ = View.inflate(getContext(), 2130969521, null);
    View localView = View.inflate(getContext(), 2130969500, null);
    localView.findViewById(2131823893).setOnClickListener(new c.1(this));
    this.mpK = localView;
    localView = View.inflate(getContext(), 2130969520, null);
    localView.findViewById(2131823948).setOnClickListener(new c.2(this));
    this.mpL = localView;
    addView(this.mpJ, new LinearLayout.LayoutParams(paramContext));
    addView(this.mpK, new LinearLayout.LayoutParams(paramContext));
    addView(this.mpL, new LinearLayout.LayoutParams(paramContext));
    AppMethodBeat.o(74678);
  }

  private void vI(int paramInt)
  {
    AppMethodBeat.i(74680);
    this.mpP = paramInt;
    ab.i("MicroMsg.FavHeaderView", "showStatusBar status:".concat(String.valueOf(paramInt)));
    if (paramInt == 0)
    {
      this.mpL.setVisibility(8);
      this.mpK.setVisibility(8);
      AppMethodBeat.o(74680);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        if (!this.mpN)
          h.pYm.e(14109, new Object[] { Integer.valueOf(1) });
        this.mpN = true;
        this.mpL.setVisibility(8);
        this.mpK.setVisibility(0);
        this.mpK.findViewById(2131823896).setVisibility(0);
        this.mpK.findViewById(2131823897).setVisibility(8);
        AppMethodBeat.o(74680);
      }
      else if (paramInt == 2)
      {
        this.mpL.setVisibility(0);
        this.mpK.setVisibility(8);
        AppMethodBeat.o(74680);
      }
      else
      {
        if (paramInt == 3)
        {
          if (!this.mpO)
            h.pYm.e(14109, new Object[] { Integer.valueOf(0) });
          this.mpO = true;
          this.mpL.setVisibility(8);
          this.mpK.setVisibility(0);
          this.mpK.findViewById(2131823896).setVisibility(8);
          this.mpK.findViewById(2131823897).setVisibility(0);
        }
        AppMethodBeat.o(74680);
      }
    }
  }

  public final void bwA()
  {
    AppMethodBeat.i(74681);
    List localList = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buX();
    long l;
    int i;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      l = 0L;
      for (i = 0; localIterator.hasNext(); i = 1)
        l = b.a((com.tencent.mm.plugin.fav.a.g)localIterator.next()) + l;
      ab.i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", new Object[] { Integer.valueOf(localList.size()), Long.valueOf(l) });
    }
    while (true)
    {
      if (i != 0)
        if (l > b.buh())
        {
          vI(1);
          AppMethodBeat.o(74681);
        }
      while (true)
      {
        return;
        vI(2);
        AppMethodBeat.o(74681);
        continue;
        if (b.buk())
        {
          vI(3);
          AppMethodBeat.o(74681);
        }
        else
        {
          vI(0);
          AppMethodBeat.o(74681);
        }
      }
      l = 0L;
      i = 0;
    }
  }

  public final void hn(boolean paramBoolean)
  {
    AppMethodBeat.i(74679);
    View localView = this.mpJ;
    if (paramBoolean);
    for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(74679);
      return;
    }
  }

  public final void setCleanFavSpace(c.a parama)
  {
    this.mpM = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.c
 * JD-Core Version:    0.6.2
 */