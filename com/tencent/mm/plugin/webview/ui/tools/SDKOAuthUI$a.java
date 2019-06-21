package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bew;
import java.util.LinkedList;

final class SDKOAuthUI$a extends BaseAdapter
{
  private LayoutInflater mInflater;
  private LinkedList<bew> usA;

  public SDKOAuthUI$a(Context paramContext, LinkedList<bew> paramLinkedList)
  {
    AppMethodBeat.i(7540);
    this.mInflater = LayoutInflater.from(paramContext);
    this.usA = paramLinkedList;
    AppMethodBeat.o(7540);
  }

  private bew Jl(int paramInt)
  {
    AppMethodBeat.i(7543);
    bew localbew;
    if ((paramInt >= 0) && (paramInt < this.usA.size()))
    {
      localbew = (bew)this.usA.get(paramInt);
      AppMethodBeat.o(7543);
    }
    while (true)
    {
      return localbew;
      localbew = null;
      AppMethodBeat.o(7543);
    }
  }

  public final LinkedList<String> cZG()
  {
    AppMethodBeat.i(7541);
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i < this.usA.size(); i++)
    {
      bew localbew = (bew)this.usA.get(i);
      if ((localbew.wIR == 2) || (localbew.wIR == 3))
        localLinkedList.add(localbew.scope);
    }
    AppMethodBeat.o(7541);
    return localLinkedList;
  }

  public final int getCount()
  {
    AppMethodBeat.i(7542);
    int i;
    if (this.usA == null)
    {
      i = 0;
      AppMethodBeat.o(7542);
    }
    while (true)
    {
      return i;
      i = this.usA.size();
      AppMethodBeat.o(7542);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(7544);
    if ((this.usA == null) || (this.usA.size() <= 0))
    {
      AppMethodBeat.o(7544);
      paramView = null;
    }
    bew localbew;
    while (true)
    {
      return paramView;
      localbew = Jl(paramInt);
      if (localbew != null)
        break;
      AppMethodBeat.o(7544);
    }
    if (paramView == null)
    {
      paramViewGroup = new SDKOAuthUI.a.a((byte)0);
      paramView = this.mInflater.inflate(2130970558, null, false);
      paramViewGroup.usE = ((ImageView)paramView.findViewById(2131821546));
      paramViewGroup.jbS = ((TextView)paramView.findViewById(2131821547));
      paramView.setTag(paramViewGroup);
      label110: if (localbew.wIR != 1)
        break label185;
      paramViewGroup.usE.setImageResource(2131231542);
    }
    while (true)
    {
      paramViewGroup.jbS.setText(localbew.desc);
      ImageView localImageView = paramViewGroup.usE;
      paramViewGroup.usE.setOnClickListener(new SDKOAuthUI.a.1(this, localbew, localImageView));
      AppMethodBeat.o(7544);
      break;
      paramViewGroup = (SDKOAuthUI.a.a)paramView.getTag();
      break label110;
      label185: if (localbew.wIR == 3)
        paramViewGroup.usE.setImageResource(2131231541);
      else
        paramViewGroup.usE.setImageResource(2131231540);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.a
 * JD-Core Version:    0.6.2
 */