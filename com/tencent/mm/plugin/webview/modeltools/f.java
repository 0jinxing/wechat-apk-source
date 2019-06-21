package com.tencent.mm.plugin.webview.modeltools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.protocal.protobuf.bzz;
import com.tencent.mm.protocal.protobuf.caa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class f
{
  private static String hlm = null;
  private static String uoL = null;
  private static com.tencent.mm.bt.b uoM = null;

  public static void U(Bundle paramBundle)
  {
    AppMethodBeat.i(6954);
    if (paramBundle == null)
      AppMethodBeat.o(6954);
    while (true)
    {
      return;
      if (hlm != null)
        paramBundle.putString("searchId", hlm);
      if (uoM != null)
        paramBundle.putString("extQueryInfo", uoM.dlY());
      AppMethodBeat.o(6954);
    }
  }

  public static boolean V(Bundle paramBundle)
  {
    AppMethodBeat.i(6955);
    String str1 = paramBundle.getString("query");
    String str2 = paramBundle.getString("searchId");
    String str3 = paramBundle.getString("extQueryInfo");
    if (bo.isNullOrNil(str1))
      AppMethodBeat.o(6955);
    while (true)
    {
      return false;
      String str4 = e.mCM;
      HashMap localHashMap = new HashMap();
      paramBundle = null;
      if (str2 != null)
      {
        paramBundle = "18:" + str2 + ":" + str1 + ":";
        localHashMap.put("parentSearchID", paramBundle);
      }
      if (paramBundle != null)
        v.Zp().y(paramBundle, true).j("extQueryInfo", str3);
      localHashMap.put("clickType", "18");
      ((j)g.K(j.class)).a(ah.getContext(), 17, str1, str4, localHashMap);
      AppMethodBeat.o(6955);
    }
  }

  public static Bundle a(Bundle paramBundle, String paramString1, String paramString2)
  {
    AppMethodBeat.i(6953);
    uoL = null;
    hlm = null;
    uoM = null;
    try
    {
      Object localObject = new com/tencent/mm/protocal/protobuf/bzz;
      ((bzz)localObject).<init>();
      ((bzz)localObject).wYV = paramBundle.getString("PickedWord");
      ((bzz)localObject).wYW = paramBundle.getString("PrefixText");
      ((bzz)localObject).wYX = paramBundle.getString("SuffixText");
      ((bzz)localObject).Scene = paramBundle.getInt("Scene");
      ((bzz)localObject).wYY = paramBundle.getInt("MainIndex", -1);
      ((bzz)localObject).Url = paramString1;
      ((bzz)localObject).Title = paramString2;
      ((bzz)localObject).wYZ = paramBundle.getString("SubPickedWord");
      ((bzz)localObject).wZa = paramBundle.getString("SubPrefixText");
      ((bzz)localObject).wZb = paramBundle.getString("SubSuffixText");
      ((bzz)localObject).wZc = paramBundle.getInt("SubIndex", -1);
      ((bzz)localObject).wZd = paramBundle.getInt("TagNewLineBefore", -1);
      ((bzz)localObject).wZe = paramBundle.getInt("TagNewLineAfter", -1);
      ((bzz)localObject).wZf = paramBundle.getInt("TagNewLineBeforeSub", -1);
      ((bzz)localObject).wZg = paramBundle.getInt("TagNewLineAfterSub", -1);
      ab.i("MicroMsg.SmartPickWordHelper", "req: PrefixText: %s, PickedWord: %s, SuffixText: %s", new Object[] { ((bzz)localObject).wYW, ((bzz)localObject).wYV, ((bzz)localObject).wYX });
      paramString1 = new com/tencent/mm/ai/b$a;
      paramString1.<init>();
      paramString1.fsJ = ((a)localObject);
      paramBundle = new com/tencent/mm/protocal/protobuf/caa;
      paramBundle.<init>();
      paramString1.fsK = paramBundle;
      paramString1.uri = "/cgi-bin/mmsearch-bin/searchsmartpickword";
      paramString1.fsI = 2974;
      paramString1.fsL = 0;
      paramString1.fsM = 0;
      paramString2 = new java/util/concurrent/CountDownLatch;
      paramString2.<init>(1);
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
      paramString1 = paramString1.acD();
      localObject = new com/tencent/mm/plugin/webview/modeltools/f$1;
      ((f.1)localObject).<init>(paramString2, paramBundle);
      com.tencent.mm.ipcinvoker.wx_extension.b.a(paramString1, (com.tencent.mm.ipcinvoker.wx_extension.b.a)localObject);
      try
      {
        paramString2.await(1000L, TimeUnit.MILLISECONDS);
        ab.i("MicroMsg.SmartPickWordHelper", "smartPickWord end");
        AppMethodBeat.o(6953);
        return paramBundle;
      }
      catch (InterruptedException paramString1)
      {
        while (true)
        {
          ab.w("MicroMsg.SmartPickWordHelper", paramString1.getMessage());
          ab.printErrStackTrace("MicroMsg.SmartPickWordHelper", paramString1, "", new Object[0]);
        }
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.e("MicroMsg.SmartPickWordHelper", "smartPickWord url failed");
        AppMethodBeat.o(6953);
        paramBundle = null;
      }
    }
  }

  public static void aeU(String paramString)
  {
    AppMethodBeat.i(6958);
    String str = "";
    try
    {
      paramString = URLEncoder.encode(bo.nullAsNil(paramString), "UTF-8");
      h.pYm.e(13742, new Object[] { Integer.valueOf(1), paramString, "", "", Integer.valueOf(4), hlm });
      AppMethodBeat.o(6958);
      return;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SmartPickWordHelper", paramString, "", new Object[0]);
        paramString = str;
      }
    }
  }

  public static void hc(String paramString1, String paramString2)
  {
    int i = 1;
    AppMethodBeat.i(6956);
    int j;
    if ((!bo.isNullOrNil(uoL)) && (!bo.isEqual(paramString1, uoL)))
      j = 1;
    while (true)
    {
      Object localObject = "";
      String str1 = "";
      String str2 = "";
      String str3 = str1;
      try
      {
        paramString2 = URLEncoder.encode(bo.nullAsNil(paramString2), "UTF-8");
        str3 = str1;
        localObject = paramString2;
        paramString1 = URLEncoder.encode(bo.nullAsNil(paramString1), "UTF-8");
        str3 = paramString1;
        localObject = paramString2;
        str1 = URLEncoder.encode(bo.nullAsNil(uoL), "UTF-8");
        localObject = str1;
        str3 = paramString1;
        paramString1 = (String)localObject;
        localObject = h.pYm;
        if (j != 0)
        {
          j = i;
          ((h)localObject).e(13742, new Object[] { Integer.valueOf(2), paramString2, paramString1, str3, Integer.valueOf(j), hlm });
          AppMethodBeat.o(6956);
          return;
          j = 0;
        }
      }
      catch (UnsupportedEncodingException paramString1)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SmartPickWordHelper", paramString1, "", new Object[0]);
          paramString1 = str2;
          paramString2 = (String)localObject;
          continue;
          j = 0;
        }
      }
    }
  }

  public static void p(String paramString, Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(6957);
    if (paramBundle != null);
    for (boolean bool = paramBundle.getBoolean("IsCursorMove", false); ; bool = false)
    {
      paramBundle = "";
      try
      {
        paramString = URLEncoder.encode(bo.nullAsNil(paramString), "UTF-8");
        paramBundle = h.pYm;
        if (bool)
          i = 3;
        paramBundle.e(13742, new Object[] { Integer.valueOf(1), paramString, "", "", Integer.valueOf(i), "", hlm });
        AppMethodBeat.o(6957);
        return;
      }
      catch (UnsupportedEncodingException paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SmartPickWordHelper", paramString, "", new Object[0]);
          paramString = paramBundle;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.f
 * JD-Core Version:    0.6.2
 */