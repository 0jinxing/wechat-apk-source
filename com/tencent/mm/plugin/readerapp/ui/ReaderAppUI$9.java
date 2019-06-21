package com.tencent.mm.plugin.readerapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bl;
import com.tencent.mm.plugin.readerapp.b.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.n;

final class ReaderAppUI$9
  implements View.OnClickListener
{
  ReaderAppUI$9(ReaderAppUI paramReaderAppUI, int paramInt1, String paramString, bl parambl, int paramInt2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(76821);
    if (20 == this.bVv)
    {
      h.pYm.e(15413, new Object[] { Integer.valueOf(8), this.pFk, this.pFl.getTitle() });
      paramView = new Intent();
      paramView.putExtra("mode", 1);
      Object localObject = this.pFl.getUrl();
      paramView.putExtra("news_svr_id", this.pFl.fnf);
      paramView.putExtra("news_svr_tweetid", this.pFl.aaj());
      paramView.putExtra("rawUrl", ReaderAppUI.a(this.pFj, (String)localObject));
      paramView.putExtra("title", this.pFl.getName());
      paramView.putExtra("webpageTitle", this.pFl.getTitle());
      paramView.putExtra("useJs", true);
      paramView.putExtra("vertical_scroll", true);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("snsWebSource", 3);
      paramView.putExtra("jsapiargs", (Bundle)localObject);
      paramView.putExtra("shortUrl", this.pFl.aak());
      paramView.putExtra("type", this.pFl.type);
      paramView.putExtra("tweetid", this.pFl.aaj());
      paramView.putExtra("geta8key_username", "newsapp");
      paramView.putExtra("KPublisherId", "msg_" + Long.toString(this.pFl.fnf));
      paramView.putExtra("pre_username", "newsapp");
      paramView.putExtra("prePublishId", "msg_" + Long.toString(this.pFl.fnf));
      paramView.putExtra("preUsername", "newsapp");
      paramView.putExtra("preChatName", "newsapp");
      paramView.putExtra("preMsgIndex", this.pFm);
      paramView.putExtra("geta8key_scene", 16);
      paramView.addFlags(536870912);
      a.gkE.i(paramView, this.pFj);
    }
    AppMethodBeat.o(76821);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.9
 * JD-Core Version:    0.6.2
 */