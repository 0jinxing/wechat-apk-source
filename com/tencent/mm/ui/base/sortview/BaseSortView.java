package com.tencent.mm.ui.base.sortview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class BaseSortView extends LinearLayout
  implements VerticalScrollBar.a
{
  private AdapterView.OnItemSelectedListener Up;
  private AdapterView.OnItemClickListener arw;
  private ListView jMQ;
  private int mMode;
  private AdapterView.OnItemLongClickListener oiQ;
  private BaseSortView.a yDA;
  private VerticalScrollBar yDu;
  private View yDv;
  private c yDw = new c(getItemViewCreator());
  private List<d> yDx = new ArrayList();
  public boolean yDy;
  public boolean yDz;

  public BaseSortView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    inflate();
    this.yDu = getScrollBar();
    this.jMQ = getListView();
    this.yDv = getNoResultView();
    this.yDy = true;
    ql(true);
    this.jMQ.setAdapter(this.yDw);
    if (this.yDu != null)
      this.yDu.setOnScrollBarTouchListener(this);
    this.yDw.registerDataSetObserver(new BaseSortView.1(this));
    this.jMQ.setOnItemClickListener(new BaseSortView.2(this));
    this.jMQ.setOnItemLongClickListener(new BaseSortView.3(this));
    this.jMQ.setOnItemSelectedListener(new BaseSortView.4(this));
  }

  protected static void x(View paramView, boolean paramBoolean)
  {
    if (paramView != null)
      if (!paramBoolean)
        break label16;
    label16: for (int i = 0; ; i = 8)
    {
      paramView.setVisibility(i);
      return;
    }
  }

  public abstract boolean a(String paramString, d paramd);

  public final void aqS(String paramString)
  {
    boolean bool1 = true;
    if (this.mMode != 1)
    {
      ab.w("MicroMsg.BaseSortView", "Can't doFilter successfully out of the search mode.");
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(paramString))
    {
      localArrayList.clear();
      Iterator localIterator = this.yDx.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (a(paramString, locald))
          localArrayList.add(locald);
      }
    }
    for (int i = 1; ; i = 0)
    {
      paramString = this.jMQ;
      if ((i != 0) && (localArrayList.size() > 0))
      {
        bool2 = true;
        label119: x(paramString, bool2);
        paramString = this.yDv;
        if ((i == 0) || (localArrayList.size() > 0))
          break label167;
      }
      label167: for (boolean bool2 = bool1; ; bool2 = false)
      {
        x(paramString, bool2);
        dJ(localArrayList);
        break;
        bool2 = false;
        break label119;
      }
    }
  }

  public final void dAH()
  {
    this.yDy = false;
    this.yDw.refresh();
  }

  public final void dJ(List<d> paramList)
  {
    if ((this.mMode == 0) && (this.yDx != paramList))
    {
      this.yDx.clear();
      if (paramList != null)
        this.yDx.addAll(paramList);
    }
    this.yDw.dJ(paramList);
  }

  public c getAdapter()
  {
    return this.yDw;
  }

  public BaseSortView.a getDataSetObserver()
  {
    return this.yDA;
  }

  public List<d> getDatas()
  {
    return this.yDw.yDx;
  }

  public abstract c.a getItemViewCreator();

  public abstract ListView getListView();

  public int getMode()
  {
    return this.mMode;
  }

  public abstract View getNoResultView();

  public AdapterView.OnItemClickListener getOnItemClickListener()
  {
    return this.arw;
  }

  public AdapterView.OnItemLongClickListener getOnItemLongClickListener()
  {
    return this.oiQ;
  }

  public AdapterView.OnItemSelectedListener getOnItemSelectedListener()
  {
    return this.Up;
  }

  public abstract VerticalScrollBar getScrollBar();

  public abstract View inflate();

  public final void kp(String paramString)
  {
    int i = this.yDw.aqT(paramString);
    if (i >= 0)
      this.jMQ.setSelection(i);
  }

  public final void ql(boolean paramBoolean)
  {
    this.yDz = paramBoolean;
    VerticalScrollBar localVerticalScrollBar;
    if (this.yDu != null)
    {
      localVerticalScrollBar = this.yDu;
      if (!paramBoolean)
        break label29;
    }
    label29: for (int i = 0; ; i = 8)
    {
      localVerticalScrollBar.setVisibility(i);
      return;
    }
  }

  public void refresh()
  {
    this.yDw.refresh();
  }

  public void setDataSetObserver(BaseSortView.a parama)
  {
    this.yDA = parama;
  }

  public void setMode(int paramInt)
  {
    if (paramInt == 1)
    {
      this.mMode = 1;
      aqS("");
    }
    while (true)
    {
      return;
      this.mMode = 0;
      x(this.yDv, false);
      x(this.jMQ, true);
      dJ(this.yDx);
    }
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.arw = paramOnItemClickListener;
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    this.oiQ = paramOnItemLongClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.Up = paramOnItemSelectedListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.BaseSortView
 * JD-Core Version:    0.6.2
 */