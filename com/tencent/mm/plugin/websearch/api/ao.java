package com.tencent.mm.plugin.websearch.api;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;
import com.tencent.xweb.util.d;
import java.util.Iterator;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ao
{
  private String ubb = "";
  private int ubc = 1;
  private long ubd;
  private String ube;
  String ubf;
  String ubg;

  public ao(String paramString1, String paramString2, String paramString3)
  {
    this.ube = paramString1;
    this.ubf = paramString2;
    this.ubg = paramString3;
  }

  private static String afT()
  {
    AppMethodBeat.i(124246);
    String str = com.tencent.mm.loader.j.b.eSk.replace("/data/user/0", "/data/data");
    AppMethodBeat.o(124246);
    return str;
  }

  private com.tencent.mm.vfs.b cVB()
  {
    AppMethodBeat.i(124245);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(aLD(), "config.conf");
    AppMethodBeat.o(124245);
    return localb;
  }

  public final String aLD()
  {
    AppMethodBeat.i(124247);
    Object localObject = new com.tencent.mm.vfs.b(afT(), this.ube);
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    localObject = j.w(((com.tencent.mm.vfs.b)localObject).dMD());
    AppMethodBeat.o(124247);
    return localObject;
  }

  public final int afW()
  {
    AppMethodBeat.i(124242);
    if ((this.ubc <= 1) || (cVB().lastModified() > this.ubd))
      cVA();
    int i = this.ubc;
    AppMethodBeat.o(124242);
    return i;
  }

  public final void cVA()
  {
    AppMethodBeat.i(124244);
    Properties localProperties = aa.k(cVB());
    this.ubc = Integer.valueOf(localProperties.getProperty("version", "1")).intValue();
    this.ubb = localProperties.getProperty("buildjsmd5", "");
    this.ubd = System.currentTimeMillis();
    AppMethodBeat.o(124244);
  }

  public final String cVC()
  {
    AppMethodBeat.i(124248);
    String str = j.w(new com.tencent.mm.vfs.b(aLD(), this.ubf).dMD());
    AppMethodBeat.o(124248);
    return str;
  }

  public final boolean cVD()
  {
    AppMethodBeat.i(124249);
    Object localObject1 = aa.k(cVB()).getProperty("jsmd5");
    boolean bool;
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      AppMethodBeat.o(124249);
      bool = true;
    }
    while (true)
    {
      return bool;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject1);
        for (int i = 0; ; i++)
        {
          if (i >= localJSONArray.length())
            break label208;
          localObject1 = localJSONArray.getJSONObject(i);
          Iterator localIterator = ((JSONObject)localObject1).keys();
          while (true)
            if (localIterator.hasNext())
            {
              String str1 = (String)localIterator.next();
              Object localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              String str2 = d.cz(aLD() + "/dist/" + str1);
              localObject2 = ((JSONObject)localObject1).getString(str1);
              if ((TextUtils.isEmpty(str2)) || (!str2.equals(localObject2)))
              {
                ab.w("MicroMsg.WebSearch.WebSearchTemplate", "isMd5Valid fail, fileName %s, fileMd5 %s, expect md5 %s", new Object[] { str1, str2, localObject2 });
                AppMethodBeat.o(124249);
                bool = false;
                break;
              }
            }
        }
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchTemplate", localJSONException, "", new Object[0]);
        label208: AppMethodBeat.o(124249);
        bool = true;
      }
    }
  }

  public final String cVz()
  {
    AppMethodBeat.i(124243);
    if ((bo.isNullOrNil(this.ubb)) || (cVB().lastModified() > this.ubd))
      cVA();
    String str = this.ubb;
    AppMethodBeat.o(124243);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ao
 * JD-Core Version:    0.6.2
 */