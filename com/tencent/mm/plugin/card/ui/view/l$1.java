package com.tencent.mm.plugin.card.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wz;
import java.util.LinkedList;

final class l$1
  implements View.OnClickListener
{
  l$1(l paraml, wz paramwz, LinkedList paramLinkedList, LayoutInflater paramLayoutInflater)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88754);
    this.kqS.kqO = true;
    this.kqS.kqM.findViewById(2131822014).setVisibility(8);
    for (int i = this.kqP.wcU; i < this.kqQ.size(); i++)
    {
      paramView = (TextView)this.kqR.inflate(2130968990, null, false);
      paramView.setText(((tm)this.kqQ.get(i)).title);
      this.kqS.kqN.addView(paramView);
    }
    this.kqS.kqN.invalidate();
    AppMethodBeat.o(88754);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.l.1
 * JD-Core Version:    0.6.2
 */