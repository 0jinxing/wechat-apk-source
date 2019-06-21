package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
{
  private static final HashSet<String> uzp;

  static
  {
    AppMethodBeat.i(8207);
    HashSet localHashSet = new HashSet();
    uzp = localHashSet;
    localHashSet.add("title");
    uzp.add("webpageTitle");
    uzp.add("srcUsername");
    uzp.add("srcDisplayname");
    uzp.add("mode");
    uzp.add("KTemplateId");
    uzp.add("KPublisherId");
    AppMethodBeat.o(8207);
  }

  public static void a(Intent paramIntent, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(8205);
    if (paramJSONObject == null)
      AppMethodBeat.o(8205);
    while (true)
    {
      return;
      Iterator localIterator = paramJSONObject.keys();
      if (localIterator == null)
      {
        AppMethodBeat.o(8205);
      }
      else
      {
        Bundle localBundle = new Bundle();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          try
          {
            k.a.a(localBundle, str, paramJSONObject.getJSONObject(str));
          }
          catch (JSONException localJSONException)
          {
          }
        }
        paramIntent.putExtras(localBundle);
        AppMethodBeat.o(8205);
      }
    }
  }

  public static Bundle aC(Intent paramIntent)
  {
    AppMethodBeat.i(8206);
    Bundle localBundle = paramIntent.getExtras();
    paramIntent = new Bundle();
    if (localBundle == null)
      AppMethodBeat.o(8206);
    while (true)
    {
      return paramIntent;
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (uzp.contains(str))
        {
          Object localObject = localBundle.get(str);
          if ((localObject instanceof String))
            paramIntent.putString(str, (String)localObject);
          else if ((localObject instanceof Integer))
            paramIntent.putInt(str, ((Integer)localObject).intValue());
          else if ((localObject instanceof Long))
            paramIntent.putLong(str, ((Long)localObject).longValue());
          else if ((localObject instanceof Boolean))
            paramIntent.putBoolean(str, ((Boolean)localObject).booleanValue());
          else
            ab.w("MicroMsg.WebViewBagIntentLogic", "put not support type; key:%s", new Object[] { str });
        }
      }
      AppMethodBeat.o(8206);
    }
  }

  public static JSONObject ae(Bundle paramBundle)
  {
    AppMethodBeat.i(8204);
    JSONObject localJSONObject = new JSONObject();
    if (paramBundle == null)
      AppMethodBeat.o(8204);
    while (true)
    {
      return localJSONObject;
      try
      {
        Iterator localIterator = paramBundle.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          k.a locala = new com/tencent/mm/plugin/webview/ui/tools/bag/k$a;
          locala.<init>(paramBundle.get(str));
          localJSONObject.put(str, locala);
        }
      }
      catch (JSONException paramBundle)
      {
        ab.e("MicroMsg.WebViewBagIntentLogic", "save exp:%s", new Object[] { paramBundle });
        AppMethodBeat.o(8204);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.k
 * JD-Core Version:    0.6.2
 */