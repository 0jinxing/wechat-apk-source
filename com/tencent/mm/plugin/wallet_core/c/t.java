package com.tencent.mm.plugin.wallet_core.c;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.tenpay.model.m;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t extends m
{
  public String kaE;
  public String mTimeStamp;
  public String pNL;
  public List<ElementQuery> tum;
  public ElementQuery tun;
  private int tuo;
  private int tup;
  private int tuq;
  public Profession[] tur;
  public int tus;
  public String[] tut;

  public t()
  {
    this(null, null, null, null, -1, -1, (byte)0);
  }

  public t(String paramString1, String paramString2, PayInfo paramPayInfo)
  {
    this(paramString1, paramString2, paramPayInfo, null, -1, -1, (byte)0);
  }

  public t(String paramString1, String paramString2, PayInfo paramPayInfo, int paramInt)
  {
    this(paramString1, paramString2, paramPayInfo, null, -1, paramInt, (byte)0);
  }

  public t(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2)
  {
    this(paramString1, paramString2, paramPayInfo, paramString3, paramInt1, paramInt2, (byte)0);
  }

  private t(String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, int paramInt1, int paramInt2, byte paramByte)
  {
    AppMethodBeat.i(46538);
    this.tum = null;
    this.tun = null;
    this.mTimeStamp = null;
    this.kaE = null;
    this.pNL = null;
    this.tuo = 3;
    this.tur = null;
    this.tut = null;
    this.kaE = paramString2;
    this.tuo = 3;
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    a(paramPayInfo, localHashMap1, localHashMap2);
    localHashMap1.put("req_key", paramString1);
    localHashMap1.put("flag", "4");
    localHashMap1.put("card_id", paramString2);
    if (paramInt2 > 0)
    {
      localHashMap1.put("realname_scene", String.valueOf(paramInt2));
      ab.i("MicroMsg.NetSenceTenPayBase", "realname_scene=%d", new Object[] { Integer.valueOf(paramInt2) });
    }
    if (paramInt1 == 8)
      localHashMap1.put("scene", "1003");
    localHashMap1.put("bank_card_tag", "3");
    localHashMap1.put("token", paramString3);
    M(localHashMap1);
    if (x.dNS())
    {
      localHashMap2.put("uuid_for_bindcard", x.dNU());
      localHashMap2.put("bindcard_scene", x.dNT());
    }
    ba(localHashMap2);
    AppMethodBeat.o(46538);
  }

  public final int ZU()
  {
    return 1505;
  }

  public final void a(int paramInt, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46539);
    this.tum = new ArrayList();
    label685: label1099: 
    while (true)
    {
      Object localObject1;
      int i;
      JSONObject localJSONObject;
      ElementQuery localElementQuery;
      Object localObject2;
      try
      {
        this.mTimeStamp = paramJSONObject.optString("time_stamp");
        paramString = paramJSONObject.optString("bank_type");
        if (bo.isNullOrNil(this.pNL))
          break label1099;
        paramString = this.pNL;
        localObject1 = paramJSONObject.getJSONArray("Array");
        i = ((JSONArray)localObject1).length();
        paramInt = 0;
        if (paramInt >= i)
          break label755;
        localJSONObject = ((JSONArray)localObject1).getJSONObject(paramInt);
        localElementQuery = new com/tencent/mm/plugin/wallet_core/model/ElementQuery;
        localElementQuery.<init>();
        localElementQuery.fvc = localJSONObject;
        localElementQuery.nuL = localJSONObject.optString("bank_name");
        localElementQuery.pbn = localJSONObject.optString("bank_type");
        localElementQuery.tyF = localJSONObject.optString("bankacc_type_name");
        localElementQuery.tyH = localJSONObject.optString("bank_phone");
        localElementQuery.tyK = localJSONObject.optString("forbid_word");
        localElementQuery.tyJ = localJSONObject.optString("bank_recommend_desc");
        localElementQuery.tyI = localJSONObject.optString("bank_app_user_name");
        localElementQuery.tyE = localJSONObject.optInt("bankacc_type", 1);
        localElementQuery.tyw = e.n(localJSONObject, "canModifyName");
        localElementQuery.tyx = e.n(localJSONObject, "canModifyCreID");
        localElementQuery.tyC = "0".equals(localJSONObject.optString("is_sure"));
        localElementQuery.tyy = "1".equals(localJSONObject.optString("needCVV"));
        localElementQuery.tyz = "1".equals(localJSONObject.optString("needValiDate"));
        localElementQuery.tyv = localJSONObject.optString("time_stamp");
        localElementQuery.tyB = localJSONObject.optString("uesr_name");
        localElementQuery.tyG = localJSONObject.optString("bank_flag");
        localElementQuery.tyL = e.n(localJSONObject, "needFirstName");
        localElementQuery.tyM = e.n(localJSONObject, "needLastName");
        localElementQuery.tyN = e.n(localJSONObject, "needCountry");
        localElementQuery.tyO = e.n(localJSONObject, "needArea");
        localElementQuery.tyP = e.n(localJSONObject, "needCity");
        localElementQuery.tyQ = e.n(localJSONObject, "needAddress");
        localElementQuery.tyR = e.n(localJSONObject, "needZip");
        localElementQuery.tyS = e.n(localJSONObject, "needPhone");
        localElementQuery.tyT = e.n(localJSONObject, "needEmail");
        localElementQuery.tyW = e.n(localJSONObject, "needShowProtocol");
        localElementQuery.tyU = localJSONObject.optString("support_cre_type");
        localElementQuery.tyA = localJSONObject.optString("cre_id");
        localElementQuery.tuo = localJSONObject.optInt("bank_card_tag", 1);
        if (localElementQuery.tuo != 1)
          break label685;
        if (!e.n(localJSONObject, "IsSaveYfq"))
        {
          localElementQuery.tyD = 0;
          localObject2 = localJSONObject.optString("support_micropay");
          if (!TextUtils.isEmpty((CharSequence)localObject2))
            break label715;
          localElementQuery.tza = true;
          localElementQuery.twk = localJSONObject.optString("arrive_type");
          localElementQuery.tyX = localJSONObject.optString("pre_auth_word");
          localElementQuery.tyY = localJSONObject.optInt("support_foreign_mobile", 0);
          localElementQuery.tyZ = ElementQuery.ax(localJSONObject);
          if (Bankcard.gh(this.tuo, localElementQuery.tuo))
            this.tum.add(localElementQuery);
          if ((paramString != null) && (paramString.equals(localElementQuery.pbn)))
            this.tun = localElementQuery;
          paramInt++;
          continue;
        }
        if (e.n(localJSONObject, "canReturnYfq"))
        {
          localElementQuery.tyD = 4;
          continue;
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.NetSenceTenPayBase", paramString, "", new Object[0]);
        AppMethodBeat.o(46539);
        return;
      }
      localElementQuery.tyD = 3;
      continue;
      if (localJSONObject.optInt("auth_mode") == 1)
      {
        localElementQuery.tyD = 1;
      }
      else
      {
        localElementQuery.tyD = 2;
        continue;
        label715: if ("1".equals(localObject2))
        {
          localElementQuery.tza = true;
        }
        else if ("0".equals(localObject2))
        {
          localElementQuery.tza = false;
          continue;
          label755: paramString = new android/util/SparseArray;
          paramString.<init>();
          localObject1 = paramJSONObject.getJSONArray("cre_type_map");
          i = ((JSONArray)localObject1).length();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = ((JSONArray)localObject1).getJSONObject(paramInt);
            int j = ((JSONObject)localObject2).optInt("key", 0);
            if (j > 0)
              paramString.put(j, ((JSONObject)localObject2).getString("val"));
          }
          localObject2 = r.cPQ();
          localObject1 = this.tum;
          ((com.tencent.mm.plugin.wallet_core.model.t)localObject2).tCm = paramString;
          ((com.tencent.mm.plugin.wallet_core.model.t)localObject2).tum = ((List)localObject1);
          this.tup = paramJSONObject.optInt("need_area");
          this.tuq = paramJSONObject.optInt("need_profession");
          if ((this.tun != null) && (this.tun.tuo != 1))
          {
            ab.i("MicroMsg.NetSenceTenPayBase", "oversea card, no need area and profession");
            this.tup = 0;
            this.tuq = 0;
          }
          localObject1 = paramJSONObject.optJSONArray("profession_array");
          if (localObject1 != null)
          {
            this.tur = new Profession[((JSONArray)localObject1).length()];
            paramInt = 0;
            if (paramInt < ((JSONArray)localObject1).length())
            {
              localObject2 = ((JSONArray)localObject1).optJSONObject(paramInt);
              if (localObject2 != null)
              {
                paramString = ((JSONObject)localObject2).optString("profession_name");
                i = ((JSONObject)localObject2).optInt("profession_type");
                if (bo.isNullOrNil(paramString))
                  break label1016;
                localObject2 = new com/tencent/mm/plugin/wallet_core/id_verify/model/Profession;
                ((Profession)localObject2).<init>(paramString, i);
                this.tur[paramInt] = localObject2;
              }
              while (true)
              {
                paramInt++;
                break;
                label1016: ab.i("MicroMsg.NetSenceTenPayBase", "empty profession_name!");
              }
            }
          }
          this.tus = paramJSONObject.optInt("need_nationality", 0);
          paramJSONObject = paramJSONObject.optJSONArray("nationality_exclude_array");
          if (paramJSONObject != null)
          {
            this.tut = new String[paramJSONObject.length()];
            for (paramInt = 0; paramInt < paramJSONObject.length(); paramInt++)
            {
              paramString = paramJSONObject.optString(paramInt);
              this.tut[paramInt] = paramString;
            }
          }
          AppMethodBeat.o(46539);
        }
      }
    }
  }

  public final int bgI()
  {
    return 73;
  }

  public final boolean cOU()
  {
    boolean bool = true;
    if (this.tup == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final boolean cOV()
  {
    boolean bool = true;
    if (this.tuq == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public final String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.t
 * JD-Core Version:    0.6.2
 */