package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

final class f$a extends c.a
{
  public int maxSize = 0;
  public int zcJ = 0;
  public ImageView zdd;
  public TextView zde;
  public TextView zdf;
  public TextView zdg;
  public int zdj = 0;

  public final a eT(View paramView)
  {
    AppMethodBeat.i(32877);
    super.eP(paramView);
    this.enf = ((TextView)this.mRR.findViewById(2131820587));
    this.moo = ((CheckBox)this.mRR.findViewById(2131820580));
    this.iVh = this.mRR.findViewById(2131820586);
    this.qkY = ((TextView)this.mRR.findViewById(2131821102));
    this.zdd = ((ImageView)this.mRR.findViewById(2131822562));
    this.zde = ((TextView)this.mRR.findViewById(2131822563));
    this.zdf = ((TextView)this.mRR.findViewById(2131822564));
    this.zdg = ((TextView)this.mRR.findViewById(2131822565));
    this.jPL = ((LinearLayout)this.mRR.findViewById(2131822515));
    this.zcJ = c.hV(ah.getContext());
    this.zdj = a.al(ah.getContext(), 2131427528);
    this.maxSize = ((int)(a.am(ah.getContext(), 2131427528) * 1.45F));
    AppMethodBeat.o(32877);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.f.a
 * JD-Core Version:    0.6.2
 */