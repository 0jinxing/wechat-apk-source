package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.sdk.platformtools.ah;

public final class b extends a
{
  private static final int jit;
  private static final int jiu;

  static
  {
    AppMethodBeat.i(134306);
    jit = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 48);
    jiu = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 43);
    AppMethodBeat.o(134306);
  }

  private int aRB()
  {
    AppMethodBeat.i(134300);
    c localc = this.jir;
    if (localc.jiM <= 1)
      localc.jiM = c.aMw()[0];
    int i = localc.jiM;
    AppMethodBeat.o(134300);
    return i;
  }

  public final int aRA()
  {
    AppMethodBeat.i(134304);
    int i;
    if (this.jir.jiH)
    {
      i = 7;
      AppMethodBeat.o(134304);
    }
    while (true)
    {
      return i;
      i = aRB() / jiu;
      AppMethodBeat.o(134304);
    }
  }

  public final int aRy()
  {
    AppMethodBeat.i(134301);
    int i = this.jir.aRr().aRt();
    AppMethodBeat.o(134301);
    return i;
  }

  public final int aRz()
  {
    AppMethodBeat.i(134302);
    int i = aRA();
    int j = getRowCount();
    AppMethodBeat.o(134302);
    return i * j;
  }

  public final int getPageCount()
  {
    AppMethodBeat.i(134303);
    int i;
    if (aRz() <= 0)
    {
      i = 0;
      AppMethodBeat.o(134303);
    }
    while (true)
    {
      return i;
      i = aRy();
      int j = aRz();
      i = (int)Math.ceil(i / j);
      AppMethodBeat.o(134303);
    }
  }

  public final int getRowCount()
  {
    int i = 3;
    int j = this.jir.jiL / jit;
    if (j > 3)
      j = i;
    while (true)
    {
      i = j;
      if (j <= 0)
        i = 1;
      return i;
    }
  }

  public final int getRowSpacing()
  {
    AppMethodBeat.i(134305);
    int i = (this.jir.jiL - jit * getRowCount()) / (getRowCount() + 1);
    AppMethodBeat.o(134305);
    return i;
  }

  public final View qN(int paramInt)
  {
    View localView = null;
    AppMethodBeat.i(134299);
    Context localContext = this.jiq;
    Object localObject = this.jir;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.jiN = this;
    locald.mContext = localContext;
    locald.jir = ((c)localObject);
    if ((locald.mContext == null) || (locald.jiN == null))
      AppMethodBeat.o(134299);
    while (true)
    {
      return localView;
      localView = View.inflate(locald.mContext, 2130968773, null);
      if ((localView instanceof AppBrandSmileyGrid))
      {
        ((AppBrandSmileyGrid)localView).setPanelManager(locald.jir);
        localObject = (AppBrandSmileyGrid)localView;
        paramInt = locald.mIndex;
        int i = locald.jiN.aRy();
        int j = locald.jiN.aRz();
        int k = locald.jiN.aRA();
        int m = locald.jiN.getRowCount();
        int n = locald.jiN.getRowSpacing();
        ((AppBrandSmileyGrid)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((AppBrandSmileyGrid)localObject).setBackgroundResource(0);
        ((AppBrandSmileyGrid)localObject).setStretchMode(2);
        ((AppBrandSmileyGrid)localObject).setOnItemClickListener(((AppBrandSmileyGrid)localObject).arw);
        ((AppBrandSmileyGrid)localObject).jiy = paramInt;
        ((AppBrandSmileyGrid)localObject).jiw = i;
        ((AppBrandSmileyGrid)localObject).jix = j;
        ((AppBrandSmileyGrid)localObject).jiz = n;
        ((AppBrandSmileyGrid)localObject).jiA = k;
        ((AppBrandSmileyGrid)localObject).jiB = m;
        ((AppBrandSmileyGrid)localObject).setNumColumns(k);
        i = ((AppBrandSmileyGrid)localObject).getRowSpacing();
        j = com.tencent.mm.bz.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
        m = com.tencent.mm.bz.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
        paramInt = i;
        if (i == 0)
          paramInt = com.tencent.mm.bz.a.fromDPToPix(((AppBrandSmileyGrid)localObject).getContext(), 6);
        ((AppBrandSmileyGrid)localObject).setPadding(j, paramInt, m, 0);
        ((AppBrandSmileyGrid)localObject).jiv = new AppBrandSmileyGrid.a((AppBrandSmileyGrid)localObject, (byte)0);
        ((AppBrandSmileyGrid)localObject).setAdapter(((AppBrandSmileyGrid)localObject).jiv);
        ((AppBrandSmileyGrid)localObject).jiv.notifyDataSetChanged();
      }
      AppMethodBeat.o(134299);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.b
 * JD-Core Version:    0.6.2
 */