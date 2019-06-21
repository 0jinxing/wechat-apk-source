package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class w
{
  private LinearLayout lfQ;
  private View.OnClickListener pLd;
  private ChatFooterCustom yIr;
  private FrameLayout yIs;

  public w(ChatFooterCustom paramChatFooterCustom)
  {
    AppMethodBeat.i(30815);
    this.pLd = new w.1(this);
    this.yIr = paramChatFooterCustom;
    AppMethodBeat.o(30815);
  }

  public final void ctT()
  {
    AppMethodBeat.i(30816);
    ab.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
    this.yIr.findViewById(2131822434).setVisibility(8);
    this.yIr.findViewById(2131822437).setVisibility(8);
    this.lfQ = ((LinearLayout)this.yIr.findViewById(2131822436));
    this.lfQ.setWeightSum(1.0F);
    this.yIs = ((FrameLayout)this.lfQ.getChildAt(0));
    this.yIs.setVisibility(0);
    this.yIs.setOnClickListener(this.pLd);
    ((TextView)this.yIs.findViewById(2131822432)).setText(2131299387);
    this.yIs.findViewById(2131822431).setVisibility(8);
    this.yIs.getChildAt(2).setVisibility(8);
    for (int i = 1; i < 6; i++)
      this.lfQ.getChildAt(i).setVisibility(8);
    AppMethodBeat.o(30816);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.w
 * JD-Core Version:    0.6.2
 */