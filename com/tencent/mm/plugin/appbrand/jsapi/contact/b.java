package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.d;
import java.util.ArrayList;
import org.json.JSONObject;

public final class b extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 226;
  public static final String NAME = "addPhoneContact";
  private a hIc;

  private static void a(ArrayList<ContentValues> paramArrayList, a.a parama, int paramInt)
  {
    AppMethodBeat.i(126266);
    if ((parama != null) && (parama.aDu().length() > 0))
    {
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
      localContentValues.put("data1", parama.aDu());
      localContentValues.put("data9", parama.hIb);
      localContentValues.put("data2", Integer.valueOf(paramInt));
      paramArrayList.add(localContentValues);
    }
    AppMethodBeat.o(126266);
  }

  private static void a(ArrayList<ContentValues> paramArrayList, String paramString, int paramInt)
  {
    AppMethodBeat.i(126267);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
    localContentValues.put("data1", paramString);
    localContentValues.put("data2", Integer.valueOf(paramInt));
    paramArrayList.add(localContentValues);
    AppMethodBeat.o(126267);
  }

  private static a.a e(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(126265);
    paramJSONObject = new a.a(paramJSONObject.optString(paramString + "Country"), paramJSONObject.optString(paramString + "State"), paramJSONObject.optString(paramString + "City"), paramJSONObject.optString(paramString + "Street"), paramJSONObject.optString(paramString + "PostalCode"));
    AppMethodBeat.o(126265);
    return paramJSONObject;
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126264);
    ab.d("MicroMsg.JsApiAddPhoneContact", "addPhoneContact!");
    if (paramJSONObject == null)
    {
      paramc.M(paramInt, j("fail:data is null", null));
      ab.e("MicroMsg.JsApiAddPhoneContact", "data is null");
      AppMethodBeat.o(126264);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramJSONObject.optString("firstName")))
      {
        paramc.M(paramInt, j("fail:firstName is null", null));
        ab.e("MicroMsg.JsApiAddPhoneContact", "firstName is null");
        AppMethodBeat.o(126264);
      }
      else
      {
        Object localObject1 = paramc.getContext();
        if ((localObject1 == null) || (!(localObject1 instanceof Activity)))
        {
          paramc.M(paramInt, j("fail", null));
          ab.e("MicroMsg.JsApiAddPhoneContact", "activity is null, invoke fail!");
          AppMethodBeat.o(126264);
        }
        else
        {
          this.hIc = new a();
          this.hIc.hHN = paramJSONObject.optString("photoFilePath");
          this.hIc.bCu = paramJSONObject.optString("nickName");
          Object localObject2 = new a.b(paramJSONObject.optString("firstName"), paramJSONObject.optString("middleName"), paramJSONObject.optString("lastName"));
          this.hIc.hHM = ((a.b)localObject2);
          this.hIc.hHV = paramJSONObject.optString("remark");
          this.hIc.hHR = paramJSONObject.optString("mobilePhoneNumber");
          this.hIc.hHZ = paramJSONObject.optString("weChatNumber");
          this.hIc.hHQ = e(paramJSONObject, "address");
          this.hIc.hHW = paramJSONObject.optString("organization");
          this.hIc.title = paramJSONObject.optString("title");
          this.hIc.hHX = paramJSONObject.optString("workFaxNumber");
          this.hIc.hHU = paramJSONObject.optString("workPhoneNumber");
          this.hIc.hHT = paramJSONObject.optString("hostNumber");
          this.hIc.dtV = paramJSONObject.optString("email");
          this.hIc.url = paramJSONObject.optString("url");
          this.hIc.hHP = e(paramJSONObject, "workAddress");
          this.hIc.hHY = paramJSONObject.optString("homeFaxNumber");
          this.hIc.hHS = paramJSONObject.optString("homePhoneNumber");
          this.hIc.hHO = e(paramJSONObject, "homeAddress");
          localObject1 = (Activity)localObject1;
          localObject2 = ((Activity)localObject1).getString(2131301252);
          String str = ((Activity)localObject1).getString(2131301251);
          paramJSONObject = new d((Context)localObject1, 1, false);
          paramJSONObject.rBl = new b.1(this, new String[] { localObject2, str });
          paramJSONObject.rBm = new b.2(this, (Activity)localObject1, paramc, paramc, paramInt);
          paramJSONObject.cpD();
          AppMethodBeat.o(126264);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.b
 * JD-Core Version:    0.6.2
 */