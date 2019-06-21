package com.tencent.mm.plugin.webview.model;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ah
{
  private static final Set<String> ums;

  static
  {
    AppMethodBeat.i(6696);
    Object localObject = new HashSet();
    ums = (Set)localObject;
    ((Set)localObject).add("file:///android_asset/");
    localObject = e.eSk;
    if (!bo.isNullOrNil((String)localObject))
      localObject = e.eSk.replace("/data/user/0", "/data/data");
    while (true)
    {
      File localFile1 = new File(aa.Ia(0));
      ums.add("file://" + localFile1.getAbsolutePath());
      ums.add("file://" + ((n)g.K(n.class)).cUN());
      File localFile2 = new File(e.eSn, aa.HY(0));
      ums.add("file://" + localFile2.getAbsolutePath());
      File localFile3 = new File((String)localObject, "wenote/res");
      ums.add("file://" + localFile3.getAbsolutePath());
      localFile3 = new File(e.eSn, "wenote/res");
      ums.add("file://" + localFile3.getAbsolutePath());
      ab.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { localFile1.getAbsolutePath(), localFile2.getAbsolutePath() });
      localObject = new File((String)localObject, "emoji/res");
      ums.add("file://" + ((File)localObject).getAbsolutePath());
      localFile1 = new File(e.eSn, "emoji/res");
      ums.add("file://" + localFile1.getAbsolutePath());
      ab.i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject).getAbsolutePath(), localFile1.getAbsolutePath() });
      localObject = ums.iterator();
      while (((Iterator)localObject).hasNext())
        ab.i("MicroMsg.URLFilter", "WebViewUI white list path : %s", new Object[] { (String)((Iterator)localObject).next() });
      AppMethodBeat.o(6696);
      return;
    }
  }

  public static boolean aes(String paramString)
  {
    AppMethodBeat.i(6695);
    boolean bool;
    if (ae.giw)
    {
      ab.w("MicroMsg.URLFilter", "skipLoadUrlCheck");
      AppMethodBeat.o(6695);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(6695);
        bool = true;
      }
      else
      {
        String str = paramString.toLowerCase();
        if (str.startsWith("about:blank"))
        {
          AppMethodBeat.o(6695);
          bool = false;
        }
        else if (!str.startsWith("file://"))
        {
          paramString = Uri.parse(str);
          if (bo.isNullOrNil(paramString.getHost()))
          {
            AppMethodBeat.o(6695);
            bool = true;
          }
          else if (!paramString.getHost().contains(u.bOO()))
          {
            AppMethodBeat.o(6695);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(6695);
            bool = false;
          }
        }
        else
        {
          paramString = ums.iterator();
          while (true)
            if (paramString.hasNext())
              if (str.startsWith((String)paramString.next()))
              {
                AppMethodBeat.o(6695);
                bool = true;
                break;
              }
          AppMethodBeat.o(6695);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ah
 * JD-Core Version:    0.6.2
 */