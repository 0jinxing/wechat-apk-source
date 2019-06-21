package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.j;
import com.tencent.mm.ui.base.j.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class a extends j
{
  private int nLh;
  private ArrayList<String> nLi;

  public a()
  {
    AppMethodBeat.i(113418);
    this.nLh = 8;
    this.nLi = new ArrayList();
    AppMethodBeat.o(113418);
  }

  public final void F(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(113419);
    this.nLi.clear();
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      paramArrayList = (String)localIterator.next();
      this.nLi.add(paramArrayList);
    }
    boolean bool;
    if (this.yvb == null)
    {
      bool = true;
      ab.i("MicroMsg.MMGridPaperAdapter", "notifyDataSetChange, notifier is null ? %B", new Object[] { Boolean.valueOf(bool) });
      if (this.yvb != null)
        break label93;
      AppMethodBeat.o(113419);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label93: this.yvb.aWv();
      AppMethodBeat.o(113419);
    }
  }

  public final View d(int paramInt, View paramView)
  {
    AppMethodBeat.i(113421);
    a locala = new a();
    if (paramView == null)
    {
      paramView = View.inflate(ah.getContext(), 2130968791, null);
      locala.gvq = ((ImageView)paramView.findViewById(2131821555));
      locala.nLj = ((TextView)paramView.findViewById(2131821556));
      paramView.setTag(locala);
    }
    while (true)
    {
      Object localObject = (String)this.nLi.get(paramInt);
      a.b.b(locala.gvq, (String)localObject);
      String str = s.mJ((String)localObject);
      localObject = str;
      if (str.length() > this.nLh)
        localObject = str.subSequence(0, this.nLh + 1) + "...";
      locala.nLj.setText((CharSequence)localObject);
      AppMethodBeat.o(113421);
      return paramView;
      locala = (a)paramView.getTag();
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(113420);
    int i = this.nLi.size();
    AppMethodBeat.o(113420);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(113422);
    Object localObject = this.nLi.get(paramInt);
    AppMethodBeat.o(113422);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  final class a
  {
    ImageView gvq;
    TextView nLj;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.a
 * JD-Core Version:    0.6.2
 */