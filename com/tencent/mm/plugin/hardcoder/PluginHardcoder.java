package com.tencent.mm.plugin.hardcoder;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.i;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PluginHardcoder extends f
  implements com.tencent.mm.kernel.api.bucket.c, b
{
  private k.a foI;
  private com.tencent.mm.sdk.b.c nqj;
  private Runnable nqk;

  public PluginHardcoder()
  {
    AppMethodBeat.i(60256);
    this.foI = new PluginHardcoder.2(this);
    this.nqj = new PluginHardcoder.3(this);
    this.nqk = new PluginHardcoder.4(this);
    AppMethodBeat.o(60256);
  }

  private void reloadHardcoderConfig()
  {
    AppMethodBeat.i(60262);
    Object localObject1 = com.tencent.mm.model.c.c.abi().ll("100282");
    ab.i("MicroMsg.PluginHardcoder", "reloadHardcoderConfig abTest[%s][%b][%s]", new Object[] { localObject1, Boolean.valueOf(((com.tencent.mm.storage.c)localObject1).isValid()), ((com.tencent.mm.storage.c)localObject1).dru() });
    SharedPreferences.Editor localEditor;
    Object localObject2;
    int i;
    boolean bool1;
    label113: boolean bool2;
    label127: int j;
    label159: label171: label203: label215: long l;
    label338: Object localObject3;
    String str;
    label414: label420: label426: label432: label438: label444: label450: label456: int k;
    int m;
    if (((com.tencent.mm.storage.c)localObject1).isValid())
    {
      ab.i("MicroMsg.PluginHardcoder", "reloadHardcoderConfig abTest valid!");
      localEditor = ah.getContext().getSharedPreferences("hardcoder_setting", 0).edit();
      localObject1 = ((com.tencent.mm.storage.c)localObject1).dru();
      localObject2 = (String)((Map)localObject1).get("enable");
      if (WXHardCoderJNI.getEnable())
      {
        i = 1;
        if (bo.getInt((String)localObject2, i) <= 0)
          break label414;
        bool1 = true;
        if ((!bool1) || (WXHardCoderJNI.getEnable()))
          break label420;
        bool2 = true;
        localEditor.putBoolean("KEY_HC_ENABLE", bool1);
        localObject2 = (String)((Map)localObject1).get("bgenable");
        if (!WXHardCoderJNI.hcBgEnable)
          break label426;
        i = 1;
        if (bo.getInt((String)localObject2, i) <= 0)
          break label432;
        bool1 = true;
        localEditor.putBoolean("KEY_HC_BG_ENABLE", bool1);
        localObject2 = (String)((Map)localObject1).get("debug");
        if (!WXHardCoderJNI.getDebug())
          break label438;
        i = 1;
        if (bo.getInt((String)localObject2, i) <= 0)
          break label444;
        bool1 = true;
        localEditor.putBoolean("KEY_HC_DEBUG", bool1);
        localEditor.putInt("KEY_HC_KV_PER", bo.getInt((String)((Map)localObject1).get("kvper"), WXHardCoderJNI.hcUinHash));
        localEditor.putInt("KEY_HC_KV_FT", bo.getInt((String)((Map)localObject1).get("kvft"), WXHardCoderJNI.hcUinHash));
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RN();
        j = i.bL(com.tencent.mm.kernel.a.QF(), 100);
        localEditor.putInt("KEY_HC_UIN_HASH", j);
        l = bo.getLong((String)((Map)localObject1).get("scene"), -1L);
        localObject2 = WXHardCoderJNI.flagKeyMap.entrySet().iterator();
        if (!((Iterator)localObject2).hasNext())
          break label456;
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        str = (String)((Map.Entry)localObject3).getValue();
        if ((((Long)((Map.Entry)localObject3).getKey()).longValue() & l) == 0L)
          break label450;
      }
      for (bool1 = true; ; bool1 = false)
      {
        localEditor.putBoolean(str, bool1);
        break label338;
        i = 0;
        break;
        bool1 = false;
        break label113;
        bool2 = false;
        break label127;
        i = 0;
        break label159;
        bool1 = false;
        break label171;
        i = 0;
        break label203;
        bool1 = false;
        break label215;
      }
      k = bo.getInt((String)((Map)localObject1).get("margin"), WXHardCoderJNI.hcTimeoutMargin);
      localEditor.putInt("KEY_HC_TIMEOUT_MARGIN", k);
      m = bo.getInt((String)((Map)localObject1).get("retryitv"), WXHardCoderJNI.hcRetryInterval);
      localEditor.putInt("KEY_HC_RETRY_INTERVAL", m);
      localObject2 = bo.bc((String)((Map)localObject1).get("model"), "");
      localObject3 = Build.MODEL;
      str = bo.bc((String)((Map)localObject1).get("manufacturer"), "");
      localObject1 = Build.MANUFACTURER;
      if ((str.length() <= 0) && (((String)localObject2).length() <= 0))
        break label845;
      bool1 = str.contains((CharSequence)localObject1);
      if (bool1)
        break label856;
      bool1 = ((String)localObject2).contains((CharSequence)localObject3);
    }
    label645: label839: label845: label856: 
    while (true)
    {
      if (bool1)
      {
        i = 10;
        WXHardCoderJNI.reportIDKey(true, i, 1, true);
        localEditor.putBoolean("KEY_HC_ENABLE", bool1);
        if ((!bool1) || (WXHardCoderJNI.getEnable()))
          break label839;
        bool2 = true;
        ab.i("MicroMsg.PluginHardcoder", "reloadHardcoderConfig check manufacturer[%s] manufacturerlist[%s] model[%s] modellist[%s] enable[%b] init[%b]", new Object[] { localObject1, str, localObject3, localObject2, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      }
      while (true)
      {
        localEditor.apply();
        WXHardCoderJNI.reloadSPConfig(WXHardCoderJNI.RELOAD_SCENE_ABTEST);
        ab.i("MicroMsg.PluginHardcoder", "reloadHardcoderConfig enable[%b] init[%b] bgEnable[%b] debug[%b] uinHash[%d] kv[%b, %b] sceneFlag[%d] margin[%d] retryInterval[%d] model[%s]", new Object[] { Boolean.valueOf(WXHardCoderJNI.getEnable()), Boolean.valueOf(bool2), Boolean.valueOf(WXHardCoderJNI.hcBgEnable), Boolean.valueOf(WXHardCoderJNI.getDebug()), Integer.valueOf(j), Boolean.valueOf(WXHardCoderJNI.hcKVPerReport), Boolean.valueOf(WXHardCoderJNI.hcKVFtReport), Long.valueOf(l), Integer.valueOf(k), Integer.valueOf(m), localObject2 });
        if (bool2)
          WXHardCoderJNI.initHardCoder(a.bFR(), a.bFR());
        AppMethodBeat.o(60262);
        return;
        i = 11;
        break;
        bool2 = false;
        break label645;
        WXHardCoderJNI.reportIDKey(true, 12, 1, true);
      }
    }
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(60259);
    com.tencent.mm.sdk.g.d.post(new PluginHardcoder.1(this), "initHardCoder");
    AppMethodBeat.o(60259);
  }

  public void dependency()
  {
    AppMethodBeat.i(60258);
    dependsOn(com.tencent.mm.plugin.zero.a.d.class);
    dependsOn(com.tencent.mm.plugin.report.c.class);
    AppMethodBeat.o(60258);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public void installed()
  {
    AppMethodBeat.i(60257);
    alias(b.class);
    AppMethodBeat.o(60257);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(60260);
    if (ah.bqo())
    {
      com.tencent.mm.sdk.b.a.xxA.b(this.nqj);
      com.tencent.mm.model.c.c.abi().c(this.foI);
      ab.i("MicroMsg.PluginHardcoder", "onAccountInitialized abTestListener[%s]", new Object[] { this.foI });
      paramc = ah.getContext().getSharedPreferences("hardcoder_setting", 0);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN();
      if (com.tencent.mm.kernel.a.QF() != 0)
      {
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RN();
        int i = i.bL(com.tencent.mm.kernel.a.QF(), 100);
        if (i != paramc.getInt("KEY_HC_UIN_HASH", 0))
        {
          ab.i("MicroMsg.PluginHardcoder", "onAccountInitialized hardcoder uinHash[%d] reloadSPConfig", new Object[] { Integer.valueOf(i) });
          paramc.edit().putInt("KEY_HC_UIN_HASH", i).apply();
          WXHardCoderJNI.reloadSPConfig(WXHardCoderJNI.RELOAD_SCENE_POST_RESET);
        }
      }
    }
    AppMethodBeat.o(60260);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(60261);
    if (ah.bqo())
    {
      com.tencent.mm.model.c.c.abi().d(this.foI);
      com.tencent.mm.sdk.b.a.xxA.d(this.nqj);
    }
    AppMethodBeat.o(60261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.PluginHardcoder
 * JD-Core Version:    0.6.2
 */