package com.tencent.mm.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;
import org.json.JSONObject;

public final class c
{
  public String Title;
  public int ctr;
  public int cts;
  public String desc;
  public String eff;
  public String efg;
  public int efh;
  public int showType;
  public String url;

  private static boolean ix(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt == 4)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (paramInt != 1)
      {
        bool2 = bool1;
        if (paramInt != 5)
        {
          bool2 = bool1;
          if (paramInt != 3)
          {
            bool2 = bool1;
            if (paramInt != 8)
              bool2 = false;
          }
        }
      }
    }
  }

  public static c ka(String paramString)
  {
    AppMethodBeat.i(123393);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(123393);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      c localc = new c();
      paramString = br.z(paramString, "e");
      if (paramString == null)
      {
        ab.d("MicroMsg.BroadcastEntity", "this is not errmsg");
        AppMethodBeat.o(123393);
        paramString = null;
      }
      else
      {
        localc.desc = ((String)paramString.get(".e.Content"));
        localc.url = ((String)paramString.get(".e.Url"));
        localc.Title = ((String)paramString.get(".e.Title"));
        localc.cts = bo.getInt((String)paramString.get(".e.Action"), 0);
        localc.showType = bo.getInt((String)paramString.get(".e.ShowType"), 0);
        localc.ctr = bo.getInt((String)paramString.get(".e.DispSec"), 30);
        localc.eff = ((String)paramString.get(".e.Ok"));
        localc.efg = ((String)paramString.get(".e.Cancel"));
        localc.efh = bo.getInt((String)paramString.get("e.Countdown"), 0);
        if (ix(localc.showType))
        {
          AppMethodBeat.o(123393);
          paramString = localc;
        }
        else
        {
          try
          {
            String str = (String)paramString.get(".e");
            JSONObject localJSONObject = new org/json/JSONObject;
            localJSONObject.<init>(str);
            localc.desc = localJSONObject.getString("Content");
            localc.url = localJSONObject.getString("Url");
            localc.Title = localJSONObject.getString("Title");
            localc.cts = bo.getInt(localJSONObject.getString("Action"), 0);
            localc.showType = bo.getInt(localJSONObject.getString("ShowType"), 0);
            localc.ctr = bo.getInt(localJSONObject.getString("DispSec"), 30);
            localc.eff = ((String)paramString.get(".e.Ok"));
            localc.efg = ((String)paramString.get(".e.Cancel"));
            localc.efh = bo.getInt((String)paramString.get("e.Countdown"), 0);
            boolean bool = ix(localc.showType);
            if (bool)
            {
              AppMethodBeat.o(123393);
              paramString = localc;
            }
          }
          catch (Exception paramString)
          {
            ab.printErrStackTrace("MicroMsg.BroadcastEntity", paramString, "", new Object[0]);
            AppMethodBeat.o(123393);
            paramString = null;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.h.c
 * JD-Core Version:    0.6.2
 */