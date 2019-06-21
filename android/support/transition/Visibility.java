package android.support.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.v4.content.a.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.Map;

public abstract class Visibility extends Transition
{
  private static final String[] xk = { "android:visibility:visibility", "android:visibility:parent" };
  int mMode = 3;

  public Visibility()
  {
  }

  public Visibility(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ac.zA);
    int i = c.a(paramContext, (XmlResourceParser)paramAttributeSet, "transitionVisibilityMode", 0, 0);
    paramContext.recycle();
    if (i != 0)
      setMode(i);
  }

  private static Visibility.b b(ah paramah1, ah paramah2)
  {
    Visibility.b localb = new Visibility.b((byte)0);
    localb.BH = false;
    localb.BI = false;
    if ((paramah1 != null) && (paramah1.values.containsKey("android:visibility:visibility")))
    {
      localb.BJ = ((Integer)paramah1.values.get("android:visibility:visibility")).intValue();
      localb.yE = ((ViewGroup)paramah1.values.get("android:visibility:parent"));
      if ((paramah2 == null) || (!paramah2.values.containsKey("android:visibility:visibility")))
        break label178;
      localb.BK = ((Integer)paramah2.values.get("android:visibility:visibility")).intValue();
      localb.BL = ((ViewGroup)paramah2.values.get("android:visibility:parent"));
    }
    while (true)
      if ((paramah1 != null) && (paramah2 != null))
      {
        if ((localb.BJ == localb.BK) && (localb.yE == localb.BL))
        {
          return localb;
          localb.BJ = -1;
          localb.yE = null;
          break;
          label178: localb.BK = -1;
          localb.BL = null;
          continue;
        }
        if (localb.BJ != localb.BK)
          if (localb.BJ == 0)
          {
            localb.BI = false;
            localb.BH = true;
          }
      }
    while (true)
    {
      break;
      if (localb.BK == 0)
      {
        localb.BI = true;
        localb.BH = true;
        continue;
        if (localb.BL == null)
        {
          localb.BI = false;
          localb.BH = true;
        }
        else if (localb.yE == null)
        {
          localb.BI = true;
          localb.BH = true;
          continue;
          if ((paramah1 == null) && (localb.BK == 0))
          {
            localb.BI = true;
            localb.BH = true;
          }
          else if ((paramah2 == null) && (localb.BJ == 0))
          {
            localb.BI = false;
            localb.BH = true;
          }
        }
      }
    }
  }

  private static void c(ah paramah)
  {
    int i = paramah.view.getVisibility();
    paramah.values.put("android:visibility:visibility", Integer.valueOf(i));
    paramah.values.put("android:visibility:parent", paramah.view.getParent());
    int[] arrayOfInt = new int[2];
    paramah.view.getLocationOnScreen(arrayOfInt);
    paramah.values.put("android:visibility:screenLocation", arrayOfInt);
  }

  public final Animator a(ViewGroup paramViewGroup, ah paramah1, ah paramah2)
  {
    Object localObject1 = b(paramah1, paramah2);
    int i;
    label143: label152: Canvas localCanvas;
    Object localObject2;
    Object localObject3;
    label177: int j;
    if ((((Visibility.b)localObject1).BH) && ((((Visibility.b)localObject1).yE != null) || (((Visibility.b)localObject1).BL != null)))
    {
      if (((Visibility.b)localObject1).BI)
      {
        if (((this.mMode & 0x1) != 1) || (paramah2 == null))
          paramViewGroup = null;
        while (true)
        {
          return paramViewGroup;
          if (paramah1 == null)
          {
            localObject1 = (View)paramah2.view.getParent();
            if (b(c((View)localObject1, false), b((View)localObject1, false)).BH)
              paramViewGroup = null;
          }
          else
          {
            paramViewGroup = a(paramViewGroup, paramah2.view, paramah1, paramah2);
          }
        }
      }
      i = ((Visibility.b)localObject1).BK;
      if ((this.mMode & 0x2) == 2)
      {
        if (paramah1 != null)
        {
          localObject1 = paramah1.view;
          if (paramah2 == null)
            break label299;
          paramah2 = paramah2.view;
          localCanvas = null;
          localObject2 = null;
          if ((paramah2 != null) && (paramah2.getParent() != null))
            break label745;
          if (paramah2 == null)
            break label304;
          localObject3 = localObject2;
        }
        while (true)
          if ((paramah2 != null) && (paramah1 != null))
          {
            localObject1 = (int[])paramah1.values.get("android:visibility:screenLocation");
            i = localObject1[0];
            j = localObject1[1];
            localObject1 = new int[2];
            paramViewGroup.getLocationOnScreen((int[])localObject1);
            paramah2.offsetLeftAndRight(i - localObject1[0] - paramah2.getLeft());
            paramah2.offsetTopAndBottom(j - localObject1[1] - paramah2.getTop());
            localObject1 = an.c(paramViewGroup);
            ((am)localObject1).add(paramah2);
            paramViewGroup = a(paramViewGroup, paramah2, paramah1);
            if (paramViewGroup == null)
            {
              ((am)localObject1).remove(paramah2);
              break;
              localObject1 = null;
              break label143;
              label299: paramah2 = null;
              break label152;
              label304: paramah2 = localCanvas;
              localObject3 = localObject2;
              if (localObject1 == null)
                continue;
              if (((View)localObject1).getParent() != null)
              {
                paramah2 = localCanvas;
                localObject3 = localObject2;
                if (!(((View)localObject1).getParent() instanceof View))
                  continue;
                paramah2 = (View)((View)localObject1).getParent();
                if (!b(b(paramah2, true), c(paramah2, true)).BH)
                {
                  Matrix localMatrix = new Matrix();
                  localMatrix.setTranslate(-paramah2.getScrollX(), -paramah2.getScrollY());
                  au.a((View)localObject1, localMatrix);
                  au.b(paramViewGroup, localMatrix);
                  RectF localRectF = new RectF(0.0F, 0.0F, ((View)localObject1).getWidth(), ((View)localObject1).getHeight());
                  localMatrix.mapRect(localRectF);
                  int k = Math.round(localRectF.left);
                  int m = Math.round(localRectF.top);
                  int n = Math.round(localRectF.right);
                  j = Math.round(localRectF.bottom);
                  localObject3 = new ImageView(((View)localObject1).getContext());
                  ((ImageView)localObject3).setScaleType(ImageView.ScaleType.CENTER_CROP);
                  localCanvas = null;
                  int i1 = Math.round(localRectF.width());
                  int i2 = Math.round(localRectF.height());
                  paramah2 = localCanvas;
                  if (i1 > 0)
                  {
                    paramah2 = localCanvas;
                    if (i2 > 0)
                    {
                      float f = Math.min(1.0F, 1048576.0F / (i1 * i2));
                      i1 = (int)(i1 * f);
                      i2 = (int)(i2 * f);
                      localMatrix.postTranslate(-localRectF.left, -localRectF.top);
                      localMatrix.postScale(f, f);
                      paramah2 = Bitmap.createBitmap(i1, i2, Bitmap.Config.ARGB_8888);
                      localCanvas = new Canvas(paramah2);
                      localCanvas.concat(localMatrix);
                      ((View)localObject1).draw(localCanvas);
                    }
                  }
                  if (paramah2 != null)
                    ((ImageView)localObject3).setImageBitmap(paramah2);
                  ((ImageView)localObject3).measure(View.MeasureSpec.makeMeasureSpec(n - k, 1073741824), View.MeasureSpec.makeMeasureSpec(j - m, 1073741824));
                  ((ImageView)localObject3).layout(k, m, n, j);
                  paramah2 = (ah)localObject3;
                  localObject3 = localObject2;
                  continue;
                }
                if (paramah2.getParent() != null)
                  break label885;
                j = paramah2.getId();
                if ((j == -1) || (paramViewGroup.findViewById(j) == null) || (!this.Ad))
                  break label885;
              }
            }
          }
      }
    }
    label745: label885: for (paramah2 = (ah)localObject1; ; paramah2 = null)
    {
      localObject3 = localObject2;
      break label177;
      if (i == 4)
      {
        localObject3 = paramah2;
        paramah2 = localCanvas;
        break label177;
      }
      if (localObject1 == paramah2)
      {
        localObject3 = paramah2;
        paramah2 = localCanvas;
        break label177;
      }
      paramah2 = (ah)localObject1;
      localObject3 = localObject2;
      break label177;
      paramViewGroup.addListener(new Visibility.1(this, (am)localObject1, paramah2));
      break;
      if (localObject3 != null)
      {
        j = ((View)localObject3).getVisibility();
        au.l((View)localObject3, 0);
        paramViewGroup = a(paramViewGroup, (View)localObject3, paramah1);
        if (paramViewGroup != null)
        {
          paramah1 = new Visibility.a((View)localObject3, i);
          paramViewGroup.addListener(paramah1);
          a.a(paramViewGroup, paramah1);
          a(paramah1);
          break;
        }
        au.l((View)localObject3, j);
        break;
      }
      paramViewGroup = null;
      break;
      paramViewGroup = null;
      break;
    }
  }

  public Animator a(ViewGroup paramViewGroup, View paramView, ah paramah)
  {
    return null;
  }

  public Animator a(ViewGroup paramViewGroup, View paramView, ah paramah1, ah paramah2)
  {
    return null;
  }

  public void a(ah paramah)
  {
    c(paramah);
  }

  public final boolean a(ah paramah1, ah paramah2)
  {
    boolean bool1 = false;
    boolean bool2;
    if ((paramah1 == null) && (paramah2 == null))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if ((paramah1 != null) && (paramah2 != null))
      {
        bool2 = bool1;
        if (paramah2.values.containsKey("android:visibility:visibility") != paramah1.values.containsKey("android:visibility:visibility"));
      }
      else
      {
        paramah1 = b(paramah1, paramah2);
        bool2 = bool1;
        if (paramah1.BH)
          if (paramah1.BJ != 0)
          {
            bool2 = bool1;
            if (paramah1.BK != 0);
          }
          else
          {
            bool2 = true;
          }
      }
    }
  }

  public void b(ah paramah)
  {
    c(paramah);
  }

  public final String[] getTransitionProperties()
  {
    return xk;
  }

  public final void setMode(int paramInt)
  {
    if ((paramInt & 0xFFFFFFFC) != 0)
      throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    this.mMode = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.transition.Visibility
 * JD-Core Version:    0.6.2
 */