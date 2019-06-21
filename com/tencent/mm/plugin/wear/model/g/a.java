package com.tencent.mm.plugin.wear.model.g;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vk;
import com.tencent.mm.g.a.vk.b;
import com.tencent.mm.plugin.wear.ui.WearYoLockUI;
import com.tencent.mm.plugin.wear.ui.WearYoNoLockUI;
import com.tencent.mm.protocal.protobuf.cva;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private PowerManager tXN;
  private KeyguardManager tXO;
  LinkedHashMap<String, a.a> tYO;

  public a()
  {
    AppMethodBeat.i(26453);
    this.tYO = new LinkedHashMap();
    this.tXN = ((PowerManager)ah.getContext().getSystemService("power"));
    this.tXO = ((KeyguardManager)ah.getContext().getSystemService("keyguard"));
    AppMethodBeat.o(26453);
  }

  public static vk ady(String paramString)
  {
    AppMethodBeat.i(26454);
    vk localvk = new vk();
    localvk.cSs.cuy = 1;
    localvk.cSs.username = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localvk);
    AppMethodBeat.o(26454);
    return localvk;
  }

  public final void cUD()
  {
    AppMethodBeat.i(26455);
    if (ady(null).cSt.cSu != 0)
    {
      ab.i("MicroMsg.wear.WearYoLogic", "current show yo");
      AppMethodBeat.o(26455);
      return;
    }
    while (true)
    {
      while (true)
      {
        Object localObject5;
        synchronized (this.tYO)
        {
          Object localObject2 = this.tYO.entrySet().iterator();
          if (!((Iterator)localObject2).hasNext())
            break label297;
          localObject2 = (a.a)((Map.Entry)((Iterator)localObject2).next()).getValue();
          if (localObject2 != null)
            this.tYO.remove(((a.a)localObject2).svN);
          if (localObject2 != null)
          {
            localObject5 = ((a.a)localObject2).content;
            ??? = new cva();
            localObject5 = br.z((String)localObject5, "msg");
            if (localObject5 != null)
              break label233;
            ((cva)???).jCt = 0;
            label131: localObject5 = new Intent();
            ((Intent)localObject5).putExtra("key_talker", ((a.a)localObject2).svN);
          }
        }
        try
        {
          ((Intent)localObject5).putExtra("key_data", ((cva)???).toByteArray());
          label161: ((Intent)localObject5).addFlags(268435456);
          int i;
          if ((this.tXO.inKeyguardRestrictedInputMode()) || (!this.tXN.isScreenOn()))
          {
            i = 1;
            label191: if (i == 0)
              break label280;
            ((Intent)localObject5).setClass(ah.getContext(), WearYoLockUI.class);
          }
          while (true)
          {
            ah.getContext().startActivity((Intent)localObject5);
            AppMethodBeat.o(26455);
            break;
            localObject3 = finally;
            AppMethodBeat.o(26455);
            throw localObject3;
            label233: ((cva)???).jCt = bo.getInt((String)((Map)localObject5).get(".msg.yo.$type"), 0);
            ((cva)???).jBv = bo.getInt((String)((Map)localObject5).get(".msg.yo.$count"), 0);
            break label131;
            i = 0;
            break label191;
            label280: ((Intent)localObject5).setClass(ah.getContext(), WearYoNoLockUI.class);
          }
        }
        catch (IOException localIOException)
        {
          break label161;
        }
      }
      label297: Object localObject4 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.g.a
 * JD-Core Version:    0.6.2
 */