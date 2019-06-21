package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.a.a.a;
import android.support.v7.widget.ActionMenuView.a;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ae;
import android.support.v7.widget.be;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

public class ActionMenuItemView extends AppCompatTextView
  implements p.a, ActionMenuView.a, View.OnClickListener
{
  private CharSequence IT;
  h.b aac;
  private ae aad;
  b aae;
  private boolean aaf;
  private boolean aag;
  private int aah;
  private int aai;
  private int dg;
  j kY;
  private Drawable rP;

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.aaf = gi();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ActionMenuItemView, paramInt, 0);
    this.dg = paramContext.getDimensionPixelSize(0, 0);
    paramContext.recycle();
    this.aai = ((int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F));
    setOnClickListener(this);
    this.aah = -1;
    setSaveEnabled(false);
  }

  private boolean gi()
  {
    Configuration localConfiguration = getContext().getResources().getConfiguration();
    int i = localConfiguration.screenWidthDp;
    int j = localConfiguration.screenHeightDp;
    if ((i >= 480) || ((i >= 640) && (j >= 480)) || (localConfiguration.orientation == 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void gj()
  {
    int i = 0;
    Object localObject1 = null;
    int j;
    label56: Object localObject2;
    if (!TextUtils.isEmpty(this.IT))
    {
      j = 1;
      if (this.rP != null)
      {
        k = i;
        if (!this.kY.gM())
          break label56;
        if (!this.aaf)
        {
          k = i;
          if (!this.aag)
            break label56;
        }
      }
      int k = 1;
      j &= k;
      if (j == 0)
        break label143;
      localObject2 = this.IT;
      label71: setText((CharSequence)localObject2);
      localObject2 = this.kY.getContentDescription();
      if (!TextUtils.isEmpty((CharSequence)localObject2))
        break label161;
      if (j == 0)
        break label149;
      localObject2 = null;
      label101: setContentDescription((CharSequence)localObject2);
      label107: localObject2 = this.kY.getTooltipText();
      if (!TextUtils.isEmpty((CharSequence)localObject2))
        break label182;
      if (j == 0)
        break label170;
      localObject2 = localObject1;
      label131: be.a(this, (CharSequence)localObject2);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label143: localObject2 = null;
      break label71;
      label149: localObject2 = this.kY.getTitle();
      break label101;
      label161: setContentDescription((CharSequence)localObject2);
      break label107;
      label170: localObject2 = this.kY.getTitle();
      break label131;
      label182: be.a(this, (CharSequence)localObject2);
    }
  }

  public final void a(j paramj)
  {
    this.kY = paramj;
    setIcon(paramj.getIcon());
    setTitle(paramj.a(this));
    setId(paramj.getItemId());
    if (paramj.isVisible());
    for (int i = 0; ; i = 8)
    {
      setVisibility(i);
      setEnabled(paramj.isEnabled());
      if ((paramj.hasSubMenu()) && (this.aad == null))
        this.aad = new a();
      return;
    }
  }

  public final boolean br()
  {
    return true;
  }

  public j getItemData()
  {
    return this.kY;
  }

  public final boolean gk()
  {
    if ((hasText()) && (this.kY.getIcon() == null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean gl()
  {
    return hasText();
  }

  public final boolean hasText()
  {
    if (!TextUtils.isEmpty(getText()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void onClick(View paramView)
  {
    if (this.aac != null)
      this.aac.f(this.kY);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.aaf = gi();
    gj();
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = hasText();
    if ((bool) && (this.aah >= 0))
      super.setPadding(this.aah, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = getMeasuredWidth();
    if (i == -2147483648);
    for (paramInt1 = Math.min(paramInt1, this.dg); ; paramInt1 = this.dg)
    {
      if ((i != 1073741824) && (this.dg > 0) && (j < paramInt1))
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      if ((!bool) && (this.rP != null))
        super.setPadding((getMeasuredWidth() - this.rP.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      return;
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    super.onRestoreInstanceState(null);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.kY.hasSubMenu()) && (this.aad != null) && (this.aad.onTouch(this, paramMotionEvent)));
    for (boolean bool = true; ; bool = super.onTouchEvent(paramMotionEvent))
      return bool;
  }

  public void setCheckable(boolean paramBoolean)
  {
  }

  public void setChecked(boolean paramBoolean)
  {
  }

  public void setExpandedFormat(boolean paramBoolean)
  {
    if (this.aag != paramBoolean)
    {
      this.aag = paramBoolean;
      if (this.kY != null)
        this.kY.lo.gA();
    }
  }

  public void setIcon(Drawable paramDrawable)
  {
    this.rP = paramDrawable;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      int k = j;
      int m = i;
      float f;
      if (i > this.aai)
      {
        f = this.aai / i;
        m = this.aai;
        k = (int)(j * f);
      }
      i = k;
      j = m;
      if (k > this.aai)
      {
        f = this.aai / k;
        i = this.aai;
        j = (int)(m * f);
      }
      paramDrawable.setBounds(0, 0, j, i);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    gj();
  }

  public void setItemInvoker(h.b paramb)
  {
    this.aac = paramb;
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.aah = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void setPopupCallback(b paramb)
  {
    this.aae = paramb;
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    this.IT = paramCharSequence;
    gj();
  }

  final class a extends ae
  {
    public a()
    {
      super();
    }

    public final s gm()
    {
      if (ActionMenuItemView.this.aae != null);
      for (s locals = ActionMenuItemView.this.aae.gm(); ; locals = null)
        return locals;
    }

    public final boolean gn()
    {
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (ActionMenuItemView.this.aac != null)
      {
        bool2 = bool1;
        if (ActionMenuItemView.this.aac.f(ActionMenuItemView.this.kY))
        {
          s locals = gm();
          bool2 = bool1;
          if (locals != null)
          {
            bool2 = bool1;
            if (locals.isShowing())
              bool2 = true;
          }
        }
      }
      return bool2;
    }
  }

  public static abstract class b
  {
    public abstract s gm();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.ActionMenuItemView
 * JD-Core Version:    0.6.2
 */