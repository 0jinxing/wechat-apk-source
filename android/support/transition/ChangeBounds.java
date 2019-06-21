package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a.c;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class ChangeBounds extends Transition
{
  private static final String[] xk = { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  private static final Property<Drawable, PointF> xl = new ChangeBounds.1(PointF.class, "boundsOrigin");
  private static final Property<ChangeBounds.a, PointF> xm = new ChangeBounds.3(PointF.class, "topLeft");
  private static final Property<ChangeBounds.a, PointF> xn = new ChangeBounds.4(PointF.class, "bottomRight");
  private static final Property<View, PointF> xo = new ChangeBounds.5(PointF.class, "bottomRight");
  private static final Property<View, PointF> xp = new ChangeBounds.6(PointF.class, "topLeft");
  private static final Property<View, PointF> xq = new ChangeBounds.7(PointF.class, "position");
  private static z xu = new z();
  private int[] xr = new int[2];
  private boolean xs = false;
  private boolean xt = false;

  public ChangeBounds()
  {
  }

  public ChangeBounds(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zz);
    boolean bool = c.a(paramContext, (XmlResourceParser)paramAttributeSet, "resizeClip", 0, false);
    paramContext.recycle();
    this.xs = bool;
  }

  private void c(ah paramah)
  {
    View localView = paramah.view;
    if ((s.as(localView)) || (localView.getWidth() != 0) || (localView.getHeight() != 0))
    {
      paramah.values.put("android:changeBounds:bounds", new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
      paramah.values.put("android:changeBounds:parent", paramah.view.getParent());
      if (this.xt)
      {
        paramah.view.getLocationInWindow(this.xr);
        paramah.values.put("android:changeBounds:windowX", Integer.valueOf(this.xr[0]));
        paramah.values.put("android:changeBounds:windowY", Integer.valueOf(this.xr[1]));
      }
      if (this.xs)
        paramah.values.put("android:changeBounds:clip", s.au(localView));
    }
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    if ((paramah1 == null) || (paramah2 == null));
    Object localObject1;
    ViewGroup localViewGroup;
    for (paramah1 = null; ; paramah1 = null)
    {
      return paramah1;
      localObject1 = paramah1.values;
      localObject2 = paramah2.values;
      localObject1 = (ViewGroup)((Map)localObject1).get("android:changeBounds:parent");
      localViewGroup = (ViewGroup)((Map)localObject2).get("android:changeBounds:parent");
      if ((localObject1 != null) && (localViewGroup != null))
        break;
    }
    Object localObject2 = paramah2.view;
    ah localah;
    int i;
    if (this.xt)
    {
      localah = c((View)localObject1, true);
      if (localah == null)
        if (localObject1 == localViewGroup)
          i = 1;
    }
    while (true)
    {
      label104: int k;
      int n;
      int i2;
      int i4;
      int i5;
      int i6;
      int i7;
      int i8;
      int i9;
      int i10;
      if (i != 0)
      {
        paramViewGroup = (Rect)paramah1.values.get("android:changeBounds:bounds");
        localObject1 = (Rect)paramah2.values.get("android:changeBounds:bounds");
        int j = paramViewGroup.left;
        k = ((Rect)localObject1).left;
        int m = paramViewGroup.top;
        n = ((Rect)localObject1).top;
        int i1 = paramViewGroup.right;
        i2 = ((Rect)localObject1).right;
        int i3 = paramViewGroup.bottom;
        i4 = ((Rect)localObject1).bottom;
        i5 = i1 - j;
        i6 = i3 - m;
        i7 = i2 - k;
        i8 = i4 - n;
        paramah1 = (Rect)paramah1.values.get("android:changeBounds:clip");
        localObject1 = (Rect)paramah2.values.get("android:changeBounds:clip");
        i9 = 0;
        i10 = 0;
        if ((i5 == 0) || (i6 == 0))
        {
          i = i9;
          if (i7 != 0)
          {
            i = i9;
            if (i8 == 0);
          }
        }
        else
        {
          if ((j != k) || (m != n))
            i10 = 1;
          if (i1 == i2)
          {
            i = i10;
            if (i3 == i4);
          }
          else
          {
            i = i10 + 1;
          }
        }
        if ((paramah1 == null) || (paramah1.equals(localObject1)))
        {
          i10 = i;
          if (paramah1 == null)
          {
            i10 = i;
            if (localObject1 == null);
          }
        }
        else
        {
          i10 = i + 1;
        }
        if (i10 <= 0)
          break label1130;
        if (!this.xs)
        {
          au.b((View)localObject2, j, m, i1, i3);
          if (i10 == 2)
            if ((i5 == i7) && (i6 == i8))
            {
              paramViewGroup = this.Ak.getPath(j, m, k, n);
              paramViewGroup = q.a(localObject2, xq, paramViewGroup);
            }
          while (true)
          {
            label437: paramah1 = paramViewGroup;
            if (!(((View)localObject2).getParent() instanceof ViewGroup))
              break;
            paramah1 = (ViewGroup)((View)localObject2).getParent();
            an.c(paramah1, true);
            a(new ChangeBounds.10(this, paramah1));
            paramah1 = paramViewGroup;
            break;
            i = 0;
            break label104;
            if (localViewGroup == localah.view)
            {
              i = 1;
              break label104;
            }
            i = 0;
            break label104;
            paramah1 = new ChangeBounds.a((View)localObject2);
            paramViewGroup = this.Ak.getPath(j, m, k, n);
            paramah2 = q.a(paramah1, xm, paramViewGroup);
            paramViewGroup = this.Ak.getPath(i1, i3, i2, i4);
            localObject1 = q.a(paramah1, xn, paramViewGroup);
            paramViewGroup = new AnimatorSet();
            paramViewGroup.playTogether(new Animator[] { paramah2, localObject1 });
            paramViewGroup.addListener(new ChangeBounds.8(this, paramah1));
            continue;
            if ((j != k) || (m != n))
            {
              paramViewGroup = this.Ak.getPath(j, m, k, n);
              paramViewGroup = q.a(localObject2, xp, paramViewGroup);
            }
            else
            {
              paramViewGroup = this.Ak.getPath(i1, i3, i2, i4);
              paramViewGroup = q.a(localObject2, xo, paramViewGroup);
            }
          }
        }
        au.b((View)localObject2, j, m, Math.max(i5, i7) + j, Math.max(i6, i8) + m);
        if ((j == k) && (m == n))
          break label1149;
        paramViewGroup = this.Ak.getPath(j, m, k, n);
      }
      label1130: label1149: for (paramViewGroup = q.a(localObject2, xq, paramViewGroup); ; paramViewGroup = null)
      {
        if (paramah1 == null)
          paramah1 = new Rect(0, 0, i5, i6);
        while (true)
        {
          if (localObject1 == null);
          for (paramah2 = new Rect(0, 0, i7, i8); ; paramah2 = (ah)localObject1)
          {
            if (!paramah1.equals(paramah2))
            {
              s.c((View)localObject2, paramah1);
              paramah1 = ObjectAnimator.ofObject(localObject2, "clipBounds", xu, new Object[] { paramah1, paramah2 });
              paramah1.addListener(new ChangeBounds.9(this, (View)localObject2, (Rect)localObject1, k, n, i2, i4));
            }
            while (true)
            {
              paramViewGroup = ag.a(paramViewGroup, paramah1);
              break label437;
              i = ((Integer)paramah1.values.get("android:changeBounds:windowX")).intValue();
              i10 = ((Integer)paramah1.values.get("android:changeBounds:windowY")).intValue();
              k = ((Integer)paramah2.values.get("android:changeBounds:windowX")).intValue();
              i9 = ((Integer)paramah2.values.get("android:changeBounds:windowY")).intValue();
              if ((i != k) || (i10 != i9))
              {
                paramViewGroup.getLocationInWindow(this.xr);
                paramah1 = Bitmap.createBitmap(((View)localObject2).getWidth(), ((View)localObject2).getHeight(), Bitmap.Config.ARGB_8888);
                ((View)localObject2).draw(new Canvas(paramah1));
                paramah2 = new BitmapDrawable(paramah1);
                float f = au.L((View)localObject2);
                au.c((View)localObject2, 0.0F);
                au.J(paramViewGroup).add(paramah2);
                paramah1 = this.Ak.getPath(i - this.xr[0], i10 - this.xr[1], k - this.xr[0], i9 - this.xr[1]);
                paramah1 = ObjectAnimator.ofPropertyValuesHolder(paramah2, new PropertyValuesHolder[] { v.a(xl, paramah1) });
                paramah1.addListener(new ChangeBounds.2(this, paramViewGroup, paramah2, (View)localObject2, f));
                break;
              }
              paramah1 = null;
              break;
              paramah1 = null;
            }
          }
        }
      }
      i = 1;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.ChangeBounds
 * JD-Core Version:    0.6.2
 */