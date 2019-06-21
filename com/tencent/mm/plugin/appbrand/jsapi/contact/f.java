package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.permission.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends a
{
  public static final int CTRL_INDEX = 414;
  public static final String NAME = "searchContacts";
  private List<String[]> hIL;

  private static List<String[]> cJ(Context paramContext)
  {
    AppMethodBeat.i(126275);
    LinkedList localLinkedList = new LinkedList();
    Object localObject2 = paramContext.getContentResolver();
    if (!g.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.JsApiSearchContacts", "no contact permission");
      AppMethodBeat.o(126275);
    }
    while (true)
    {
      return localLinkedList;
      try
      {
        paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "sort_key_alt");
        if (paramContext == null)
        {
          ab.e("MicroMsg.JsApiSearchContacts", "getMobileInfo: mobile is null");
          AppMethodBeat.o(126275);
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.JsApiSearchContacts", paramContext, "", new Object[0]);
          ab.e("MicroMsg.JsApiSearchContacts", "exception in getMoblieOrderInfo(), [%s]", new Object[] { paramContext.getMessage() });
          paramContext = ((ContentResolver)localObject2).query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        }
        try
        {
          if ((paramContext.getCount() > 0) && (paramContext.moveToFirst()))
          {
            boolean bool;
            do
            {
              localObject2 = paramContext.getString(paramContext.getColumnIndex("display_name"));
              localLinkedList.add(new String[] { paramContext.getString(paramContext.getColumnIndex("contact_id")), localObject2, paramContext.getString(paramContext.getColumnIndex("data1")), paramContext.getString(paramContext.getColumnIndex("raw_contact_id")) });
              bool = paramContext.moveToNext();
            }
            while (bool);
          }
          paramContext.close();
          AppMethodBeat.o(126275);
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.JsApiSearchContacts", localException, "", new Object[0]);
            ab.e("MicroMsg.JsApiSearchContacts", "exception in getMoblieOrderInfo()2, [%s]", new Object[] { localException.getMessage() });
            paramContext.close();
          }
        }
        finally
        {
          paramContext.close();
          AppMethodBeat.o(126275);
        }
      }
    }
  }

  private static boolean cd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(126274);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.JsApiSearchContacts", "phoneNumber or targetPhoneNumber is null, return false");
      AppMethodBeat.o(126274);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = paramString1.length();
      int j = paramString2.length();
      if (i < 8)
      {
        ab.d("MicroMsg.JsApiSearchContacts", "phoneNumberSize:%d, return false", new Object[] { Integer.valueOf(paramString1.length()) });
        AppMethodBeat.o(126274);
        bool = false;
      }
      else if (i > j)
      {
        ab.d("MicroMsg.JsApiSearchContacts", "phoneNumberSize:%d, targetPhoneNumberSize:%d return false", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        AppMethodBeat.o(126274);
        bool = false;
      }
      else
      {
        int k = 0;
        int m;
        for (j = 0; ; j = m)
        {
          m = j;
          if (k >= i)
            break;
          m = j;
          if (paramString1.charAt(k) != paramString2.charAt(k))
          {
            j++;
            m = j;
            if (j > 3)
              break;
            m = j;
          }
          k++;
        }
        if (m <= 3)
        {
          AppMethodBeat.o(126274);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(126274);
          bool = false;
        }
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126273);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiSearchContacts", "data is null, err");
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(126273);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiSearchContacts", "JsApiSearchContacts invoke");
      ab.d("MicroMsg.JsApiSearchContacts", "data:%s", new Object[] { paramJSONObject });
      Object localObject1 = paramc.getContext();
      if ((localObject1 == null) || (!(localObject1 instanceof Activity)))
      {
        ab.e("MicroMsg.JsApiSearchContacts", "getPageContext failed, appid is %s", new Object[] { paramc.getAppId() });
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(126273);
      }
      else
      {
        n.b(paramc.getAppId(), new f.1(this, paramc, paramJSONObject, paramInt));
        Object localObject2 = paramc.getContext();
        int i;
        if ((localObject2 == null) || (!(localObject2 instanceof Activity)))
        {
          paramc.M(paramInt, j("fail", null));
          i = 0;
        }
        while (true)
        {
          if (i != 0)
            break label242;
          ab.i("MicroMsg.JsApiSearchContacts", "check permission");
          AppMethodBeat.o(126273);
          break;
          boolean bool = g.a((Activity)localObject2, "android.permission.READ_CONTACTS", 48, "", "");
          i = bool;
          if (bool)
          {
            n.Dr(paramc.getAppId());
            i = bool;
          }
        }
        label242: localObject2 = paramJSONObject.optString("phoneNumber");
        if (((String)localObject2).length() < 8)
        {
          ab.e("MicroMsg.JsApiSearchContacts", "phoneNumber is short");
          paramJSONObject = new HashMap();
          paramJSONObject.put("result", "");
          paramc.M(paramInt, j("ok", paramJSONObject));
          AppMethodBeat.o(126273);
        }
        else
        {
          if (this.hIL == null)
            this.hIL = cJ((Context)localObject1);
          if (this.hIL == null)
          {
            ab.e("MicroMsg.JsApiSearchContacts", "addressList is null, err");
            paramc.M(paramInt, j("fail", null));
            AppMethodBeat.o(126273);
          }
          else
          {
            JSONArray localJSONArray = new JSONArray();
            if ((this.hIL != null) && (!this.hIL.isEmpty()))
            {
              Iterator localIterator = this.hIL.iterator();
              if (localIterator.hasNext())
              {
                Object localObject3 = (String[])localIterator.next();
                paramJSONObject = localObject3[2];
                if (paramJSONObject == null)
                  paramJSONObject = null;
                while (true)
                {
                  while (true)
                  {
                    localObject3 = bo.bc(localObject3[1], "");
                    if ((bo.isNullOrNil(paramJSONObject)) || (!cd((String)localObject2, paramJSONObject)))
                      break;
                    try
                    {
                      localObject1 = new org/json/JSONObject;
                      ((JSONObject)localObject1).<init>();
                      ((JSONObject)localObject1).put("phoneNumber", paramJSONObject);
                      ((JSONObject)localObject1).put("name", localObject3);
                      localJSONArray.put(localObject1);
                    }
                    catch (JSONException paramJSONObject)
                    {
                      ab.printErrStackTrace("MicroMsg.JsApiSearchContacts", paramJSONObject, "", new Object[0]);
                    }
                  }
                  break;
                  localObject1 = paramJSONObject.replaceAll("\\D", "");
                  paramJSONObject = (JSONObject)localObject1;
                  if (((String)localObject1).startsWith("86"))
                    paramJSONObject = ((String)localObject1).substring(2);
                }
              }
            }
            ab.d("MicroMsg.JsApiSearchContacts", "resultArray:%s", new Object[] { localJSONArray.toString() });
            paramJSONObject = new HashMap();
            paramJSONObject.put("result", localJSONArray.toString());
            paramc.M(paramInt, j("ok", paramJSONObject));
            AppMethodBeat.o(126273);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.f
 * JD-Core Version:    0.6.2
 */