package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.c;
import com.tencent.mm.plugin.appbrand.widget.desktop.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.List;

public final class d<T extends RecyclerView.v> extends b<T>
{
  int coc = 0;
  int endPos = 0;
  View iYn;
  public g iYu = null;
  FrameLayout jbb;
  private List jbc;
  List jbd;
  Object jbe;
  boolean jbf;
  public a jbg;
  d.a jbh;
  public int paddingLeft = 0;
  public int paddingTop = 0;

  public d(FrameLayout paramFrameLayout, List paramList1, List paramList2, d.a parama)
  {
    this.jbb = paramFrameLayout;
    this.jbc = paramList1;
    this.jbh = parama;
    this.jbd = paramList2;
  }

  private View f(RecyclerView paramRecyclerView, T paramT)
  {
    AppMethodBeat.i(134225);
    paramT.apJ.setVisibility(4);
    paramRecyclerView = this.jbg.b(paramRecyclerView, paramT);
    paramRecyclerView.setVisibility(0);
    AppMethodBeat.o(134225);
    return paramRecyclerView;
  }

  private void n(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(134224);
    if (this.jbf)
    {
      int i = this.jbd.indexOf(this.jbe);
      if (i >= 0)
      {
        this.jbd.remove(i);
        paramRecyclerView.getAdapter().ci(i);
      }
      this.jbf = false;
      if (this.jbh != null)
        this.jbh.aPk();
    }
    AppMethodBeat.o(134224);
  }

