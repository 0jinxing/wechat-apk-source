package com.tencent.mm.plugin.card.ui.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wz;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public final class l extends i
{
  View kqM;
  LinearLayout kqN;
  boolean kqO = false;

  public final void bes()
  {
    AppMethodBeat.i(88756);
    if (this.kqM != null)
      this.kqM.setVisibility(8);
    AppMethodBeat.o(88756);
  }

  public final void initView()
  {
  }

  public final void update()
  {
    AppMethodBeat.i(88755);
    if (this.kqM == null)
      this.kqM = ((ViewStub)findViewById(2131822031)).inflate();
    wz localwz = this.kqK.bcv().aZW().vSl;
    ((TextView)this.kqM.findViewById(2131822012)).setText(localwz.title);
    LinkedList localLinkedList;
    LayoutInflater localLayoutInflater;
    int i;
    TextView localTextView;
    if ((localwz.wcV != null) && (localwz.wcV.size() > 0))
    {
      this.kqN = ((LinearLayout)this.kqM.findViewById(2131822013));
      this.kqN.removeAllViews();
      localLinkedList = localwz.wcV;
      localLayoutInflater = (LayoutInflater)this.kqK.bcy().getSystemService("layout_inflater");
      if ((localwz.wcU >= localLinkedList.size()) || (this.kqO))
      {
        this.kqM.findViewById(2131822014).setVisibility(8);
        for (i = 0; i < localLinkedList.size(); i++)
        {
          localTextView = (TextView)localLayoutInflater.inflate(2130968990, null, false);
          localTextView.setText(((tm)localLinkedList.get(i)).title);
          this.kqN.addView(localTextView);
        }
        this.kqN.invalidate();
        AppMethodBeat.o(88755);
      }
    }
    while (true)
    {
      return;
      for (i = 0; i < localwz.wcU; i++)
      {
        localTextView = (TextView)localLayoutInflater.inflate(2130968990, null, false);
        localTextView.setText(((tm)localLinkedList.get(i)).title);
        this.kqN.addView(localTextView);
      }
      this.kqN.invalidate();
      this.kqM.findViewById(2131822014).setVisibility(0);
      this.kqM.findViewById(2131822014).setOnClickListener(new l.1(this, localwz, localLinkedList, localLayoutInflater));
      AppMethodBeat.o(88755);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.l
 * JD-Core Version:    0.6.2
 */