package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.c;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class k$5 extends m
{
  private m uJF;

  k$5(k paramk)
  {
    AppMethodBeat.i(9942);
    this.uJF = new m();
    AppMethodBeat.o(9942);
  }

  private m dcW()
  {
    AppMethodBeat.i(9943);
    m localm = this.uJE.aGt();
    if (localm == null)
    {
      localm = this.uJF;
      AppMethodBeat.o(9943);
    }
    while (true)
    {
      return localm;
      AppMethodBeat.o(9943);
    }
  }

  public final boolean IZ(int paramInt)
  {
    AppMethodBeat.i(9944);
    boolean bool = dcW().IZ(paramInt);
    AppMethodBeat.o(9944);
    return bool;
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(9954);
    dcW().W(paramBundle);
    AppMethodBeat.o(9954);
  }

  public final void X(Bundle paramBundle)
  {
    AppMethodBeat.i(9960);
    dcW().X(paramBundle);
    AppMethodBeat.o(9960);
  }

  public final boolean a(c paramc)
  {
    AppMethodBeat.i(9946);
    boolean bool;
    if (this.uJE.fow == null)
    {
      bool = true;
      AppMethodBeat.o(9946);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.MMWebViewClient", "onSceneEnd, instance hashcode = " + this.uJE.fow.hashCode());
      int i = paramc.getType();
      int j = paramc.cYW();
      int k = paramc.cYX();
      String str = paramc.adx();
      Bundle localBundle = paramc.getData();
      this.uJE.mHandler.post(new k.5.8(this, i, j, k, str, localBundle));
      bool = dcW().a(paramc);
      AppMethodBeat.o(9946);
    }
  }

  public final boolean a(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(9947);
    if (this.uJE.uDd == null)
      AppMethodBeat.o(9947);
    while (true)
    {
      return false;
      this.uJE.mHandler.post(new k.5.9(this, paramString1, paramString2, paramBundle, paramBoolean));
      dcW().a(paramString1, paramString2, paramBundle, paramBoolean);
      AppMethodBeat.o(9947);
    }
  }

  public final void afd(String paramString)
  {
    AppMethodBeat.i(9955);
    dcW().afd(paramString);
    AppMethodBeat.o(9955);
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9945);
    ab.i("MicroMsg.MMWebViewClient", "callback, actionCode = ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.MMWebViewClient", "undefine action code!!!");
    case 1002:
    case 1003:
    case 1008:
    case 1007:
    case 2003:
    case 2004:
    case 2005:
    case 2006:
    case 2010:
    case 2002:
    case 2008:
    case 1006:
    case 90:
    case 40001:
    case 40002:
    }
    while (true)
    {
      dcW().c(paramInt, paramBundle);
      AppMethodBeat.o(9945);
      return true;
      this.uJE.mHandler.post(new k.5.1(this, paramBundle));
      continue;
      this.uJE.mHandler.post(new k.5.10(this, paramBundle));
      continue;
      this.uJE.mHandler.post(new k.5.11(this, paramBundle));
      continue;
      long l = paramBundle.getLong("download_manager_downloadid");
      final int i = paramBundle.getInt("download_manager_progress");
      Object localObject = paramBundle.getString("download_manager_appid", "");
      this.uJE.mHandler.post(new k.5.12(this, (String)localObject, l, i));
      continue;
      localObject = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      this.uJE.mHandler.post(new k.5.13(this, (String)localObject, i));
      continue;
      localObject = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      this.uJE.mHandler.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(9938);
          if (k.5.this.uJE.uDd != null)
            k.5.this.uJE.uDd.dI(this.uut, i);
          AppMethodBeat.o(9938);
        }
      });
      continue;
      localObject = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      this.uJE.mHandler.post(new k.5.15(this, (String)localObject, i));
      continue;
      localObject = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      this.uJE.mHandler.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(9940);
          if (k.5.this.uJE.uDd != null)
            k.5.this.uJE.uDd.dK(this.uut, i);
          AppMethodBeat.o(9940);
        }
      });
      continue;
      localObject = paramBundle.getString("webview_jssdk_file_item_local_id");
      i = paramBundle.getInt("webview_jssdk_file_item_progreess");
      this.uJE.mHandler.post(new k.5.17(this, (String)localObject, i));
      continue;
      localObject = new HashMap();
      ((Map)localObject).put("err_msg", paramBundle.getString("playResult"));
      ((Map)localObject).put("localId", paramBundle.getString("localId"));
      this.uJE.mHandler.post(new k.5.2(this, (Map)localObject));
      continue;
      localObject = new HashMap();
      ((Map)localObject).put("localId", paramBundle.getString("localId"));
      ((Map)localObject).put("err_msg", paramBundle.getString("recordResult"));
      this.uJE.mHandler.post(new k.5.3(this, (Map)localObject));
      continue;
      if (this.uJE.uDd != null)
      {
        this.uJE.mHandler.post(new k.5.4(this, paramBundle));
        continue;
        if (this.uJE.uDd != null)
        {
          this.uJE.mHandler.post(new k.5.5(this, paramBundle));
          continue;
          if (this.uJE.uDd != null)
          {
            localObject = paramBundle.getString("err_msg");
            this.uJE.mHandler.post(new k.5.6(this, (String)localObject));
            continue;
            localObject = paramBundle.getString("uuid");
            int j = paramBundle.getInt("major");
            i = paramBundle.getInt("minor");
            double d1 = paramBundle.getDouble("accuracy");
            double d2 = paramBundle.getDouble("rssi");
            float f = paramBundle.getFloat("heading");
            if (this.uJE.uDd != null)
            {
              String str = paramBundle.getString("err_msg");
              this.uJE.mHandler.post(new k.5.7(this, str, (String)localObject, j, i, d1, d2, f));
            }
          }
        }
      }
    }
  }

  public final String cYY()
  {
    return this.uJE.uJt;
  }

  public final String cYZ()
  {
    AppMethodBeat.i(9949);
    String str = dcW().cYZ();
    AppMethodBeat.o(9949);
    return str;
  }

  public final void cZb()
  {
    AppMethodBeat.i(9953);
    if (this.uJE.uDd != null)
      this.uJE.uDd.cZb();
    AppMethodBeat.o(9953);
  }

  public final void cZc()
  {
    AppMethodBeat.i(9957);
    if (this.uJE.uDd != null)
      this.uJE.uDd.cZc();
    AppMethodBeat.o(9957);
  }

  public final Bundle dj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9963);
    paramString1 = dcW().dj(paramString1, paramString2);
    AppMethodBeat.o(9963);
    return paramString1;
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9958);
    dcW().e(paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(9958);
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9959);
    Bundle localBundle;
    if (paramInt == 146)
    {
      localBundle = new Bundle();
      paramBundle = paramBundle.getString("_url");
      if (bo.isNullOrNil(paramBundle))
      {
        AppMethodBeat.o(9959);
        paramBundle = localBundle;
      }
    }
    while (true)
    {
      return paramBundle;
      paramBundle = this.uJE.uFu.aei(paramBundle);
      if (paramBundle == null)
      {
        AppMethodBeat.o(9959);
        paramBundle = localBundle;
      }
      else
      {
        localBundle.putParcelable("_permission_wrapper", paramBundle);
        AppMethodBeat.o(9959);
        paramBundle = localBundle;
        continue;
        paramBundle = dcW().g(paramInt, paramBundle);
        AppMethodBeat.o(9959);
      }
    }
  }

  public final String getCurrentUrl()
  {
    AppMethodBeat.i(9948);
    String str = k.c(this.uJE);
    AppMethodBeat.o(9948);
    return str;
  }

  public final void hd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9956);
    dcW().hd(paramString1, paramString2);
    AppMethodBeat.o(9956);
  }

  public final void he(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9962);
    dcW().he(paramString1, paramString2);
    AppMethodBeat.o(9962);
  }

  public final void nJ(boolean paramBoolean)
  {
    AppMethodBeat.i(9950);
    dcW().nJ(paramBoolean);
    AppMethodBeat.o(9950);
  }

  public final void nK(boolean paramBoolean)
  {
    AppMethodBeat.i(9951);
    dcW().nK(paramBoolean);
    AppMethodBeat.o(9951);
  }

  public final void nL(boolean paramBoolean)
  {
    AppMethodBeat.i(9961);
    dcW().nL(paramBoolean);
    AppMethodBeat.o(9961);
  }

  public final void q(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9952);
    dcW().q(paramInt, paramBundle);
    AppMethodBeat.o(9952);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5
 * JD-Core Version:    0.6.2
 */