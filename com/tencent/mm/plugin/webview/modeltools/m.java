package com.tencent.mm.plugin.webview.modeltools;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;

public final class m extends j<i>
{
  public static final String[] fnj;
  private final e bSd;

  static
  {
    AppMethodBeat.i(7035);
    fnj = new String[] { j.a(i.ccO, "WebViewHostsFilter") };
    AppMethodBeat.o(7035);
  }

  public m(e parame)
  {
    this(parame, i.ccO, "WebViewHostsFilter");
  }

  private m(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.bSd = parame;
  }

  public final Set<String> cYN()
  {
    AppMethodBeat.i(7034);
    long l = bo.anT();
    ab.d("MicroMsg.WebViewStorage", "webview hijack deleteExpiredItem now = ".concat(String.valueOf(l)));
    ab.i("MicroMsg.WebViewStorage", "delete expired items request  : [%b]", new Object[] { Boolean.valueOf(hY("WebViewHostsFilter", "delete from WebViewHostsFilter where expireTime < ".concat(String.valueOf(l)))) });
    Cursor localCursor = this.bSd.a(getTableName(), new String[] { "host" }, null, null, null, null, null, 2);
    HashSet localHashSet = new HashSet();
    if ((localCursor != null) && (localCursor.moveToFirst()))
      do
      {
        String str = localCursor.getString(0);
        if (!bo.isNullOrNil(str))
        {
          localHashSet.add(str);
          ab.d("MicroMsg.WebViewStorage", "webview hijack gethost = ".concat(String.valueOf(str)));
        }
      }
      while (localCursor.moveToNext());
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(7034);
    return localHashSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.m
 * JD-Core Version:    0.6.2
 */