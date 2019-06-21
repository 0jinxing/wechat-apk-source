package com.tencent.mm.ui.base;

import android.support.v4.view.p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public abstract class u extends p
{
  public Queue<View> yyJ = new LinkedList();
  public HashMap<Object, Integer> yyK = new HashMap();
  public SparseArray<Object> yyL = new SparseArray();

  public final View Fp(int paramInt)
  {
    Object localObject = this.yyL.get(paramInt);
    if (localObject != null);
    for (localObject = (View)localObject; ; localObject = null)
      return localObject;
  }

  public abstract Object c(int paramInt, View paramView);

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    ab.d("MicroMsg.MMViewPagerAdapter", "destroyItem position %s", new Object[] { Integer.valueOf(paramInt) });
    ab.i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", new Object[] { Integer.valueOf(paramObject.hashCode()) });
    this.yyJ.add((View)paramObject);
    this.yyK.remove(paramObject);
    this.yyL.remove(paramInt);
  }

  public void detach()
  {
    reset();
  }

  public int firstItemPosForDetermine()
  {
    return -1;
  }

  public int getItemPosition(Object paramObject)
  {
    if (this.yyK.containsKey(paramObject));
    for (int i = ((Integer)this.yyK.get(paramObject)).intValue(); ; i = -2)
      return i;
  }

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    long l = System.currentTimeMillis();
    Object localObject = null;
    if (this.yyJ.size() > 0)
      localObject = (View)this.yyJ.poll();
    localObject = c(paramInt, (View)localObject);
    ab.i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s position:%s", new Object[] { Integer.valueOf(localObject.hashCode()), ((View)localObject).getParent(), Integer.valueOf(paramInt) });
    this.yyK.put(localObject, Integer.valueOf(paramInt));
    this.yyL.put(paramInt, localObject);
    if (((View)localObject).getParent() == null)
      paramViewGroup.addView((View)localObject);
    ab.i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    return localObject;
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public int lastItemPosForDetermine()
  {
    return -1;
  }

  public final void reset()
  {
    this.yyJ.clear();
    this.yyK.clear();
    this.yyL.clear();
  }

  public abstract MultiTouchImageView wx(int paramInt);

  public abstract WxImageView wy(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.u
 * JD-Core Version:    0.6.2
 */