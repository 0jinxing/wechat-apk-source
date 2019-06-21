package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a extends c.a
{
  public RelativeLayout zdt;
  public TextView zdu;
  public ImageView zdv;
  public ImageView zdw;

  public final a eU(View paramView)
  {
    AppMethodBeat.i(32891);
    super.eP(paramView);
    this.enf = ((TextView)this.mRR.findViewById(2131820587));
    this.moo = ((CheckBox)this.mRR.findViewById(2131820580));
    this.iVh = this.mRR.findViewById(2131820586);
    this.qkY = ((TextView)this.mRR.findViewById(2131821102));
    this.jPL = this.mRR.findViewById(2131822571);
    this.zdt = ((RelativeLayout)this.mRR.findViewById(2131822567));
    this.zdu = ((TextView)this.mRR.findViewById(2131822570));
    this.zdv = ((ImageView)this.mRR.findViewById(2131822568));
    this.zdw = ((ImageView)this.mRR.findViewById(2131822569));
    AppMethodBeat.o(32891);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.g.a
 * JD-Core Version:    0.6.2
 */