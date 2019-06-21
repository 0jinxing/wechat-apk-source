package com.tencent.mm.ui.gridviewheaders;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class c extends BaseAdapter
{
  private static boolean zyn;
  private DataSetObserver PL;
  private final Context mContext;
  int mCount;
  int mNumColumns;
  final b zyo;
  private GridHeadersGridView zyp;
  private final List<View> zyq;
  private View[] zyr;

  public c(Context paramContext, GridHeadersGridView paramGridHeadersGridView, b paramb)
  {
    AppMethodBeat.i(107342);
    this.PL = new c.1(this);
    this.zyq = new ArrayList();
    this.mNumColumns = 1;
    this.mContext = paramContext;
    this.zyo = paramb;
    this.zyp = paramGridHeadersGridView;
    paramb.registerDataSetObserver(this.PL);
    AppMethodBeat.o(107342);
  }

  private void PB(int paramInt)
  {
    AppMethodBeat.i(107355);
    this.zyr = new View[paramInt];
    Arrays.fill(this.zyr, null);
    AppMethodBeat.o(107355);
  }

  private int PC(int paramInt)
  {
    AppMethodBeat.i(107356);
    paramInt = this.zyo.PA(paramInt) % this.mNumColumns;
    if (paramInt == 0)
    {
      paramInt = 0;
      AppMethodBeat.o(107356);
    }
    while (true)
    {
      return paramInt;
      paramInt = this.mNumColumns - paramInt;
      AppMethodBeat.o(107356);
    }
  }

  protected final c.c PD(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(107359);
    int j = this.zyo.dJh();
    c.c localc;
    if (j == 0)
      if (paramInt >= this.zyo.getCount())
      {
        localc = new c.c(this, -1, 0);
        AppMethodBeat.o(107359);
      }
    while (true)
    {
      return localc;
      localc = new c.c(this, paramInt, 0);
      AppMethodBeat.o(107359);
      continue;
      int k = paramInt;
      int m = paramInt;
      paramInt = i;
      while (true)
      {
        if (paramInt >= j)
          break label223;
        i = this.zyo.PA(paramInt);
        if (m == 0)
        {
          localc = new c.c(this, -2, paramInt);
          AppMethodBeat.o(107359);
          break;
        }
        m -= this.mNumColumns;
        if (m < 0)
        {
          localc = new c.c(this, -1, paramInt);
          AppMethodBeat.o(107359);
          break;
        }
        int n = k - this.mNumColumns;
        if (m < i)
        {
          localc = new c.c(this, n, paramInt);
          AppMethodBeat.o(107359);
          break;
        }
        k = PC(paramInt);
        m -= i + k;
        paramInt++;
        k = n - k;
      }
      label223: localc = new c.c(this, -1, paramInt);
      AppMethodBeat.o(107359);
    }
  }

  protected final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107358);
    if (this.zyo.dJh() == 0)
    {
      paramView = null;
      AppMethodBeat.o(107358);
    }
    while (true)
    {
      return paramView;
      paramView = this.zyo.a(PD(paramInt).zyv, paramView, paramViewGroup);
      AppMethodBeat.o(107358);
    }
  }

  public final boolean areAllItemsEnabled()
  {
    return false;
  }

  public final int getCount()
  {
    int i = 0;
    AppMethodBeat.i(107343);
    this.mCount = 0;
    int j = this.zyo.dJh();
    if (j == 0)
    {
      i = this.zyo.getCount();
      AppMethodBeat.o(107343);
    }
    while (true)
    {
      return i;
      while (i < j)
      {
        this.mCount += this.zyo.PA(i) + PC(i) + this.mNumColumns;
        i++;
      }
      i = this.mCount;
      AppMethodBeat.o(107343);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(107344);
    Object localObject = PD(paramInt);
    if ((((c.c)localObject).mPosition == -1) || (((c.c)localObject).mPosition == -2))
    {
      localObject = null;
      AppMethodBeat.o(107344);
    }
    while (true)
    {
      return localObject;
      localObject = this.zyo.getItem(((c.c)localObject).mPosition);
      AppMethodBeat.o(107344);
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(107345);
    c.c localc = PD(paramInt);
    long l;
    if (localc.mPosition == -2)
    {
      l = -1L;
      AppMethodBeat.o(107345);
    }
    while (true)
    {
      return l;
      if (localc.mPosition == -1)
      {
        l = -2L;
        AppMethodBeat.o(107345);
      }
      else
      {
        l = this.zyo.getItemId(localc.mPosition);
        AppMethodBeat.o(107345);
      }
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(107346);
    c.c localc = PD(paramInt);
    if (localc.mPosition == -2)
    {
      paramInt = 1;
      AppMethodBeat.o(107346);
    }
    while (true)
    {
      return paramInt;
      if (localc.mPosition == -1)
      {
        paramInt = 0;
        AppMethodBeat.o(107346);
      }
      else
      {
        paramInt = this.zyo.getItemViewType(localc.mPosition);
        if (paramInt == -1)
        {
          AppMethodBeat.o(107346);
        }
        else
        {
          paramInt += 2;
          AppMethodBeat.o(107346);
        }
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107347);
    Object localObject1;
    if ((paramView instanceof d))
    {
      paramView = (d)paramView;
      localObject1 = paramView.getChildAt(0);
    }
    while (true)
    {
      Object localObject2 = PD(paramInt);
      if (((c.c)localObject2).mPosition == -2)
      {
        localObject1 = new c.b(this, this.mContext);
        ((c.b)localObject1).setHeaderWidth(this.zyp.getWidth());
        ((c.b)localObject1).setHeaderId(((c.c)localObject2).zyv);
        View localView = (View)((View)localObject1).getTag();
        ((View)localObject1).setTag(this.zyo.a(((c.c)localObject2).zyv, localView, paramViewGroup));
      }
      while (true)
      {
        localObject2 = paramView;
        if (paramView == null)
          localObject2 = new d(this.mContext);
        ((d)localObject2).removeAllViews();
        ((d)localObject2).addView((View)localObject1);
        ((d)localObject2).setPosition(paramInt);
        ((d)localObject2).setNumColumns(this.mNumColumns);
        this.zyr[(paramInt % this.mNumColumns)] = localObject2;
        if (paramInt % this.mNumColumns != 0)
          break label290;
        zyn = true;
        for (int i = 1; i < this.zyr.length; i++)
          this.zyr[i] = getView(paramInt + i, null, paramViewGroup);
        if (((c.c)localObject2).mPosition == -1)
        {
          localObject2 = (c.a)localObject1;
          localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = new c.a(this, this.mContext);
        }
        else
        {
          localObject1 = this.zyo.getView(((c.c)localObject2).mPosition, (View)localObject1, paramViewGroup);
        }
      }
      zyn = false;
      label290: ((d)localObject2).setRowSiblings(this.zyr);
      if ((!zyn) && ((paramInt % this.mNumColumns == this.mNumColumns - 1) || (paramInt == getCount() - 1)))
        PB(this.mNumColumns);
      AppMethodBeat.o(107347);
      return localObject2;
      localObject2 = null;
      localObject1 = paramView;
      paramView = (View)localObject2;
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(107348);
    int i = this.zyo.getViewTypeCount();
    AppMethodBeat.o(107348);
    return i + 2;
  }

  public final boolean hasStableIds()
  {
    AppMethodBeat.i(107349);
    boolean bool = this.zyo.hasStableIds();
    AppMethodBeat.o(107349);
    return bool;
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(107350);
    boolean bool = this.zyo.isEmpty();
    AppMethodBeat.o(107350);
    return bool;
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(107351);
    c.c localc = PD(paramInt);
    boolean bool;
    if ((localc.mPosition == -1) || (localc.mPosition == -2))
    {
      bool = false;
      AppMethodBeat.o(107351);
    }
    while (true)
    {
      return bool;
      bool = this.zyo.isEnabled(localc.mPosition);
      AppMethodBeat.o(107351);
    }
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(107352);
    this.zyo.registerDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(107352);
  }

  public final void setNumColumns(int paramInt)
  {
    AppMethodBeat.i(107353);
    this.mNumColumns = paramInt;
    PB(paramInt);
    AppMethodBeat.o(107353);
  }

  protected final long tw(int paramInt)
  {
    AppMethodBeat.i(107357);
    long l = PD(paramInt).zyv;
    AppMethodBeat.o(107357);
    return l;
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(107354);
    this.zyo.unregisterDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(107354);
  }

  protected final class d extends FrameLayout
  {
    private int mNumColumns;
    private int mPosition;
    private View[] zyr;
    private boolean zyw;

    public d(Context arg2)
    {
      super();
    }

    protected final FrameLayout.LayoutParams generateDefaultLayoutParams()
    {
      AppMethodBeat.i(107339);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -1);
      AppMethodBeat.o(107339);
      return localLayoutParams;
    }

    public final Object getTag()
    {
      AppMethodBeat.i(107334);
      Object localObject = getChildAt(0).getTag();
      AppMethodBeat.o(107334);
      return localObject;
    }

    public final Object getTag(int paramInt)
    {
      AppMethodBeat.i(107335);
      Object localObject = getChildAt(0).getTag(paramInt);
      AppMethodBeat.o(107335);
      return localObject;
    }

    public final View getView()
    {
      AppMethodBeat.i(107336);
      View localView = getChildAt(0);
      AppMethodBeat.o(107336);
      return localView;
    }

    protected final void onMeasure(int paramInt1, int paramInt2)
    {
      int i = 0;
      AppMethodBeat.i(107340);
      super.onMeasure(paramInt1, paramInt2);
      if ((this.mNumColumns == 1) || (c.b(c.this) == null))
        AppMethodBeat.o(107340);
      while (true)
      {
        return;
        View[] arrayOfView1;
        if ((this.mPosition % this.mNumColumns == 0) && (!this.zyw))
        {
          this.zyw = true;
          arrayOfView1 = this.zyr;
          j = arrayOfView1.length;
          for (k = 0; k < j; k++)
            arrayOfView1[k].measure(paramInt1, paramInt2);
          this.zyw = false;
        }
        int j = getMeasuredHeight();
        View[] arrayOfView2 = this.zyr;
        int m = arrayOfView2.length;
        int k = j;
        paramInt2 = i;
        while (paramInt2 < m)
        {
          arrayOfView1 = arrayOfView2[paramInt2];
          i = k;
          if (arrayOfView1 != null)
            i = Math.max(k, arrayOfView1.getMeasuredHeight());
          paramInt2++;
          k = i;
        }
        if (k == j)
        {
          AppMethodBeat.o(107340);
        }
        else
        {
          super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(k, 1073741824));
          AppMethodBeat.o(107340);
        }
      }
    }

    public final void setNumColumns(int paramInt)
    {
      this.mNumColumns = paramInt;
    }

    public final void setPosition(int paramInt)
    {
      this.mPosition = paramInt;
    }

    @SuppressLint({"NewApi"})
    public final void setRowSiblings(View[] paramArrayOfView)
    {
      this.zyr = paramArrayOfView;
    }

    public final void setTag(int paramInt, Object paramObject)
    {
      AppMethodBeat.i(107337);
      getChildAt(0).setTag(paramInt, paramObject);
      AppMethodBeat.o(107337);
    }

    public final void setTag(Object paramObject)
    {
      AppMethodBeat.i(107338);
      getChildAt(0).setTag(paramObject);
      AppMethodBeat.o(107338);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.c
 * JD-Core Version:    0.6.2
 */