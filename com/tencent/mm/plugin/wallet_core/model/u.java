package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fc;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class u extends fc
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(46892);
    c.a locala = new c.a();
    locala.xDb = new Field[3];
    locala.columns = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "bulletin_scene";
    locala.xDd.put("bulletin_scene", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" bulletin_scene TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "bulletin_scene";
    locala.columns[1] = "bulletin_content";
    locala.xDd.put("bulletin_content", "TEXT");
    localStringBuilder.append(" bulletin_content TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "bulletin_url";
    locala.xDd.put("bulletin_url", "TEXT");
    localStringBuilder.append(" bulletin_url TEXT");
    locala.columns[3] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(46892);
  }

  public static void aC(JSONObject paramJSONObject)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    int i = 0;
    AppMethodBeat.i(46891);
    Object localObject1 = r.cPM();
    if ((paramJSONObject != null) && (localObject1 != null))
    {
      Object localObject2 = paramJSONObject.optJSONArray("banner_map");
      paramJSONObject = paramJSONObject.optJSONArray("banner_content_array");
      HashMap localHashMap = new HashMap();
      localObject3 = new HashMap();
      if ((localObject2 != null) && (paramJSONObject != null))
      {
        int j = ((JSONArray)localObject2).length();
        Object localObject4;
        Object localObject5;
        for (int k = 0; k < j; k++)
        {
          localObject4 = ((JSONArray)localObject2).optJSONObject(k);
          if (localObject4 != null)
          {
            localObject5 = ((JSONObject)localObject4).optString("banner_type");
            localObject4 = ((JSONObject)localObject4).optString("banner_template_id");
            ab.i("MicroMsg.WalletBulletin", "sceneid=" + (String)localObject5 + "; contentid=" + (String)localObject4);
            if ((!bo.isNullOrNil((String)localObject5)) && (!bo.isNullOrNil((String)localObject4)))
            {
              localHashMap.put(localObject5, localObject4);
              ab.i("MicroMsg.WalletBulletin", "sceneid:" + (String)localObject5 + " map contentid:" + (String)localObject4);
            }
          }
        }
        j = paramJSONObject.length();
        for (k = i; k < j; k++)
        {
          localObject2 = paramJSONObject.optJSONObject(k);
          if (localObject2 != null)
            ((Map)localObject3).put(((JSONObject)localObject2).optString("banner_template_id"), Integer.valueOf(k));
        }
        if (localHashMap.size() > 0)
        {
          localObject5 = localHashMap.keySet().iterator();
          while (((Iterator)localObject5).hasNext())
          {
            localObject2 = (String)((Iterator)localObject5).next();
            localObject4 = (String)localHashMap.get(localObject2);
            if (((Map)localObject3).containsKey(localObject4))
            {
              ab.i("MicroMsg.WalletBulletin", "find contentid:" + (String)localObject4 + "in contentMap");
              JSONObject localJSONObject = paramJSONObject.optJSONObject(((Integer)((Map)localObject3).get(localObject4)).intValue());
              localObject4 = new u();
              ((u)localObject4).field_bulletin_scene = ((String)localObject2);
              ((u)localObject4).field_bulletin_content = localJSONObject.optString("content");
              ((u)localObject4).field_bulletin_url = localJSONObject.optString("url");
              ((d)localObject1).b((c)localObject4);
            }
            else
            {
              ab.e("MicroMsg.WalletBulletin", "can not find contentid:" + (String)localObject4 + "in contentMap");
            }
          }
        }
        AppMethodBeat.o(46891);
        return;
      }
      localObject1 = new StringBuilder("scenes==null?");
      if (localObject2 == null)
      {
        bool3 = true;
        label495: localObject1 = ((StringBuilder)localObject1).append(bool3).append("  contents==null?");
        if (paramJSONObject != null)
          break label545;
      }
      label545: for (bool3 = bool2; ; bool3 = false)
      {
        ab.e("MicroMsg.WalletBulletin", bool3);
        AppMethodBeat.o(46891);
        break;
        bool3 = false;
        break label495;
      }
    }
    Object localObject3 = new StringBuilder("json==null?");
    if (paramJSONObject == null)
    {
      bool3 = true;
      label569: paramJSONObject = ((StringBuilder)localObject3).append(bool3).append("  stg==null?");
      if (localObject1 != null)
        break label618;
    }
    label618: for (boolean bool3 = bool1; ; bool3 = false)
    {
      ab.e("MicroMsg.WalletBulletin", bool3);
      AppMethodBeat.o(46891);
      break;
      bool3 = false;
      break label569;
    }
  }

  public final c.a Ag()
  {
    return ccO;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.u
 * JD-Core Version:    0.6.2
 */