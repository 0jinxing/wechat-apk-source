package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class h$b
{
  boolean nME;
  a nMF;
  private LinearLayout.LayoutParams neY;
  String username;

  public h$b(h paramh, String paramString)
  {
    AppMethodBeat.i(113501);
    this.nME = false;
    this.username = paramString;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ShareHeaderAvatarViewMgr", "init HeaderAvatar, username can't not be null");
      AppMethodBeat.o(113501);
    }
    while (true)
    {
      return;
      this.nMF = new a();
      paramh = (LayoutInflater)this.nMB.context.getSystemService("layout_inflater");
      this.nMF.nMG = ((RelativeLayout)paramh.inflate(2130969946, null));
      this.nMF.goC = ((ImageView)this.nMF.nMG.findViewById(2131823704));
      a.b.r(this.nMF.goC, this.username);
      this.nMF.nMG.setTag(this.username);
      this.neY = new LinearLayout.LayoutParams(-2, -2);
      this.neY.leftMargin = BackwardSupportUtil.b.b(this.nMB.context, 5.0F);
      this.neY.rightMargin = BackwardSupportUtil.b.b(this.nMB.context, 5.0F);
      this.neY.gravity = 17;
      AppMethodBeat.o(113501);
    }
  }

  public final void bJT()
  {
    AppMethodBeat.i(113502);
    ab.i("MicroMsg.ShareHeaderAvatarViewMgr", "setTalking, username=%s", new Object[] { this.username });
    this.nMF.nMG.setBackgroundResource(2130839191);
    this.nMF.nMG.invalidate();
    this.nME = true;
    AppMethodBeat.o(113502);
  }

  public final void bJU()
  {
    AppMethodBeat.i(113503);
    ab.i("MicroMsg.ShareHeaderAvatarViewMgr", "exitTalking, username=%s", new Object[] { this.username });
    this.nMF.nMG.setBackgroundResource(2130839190);
    this.nMF.nMG.invalidate();
    this.nME = false;
    AppMethodBeat.o(113503);
  }

  final class a
  {
    ImageView goC;
    RelativeLayout nMG;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.h.b
 * JD-Core Version:    0.6.2
 */