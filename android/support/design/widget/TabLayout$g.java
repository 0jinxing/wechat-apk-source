package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.s;
import android.support.v7.app.ActionBar.a;
import android.support.v7.c.a.b;
import android.support.v7.widget.be;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

final class TabLayout$g extends LinearLayout
{
  private View sQ;
  private TabLayout.e sV;
  private TextView sW;
  private ImageView sX;
  private TextView sY;
  private ImageView sZ;
  private int ta = 2;

  public TabLayout$g(TabLayout paramTabLayout, Context paramContext)
  {
    super(paramContext);
    if (paramTabLayout.se != 0)
      s.a(this, b.g(paramContext, paramTabLayout.se));
    s.d(this, paramTabLayout.rV, paramTabLayout.rW, paramTabLayout.rX, paramTabLayout.rY);
    setGravity(17);
    setOrientation(1);
    setClickable(true);
    s.a(this, android.support.v4.view.q.U(getContext()));
  }

  private void a(TextView paramTextView, ImageView paramImageView)
  {
    Object localObject = null;
    Drawable localDrawable;
    CharSequence localCharSequence1;
    label34: CharSequence localCharSequence2;
    label50: label75: int i;
    if (this.sV != null)
    {
      localDrawable = this.sV.rP;
      if (this.sV == null)
        break label196;
      localCharSequence1 = this.sV.mText;
      if (this.sV == null)
        break label202;
      localCharSequence2 = this.sV.sP;
      if (paramImageView != null)
      {
        if (localDrawable == null)
          break label208;
        paramImageView.setImageDrawable(localDrawable);
        paramImageView.setVisibility(0);
        setVisibility(0);
        paramImageView.setContentDescription(localCharSequence2);
      }
      if (TextUtils.isEmpty(localCharSequence1))
        break label222;
      i = 1;
      label92: if (paramTextView != null)
      {
        if (i == 0)
          break label228;
        paramTextView.setText(localCharSequence1);
        paramTextView.setVisibility(0);
        setVisibility(0);
        label117: paramTextView.setContentDescription(localCharSequence2);
      }
      if (paramImageView != null)
      {
        paramTextView = (ViewGroup.MarginLayoutParams)paramImageView.getLayoutParams();
        if ((i == 0) || (paramImageView.getVisibility() != 0))
          break label248;
      }
    }
    label196: label202: label208: label222: label228: label248: for (int j = this.sy.ad(8); ; j = 0)
    {
      if (j != paramTextView.bottomMargin)
      {
        paramTextView.bottomMargin = j;
        paramImageView.requestLayout();
      }
      if (i != 0);
      for (paramTextView = localObject; ; paramTextView = localCharSequence2)
      {
        be.a(this, paramTextView);
        return;
        localDrawable = null;
        break;
        localCharSequence1 = null;
        break label34;
        localCharSequence2 = null;
        break label50;
        paramImageView.setVisibility(8);
        paramImageView.setImageDrawable(null);
        break label75;
        i = 0;
        break label92;
        paramTextView.setVisibility(8);
        paramTextView.setText(null);
        break label117;
      }
    }
  }

