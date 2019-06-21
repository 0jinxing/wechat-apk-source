package com.tencent.mm.plugin.webview.modeltools;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.pp;
import com.tencent.mm.g.a.pp.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class e
{
  String uoF;
  private e.a uoG;
  private c uoH;
  private c uoI;
  private c uoJ;

  public e()
  {
    AppMethodBeat.i(6940);
    this.uoF = null;
    this.uoH = new e.1(this);
    this.uoI = new e.2(this);
    this.uoJ = new c()
    {
      private boolean a(pp paramAnonymouspp)
      {
        AppMethodBeat.i(6938);
        if (((paramAnonymouspp instanceof pp)) && (e.this.uoF.equalsIgnoreCase(paramAnonymouspp.cLM.cardType)))
        {
          if (paramAnonymouspp.cLM.cLN != 0)
            break label72;
          e.b(e.this, e.this.uoF);
        }
        label189: 
        while (true)
        {
          e.a(e.this);
          AppMethodBeat.o(6938);
          return false;
          label72: if (paramAnonymouspp.cLM.cLN == 2)
          {
            e.a(e.this, e.this.uoF);
          }
          else
          {
            try
            {
              if (bo.isNullOrNil(paramAnonymouspp.cLM.cLO))
                break label189;
              JSONObject localJSONObject = new org/json/JSONObject;
              localJSONObject.<init>(paramAnonymouspp.cLM.cLO);
              e.a(e.this, e.this.uoF, localJSONObject, paramAnonymouspp.cLM.cLP);
            }
            catch (Exception paramAnonymouspp)
            {
              ab.e("MicroMsg.LicenceScanner", "Failed to parse json string: %s", new Object[] { paramAnonymouspp.getMessage() });
              e.b(e.this, e.this.uoF);
            }
            continue;
            e.a(e.this, e.this.uoF, null, paramAnonymouspp.cLM.cLP);
          }
        }
      }
    };
    AppMethodBeat.o(6940);
  }

  public final boolean a(String paramString, Context paramContext, e.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(6941);
    if ("bank".equalsIgnoreCase(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("BaseScanUI_select_scan_mode", 7);
      paramString.putExtra("scan_bankcard_with_confirm_ui", true);
      paramString.addFlags(268435456);
      d.b(paramContext, "scanner", ".ui.BaseScanUI", paramString);
      this.uoG = parama;
      this.uoF = "bank";
      a.xxA.c(this.uoH);
      a.xxA.c(this.uoI);
      AppMethodBeat.o(6941);
    }
    while (true)
    {
      return bool;
      if ("identity_pay_auth".equalsIgnoreCase(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("BaseScanUI_select_scan_mode", 11);
        d.b(paramContext, "scanner", ".ui.BaseScanUI", paramString);
        this.uoG = parama;
        this.uoF = "identity";
        a.xxA.c(this.uoH);
        a.xxA.c(this.uoJ);
        AppMethodBeat.o(6941);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(6941);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.e
 * JD-Core Version:    0.6.2
 */