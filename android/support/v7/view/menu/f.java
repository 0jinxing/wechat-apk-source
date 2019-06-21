package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AlertController.a;
import android.support.v7.app.b;
import android.support.v7.app.b.a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class f
  implements o, AdapterView.OnItemClickListener
{
  int aan = 2130968599;
  ExpandedMenuView abg;
  int abh;
  int abi = 0;
  a abj;
  public o.a lL;
  h lo;
  Context mContext;
  private int mId;
  LayoutInflater mInflater;

  private f()
  {
  }

  public f(Context paramContext)
  {
    this();
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(this.mContext);
  }

  public final void a(Context paramContext, h paramh)
  {
    if (this.abi != 0)
    {
      this.mContext = new ContextThemeWrapper(paramContext, this.abi);
      this.mInflater = LayoutInflater.from(this.mContext);
    }
    while (true)
    {
      this.lo = paramh;
      if (this.abj != null)
        this.abj.notifyDataSetChanged();
      return;
      if (this.mContext != null)
      {
        this.mContext = paramContext;
        if (this.mInflater == null)
          this.mInflater = LayoutInflater.from(this.mContext);
      }
    }
  }

  public final void a(h paramh, boolean paramBoolean)
  {
    if (this.lL != null)
      this.lL.a(paramh, paramBoolean);
  }

  public final void a(o.a parama)
  {
    this.lL = parama;
  }

  public final boolean a(u paramu)
  {
    boolean bool;
    if (!paramu.hasVisibleItems())
    {
      bool = false;
      return bool;
    }
    i locali = new i(paramu);
    Object localObject1 = locali.lo;
    Object localObject2 = new b.a(((h)localObject1).mContext);
    locali.abM = new f(((b.a)localObject2).UA.mContext);
    locali.abM.lL = locali;
    locali.lo.a(locali.abM);
    Object localObject3 = locali.abM.getAdapter();
    ((b.a)localObject2).UA.Ei = ((ListAdapter)localObject3);
    ((b.a)localObject2).UA.Ui = locali;
    localObject3 = ((h)localObject1).abB;
    if (localObject3 != null)
      ((b.a)localObject2).UA.TG = ((View)localObject3);
    while (true)
    {
      ((b.a)localObject2).UA.Ug = locali;
      locali.abL = ((b.a)localObject2).fi();
      locali.abL.setOnDismissListener(locali);
      localObject2 = locali.abL.getWindow().getAttributes();
      ((WindowManager.LayoutParams)localObject2).type = 1003;
      ((WindowManager.LayoutParams)localObject2).flags |= 131072;
      locali.abL.show();
      if (this.lL != null)
        this.lL.d(paramu);
      bool = true;
      break;
      localObject3 = ((h)localObject1).abA;
      ((b.a)localObject2).UA.rP = ((Drawable)localObject3);
      localObject1 = ((h)localObject1).abz;
      ((b.a)localObject2).UA.IT = ((CharSequence)localObject1);
    }
  }

  public final boolean b(j paramj)
  {
    return false;
  }

  public final boolean bt()
  {
    return false;
  }

  public final boolean c(j paramj)
  {
    return false;
  }

  public final p f(ViewGroup paramViewGroup)
  {
    if (this.abg == null)
    {
      this.abg = ((ExpandedMenuView)this.mInflater.inflate(2130968596, paramViewGroup, false));
      if (this.abj == null)
        this.abj = new a();
      this.abg.setAdapter(this.abj);
      this.abg.setOnItemClickListener(this);
    }
    return this.abg;
  }

  public final ListAdapter getAdapter()
  {
    if (this.abj == null)
      this.abj = new a();
    return this.abj;
  }

  public final int getId()
  {
    return this.mId;
  }

  public final void n(boolean paramBoolean)
  {
    if (this.abj != null)
      this.abj.notifyDataSetChanged();
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.lo.a(this.abj.br(paramInt), this, 0);
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = ((Bundle)paramParcelable).getSparseParcelableArray("android:menu:list");
    if (paramParcelable != null)
      this.abg.restoreHierarchyState(paramParcelable);
  }

  public final Parcelable onSaveInstanceState()
  {
    Object localObject;
    if (this.abg == null)
      localObject = null;
    while (true)
    {
      return localObject;
      localObject = new Bundle();
      SparseArray localSparseArray = new SparseArray();
      if (this.abg != null)
        this.abg.saveHierarchyState(localSparseArray);
      ((Bundle)localObject).putSparseParcelableArray("android:menu:list", localSparseArray);
    }
  }

  final class a extends BaseAdapter
  {
    private int abk = -1;

    public a()
    {
      gt();
    }

    private void gt()
    {
      j localj = f.this.lo.abJ;
      int j;
      if (localj != null)
      {
        ArrayList localArrayList = f.this.lo.gD();
        int i = localArrayList.size();
        j = 0;
        if (j < i)
          if ((j)localArrayList.get(j) != localj);
      }
      for (this.abk = j; ; this.abk = -1)
      {
        return;
        j++;
        break;
      }
    }

    public final j br(int paramInt)
    {
      ArrayList localArrayList = f.this.lo.gD();
      int i = f.this.abh + paramInt;
      paramInt = i;
      if (this.abk >= 0)
      {
        paramInt = i;
        if (i >= this.abk)
          paramInt = i + 1;
      }
      return (j)localArrayList.get(paramInt);
    }

    public final int getCount()
    {
      int i = f.this.lo.gD().size() - f.this.abh;
      if (this.abk < 0);
      while (true)
      {
        return i;
        i--;
      }
    }

    public final long getItemId(int paramInt)
    {
      return paramInt;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
        paramView = f.this.mInflater.inflate(f.this.aan, paramViewGroup, false);
      while (true)
      {
        ((p.a)paramView).a(br(paramInt));
        return paramView;
      }
    }

    public final void notifyDataSetChanged()
    {
      gt();
      super.notifyDataSetChanged();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.f
 * JD-Core Version:    0.6.2
 */