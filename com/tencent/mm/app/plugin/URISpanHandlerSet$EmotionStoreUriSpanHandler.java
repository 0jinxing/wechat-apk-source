package com.tencent.mm.app.plugin;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$EmotionStoreUriSpanHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$EmotionStoreUriSpanHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 29 };
  }

  final boolean a(m paramm, g paramg)
  {
    AppMethodBeat.i(15653);
    boolean bool;
    if (paramm.type == 29)
    {
      if (paramg != null)
        paramg.a(paramm);
      Intent localIntent = new Intent();
      localIntent.putExtra("download_entrance_scene", 21);
      localIntent.putExtra("extra_id", (String)paramm.au(String.class));
      localIntent.putExtra("preceding_scence", 3);
      d.b(URISpanHandlerSet.a(this.cgy), "emoji", ".ui.EmojiStoreDetailUI", localIntent);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15653);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15653);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    AppMethodBeat.i(15652);
    if (paramString.trim().startsWith("weixin://emoticonstore/"))
    {
      int i = paramString.lastIndexOf("/");
      String str = "";
      if (i != -1)
        str = paramString.substring(i + 1);
      paramString = new m(paramString, 29, str);
      AppMethodBeat.o(15652);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(15652);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.EmotionStoreUriSpanHandler
 * JD-Core Version:    0.6.2
 */