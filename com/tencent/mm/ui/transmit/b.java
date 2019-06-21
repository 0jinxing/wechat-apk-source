package com.tencent.mm.ui.transmit;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.contact.a.e;
import com.tencent.mm.ui.contact.m;
import java.util.HashSet;
import java.util.List;

public final class b extends m
{
  private ak handler;
  j mEm;
  private com.tencent.mm.plugin.fts.a.a.a mEx;
  String query;
  private MMCreateChatroomUI zIJ;
  private com.tencent.mm.plugin.fts.a.l zIK;

  public b(MMCreateChatroomUI paramMMCreateChatroomUI, int paramInt)
  {
    super(paramMMCreateChatroomUI, false, paramInt);
    AppMethodBeat.i(35035);
    this.handler = new ak(Looper.getMainLooper());
    this.zIK = new b.1(this);
    this.zIJ = paramMMCreateChatroomUI;
    AppMethodBeat.o(35035);
  }

  public final void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    AppMethodBeat.i(35036);
    this.query = paramString;
    paramArrayOfInt = new com.tencent.mm.plugin.fts.a.a.i();
    paramArrayOfInt.handler = this.handler;
    paramArrayOfInt.mEw = this.zIK;
    paramArrayOfInt.query = paramString;
    paramArrayOfInt.mEv = com.tencent.mm.plugin.fts.a.c.b.mEV;
    paramArrayOfInt.mEr = new int[] { 131072 };
    paramArrayOfInt.mEu.add("filehelper");
    paramArrayOfInt.mEu.add(r.Yz());
    paramArrayOfInt.mEu.addAll(this.zIJ.zIN.dKe());
    this.mEx = ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).search(2, paramArrayOfInt);
    AppMethodBeat.o(35036);
  }

  public final void clearData()
  {
    AppMethodBeat.i(35037);
    if (this.mEx != null)
      ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.mEx);
    this.query = null;
    AppMethodBeat.o(35037);
  }

  public final int getCount()
  {
    AppMethodBeat.i(35039);
    int i;
    if ((this.mEm != null) && (this.mEm.mEy != null))
    {
      i = this.mEm.mEy.size();
      AppMethodBeat.o(35039);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(35039);
    }
  }

  public final com.tencent.mm.ui.contact.a.a mP(int paramInt)
  {
    AppMethodBeat.i(35038);
    com.tencent.mm.plugin.fts.a.a.l locall = (com.tencent.mm.plugin.fts.a.a.l)this.mEm.mEy.get(paramInt);
    Object localObject;
    if (locall.mDx.equals("no_result​"))
      localObject = new com.tencent.mm.ui.contact.a.i(paramInt);
    while (true)
    {
      ((com.tencent.mm.ui.contact.a.a)localObject).query = this.query;
      ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      ((com.tencent.mm.ui.contact.a.a)localObject).zmW = false;
      AppMethodBeat.o(35038);
      return localObject;
      localObject = new e(paramInt);
      ((e)localObject).hpS = locall;
      ((com.tencent.mm.ui.contact.a.a)localObject).mDz = this.mEm.mDz;
      ((com.tencent.mm.ui.contact.a.a)localObject).zmW = clI();
      ((e)localObject).eDk = true;
      ((e)localObject).mFm = (paramInt + 1);
      ((e)localObject).ej(((e)localObject).hpS.type, ((e)localObject).hpS.mDw);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.b
 * JD-Core Version:    0.6.2
 */