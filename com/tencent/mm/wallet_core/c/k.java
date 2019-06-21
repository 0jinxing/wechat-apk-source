package com.tencent.mm.wallet_core.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.vr;
import com.tencent.mm.g.a.vw;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class k
{
  public k.a Afp;
  e Afq;
  c<vr> Afr;
  public String cEh;
  boolean ctn;
  public String nZb;
  public String nZc;
  c<vw> ons;
  public String title;
  public int ttd;
  public boolean wAV;

  public k()
  {
    AppMethodBeat.i(49052);
    this.ctn = false;
    this.ons = new c()
    {
    };
    this.Afr = new k.2(this);
    AppMethodBeat.o(49052);
  }

  public static k aS(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(49053);
    try
    {
      ab.i("MicroMsg.JumpRemind", "feed %s", new Object[] { paramJSONObject });
      Object localObject = paramJSONObject.optJSONObject("bindquerynew_resp");
      if (localObject != null)
      {
        paramJSONObject = (JSONObject)localObject;
        JSONObject localJSONObject = paramJSONObject.optJSONObject("bindqueryresp");
        localObject = paramJSONObject;
        if (localJSONObject != null)
          localObject = localJSONObject;
        localJSONObject = ((JSONObject)localObject).optJSONObject("jumpRemind");
        paramJSONObject = localJSONObject;
        if (localJSONObject == null)
          paramJSONObject = ((JSONObject)localObject).optJSONObject("jump_remind");
        if (paramJSONObject == null)
        {
          paramJSONObject = ((JSONObject)localObject).optJSONObject("jump_remind_info");
          if (paramJSONObject != null)
          {
            localObject = new com/tencent/mm/wallet_core/c/k;
            ((k)localObject).<init>();
            ((k)localObject).ttd = paramJSONObject.optInt("jump_type");
            ((k)localObject).wAV = paramJSONObject.optBoolean("is_pop_up_windows");
            ((k)localObject).cEh = paramJSONObject.optString("wording");
            ((k)localObject).nZb = paramJSONObject.optString("left_button_wording");
            ((k)localObject).nZc = paramJSONObject.optString("right_button_wording");
            ((k)localObject).title = paramJSONObject.optString("title");
            localJSONObject = paramJSONObject.optJSONObject("url");
            paramJSONObject = new com/tencent/mm/wallet_core/c/k$a;
            paramJSONObject.<init>();
            ((k)localObject).Afp = paramJSONObject;
            if (localJSONObject != null)
            {
              ((k)localObject).Afp.type = localJSONObject.optInt("type");
              ((k)localObject).Afp.csB = localJSONObject.optString("appid");
              ((k)localObject).Afp.wTe = localJSONObject.optString("app_version");
              ((k)localObject).Afp.path = localJSONObject.optString("path");
              ((k)localObject).Afp.tff = localJSONObject.optString("button_name");
            }
            AppMethodBeat.o(49053);
            paramJSONObject = (JSONObject)localObject;
            return paramJSONObject;
          }
        }
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.JumpRemind", paramJSONObject, "error create", new Object[0]);
        paramJSONObject = null;
        AppMethodBeat.o(49053);
        continue;
      }
    }
  }

  public final boolean a(Activity paramActivity, e parame)
  {
    AppMethodBeat.i(49054);
    this.Afq = parame;
    if (this.wAV)
    {
      com.tencent.mm.ui.base.h.d(paramActivity, this.cEh, this.title, this.nZc, this.nZb, new k.3(this, paramActivity), new k.4(this, paramActivity));
      AppMethodBeat.o(49054);
    }
    while (true)
    {
      return true;
      ip(paramActivity);
      AppMethodBeat.o(49054);
    }
  }

  public final boolean a(Activity paramActivity, f paramf)
  {
    AppMethodBeat.i(49055);
    boolean bool = a(paramActivity, new k.5(this, paramf, paramActivity));
    AppMethodBeat.o(49055);
    return bool;
  }

  public final boolean a(Activity paramActivity, g paramg)
  {
    AppMethodBeat.i(49056);
    com.tencent.mm.ui.base.h.d(paramActivity, this.cEh, this.title, this.nZc, this.nZb, new k.6(this, paramg), new k.7(this, paramg));
    AppMethodBeat.o(49056);
    return true;
  }

  public final boolean dNM()
  {
    boolean bool = true;
    if (this.ttd == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  final void ip(Context paramContext)
  {
    AppMethodBeat.i(49057);
    if ((paramContext instanceof h))
    {
      ((h)paramContext).a(new j()
      {
        public final void dNL()
        {
          AppMethodBeat.i(49051);
          k.this.ons.dead();
          k.this.Afr.dead();
          AppMethodBeat.o(49051);
        }

        public final void onDestroy()
        {
          AppMethodBeat.i(49050);
          k.this.ons.dead();
          k.this.Afr.dead();
          AppMethodBeat.o(49050);
        }
      });
      this.ons.dnU();
      this.Afr.dnU();
      this.ctn = false;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", this.Afp.path);
      localIntent.putExtra("showShare", false);
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    }
    AppMethodBeat.o(49057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.k
 * JD-Core Version:    0.6.2
 */