package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Looper;
import android.os.Message;
import android.os.StatFs;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.k;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;
import com.tencent.mm.ui.base.t;
import java.io.File;

@k
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class MountReceiver extends BroadcastReceiver
{
  private String action;
  private Context context;
  private ak ebW;

  public MountReceiver()
  {
    AppMethodBeat.i(15848);
    this.context = null;
    this.action = "";
    this.ebW = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        boolean bool1 = true;
        AppMethodBeat.i(15845);
        paramAnonymousMessage = MountReceiver.a(MountReceiver.this);
        boolean bool2 = aw.RK();
        if (MountReceiver.b(MountReceiver.this) == null)
        {
          ab.d("MicroMsg.MountReceiver", "dkmount action:%s hasuin:%b ContextNull:%b SdcardFull:%b", new Object[] { paramAnonymousMessage, Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(f.Mo()) });
          if (MountReceiver.b(MountReceiver.this) != null)
            break label90;
          AppMethodBeat.o(15845);
        }
        while (true)
        {
          return;
          bool1 = false;
          break;
          label90: if (!f.Mo())
          {
            AppMethodBeat.o(15845);
          }
          else
          {
            t.hP(MountReceiver.b(MountReceiver.this));
            AppMethodBeat.o(15845);
          }
        }
      }
    };
    AppMethodBeat.o(15848);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15849);
    if ((paramContext == null) || (paramIntent == null) || (ah.isNullOrNil(paramIntent.getAction())))
      AppMethodBeat.o(15849);
    while (true)
    {
      return;
      this.context = paramContext;
      this.action = paramIntent.getAction();
      String str1 = Environment.getExternalStorageDirectory().getAbsolutePath();
      ab.i("MicroMsg.MountReceiver", "dkmount action:%s hasuin:%b SDCARD_ROOT[%s] primaryExtStg[%s]", new Object[] { this.action, Boolean.valueOf(aw.RK()), e.eSl, str1 });
      boolean bool = this.action.equals("android.intent.action.MEDIA_MOUNTED");
      if ((!bool) && (!this.action.equals("android.intent.action.MEDIA_EJECT")) && (!this.action.equals("android.intent.action.MEDIA_SHARED")))
      {
        AppMethodBeat.o(15849);
      }
      else
      {
        int i;
        int j;
        if (!e.eSl.equalsIgnoreCase("/dev/null"))
        {
          i = 1;
          j = i;
          if (i == 0);
        }
        try
        {
          Object localObject = new android/os/StatFs;
          ((StatFs)localObject).<init>(e.eSl);
          ab.i("MicroMsg.MountReceiver", "CheckSD path[%s] blocksize:%d blockcount:%d availcount:%d", new Object[] { e.eSl, Integer.valueOf(((StatFs)localObject).getBlockSize()), Integer.valueOf(((StatFs)localObject).getBlockCount()), Integer.valueOf(((StatFs)localObject).getAvailableBlocks()) });
          j = i;
          paramIntent = paramIntent.getData();
          if (paramIntent == null)
            break label609;
          localObject = paramIntent.getPath();
          if (!e.eSl.equalsIgnoreCase((String)localObject))
          {
            if ((!bool) || (j != 0))
              break label600;
            paramIntent = h.pYm;
            if (e.eSl.equalsIgnoreCase("/dev/null"))
            {
              l = 9L;
              paramIntent.a(340L, l, 1L, false);
              if ((ah.isNullOrNil(str1)) || (!str1.equalsIgnoreCase((String)localObject)))
                break label591;
              if (new File(ac.eSj + "SdcardInfo.cfg").exists())
                break label452;
              ab.w("MicroMsg.MountReceiver", "summermount init sdcard root old [%s] to new [%s], ver[%d]", new Object[] { e.eSl, str1, Integer.valueOf(Build.VERSION.SDK_INT) });
              e.eSl = str1;
              e.kw(str1);
            }
          }
          else
          {
            if (!bool)
              break label645;
            aw.RS().aa(new MountReceiver.2(this));
            AppMethodBeat.o(15849);
            continue;
            i = 0;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.MountReceiver", "CheckSD failed :%s", new Object[] { localException.getMessage() });
            j = 0;
            continue;
            l = 12L;
            continue;
            label452: paramIntent = new y(ac.eSj + "SdcardInfo.cfg");
            String str2 = (String)paramIntent.get(1, "");
            j = ((Integer)paramIntent.get(2, Integer.valueOf(0))).intValue();
            i = Build.VERSION.SDK_INT;
            String str3 = e.eSl;
            paramIntent.set(1, str1);
            paramIntent.set(2, Integer.valueOf(i));
            e.kw(str1);
            ab.w("MicroMsg.MountReceiver", "summermount init sdcard root old [%d, %s] to new [%d, %s], [%s] to [%s]", new Object[] { Integer.valueOf(j), str2, Integer.valueOf(i), str1, str3, e.eSl });
          }
          label591: AppMethodBeat.o(15849);
        }
        continue;
        label600: AppMethodBeat.o(15849);
        continue;
        label609: paramIntent = h.pYm;
        if (bool);
        for (long l = 13L; ; l = 14L)
        {
          paramIntent.a(340L, l, 1L, false);
          break;
        }
        label645: t.hO(paramContext);
        aw.RS().aa(new MountReceiver.3(this));
        AppMethodBeat.o(15849);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MountReceiver
 * JD-Core Version:    0.6.2
 */