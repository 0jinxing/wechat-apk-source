package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.a.b.a;
import android.support.v4.widget.b;
import android.support.v7.a.a.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class n
{
  final TextView ago;
  private ba agp;
  private ba agq;
  private ba agr;
  private ba ags;
  final p agt;
  Typeface agu;
  boolean agv;
  int mStyle = 0;

  n(TextView paramTextView)
  {
    this.ago = paramTextView;
    this.agt = new p(this.ago);
  }

  protected static ba a(Context paramContext, i parami, int paramInt)
  {
    parami = parami.o(paramContext, paramInt);
    if (parami != null)
    {
      paramContext = new ba();
      paramContext.atE = true;
      paramContext.atC = parami;
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
    }
  }

  private void a(Context paramContext, bc parambc)
  {
    int i = 12;
    this.mStyle = parambc.getInt(2, this.mStyle);
    if ((parambc.hasValue(10)) || (parambc.hasValue(12)))
    {
      this.agu = null;
      if (!parambc.hasValue(12));
    }
    while (true)
    {
      if (!paramContext.isRestricted())
        paramContext = new b.a()
        {
          public final void b(Typeface paramAnonymousTypeface)
          {
            n localn = n.this;
            Object localObject = this.agw;
            if (localn.agv)
            {
              localn.agu = paramAnonymousTypeface;
              localObject = (TextView)((WeakReference)localObject).get();
              if (localObject != null)
                ((TextView)localObject).setTypeface(paramAnonymousTypeface, localn.mStyle);
            }
          }
        };
      try
      {
        this.agu = parambc.a(i, this.mStyle, paramContext);
        boolean bool;
        if (this.agu == null)
        {
          bool = true;
          label99: this.agv = bool;
          label105: if (this.agu == null)
          {
            paramContext = parambc.getString(i);
            if (paramContext != null)
              this.agu = Typeface.create(paramContext, this.mStyle);
          }
        }
        while (true)
        {
          return;
          i = 10;
          break;
          bool = false;
          break label99;
          if (parambc.hasValue(1))
          {
            this.agv = false;
            switch (parambc.getInt(1, 1))
            {
            default:
              break;
            case 1:
              this.agu = Typeface.SANS_SERIF;
              break;
            case 2:
              this.agu = Typeface.SERIF;
              break;
            case 3:
              this.agu = Typeface.MONOSPACE;
            }
          }
        }
      }
      catch (UnsupportedOperationException paramContext)
      {
        break label105;
      }
      catch (Resources.NotFoundException paramContext)
      {
        break label105;
      }
    }
  }

  static n e(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17);
    for (paramTextView = new o(paramTextView); ; paramTextView = new n(paramTextView))
      return paramTextView;
  }

  private void e(int paramInt, float paramFloat)
  {
    this.agt.e(paramInt, paramFloat);
  }

  final void a(Drawable paramDrawable, ba paramba)
  {
    if ((paramDrawable != null) && (paramba != null))
      i.a(paramDrawable, paramba, this.ago.getDrawableState());
  }

  @SuppressLint({"NewApi"})
  void a(AttributeSet paramAttributeSet, int paramInt)
  {
    Context localContext = this.ago.getContext();
    Object localObject1 = i.hE();
    Object localObject2 = bc.a(localContext, paramAttributeSet, a.a.AppCompatTextHelper, paramInt, 0);
    int i = ((bc)localObject2).getResourceId(0, -1);
    if (((bc)localObject2).hasValue(3))
      this.agp = a(localContext, (i)localObject1, ((bc)localObject2).getResourceId(3, 0));
    if (((bc)localObject2).hasValue(1))
      this.agq = a(localContext, (i)localObject1, ((bc)localObject2).getResourceId(1, 0));
    if (((bc)localObject2).hasValue(4))
      this.agr = a(localContext, (i)localObject1, ((bc)localObject2).getResourceId(4, 0));
    if (((bc)localObject2).hasValue(2))
      this.ags = a(localContext, (i)localObject1, ((bc)localObject2).getResourceId(2, 0));
    ((bc)localObject2).atG.recycle();
    boolean bool1 = this.ago.getTransformationMethod() instanceof PasswordTransformationMethod;
    boolean bool2 = false;
    boolean bool3 = false;
    int j = 0;
    int k = 0;
    Object localObject3 = null;
    localObject1 = null;
    bc localbc1 = null;
    Object localObject4 = null;
    localObject2 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    if (i != -1)
    {
      bc localbc2 = bc.a(localContext, i, a.a.TextAppearance);
      j = k;
      bool2 = bool3;
      if (!bool1)
      {
        j = k;
        bool2 = bool3;
        if (localbc2.hasValue(11))
        {
          j = 1;
          bool2 = localbc2.getBoolean(11, false);
        }
      }
      a(localContext, localbc2);
      localObject1 = localObject3;
      localObject6 = localObject7;
      if (Build.VERSION.SDK_INT < 23)
      {
        localObject2 = localbc1;
        if (localbc2.hasValue(3))
          localObject2 = localbc2.getColorStateList(3);
        if (localbc2.hasValue(4))
          localObject5 = localbc2.getColorStateList(4);
        localObject1 = localObject2;
        localObject4 = localObject5;
        localObject6 = localObject7;
        if (localbc2.hasValue(5))
        {
          localObject6 = localbc2.getColorStateList(5);
          localObject4 = localObject5;
          localObject1 = localObject2;
        }
      }
      localbc2.atG.recycle();
      localObject2 = localObject4;
    }
    localbc1 = bc.a(localContext, paramAttributeSet, a.a.TextAppearance, paramInt, 0);
    k = j;
    bool3 = bool2;
    if (!bool1)
    {
      k = j;
      bool3 = bool2;
      if (localbc1.hasValue(11))
      {
        k = 1;
        bool3 = localbc1.getBoolean(11, false);
      }
    }
    localObject7 = localObject1;
    localObject5 = localObject2;
    localObject4 = localObject6;
    if (Build.VERSION.SDK_INT < 23)
    {
      if (localbc1.hasValue(3))
        localObject1 = localbc1.getColorStateList(3);
      if (localbc1.hasValue(4))
        localObject2 = localbc1.getColorStateList(4);
      localObject7 = localObject1;
      localObject5 = localObject2;
      localObject4 = localObject6;
      if (localbc1.hasValue(5))
      {
        localObject4 = localbc1.getColorStateList(5);
        localObject5 = localObject2;
        localObject7 = localObject1;
      }
    }
    a(localContext, localbc1);
    localbc1.atG.recycle();
    if (localObject7 != null)
      this.ago.setTextColor(localObject7);
    if (localObject5 != null)
      this.ago.setHintTextColor((ColorStateList)localObject5);
    if (localObject4 != null)
      this.ago.setLinkTextColor((ColorStateList)localObject4);
    if ((!bool1) && (k != 0))
      setAllCaps(bool3);
    if (this.agu != null)
      this.ago.setTypeface(this.agu, this.mStyle);
    localObject2 = this.agt;
    float f1 = -1.0F;
    float f2 = -1.0F;
    float f3 = -1.0F;
    localObject1 = ((p)localObject2).mContext.obtainStyledAttributes(paramAttributeSet, a.a.AppCompatTextView, paramInt, 0);
    if (((TypedArray)localObject1).hasValue(2))
      ((p)localObject2).agC = ((TypedArray)localObject1).getInt(2, 0);
    if (((TypedArray)localObject1).hasValue(3))
      f3 = ((TypedArray)localObject1).getDimension(3, -1.0F);
    if (((TypedArray)localObject1).hasValue(5))
      f1 = ((TypedArray)localObject1).getDimension(5, -1.0F);
    if (((TypedArray)localObject1).hasValue(6))
      f2 = ((TypedArray)localObject1).getDimension(6, -1.0F);
    if (((TypedArray)localObject1).hasValue(4))
    {
      paramInt = ((TypedArray)localObject1).getResourceId(4, 0);
      if (paramInt > 0)
      {
        localObject6 = ((TypedArray)localObject1).getResources().obtainTypedArray(paramInt);
        j = ((TypedArray)localObject6).length();
        paramAttributeSet = new int[j];
        if (j > 0)
        {
          for (paramInt = 0; paramInt < j; paramInt++)
            paramAttributeSet[paramInt] = ((TypedArray)localObject6).getDimensionPixelSize(paramInt, -1);
          ((p)localObject2).agH = p.f(paramAttributeSet);
          ((p)localObject2).hK();
        }
        ((TypedArray)localObject6).recycle();
      }
    }
    ((TypedArray)localObject1).recycle();
    if (((p)localObject2).hP())
    {
      if (((p)localObject2).agC == 1)
      {
        if (!((p)localObject2).agI)
        {
          paramAttributeSet = ((p)localObject2).mContext.getResources().getDisplayMetrics();
          float f4 = f1;
          if (f1 == -1.0F)
            f4 = TypedValue.applyDimension(2, 12.0F, paramAttributeSet);
          f1 = f2;
          if (f2 == -1.0F)
            f1 = TypedValue.applyDimension(2, 112.0F, paramAttributeSet);
          f2 = f3;
          if (f3 == -1.0F)
            f2 = 1.0F;
          ((p)localObject2).f(f4, f1, f2);
        }
        ((p)localObject2).hL();
      }
      if ((b.OV) && (this.agt.agC != 0))
      {
        paramAttributeSet = this.agt.agH;
        if (paramAttributeSet.length > 0)
        {
          if (this.ago.getAutoSizeStepGranularity() == -1.0F)
            break label1023;
          this.ago.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.agt.agF), Math.round(this.agt.agG), Math.round(this.agt.agE), 0);
        }
      }
    }
    while (true)
    {
      return;
      ((p)localObject2).agC = 0;
      break;
      label1023: this.ago.setAutoSizeTextTypeUniformWithPresetSizes(paramAttributeSet, 0);
    }
  }

  void hI()
  {
    if ((this.agp != null) || (this.agq != null) || (this.agr != null) || (this.ags != null))
    {
      Drawable[] arrayOfDrawable = this.ago.getCompoundDrawables();
      a(arrayOfDrawable[0], this.agp);
      a(arrayOfDrawable[1], this.agq);
      a(arrayOfDrawable[2], this.agr);
      a(arrayOfDrawable[3], this.ags);
    }
  }

  final void hJ()
  {
    if (!b.OV)
      this.agt.hM();
  }

  final void r(Context paramContext, int paramInt)
  {
    bc localbc = bc.a(paramContext, paramInt, a.a.TextAppearance);
    if (localbc.hasValue(11))
      setAllCaps(localbc.getBoolean(11, false));
    if ((Build.VERSION.SDK_INT < 23) && (localbc.hasValue(3)))
    {
      ColorStateList localColorStateList = localbc.getColorStateList(3);
      if (localColorStateList != null)
        this.ago.setTextColor(localColorStateList);
    }
    a(paramContext, localbc);
    localbc.atG.recycle();
    if (this.agu != null)
      this.ago.setTypeface(this.agu, this.mStyle);
  }

  final void setAllCaps(boolean paramBoolean)
  {
    this.ago.setAllCaps(paramBoolean);
  }

  final void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.agt.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    this.agt.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
  }

  final void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    this.agt.setAutoSizeTextTypeWithDefaults(paramInt);
  }

  final void setTextSize(int paramInt, float paramFloat)
  {
    if ((!b.OV) && (!this.agt.hO()))
      e(paramInt, paramFloat);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.n
 * JD-Core Version:    0.6.2
 */