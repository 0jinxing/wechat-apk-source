package com.tencent.mm.plugin.appbrand.widget.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class c$b extends BaseAdapter
{
  private LinkedList<c.c> jbN;

  c$b(LinkedList<c.c> paramLinkedList)
  {
    this.jbN = paramLinkedList;
  }

  private c.c qv(int paramInt)
  {
    AppMethodBeat.i(102354);
    c.c localc = (c.c)this.jbN.get(paramInt);
    AppMethodBeat.o(102354);
    return localc;
  }

  public final int getCount()
  {
    AppMethodBeat.i(102353);
    int i;
    if (this.jbN == null)
    {
      i = 0;
      AppMethodBeat.o(102353);
    }
    while (true)
    {
      return i;
      i = this.jbN.size();
      AppMethodBeat.o(102353);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(102355);
    if ((this.jbN == null) || (this.jbN.size() <= 0))
    {
      AppMethodBeat.o(102355);
      paramView = null;
      return paramView;
    }
    c.c localc = qv(paramInt);
    Object localObject;
    if (paramView == null)
    {
      paramView = new c.b.a((byte)0);
      localObject = View.inflate(paramViewGroup.getContext(), 2130968786, null);
      paramView.jbR = ((ImageView)((View)localObject).findViewById(2131821546));
      paramView.jbS = ((TextView)((View)localObject).findViewById(2131821547));
      ((View)localObject).setTag(paramView);
      paramViewGroup = paramView;
      paramView = (View)localObject;
      label102: if (localc.state != 1)
        break label176;
      paramViewGroup.jbR.setImageResource(2130839209);
    }
    while (true)
    {
      paramViewGroup.jbS.setText(localc.desc);
      localObject = paramViewGroup.jbR;
      paramViewGroup.jbR.setOnClickListener(new c.b.1(this, localc, (ImageView)localObject));
      AppMethodBeat.o(102355);
      break;
      paramViewGroup = (c.b.a)paramView.getTag();
      break label102;
      label176: if (localc.state == 3)
        paramViewGroup.jbR.setImageResource(2130839208);
      else
        paramViewGroup.jbR.setImageResource(2130839207);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.c.b
 * JD-Core Version:    0.6.2
 */