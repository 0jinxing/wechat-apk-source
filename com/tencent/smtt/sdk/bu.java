package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;

final class bu extends Thread
{
  public final void run()
  {
    AppMethodBeat.i(64839);
    if (WebView.h() == null)
    {
      TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--mAppContext == null");
      AppMethodBeat.o(64839);
    }
    while (true)
    {
      return;
      o localo = o.a(true);
      if (o.a)
      {
        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--needReboot = true");
        AppMethodBeat.o(64839);
      }
      else
      {
        ai localai = ai.a(WebView.h());
        int i = localai.c();
        TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--installStatus = ".concat(String.valueOf(i)));
        if (i == 2)
        {
          TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--install setTbsNeedReboot true");
          localo.a(String.valueOf(localai.b()));
          localo.b(true);
          AppMethodBeat.o(64839);
        }
        else
        {
          int j = localai.b("copy_status");
          TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copyStatus = ".concat(String.valueOf(j)));
          if (j == 1)
          {
            TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--copy setTbsNeedReboot true");
            localo.a(String.valueOf(localai.c("copy_core_ver")));
            localo.b(true);
            AppMethodBeat.o(64839);
          }
          else
          {
            if ((!bv.a().b()) && ((i == 3) || (j == 3)))
            {
              TbsLog.d("TbsNeedReboot", "WebView.updateNeeeRebootStatus--setTbsNeedReboot true");
              localo.a(String.valueOf(o.d()));
              localo.b(true);
            }
            AppMethodBeat.o(64839);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bu
 * JD-Core Version:    0.6.2
 */