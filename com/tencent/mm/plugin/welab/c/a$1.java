package com.tencent.mm.plugin.welab.c;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.sdk.b.b;
import java.util.Map;

final class a$1
  implements Runnable
{
  a$1(a parama, String paramString, Activity paramActivity)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(26575);
    Intent localIntent = aa.cVd();
    localIntent.putExtra("ftsbizscene", 21);
    localIntent.putExtra("ftsQuery", this.IP);
    localIntent.putExtra("title", this.IP);
    localIntent.putExtra("isWebwx", this.IP);
    localIntent.putExtra("ftscaneditable", false);
    Object localObject = aa.d(21, false, 2);
    ((Map)localObject).put("query", this.IP);
    ((Map)localObject).put("sceneActionType", "2");
    localIntent.putExtra("rawUrl", aa.d((Map)localObject, 1));
    localObject = new ll();
    ((ll)localObject).cHk.scene = 0;
    com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
    d.b(this.val$activity, "webview", ".ui.tools.fts.FTSWebViewUI", localIntent);
    an.bz(21, this.IP);
    AppMethodBeat.o(26575);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.c.a.1
 * JD-Core Version:    0.6.2
 */