package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;

final class CompressPreviewUI$1
  implements AdapterView.OnItemClickListener
{
  CompressPreviewUI$1(CompressPreviewUI paramCompressPreviewUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(68238);
    paramView = CompressPreviewUI.a(this.pxt).Bs(paramInt);
    String str1 = paramView.id;
    paramAdapterView = CompressPreviewUI.a(this.pxt);
    if (paramAdapterView.pxw == null)
    {
      paramAdapterView = null;
      if (!str1.equals(paramAdapterView))
        break label83;
      CompressPreviewUI.a(this.pxt, CompressPreviewUI.a(this.pxt).ccY());
      AppMethodBeat.o(68238);
    }
    while (true)
    {
      return;
      paramAdapterView = paramAdapterView.pxw.id;
      break;
      label83: if (paramView.ccX())
      {
        CompressPreviewUI.a(this.pxt, paramView.id);
        AppMethodBeat.o(68238);
      }
      else
      {
        if (paramView.aIt)
        {
          str1 = "mailid=" + CompressPreviewUI.b(this.pxt);
          String str2 = "attachid=" + paramView.id;
          paramAdapterView = "compressfilepath=" + CompressPreviewUI.c(this.pxt);
          Intent localIntent = new Intent(this.pxt, MailWebViewUI.class);
          localIntent.putExtra("uri", "/cgi-bin/viewdocument");
          localIntent.putExtra("params", new String[] { str1, str2, paramAdapterView, "texttype=html" });
          localIntent.putExtra("baseurl", v.ccw());
          localIntent.putExtra("method", "get");
          localIntent.putExtra("singleColumn", FileExplorerUI.ajX(paramView.name));
          localIntent.putExtra("title", this.pxt.getString(2131302159));
          this.pxt.startActivity(localIntent);
        }
        AppMethodBeat.o(68238);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.1
 * JD-Core Version:    0.6.2
 */