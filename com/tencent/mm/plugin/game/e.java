package com.tencent.mm.plugin.game;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.api.bucket.d;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.model.r;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class e
  implements com.tencent.mm.kernel.api.bucket.a, d, c
{
  private r mTk;
  private w mTl;
  private com.tencent.mm.plugin.game.model.a.g mTm;

  public final r bCY()
  {
    AppMethodBeat.i(111174);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.mTk == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.mTk = new r(com.tencent.mm.kernel.g.RP().eJN);
    }
    r localr = this.mTk;
    AppMethodBeat.o(111174);
    return localr;
  }

  public final w bCZ()
  {
    AppMethodBeat.i(111175);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.mTl == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.mTl = new w(com.tencent.mm.kernel.g.RP().eJN);
    }
    w localw = this.mTl;
    AppMethodBeat.o(111175);
    return localw;
  }

  public final com.tencent.mm.plugin.game.model.a.g bDa()
  {
    AppMethodBeat.i(111176);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.mTm == null)
    {
      com.tencent.mm.kernel.g.RQ();
      this.mTm = new com.tencent.mm.plugin.game.model.a.g(com.tencent.mm.kernel.g.RP().eJN);
    }
    com.tencent.mm.plugin.game.model.a.g localg = this.mTm;
    AppMethodBeat.o(111176);
    return localg;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(111173);
    ab.i("MicroMsg.GameStorage", "GameStorage collectDatabaseFactory");
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("GAME_CENTER_MSG_INFO_TABLE".hashCode()), new e.1(this));
    localHashMap.put(Integer.valueOf("GAME_CENTER_PB_CACHE_TABLE".hashCode()), new e.2(this));
    localHashMap.put(Integer.valueOf("GAME_CENTER_SILENT_DOWNLOAD_TABLE".hashCode()), new e.3(this));
    localHashMap.put(Integer.valueOf("CHECK_WEPKG_VERSION".hashCode()), new e.4(this));
    localHashMap.put(Integer.valueOf("WEPKG_PRELOAD_FILES".hashCode()), new e.5(this));
    localHashMap.put(Integer.valueOf("WEPKG_DIFF_PACK".hashCode()), new e.6(this));
    AppMethodBeat.o(111173);
    return localHashMap;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(111172);
    ab.i("MicroMsg.GameStorage", "GameStorage onDataBaseOpened");
    this.mTk = new r(paramh1);
    this.mTm = new com.tencent.mm.plugin.game.model.a.g(paramh1);
    AppMethodBeat.o(111172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.e
 * JD-Core Version:    0.6.2
 */