package com.tencent.mm.plugin.webview.ui.tools.game;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.qqvideo.proxy.api.FactoryProxyManager;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.xweb.b;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class a$4 extends com.tencent.mm.plugin.webview.ui.tools.widget.m
{
  a$4(a parama)
  {
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(8654);
    ab.i("MicroMsg.GameFloatWebView", "closeWindow");
    try
    {
      this.uDk.SW.removeView(this.uDk.fow);
      this.uDk.onDestroy();
      AppMethodBeat.o(8654);
      return;
    }
    catch (Exception paramBundle)
    {
      while (true)
        AppMethodBeat.o(8654);
    }
  }

  public final Bundle g(final int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8655);
    ab.i("MicroMsg.GameFloatWebView", "game float invokeAsResult, actionCode = ".concat(String.valueOf(paramInt)));
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.GameFloatWebView", "undefine action code!!!");
    case 101:
    case 18:
    case 99:
    case 5001:
    case 5002:
    case 5003:
    case 5004:
    case 5005:
    case 5006:
    case 5007:
    case 37:
    case 79:
    case 43:
    case 6001:
    case 53:
    case 90001:
    case 90002:
    case 84:
    case 54:
    case 87:
    case 95:
    case 252:
    case 253:
    }
    while (true)
    {
      AppMethodBeat.o(8655);
      return localBundle;
      paramBundle.setClassLoader(GameWebViewUI.class.getClassLoader());
      com.tencent.mm.bp.d.b(this.uDk.mContext, paramBundle.getString("open_ui_with_webview_ui_plugin_name"), paramBundle.getString("open_ui_with_webview_ui_plugin_entry"), new Intent().putExtras(paramBundle.getBundle("open_ui_with_webview_ui_extras")).putExtra("KPublisherId", h.cMm));
      continue;
      localBundle.putString("KPublisherId", h.cMm);
      localBundle.putInt("getA8KeyScene", this.uDk.dF(h.uEm, h.cSQ));
      continue;
      paramInt = h.cSQ;
      localBundle.putInt("geta8key_scene", paramInt);
      ab.i("MicroMsg.GameFloatWebView", "Key value: getA8KeyScene(%d)", new Object[] { Integer.valueOf(paramInt) });
      continue;
      if (this.uDk.uzS.isSDCardAvailable())
      {
        long l = bd.dpq();
        ab.i("MicroMsg.GameFloatWebView", "availableSize = %d", new Object[] { Long.valueOf(l) });
        if (l < 524288000L)
        {
          ab.e("MicroMsg.GameFloatWebView", "available size not enough");
          label415: paramInt = FactoryProxyManager.getPlayManager().init(this.uDk.mContext, null);
        }
      }
      boolean bool;
      while (true)
      {
        localBundle.putInt("webview_video_proxy_init", paramInt);
        break;
        paramBundle = new File(com.tencent.mm.plugin.webview.a.ueu);
        bool = true;
        if (!paramBundle.exists())
        {
          bool = paramBundle.mkdirs();
          ab.i("MicroMsg.GameFloatWebView", "create proxy cache path : %s, %b", new Object[] { paramBundle.getAbsolutePath(), Boolean.valueOf(bool) });
        }
        if (!bool)
          break label415;
        paramInt = FactoryProxyManager.getPlayManager().init(this.uDk.mContext, com.tencent.mm.plugin.webview.a.ueu);
        FactoryProxyManager.getPlayManager().setMaxStorageSize(200L);
        continue;
        ab.i("MicroMsg.GameFloatWebView", "sdcard not available");
        paramInt = FactoryProxyManager.getPlayManager().init(this.uDk.mContext, null);
      }
      final String str1 = paramBundle.getString("webview_video_proxy_cdn_urls");
      Object localObject = paramBundle.getString("webview_video_proxy_fileId");
      int i = paramBundle.getInt("webview_video_proxy_file_size");
      int j = paramBundle.getInt("webview_video_proxy_file_duration");
      paramInt = paramBundle.getInt("webview_video_proxy_file_type");
      int k = FactoryProxyManager.getPlayManager().startPlay(str1, paramInt, (String)localObject, i, j);
      paramBundle = FactoryProxyManager.getPlayManager().buildPlayURLMp4(k);
      ab.i("MicroMsg.GameFloatWebView", "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d, playDataId = %d, localUrl = %s", new Object[] { str1, localObject, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt), Integer.valueOf(k), paramBundle });
      localBundle.putInt("webview_video_proxy_play_data_id", k);
      localBundle.putString("webview_video_proxy_local_url", paramBundle);
      continue;
      paramInt = paramBundle.getInt("webview_video_proxy_play_data_id");
      ab.i("MicroMsg.GameFloatWebView", "webview proxy stop play, play id = %d", new Object[] { Integer.valueOf(paramInt) });
      if (paramInt > 0)
      {
        FactoryProxyManager.getPlayManager().stopPlay(paramInt);
        continue;
        paramInt = paramBundle.getInt("webview_video_proxy_play_state");
        FactoryProxyManager.getPlayManager().setPlayerState(paramInt);
        continue;
        paramInt = paramBundle.getInt("webview_video_proxy_net_state");
        FactoryProxyManager.getPlayManager().setNetWorkState(paramInt);
        continue;
        k = paramBundle.getInt("webview_video_proxy_play_data_id");
        paramInt = paramBundle.getInt("webview_video_proxy_play_remain_time");
        FactoryProxyManager.getPlayManager().setRemainTime(k, paramInt);
        continue;
        paramInt = paramBundle.getInt("webview_video_proxy_play_data_id");
        k = paramBundle.getInt("webview_video_proxy_preload_duration");
        ab.i("MicroMsg.GameFloatWebView", "playid = %d, duration = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(k) });
        localBundle.putInt("webview_video_proxy_pre_load_result", FactoryProxyManager.getPlayManager().preLoad(paramInt, k));
        continue;
        str1 = paramBundle.getString("show_kb_placeholder");
        paramInt = paramBundle.getInt("show_kb_max_length");
        this.uDk.uDb.runOnUiThread(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(8650);
            a.4.this.uDk.uDb.dE(str1, paramInt);
            AppMethodBeat.o(8650);
          }
        });
        continue;
        this.uDk.uDb.runOnUiThread(new a.4.2(this, localBundle));
        continue;
        str1 = paramBundle.getString("set_page_title_text");
        paramInt = g.bx(paramBundle.getString("set_page_title_color"), this.uDk.uDb.getResources().getColor(2131689640));
        this.uDk.uDb.runOnUiThread(new a.4.3(this, str1, paramInt));
        continue;
        bool = paramBundle.getBoolean("clear_webview_cache_clear_cookie", false);
        ab.i("MicroMsg.GameFloatWebView", "includeCookie = %b", new Object[] { Boolean.valueOf(bool) });
        paramBundle = new Intent();
        paramBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
        paramBundle.putExtra("tools_clean_webview_cache_ignore_cookie", bool);
        com.tencent.mm.cj.c.aZ(paramBundle);
        continue;
        this.uDk.uDb.runOnUiThread(new a.4.4(this, paramBundle));
        continue;
        str1 = getCurrentUrl();
        paramBundle = b.dTR().getCookie(str1);
        ab.i("MicroMsg.GameFloatWebView", "url = %s, cookie = %s", new Object[] { str1, paramBundle });
        localBundle.putString("cookie", paramBundle);
        localBundle.putFloat("density", com.tencent.mm.bz.a.getDensity(this.uDk.uDb));
        continue;
        str1 = paramBundle.getString("traceid");
        paramBundle = paramBundle.getString("username");
        com.tencent.mm.plugin.webview.ui.tools.m.uuj.hg(str1, paramBundle);
        continue;
        paramBundle = this.uDk.uDb.mController.getMMTitle();
        str1 = getCurrentUrl();
        localBundle.putString("webview_current_url", str1);
        if (paramBundle != null);
        for (paramBundle = paramBundle.toString(); ; paramBundle = "")
        {
          localBundle.putString("webview_current_title", paramBundle);
          localBundle.putString("webview_current_desc", str1);
          break;
        }
        bool = paramBundle.getBoolean("add_shortcut_status");
        if (this.uDk.uDd != null)
        {
          this.uDk.uDd.oa(bool);
          continue;
          bool = this.uDk.uDf.dbV();
          String str2 = this.uDk.uDf.dbW();
          localObject = this.uDk.uDf.dbX();
          if (bool)
          {
            localBundle.putString("result", "not_return");
          }
          else
          {
            localBundle.putString("full_url", bo.nullAsNil(str2));
            if ((localObject != null) && (((Map)localObject).size() != 0))
            {
              localBundle.putInt("set_cookie", 1);
              com.tencent.xweb.c.jx(ah.getContext());
              b localb = b.dTR();
              paramBundle = ((Map)localObject).keySet().iterator();
              while (paramBundle.hasNext())
              {
                str1 = (String)paramBundle.next();
                localb.setCookie(bo.nullAsNil(str2), str1 + "=" + (String)((Map)localObject).get(str1));
              }
              com.tencent.xweb.c.dTT();
              com.tencent.xweb.c.sync();
              ab.i("MicroMsg.GameFloatWebView", "cookies:%s", new Object[] { localb.getCookie(bo.nullAsNil(str2)) });
            }
            else
            {
              localBundle.putInt("set_cookie", 0);
              continue;
              this.uDk.mUY.uDp.ao(paramBundle);
              ab.i("MicroMsg.GameFloatWebView", "set game float page time data");
              continue;
              this.uDk.mUN.eBQ = 1;
              this.uDk.mVc.uDQ = System.currentTimeMillis();
              continue;
              this.uDk.mVc.uDR = System.currentTimeMillis();
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.4
 * JD-Core Version:    0.6.2
 */