package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.TextView;

final class o extends n
{
  private ba agy;
  private ba agz;

  o(TextView paramTextView)
  {
    super(paramTextView);
  }

  final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    super.a(paramAttributeSet, paramInt);
    Context localContext = this.ago.getContext();
    i locali = i.hE();
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, a.a.AppCompatTextHelper, paramInt, 0);
    if (paramAttributeSet.hasValue(5))
      this.agy = a(localContext, locali, paramAttributeSet.getResourceId(5, 0));
    if (paramAttributeSet.hasValue(6))
      this.agz = a(localContext, locali, paramAttributeSet.getResourceId(6, 0));
    paramAttributeSet.recycle();
  }

  final void hI()
  {
    super.hI();
    if ((this.agy != null) || (this.agz != null))
    {
      Drawable[] arrayOfDrawable = this.ago.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.agy);
      a(arrayOfDrawable[2], this.agz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.o
 * JD-Core Version:    0.6.2
 */