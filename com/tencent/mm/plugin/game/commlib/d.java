package com.tencent.mm.plugin.game.commlib;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.plugin.game.commlib.b.b;
import java.util.HashMap;

public final class d
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.plugin.game.commlib.a.a
{
  private b mTu;

  public final byte[] NK(String paramString)
  {
    AppMethodBeat.i(59407);
    paramString = this.mTu.NK(paramString);
    AppMethodBeat.o(59407);
    return paramString;
  }

  public final void a(String paramString, com.tencent.mm.bt.a parama)
  {
    AppMethodBeat.i(59406);
    this.mTu.b(paramString, parama);
    AppMethodBeat.o(59406);
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(59408);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("GAME_CENTER_MSG_INFO_TABLE".hashCode()), new d.1(this));
    AppMethodBeat.o(59408);
    return localHashMap;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(59409);
    this.mTu = new b(paramh1);
    AppMethodBeat.o(59409);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.d
 * JD-Core Version:    0.6.2
 */