package com.tencent.mm.plugin.webview.ui.tools.emojistore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.59;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.ui.tools.o.b;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.Map;

public class BaseEmojiStoreSearchWebViewUI extends WebViewUI
  implements o.b
{
  private o jKT;
  String query;
  private int type;
  private boolean uzU;
  private boolean uzV = true;
  private int uzW;

  public final void aMh()
  {
    AppMethodBeat.i(8293);
    super.aMh();
    this.query = getIntent().getStringExtra("keyword");
    this.type = getIntent().getIntExtra("type", 0);
    this.uzU = getIntent().getBooleanExtra("showkeyboard", false);
    this.uzW = getIntent().getIntExtra("sence", 0);
    this.pzf.setWebViewClient(new BaseEmojiStoreSearchWebViewUI.a(this, (byte)0));
    this.pzf.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(8288);
        BaseEmojiStoreSearchWebViewUI.this.aqX();
        AppMethodBeat.o(8288);
        return false;
      }
    });
    this.jKT = new o();
    a(this.jKT);
    this.jKT.qQ(false);
    this.jKT.zHa = this;
    showOptionMenu(false);
    if (dao() != null)
      dao().nM(true);
    this.pzf.setOnLongClickListener(new BaseEmojiStoreSearchWebViewUI.2(this));
    AppMethodBeat.o(8293);
  }

  public final void apo()
  {
    AppMethodBeat.i(8295);
    finish();
    AppMethodBeat.o(8295);
  }

  public final void app()
  {
  }

  public final void apq()
  {
    AppMethodBeat.i(8298);
    this.jKT.dJt();
    showVKB();
    AppMethodBeat.o(8298);
  }

  public final void apr()
  {
  }

  public final void dai()
  {
    AppMethodBeat.i(8300);
    finish();
    AppMethodBeat.o(8300);
  }

  public final boolean day()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130969388;
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(8294);
    if (this.jKT != null)
    {
      this.jKT.a(this, paramMenu);
      this.jKT.setHint(getString(2131299079));
    }
    AppMethodBeat.o(8294);
    return true;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8301);
    super.onDestroy();
    AppMethodBeat.o(8301);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public void t(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8299);
    ab.i("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "handleEmojiStoreAction action:%d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      super.t(paramInt, paramBundle);
      AppMethodBeat.o(8299);
    case 80001:
    case 80002:
    }
    while (true)
    {
      return;
      String str1 = paramBundle.getString("emoji_store_json_data");
      boolean bool = paramBundle.getBoolean("emoji_store_new_query", true);
      String str2 = paramBundle.getString("emoji_store_page_buf");
      long l = paramBundle.getLong("emoji_store_search_id");
      paramBundle = this.uhz;
      if (!paramBundle.ready)
      {
        ab.e("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData fail, not ready");
        AppMethodBeat.o(8299);
      }
      else
      {
        ab.i("MicroMsg.JsApiHandler", "onEmojiStoreGetSearchData success, ready");
        HashMap localHashMap = new HashMap();
        localHashMap.put("json", str1);
        localHashMap.put("newQuery", Boolean.valueOf(bool));
        localHashMap.put("nextPageBuffer", str2);
        ab.d("MicroMsg.JsApiHandler", "cpan emoji set SearchID:%d", new Object[] { Long.valueOf(l) });
        paramBundle.uFH = l;
        str2 = i.a.b("getSearchEmotionDataCallBack", localHashMap, paramBundle.uFv, paramBundle.uFw);
        ab.i("MicroMsg.JsApiHandler", "event:%s", new Object[] { str2 });
        al.d(new d.59(paramBundle, str2));
        AppMethodBeat.o(8299);
        continue;
        this.uhz.dcn();
        AppMethodBeat.o(8299);
      }
    }
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(8297);
    String str = paramString;
    if (paramString != null)
      str = paramString.trim();
    this.query = str;
    if (!bo.isNullOrNil(str))
    {
      this.query = str;
      this.handler.post(new BaseEmojiStoreSearchWebViewUI.4(this));
      paramString = new Bundle();
      paramString.putInt("type", this.type);
      paramString.putString("nextPageBuffer", "");
      paramString.putString("keyword", this.query);
      paramString.putInt("webview_instance_id", hashCode());
      paramString.putLong("searchID", this.uhz.dcp());
    }
    try
    {
      if (this.icy != null)
        this.icy.r(1, paramString);
      while (true)
      {
        aqX();
        paramString = "";
        if (!bo.isNullOrNil(str))
          paramString = str.replace(",", " ");
        h.pYm.e(13054, new Object[] { Integer.valueOf(this.uzW), Integer.valueOf(1), paramString });
        AppMethodBeat.o(8297);
        return false;
        ab.e("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", "invoker should not be null");
      }
    }
    catch (RemoteException paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.emoji.BaseEmojiStoreSearchWebViewUI", paramString, "doSearch", new Object[0]);
    }
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(8296);
    if ((this.uzV) && (bo.isNullOrNil(paramString)))
    {
      this.uzV = false;
      if (!this.uzU)
      {
        al.n(new BaseEmojiStoreSearchWebViewUI.3(this), 500L);
        AppMethodBeat.o(8296);
      }
    }
    while (true)
    {
      return;
      this.jKT.dJt();
      showVKB();
      AppMethodBeat.o(8296);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.emojistore.BaseEmojiStoreSearchWebViewUI
 * JD-Core Version:    0.6.2
 */