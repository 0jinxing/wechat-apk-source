package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.sdk.platformtools.ah;

public final class b extends a
{
  private static final int jit;
  private static final int jiu;

  static
  {
    AppMethodBeat.i(10103);
    jit = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 48);
    jiu = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 43);
    AppMethodBeat.o(10103);
  }

  private int aRB()
  {
    AppMethodBeat.i(10097);
    c localc = this.uKz;
    if (localc.jiM <= 1)
    {
      Display localDisplay = ((WindowManager)ah.getContext().getSystemService("window")).getDefaultDisplay();
      localc.jiM = new int[] { localDisplay.getWidth(), localDisplay.getHeight() }[0];
    }
    int i = localc.jiM;
    AppMethodBeat.o(10097);
    return i;
  }

  public final int aRA()
  {
    AppMethodBeat.i(10101);
    int i;
    if (this.uKz.jiH)
    {
      i = 7;
      AppMethodBeat.o(10101);
    }
    while (true)
    {
      return i;
      i = aRB() / jiu;
      AppMethodBeat.o(10101);
    }
  }

  public final int aRy()
  {
    AppMethodBeat.i(10098);
    int i = e.dqK().aRt();
    AppMethodBeat.o(10098);
    return i;
  }

  public final int aRz()
  {
    AppMethodBeat.i(10099);
    int i = aRA();
    int j = getRowCount();
    AppMethodBeat.o(10099);
    return i * j;
  }

  public final int getPageCount()
  {
    AppMethodBeat.i(10100);
    int i;
    if (aRz() <= 0)
    {
      i = 0;
      AppMethodBeat.o(10100);
    }
    while (true)
    {
      return i;
      int j = e.dqK().aRt();
      i = aRz();
      i = (int)Math.ceil(j / i);
      AppMethodBeat.o(10100);
    }
  }

  public final int getRowCount()
  {
    int i = 3;
    int j = this.uKz.jiL / jit;
    if (j > 3);
    while (true)
    {
      j = i;
      if (i <= 0)
        j = 1;
      return j;
      i = j;
    }
  }

  public final int getRowSpacing()
  {
    AppMethodBeat.i(10102);
    int i = (this.uKz.jiL - jit * getRowCount()) / (getRowCount() + 1);
    AppMethodBeat.o(10102);
    return i;
  }

  public final View qN(int paramInt)
  {
    View localView = null;
    AppMethodBeat.i(10096);
    Object localObject = this.jiq;
    c localc = this.uKz;
    d locald = new d();
    locald.mIndex = paramInt;
    locald.uKH = this;
    locald.mContext = ((Context)localObject);
    locald.uKz = localc;
    if ((locald.mContext == null) || (locald.uKH == null))
      AppMethodBeat.o(10096);
    while (true)
    {
      return localView;
      localView = View.inflate(locald.mContext, 2130971220, null);
      if ((localView instanceof WebViewSmileyGrid))
      {
        ((WebViewSmileyGrid)localView).setPanelManager(locald.uKz);
        localObject = (WebViewSmileyGrid)localView;
        int i = locald.mIndex;
        int j = locald.uKH.aRy();
        int k = locald.uKH.aRz();
        paramInt = locald.uKH.aRA();
        int m = locald.uKH.getRowCount();
        int n = locald.uKH.getRowSpacing();
        ((WebViewSmileyGrid)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((WebViewSmileyGrid)localObject).setBackgroundResource(0);
        ((WebViewSmileyGrid)localObject).setStretchMode(2);
        ((WebViewSmileyGrid)localObject).setOnItemClickListener(((WebViewSmileyGrid)localObject).arw);
        ((WebViewSmileyGrid)localObject).jiy = i;
        ((WebViewSmileyGrid)localObject).jiw = j;
        ((WebViewSmileyGrid)localObject).jix = k;
        ((WebViewSmileyGrid)localObject).jiz = n;
        ((WebViewSmileyGrid)localObject).jiA = paramInt;
        ((WebViewSmileyGrid)localObject).jiB = m;
        ((WebViewSmileyGrid)localObject).setNumColumns(paramInt);
        i = ((WebViewSmileyGrid)localObject).getRowSpacing();
        k = com.tencent.mm.bz.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
        j = com.tencent.mm.bz.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
        paramInt = i;
        if (i == 0)
          paramInt = com.tencent.mm.bz.a.fromDPToPix(((WebViewSmileyGrid)localObject).getContext(), 6);
        ((WebViewSmileyGrid)localObject).setPadding(k, paramInt, j, 0);
        ((WebViewSmileyGrid)localObject).uKA = new WebViewSmileyGrid.a((WebViewSmileyGrid)localObject, (byte)0);
        ((WebViewSmileyGrid)localObject).setAdapter(((WebViewSmileyGrid)localObject).uKA);
        ((WebViewSmileyGrid)localObject).uKA.notifyDataSetChanged();
      }
      AppMethodBeat.o(10096);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.b
 * JD-Core Version:    0.6.2
 */