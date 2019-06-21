package com.tencent.mm.plugin.appbrand.widget.header;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class b
  implements View.OnTouchListener, AbsListView.OnScrollListener
{
  protected List<b.a> jdb = new LinkedList();
  private int jdc = 0;

  public abstract void F(MotionEvent paramMotionEvent);

  public final void a(b.a parama)
  {
    if (!this.jdb.contains(parama))
      this.jdb.add(parama);
  }

  public abstract void aOS();

  public abstract boolean aOV();

  public final void b(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    ab.i("MicroMsg.HeaderAnimController", "alvinluo notifyCallback isOpen: %b, isDrag: %b, reason: %d", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt) });
    if (paramBoolean1)
    {
      eQ(paramBoolean2);
      if ((this.jdc & 0x2) == 0);
    }
    label195: 
    while (true)
    {
      return;
      this.jdc |= 2;
      this.jdc &= -5;
      label72: Iterator localIterator = this.jdb.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label195;
        b.a locala = (b.a)localIterator.next();
        if (paramBoolean1)
        {
          if (paramBoolean2)
          {
            locala.aPt();
            continue;
            eR(paramBoolean2);
            if ((this.jdc & 0x4) != 0)
              break;
            this.jdc |= 4;
            this.jdc &= -3;
            break label72;
          }
          locala.aPs();
          continue;
        }
        if (paramBoolean2)
          locala.qk(paramInt);
        else
          locala.qj(paramInt);
      }
    }
  }

  public void c(long paramLong, int paramInt, boolean paramBoolean)
  {
  }

  public abstract void cD(View paramView);

  public abstract void e(View paramView1, View paramView2);

  protected void eQ(boolean paramBoolean)
  {
  }

  protected void eR(boolean paramBoolean)
  {
  }

  public abstract void gY();

  public abstract void onDestroy();

  public void onResume()
  {
  }

  public abstract void qh(int paramInt);

  public abstract void setActionBarUpdateCallback(a parama);

  public abstract void setStatusBarMaskView(View paramView);

  public abstract void setTabView(View paramView);

  public final void t(boolean paramBoolean1, boolean paramBoolean2)
  {
    b(paramBoolean1, paramBoolean2, 0);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.header.b
 * JD-Core Version:    0.6.2
 */