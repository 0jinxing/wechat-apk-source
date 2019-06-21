package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f extends BaseAdapter
  implements b
{
  private e zyX;
  private List<f.b> zyY;

  public f(e parame)
  {
    AppMethodBeat.i(107414);
    this.zyX = parame;
    parame.registerDataSetObserver(new a((byte)0));
    this.zyY = a(parame);
    AppMethodBeat.o(107414);
  }

  public final int PA(int paramInt)
  {
    AppMethodBeat.i(107416);
    try
    {
      paramInt = ((f.b)this.zyY.get(paramInt)).mCount;
      AppMethodBeat.o(107416);
      return paramInt;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      while (true)
      {
        paramInt = 0;
        AppMethodBeat.o(107416);
      }
    }
  }

  public final View a(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107417);
    paramView = this.zyX.a(((f.b)this.zyY.get(paramInt)).zzA, paramView, paramViewGroup);
    AppMethodBeat.o(107417);
    return paramView;
  }

  protected final List<f.b> a(e parame)
  {
    AppMethodBeat.i(107422);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < parame.getCount(); i++)
    {
      long l = parame.tw(i);
      f.b localb1 = (f.b)localHashMap.get(Long.valueOf(l));
      f.b localb2 = localb1;
      if (localb1 == null)
      {
        localb2 = new f.b(this, i);
        localArrayList.add(localb2);
      }
      localb2.mCount += 1;
      localHashMap.put(Long.valueOf(l), localb2);
    }
    AppMethodBeat.o(107422);
    return localArrayList;
  }

  public final int dJh()
  {
    AppMethodBeat.i(107420);
    int i = this.zyY.size();
    AppMethodBeat.o(107420);
    return i;
  }

  public final int getCount()
  {
    AppMethodBeat.i(107415);
    int i = this.zyX.getCount();
    AppMethodBeat.o(107415);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(107418);
    Object localObject = this.zyX.getItem(paramInt);
    AppMethodBeat.o(107418);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(107419);
    long l = this.zyX.getItemId(paramInt);
    AppMethodBeat.o(107419);
    return l;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107421);
    paramView = this.zyX.getView(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(107421);
    return paramView;
  }

  final class a extends DataSetObserver
  {
    private a()
    {
    }

    public final void onChanged()
    {
      AppMethodBeat.i(107412);
      f.a(f.this, f.this.a(f.a(f.this)));
      f.this.notifyDataSetChanged();
      AppMethodBeat.o(107412);
    }

    public final void onInvalidated()
    {
      AppMethodBeat.i(107413);
      f.a(f.this, f.this.a(f.a(f.this)));
      f.this.notifyDataSetInvalidated();
      AppMethodBeat.o(107413);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.f
 * JD-Core Version:    0.6.2
 */