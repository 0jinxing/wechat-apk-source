package com.tencent.mm.w;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;

final class b$f extends com.tencent.mm.plugin.fts.a.a.a
{
  private int eBl;
  private String eBm;
  private boolean eBp = false;

  public b$f(b paramb, String paramString)
  {
    this.eBm = paramString;
    this.eBl = 0;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(124483);
    ab.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[InsertFriendTask mEntityId: %s, mFriendType: %s]", new Object[] { this.eBm, Integer.valueOf(this.eBl) });
    if (this.eBl == 0)
    {
      Object localObject = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).vW(this.eBm);
      if (localObject == null)
      {
        this.eBp = true;
        AppMethodBeat.o(124483);
        return true;
      }
      localObject = new b.a((com.tencent.mm.plugin.account.friend.a.a)localObject);
      if (!b.a((b.a)localObject))
        break label113;
      b.a(this.eBa, (b.a)localObject);
    }
    while (true)
    {
      AppMethodBeat.o(124483);
      break;
      label113: this.eBp = true;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(124484);
    StringBuilder localStringBuilder = new StringBuilder("InsertFriend(\"").append(this.eBm).append("\", ").append(this.eBl).append(")");
    if (this.eBp);
    for (String str = " [skipped]"; ; str = "")
    {
      str = str;
      AppMethodBeat.o(124484);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b.f
 * JD-Core Version:    0.6.2
 */