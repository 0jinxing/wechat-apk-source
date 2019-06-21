package com.tencent.mm.app.plugin;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.e.a;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;
import com.tencent.mm.pluginsdk.v;

@URISpanHandlerSet.a
class URISpanHandlerSet$StoryEntranceHandler extends URISpanHandlerSet.BaseUriSpanHandler
{
  URISpanHandlerSet$StoryEntranceHandler(URISpanHandlerSet paramURISpanHandlerSet)
  {
    super(paramURISpanHandlerSet);
  }

  final int[] Cm()
  {
    return new int[] { 48 };
  }

  final boolean a(m paramm, g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(15713);
    String str;
    if (paramm.type == 48)
    {
      str = paramm.username;
      if (TextUtils.isEmpty(str))
        AppMethodBeat.o(15713);
    }
    while (true)
    {
      return bool;
      if (a.Xu(str))
        n.aT(URISpanHandlerSet.a(this.cgy), str);
      if (paramg != null)
        paramg.b(paramm);
      bool = true;
      AppMethodBeat.o(15713);
      continue;
      AppMethodBeat.o(15713);
    }
  }

  final boolean a(String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    return false;
  }

  final m dr(String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.URISpanHandlerSet.StoryEntranceHandler
 * JD-Core Version:    0.6.2
 */