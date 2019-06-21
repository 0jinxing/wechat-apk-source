package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.pluginsdk.model.a.a;
import com.tencent.mm.pluginsdk.ui.tools.AppChooserUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;

public final class j
  implements MMActivity.a
{
  WeakReference<Context> aIq;
  d fwu;
  c nOO;
  boolean uIK;
  int uIL;
  j.e uIM;
  j.e uIN;
  String uIO;
  j.d uIP;
  c.a uIQ;
  c.a uIR;
  b.a uIS;
  final Runnable uIT;
  int unO;

  j()
  {
    AppMethodBeat.i(9837);
    this.uIK = false;
    this.nOO = null;
    this.uIQ = null;
    this.uIR = null;
    this.fwu = null;
    this.uIS = null;
    this.uIT = new j.1(this);
    AppMethodBeat.o(9837);
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(9836);
    Context localContext = (Context)this.aIq.get();
    if ((this.uIP == null) || (localContext == null));
    while (true)
    {
      if ((this.uIK) && (this.uIP != null))
        this.uIP.JQ(this.unO);
      this.uIK = false;
      this.uIL = a.a.vaU.code;
      this.uIM = null;
      this.uIN = null;
      this.aIq = null;
      this.uIP = null;
      this.uIO = null;
      this.uIQ = null;
      this.uIR = null;
      if ((this.fwu != null) && (this.uIS != null))
        this.fwu.c(this.uIS);
      this.fwu = null;
      this.uIS = null;
      if (this.nOO != null)
      {
        if (this.uIQ != null)
          this.nOO.a(this.uIQ);
        if (this.uIR != null)
          this.nOO.a(this.uIR);
      }
      this.nOO = null;
      this.uIQ = null;
      this.uIR = null;
      AppMethodBeat.o(9836);
      return;
      if (!this.uIK)
      {
        ab.e("MicroMsg.OpenMapNavigator", "onActivityResult called without msgId attached...");
      }
      else if (paramInt1 != 33)
      {
        ab.e("MicroMsg.OpenMapNavigator", "onActivityResult, mismatched request_code = %d", new Object[] { Integer.valueOf(paramInt1) });
        this.uIP.onFail(this.unO);
      }
      else if ((paramInt2 == 4097) || (paramInt2 == 0))
      {
        this.uIP.JP(this.unO);
      }
      else if (paramInt2 == -1)
      {
        paramIntent = paramIntent.getStringExtra("selectpkg");
        if (bo.isNullOrNil(paramIntent))
        {
          ab.e("MicroMsg.OpenMapNavigator", "onActivityResult, get null packageName");
          this.uIP.onFail(this.unO);
        }
        else
        {
          if (a.a.vaV.getPackage().equals(paramIntent))
            paramIntent = new j.c((byte)0);
          while (true)
          {
            paramIntent.a(localContext, this.uIM, this.uIN, this.uIO);
            this.uIP.onSuccess(this.unO);
            break;
            if (a.a.vaX.getPackage().equals(paramIntent))
              paramIntent = new a((byte)0);
            else if (a.a.vaW.getPackage().equals(paramIntent))
              paramIntent = new j.g((byte)0);
            else if (a.a.vaY.getPackage().equals(paramIntent))
              paramIntent = new j.b((byte)0);
            else
              paramIntent = new h((byte)0);
          }
        }
      }
      else
      {
        ab.e("MicroMsg.OpenMapNavigator", "onActivityResult, not support result_code = %d", new Object[] { Integer.valueOf(paramInt2) });
        this.uIP.onFail(this.unO);
      }
    }
  }

  final void dcP()
  {
    Context localContext = null;
    AppMethodBeat.i(9838);
    this.uIS = null;
    this.uIQ = null;
    this.uIR = null;
    if (this.aIq == null)
    {
      if (localContext != null)
        break label55;
      AppMethodBeat.o(9838);
    }
    while (true)
    {
      return;
      localContext = (Context)this.aIq.get();
      break;
      label55: Intent localIntent = new Intent(localContext, AppChooserUI.class);
      Object localObject = new ArrayList(5);
      ((ArrayList)localObject).add(a.a.vaU.getPackage());
      ((ArrayList)localObject).add(a.a.vaV.getPackage());
      ((ArrayList)localObject).add(a.a.vaW.getPackage());
      ((ArrayList)localObject).add(a.a.vaX.getPackage());
      ((ArrayList)localObject).add(a.a.vaY.getPackage());
      localIntent.putStringArrayListExtra("targetwhitelist", (ArrayList)localObject);
      localObject = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f,%f", new Object[] { Double.valueOf(this.uIN.latitude), Double.valueOf(this.uIN.longitude) })));
      localIntent.putExtra("targetintent", (Parcelable)localObject);
      Bundle localBundle = new Bundle(2);
      localBundle.putInt("key_map_app", this.uIL);
      localBundle.putParcelable("key_target_intent", (Parcelable)localObject);
      localIntent.putExtra("key_recommend_params", localBundle);
      localIntent.putExtra("type", 2);
      localIntent.putExtra("title", localContext.getString(2131305715));
      ((MMActivity)localContext).b(this, localIntent, 33);
      AppMethodBeat.o(9838);
    }
  }

  static final class a extends j.f
  {
    private a()
    {
      super();
    }

    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      AppMethodBeat.i(9826);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        AppMethodBeat.o(9826);
      }
      while (true)
      {
        return;
        paramString = String.format("baidumap://map/direction?destination=%f,%f&mode=driving", new Object[] { Double.valueOf(parame2.latitude), Double.valueOf(parame2.longitude) });
        parame2 = paramString;
        if (parame1 != null)
          parame2 = paramString + String.format("origin=%f,%f", new Object[] { Double.valueOf(parame1.latitude), Double.valueOf(parame1.longitude) });
        ab.d("MicroMsg.OpenMapNavigator", "url ".concat(String.valueOf(parame2)));
        try
        {
          parame1 = new java/lang/StringBuilder;
          parame1.<init>();
          paramContext.startActivity(Intent.parseUri(parame2 + "&src=webapp.car.carroutelistmappg.weixindrivenav", 0));
          AppMethodBeat.o(9826);
        }
        catch (URISyntaxException paramContext)
        {
          ab.printErrStackTrace("MicroMsg.OpenMapNavigator", paramContext, "", new Object[0]);
          AppMethodBeat.o(9826);
        }
      }
    }

    protected final String getPackageName()
    {
      AppMethodBeat.i(9827);
      String str = a.a.vaX.getPackage();
      AppMethodBeat.o(9827);
      return str;
    }
  }

  static final class h extends j.f
  {
    private h()
    {
      super();
    }

    protected final void a(Context paramContext, j.e parame1, j.e parame2, String paramString)
    {
      AppMethodBeat.i(9834);
      if (paramContext == null)
      {
        super.a(paramContext, parame1, parame2, paramString);
        AppMethodBeat.o(9834);
        return;
      }
      String str1 = String.format("sosomap://type=nav&tocoord=%f,%f", new Object[] { Double.valueOf(parame2.longitude), Double.valueOf(parame2.latitude) });
      String str2 = str1;
      if (parame1 != null)
      {
        str1 = str1 + String.format("fromcoord=%f,%f", new Object[] { Double.valueOf(parame1.longitude), Double.valueOf(parame1.latitude) });
        str2 = str1;
        if (!bo.isNullOrNil(parame1.uIW))
          str2 = str1 + String.format("&from=%s", new Object[] { URLEncoder.encode(parame1.uIW) });
      }
      parame1 = paramString;
      if (bo.isNullOrNil(paramString))
        if (bo.isNullOrNil(parame2.uIW))
          break label285;
      label285: for (parame1 = parame2.uIW; ; parame1 = "地图选点")
      {
        parame1 = str2 + String.format("&to=%s", new Object[] { URLEncoder.encode(parame1) });
        parame1 = new Intent("android.intent.action.VIEW", Uri.parse(parame1 + "&referer=wx_client"));
        parame1.setPackage(a.a.vaU.getPackage());
        paramContext.startActivity(parame1);
        AppMethodBeat.o(9834);
        break;
      }
    }

    protected final String getPackageName()
    {
      AppMethodBeat.i(138443);
      String str = a.a.vaU.getPackage();
      AppMethodBeat.o(138443);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.j
 * JD-Core Version:    0.6.2
 */