package com.tencent.xweb.xwalk;

import android.app.AlertDialog.Builder;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class c$29
  implements View.OnClickListener
{
  c$29(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85150);
    paramView = this.ARk;
    Object localObject1 = Environment.getExternalStorageDirectory();
    if (localObject1 == null)
    {
      paramView.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
      AppMethodBeat.o(85150);
    }
    while (true)
    {
      return;
      if (((File)localObject1).listFiles() == null)
      {
        paramView.cs("请确认应用权限，在权限管理打开应用的读写存储权限", true);
        AppMethodBeat.o(85150);
      }
      else
      {
        localObject1 = ((File)localObject1).getPath() + "/xweb_dump";
        Object localObject2;
        Object localObject3;
        try
        {
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject1);
          localObject3 = ((File)localObject2).listFiles();
          if ((localObject3 != null) && (localObject3.length != 0))
            break label133;
          paramView.cs("web_dump目录下没有.zip文件,请确认应用权限，在权限管理打开应用的读写存储权限", true);
          AppMethodBeat.o(85150);
        }
        catch (Exception localException)
        {
          paramView.cs("没有找到web_dump目录,请确认应用权限，在权限管理打开应用的读写存储权限", true);
          AppMethodBeat.o(85150);
        }
        continue;
        label133: for (int i = 0; ; i++)
        {
          if (i >= localObject3.length)
            break label266;
          if (localObject3[i].getName().endsWith(".zip"))
          {
            localObject2 = localObject3[i].getAbsolutePath();
            localObject3 = localObject3[i].getName();
            new AlertDialog.Builder(paramView.AMr).setTitle("提示").setMessage("确定加载:" + (String)localObject3 + "?").setPositiveButton("确定", new c.38(paramView, localException, (String)localObject2)).setNegativeButton("取消", new c.37(paramView)).show();
            AppMethodBeat.o(85150);
            break;
          }
        }
        label266: paramView.cs("web_dump目录下没有.zip文件", true);
        AppMethodBeat.o(85150);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.29
 * JD-Core Version:    0.6.2
 */