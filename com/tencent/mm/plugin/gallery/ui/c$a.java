package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.k;
import java.io.File;

final class c$a
  implements View.OnClickListener
{
  private String filePath;

  public c$a(c paramc, String paramString)
  {
    this.filePath = paramString;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21458);
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    paramView = new File(this.filePath);
    k.a(this.mQu.mContext, localIntent, paramView, "video/*");
    try
    {
      this.mQu.mContext.startActivity(localIntent);
      AppMethodBeat.o(21458);
      return;
    }
    catch (Exception paramView)
    {
      while (true)
        AppMethodBeat.o(21458);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.c.a
 * JD-Core Version:    0.6.2
 */