  final void i(TabLayout.e parame)
  {
    if (parame != this.sV)
    {
      this.sV = parame;
      update();
    }
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
    int i = 1;
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt1);
    int m = this.sy.getTabMaxWidth();
    int n = paramInt1;
    if (m > 0)
      if (k != 0)
      {
        n = paramInt1;
        if (j <= m);
      }
      else
      {
        n = View.MeasureSpec.makeMeasureSpec(this.sy.sf, -2147483648);
      }
    super.onMeasure(n, paramInt2);
    float f1;
    float f2;
    if (this.sW != null)
    {
      getResources();
      f1 = this.sy.sc;
      m = this.ta;
      if ((this.sX == null) || (this.sX.getVisibility() != 0))
        break label289;
      paramInt1 = 1;
      f2 = f1;
    }
    while (true)
    {
      f1 = this.sW.getTextSize();
      j = this.sW.getLineCount();
      m = android.support.v4.widget.q.b(this.sW);
      if ((f2 != f1) || ((m >= 0) && (paramInt1 != m)))
      {
        m = i;
        if (this.sy.mMode == 1)
        {
          m = i;
          if (f2 > f1)
          {
            m = i;
            if (j == 1)
            {
              Layout localLayout = this.sW.getLayout();
              if (localLayout != null)
              {
                f1 = localLayout.getLineWidth(0);
                m = i;
                if (f2 / localLayout.getPaint().getTextSize() * f1 <= getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
              }
              else
              {
                m = 0;
              }
            }
          }
        }
        if (m != 0)
        {
          this.sW.setTextSize(0, f2);
          this.sW.setMaxLines(paramInt1);
          super.onMeasure(n, paramInt2);
        }
      }
      return;
      label289: paramInt1 = m;
      f2 = f1;
      if (this.sW != null)
      {
        paramInt1 = m;
        f2 = f1;
        if (this.sW.getLineCount() > 1)
        {
          f2 = this.sy.sd;
          paramInt1 = m;
        }
      }
    }
  }

  public final boolean performClick()
  {
    boolean bool1 = super.performClick();
    boolean bool2 = bool1;
    if (this.sV != null)
    {
      if (!bool1)
        playSoundEffect(0);
      this.sV.select();
      bool2 = true;
    }
    return bool2;
  }

  public final void setSelected(boolean paramBoolean)
  {
    if (isSelected() != paramBoolean);
    for (int i = 1; ; i = 0)
    {
      super.setSelected(paramBoolean);
      if ((i != 0) && (paramBoolean) && (Build.VERSION.SDK_INT < 16))
        sendAccessibilityEvent(4);
      if (this.sW != null)
        this.sW.setSelected(paramBoolean);
      if (this.sX != null)
        this.sX.setSelected(paramBoolean);
      if (this.sQ != null)
        this.sQ.setSelected(paramBoolean);
      return;
    }
  }

  final void update()
  {
    TabLayout.e locale = this.sV;
    Object localObject;
    if (locale != null)
    {
      localObject = locale.sQ;
      if (localObject == null)
        break label303;
      ViewParent localViewParent = ((View)localObject).getParent();
      if (localViewParent != this)
      {
        if (localViewParent != null)
          ((ViewGroup)localViewParent).removeView((View)localObject);
        addView((View)localObject);
      }
      this.sQ = ((View)localObject);
      if (this.sW != null)
        this.sW.setVisibility(8);
      if (this.sX != null)
      {
        this.sX.setVisibility(8);
        this.sX.setImageDrawable(null);
      }
      this.sY = ((TextView)((View)localObject).findViewById(16908308));
      if (this.sY != null)
        this.ta = android.support.v4.widget.q.b(this.sY);
      this.sZ = ((ImageView)((View)localObject).findViewById(16908294));
      label136: if (this.sQ != null)
        break label336;
      if (this.sX == null)
      {
        localObject = (ImageView)LayoutInflater.from(getContext()).inflate(2130969275, this, false);
        addView((View)localObject, 0);
        this.sX = ((ImageView)localObject);
      }
      if (this.sW == null)
      {
        localObject = (TextView)LayoutInflater.from(getContext()).inflate(2130969276, this, false);
        addView((View)localObject);
        this.sW = ((TextView)localObject);
        this.ta = android.support.v4.widget.q.b(this.sW);
      }
      android.support.v4.widget.q.b(this.sW, this.sy.rZ);
      if (this.sy.sa != null)
        this.sW.setTextColor(this.sy.sa);
      a(this.sW, this.sX);
      label277: if ((locale == null) || (!locale.isSelected()))
        break label365;
    }
    label303: label336: label365: for (boolean bool = true; ; bool = false)
    {
      setSelected(bool);
      return;
      localObject = null;
      break;
      if (this.sQ != null)
      {
        removeView(this.sQ);
        this.sQ = null;
      }
      this.sY = null;
      this.sZ = null;
      break label136;
      if ((this.sY == null) && (this.sZ == null))
        break label277;
      a(this.sY, this.sZ);
      break label277;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.g
 * JD-Core Version:    0.6.2
 */