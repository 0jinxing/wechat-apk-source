package com.tencent.mm.plugin.notification.d;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.notification.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;

public final class d extends com.tencent.mm.plugin.notification.c.a<bi>
{
  private com.tencent.mm.sdk.b.c oVX;
  private com.tencent.mm.sdk.b.c oVY;

  public d()
  {
    AppMethodBeat.i(23136);
    this.oVX = new d.1(this);
    this.oVY = new d.2(this);
    AppMethodBeat.o(23136);
  }

  public final String Aq(int paramInt)
  {
    AppMethodBeat.i(23144);
    String str = getContext().getString(2131301761, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(23144);
    return str;
  }

  public final void N(ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(23143);
    aw.ZK();
    com.tencent.mm.model.c.XO().K(paramArrayList);
    AppMethodBeat.o(23143);
  }

  public final String af(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(23146);
    String str = getContext().getString(2131301816, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(23146);
    return str;
  }

  public final void bWF()
  {
    AppMethodBeat.i(23142);
    ab.i("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", new Object[] { Integer.valueOf(this.oVG.oVR.size()) });
    if (!g.RN().QY())
    {
      ab.w("MicroMsg.SendNormalMsgFailNotificaiton", "account not ready.");
      AppMethodBeat.o(23142);
    }
    while (true)
    {
      return;
      Object localObject;
      if (this.oVG.oVR.size() > 1)
      {
        localObject = new Intent();
        ((Intent)localObject).addFlags(67108864);
        ((Intent)localObject).addFlags(536870912);
        if (Build.VERSION.SDK_INT < 16)
          ((Intent)localObject).putExtra("resend_fail_messages", true);
        ((Intent)localObject).putExtra("From_fail_notify", true);
        ab.d("MicroMsg.SendNormalMsgFailNotificaiton", "startMainUI");
        com.tencent.mm.bp.d.f(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
        AppMethodBeat.o(23142);
      }
      else
      {
        if (this.oVG.oVR.size() == 1)
        {
          long l = this.oVG.get(0);
          aw.ZK();
          localObject = com.tencent.mm.model.c.XO().jf(l).field_talker;
          Intent localIntent = new Intent();
          localIntent.putExtra("Main_User", (String)localObject);
          localIntent.putExtra("From_fail_notify", true);
          localIntent.addFlags(67108864);
          localIntent.addFlags(536870912);
          if (Build.VERSION.SDK_INT < 16)
            localIntent.putExtra("resend_fail_messages", true);
          com.tencent.mm.bp.d.f(this.mContext, "com.tencent.mm.ui.LauncherUI", localIntent);
        }
        AppMethodBeat.o(23142);
      }
    }
  }

  public final void bWK()
  {
    AppMethodBeat.i(23137);
    com.tencent.mm.sdk.b.a.xxA.c(this.oVX);
    AppMethodBeat.o(23137);
  }

  public final void bWL()
  {
    AppMethodBeat.i(23138);
    com.tencent.mm.sdk.b.a.xxA.c(this.oVY);
    AppMethodBeat.o(23138);
  }

  public final void bWM()
  {
    AppMethodBeat.i(23140);
    com.tencent.mm.sdk.b.a.xxA.d(this.oVX);
    AppMethodBeat.o(23140);
  }

  public final void bWN()
  {
    AppMethodBeat.i(23141);
    com.tencent.mm.sdk.b.a.xxA.d(this.oVY);
    AppMethodBeat.o(23141);
  }

  public final String eL(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23145);
    String str = getContext().getString(2131301815, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    AppMethodBeat.o(23145);
    return str;
  }

  public final String eM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23147);
    String str;
    if (paramInt2 <= 0)
    {
      str = getContext().getString(2131301813, new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(23147);
    }
    while (true)
    {
      return str;
      str = getContext().getString(2131301812, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(23147);
    }
  }

  public final int getType()
  {
    return 1;
  }

  public final void jq(long paramLong)
  {
    AppMethodBeat.i(23139);
    aw.ZK();
    al.d(new d.3(this, paramLong, com.tencent.mm.model.c.XO().jf(paramLong)));
    AppMethodBeat.o(23139);
  }

  public final boolean jr(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(23148);
    aw.ZK();
    bi localbi = com.tencent.mm.model.c.XO().jf(paramLong);
    ab.d("MicroMsg.SendNormalMsgFailNotificaiton", "checkMsgIfExist, msgId:%d, msg.getMsgId:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(localbi.field_msgId) });
    if (localbi.field_msgId != 0L)
      AppMethodBeat.o(23148);
    while (true)
    {
      return bool;
      AppMethodBeat.o(23148);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.d
 * JD-Core Version:    0.6.2
 */