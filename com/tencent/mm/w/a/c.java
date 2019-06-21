package com.tencent.mm.w.a;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.storage.bd;

public final class c extends com.tencent.mm.plugin.fts.ui.a.b
{
  public com.tencent.mm.plugin.account.friend.a.a eBs;
  public boolean eBt;
  private c.a eBu;

  public c(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(124495);
    this.eBu = new c.a(this);
    AppMethodBeat.o(124495);
  }

  public final a.b Ps()
  {
    return this.eBu;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124496);
    this.username = this.hpS.mDx;
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.username);
    Object localObject = (com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg();
    long l = this.hpS.mEB;
    parama = new com.tencent.mm.plugin.account.friend.a.a();
    paramArrayOfObject = "select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2 WHERE id=" + Long.toString(l) + ';';
    paramArrayOfObject = ((com.tencent.mm.plugin.account.friend.a.b)localObject).fni.a(paramArrayOfObject, null, 2);
    if (paramArrayOfObject.moveToFirst())
      parama.d(paramArrayOfObject);
    paramArrayOfObject.close();
    this.eBs = parama;
    localObject = this.eBs.apA();
    boolean bool1;
    int i;
    int j;
    switch (this.hpS.mDw)
    {
    case 8:
    case 9:
    case 10:
    case 11:
    case 15:
    default:
      bool1 = false;
      bool2 = false;
      i = 0;
      j = 0;
      parama = null;
      paramArrayOfObject = null;
    case 14:
    case 16:
    case 7:
      while (j != 0)
      {
        this.jMY = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, (CharSequence)localObject, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.jMY = f.a(d.a(this.jMY, this.mDz, bool2, bool1)).mDR;
        label282: if (i != 0)
        {
          this.jMZ = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427813));
          this.jMZ = f.a(d.a(this.jMZ, this.mDz, bool2, bool1)).mDR;
          this.jMZ = TextUtils.concat(new CharSequence[] { paramArrayOfObject, this.jMZ });
        }
        AppMethodBeat.o(124496);
        return;
        bool1 = true;
        label358: bool2 = true;
        label361: parama = this.eBs.apG();
        paramArrayOfObject = paramContext.getString(2131302828);
        i = 0;
        j = 1;
        continue;
        parama = this.eBs.apG();
        paramArrayOfObject = paramContext.getString(2131302828);
        bool1 = false;
        bool2 = false;
        i = 1;
        j = 0;
        continue;
        bool1 = true;
      }
    case 13:
    case 12:
    case 6:
    case 5:
    }
    label418: for (boolean bool2 = true; ; bool2 = false)
    {
      parama = this.eBs.apD();
      paramArrayOfObject = paramContext.getString(2131302834);
      i = 1;
      j = 0;
      break;
      this.jMY = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, (CharSequence)localObject, com.tencent.mm.bz.a.al(paramContext, 2131427813));
      break label282;
      bool1 = false;
      break label358;
      bool1 = false;
      bool2 = false;
      break label361;
      bool1 = false;
      break label418;
      bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.a.c
 * JD-Core Version:    0.6.2
 */