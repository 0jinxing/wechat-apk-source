package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

final class m$3
  implements j.a
{
  m$3(m paramm)
  {
  }

  public final void f(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(112060);
    if ((!paramBoolean) || (this.nkr.nko == null) || (paramString == null))
      AppMethodBeat.o(112060);
    while (true)
    {
      return;
      Object localObject;
      try
      {
        localObject = this.nkr.nko.values().iterator();
        while (((Iterator)localObject).hasNext())
        {
          k localk = (k)((Iterator)localObject).next();
          if ((localk != null) && (localk.mVZ != null) && ((localk.mVZ.field_appId.equals(paramString)) || (localk.mVZ.field_packageName.equals(paramString))))
          {
            localk.ei(this.nkr.mContext);
            localk.biT();
          }
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.GameListAdapter", paramString.getMessage());
        AppMethodBeat.o(112060);
      }
      continue;
      for (paramInt = 0; ; paramInt++)
      {
        if (paramInt >= this.nkr.mYj.size())
          break label250;
        localObject = (c)this.nkr.mYj.get(paramInt);
        if ((((c)localObject).type == 0) && ((((c)localObject).field_appId.equals(paramString)) || (((c)localObject).field_packageName.equals(paramString))) && (m.a(this.nkr) != null))
        {
          m.a(this.nkr).wF(paramInt);
          AppMethodBeat.o(112060);
          break;
        }
      }
      label250: AppMethodBeat.o(112060);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.m.3
 * JD-Core Version:    0.6.2
 */