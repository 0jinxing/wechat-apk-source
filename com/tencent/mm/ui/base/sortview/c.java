package com.tencent.mm.ui.base.sortview;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends BaseAdapter
{
  private Map<String, Integer> yDC;
  private c.a yDD;
  List<d> yDx;

  public c(c.a parama)
  {
    AppMethodBeat.i(107310);
    this.yDx = null;
    if (parama == null)
    {
      parama = new RuntimeException("ViewCreator can not be null.");
      AppMethodBeat.o(107310);
      throw parama;
    }
    this.yDD = parama;
    this.yDx = new ArrayList();
    this.yDC = new HashMap();
    AppMethodBeat.o(107310);
  }

  private String NX(int paramInt)
  {
    AppMethodBeat.i(107318);
    String str;
    if ((paramInt < 0) || (paramInt >= this.yDx.size()))
    {
      str = null;
      AppMethodBeat.o(107318);
    }
    while (true)
    {
      return str;
      str = ((d)this.yDx.get(paramInt)).yDG;
      AppMethodBeat.o(107318);
    }
  }

  private static String a(d paramd)
  {
    if ((paramd != null) && (paramd.yDG != null));
    for (paramd = paramd.yDG; ; paramd = null)
      return paramd;
  }

  private void dAI()
  {
    AppMethodBeat.i(107314);
    this.yDC.clear();
    Object localObject = null;
    int i = 0;
    if (i < this.yDx.size())
    {
      String str = a((d)this.yDx.get(i));
      if ((str == null) || (str.equalsIgnoreCase((String)localObject)))
        break label89;
      this.yDC.put(str, Integer.valueOf(i));
      localObject = str;
    }
    label89: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(107314);
      return;
    }
  }

  private void eN(List<d> paramList)
  {
    AppMethodBeat.i(107313);
    if (this.yDx != paramList)
    {
      this.yDx.clear();
      if (paramList != null)
        this.yDx.addAll(paramList);
    }
    dAI();
    notifyDataSetChanged();
    AppMethodBeat.o(107313);
  }

  public final int aqT(String paramString)
  {
    AppMethodBeat.i(107319);
    int i = bo.a((Integer)this.yDC.get(paramString), -1);
    AppMethodBeat.o(107319);
    return i;
  }

  public final void dJ(List<d> paramList)
  {
    AppMethodBeat.i(107312);
    if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId())
    {
      al.d(new c.1(this, paramList));
      AppMethodBeat.o(107312);
    }
    while (true)
    {
      return;
      eN(paramList);
      AppMethodBeat.o(107312);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(107315);
    int i = this.yDx.size();
    AppMethodBeat.o(107315);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(107316);
    Object localObject = this.yDx.get(paramInt);
    AppMethodBeat.o(107316);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = true;
    AppMethodBeat.i(107317);
    paramViewGroup = (d)getItem(paramInt);
    Object localObject = NX(paramInt);
    String str = NX(paramInt + 1);
    boolean bool2;
    if (paramInt == aqT((String)localObject))
    {
      bool2 = true;
      if ((localObject == null) || (((String)localObject).equalsIgnoreCase(str)))
        break label100;
    }
    while (true)
    {
      localObject = this.yDD;
      getCount();
      paramView = ((c.a)localObject).a(paramViewGroup, paramView, paramInt, bool2, bool1);
      AppMethodBeat.o(107317);
      return paramView;
      bool2 = false;
      break;
      label100: bool1 = false;
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(107311);
    dJ(this.yDx);
    AppMethodBeat.o(107311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.sortview.c
 * JD-Core Version:    0.6.2
 */