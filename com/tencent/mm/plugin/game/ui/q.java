package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class q
  implements View.OnClickListener
{
  int emC;
  protected Context mContext;
  private com.tencent.mm.plugin.game.model.c mVZ;
  String nlL;

  public q(Context paramContext)
  {
    this.mContext = paramContext;
    this.nlL = null;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112143);
    if (!(paramView.getTag() instanceof com.tencent.mm.plugin.game.model.c))
    {
      ab.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
      AppMethodBeat.o(112143);
    }
    while (true)
    {
      return;
      this.mVZ = ((com.tencent.mm.plugin.game.model.c)paramView.getTag());
      ab.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.mVZ.field_appId);
      if (g.u(this.mContext, this.mVZ.field_appId))
      {
        ab.d("MicroMsg.GamePreemptiveCliclListener", "launchFromWX, appId = " + this.mVZ.field_appId + ", pkg = " + this.mVZ.field_packageName + ", openId = " + this.mVZ.field_openId);
        e.ak(this.mContext, this.mVZ.field_appId);
        b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 3, this.mVZ.field_appId, this.emC, this.mVZ.ctu, this.mVZ.mVB);
        AppMethodBeat.o(112143);
      }
      else
      {
        ab.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", new Object[] { this.nlL });
        if (!bo.isNullOrNil(this.nlL))
        {
          com.tencent.mm.plugin.game.f.c.ax(this.mContext, this.nlL);
          b.a(this.mContext, this.mVZ.scene, this.mVZ.cKG, this.mVZ.position, 11, this.mVZ.field_appId, this.emC, this.mVZ.ctu, this.mVZ.mVB);
          AppMethodBeat.o(112143);
        }
        else
        {
          ab.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
          AppMethodBeat.o(112143);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.q
 * JD-Core Version:    0.6.2
 */