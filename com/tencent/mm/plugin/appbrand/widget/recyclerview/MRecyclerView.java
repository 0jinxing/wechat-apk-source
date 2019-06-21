package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class MRecyclerView extends RecyclerView
{
  private View Ek;
  protected a joL;
  private MRecyclerView.a joM;
  private MRecyclerView.b joN;

  public MRecyclerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(77494);
    init();
    AppMethodBeat.o(77494);
  }

  public MRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(77495);
    init();
    AppMethodBeat.o(77495);
  }

  public MRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(77496);
    init();
    AppMethodBeat.o(77496);
  }

  private void init()
  {
    AppMethodBeat.i(77497);
    this.joL = new a();
    if (aSd())
      this.joL.jR();
    super.setAdapter(this.joL);
    this.joL.a(new RecyclerView.c()
    {
      public final void onChanged()
      {
        AppMethodBeat.i(77491);
        View localView;
        if (MRecyclerView.a(MRecyclerView.this) != null)
        {
          localView = MRecyclerView.a(MRecyclerView.this);
          if (!MRecyclerView.this.aSc())
            break label46;
        }
        label46: for (int i = 0; ; i = 8)
        {
          localView.setVisibility(i);
          AppMethodBeat.o(77491);
          return;
        }
      }
    });
    AppMethodBeat.o(77497);
  }

  public final int S(RecyclerView.v paramv)
  {
    int i = -1;
    AppMethodBeat.i(77498);
    if (this.joL == null)
      AppMethodBeat.o(77498);
    a locala;
    while (true)
    {
      return i;
      locala = this.joL;
      if (paramv == null)
      {
        AppMethodBeat.o(77498);
      }
      else
      {
        if (paramv.kj() != -1)
          break;
        AppMethodBeat.o(77498);
      }
    }
    int j = paramv.kj();
    if (locala.joz.isEmpty());
    for (i = 0; ; i = 1)
    {
      i = j - i;
      AppMethodBeat.o(77498);
      break;
    }
  }

  protected boolean aSc()
  {
    AppMethodBeat.i(77508);
    boolean bool;
    if (this.joL.getItemCount() == 0)
    {
      bool = true;
      AppMethodBeat.o(77508);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77508);
    }
  }

  protected boolean aSd()
  {
    return true;
  }

  public void addFooterView(View paramView)
  {
    AppMethodBeat.i(77502);
    this.joL.addFooterView(paramView);
    AppMethodBeat.o(77502);
  }

  public final void addHeaderView(View paramView)
  {
    AppMethodBeat.i(77501);
    a locala = this.joL;
    locala.joz.add(paramView);
    locala.ar(0, 1);
    AppMethodBeat.o(77501);
  }

  public final void b(int paramInt, View paramView)
  {
    AppMethodBeat.i(77503);
    this.joL.b(paramInt, paramView);
    AppMethodBeat.o(77503);
  }

  public final void bY(int paramInt)
  {
    AppMethodBeat.i(77500);
    super.bY(paramInt);
    AppMethodBeat.o(77500);
  }

  public final void cW(View paramView)
  {
    AppMethodBeat.i(77504);
    this.joL.cW(paramView);
    AppMethodBeat.o(77504);
  }

  public RecyclerView.a getAdapter()
  {
    return this.joL;
  }

  public View getEmptyView()
  {
    return this.Ek;
  }

  public void setAdapter(RecyclerView.a parama)
  {
    AppMethodBeat.i(77499);
    a locala = this.joL;
    if (locala.Yq != null)
    {
      if (!locala.Yq.equals(parama))
        locala.Yq.b(locala.joD);
    }
    else
    {
      locala.Yq = parama;
      if (locala.Yq != null)
        locala.Yq.a(locala.joD);
    }
    AppMethodBeat.o(77499);
  }

  public void setEmptyView(View paramView)
  {
    AppMethodBeat.i(77505);
    if (this.Ek == paramView)
    {
      AppMethodBeat.o(77505);
      return;
    }
    this.Ek = paramView;
    if (this.Ek != null)
    {
      paramView = this.Ek;
      if (!aSc())
        break label58;
    }
    label58: for (int i = 0; ; i = 8)
    {
      paramView.setVisibility(i);
      AppMethodBeat.o(77505);
      break;
    }
  }

  public void setOnItemClickListener(MRecyclerView.a parama)
  {
    AppMethodBeat.i(77506);
    this.joM = parama;
    this.joL.joB = new MRecyclerView.2(this);
    AppMethodBeat.o(77506);
  }

  public void setOnItemLongClickListener(MRecyclerView.b paramb)
  {
    AppMethodBeat.i(77507);
    this.joN = paramb;
    this.joL.joC = new MRecyclerView.3(this);
    AppMethodBeat.o(77507);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView
 * JD-Core Version:    0.6.2
 */