  public final boolean O(T paramT)
  {
    AppMethodBeat.i(134215);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.O(paramT);
      AppMethodBeat.o(134215);
    }
    while (true)
    {
      return bool;
      if (paramT == null)
      {
        bool = false;
        AppMethodBeat.o(134215);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(134215);
      }
    }
  }

  public final boolean P(T paramT)
  {
    AppMethodBeat.i(134221);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.P(paramT);
      AppMethodBeat.o(134221);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134221);
    }
  }

  public final boolean R(T paramT)
  {
    AppMethodBeat.i(134217);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.a(paramT, this.jbe);
      AppMethodBeat.o(134217);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(134217);
    }
  }

  public final void a(RecyclerView paramRecyclerView, RecyclerView.v paramv, int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(134219);
    if (this.jbg != null)
      this.jbg.cu(this.iYn);
    d.4 local4 = new d.4(this, paramRecyclerView, paramInt, paramRunnable);
    RecyclerView.v localv;
    float f1;
    float f2;
    float f3;
    if ((paramv != null) && (this.iYn != null))
    {
      ab.i("ItemInsertHelper", "[finishMove] position:" + paramv.kj() + " dragViewPosition:" + paramInt);
      localv = paramRecyclerView.cf(paramInt);
      f1 = this.iYn.getTranslationX();
      f2 = this.iYn.getTranslationY();
      if (!this.jbf)
      {
        f1 = c(paramRecyclerView, paramv);
        f3 = this.jbh.aNa();
        f2 = Q(paramv) + this.jbh.aNb();
        f1 = f3 + f1;
        paramRunnable = this.jbh.cv(this.iYn);
        paramRecyclerView = paramRunnable;
        if (paramRunnable == null)
          paramRecyclerView = this.iYn;
        ab.i("ItemInsertHelper", "alvinluo finishMove transX: %f, transY: %f", new Object[] { Float.valueOf(f1), Float.valueOf(f2) });
        this.iYn.findViewById(2131823276).setVisibility(4);
        paramRecyclerView.animate().scaleX(1.0F).scaleY(1.0F).setDuration(300L).setListener(null).start();
        this.iYn.animate().translationX(f1).translationY(f2).setDuration(300L).setListener(new d.5(this, paramv, local4, localv)).start();
        AppMethodBeat.o(134219);
      }
    }
    while (true)
    {
      return;
      if ((localv == null) || (paramInt != localv.kj()))
      {
        if (((LinearLayoutManager)paramRecyclerView.getLayoutManager()).iQ() > paramInt)
        {
          f2 -= paramRecyclerView.getHeight();
          break;
        }
        f2 = paramRecyclerView.getHeight() + f2;
        break;
      }
      float f4;
      if (this.jbf)
      {
        f1 = c(paramRecyclerView, localv) + this.jbh.aNa();
        f4 = Q(localv);
        f3 = this.jbh.aNb();
        if (this.iYu != null)
          break label441;
        f2 = 0.0F;
      }
      while (true)
      {
        f3 = f3 + f4 + f2;
        ab.i("ItemInsertHelper", "alvinluo finishMove computeMoveExtraY %f", new Object[] { Float.valueOf(f2) });
        f2 = f3;
        break;
        label441: paramInt = this.iYu.computeVerticalScrollOffset();
        int i = paramRecyclerView.computeVerticalScrollExtent();
        int j = this.iYu.computeVerticalScrollRange();
        int k = j - paramRecyclerView.getMeasuredHeight() - paramInt;
        ab.i("ItemInsertHelper", "alvinluo computeMoveExtraY scrollOffset: %d, scrollExtent: %d, scrollRange: %d, height: %d, extra: %d, diff: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramRecyclerView.getMeasuredHeight()), Integer.valueOf((int)(paramRecyclerView.getResources().getDimension(2131428610) * 0.75F)), Integer.valueOf(k) });
        if (k > paramRecyclerView.getResources().getDimension(2131428610) * 0.75F)
          f2 = 0.0F;
        else
          f2 = paramRecyclerView.getResources().getDimension(2131428610) * 0.75F - k;
      }
      ab.e("ItemInsertHelper", "alvinluo finishMove viewHolder is null");
      AppMethodBeat.o(134219);
    }
  }

  public final void a(View paramView, float paramFloat1, float paramFloat2, RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(134220);
    if (paramView == null)
      AppMethodBeat.o(134220);
    while (true)
    {
      return;
      paramView.setTranslationX(paramView.getTranslationX() - paramFloat1);
      paramView.setTranslationY(paramView.getTranslationY() - paramFloat2);
      if (this.jbg != null)
        this.jbg.a(paramv, paramView, this.jbe, paramInt);
      AppMethodBeat.o(134220);
    }
  }

  public final boolean a(RecyclerView paramRecyclerView, T paramT1, T paramT2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134218);
    ab.i("ItemInsertHelper", "alvinluo ItemInsertHelper onMoved isHasInserted: " + this.jbf + ", from: " + paramInt1 + ", to: " + paramInt2);
    if (!this.jbf)
    {
      this.jbd.add(paramInt2, this.jbe);
      paramRecyclerView.post(new d.1(this, paramRecyclerView, paramInt2));
      this.jbf = true;
      if (this.jbh != null)
        this.jbh.aPj();
    }
    while (true)
    {
      this.endPos = paramInt2;
      if (this.jbh != null)
        this.jbh.f(this.jbe, paramInt2);
      AppMethodBeat.o(134218);
      return true;
      int i;
      if (paramInt1 < paramInt2)
      {
        for (i = paramInt1; i < paramInt2; i++)
          Collections.swap(this.jbd, i, i + 1);
        if (paramRecyclerView != null)
          paramRecyclerView.post(new d.2(this, paramRecyclerView, paramInt1, paramInt2));
      }
      else if (paramInt1 > paramInt2)
      {
        for (i = paramInt1; i > paramInt2; i--)
          Collections.swap(this.jbd, i, i - 1);
        if (paramRecyclerView != null)
          paramRecyclerView.post(new d.3(this, paramRecyclerView, paramInt1, paramInt2));
      }
    }
  }

  public final View d(RecyclerView paramRecyclerView, T paramT)
  {
    AppMethodBeat.i(134216);
    this.iYn = f(paramRecyclerView, paramT);
    if (this.iYn != null)
    {
      FrameLayout localFrameLayout = this.jbb;
      paramRecyclerView = f(paramRecyclerView, paramT);
      this.iYn = paramRecyclerView;
      localFrameLayout.addView(paramRecyclerView);
      this.jbf = false;
      if (paramT.kj() < this.jbc.size())
      {
        this.jbe = this.jbh.bz(this.jbc.get(paramT.kj()));
        this.coc = paramT.kj();
        paramRecyclerView = this.iYn;
        AppMethodBeat.o(134216);
      }
    }
    while (true)
    {
      return paramRecyclerView;
      paramRecyclerView = null;
      AppMethodBeat.o(134216);
    }
  }

  public final void e(RecyclerView paramRecyclerView, T paramT)
  {
    AppMethodBeat.i(134222);
    int i = paramT.kj();
    ab.i("ItemInsertHelper", "[onDelete] position:".concat(String.valueOf(i)));
    if ((i >= 0) && (i < this.jbc.size()))
      this.jbc.remove(i);
    n(paramRecyclerView);
    if (this.jbg != null)
    {
      if ((this.jbe instanceof AppBrandDesktopView.c))
        ((AppBrandDesktopView.c)this.jbe).position = paramT.kj();
      this.jbg.by(this.jbe);
    }
    AppMethodBeat.o(134222);
  }

  public final void m(RecyclerView paramRecyclerView)
  {
    AppMethodBeat.i(134223);
    ab.i("ItemInsertHelper", "alvinluo onCancel");
    n(paramRecyclerView);
    AppMethodBeat.o(134223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.d
 * JD-Core Version:    0.6.2
 */