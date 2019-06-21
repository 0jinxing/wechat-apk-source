package com.tencent.mm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;
import java.util.List;

public abstract class BasePanelKeybordLayout extends KeyboardLinearLayout
{
  private int voj = -1;
  private BasePanelKeybordLayout.a yfw = null;

  public BasePanelKeybordLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BasePanelKeybordLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected abstract List<View> getPanelView();

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    ab.d("MicroMsg.BasePanelKeybordLayout", "onMeasure, width: %d, height: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (j >= 0)
    {
      if (this.voj >= 0)
        break label62;
      this.voj = j;
    }
    label62: int k;
    label102: View localView;
    LinearLayout.LayoutParams localLayoutParams;
    do
    {
      do
      {
        do
        {
          super.onMeasure(paramInt1, paramInt2);
          return;
          k = this.voj - j;
          this.voj = j;
        }
        while (k == 0);
        localObject = getPanelView();
      }
      while (localObject == null);
      Object localObject = ((List)localObject).iterator();
      if (!((Iterator)localObject).hasNext())
        break;
      localView = (View)((Iterator)localObject).next();
      localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
    }
    while (localLayoutParams == null);
    if (localLayoutParams.height < 0);
    for (i = 0; ; i = localLayoutParams.height - k)
    {
      int m = i;
      if (i < 0)
        m = 0;
      int n = j.gq(ah.getContext());
      i = j.gs(getContext());
      int i1 = m;
      if (j.Mv() > 0)
      {
        i1 = m;
        if (j >= j.Mv())
          i1 = i;
      }
      m = i1;
      if (i1 > 0)
      {
        m = i1;
        if (i1 < n)
        {
          m = i1;
          if (localView.getVisibility() != 0)
            m = 0;
        }
      }
      i1 = m;
      if (m > i)
        i1 = i;
      m = i1;
      if (i1 > 0)
      {
        m = i1;
        if (i1 < i)
          m = i;
      }
      ab.d("MicroMsg.BasePanelKeybordLayout", "oldHeight: %d, offset: %d newHeight: %d, validPanelHeight: %d", new Object[] { Integer.valueOf(localLayoutParams.height), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(i) });
      localLayoutParams.height = m;
      localView.setLayoutParams(localLayoutParams);
      break label102;
      break;
    }
  }

  public void setOnMeasureListener(BasePanelKeybordLayout.a parama)
  {
    this.yfw = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BasePanelKeybordLayout
 * JD-Core Version:    0.6.2
 */