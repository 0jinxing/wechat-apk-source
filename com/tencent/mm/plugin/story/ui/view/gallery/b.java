package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDividerDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "orientation", "", "(I)V", "bounds", "Landroid/graphics/Rect;", "divider", "Landroid/graphics/drawable/Drawable;", "dividerSize", "getOrientation", "()I", "drawHorizontal", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroid/support/v7/widget/RecyclerView;", "drawVertical", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onDraw", "c", "Companion", "plugin-story_release"})
public final class b extends RecyclerView.h
{
  public static final a snC;
  private final Drawable gAf;
  private final int orientation;
  private final Rect snA;
  private int snB;

  static
  {
    AppMethodBeat.i(110707);
    snC = new a((byte)0);
    AppMethodBeat.o(110707);
  }

  public b(int paramInt)
  {
    AppMethodBeat.i(110706);
    this.orientation = paramInt;
    this.gAf = ((Drawable)new ColorDrawable(-16777216));
    this.snA = new Rect();
    this.snB = a.fromDPToPix(ah.getContext(), 16);
    AppMethodBeat.o(110706);
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(110704);
    j.p(paramCanvas, "c");
    j.p(paramRecyclerView, "parent");
    if (paramRecyclerView.getLayoutManager() == null)
      AppMethodBeat.o(110704);
    while (true)
    {
      return;
      int k;
      int m;
      int n;
      int i1;
      if (this.orientation == 1)
      {
        paramCanvas.save();
        if (paramRecyclerView.getClipToPadding())
        {
          k = paramRecyclerView.getPaddingLeft();
          m = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
          paramCanvas.clipRect(k, paramRecyclerView.getPaddingTop(), m, paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom());
        }
        while (true)
        {
          i = paramRecyclerView.getChildCount();
          while (j < i)
          {
            params = paramRecyclerView.getChildAt(j);
            RecyclerView.d(params, this.snA);
            n = this.snA.bottom;
            j.o(params, "child");
            n = Math.round(params.getTranslationY()) + n;
            i1 = this.snB;
            this.gAf.setBounds(k, n - i1, m, n);
            this.gAf.draw(paramCanvas);
            j++;
          }
          m = paramRecyclerView.getWidth();
          k = 0;
        }
        paramCanvas.restore();
        AppMethodBeat.o(110704);
      }
      else
      {
        paramCanvas.save();
        if (paramRecyclerView.getClipToPadding())
        {
          m = paramRecyclerView.getPaddingTop();
          k = paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom();
          paramCanvas.clipRect(paramRecyclerView.getPaddingLeft(), m, paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight(), k);
        }
        while (true)
        {
          n = paramRecyclerView.getChildCount();
          for (j = i; j < n; j++)
          {
            params = paramRecyclerView.getChildAt(j);
            paramRecyclerView.getLayoutManager();
            RecyclerView.i.d(params, this.snA);
            i = this.snA.right;
            j.o(params, "child");
            i1 = Math.round(params.getTranslationX()) + i;
            i = this.snB;
            this.gAf.setBounds(i1 - i, m, i1, k);
            this.gAf.draw(paramCanvas);
          }
          k = paramRecyclerView.getHeight();
          m = 0;
        }
        paramCanvas.restore();
        AppMethodBeat.o(110704);
      }
    }
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(110705);
    j.p(paramRect, "outRect");
    j.p(paramView, "view");
    j.p(paramRecyclerView, "parent");
    j.p(params, "state");
    int i;
    int j;
    if (paramRecyclerView.getLayoutManager() != null)
    {
      i = RecyclerView.i.bt(paramView);
      paramView = paramRecyclerView.getLayoutManager();
      if (paramView == null)
        break label75;
      j = paramView.getItemCount();
      label58: if (i >= 0)
        break label81;
      AppMethodBeat.o(110705);
    }
    while (true)
    {
      return;
      i = -1;
      break;
      label75: j = 0;
      break label58;
      label81: if (j - 1 > i)
      {
        if (this.orientation == 0)
        {
          paramRect.set(0, 0, this.snB, 0);
          AppMethodBeat.o(110705);
        }
        else
        {
          paramRect.set(0, 0, 0, this.snB);
        }
      }
      else
        AppMethodBeat.o(110705);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryDividerDecoration$Companion;", "", "()V", "Horizontal", "", "Vertical", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.b
 * JD-Core Version:    0.6.2
 */