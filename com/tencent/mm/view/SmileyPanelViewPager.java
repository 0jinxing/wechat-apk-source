package com.tencent.mm.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.p;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.view.a.i;
import com.tencent.mm.view.f.a;

public class SmileyPanelViewPager extends CustomViewPager
{
  private SmileyPanelViewPager.a AaN;
  private boolean AaO;
  private a Aaj;
  private final String TAG;
  private int jiO;
  private int jiP;

  public SmileyPanelViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(62951);
    this.TAG = "MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager";
    this.AaO = j.gu(getContext());
    this.jiO = 0;
    this.jiP = 0;
    if (bo.getInt(Build.VERSION.SDK, 0) >= 9)
      setOverScrollMode(2);
    AppMethodBeat.o(62951);
  }

  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(62952);
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager", "alvinluo w: %d, h: %d, oldw: %d, oldh: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    boolean bool = j.gu(getContext());
    if ((this.Aaj != null) && (((paramInt1 > 0) && (paramInt3 != paramInt1)) || ((paramInt2 > 0) && (paramInt4 != paramInt2) && (((paramInt2 > 0) && (paramInt2 != this.jiO)) || ((paramInt1 > 0) && (paramInt1 != this.jiP))))))
    {
      if (this.Aaj.jiL <= 0)
        this.Aaj.QH(paramInt2);
      this.Aaj.jiM = paramInt1;
      this.Aaj.zyD = 0;
      if ((this.AaN != null) && ((!this.Aaj.Aez) || (this.Aaj.AeA) || (this.AaO != bool)))
      {
        ab.d("MicroMsg.emoji.SmileyPanel.SmileyPanelViewPager", "need deal cache size.");
        this.Aaj.AeA = false;
        this.AaN.QA(paramInt2);
      }
    }
    this.AaO = bool;
    if (paramInt2 > 0)
      this.jiO = paramInt2;
    if (paramInt1 > 0)
      this.jiP = paramInt1;
    AppMethodBeat.o(62952);
  }

  public void setAdapter(p paramp)
  {
    AppMethodBeat.i(62953);
    super.setAdapter(paramp);
    AppMethodBeat.o(62953);
  }

  public void setAdapter(i parami)
  {
    AppMethodBeat.i(62954);
    if (parami != null)
    {
      parami.refreshData();
      parami.Abw = false;
    }
    super.setAdapter(parami);
    AppMethodBeat.o(62954);
  }

  public void setPanelStg(a parama)
  {
    this.Aaj = parama;
  }

  public void setSmileyPanelViewPagerLayoutListener(SmileyPanelViewPager.a parama)
  {
    this.AaN = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyPanelViewPager
 * JD-Core Version:    0.6.2
 */