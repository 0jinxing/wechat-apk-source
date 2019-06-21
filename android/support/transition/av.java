package android.support.transition;

import android.graphics.Matrix;
import android.view.View;

class av
  implements ba
{
  private float[] Bn;

  public at J(View paramView)
  {
    return ar.I(paramView);
  }

  public be K(View paramView)
  {
    return new bc(paramView.getWindowToken());
  }

  public float L(View paramView)
  {
    Float localFloat = (Float)paramView.getTag(2131820663);
    if (localFloat != null);
    for (float f = paramView.getAlpha() / localFloat.floatValue(); ; f = paramView.getAlpha())
      return f;
  }

  public void M(View paramView)
  {
    if (paramView.getTag(2131820663) == null)
      paramView.setTag(2131820663, Float.valueOf(paramView.getAlpha()));
  }

  public void N(View paramView)
  {
    if (paramView.getVisibility() == 0)
      paramView.setTag(2131820663, null);
  }

  public void a(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    if ((localObject instanceof View))
    {
      localObject = (View)localObject;
      a((View)localObject, paramMatrix);
      paramMatrix.preTranslate(-((View)localObject).getScrollX(), -((View)localObject).getScrollY());
    }
    paramMatrix.preTranslate(paramView.getLeft(), paramView.getTop());
    paramView = paramView.getMatrix();
    if (!paramView.isIdentity())
      paramMatrix.preConcat(paramView);
  }

  public void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setLeft(paramInt1);
    paramView.setTop(paramInt2);
    paramView.setRight(paramInt3);
    paramView.setBottom(paramInt4);
  }

  public void b(View paramView, Matrix paramMatrix)
  {
    Object localObject = paramView.getParent();
    if ((localObject instanceof View))
    {
      localObject = (View)localObject;
      b((View)localObject, paramMatrix);
      paramMatrix.postTranslate(((View)localObject).getScrollX(), ((View)localObject).getScrollY());
    }
    paramMatrix.postTranslate(paramView.getLeft(), paramView.getTop());
    paramView = paramView.getMatrix();
    if (!paramView.isIdentity())
    {
      localObject = new Matrix();
      if (paramView.invert((Matrix)localObject))
        paramMatrix.postConcat((Matrix)localObject);
    }
  }

  public void c(View paramView, float paramFloat)
  {
    Float localFloat = (Float)paramView.getTag(2131820663);
    if (localFloat != null)
      paramView.setAlpha(localFloat.floatValue() * paramFloat);
    while (true)
    {
      return;
      paramView.setAlpha(paramFloat);
    }
  }

  public void c(View paramView, Matrix paramMatrix)
  {
    if ((paramMatrix == null) || (paramMatrix.isIdentity()))
    {
      paramView.setPivotX(paramView.getWidth() / 2);
      paramView.setPivotY(paramView.getHeight() / 2);
      paramView.setTranslationX(0.0F);
      paramView.setTranslationY(0.0F);
      paramView.setScaleX(1.0F);
      paramView.setScaleY(1.0F);
      paramView.setRotation(0.0F);
      return;
    }
    float[] arrayOfFloat1 = this.Bn;
    float[] arrayOfFloat2 = arrayOfFloat1;
    if (arrayOfFloat1 == null)
    {
      arrayOfFloat2 = new float[9];
      this.Bn = arrayOfFloat2;
    }
    paramMatrix.getValues(arrayOfFloat2);
    float f1 = arrayOfFloat2[3];
    float f2 = (float)Math.sqrt(1.0F - f1 * f1);
    if (arrayOfFloat2[0] < 0.0F);
    for (int i = -1; ; i = 1)
    {
      float f3 = i * f2;
      f2 = (float)Math.toDegrees(Math.atan2(f1, f3));
      f1 = arrayOfFloat2[0] / f3;
      f3 = arrayOfFloat2[4] / f3;
      float f4 = arrayOfFloat2[2];
      float f5 = arrayOfFloat2[5];
      paramView.setPivotX(0.0F);
      paramView.setPivotY(0.0F);
      paramView.setTranslationX(f4);
      paramView.setTranslationY(f5);
      paramView.setRotation(f2);
      paramView.setScaleX(f1);
      paramView.setScaleY(f3);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.transition.av
 * JD-Core Version:    0.6.2
 */