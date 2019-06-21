package com.tencent.xweb.xwalk;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.b;
import com.tencent.xweb.xwalk.a.e;
import java.io.File;

final class c$16
  implements View.OnClickListener
{
  c$16(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 100000;
    AppMethodBeat.i(85137);
    c localc = this.ARk;
    File localFile1 = Environment.getExternalStorageDirectory();
    if (localFile1 == null)
    {
      localc.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
      AppMethodBeat.o(85137);
    }
    while (true)
    {
      return;
      if (localFile1.listFiles() == null)
      {
        localc.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
        AppMethodBeat.o(85137);
      }
      else
      {
        paramView = e.avu("FullScreenVideo");
        if (paramView == null)
        {
          localc.cs("插件未准备好", true);
          AppMethodBeat.o(85137);
        }
        else
        {
          if (paramView.ASG >= 100000)
            i = paramView.ASG + 1;
          localFile1 = new File(localFile1.getPath() + "/apkxwebtest/xweb_fullscreen_video.js");
          File localFile2 = new File(paramView.aM(i, false));
          if (localFile2.exists())
            localFile2.delete();
          if (b.m(localFile1, localFile2))
          {
            paramView.SD(i);
            new AlertDialog.Builder(localc.AMr).setMessage("加载成功，请重启进程").setCancelable(false).setPositiveButton("确定", new c.32(localc)).create().show();
            AppMethodBeat.o(85137);
          }
          else
          {
            localc.cs("加载失败，请检查文件是否存在", true);
            AppMethodBeat.o(85137);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.16
 * JD-Core Version:    0.6.2
 */