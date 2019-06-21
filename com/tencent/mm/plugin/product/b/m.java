package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.c.a;
import com.tencent.mm.plugin.product.c.c;
import com.tencent.mm.plugin.product.c.e;
import com.tencent.mm.plugin.product.c.f;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.j;
import com.tencent.mm.plugin.product.c.k;
import com.tencent.mm.plugin.product.c.l;
import com.tencent.mm.plugin.product.c.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
{
  public String pho;
  public int php;
  public int phq;
  public int phr;
  public c phs;
  public n pht;
  public LinkedList<l> phu;
  public f phv;
  public String phw;
  public String phx;
  public String phy;
  public int status;

  public m()
  {
    AppMethodBeat.i(44003);
    this.phq = 2147483647;
    this.phr = 2147483647;
    this.status = 6;
    this.phu = new LinkedList();
    AppMethodBeat.o(44003);
  }

  public static m a(m paramm, String paramString)
  {
    AppMethodBeat.i(44004);
    if (paramm == null)
      paramm = new m();
    while (true)
    {
      JSONObject localJSONObject1;
      Object localObject2;
      int i;
      int j;
      try
      {
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>(paramString);
        paramm.pho = localJSONObject1.getString("product_id");
        paramm.php = localJSONObject1.getInt("product_type");
        paramm.phq = localJSONObject1.optInt("quantity", 2147483647);
        paramm.phr = localJSONObject1.optInt("left_buy_quantity", 2147483647);
        paramm.status = localJSONObject1.optInt("status", 6);
        localObject1 = localJSONObject1.optJSONObject("ext_attr");
        if (localObject1 != null)
        {
          paramString = new com/tencent/mm/plugin/product/c/f;
          paramString.<init>();
          paramm.phv = paramString;
          paramString = ((JSONObject)localObject1).optJSONObject("product_ext");
          if (paramString != null)
          {
            localObject1 = paramm.phv;
            localObject2 = new com/tencent/mm/plugin/product/c/j;
            ((j)localObject2).<init>();
            ((j)localObject2).bJt = paramString.getInt("flag");
            ((f)localObject1).phQ = ((j)localObject2);
          }
        }
        else
        {
          paramString = localJSONObject1.optJSONObject("base_attr");
          if (paramString == null)
            break label895;
          localObject1 = new com/tencent/mm/plugin/product/c/c;
          ((c)localObject1).<init>();
          paramm.phs = ((c)localObject1);
          paramm.phs.name = paramString.getString("name");
          paramm.phs.phD = paramString.getInt("ori_price");
          paramm.phs.phE = paramString.getInt("up_price");
          paramm.phs.phF = paramString.getInt("low_price");
          localObject2 = paramm.phs;
          localObject1 = new java/util/LinkedList;
          ((LinkedList)localObject1).<init>();
          ((c)localObject2).phG = ((LinkedList)localObject1);
          localObject2 = paramString.getJSONArray("img_info");
          i = ((JSONArray)localObject2).length();
          j = 0;
          if (j >= i)
            break label339;
          localObject1 = ((JSONArray)localObject2).getString(j);
          if (!bo.isNullOrNil((String)localObject1))
            paramm.phs.phG.add(localObject1);
          j++;
          continue;
        }
        paramm.phv.phR = localJSONObject1.optString("ext_attr");
        continue;
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ProductInfo", paramString, "", new Object[0]);
        AppMethodBeat.o(44004);
        return paramm;
      }
      label339: paramm.phs.fjz = paramString.getString("digest");
      paramm.phs.pcl = paramString.getString("fee_type");
      paramm.phs.detail = paramString.getString("detail");
      Object localObject3 = paramString.optJSONObject("share_info");
      if (localObject3 != null)
      {
        localObject2 = paramm.phs;
        localObject1 = new com/tencent/mm/plugin/product/c/k;
        ((k)localObject1).<init>();
        ((c)localObject2).phO = ((k)localObject1);
        paramm.phs.phO.kKZ = ((JSONObject)localObject3).optString("icon_url");
        paramm.phs.phO.url = ((JSONObject)localObject3).optString("url");
      }
      Object localObject1 = paramString.optJSONArray("sku_table");
      int k;
      Object localObject4;
      int m;
      if (localObject1 != null)
      {
        localObject3 = paramm.phs;
        localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        ((c)localObject3).phM = ((LinkedList)localObject2);
        k = ((JSONArray)localObject1).length();
        for (j = 0; j < k; j++)
        {
          localObject4 = ((JSONArray)localObject1).getJSONObject(j);
          localObject2 = new com/tencent/mm/plugin/product/c/m;
          ((com.tencent.mm.plugin.product.c.m)localObject2).<init>();
          ((com.tencent.mm.plugin.product.c.m)localObject2).phX = ((JSONObject)localObject4).getString("id");
          ((com.tencent.mm.plugin.product.c.m)localObject2).phY = ((JSONObject)localObject4).getString("name");
          localObject3 = new java/util/LinkedList;
          ((LinkedList)localObject3).<init>();
          ((com.tencent.mm.plugin.product.c.m)localObject2).phZ = ((LinkedList)localObject3);
          localObject3 = ((JSONObject)localObject4).getJSONArray("value_list");
          m = ((JSONArray)localObject3).length();
          for (i = 0; i < m; i++)
          {
            JSONObject localJSONObject2 = ((JSONArray)localObject3).getJSONObject(i);
            localObject4 = new com/tencent/mm/plugin/product/c/h;
            ((h)localObject4).<init>();
            ((h)localObject4).id = localJSONObject2.getString("id");
            ((h)localObject4).name = localJSONObject2.getString("name");
            ((h)localObject4).phS = true;
            ((com.tencent.mm.plugin.product.c.m)localObject2).phZ.add(localObject4);
          }
          paramm.phs.phM.add(localObject2);
        }
      }
      paramString = paramString.optJSONArray("actiongroup_attr");
      if (paramString != null)
      {
        localObject1 = paramm.phs;
        localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        ((c)localObject1).phN = ((LinkedList)localObject2);
        k = paramString.length();
        for (j = 0; j < k; j++)
        {
          localObject2 = paramString.getJSONObject(j);
          localObject1 = new com/tencent/mm/plugin/product/c/a;
          ((a)localObject1).<init>();
          ((a)localObject1).Name = ((JSONObject)localObject2).getString("name");
          ((a)localObject1).jCt = 0;
          if (!bo.isNullOrNil(((a)localObject1).Name))
            paramm.phs.phN.add(localObject1);
          localObject2 = ((JSONObject)localObject2).getJSONArray("action_list");
          m = ((JSONArray)localObject2).length();
          for (i = 0; i < m; i++)
          {
            localObject1 = ((JSONArray)localObject2).getJSONObject(i);
            localObject3 = new com/tencent/mm/plugin/product/c/a;
            ((a)localObject3).<init>();
            ((a)localObject3).Name = ((JSONObject)localObject1).getString("name");
            ((a)localObject3).phA = ((JSONObject)localObject1).getString("tips");
            ((a)localObject3).jCt = ((JSONObject)localObject1).getInt("type");
            ((a)localObject3).ncM = ((JSONObject)localObject1).getString("content");
            ((a)localObject3).IconUrl = ((JSONObject)localObject1).getString("icon_url");
            paramm.phs.phN.add(localObject3);
          }
        }
      }
      label895: paramString = localJSONObject1.optJSONArray("available_sku_list");
      if (paramString != null)
      {
        k = paramString.length();
        localObject1 = new java/util/LinkedList;
        ((LinkedList)localObject1).<init>();
        paramm.phu = ((LinkedList)localObject1);
        for (j = 0; j < k; j++)
        {
          localObject2 = paramString.getJSONObject(j);
          localObject1 = new com/tencent/mm/plugin/product/c/l;
          ((l)localObject1).<init>();
          ((l)localObject1).phU = ((JSONObject)localObject2).getString("id_info");
          ((l)localObject1).phV = ((JSONObject)localObject2).getInt("price");
          ((l)localObject1).phq = ((JSONObject)localObject2).getInt("quantity");
          ((l)localObject1).url = ((JSONObject)localObject2).getString("icon_url");
          localObject2 = ((JSONObject)localObject2).getJSONArray("express_fee");
          m = ((JSONArray)localObject2).length();
          localObject3 = new java/util/LinkedList;
          ((LinkedList)localObject3).<init>();
          ((l)localObject1).phW = ((LinkedList)localObject3);
          for (i = 0; i < m; i++)
          {
            localObject4 = ((JSONArray)localObject2).getJSONObject(i);
            localObject3 = new com/tencent/mm/plugin/product/c/e;
            ((e)localObject3).<init>();
            ((e)localObject3).id = ((JSONObject)localObject4).getInt("id");
            ((e)localObject3).name = ((JSONObject)localObject4).getString("name");
            ((e)localObject3).value = ((JSONObject)localObject4).getInt("price");
            ((l)localObject1).phW.add(localObject3);
          }
          paramm.phu.add(localObject1);
        }
      }
      paramString = localJSONObject1.optJSONObject("seller_attr");
      if (paramString != null)
      {
        localObject1 = new com/tencent/mm/plugin/product/c/n;
        ((n)localObject1).<init>();
        paramm.pht = ((n)localObject1);
        paramm.pht.csB = paramString.getString("appid");
        paramm.pht.name = paramString.getString("name");
        paramm.pht.username = paramString.getString("username");
        paramm.pht.pia = paramString.optString("logo");
        paramm.pht.bJt = paramString.optInt("flag", 0);
      }
      paramString = localJSONObject1.optJSONObject("oss_info");
      if (paramString != null)
      {
        paramm.phx = paramString.optString("self_buy_button_word");
        paramm.phy = paramString.optString("product_mixed_h5_html");
      }
      AppMethodBeat.o(44004);
    }
  }

  public static m b(m paramm, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(44005);
    m localm = paramm;
    if (paramm == null)
      localm = new m();
    paramString = br.z(paramString, "mallProductInfo");
    if (paramString == null)
    {
      localm = null;
      AppMethodBeat.o(44005);
    }
    while (true)
    {
      return localm;
      localm.pho = bo.nullAsNil((String)paramString.get(".mallProductInfo.id"));
      localm.php = bo.getInt((String)paramString.get(".mallProductInfo.type"), 0);
      localm.phs = new c();
      localm.phs.name = bo.nullAsNil((String)paramString.get(".mallProductInfo.name"));
      localm.phs.fjz = bo.nullAsNil((String)paramString.get(".mallProductInfo.digest"));
      localm.phs.phE = bo.getInt((String)paramString.get(".mallProductInfo.highPrice"), 0);
      localm.phs.phF = bo.getInt((String)paramString.get(".mallProductInfo.lowPrice"), 0);
      localm.phs.phD = bo.getInt((String)paramString.get(".mallProductInfo.originPrice"), 0);
      localm.phw = bo.nullAsNil((String)paramString.get(".mallProductInfo.sourceUrl"));
      int j = bo.getInt((String)paramString.get(".mallProductInfo.imgCount"), 0);
      if (j > 0)
      {
        localm.phs.phG = new LinkedList();
        if (i < j)
        {
          if (i == 0);
          for (paramm = bo.nullAsNil((String)paramString.get(".mallProductInfo.imgList.imgUrl")); ; paramm = bo.nullAsNil((String)paramString.get(".mallProductInfo.imgList.imgUrl".concat(String.valueOf(i)))))
          {
            if (!bo.isNullOrNil(paramm))
              localm.phs.phG.add(paramm);
            i++;
            break;
          }
        }
      }
      localm.phs.phO = new k();
      localm.phs.phO.url = bo.nullAsNil((String)paramString.get(".mallProductInfo.shareInfo.shareUrl"));
      localm.phs.phO.kKZ = bo.nullAsNil((String)paramString.get(".mallProductInfo.shareInfo.shareThumbUrl"));
      localm.pht = new n();
      localm.pht.csB = bo.nullAsNil((String)paramString.get(".mallProductInfo.sellerInfo.appID"));
      localm.pht.name = bo.nullAsNil((String)paramString.get(".mallProductInfo.sellerInfo.appName"));
      localm.pht.username = bo.nullAsNil((String)paramString.get(".mallProductInfo.sellerInfo.usrName"));
      AppMethodBeat.o(44005);
    }
  }

  public final String bZY()
  {
    AppMethodBeat.i(44006);
    String str;
    if ((this.phs != null) && (this.phs.phO != null) && (!bo.isNullOrNil(this.phs.phO.kKZ)))
    {
      str = this.phs.phO.kKZ;
      AppMethodBeat.o(44006);
    }
    while (true)
    {
      return str;
      if ((this.phs != null) && (this.phs.phG != null) && (this.phs.phG.size() > 0))
      {
        str = (String)this.phs.phG.get(0);
        AppMethodBeat.o(44006);
      }
      else
      {
        str = null;
        AppMethodBeat.o(44006);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.m
 * JD-Core Version:    0.6.2
 */