package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.i;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LoadMoreRecyclerView extends MRecyclerView
{
  private View emz;
  private LoadMoreRecyclerView.a joG;
  boolean joH;

  public LoadMoreRecyclerView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(77481);
    init();
    AppMethodBeat.o(77481);
  }

  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(77482);
    init();
    AppMethodBeat.o(77482);
  }

  public LoadMoreRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(77483);
    init();
    AppMethodBeat.o(77483);
  }

  private void init()
  {
    AppMethodBeat.i(77485);
    LinearLayoutManager localLinearLayoutManager = aNm();
    super.setLayoutManager(localLinearLayoutManager);
    a(new LoadMoreRecyclerView.1(this, localLinearLayoutManager));
    this.joL.a(new LoadMoreRecyclerView.2(this, localLinearLayoutManager));
    AppMethodBeat.o(77485);
  }

  protected LinearLayoutManager aNm()
  {
    AppMethodBeat.i(77484);
    getContext();
    LinearLayoutManager localLinearLayoutManager = new LinearLayoutManager();
    AppMethodBeat.o(77484);
    return localLinearLayoutManager;
  }

  protected final boolean aSc()
  {
    boolean bool = true;
    AppMethodBeat.i(77490);
    if (this.emz != null)
      if ((this.joL.getItemCount() == 1) && (this.joL.getFooterViewCount() == 1))
        AppMethodBeat.o(77490);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(77490);
      continue;
      bool = super.aSc();
      AppMethodBeat.o(77490);
    }
  }

  public final void addFooterView(View paramView)
  {
    AppMethodBeat.i(77486);
    int i = this.joL.getFooterViewCount() - 1;
    if ((this.emz == null) || (i < 0))
    {
      super.addFooterView(paramView);
      AppMethodBeat.o(77486);
    }
    while (true)
    {
      return;
      super.b(i, paramView);
      AppMethodBeat.o(77486);
    }
  }

  public final void fh(boolean paramBoolean)
  {
    AppMethodBeat.i(77489);
    if (this.joH == paramBoolean)
    {
      AppMethodBeat.o(77489);
      return;
    }
    this.joH = paramBoolean;
    View localView;
    if (this.emz != null)
    {
      localView = this.emz;
      if (!this.joH)
        break label58;
    }
    label58: for (int i = 0; ; i = 8)
    {
      localView.setVisibility(i);
      AppMethodBeat.o(77489);
      break;
    }
  }

  public void setLayoutManager(RecyclerView.i parami)
  {
  }

  public void setLoadingView(int paramInt)
  {
    AppMethodBeat.i(77488);
    setLoadingView(LayoutInflater.from(getContext()).inflate(paramInt, this, false));
    AppMethodBeat.o(77488);
  }

  public void setLoadingView(View paramView)
  {
    AppMethodBeat.i(77487);
    if (this.emz == paramView)
    {
      AppMethodBeat.o(77487);
      return;
    }
    if ((this.emz != null) && (!this.emz.equals(paramView)))
      cW(this.emz);
    this.emz = paramView;
    if (this.emz != null)
    {
      addFooterView(this.emz);
      paramView = this.emz;
      if (!this.joH)
        break label92;
    }
    label92: for (int i = 0; ; i = 8)
    {
      paramView.setVisibility(i);
      AppMethodBeat.o(77487);
      break;
    }
  }

  public void setOnLoadingStateChangedListener(LoadMoreRecyclerView.a parama)
  {
    this.joG = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView
 * JD-Core Version:    0.6.2
 */