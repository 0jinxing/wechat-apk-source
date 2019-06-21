package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import org.json.JSONException;
import org.json.JSONObject;

public class ak extends bd
{
  public final void a(Context paramContext, String paramString, final bc.a parama)
  {
    AppMethodBeat.i(6353);
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramString);
      localObject2 = ((JSONObject)localObject1).optString("username");
      if ((localObject2 == null) || (((String)localObject2).length() == 0))
      {
        ab.e("MicroMsg.JsApiProfile", "doProfile fail, username is null");
        parama.d("fail", null);
        AppMethodBeat.o(6353);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        Object localObject1;
        Object localObject2;
        ab.e("MicroMsg.JsApiProfile", "parase json fail");
        parama.d("fail", null);
        AppMethodBeat.o(6353);
        continue;
        if (bo.isNullOrNil((String)localObject2))
        {
          l.q(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(6349);
              Toast.makeText(ah.getContext(), ah.getContext().getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
              AppMethodBeat.o(6349);
            }
          });
          parama.d("fail", null);
          AppMethodBeat.o(6353);
        }
        else
        {
          g.RN();
          if (!com.tencent.mm.kernel.a.QX())
          {
            ab.e("MicroMsg.JsApiProfile", "doProfile, MMCore.hasCfgDefaultUin() is false");
            parama.d("fail", null);
            AppMethodBeat.o(6353);
          }
          else
          {
            Object localObject3 = ((j)g.K(j.class)).XM().aoO((String)localObject2);
            if (localObject3 != null)
            {
              paramString = (String)localObject3;
              if ((int)((com.tencent.mm.n.a)localObject3).ewQ > 0);
            }
            else
            {
              paramString = ((j)g.K(j.class)).XM().aoK((String)localObject2);
            }
            localObject3 = new Intent();
            localObject1 = ((JSONObject)localObject1).optString("profileReportInfo");
            if (!bo.isNullOrNil((String)localObject1))
              ((Intent)localObject3).putExtra("key_add_contact_report_info", (String)localObject1);
            if ((paramString != null) && ((int)paramString.ewQ > 0))
            {
              ((Intent)localObject3).addFlags(268435456);
              ((Intent)localObject3).putExtra("Contact_User", paramString.field_username);
              if (paramString.dsf())
                ((Intent)localObject3).putExtra("Contact_Scene", 42);
              if (com.tencent.mm.n.a.jh(paramString.field_type))
              {
                localObject2 = new qh();
                ((qh)localObject2).cMw.intent = ((Intent)localObject3);
                ((qh)localObject2).cMw.username = paramString.field_username;
                com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
              }
              com.tencent.mm.plugin.webview.a.a.gkE.c((Intent)localObject3, paramContext);
              parama.d(null, null);
              AppMethodBeat.o(6353);
            }
            else
            {
              paramContext.getString(2131297061);
              paramString = h.b(paramContext, paramContext.getString(2131297086), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  AppMethodBeat.i(6350);
                  ao.a.flu.or(this.eiH);
                  parama.d("cancel", null);
                  AppMethodBeat.o(6350);
                }
              });
              ao.a.flu.a((String)localObject2, "", new ak.3(this, paramContext, parama, paramString, (Intent)localObject3));
              AppMethodBeat.o(6353);
            }
          }
        }
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 2;
  }

  public final String name()
  {
    return "profile";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ak
 * JD-Core Version:    0.6.2
 */