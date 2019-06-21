package com.tencent.mm.plugin.notification.d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.lj;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.g.a.rp.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;

public final class e extends com.tencent.mm.plugin.notification.c.a<c>
{
  private com.tencent.mm.sdk.b.c oWe;
  private com.tencent.mm.sdk.b.c oWf;

  public e()
  {
    AppMethodBeat.i(23158);
    this.oWe = new e.1(this);
    this.oWf = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(23158);
  }

  public final String Aq(int paramInt)
  {
    AppMethodBeat.i(23166);
    String str = getContext().getString(2131301762, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(23166);
    return str;
  }

  public final void N(ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(23160);
    lj locallj = new lj();
    locallj.cHj.cCa = paramArrayList;
    com.tencent.mm.sdk.b.a.xxA.m(locallj);
    AppMethodBeat.o(23160);
  }

  public final String af(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(23168);
    String str = getContext().getString(2131301818, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(23168);
    return str;
  }

  public final void bWF()
  {
    AppMethodBeat.i(23159);
    Object localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      if (localObject != null)
      {
        localObject = ((ComponentName)localObject).getClassName();
        ab.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, currentActivity name:%s", new Object[] { localObject });
        if (((String)localObject).contains("SnsTimeLineUI"))
        {
          ab.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, already in SnsTimlineUI");
          AppMethodBeat.o(23159);
        }
      }
    }
    while (true)
    {
      return;
      localObject = new Intent();
      ((Intent)localObject).putExtra("sns_resume_state", false);
      ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
      ((Intent)localObject).putExtra("preferred_tab", 2);
      if (Build.VERSION.SDK_INT < 16)
        ((Intent)localObject).putExtra("is_need_resend_sns", true);
      ((Intent)localObject).putExtra("From_fail_notify", true);
      ((Intent)localObject).putExtra("jump_sns_from_notify", true);
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).addFlags(536870912);
      d.f(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
      AppMethodBeat.o(23159);
    }
  }

  public final void bWK()
  {
    AppMethodBeat.i(23161);
    com.tencent.mm.sdk.b.a.xxA.c(this.oWf);
    AppMethodBeat.o(23161);
  }

  public final void bWL()
  {
    AppMethodBeat.i(23162);
    com.tencent.mm.sdk.b.a.xxA.c(this.oWe);
    AppMethodBeat.o(23162);
  }

  public final void bWM()
  {
    AppMethodBeat.i(23164);
    com.tencent.mm.sdk.b.a.xxA.d(this.oWf);
    AppMethodBeat.o(23164);
  }

  public final void bWN()
  {
    AppMethodBeat.i(23165);
    com.tencent.mm.sdk.b.a.xxA.d(this.oWe);
    AppMethodBeat.o(23165);
  }

  public final void bWt()
  {
    AppMethodBeat.i(23171);
    if (aw.RK())
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(589825, Boolean.FALSE);
    }
    AppMethodBeat.o(23171);
  }

  public final String eL(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23167);
    String str = getContext().getString(2131301817, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    AppMethodBeat.o(23167);
    return str;
  }

  public final String eM(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(23169);
    String str;
    if (paramInt2 <= 0)
    {
      str = getContext().getString(2131301814, new Object[] { Integer.valueOf(paramInt1) });
      AppMethodBeat.o(23169);
    }
    while (true)
    {
      return str;
      str = getContext().getString(2131301763, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(23169);
    }
  }

  public final int getType()
  {
    return 2;
  }

  public final void jq(long paramLong)
  {
    AppMethodBeat.i(23163);
    al.d(new e.3(this, paramLong));
    AppMethodBeat.o(23163);
  }

  public final boolean jr(long paramLong)
  {
    AppMethodBeat.i(23170);
    boolean bool = n.qFD.CJ((int)paramLong);
    ab.d("MicroMsg.SendSnsFailNotification", "checkMsgIfExist, msgId:%d, result:%b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bool) });
    AppMethodBeat.o(23170);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.e
 * JD-Core Version:    0.6.2
 */