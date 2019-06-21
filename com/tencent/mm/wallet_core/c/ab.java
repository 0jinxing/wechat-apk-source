package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ab
{
  private static ab Agg;
  private int Aga;
  public String Agb;
  public String Agc;
  public String Agd;
  public String Age;
  public Vector<aa> Agf;
  public String TAG;

  public ab()
  {
    AppMethodBeat.i(49095);
    this.TAG = "MicroMsg.WalletDigCertManager";
    this.Aga = 0;
    this.Agb = "";
    this.Agc = "";
    this.Agd = "";
    this.Age = "";
    this.Agf = new Vector();
    AppMethodBeat.o(49095);
  }

  public static void ato(String paramString)
  {
    AppMethodBeat.i(49093);
    g.RQ();
    g.RP().Ry().set(ac.a.xOQ, paramString);
    AppMethodBeat.o(49093);
  }

  public static String dNY()
  {
    AppMethodBeat.i(49094);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xOQ, "");
    AppMethodBeat.o(49094);
    return str;
  }

  public static ab dNZ()
  {
    AppMethodBeat.i(49096);
    if (Agg == null)
      Agg = new ab();
    ab localab = Agg;
    AppMethodBeat.o(49096);
    return localab;
  }

  public final void aT(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49098);
    Object localObject = paramJSONObject.optJSONObject("cert_info");
    if (localObject == null)
      AppMethodBeat.o(49098);
    while (true)
    {
      return;
      this.Agf = new Vector();
      int i = ((JSONObject)localObject).optInt("show_crt_info");
      this.Aga = ((JSONObject)localObject).optInt("is_crt_install");
      this.Age = ((JSONObject)localObject).optString("crt_item_logo_url");
      this.Agb = ((JSONObject)localObject).optString("crt_entry_desc");
      this.Agc = ((JSONObject)localObject).optString("crt_entry_title");
      this.Agd = ((JSONObject)localObject).optString("crt_status_name");
      g.RQ();
      g.RP().Ry().set(ac.a.xOR, Integer.valueOf(i));
      paramJSONObject = dNY();
      localObject = ((JSONObject)localObject).optJSONArray("crt_list");
      if (localObject != null)
      {
        i = 0;
        while (true)
          if (i < ((JSONArray)localObject).length())
            try
            {
              aa localaa = new com/tencent/mm/wallet_core/c/aa;
              localaa.<init>(((JSONArray)localObject).getJSONObject(i));
              if (localaa.AfZ != 0)
              {
                if (bo.isNullOrNil(paramJSONObject))
                  com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "drop crt list no exist local drop: %s", new Object[] { localaa.xfz });
                while (true)
                {
                  i++;
                  break;
                  if (!localaa.xfz.equals(paramJSONObject))
                    break label243;
                  this.Agf.add(localaa);
                }
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "WalletDigCertManager error %s", new Object[] { localException.getMessage() });
                continue;
                label243: com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "drop crt list %s drop: %s", new Object[] { paramJSONObject, localException.xfz });
                continue;
                this.Agf.add(localException);
              }
            }
      }
      AppMethodBeat.o(49098);
    }
  }

  public final void atp(String paramString)
  {
    AppMethodBeat.i(49099);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49099);
    while (true)
    {
      return;
      if (paramString.equals(dNY()))
      {
        this.Aga = 0;
        ato("");
        com.tencent.mm.sdk.platformtools.ab.i(this.TAG, "clean token %s  stack %s ", new Object[] { paramString, bo.dpG().toString() });
        b.dNJ();
        b.clearCert(paramString);
      }
      paramString = this.Agf.iterator();
      if (paramString.hasNext())
      {
        paramString = (aa)paramString.next();
        this.Agf.remove(paramString);
        AppMethodBeat.o(49099);
      }
      else
      {
        AppMethodBeat.o(49099);
      }
    }
  }

  public final boolean dOa()
  {
    boolean bool = false;
    AppMethodBeat.i(49097);
    if (!bo.isNullOrNil(dNY()))
      if (this.Aga > 0)
      {
        bool = true;
        AppMethodBeat.o(49097);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(49097);
      continue;
      AppMethodBeat.o(49097);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.ab
 * JD-Core Version:    0.6.2
 */