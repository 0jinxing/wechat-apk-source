package com.tencent.mm.plugin.webview.modeltools;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipboardManager;
import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.charset.Charset;

public final class WebViewClipBoardHelper
  implements ClipboardManager.OnPrimaryClipChangedListener
{
  private long lastReportTime;
  private WebViewUI upw;
  public ClipboardManager upx;

  public WebViewClipBoardHelper(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7019);
    this.lastReportTime = 0L;
    this.upw = paramWebViewUI;
    this.upx = ((ClipboardManager)paramWebViewUI.getApplicationContext().getSystemService("clipboard"));
    try
    {
      this.upx.addPrimaryClipChangedListener(this);
      AppMethodBeat.o(7019);
      return;
    }
    catch (Exception paramWebViewUI)
    {
      while (true)
        AppMethodBeat.o(7019);
    }
  }

  public final void onPrimaryClipChanged()
  {
    AppMethodBeat.i(7020);
    long l = System.currentTimeMillis();
    if (l - this.lastReportTime < 200L)
      AppMethodBeat.o(7020);
    while (true)
    {
      return;
      this.lastReportTime = l;
      Object localObject = this.upx.getPrimaryClip();
      if (localObject == null)
      {
        AppMethodBeat.o(7020);
      }
      else
      {
        localObject = ((ClipData)localObject).getItemAt(0);
        if (localObject == null)
        {
          AppMethodBeat.o(7020);
        }
        else
        {
          WebViewClipBoardHelper.ClipBoardDataWrapper localClipBoardDataWrapper = new WebViewClipBoardHelper.ClipBoardDataWrapper();
          localClipBoardDataWrapper.url = this.upw.dae();
          if (bo.ac(((ClipData.Item)localObject).getText()))
          {
            ab.w("MicroMsg.WebViewClipBoardHelper", "onPrimaryClipChanged text is null");
            AppMethodBeat.o(7020);
          }
          else
          {
            localClipBoardDataWrapper.length = ((ClipData.Item)localObject).getText().toString().getBytes(Charset.forName("UTF-8")).length;
            localClipBoardDataWrapper.fromScene = this.upw.getIntent().getIntExtra("from_scence", 0);
            localClipBoardDataWrapper.username = this.upw.getIntent().getStringExtra("geta8key_username");
            XIPCInvoker.a("com.tencent.mm", localClipBoardDataWrapper, WebViewClipBoardHelper.a.class, null);
            AppMethodBeat.o(7020);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper
 * JD-Core Version:    0.6.2
 */