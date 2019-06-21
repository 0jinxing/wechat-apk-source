package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition
{
  private static final Property<b, float[]> xW;
  private static final Property<b, PointF> xX;
  private static final boolean xY;
  private static final String[] xk;
  private boolean xZ = true;
  private boolean xt = true;
  private Matrix ya = new Matrix();

  static
  {
    boolean bool = true;
    xk = new String[] { "android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix" };
    xW = new ChangeTransform.1([F.class, "nonTranslations");
    xX = new ChangeTransform.2(PointF.class, "translations");
    if (Build.VERSION.SDK_INT >= 21);
    while (true)
    {
      xY = bool;
      return;
      bool = false;
    }
  }

  public ChangeTransform()
  {
  }

  public ChangeTransform(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zC);
    this.xZ = c.a(paramContext, (XmlPullParser)paramAttributeSet, "reparentWithOverlay", 1, true);
    this.xt = c.a(paramContext, (XmlPullParser)paramAttributeSet, "reparent", 0, true);
    paramContext.recycle();
  }

  private static void a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8)
  {
    paramView.setTranslationX(paramFloat1);
    paramView.setTranslationY(paramFloat2);
    s.i(paramView, paramFloat3);
    paramView.setScaleX(paramFloat4);
    paramView.setScaleY(paramFloat5);
    paramView.setRotationX(paramFloat6);
    paramView.setRotationY(paramFloat7);
    paramView.setRotation(paramFloat8);
  }

  private void b(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    View localView = paramah2.view;
    Object localObject = new Matrix((Matrix)paramah2.values.get("android:changeTransform:parentMatrix"));
    au.b(paramViewGroup, (Matrix)localObject);
    localObject = k.a(localView, paramViewGroup, (Matrix)localObject);
    if (localObject == null);
    while (true)
    {
      return;
      ((j)localObject).a((ViewGroup)paramah1.values.get("android:changeTransform:parent"), paramah1.view);
      for (paramViewGroup = this; paramViewGroup.zY != null; paramViewGroup = paramViewGroup.zY);
      paramViewGroup.a(new ChangeTransform.a(localView, (j)localObject));
      if (xY)
      {
        if (paramah1.view != paramah2.view)
          au.c(paramah1.view, 0.0F);
        au.c(localView, 1.0F);
      }
    }
  }

  private void c(ah paramah)
  {
    View localView = paramah.view;
    if (localView.getVisibility() == 8)
      return;
    paramah.values.put("android:changeTransform:parent", localView.getParent());
    Object localObject = new ChangeTransform.c(localView);
    paramah.values.put("android:changeTransform:transforms", localObject);
    localObject = localView.getMatrix();
    if ((localObject == null) || (((Matrix)localObject).isIdentity()));
    for (localObject = null; ; localObject = new Matrix((Matrix)localObject))
    {
      paramah.values.put("android:changeTransform:matrix", localObject);
      if (!this.xt)
        break;
      Matrix localMatrix = new Matrix();
      localObject = (ViewGroup)localView.getParent();
      au.a((View)localObject, localMatrix);
      localMatrix.preTranslate(-((ViewGroup)localObject).getScrollX(), -((ViewGroup)localObject).getScrollY());
      paramah.values.put("android:changeTransform:parentMatrix", localMatrix);
      paramah.values.put("android:changeTransform:intermediateMatrix", localView.getTag(2131820684));
      paramah.values.put("android:changeTransform:intermediateParentMatrix", localView.getTag(2131820647));
      break;
    }
  }

  private static void w(View paramView)
  {
    a(paramView, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null) || (!paramah1.values.containsKey("android:changeTransform:parent")) || (!paramah2.values.containsKey("android:changeTransform:parent")))
    {
      paramViewGroup = null;
      return paramViewGroup;
    }
    ViewGroup localViewGroup = (ViewGroup)paramah1.values.get("android:changeTransform:parent");
    Object localObject1 = (ViewGroup)paramah2.values.get("android:changeTransform:parent");
    int i;
    if (this.xt)
      if ((!C(localViewGroup)) || (!C((View)localObject1)))
        if (localViewGroup == localObject1)
          i = 1;
    while (true)
    {
      label107: boolean bool;
      label115: Object localObject2;
      if (i == 0)
      {
        bool = true;
        localObject2 = (Matrix)paramah1.values.get("android:changeTransform:intermediateMatrix");
        if (localObject2 != null)
          paramah1.values.put("android:changeTransform:matrix", localObject2);
        localObject2 = (Matrix)paramah1.values.get("android:changeTransform:intermediateParentMatrix");
        if (localObject2 != null)
          paramah1.values.put("android:changeTransform:parentMatrix", localObject2);
        if (bool)
        {
          localObject2 = (Matrix)paramah2.values.get("android:changeTransform:parentMatrix");
          paramah2.view.setTag(2131820647, localObject2);
          localObject1 = this.ya;
          ((Matrix)localObject1).reset();
          ((Matrix)localObject2).invert((Matrix)localObject1);
          localObject2 = (Matrix)paramah1.values.get("android:changeTransform:matrix");
          if (localObject2 != null)
            break label674;
          localObject2 = new Matrix();
          paramah1.values.put("android:changeTransform:matrix", localObject2);
        }
      }
      label647: label674: 
      while (true)
      {
        ((Matrix)localObject2).postConcat((Matrix)paramah1.values.get("android:changeTransform:parentMatrix"));
        ((Matrix)localObject2).postConcat((Matrix)localObject1);
        Object localObject3 = (Matrix)paramah1.values.get("android:changeTransform:matrix");
        localObject2 = (Matrix)paramah2.values.get("android:changeTransform:matrix");
        localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = p.vt;
        if (localObject2 == null)
          localObject2 = p.vt;
        while (true)
        {
          if (((Matrix)localObject1).equals(localObject2));
          for (localObject2 = null; ; localObject2 = localObject1)
          {
            if ((!bool) || (localObject2 == null) || (!this.xZ))
              break label647;
            b(paramViewGroup, paramah1, paramah2);
            paramViewGroup = (ViewGroup)localObject2;
            break;
            i = 0;
            break label107;
            localObject2 = c(localViewGroup, true);
            if (localObject2 == null)
              break label677;
            if (localObject1 == ((ah)localObject2).view)
            {
              i = 1;
              break label107;
            }
            i = 0;
            break label107;
            bool = false;
            break label115;
            localObject3 = (ChangeTransform.c)paramah2.values.get("android:changeTransform:transforms");
            View localView = paramah2.view;
            w(localView);
            Object localObject4 = new float[9];
            ((Matrix)localObject1).getValues((float[])localObject4);
            float[] arrayOfFloat = new float[9];
            ((Matrix)localObject2).getValues(arrayOfFloat);
            b localb = new b(localView, (float[])localObject4);
            localObject1 = PropertyValuesHolder.ofObject(xW, new f(new float[9]), new float[][] { localObject4, arrayOfFloat });
            localObject4 = this.Ak.getPath(localObject4[2], localObject4[5], arrayOfFloat[2], arrayOfFloat[5]);
            localObject1 = ObjectAnimator.ofPropertyValuesHolder(localb, new PropertyValuesHolder[] { localObject1, v.a(xX, (Path)localObject4) });
            localObject2 = new ChangeTransform.3(this, bool, (Matrix)localObject2, localView, (ChangeTransform.c)localObject3, localb);
            ((ObjectAnimator)localObject1).addListener((Animator.AnimatorListener)localObject2);
            a.a((Animator)localObject1, (AnimatorListenerAdapter)localObject2);
          }
          paramViewGroup = (ViewGroup)localObject2;
          if (xY)
            break;
          localViewGroup.endViewTransition(paramah1.view);
          paramViewGroup = (ViewGroup)localObject2;
          break;
        }
      }
      label677: i = 0;
    }
  }

  public final void a(ah paramah)
  {
    c(paramah);
    if (!xY)
      ((ViewGroup)paramah.view.getParent()).startViewTransition(paramah.view);
  }

  public final void b(ah paramah)
  {
    c(paramah);
  }

  public final String[] getTransitionProperties()
  {
    return xk;
  }

  static final class b
  {
    final Matrix mMatrix = new Matrix();
    private final View mView;
    final float[] yh;
    float yi;
    float yj;

    b(View paramView, float[] paramArrayOfFloat)
    {
      this.mView = paramView;
      this.yh = ((float[])paramArrayOfFloat.clone());
      this.yi = this.yh[2];
      this.yj = this.yh[5];
      cR();
    }

    final void cR()
    {
      this.yh[2] = this.yi;
      this.yh[5] = this.yj;
      this.mMatrix.setValues(this.yh);
      au.c(this.mView, this.mMatrix);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeTransform
 * JD-Core Version:    0.6.2
 */