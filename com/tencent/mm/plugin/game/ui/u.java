package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.model.ax;
import com.tencent.mm.plugin.game.model.ax.a;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class u
  implements View.OnClickListener
{
  private Context mContext;
  int mXC = 0;
  private c mXM;
  String nek = null;
  private int nnd;

  public u(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112216);
    if (!(paramView.getTag() instanceof c))
    {
      ab.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
      AppMethodBeat.o(112216);
    }
    while (true)
    {
      return;
      this.mXM = ((c)paramView.getTag());
      ab.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.mXM.field_appId);
      if (!g.u(this.mContext, this.mXM.field_appId))
        break;
      ab.d("MicroMsg.GameTMAssistClickListener", "launchFromWX, appId = " + this.mXM.field_appId + ", pkg = " + this.mXM.field_packageName + ", openId = " + this.mXM.field_openId);
      b.a(this.mContext, this.mXM.scene, this.mXM.cKG, this.mXM.position, 3, this.mXM.field_appId, this.mXC, this.nek);
      e.ak(this.mContext, this.mXM.field_appId);
      AppMethodBeat.o(112216);
    }
    ax.bEU();
    paramView = this.mXM.dnl;
    int i;
    if (bo.isNullOrNil(paramView))
    {
      ab.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
      i = -1;
      label234: this.nnd = i;
      String str = this.mXM.dnl;
      paramView = str;
      if (!bo.isNullOrNil(str))
        paramView = str.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
      if (this.mXM.status != 3)
        break label393;
      ax.bEU();
      ax.startToAuthorized(this.mContext, paramView);
      label288: i = 5;
      if (this.mXM.status == 3)
        i = 10;
      if (this.nnd != 4)
        break label408;
      i = 8;
    }
    label393: label408: 
    while (true)
    {
      b.a(this.mContext, this.mXM.scene, this.mXM.cKG, this.mXM.position, i, this.mXM.field_appId, this.mXC, this.mXM.ctu, this.nek);
      AppMethodBeat.o(112216);
      break;
      i = ax.a(new ax.a((byte)0).NY(paramView));
      break label234;
      ax.bEU();
      ax.aw(this.mContext, paramView);
      break label288;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.u
 * JD-Core Version:    0.6.2
 */