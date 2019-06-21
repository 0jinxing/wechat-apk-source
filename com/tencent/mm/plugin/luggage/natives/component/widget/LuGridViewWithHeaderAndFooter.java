package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class LuGridViewWithHeaderAndFooter extends GridView
{
  public static boolean DEBUG = false;
  private AdapterView.OnItemClickListener arw;
  private int enT;
  private int mNumColumns;
  private ArrayList<LuGridViewWithHeaderAndFooter.a> oiP;
  private AdapterView.OnItemLongClickListener oiQ;
  private View oiR;
  private ArrayList<LuGridViewWithHeaderAndFooter.a> oiS;
  private ListAdapter oiT;
  private LuGridViewWithHeaderAndFooter.c oiU;

  public LuGridViewWithHeaderAndFooter(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(116871);
    this.mNumColumns = -1;
    this.oiR = null;
    this.enT = -1;
    this.oiP = new ArrayList();
    this.oiS = new ArrayList();
    AppMethodBeat.o(116871);
  }

  public LuGridViewWithHeaderAndFooter(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116872);
    this.mNumColumns = -1;
    this.oiR = null;
    this.enT = -1;
    this.oiP = new ArrayList();
    this.oiS = new ArrayList();
    AppMethodBeat.o(116872);
  }

  public LuGridViewWithHeaderAndFooter(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(116873);
    this.mNumColumns = -1;
    this.oiR = null;
    this.enT = -1;
    this.oiP = new ArrayList();
    this.oiS = new ArrayList();
    AppMethodBeat.o(116873);
  }

  @TargetApi(16)
  private int getColumnWidthCompatible()
  {
    AppMethodBeat.i(116879);
    int i;
    if (Build.VERSION.SDK_INT >= 16)
    {
      i = super.getColumnWidth();
      AppMethodBeat.o(116879);
    }
    while (true)
    {
      return i;
      try
      {
        Field localField = GridView.class.getDeclaredField("mColumnWidth");
        localField.setAccessible(true);
        i = localField.getInt(this);
        AppMethodBeat.o(116879);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        RuntimeException localRuntimeException1 = new RuntimeException(localNoSuchFieldException);
        AppMethodBeat.o(116879);
        throw localRuntimeException1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        RuntimeException localRuntimeException2 = new RuntimeException(localIllegalAccessException);
        AppMethodBeat.o(116879);
        throw localRuntimeException2;
      }
    }
  }

  private LuGridViewWithHeaderAndFooter.c getItemClickHandler()
  {
    AppMethodBeat.i(116888);
    if (this.oiU == null)
      this.oiU = new LuGridViewWithHeaderAndFooter.c(this, (byte)0);
    LuGridViewWithHeaderAndFooter.c localc = this.oiU;
    AppMethodBeat.o(116888);
    return localc;
  }

  @TargetApi(11)
  private int getNumColumnsCompatible()
  {
    AppMethodBeat.i(116878);
    int i;
    if (Build.VERSION.SDK_INT >= 11)
    {
      i = super.getNumColumns();
      AppMethodBeat.o(116878);
    }
    while (true)
    {
      return i;
      try
      {
        Field localField = GridView.class.getDeclaredField("mNumColumns");
        localField.setAccessible(true);
        i = localField.getInt(this);
        AppMethodBeat.o(116878);
      }
      catch (Exception localException)
      {
        if (this.mNumColumns != -1)
        {
          i = this.mNumColumns;
          AppMethodBeat.o(116878);
          continue;
        }
        RuntimeException localRuntimeException = new RuntimeException("Can not determine the mNumColumns for this API platform, please call setNumColumns to set it.");
        AppMethodBeat.o(116878);
        throw localRuntimeException;
      }
    }
  }

  public int getFooterViewCount()
  {
    AppMethodBeat.i(116877);
    int i = this.oiS.size();
    AppMethodBeat.o(116877);
    return i;
  }

  public int getHeaderViewCount()
  {
    AppMethodBeat.i(116876);
    int i = this.oiP.size();
    AppMethodBeat.o(116876);
    return i;
  }

  @TargetApi(16)
  public int getHorizontalSpacing()
  {
    AppMethodBeat.i(116882);
    int i = 0;
    try
    {
      int j;
      if (Build.VERSION.SDK_INT < 16)
      {
        Field localField = GridView.class.getDeclaredField("mHorizontalSpacing");
        localField.setAccessible(true);
        j = localField.getInt(this);
      }
      for (i = j; ; i = j)
      {
        label36: AppMethodBeat.o(116882);
        return i;
        j = super.getHorizontalSpacing();
      }
    }
    catch (Exception localException)
    {
      break label36;
    }
  }

  public ListAdapter getOriginalAdapter()
  {
    return this.oiT;
  }

  public int getRowHeight()
  {
    AppMethodBeat.i(116883);
    int i;
    if (this.enT > 0)
    {
      i = this.enT;
      AppMethodBeat.o(116883);
    }
    while (true)
    {
      return i;
      Object localObject1 = getAdapter();
      int j = getNumColumnsCompatible();
      if ((localObject1 == null) || (((ListAdapter)localObject1).getCount() <= (this.oiP.size() + this.oiS.size()) * j))
      {
        AppMethodBeat.o(116883);
        i = -1;
      }
      else
      {
        i = getColumnWidthCompatible();
        View localView = getAdapter().getView(j * this.oiP.size(), this.oiR, this);
        localObject1 = null;
        if ((localView.getLayoutParams() instanceof AbsListView.LayoutParams))
          localObject1 = (AbsListView.LayoutParams)localView.getLayoutParams();
        Object localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject2 = new AbsListView.LayoutParams(-1, -2, 0);
          localView.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        j = getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), 0, ((AbsListView.LayoutParams)localObject2).height);
        localView.measure(getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i, 1073741824), 0, ((AbsListView.LayoutParams)localObject2).width), j);
        this.oiR = localView;
        this.enT = localView.getMeasuredHeight();
        i = this.enT;
        AppMethodBeat.o(116883);
      }
    }
  }

  @TargetApi(16)
  public int getVerticalSpacing()
  {
    AppMethodBeat.i(116881);
    int i = 0;
    try
    {
      int j;
      if (Build.VERSION.SDK_INT < 16)
      {
        Field localField = GridView.class.getDeclaredField("mVerticalSpacing");
        localField.setAccessible(true);
        j = localField.getInt(this);
      }
      for (i = j; ; i = j)
      {
        label36: AppMethodBeat.o(116881);
        return i;
        j = super.getVerticalSpacing();
      }
    }
    catch (Exception localException)
    {
      break label36;
    }
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(116880);
    super.onDetachedFromWindow();
    this.oiR = null;
    AppMethodBeat.o(116880);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116874);
    super.onMeasure(paramInt1, paramInt2);
    ListAdapter localListAdapter = getAdapter();
    if ((localListAdapter != null) && ((localListAdapter instanceof LuGridViewWithHeaderAndFooter.b)))
    {
      ((LuGridViewWithHeaderAndFooter.b)localListAdapter).setNumColumns(getNumColumnsCompatible());
      ((LuGridViewWithHeaderAndFooter.b)localListAdapter).enT = getRowHeight();
    }
    AppMethodBeat.o(116874);
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    AppMethodBeat.i(116884);
    this.oiT = paramListAdapter;
    if ((this.oiP.size() > 0) || (this.oiS.size() > 0))
    {
      paramListAdapter = new LuGridViewWithHeaderAndFooter.b(this.oiP, this.oiS, paramListAdapter);
      int i = getNumColumnsCompatible();
      if (i > 1)
        paramListAdapter.setNumColumns(i);
      paramListAdapter.enT = getRowHeight();
      super.setAdapter(paramListAdapter);
      AppMethodBeat.o(116884);
    }
    while (true)
    {
      return;
      super.setAdapter(paramListAdapter);
      AppMethodBeat.o(116884);
    }
  }

  public void setClipChildren(boolean paramBoolean)
  {
  }

  public void setClipChildrenSupper(boolean paramBoolean)
  {
    AppMethodBeat.i(116875);
    super.setClipChildren(false);
    AppMethodBeat.o(116875);
  }

  public void setNumColumns(int paramInt)
  {
    AppMethodBeat.i(116885);
    super.setNumColumns(paramInt);
    this.mNumColumns = paramInt;
    ListAdapter localListAdapter = getAdapter();
    if ((localListAdapter != null) && ((localListAdapter instanceof LuGridViewWithHeaderAndFooter.b)))
      ((LuGridViewWithHeaderAndFooter.b)localListAdapter).setNumColumns(paramInt);
    AppMethodBeat.o(116885);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(116886);
    this.arw = paramOnItemClickListener;
    super.setOnItemClickListener(getItemClickHandler());
    AppMethodBeat.o(116886);
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    AppMethodBeat.i(116887);
    this.oiQ = paramOnItemLongClickListener;
    super.setOnItemLongClickListener(getItemClickHandler());
    AppMethodBeat.o(116887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuGridViewWithHeaderAndFooter
 * JD-Core Version:    0.6.2
 */