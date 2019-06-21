package com.tencent.mm.ui.base;

import android.content.Context;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Queue;

public abstract class d extends p
{
  public Context context;
  private int updateCount = 0;
  private Queue<View> ysn;

  public d(Context paramContext)
  {
    this.context = paramContext;
    this.ysn = new LinkedList();
  }

  public abstract View a(View paramView, ViewGroup paramViewGroup, int paramInt);

  public abstract int bUL();

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramObject = (View)paramObject;
    paramViewGroup.removeView(paramObject);
    this.ysn.add(paramObject);
    zU(paramInt);
    ab.d("MicroMsg.CustomPagerAdapter", "recycle queue size %d", new Object[] { Integer.valueOf(this.ysn.size()) });
  }

  public int getItemPosition(Object paramObject)
  {
    if (this.updateCount > 0)
      this.updateCount -= 1;
    for (int i = -2; ; i = super.getItemPosition(paramObject))
      return i;
  }

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    long l = System.currentTimeMillis();
    View localView = a((View)this.ysn.poll(), paramViewGroup, paramInt);
    if (localView.getLayoutParams() == null)
      localView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramViewGroup.addView(localView);
    ab.v("MicroMsg.CustomPagerAdapter", "instantiateItem usetime: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localView;
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView.equals(paramObject);
  }

  public void notifyDataSetChanged()
  {
    this.updateCount = bUL();
    super.notifyDataSetChanged();
  }

  public abstract void zU(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.d
 * JD-Core Version:    0.6.2
 */