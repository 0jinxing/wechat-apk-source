package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

public class ChangeImageTransform extends Transition
{
  private static final TypeEvaluator<Matrix> xS = new ChangeImageTransform.1();
  private static final Property<ImageView, Matrix> xT = new ChangeImageTransform.2(Matrix.class, "animatedTransform");
  private static final String[] xk = { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };

  public ChangeImageTransform()
  {
  }

  public ChangeImageTransform(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private static void c(ah paramah)
  {
    Object localObject = paramah.view;
    if ((!(localObject instanceof ImageView)) || (((View)localObject).getVisibility() != 0));
    ImageView localImageView;
    do
    {
      return;
      localImageView = (ImageView)localObject;
    }
    while (localImageView.getDrawable() == null);
    Map localMap = paramah.values;
    localMap.put("android:changeImageTransform:bounds", new Rect(((View)localObject).getLeft(), ((View)localObject).getTop(), ((View)localObject).getRight(), ((View)localObject).getBottom()));
    switch (ChangeImageTransform.3.xU[localImageView.getScaleType().ordinal()])
    {
    default:
      paramah = new Matrix(localImageView.getImageMatrix());
    case 1:
    case 2:
    }
    while (true)
    {
      localMap.put("android:changeImageTransform:matrix", paramah);
      break;
      localObject = localImageView.getDrawable();
      paramah = new Matrix();
      paramah.postScale(localImageView.getWidth() / ((Drawable)localObject).getIntrinsicWidth(), localImageView.getHeight() / ((Drawable)localObject).getIntrinsicHeight());
      continue;
      paramah = localImageView.getDrawable();
      int i = paramah.getIntrinsicWidth();
      int j = localImageView.getWidth();
      float f1 = j / i;
      int k = paramah.getIntrinsicHeight();
      int m = localImageView.getHeight();
      float f2 = Math.max(f1, m / k);
      float f3 = i;
      f1 = k;
      k = Math.round((j - f3 * f2) / 2.0F);
      m = Math.round((m - f1 * f2) / 2.0F);
      paramah = new Matrix();
      paramah.postScale(f2, f2);
      paramah.postTranslate(k, m);
    }
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null));
    Rect localRect;
    for (paramViewGroup = null; ; paramViewGroup = null)
    {
      return paramViewGroup;
      localRect = (Rect)paramah1.values.get("android:changeImageTransform:bounds");
      paramViewGroup = (Rect)paramah2.values.get("android:changeImageTransform:bounds");
      if ((localRect != null) && (paramViewGroup != null))
        break;
    }
    paramah1 = (Matrix)paramah1.values.get("android:changeImageTransform:matrix");
    Matrix localMatrix = (Matrix)paramah2.values.get("android:changeImageTransform:matrix");
    if (((paramah1 == null) && (localMatrix == null)) || ((paramah1 != null) && (paramah1.equals(localMatrix))));
    for (int i = 1; ; i = 0)
    {
      if ((!localRect.equals(paramViewGroup)) || (i == 0))
        break label138;
      paramViewGroup = null;
      break;
    }
    label138: paramah2 = (ImageView)paramah2.view;
    paramViewGroup = paramah2.getDrawable();
    int j = paramViewGroup.getIntrinsicWidth();
    i = paramViewGroup.getIntrinsicHeight();
    l.a(paramah2);
    if ((j == 0) || (i == 0));
    for (paramViewGroup = ObjectAnimator.ofObject(paramah2, xT, xS, new Matrix[] { null, null }); ; paramViewGroup = ObjectAnimator.ofObject(paramah2, xT, new ag.a(), new Matrix[] { paramViewGroup, paramah1 }))
    {
      l.a(paramah2, paramViewGroup);
      break;
      paramViewGroup = paramah1;
      if (paramah1 == null)
        paramViewGroup = p.vt;
      paramah1 = localMatrix;
      if (localMatrix == null)
        paramah1 = p.vt;
      xT.set(paramah2, paramViewGroup);
    }
  }

  public final void a(ah paramah)
  {
    c(paramah);
  }

  public final void b(ah paramah)
  {
    c(paramah);
  }

  public final String[] getTransitionProperties()
  {
    return xk;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeImageTransform
 * JD-Core Version:    0.6.2
 */