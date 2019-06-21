package com.tencent.mm.plugin.game.luggage.c.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask;
import com.tencent.mm.protocal.protobuf.asm;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
{
  private String mAppId;
  List<bbb> mUj;
  Map<Integer, a> mUk;

  public b(String paramString)
  {
    AppMethodBeat.i(135891);
    this.mAppId = paramString;
    this.mUk = new HashMap();
    bDu();
    a(new h());
    a(new f());
    a(new j());
    a(new g());
    a(new i());
    a(new d());
    a(new e());
    AppMethodBeat.o(135891);
  }

  private void a(a parama)
  {
    AppMethodBeat.i(135892);
    this.mUk.put(Integer.valueOf(parama.id), parama);
    AppMethodBeat.o(135892);
  }

  private void bDu()
  {
    AppMethodBeat.i(135893);
    this.mUj = com.tencent.mm.plugin.webview.ui.tools.game.menu.a.uEt;
    try
    {
      Object localObject1 = new com/tencent/mm/plugin/game/luggage/ipc/CommonLogicTask;
      ((CommonLogicTask)localObject1).<init>();
      ((CommonLogicTask)localObject1).type = 9;
      ((CommonLogicTask)localObject1).mqu.putString("game_hv_menu_appid", this.mAppId);
      AppBrandMainProcessService.b((MainProcessTask)localObject1);
      localObject1 = ((CommonLogicTask)localObject1).mqu.getString("game_hv_menu_pbcache");
      if (!bo.isNullOrNil((String)localObject1))
      {
        localObject2 = ((String)localObject1).getBytes("ISO-8859-1");
        localObject1 = new com/tencent/mm/protocal/protobuf/asm;
        ((asm)localObject1).<init>();
        ((asm)localObject1).parseFrom((byte[])localObject2);
        if (!bo.ek(((asm)localObject1).wvX))
        {
          this.mUj = ((asm)localObject1).wvX;
          ab.i("MicroMsg.H5GameMenuHelp", "use net menu data");
        }
      }
      Collections.sort(this.mUj, new b.1(this));
      int i = ((bbb)this.mUj.get(this.mUj.size() - 1)).wFR;
      localObject1 = new ArrayList();
      for (int j = 0; j < i; j++)
        ((List)localObject1).add(null);
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.H5GameMenuHelp", "get cache hv game menu fail! exception:%s", new Object[] { localException.getMessage() });
      Object localObject2 = this.mUj.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        bbb localbbb = (bbb)((Iterator)localObject2).next();
        if ((localbbb.wFR > 0) && (localbbb.wFR <= localException.size()))
          localException.set(localbbb.wFR - 1, localbbb);
      }
      this.mUj = localException;
      AppMethodBeat.o(135893);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.b
 * JD-Core Version:    0.6.2
 */