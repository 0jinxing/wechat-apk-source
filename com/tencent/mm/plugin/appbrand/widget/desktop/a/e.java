package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.desktop.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.List;

public final class e<T extends RecyclerView.v> extends b<T>
{
  int coc = 0;
  int endPos = 0;
  private List iKa;
  View iYn;
  public g iYu = null;
  FrameLayout jbb;
  public a jbg;
  Object jbp;
  private f jbq;
  public int paddingLeft = 0;
  public int paddingTop = 0;

  public e(FrameLayout paramFrameLayout, List paramList, f paramf)
  {
    this.jbb = paramFrameLayout;
    this.iKa = paramList;
    this.jbq = paramf;
  }

  public final boolean O(T paramT)
  {
    AppMethodBeat.i(134228);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.O(paramT);
      AppMethodBeat.o(134228);
    }
    while (true)
    {
      return bool;
      if (paramT == null)
      {
        bool = false;
        AppMethodBeat.o(134228);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(134228);
      }
    }
  }

  public final boolean P(T paramT)
  {
    AppMethodBeat.i(134234);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.P(paramT);
      AppMethodBeat.o(134234);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(134234);
    }
  }

  public final boolean R(T paramT)
  {
    AppMethodBeat.i(134230);
    boolean bool;
    if (this.jbg != null)
    {
      bool = this.jbg.a(paramT, null);
      AppMethodBeat.o(134230);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(134230);
    }
  }

  public final void a(RecyclerView paramRecyclerView, T paramT, int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(134232);
    if (this.jbg != null)
      this.jbg.cu(this.iYn);
    paramRunnable = new e.1(this, paramRunnable);
    RecyclerView.v localv;
    float f1;
    float f2;
    if ((paramT != null) && (this.iYn != null))
    {
      ab.i("ItemMoveHelper", "[finishMove] position" + paramT.kj() + " dragViewPosition:" + paramInt);
      localv = paramRecyclerView.cf(paramInt);
      f1 = this.iYn.getTranslationX();
      f2 = this.iYn.getTranslationY();
      if ((paramInt == paramT.kj()) || (localv != null))
        break label253;
      if (((LinearLayoutManager)paramRecyclerView.getLayoutManager()).iQ() <= paramInt)
        break label240;
      f2 -= paramRecyclerView.getHeight();
    }
    while (true)
    {
      paramT = this.jbq.cv(this.iYn);
      paramRecyclerView = paramT;
      if (paramT == null)
        paramRecyclerView = this.iYn;
      paramRecyclerView.animate().scaleX(1.0F).scaleY(1.0F).setDuration(300L).setListener(null).start();
      this.iYn.animate().translationX(f1).translationY(f2).setDuration(300L).setListener(new e.2(this, localv, paramRunnable)).start();
      AppMethodBeat.o(134232);
      return;
      label240: f2 = paramRecyclerView.getHeight() + f2;
      continue;
      label253: if (localv != null)
      {
        f1 = c(paramRecyclerView, localv);
        float f3 = this.jbq.aNa();
        float f4 = Q(localv);
        float f5 = this.jbq.aNb();
        if (this.iYu == null)
          f2 = 0.0F;
        while (true)
        {
          ab.i("MicroMsg.ItemMoveHelper", "alvinluo finishMove computeMoveExtraY %f", new Object[] { Float.valueOf(f2) });
          f2 += f5 + f4;
          f1 = f3 + f1;
          break;
          int i = this.iYu.computeVerticalScrollOffset();
          int j = paramRecyclerView.computeVerticalScrollExtent();
          paramInt = this.iYu.computeVerticalScrollRange();
          int k = paramInt - paramRecyclerView.getMeasuredHeight() - i;
          ab.i("MicroMsg.ItemMoveHelper", "alvinluo computeMoveExtraY scrollOffset: %d, scrollExtent: %d, scrollRange: %d, height: %d, extra: %d, diff: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(paramRecyclerView.getMeasuredHeight()), Integer.valueOf((int)(paramRecyclerView.getResources().getDimension(2131428610) * 0.75F)), Integer.valueOf(k) });
          if (k > paramRecyclerView.getResources().getDimension(2131428610) * 0.75F)
            f2 = 0.0F;
          else
            f2 = paramRecyclerView.getResources().getDimension(2131428610) * 0.75F - k;
        }
      }
    }
  }

  public final void a(View paramView, float paramFloat1, float paramFloat2, RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(134233);
    if (paramView == null)
      AppMethodBeat.o(134233);
    while (true)
    {
      return;
      paramView.setTranslationX(paramView.getTranslationX() - paramFloat1);
      paramView.setTranslationY(paramView.getTranslationY() - paramFloat2);
      AppMethodBeat.o(134233);
    }
  }

  public final void a(a parama)
  {
    this.jbg = parama;
  }

  public final boolean a(RecyclerView paramRecyclerView, T paramT1, T paramT2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134231);
    ab.i("MicroMsg.ItemMoveHelper", "[onMoved] position:" + paramT1.kj() + " target:" + paramT2.kj());
    ab.i("MicroMsg.ItemMoveHelper", "alvinluo onMoved mList: %d", new Object[] { Integer.valueOf(this.iKa.hashCode()) });
    if (paramInt1 < paramInt2)
      for (i = paramInt1; i < paramInt2; i++)
        Collections.swap(this.iKa, i, i + 1);
    for (int i = paramInt1; i > paramInt2; i--)
      Collections.swap(this.iKa, i, i - 1);
    ab.i("MicroMsg.ItemMoveHelper", "alvinluo onMoved end mList: %d", new Object[] { Integer.valueOf(this.iKa.hashCode()) });
    paramRecyclerView.getAdapter().as(paramInt1, paramInt2);
    if (this.jbq != null)
    {
      this.endPos = paramInt2;
      this.jbq.f(this.jbp, paramInt2);
    }
    AppMethodBeat.o(134231);
    return true;
  }

  public final View d(RecyclerView paramRecyclerView, T paramT)
  {
    AppMethodBeat.i(134229);
    FrameLayout localFrameLayout = this.jbb;
    paramT.apJ.setVisibility(4);
    paramRecyclerView = this.jbg.b(paramRecyclerView, paramT);
    paramRecyclerView.setAlpha(1.0F);
    paramRecyclerView.setScaleX(1.0F);
    paramRecyclerView.setScaleY(1.0F);
    paramRecyclerView.setVisibility(0);
    this.iYn = paramRecyclerView;
    localFrameLayout.addView(paramRecyclerView);
    ab.i("MicroMsg.ItemMoveHelper", "[onDragBegin] position:" + paramT.kj());
    if ((this.jbq != null) && (this.iKa.size() > paramT.kj()))
    {
      this.jbp = this.jbq.bz(this.iKa.get(paramT.kj()));
      this.coc = paramT.kj();
      this.endPos = this.coc;
    }
    paramRecyclerView = this.iYn;
    AppMethodBeat.o(134229);
    return paramRecyclerView;
  }

  public final void e(RecyclerView paramRecyclerView, T paramT)
  {
    AppMethodBeat.i(134235);
    ab.i("MicroMsg.ItemMoveHelper", "alvinluo onDelete adapter position: %d", new Object[] { Integer.valueOf(paramT.kj()) });
    if ((paramT instanceof com.tencent.mm.plugin.appbrand.widget.desktop.e))
      ab.i("MicroMsg.ItemMoveHelper", "alvinluo onDelete holder: %s", new Object[] { ((com.tencent.mm.plugin.appbrand.widget.desktop.e)paramT).gne.getText() });
    this.iKa.remove(paramT.kj());
    ab.i("MicroMsg.ItemMoveHelper", "alvinluo mList hashCode: %d", new Object[] { Integer.valueOf(this.iKa.hashCode()) });
    paramRecyclerView.getAdapter().ci(paramT.kj());
    if (this.jbg != null)
      this.jbg.by(this.jbp);
    AppMethodBeat.o(134235);
  }

  public final void m(RecyclerView paramRecyclerView)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.e
 * JD-Core Version:    0.6.2
 */