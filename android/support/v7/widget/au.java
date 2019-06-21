package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.a;
import android.support.v7.app.ActionBar.a;
import android.support.v7.view.a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;

public final class au extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final Interpolator aqx = new DecelerateInterpolator();
  int acy;
  Runnable aqq;
  LinearLayoutCompat aqr;
  private Spinner aqs;
  private boolean aqt;
  int aqu;
  int aqv;
  private int aqw;

  private boolean kA()
  {
    if ((this.aqs != null) && (this.aqs.getParent() == this));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean kB()
  {
    if (!kA());
    while (true)
    {
      return false;
      removeView(this.aqs);
      addView(this.aqr, new ViewGroup.LayoutParams(-2, -1));
      setTabSelected(this.aqs.getSelectedItemPosition());
    }
  }

  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.aqq != null)
      post(this.aqq);
  }

  protected final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a locala = a.X(getContext());
    TypedArray localTypedArray = locala.mContext.obtainStyledAttributes(null, a.a.ActionBar, 2130772135, 0);
    int i = localTypedArray.getLayoutDimension(0, 0);
    paramConfiguration = locala.mContext.getResources();
    int j = i;
    if (!locala.fZ())
      j = Math.min(i, paramConfiguration.getDimensionPixelSize(2131427926));
    localTypedArray.recycle();
    setContentHeight(j);
    this.aqv = locala.mContext.getResources().getDimensionPixelSize(2131427927);
  }

  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.aqq != null)
      removeCallbacks(this.aqq);
  }

  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
  }

  public final void onMeasure(int paramInt1, int paramInt2)
  {
    paramInt2 = 1;
    int i = View.MeasureSpec.getMode(paramInt1);
    boolean bool;
    int j;
    if (i == 1073741824)
    {
      bool = true;
      setFillViewport(bool);
      j = this.aqr.getChildCount();
      if ((j <= 1) || ((i != 1073741824) && (i != -2147483648)))
        break label329;
      if (j <= 2)
        break label316;
      this.aqu = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      label68: this.aqu = Math.min(this.aqu, this.aqv);
      label83: j = View.MeasureSpec.makeMeasureSpec(this.acy, 1073741824);
      if ((bool) || (!this.aqt))
        break label337;
      label106: if (paramInt2 == 0)
        break label350;
      this.aqr.measure(0, j);
      if (this.aqr.getMeasuredWidth() <= View.MeasureSpec.getSize(paramInt1))
        break label342;
      if (!kA())
      {
        if (this.aqs == null)
        {
          AppCompatSpinner localAppCompatSpinner = new AppCompatSpinner(getContext(), null, 2130772163);
          localAppCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
          localAppCompatSpinner.setOnItemSelectedListener(this);
          this.aqs = localAppCompatSpinner;
        }
        removeView(this.aqr);
        addView(this.aqs, new ViewGroup.LayoutParams(-2, -1));
        if (this.aqs.getAdapter() == null)
          this.aqs.setAdapter(new a());
        if (this.aqq != null)
        {
          removeCallbacks(this.aqq);
          this.aqq = null;
        }
        this.aqs.setSelection(this.aqw);
      }
    }
    while (true)
    {
      paramInt2 = getMeasuredWidth();
      super.onMeasure(paramInt1, j);
      paramInt1 = getMeasuredWidth();
      if ((bool) && (paramInt2 != paramInt1))
        setTabSelected(this.aqw);
      return;
      bool = false;
      break;
      label316: this.aqu = (View.MeasureSpec.getSize(paramInt1) / 2);
      break label68;
      label329: this.aqu = -1;
      break label83;
      label337: paramInt2 = 0;
      break label106;
      label342: kB();
      continue;
      label350: kB();
    }
  }

  public final void onNothingSelected(AdapterView<?> paramAdapterView)
  {
  }

  public final void setAllowCollapse(boolean paramBoolean)
  {
    this.aqt = paramBoolean;
  }

  public final void setContentHeight(int paramInt)
  {
    this.acy = paramInt;
    requestLayout();
  }

  public final void setTabSelected(int paramInt)
  {
    this.aqw = paramInt;
    int i = this.aqr.getChildCount();
    int j = 0;
    if (j < i)
    {
      final View localView = this.aqr.getChildAt(j);
      if (j == paramInt);
      for (boolean bool = true; ; bool = false)
      {
        localView.setSelected(bool);
        if (bool)
        {
          localView = this.aqr.getChildAt(paramInt);
          if (this.aqq != null)
            removeCallbacks(this.aqq);
          this.aqq = new Runnable()
          {
            public final void run()
            {
              int i = localView.getLeft();
              int j = (au.this.getWidth() - localView.getWidth()) / 2;
              au.this.smoothScrollTo(i - j, 0);
              au.this.aqq = null;
            }
          };
          post(this.aqq);
        }
        j++;
        break;
      }
    }
    if ((this.aqs != null) && (paramInt >= 0))
      this.aqs.setSelection(paramInt);
  }

  final class a extends BaseAdapter
  {
    a()
    {
    }

    public final int getCount()
    {
      return au.this.aqr.getChildCount();
    }

    public final Object getItem(int paramInt)
    {
      return ((au.b)au.this.aqr.getChildAt(paramInt)).aqB;
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramViewGroup = au.this;
        paramView = (ActionBar.a)getItem(paramInt);
        paramView = new au.b(paramViewGroup, paramViewGroup.getContext(), paramView);
        paramView.setBackgroundDrawable(null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(-1, paramViewGroup.acy));
      }
      while (true)
      {
        return paramView;
        paramViewGroup = (au.b)paramView;
        paramViewGroup.aqB = ((ActionBar.a)getItem(paramInt));
        paramViewGroup.update();
      }
    }
  }

  final class b extends LinearLayout
  {
    private final int[] aqA = { 16842964 };
    ActionBar.a aqB;
    private View sQ;
    private TextView sW;
    private ImageView sX;

    public b(Context parama, ActionBar.a arg3)
    {
      super(null, 2130772129);
      Object localObject;
      this.aqB = localObject;
      this$1 = bc.a(parama, null, this.aqA, 2130772129, 0);
      if (au.this.hasValue(0))
        setBackgroundDrawable(au.this.getDrawable(0));
      au.this.atG.recycle();
      setGravity(8388627);
      update();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ActionBar.a.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName(ActionBar.a.class.getName());
    }

    public final void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if ((au.this.aqu > 0) && (getMeasuredWidth() > au.this.aqu))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(au.this.aqu, 1073741824), paramInt2);
    }

    public final void setSelected(boolean paramBoolean)
    {
      if (isSelected() != paramBoolean);
      for (int i = 1; ; i = 0)
      {
        super.setSelected(paramBoolean);
        if ((i != 0) && (paramBoolean))
          sendAccessibilityEvent(4);
        return;
      }
    }

    public final void update()
    {
      Object localObject1 = this.aqB;
      Object localObject2 = ((ActionBar.a)localObject1).getCustomView();
      if (localObject2 != null)
      {
        localObject1 = ((View)localObject2).getParent();
        if (localObject1 != this)
        {
          if (localObject1 != null)
            ((ViewGroup)localObject1).removeView((View)localObject2);
          addView((View)localObject2);
        }
        this.sQ = ((View)localObject2);
        if (this.sW != null)
          this.sW.setVisibility(8);
        if (this.sX != null)
        {
          this.sX.setVisibility(8);
          this.sX.setImageDrawable(null);
        }
        return;
      }
      if (this.sQ != null)
      {
        removeView(this.sQ);
        this.sQ = null;
      }
      Drawable localDrawable = ((ActionBar.a)localObject1).getIcon();
      localObject2 = ((ActionBar.a)localObject1).getText();
      label197: int i;
      if (localDrawable != null)
      {
        Object localObject3;
        Object localObject4;
        if (this.sX == null)
        {
          localObject3 = new AppCompatImageView(getContext());
          localObject4 = new LinearLayout.LayoutParams(-2, -2);
          ((LinearLayout.LayoutParams)localObject4).gravity = 16;
          ((ImageView)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          addView((View)localObject3, 0);
          this.sX = ((ImageView)localObject3);
        }
        this.sX.setImageDrawable(localDrawable);
        this.sX.setVisibility(0);
        if (TextUtils.isEmpty((CharSequence)localObject2))
          break label358;
        i = 1;
        label207: if (i == 0)
          break label364;
        if (this.sW == null)
        {
          localObject4 = new AppCompatTextView(getContext(), null, 2130772131);
          ((TextView)localObject4).setEllipsize(TextUtils.TruncateAt.END);
          localObject3 = new LinearLayout.LayoutParams(-2, -2);
          ((LinearLayout.LayoutParams)localObject3).gravity = 16;
          ((TextView)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject3);
          addView((View)localObject4);
          this.sW = ((TextView)localObject4);
        }
        this.sW.setText((CharSequence)localObject2);
        this.sW.setVisibility(0);
        label298: if (this.sX != null)
          this.sX.setContentDescription(((ActionBar.a)localObject1).getContentDescription());
        if (i == 0)
          break label391;
      }
      label391: for (localObject1 = null; ; localObject1 = ((ActionBar.a)localObject1).getContentDescription())
      {
        be.a(this, (CharSequence)localObject1);
        break;
        if (this.sX == null)
          break label197;
        this.sX.setVisibility(8);
        this.sX.setImageDrawable(null);
        break label197;
        label358: i = 0;
        break label207;
        label364: if (this.sW == null)
          break label298;
        this.sW.setVisibility(8);
        this.sW.setText(null);
        break label298;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.au
 * JD-Core Version:    0.6.2
 */