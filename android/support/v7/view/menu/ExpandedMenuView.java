package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.bc;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView
  implements h.b, p, AdapterView.OnItemClickListener
{
  private static final int[] aaV = { 16842964, 16843049 };
  private int aaW;
  private h lo;

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = bc.a(paramContext, paramAttributeSet, aaV, paramInt, 0);
    if (paramContext.hasValue(0))
      setBackgroundDrawable(paramContext.getDrawable(0));
    if (paramContext.hasValue(1))
      setDivider(paramContext.getDrawable(1));
    paramContext.atG.recycle();
  }

  public final void a(h paramh)
  {
    this.lo = paramh;
  }

  public final boolean f(j paramj)
  {
    return this.lo.a(paramj, null, 0);
  }

  public final int getWindowAnimations()
  {
    return this.aaW;
  }

  protected final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    f((j)getAdapter().getItem(paramInt));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.ExpandedMenuView
 * JD-Core Version:    0.6.2
 */