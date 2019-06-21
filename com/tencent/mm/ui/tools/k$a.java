package com.tencent.mm.ui.tools;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;

final class k$a extends BaseAdapter
{
  private k$a(k paramk)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(107715);
    int i;
    if (k.a(this.zFZ))
    {
      i = k.b(this.zFZ).size() + 1;
      AppMethodBeat.o(107715);
    }
    while (true)
    {
      return i;
      i = k.b(this.zFZ).size();
      AppMethodBeat.o(107715);
    }
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(107716);
    if (k.a(this.zFZ))
      if (paramInt == 0)
      {
        paramInt = 0;
        AppMethodBeat.o(107716);
      }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(107716);
      paramInt = i;
      continue;
      AppMethodBeat.o(107716);
      paramInt = i;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(107718);
    if ((k.a(this.zFZ)) && (paramInt == 0))
      if (paramView == null)
      {
        paramView = k.c(this.zFZ).inflate(2130970221, paramViewGroup, false);
        paramViewGroup = new a((byte)0);
        paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
        paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131820915));
        paramView.setTag(paramViewGroup);
        paramViewGroup.gsf.setText(k.f(this.zFZ));
      }
    while (true)
    {
      AppMethodBeat.o(107718);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      int i = paramInt;
      if (k.a(this.zFZ))
        i = paramInt - 1;
      label199: MenuItem localMenuItem;
      if (paramView == null)
      {
        paramView = k.c(this.zFZ).inflate(2130970220, paramViewGroup, false);
        paramViewGroup = new a((byte)0);
        paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
        paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131820915));
        paramViewGroup.jWH = paramView.findViewById(2131820987);
        paramView.setTag(paramViewGroup);
        localMenuItem = k.b(this.zFZ).getItem(i);
        paramViewGroup.gsf.setText(localMenuItem.getTitle());
        if (localMenuItem.getIcon() == null)
          break label327;
        paramViewGroup.iNr.setVisibility(0);
        paramViewGroup.iNr.setImageDrawable(localMenuItem.getIcon());
      }
      while (true)
      {
        if (k.e(this.zFZ) != null)
          k.e(this.zFZ).a(paramViewGroup.gsf, localMenuItem);
        if (i != k.b(this.zFZ).size() - 1)
          break label378;
        paramViewGroup.jWH.setBackgroundResource(2130840366);
        break;
        paramViewGroup = (a)paramView.getTag();
        break label199;
        label327: if (k.d(this.zFZ) != null)
        {
          paramViewGroup.iNr.setVisibility(0);
          k.d(this.zFZ).a(paramViewGroup.iNr, localMenuItem);
        }
        else
        {
          paramViewGroup.iNr.setVisibility(8);
        }
      }
      label378: paramViewGroup.jWH.setBackgroundResource(2130840365);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(107717);
    int i;
    if (k.a(this.zFZ))
    {
      i = 2;
      AppMethodBeat.o(107717);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(107717);
    }
  }

  final class a
  {
    TextView gsf;
    ImageView iNr;
    View jWH;

    private a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.k.a
 * JD-Core Version:    0.6.2
 */