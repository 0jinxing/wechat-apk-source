package com.tencent.mm.ui.conversation.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.an.a;
import com.tencent.mm.an.a.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public final class n extends com.tencent.mm.pluginsdk.ui.b.b
  implements View.OnClickListener
{
  private static int dIZ()
  {
    AppMethodBeat.i(34702);
    int i;
    if (Build.VERSION.SDK_INT < 23)
    {
      i = 1;
      AppMethodBeat.o(34702);
    }
    while (true)
    {
      return i;
      PowerManager localPowerManager = (PowerManager)ah.getContext().getSystemService("power");
      try
      {
        boolean bool = localPowerManager.isIgnoringBatteryOptimizations(ah.getContext().getPackageName());
        ab.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]app is ignore:".concat(String.valueOf(bool)));
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("[oneliang]is device idle mode:");
        ab.i("MicroMsg.MsgDelayTipsBanner", localPowerManager.isDeviceIdleMode());
        if (!bool);
        for (i = 2; ; i = 3)
        {
          AppMethodBeat.o(34702);
          break;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]ignoring battery optimizations check failure.use another way.");
          i = 3;
        }
      }
    }
  }

  private static int dJa()
  {
    int i = 2131305933;
    AppMethodBeat.i(34703);
    String str = Build.BRAND;
    if (str == null)
      AppMethodBeat.o(34703);
    while (true)
    {
      return i;
      if (str.toLowerCase().startsWith("samsung"))
      {
        i = 2131305934;
        AppMethodBeat.o(34703);
      }
      else if (str.toLowerCase().equalsIgnoreCase("huawei"))
      {
        if ((Build.VERSION.SDK_INT == 21) || (Build.VERSION.SDK_INT == 22) || (Build.VERSION.SDK_INT == 23))
        {
          i = 2131305931;
          AppMethodBeat.o(34703);
        }
        else if (Build.VERSION.SDK_INT == 24)
        {
          i = 2131305932;
          AppMethodBeat.o(34703);
        }
      }
      else
      {
        AppMethodBeat.o(34703);
        continue;
        AppMethodBeat.o(34703);
      }
    }
  }

  public static void ic(Context paramContext)
  {
    AppMethodBeat.i(34704);
    if (paramContext == null)
    {
      AppMethodBeat.o(34704);
      return;
    }
    switch (dIZ())
    {
    default:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(34704);
      break;
      int i = dJa();
      if (i > 0)
      {
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(i), "", new n.1());
        AppMethodBeat.o(34704);
        break;
      }
      ab.e("MicroMsg.MsgDelayTipsBanner", "[oneliang]impossible......");
      AppMethodBeat.o(34704);
      break;
      ab.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to add ignore");
      Intent localIntent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(Uri.parse("package:" + ah.getContext().getPackageName()));
      localIntent.setFlags(268435456);
      paramContext.startActivity(localIntent);
    }
  }

  public static void id(Context paramContext)
  {
    AppMethodBeat.i(34705);
    paramContext.getString(2131297061);
    Object localObject1 = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131297086), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(34700);
        if (paramAnonymousDialogInterface != null)
          paramAnonymousDialogInterface.dismiss();
        AppMethodBeat.o(34700);
      }
    });
    Object localObject2 = a.afS();
    Object localObject3 = new StringBuilder();
    if (localObject2 != null)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (a.a)((Iterator)localObject2).next();
        ((StringBuilder)localObject3).append(((a.a)localObject4).toString());
        ab.i("MicroMsg.MsgDelayTipsBanner", ((a.a)localObject4).toString());
      }
    }
    if (localObject1 != null)
      ((Dialog)localObject1).dismiss();
    localObject1 = new StringBuilder();
    aw.ZK();
    localObject1 = c.XH() + "/delayedMsg";
    com.tencent.mm.vfs.e.tf((String)localObject1);
    Object localObject4 = new com.tencent.mm.vfs.b((String)localObject1, "data.txt");
    Object localObject5 = ((StringBuilder)localObject3).toString();
    if (!((com.tencent.mm.vfs.b)localObject4).exists());
    try
    {
      ((com.tencent.mm.vfs.b)localObject4).createNewFile();
      localObject1 = null;
      localObject3 = null;
    }
    catch (Exception localException2)
    {
      try
      {
        while (true)
        {
          localObject2 = com.tencent.mm.vfs.e.r((com.tencent.mm.vfs.b)localObject4);
          localObject3 = localObject2;
          localObject1 = localObject2;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localObject3 = localObject2;
          localObject1 = localObject2;
          localStringBuilder.<init>();
          localObject3 = localObject2;
          localObject1 = localObject2;
          ((OutputStream)localObject2).write(((String)localObject5 + "\n").getBytes("UTF-8"));
          localObject3 = localObject2;
          localObject1 = localObject2;
          ((OutputStream)localObject2).flush();
          if (localObject2 != null);
          try
          {
            ((OutputStream)localObject2).close();
            Toast.makeText(paramContext, com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject4).dMD()), 1).show();
            localObject3 = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject4).dMD());
            paramContext = new bi();
            paramContext.ju("weixin");
            paramContext.setContent((String)localObject3);
            paramContext.setType(1);
            paramContext.hO(0);
            if (paramContext.field_isSend == 1)
            {
              paramContext.setStatus(4);
              long l = System.currentTimeMillis();
              paramContext.eI(l);
              paramContext.eJ(l);
              ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(paramContext);
              AppMethodBeat.o(34705);
              return;
              localException2 = localException2;
              ab.i("MicroMsg.MsgDelayTipsBanner", "create new file exception:" + localException2.getMessage());
            }
          }
          catch (Exception localException3)
          {
            while (true)
              ab.i("MicroMsg.MsgDelayTipsBanner", "close exception:" + localException3.getMessage());
          }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          localObject1 = localException3;
          localObject5 = new java/lang/StringBuilder;
          localObject1 = localException3;
          ((StringBuilder)localObject5).<init>("exception:");
          localObject1 = localException3;
          ab.i("MicroMsg.MsgDelayTipsBanner", localException1.getMessage());
          if (localException3 != null)
            try
            {
              localException3.close();
            }
            catch (Exception localException4)
            {
              ab.i("MicroMsg.MsgDelayTipsBanner", "close exception:" + localException4.getMessage());
            }
        }
      }
      finally
      {
        while (true)
        {
          if (localObject1 != null);
          try
          {
            ((OutputStream)localObject1).close();
            AppMethodBeat.o(34705);
            throw paramContext;
          }
          catch (Exception localException5)
          {
            while (true)
              ab.i("MicroMsg.MsgDelayTipsBanner", "close exception:" + localException5.getMessage());
          }
          paramContext.setStatus(3);
        }
      }
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34706);
    ab.i("MicroMsg.MsgDelayTipsBanner", "refresh banner.");
    g.RQ();
    boolean bool = g.RP().Ry().getBoolean(ac.a.xTF, false);
    ab.i("MicroMsg.MsgDelayTipsBanner", "[oneliang]need to show banner:%s", new Object[] { Boolean.valueOf(bool) });
    if (bool)
      if (this.view != null)
        this.view.setVisibility(0);
    while (true)
    {
      bool = super.aMN();
      AppMethodBeat.o(34706);
      return bool;
      if (this.view != null)
        this.view.setVisibility(8);
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130970023;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34701);
    ic((Context)this.vlu.get());
    g.RQ();
    g.RP().Ry().set(ac.a.xTF, Boolean.FALSE);
    if (this.view != null)
      this.view.setVisibility(8);
    AppMethodBeat.o(34701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.n
 * JD-Core Version:    0.6.2
 */