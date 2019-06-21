package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buj;
import java.util.LinkedList;

final class n$b extends BaseAdapter
{
  private LinkedList<buj> jbN;

  public n$b(LinkedList<buj> paramLinkedList)
  {
    Object localObject;
    this.jbN = localObject;
  }

  private buj JT(int paramInt)
  {
    AppMethodBeat.i(79180);
    buj localbuj = (buj)this.jbN.get(paramInt);
    AppMethodBeat.o(79180);
    return localbuj;
  }

  public final int getCount()
  {
    AppMethodBeat.i(79179);
    int i;
    if (this.jbN == null)
    {
      i = 0;
      AppMethodBeat.o(79179);
    }
    while (true)
    {
      return i;
      i = this.jbN.size();
      AppMethodBeat.o(79179);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(79181);
    if ((this.jbN == null) || (this.jbN.size() <= 0))
    {
      AppMethodBeat.o(79181);
      paramView = null;
      return paramView;
    }
    buj localbuj = JT(paramInt);
    Object localObject;
    if (paramView == null)
    {
      localObject = new n.b.a(this, (byte)0);
      paramView = View.inflate(paramViewGroup.getContext(), 2130968786, null);
      ((n.b.a)localObject).usE = ((ImageView)paramView.findViewById(2131821546));
      ((n.b.a)localObject).jbS = ((TextView)paramView.findViewById(2131821547));
      paramView.setTag(localObject);
      paramViewGroup = (ViewGroup)localObject;
      label101: if (localbuj.wWa != 1)
        break label175;
      paramViewGroup.usE.setImageResource(2131231542);
    }
    while (true)
    {
      paramViewGroup.jbS.setText(localbuj.Desc);
      localObject = paramViewGroup.usE;
      paramViewGroup.usE.setOnClickListener(new n.b.1(this, localbuj, (ImageView)localObject));
      AppMethodBeat.o(79181);
      break;
      paramViewGroup = (n.b.a)paramView.getTag();
      break label101;
      label175: if (localbuj.wWa == 3)
        paramViewGroup.usE.setImageResource(2131231541);
      else
        paramViewGroup.usE.setImageResource(2131231540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.n.b
 * JD-Core Version:    0.6.2
 */