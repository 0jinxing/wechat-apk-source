package com.tencent.mm.plugin.game.luggage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.luggage.d.k;
import com.tencent.luggage.webview.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static HashMap<String, d.a> ezU;
  private static HashMap<String, k> mTT;
  private static LinkedList<String> mTU;

  static
  {
    AppMethodBeat.i(135839);
    mTT = new HashMap();
    ezU = new HashMap();
    mTU = new LinkedList();
    AppMethodBeat.o(135839);
  }

  public static k NO(String paramString)
  {
    AppMethodBeat.i(135837);
    paramString = (k)mTT.get(paramString);
    AppMethodBeat.o(135837);
    return paramString;
  }

  public static void a(Class<? extends a> paramClass, String paramString, d.a parama)
  {
    AppMethodBeat.i(135835);
    if (!ah.doF())
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("action_id", 1);
      localBundle.putString("preload_url", paramString);
      localBundle.putSerializable("webcore_impl_class", paramClass);
      ToolsProcessIPCService.a(localBundle, d.b.class, new d.1(parama));
      AppMethodBeat.o(135835);
    }
    while (true)
    {
      return;
      if (mTU.contains(paramString))
      {
        ab.i("MicroMsg.PreloadGameWebCoreHelp", "preload ing, return");
        parama.wM();
        AppMethodBeat.o(135835);
      }
      else
      {
        mTU.add(paramString);
        l.q(new d.2(paramClass, paramString, parama));
        AppMethodBeat.o(135835);
      }
    }
  }

  public static k aq(Context paramContext, String paramString)
  {
    AppMethodBeat.i(135836);
    paramString = (k)mTT.remove(paramString);
    if (paramString != null)
      paramString.setContext(paramContext);
    AppMethodBeat.o(135836);
    return paramString;
  }

  public static void destroy()
  {
    AppMethodBeat.i(135838);
    Object localObject;
    if (ah.doF())
    {
      localObject = mTT.values().iterator();
      while (((Iterator)localObject).hasNext())
        ((k)((Iterator)localObject).next()).destroy();
      mTT.clear();
      AppMethodBeat.o(135838);
    }
    while (true)
    {
      return;
      localObject = new Bundle();
      ((Bundle)localObject).putInt("action_id", 2);
      ToolsProcessIPCService.a((Parcelable)localObject, d.b.class, null);
      AppMethodBeat.o(135838);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d
 * JD-Core Version:    0.6.2
 */