package android.support.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

@SuppressLint({"ViewConstructor"})
final class h extends View
  implements j
{
  private final Matrix mMatrix = new Matrix();
  final View mView;
  ViewGroup yE;
  View yF;
  int yG;
  private int yH;
  private int yI;
  Matrix yJ;
  private final ViewTreeObserver.OnPreDrawListener yL = new h.1(this);

  h(View paramView)
  {
    super(paramView.getContext());
    this.mView = paramView;
    setLayerType(2, null);
  }

  static h z(View paramView)
  {
    return (h)paramView.getTag(2131820626);
  }

  public final void a(ViewGroup paramViewGroup, View paramView)
  {
    this.yE = paramViewGroup;
    this.yF = paramView;
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mView.setTag(2131820626, this);
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    getLocationOnScreen(arrayOfInt1);
    this.mView.getLocationOnScreen(arrayOfInt2);
    arrayOfInt2[0] = ((int)(arrayOfInt2[0] - this.mView.getTranslationX()));
    arrayOfInt2[1] = ((int)(arrayOfInt2[1] - this.mView.getTranslationY()));
    this.yH = (arrayOfInt2[0] - arrayOfInt1[0]);
    this.yI = (arrayOfInt2[1] - arrayOfInt1[1]);
    this.mView.getViewTreeObserver().addOnPreDrawListener(this.yL);
    this.mView.setVisibility(4);
  }

  protected final void onDetachedFromWindow()
  {
    this.mView.getViewTreeObserver().removeOnPreDrawListener(this.yL);
    this.mView.setVisibility(0);
    this.mView.setTag(2131820626, null);
    super.onDetachedFromWindow();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    this.mMatrix.set(this.yJ);
    this.mMatrix.postTranslate(this.yH, this.yI);
    paramCanvas.setMatrix(this.mMatrix);
    this.mView.draw(paramCanvas);
  }

  public final void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    View localView = this.mView;
    if (paramInt == 0);
    for (paramInt = 4; ; paramInt = 0)
    {
      localView.setVisibility(paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.h
 * JD-Core Version:    0.6.2
 */