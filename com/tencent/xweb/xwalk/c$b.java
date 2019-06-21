package com.tencent.xweb.xwalk;

import android.app.ProgressDialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;

final class c$b extends n
{
  boolean ARG = false;
  private ProgressDialog ARs;

  public c$b(c paramc, Context paramContext)
  {
    super(paramContext);
  }

  private void avt(String paramString)
  {
    AppMethodBeat.i(85181);
    if (this.ARs == null)
    {
      this.ARs = new ProgressDialog(this.mContext);
      this.ARs.setProgressStyle(1);
      this.ARs.setMessage(paramString);
      this.ARs.setOnCancelListener(new c.b.1(this));
      this.ARs.setCancelable(false);
      this.ARs.show();
    }
    this.ARs.setMessage(paramString);
    AppMethodBeat.o(85181);
  }

  public final void onXWalkUpdateCancelled()
  {
    AppMethodBeat.i(85179);
    super.onXWalkUpdateCancelled();
    try
    {
      this.ARs.setCancelable(true);
      this.ARs.setCanceledOnTouchOutside(true);
      avt("更新失败, 更新被取消");
      AppMethodBeat.o(85179);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.i("WebDebugPage", "may run in background failed to load alert:" + localException.getMessage());
        AppMethodBeat.o(85179);
      }
    }
  }

  public final void onXWalkUpdateCompleted()
  {
    AppMethodBeat.i(85180);
    super.onXWalkUpdateCompleted();
    try
    {
      avt("更新完成，点任意位置重启进程生效");
      this.ARs.setCancelable(true);
      this.ARs.setCanceledOnTouchOutside(true);
      this.ARs.setProgress(100);
      this.ARG = true;
      AppMethodBeat.o(85180);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.i("WebDebugPage", "may run in background failed to load alert:" + localException.getMessage());
        AppMethodBeat.o(85180);
      }
    }
  }

  public final void onXWalkUpdateFailed(int paramInt)
  {
    AppMethodBeat.i(85178);
    super.onXWalkUpdateFailed(paramInt);
    try
    {
      this.ARs.setCancelable(true);
      this.ARs.setCanceledOnTouchOutside(true);
      avt("更新失败, error code = :".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(85178);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Log.i("WebDebugPage", "may run in background failed to load alert:" + localException.getMessage());
        AppMethodBeat.o(85178);
      }
    }
  }

  public final void onXWalkUpdateProgress(int paramInt)
  {
    AppMethodBeat.i(85177);
    super.onXWalkUpdateProgress(paramInt);
    if (this.ARG)
      AppMethodBeat.o(85177);
    while (true)
    {
      return;
      try
      {
        avt("正在下载runtime");
        if (this.ARs != null)
          this.ARs.setProgress(paramInt);
        AppMethodBeat.o(85177);
      }
      catch (Exception localException)
      {
        Log.i("WebDebugPage", "may run in background failed to load alert:" + localException.getMessage());
        AppMethodBeat.o(85177);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.b
 * JD-Core Version:    0.6.2
 */