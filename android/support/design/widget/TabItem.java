package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.a.a;
import android.support.v7.widget.bc;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem extends View
{
  final CharSequence mText;
  final Drawable rP;
  final int rQ;

  public TabItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = bc.a(paramContext, paramAttributeSet, a.a.TabItem);
    this.mText = paramContext.getText(2);
    this.rP = paramContext.getDrawable(0);
    this.rQ = paramContext.getResourceId(1, 0);
    paramContext.atG.recycle();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabItem
 * JD-Core Version:    0.6.2
 */