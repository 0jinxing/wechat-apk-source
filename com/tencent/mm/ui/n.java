package com.tencent.mm.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

public final class n
{
  boolean gwZ = true;
  Runnable ykE;

  public final boolean a(Activity paramActivity, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(29514);
    boolean bool;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
      if (paramArrayOfInt == null)
      {
        i = -1;
        ab.w("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bo.dpG() });
        al.n(new n.1(this), 500L);
        bool = true;
        AppMethodBeat.o(29514);
      }
    while (true)
    {
      return bool;
      i = paramArrayOfInt.length;
      break;
      ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default:
        bool = false;
        AppMethodBeat.o(29514);
      case 32:
      case 64:
      case 96:
      case 33:
      case 70:
      case 97:
      }
    }
    int i = 2131301934;
    if (paramInt == 96)
    {
      i = 2131301929;
      label222: if (paramArrayOfInt[0] != 0)
        break label331;
      if (paramInt != 32)
        break label288;
      e.pXa.a(462L, 0L, 1L, true);
      label247: if (this.ykE != null)
        this.ykE.run();
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(29514);
      break;
      if (paramInt != 64)
        break label222;
      i = 2131301926;
      break label222;
      label288: if (paramInt == 96)
      {
        e.pXa.a(462L, 1L, 1L, true);
        q.bH(true);
        break label247;
      }
      e.pXa.a(462L, 2L, 1L, true);
      break label247;
      label331: h.a(paramActivity, paramActivity.getString(i), paramActivity.getString(2131301936), paramActivity.getString(2131300878), paramActivity.getString(2131297773), false, new n.2(this, paramInt, paramActivity), new n.3(this, paramInt, paramActivity));
    }
    i = 2131301934;
    if (paramInt == 97)
    {
      i = 2131301929;
      label398: if (paramArrayOfInt[0] != 0)
        break label490;
      if (paramInt != 33)
        break label450;
      e.pXa.a(462L, 9L, 1L, true);
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(29514);
      break;
      if (paramInt != 70)
        break label398;
      i = 2131301926;
      break label398;
      label450: if (paramInt == 97)
      {
        e.pXa.a(462L, 10L, 1L, true);
      }
      else
      {
        e.pXa.a(462L, 11L, 1L, true);
        continue;
        label490: this.gwZ = false;
        h.a(paramActivity, paramActivity.getString(i), paramActivity.getString(2131301936), paramActivity.getString(2131300878), paramActivity.getString(2131297773), false, new n.4(this, paramInt, paramActivity), new n.5(this, paramInt, paramActivity));
      }
    }
  }

  public final boolean ao(Activity paramActivity)
  {
    boolean bool1 = false;
    AppMethodBeat.i(29512);
    boolean bool2;
    if (this.gwZ)
    {
      bool2 = b.a(paramActivity, "android.permission.WRITE_EXTERNAL_STORAGE", 33, "", "");
      ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
        AppMethodBeat.o(29512);
    }
    while (true)
    {
      return bool1;
      bool2 = b.a(paramActivity, "android.permission.READ_PHONE_STATE", 97, "", "");
      ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
      {
        AppMethodBeat.o(29512);
      }
      else
      {
        AppMethodBeat.o(29512);
        bool1 = true;
      }
    }
  }

  public final boolean c(Activity paramActivity, Runnable paramRunnable)
  {
    boolean bool1 = false;
    AppMethodBeat.i(29513);
    boolean bool2 = b.a(paramActivity, "android.permission.WRITE_EXTERNAL_STORAGE", 32, "", "");
    ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkStorage[%b]", new Object[] { Boolean.valueOf(bool2) });
    if (!bool2)
    {
      this.ykE = paramRunnable;
      AppMethodBeat.o(29513);
    }
    while (true)
    {
      return bool1;
      bool2 = b.a(paramActivity, "android.permission.READ_PHONE_STATE", 96, "", "");
      ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "summerper checkPermission checkPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
      if (!bool2)
      {
        this.ykE = paramRunnable;
        AppMethodBeat.o(29513);
      }
      else
      {
        ab.i("MicroMsg.LauncherUI.LauncherUICheckPermissionHelper", "start time check launcherUIOnCreate from begin time ==" + (System.currentTimeMillis() - LauncherUI.yjH));
        g.jG(LauncherUI.yjH);
        AppMethodBeat.o(29513);
        bool1 = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.n
 * JD-Core Version:    0.6.2
 */