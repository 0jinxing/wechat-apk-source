package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bew;
import java.util.LinkedList;

final class SDKOAuthOtherUI$a extends BaseAdapter
{
  private Context mContext;
  private LayoutInflater mInflater;
  LinkedList<bew> usA;

  public SDKOAuthOtherUI$a(Context paramContext, LinkedList<bew> paramLinkedList)
  {
    AppMethodBeat.i(7511);
    this.mInflater = LayoutInflater.from(paramContext);
    this.usA = paramLinkedList;
    this.mContext = paramContext;
    AppMethodBeat.o(7511);
  }

  private bew Jl(int paramInt)
  {
    AppMethodBeat.i(7513);
    bew localbew;
    if ((paramInt >= 0) && (paramInt < this.usA.size()))
    {
      localbew = (bew)this.usA.get(paramInt);
      AppMethodBeat.o(7513);
    }
    while (true)
    {
      return localbew;
      localbew = null;
      AppMethodBeat.o(7513);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(7512);
    int i;
    if (this.usA == null)
    {
      i = 0;
      AppMethodBeat.o(7512);
    }
    while (true)
    {
      return i;
      i = this.usA.size();
      AppMethodBeat.o(7512);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(7514);
    if ((this.usA == null) || (this.usA.size() <= 0))
    {
      AppMethodBeat.o(7514);
      paramView = null;
    }
    final bew localbew;
    while (true)
    {
      return paramView;
      localbew = Jl(paramInt);
      if (localbew != null)
        break;
      AppMethodBeat.o(7514);
    }
    if (paramView == null)
    {
      paramViewGroup = new SDKOAuthOtherUI.a.a((byte)0);
      paramView = this.mInflater.inflate(2130970559, null, false);
      paramViewGroup.usE = ((ImageView)paramView.findViewById(2131821546));
      paramViewGroup.jbS = ((TextView)paramView.findViewById(2131821547));
      paramView.setTag(paramViewGroup);
      label110: if (localbew.wIR != 1)
        break label185;
      paramViewGroup.usE.setImageResource(2131231545);
    }
    while (true)
    {
      paramViewGroup.jbS.setText(localbew.desc);
      final ImageView localImageView = paramViewGroup.usE;
      paramViewGroup.usE.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(7510);
          if (localbew.wIR == 2)
          {
            localImageView.setImageResource(2131231545);
            localbew.wIR = 1;
            AppMethodBeat.o(7510);
          }
          while (true)
          {
            return;
            if (localbew.wIR == 1)
            {
              localImageView.setImageResource(2131231543);
              localbew.wIR = 2;
            }
            AppMethodBeat.o(7510);
          }
        }
      });
      AppMethodBeat.o(7514);
      break;
      paramViewGroup = (SDKOAuthOtherUI.a.a)paramView.getTag();
      break label110;
      label185: if (localbew.wIR == 3)
        paramViewGroup.usE.setImageResource(2131231544);
      else
        paramViewGroup.usE.setImageResource(2131231543);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.a
 * JD-Core Version:    0.6.2
 */