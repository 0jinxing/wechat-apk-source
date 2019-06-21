package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.wallet.b;
import com.tencent.mm.sdk.platformtools.ah;

final class o$a extends c.a
{
  public int zcJ = 0;
  public ImageView zeb;
  public TextView zec;
  public TextView zed;

  public final a eZ(View paramView)
  {
    AppMethodBeat.i(32986);
    super.eP(paramView);
    this.enf = ((TextView)this.mRR.findViewById(2131820587));
    this.moo = ((CheckBox)this.mRR.findViewById(2131820580));
    this.iVh = this.mRR.findViewById(2131820586);
    this.qkY = ((TextView)this.mRR.findViewById(2131821102));
    this.zeb = ((ImageView)this.mRR.findViewById(2131822585));
    this.zec = ((TextView)this.mRR.findViewById(2131822587));
    this.zed = ((TextView)this.mRR.findViewById(2131822586));
    this.zcJ = c.hV(ah.getContext());
    this.zed.setTypeface(((b)g.K(b.class)).ex(this.mRR.getContext()));
    AppMethodBeat.o(32986);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.o.a
 * JD-Core Version:    0.6.2
 */