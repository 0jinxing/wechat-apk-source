package com.tencent.mm.w;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class b$c extends com.tencent.mm.plugin.fts.a.a.a
{
  private int eBl = 0;
  private int mCount = 0;

  public b$c(b paramb)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(124479);
    ab.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[DeleteAllFriendsTask mFriendType: %s]", new Object[] { Integer.valueOf(this.eBl) });
    if (this.eBl == 0)
      this.mCount = this.eBa.eAY.g(c.mCm, -1).size();
    AppMethodBeat.o(124479);
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(124480);
    String str = "DeleteAllFriends [" + this.mCount + ", " + this.eBl + "]";
    AppMethodBeat.o(124480);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b.c
 * JD-Core Version:    0.6.2
 */