package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class h$a extends BaseAdapter
{
  ArrayList<h.b> nMD;

  public h$a(ArrayList<h.b> paramArrayList)
  {
    AppMethodBeat.i(113494);
    this.nMD = new ArrayList();
    Collection localCollection;
    this.nMD.addAll(localCollection);
    AppMethodBeat.o(113494);
  }

  public final h.b PV(String paramString)
  {
    AppMethodBeat.i(113498);
    int i = 0;
    if (i < this.nMD.size())
      if (((h.b)this.nMD.get(i)).username.equals(paramString))
      {
        paramString = (h.b)this.nMD.get(i);
        AppMethodBeat.o(113498);
      }
    while (true)
    {
      return paramString;
      i++;
      break;
      paramString = null;
      AppMethodBeat.o(113498);
    }
  }

  public final boolean PW(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(113499);
    int i = 0;
    if (i < this.nMD.size())
      if (((h.b)this.nMD.get(i)).username.equals(paramString))
      {
        bool = true;
        AppMethodBeat.o(113499);
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(113499);
    }
  }

  public final ArrayList<String> bJS()
  {
    AppMethodBeat.i(113500);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.nMD.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((h.b)localIterator.next()).username);
    AppMethodBeat.o(113500);
    return localArrayList;
  }

  public final int getCount()
  {
    AppMethodBeat.i(113495);
    int i = this.nMD.size();
    AppMethodBeat.o(113495);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(113496);
    Object localObject = this.nMD.get(paramInt);
    AppMethodBeat.o(113496);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(113497);
    paramView = ((h.b)this.nMD.get(paramInt)).nMF.nMG;
    AppMethodBeat.o(113497);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.h.a
 * JD-Core Version:    0.6.2
 */