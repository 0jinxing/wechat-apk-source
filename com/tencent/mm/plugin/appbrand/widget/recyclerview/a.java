package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.c;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a extends RecyclerView.a<RecyclerView.v>
{
  private static ViewGroup.LayoutParams jow;
  RecyclerView.a Yq;
  private List<View> joA;
  b joB;
  c joC;
  RecyclerView.c joD;
  private ViewGroup jox;
  private ViewGroup joy;
  List<View> joz;

  static
  {
    AppMethodBeat.i(77477);
    jow = new ViewGroup.LayoutParams(-1, -2);
    AppMethodBeat.o(77477);
  }

  a()
  {
    AppMethodBeat.i(77466);
    this.joz = new LinkedList();
    this.joA = new LinkedList();
    this.joD = new a.1(this);
    AppMethodBeat.o(77466);
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(77472);
    ViewGroup localViewGroup;
    if (paramInt == 2147483646)
    {
      if (this.jox != null)
        this.jox.removeAllViews();
      localViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970908, paramViewGroup, false);
      this.jox = localViewGroup;
      paramViewGroup = this.joA.iterator();
      while (paramViewGroup.hasNext())
        localViewGroup.addView((View)paramViewGroup.next(), jow);
      paramViewGroup = new a(localViewGroup);
      AppMethodBeat.o(77472);
    }
    while (true)
    {
      return paramViewGroup;
      if (paramInt == 2147483647)
      {
        if (this.joy != null)
          this.joy.removeAllViews();
        localViewGroup = (ViewGroup)LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970908, paramViewGroup, false);
        this.joy = localViewGroup;
        paramViewGroup = this.joz.iterator();
        while (paramViewGroup.hasNext())
          localViewGroup.addView((View)paramViewGroup.next(), jow);
        paramViewGroup = new a(localViewGroup);
        AppMethodBeat.o(77472);
      }
      else
      {
        paramViewGroup = this.Yq.a(paramViewGroup, paramInt);
        AppMethodBeat.o(77472);
      }
    }
  }

  public final void a(final RecyclerView.v paramv, final int paramInt)
  {
    AppMethodBeat.i(77470);
    if ((!this.joz.isEmpty()) && (paramInt == 0))
      AppMethodBeat.o(77470);
    while (true)
    {
      return;
      if ((this.joA.isEmpty()) || (paramInt != getItemCount() - 1))
        break;
      AppMethodBeat.o(77470);
    }
    if (this.joz.isEmpty());
    for (int i = 0; ; i = 1)
    {
      paramInt -= i;
      this.Yq.a(paramv, paramInt);
      if (this.joB != null)
        paramv.apJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(77462);
            if (a.b(a.this) != null)
              a.b(a.this).J(paramv.apJ, paramInt);
            AppMethodBeat.o(77462);
          }
        });
      if (this.joC != null)
        paramv.apJ.setOnLongClickListener(new a.3(this, paramv, paramInt));
      AppMethodBeat.o(77470);
      break;
    }
  }

  public final void a(final RecyclerView.v paramv, final int paramInt, List<Object> paramList)
  {
    AppMethodBeat.i(77471);
    if ((!this.joz.isEmpty()) && (paramInt == 0))
      AppMethodBeat.o(77471);
    while (true)
    {
      return;
      if ((this.joA.isEmpty()) || (paramInt != getItemCount() - 1))
        break;
      AppMethodBeat.o(77471);
    }
    if (this.joz.isEmpty());
    for (int i = 0; ; i = 1)
    {
      paramInt -= i;
      this.Yq.a(paramv, paramInt, paramList);
      if (this.joB != null)
        paramv.apJ.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(77464);
            if (a.b(a.this) != null)
              a.b(a.this).J(paramv.apJ, paramInt);
            AppMethodBeat.o(77464);
          }
        });
      if (this.joC != null)
        paramv.apJ.setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            AppMethodBeat.i(77465);
            boolean bool;
            if (a.c(a.this) != null)
            {
              bool = a.c(a.this).K(paramv.apJ, paramInt);
              AppMethodBeat.o(77465);
            }
            while (true)
            {
              return bool;
              bool = false;
              AppMethodBeat.o(77465);
            }
          }
        });
      AppMethodBeat.o(77471);
      break;
    }
  }

  public final void addFooterView(View paramView)
  {
    AppMethodBeat.i(77474);
    this.joA.add(paramView);
    ar(getItemCount() - 1, 1);
    AppMethodBeat.o(77474);
  }

  public final void b(int paramInt, View paramView)
  {
    AppMethodBeat.i(77475);
    this.joA.add(paramInt, paramView);
    ar(getItemCount() - 1, 1);
    AppMethodBeat.o(77475);
  }

  public final void cW(View paramView)
  {
    AppMethodBeat.i(77476);
    this.joA.remove(paramView);
    ar(getItemCount() - 1, 1);
    AppMethodBeat.o(77476);
  }

  public final int getFooterViewCount()
  {
    AppMethodBeat.i(77473);
    int i = this.joA.size();
    AppMethodBeat.o(77473);
    return i;
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(77469);
    int i = this.Yq.getItemCount();
    int j = i;
    if (!this.joz.isEmpty())
      j = i + 1;
    i = j;
    if (!this.joA.isEmpty())
      i = j + 1;
    AppMethodBeat.o(77469);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(77468);
    long l;
    if (getItemViewType(paramInt) == 2147483647)
    {
      l = "MRecyclerHeaderView".hashCode();
      AppMethodBeat.o(77468);
    }
    while (true)
    {
      return l;
      if (getItemViewType(paramInt) == 2147483646)
      {
        l = "MRecyclerFooterView".hashCode();
        AppMethodBeat.o(77468);
      }
      else
      {
        if (this.Yq.aoq)
          break;
        l = paramInt;
        AppMethodBeat.o(77468);
      }
    }
    RecyclerView.a locala = this.Yq;
    if (this.joz.isEmpty());
    for (int i = 0; ; i = 1)
    {
      l = locala.getItemId(paramInt - i);
      AppMethodBeat.o(77468);
      break;
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(77467);
    if ((!this.joz.isEmpty()) && (paramInt == 0))
    {
      paramInt = 2147483647;
      AppMethodBeat.o(77467);
    }
    while (true)
    {
      return paramInt;
      if ((this.joA.isEmpty()) || (paramInt != getItemCount() - 1))
        break;
      paramInt = 2147483646;
      AppMethodBeat.o(77467);
    }
    RecyclerView.a locala = this.Yq;
    if (this.joz.isEmpty());
    for (int i = 0; ; i = 1)
    {
      paramInt = locala.getItemViewType(paramInt - i);
      AppMethodBeat.o(77467);
      break;
    }
  }

  static final class a extends RecyclerView.v
  {
    a(View paramView)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.a
 * JD-Core Version:    0.6.2
 */