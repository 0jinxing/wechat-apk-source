package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.AlertDialog.Builder;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import android.widget.Toast;
import com.tencent.luggage.g.e.a;
import com.tencent.luggage.g.g;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class c$1
  implements e.a
{
  c$1(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1, int paramInt, Context paramContext)
  {
  }

  public final void b(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(126269);
    if ((paramInt == 0) || (paramInt == 1))
    {
      this.hxc.M(this.eIl, this.hIj.j("cancel", null));
      AppMethodBeat.o(126269);
    }
    Cursor localCursor1;
    Cursor localCursor2;
    while (true)
    {
      return;
      if (paramInt != -1)
        break label741;
      paramIntent = paramIntent.getData();
      if (paramIntent == null)
      {
        ab.e("MicroMsg.JsApiChooseContact", "onActivityResult, uri == null");
        this.hxc.M(this.eIl, this.hIj.j("fail", null));
        AppMethodBeat.o(126269);
      }
      else if (!g.o(this.hIi, "android.permission.READ_CONTACTS"))
      {
        ab.e("MicroMsg.JsApiChooseContact", "onActivityResult, no contact permission");
        this.hxc.M(this.eIl, this.hIj.j("fail:system permission denied", null));
        AppMethodBeat.o(126269);
      }
      else
      {
        try
        {
          localCursor1 = this.hIi.getContentResolver().query(paramIntent, null, null, null, null);
          if ((localCursor1 == null) || (localCursor1.getCount() <= 0))
            break label774;
          localCursor1.moveToFirst();
          paramInt = localCursor1.getColumnIndex("has_phone_number");
          if ((paramInt > 0) && (localCursor1.getInt(paramInt) <= 0))
            break label774;
          paramIntent = localCursor1.getString(localCursor1.getColumnIndex("_id"));
          localCursor2 = this.hIi.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ".concat(String.valueOf(paramIntent)), null, null);
          ab.i("MicroMsg.JsApiChooseContact", "onActivityResult, queried cursor = %s", new Object[] { localCursor1 });
          if (localCursor2 != null)
            break;
          this.hxc.M(this.eIl, this.hIj.j("fail", null));
          AppMethodBeat.o(126269);
        }
        catch (SecurityException paramIntent)
        {
          ab.e("MicroMsg.JsApiChooseContact", "onActivityResult, permission denied: %s", new Object[] { paramIntent.toString() });
          new AlertDialog.Builder(this.hIi).setMessage(ah.getResources().getString(2131296796)).setTitle("").setCancelable(true).show();
          this.hxc.M(this.eIl, this.hIj.j("fail:system permission denied", null));
          AppMethodBeat.o(126269);
        }
      }
    }
    Object localObject1;
    Object localObject2;
    if (localCursor2.moveToFirst())
    {
      localObject1 = null;
      paramIntent = null;
      if (!localCursor2.isAfterLast())
      {
        paramInt = localCursor2.getColumnIndex("data1");
        int i = localCursor2.getColumnIndex("display_name");
        localObject1 = localCursor2.getString(paramInt);
        localObject2 = localCursor2.getString(i);
        ab.d("MicroMsg.JsApiChooseContact", "onActivityResult, username : ".concat(String.valueOf(localObject2)));
        if (localObject1 == null)
          break label760;
        ab.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : ".concat(String.valueOf(localObject1)));
        if (localObject1 == null)
          localObject1 = null;
        while (true)
        {
          ab.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneNumber : ".concat(String.valueOf(localObject1)));
          if ((!PhoneNumberUtils.isGlobalPhoneNumber((String)localObject1)) || (((String)localObject1).length() != 11))
            break label754;
          label525: ab.d("MicroMsg.JsApiChooseContact", "onActivityResult, phoneResult : ".concat(String.valueOf(localObject1)));
          label540: localCursor2.moveToNext();
          paramIntent = (Intent)localObject1;
          localObject1 = localObject2;
          break;
          String str = ((String)localObject1).replaceAll("\\D", "");
          localObject1 = str;
          if (str.startsWith("86"))
            localObject1 = str.substring(2);
        }
      }
    }
    while (true)
    {
      try
      {
        localCursor2.close();
        if ((localCursor1 != null) && (!localCursor1.isClosed()))
          localCursor1.close();
        if (!bo.isNullOrNil(paramIntent))
        {
          localObject2 = new HashMap(1);
          ((Map)localObject2).put("phoneNumber", paramIntent);
          paramIntent = (Intent)localObject1;
          if (localObject1 == null)
            paramIntent = "";
          ((Map)localObject2).put("displayName", paramIntent);
          this.hxc.M(this.eIl, this.hIj.j("ok", (Map)localObject2));
          AppMethodBeat.o(126269);
          break;
        }
        this.hxc.M(this.eIl, this.hIj.j("fail", null));
        Toast.makeText(this.hIi, 2131296767, 0).show();
        label741: AppMethodBeat.o(126269);
      }
      catch (Exception localException)
      {
        continue;
      }
      label754: localObject1 = paramIntent;
      break label525;
      label760: localObject1 = paramIntent;
      break label540;
      localObject1 = null;
      paramIntent = null;
      continue;
      label774: localObject1 = null;
      paramIntent = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.c.1
 * JD-Core Version:    0.6.2
 */