package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout extends LinearLayoutCompat
{
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int m = getPaddingRight();
    paramInt1 = getMeasuredHeight();
    int n = getChildCount();
    int i1 = getGravity();
    Object localObject;
    label91: label94: View localView;
    int i2;
    int i3;
    int i4;
    switch (i1 & 0x70)
    {
    default:
      paramInt1 = getPaddingTop();
      localObject = getDividerDrawable();
      if (localObject == null)
      {
        paramInt3 = 0;
        paramInt4 = 0;
        if (paramInt4 >= n)
          return;
        localView = getChildAt(paramInt4);
        paramInt2 = paramInt1;
        if (localView != null)
        {
          paramInt2 = paramInt1;
          if (localView.getVisibility() != 8)
          {
            i2 = localView.getMeasuredWidth();
            i3 = localView.getMeasuredHeight();
            localObject = (LinearLayoutCompat.LayoutParams)localView.getLayoutParams();
            i4 = ((LinearLayoutCompat.LayoutParams)localObject).gravity;
            paramInt2 = i4;
            if (i4 < 0)
              paramInt2 = 0x800007 & i1;
            switch (d.getAbsoluteGravity(paramInt2, s.T(this)) & 0x7)
            {
            default:
              paramInt2 = ((LinearLayoutCompat.LayoutParams)localObject).leftMargin + i;
            case 1:
            case 5:
            }
          }
        }
      }
      break;
    case 80:
    case 16:
    }
    while (true)
    {
      i4 = paramInt1;
      if (bV(paramInt4))
        i4 = paramInt1 + paramInt3;
      paramInt1 = i4 + ((LinearLayoutCompat.LayoutParams)localObject).topMargin;
      localView.layout(paramInt2, paramInt1, i2 + paramInt2, paramInt1 + i3);
      paramInt2 = paramInt1 + (((LinearLayoutCompat.LayoutParams)localObject).bottomMargin + i3);
      paramInt4++;
      paramInt1 = paramInt2;
      break label94;
      paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt1;
      break;
      paramInt3 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - paramInt1) / 2 + paramInt3;
      break;
      paramInt3 = ((Drawable)localObject).getIntrinsicHeight();
      break label91;
      paramInt2 = (j - i - m - i2) / 2 + i + ((LinearLayoutCompat.LayoutParams)localObject).leftMargin - ((LinearLayoutCompat.LayoutParams)localObject).rightMargin;
      continue;
      paramInt2 = j - k - i2 - ((LinearLayoutCompat.LayoutParams)localObject).rightMargin;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    int i = getChildCount();
    int j = 0;
    Object localObject4;
    int k;
    if (j < i)
    {
      localObject4 = getChildAt(j);
      if (((View)localObject4).getVisibility() == 8)
        break label750;
      k = ((View)localObject4).getId();
      if (k == 2131820927)
        localObject1 = localObject4;
    }
    label222: label750: 
    while (true)
    {
      j++;
      break;
      if (k == 2131820916)
      {
        localObject2 = localObject4;
      }
      else
      {
        if ((k == 2131820919) || (k == 2131820925))
          if (localObject3 == null);
        for (j = 0; ; j = 0)
        {
          if (j == 0)
            super.onMeasure(paramInt1, paramInt2);
          return;
          localObject3 = localObject4;
          break;
        }
        int m = View.MeasureSpec.getMode(paramInt2);
        int n = View.MeasureSpec.getSize(paramInt2);
        int i1 = View.MeasureSpec.getMode(paramInt1);
        k = 0;
        int i2 = getPaddingTop() + getPaddingBottom();
        if (localObject1 != null)
        {
          localObject1.measure(paramInt1, 0);
          j = localObject1.getMeasuredHeight();
          k = View.combineMeasuredStates(0, localObject1.getMeasuredState());
          i2 += j;
        }
        while (true)
        {
          j = 0;
          int i3;
          if (localObject2 != null)
          {
            ((View)localObject2).measure(paramInt1, 0);
            localObject4 = localObject2;
            j = s.aa((View)localObject4);
            if (j > 0)
            {
              i3 = ((View)localObject2).getMeasuredHeight();
              i2 += j;
              k = View.combineMeasuredStates(k, ((View)localObject2).getMeasuredState());
              i3 -= j;
            }
          }
          while (true)
          {
            int i4;
            int i5;
            if (localObject3 != null)
              if (m == 0)
              {
                i4 = 0;
                ((View)localObject3).measure(paramInt1, i4);
                i5 = ((View)localObject3).getMeasuredHeight();
                i2 += i5;
                k = View.combineMeasuredStates(k, ((View)localObject3).getMeasuredState());
              }
            while (true)
            {
              n -= i2;
              if (localObject2 != null)
              {
                int i6 = Math.min(n, i3);
                i3 = n;
                i4 = j;
                if (i6 > 0)
                {
                  i3 = n - i6;
                  i4 = j + i6;
                }
                ((View)localObject2).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                i2 = ((View)localObject2).getMeasuredHeight() + (i2 - j);
                j = View.combineMeasuredStates(k, ((View)localObject2).getMeasuredState());
              }
              for (k = i2; ; k = i2)
              {
                if ((localObject3 != null) && (i3 > 0))
                {
                  ((View)localObject3).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i3 + i5, m));
                  i2 = ((View)localObject3).getMeasuredHeight() + (k - i5);
                  k = View.combineMeasuredStates(j, ((View)localObject3).getMeasuredState());
                  j = i2;
                }
                while (true)
                {
                  i4 = 0;
                  i2 = 0;
                  while (true)
                    if (i2 < i)
                    {
                      localObject3 = getChildAt(i2);
                      i3 = i4;
                      if (((View)localObject3).getVisibility() != 8)
                        i3 = Math.max(i4, ((View)localObject3).getMeasuredWidth());
                      i2++;
                      i4 = i3;
                      continue;
                      if ((localObject4 instanceof ViewGroup))
                      {
                        localObject4 = (ViewGroup)localObject4;
                        if (((ViewGroup)localObject4).getChildCount() == 1)
                        {
                          localObject4 = ((ViewGroup)localObject4).getChildAt(0);
                          break;
                        }
                      }
                      j = 0;
                      break label222;
                      i4 = View.MeasureSpec.makeMeasureSpec(Math.max(0, n - i2), m);
                      break label268;
                    }
                  setMeasuredDimension(View.resolveSizeAndState(i4 + (getPaddingLeft() + getPaddingRight()), paramInt1, k), View.resolveSizeAndState(j, paramInt2, 0));
                  if (i1 != 1073741824)
                  {
                    k = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (j = 0; j < i; j++)
                    {
                      localObject3 = getChildAt(j);
                      if (((View)localObject3).getVisibility() != 8)
                      {
                        localObject2 = (LinearLayoutCompat.LayoutParams)((View)localObject3).getLayoutParams();
                        if (((LinearLayoutCompat.LayoutParams)localObject2).width == -1)
                        {
                          i2 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
                          ((LinearLayoutCompat.LayoutParams)localObject2).height = ((View)localObject3).getMeasuredHeight();
                          measureChildWithMargins((View)localObject3, k, 0, paramInt2, 0);
                          ((LinearLayoutCompat.LayoutParams)localObject2).height = i2;
                        }
                      }
                    }
                  }
                  j = 1;
                  break;
                  i2 = j;
                  j = k;
                  k = i2;
                }
                j = k;
                i3 = n;
              }
              i5 = 0;
            }
            i3 = 0;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.AlertDialogLayout
 * JD-Core Version:    0.6.2
 */