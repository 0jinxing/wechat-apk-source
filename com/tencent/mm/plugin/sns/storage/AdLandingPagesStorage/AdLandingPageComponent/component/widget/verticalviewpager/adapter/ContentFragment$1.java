package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;

final class ContentFragment$1 extends RecyclerView.m
{
  ContentFragment$1(ContentFragment paramContentFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(37613);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    if ((ContentFragment.a(this.rdr).rdw != null) && (ContentFragment.a(this.rdr).rdw.getVisibility() == 0))
      ContentFragment.a(this.rdr).rdw.scrollBy(paramInt1, paramInt2);
    AppMethodBeat.o(37613);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(37614);
    super.c(paramRecyclerView, paramInt);
    ContentFragment.a(this.rdr, paramInt);
    if (paramInt == 0)
    {
      if (!ContentFragment.b(this.rdr))
        break label69;
      this.rdr.cqd();
      AppMethodBeat.o(37614);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        this.rdr.cqe();
        ad.eQ(this.rdr.getContext());
      }
      label69: AppMethodBeat.o(37614);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.1
 * JD-Core Version:    0.6.2
 */