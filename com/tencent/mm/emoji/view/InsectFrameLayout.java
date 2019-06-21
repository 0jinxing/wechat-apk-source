package com.tencent.mm.emoji.view;

import a.f.a.b;
import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/InsectFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "insectCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "bottom", "", "getInsectCallback", "()Lkotlin/jvm/functions/Function1;", "setInsectCallback", "(Lkotlin/jvm/functions/Function1;)V", "positionInWindow", "", "visibleRect", "Landroid/graphics/Rect;", "insectBottom", "onLayout", "", "changed", "left", "top", "right", "plugin-emojisdk_release"})
public class InsectFrameLayout extends FrameLayout
{
  private final String TAG;
  private Rect eAp;
  private int[] eAq;
  private b<? super Integer, Boolean> eAr;

  public InsectFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(63320);
    AppMethodBeat.o(63320);
  }

  public InsectFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(63319);
    this.TAG = "MicroMsg.InsectLayout";
    this.eAp = new Rect();
    this.eAq = new int[2];
    AppMethodBeat.o(63319);
  }

  public final b<Integer, Boolean> getInsectCallback()
  {
    return this.eAr;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(63318);
    ab.i(this.TAG, "InsectFrameLayout onLayout");
    getWindowVisibleDisplayFrame(this.eAp);
    getLocationOnScreen(this.eAq);
    int i = paramInt4 - paramInt2 + this.eAq[1] - this.eAp.bottom;
    boolean bool = false;
    if (this.eAr != null)
    {
      b localb = this.eAr;
      if (localb == null)
        j.dWJ();
      bool = ((Boolean)localb.am(Integer.valueOf(i))).booleanValue();
    }
    if ((!bool) && (getPaddingBottom() != i))
      post((Runnable)new InsectFrameLayout.a(this, i));
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(63318);
  }

  public final void setInsectCallback(b<? super Integer, Boolean> paramb)
  {
    this.eAr = paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.InsectFrameLayout
 * JD-Core Version:    0.6.2
 */