package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.regex.Pattern;

public final class c extends a
{
  private static final Pattern zpF;
  public CharSequence gnx;
  public CharSequence gny;
  public l hpS;
  public String username;
  public CharSequence zpG;
  private c.b zpH;
  c.a zpI;

  static
  {
    AppMethodBeat.i(105275);
    zpF = Pattern.compile(";");
    AppMethodBeat.o(105275);
  }

  public c(int paramInt)
  {
    super(3, paramInt);
    AppMethodBeat.i(105273);
    this.zpH = new c.b(this);
    this.zpI = new c.a(this);
    AppMethodBeat.o(105273);
  }

  public final void a(Context paramContext, a.a parama)
  {
    Object localObject = null;
    int i = 1;
    boolean bool1 = false;
    AppMethodBeat.i(105274);
    int j;
    if (this.hpS != null)
    {
      if (this.ehM != null)
        break label650;
      g.RQ();
      this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoI(this.hpS.mDx);
      if (this.ehM != null)
        break label650;
      g.RQ();
      this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoN(this.hpS.mDx);
      j = 1;
    }
    while (true)
    {
      if (this.ehM == null)
      {
        ab.i("MicroMsg.ChatroomDataItem", "filling dataItem Occur Error Contact is null, position=%d", new Object[] { Integer.valueOf(this.position) });
        AppMethodBeat.o(105274);
      }
      l locall;
      Resources localResources;
      String str;
      while (true)
      {
        return;
        j = 0;
        break;
        this.username = this.ehM.field_username;
        if (j == 0)
          break label567;
        locall = this.hpS;
        parama = this.ehM;
        localResources = paramContext.getResources();
        str = ((b)g.K(b.class)).a(parama, parama.field_username);
        switch (locall.mDw)
        {
        default:
          bool2 = false;
          bool1 = false;
          j = 0;
          parama = localObject;
          label279: if (j == 0)
            break label548;
          this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427762));
          this.gnx = f.a(d.a(this.gnx, this.mDz, bool1, bool2)).mDR;
          label325: this.gny = parama;
          AppMethodBeat.o(105274);
        case 3:
        case 7:
        case 2:
        case 6:
        case 38:
        case 1:
        case 5:
        }
      }
      bool1 = true;
      boolean bool2 = bool1;
      for (bool1 = true; ; bool1 = false)
      {
        localResources.getString(2131302829);
        j = i;
        parama = localObject;
        break label279;
        g.RQ();
        Cursor localCursor = g.RP().eJN.a("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new String[] { parama.field_username }, 2);
        if (localCursor.moveToFirst())
        {
          parama = localCursor.getString(0);
          localCursor.close();
          if (parama == null)
            parama = null;
        }
        while (true)
        {
          if ((parama != null) && (parama.length > 0))
            this.zpG = ("(" + parama.length + ")");
          if ((parama == null) || (locall.mEI == null))
            break;
          parama = m.a(paramContext, locall.mEI, parama, this.mDz, b.c.mHz);
          parama = TextUtils.concat(new CharSequence[] { localResources.getString(2131302827), parama });
          bool2 = false;
          bool1 = false;
          j = 0;
          break label279;
          parama = zpF.split(parama);
          continue;
          localCursor.close();
          parama = null;
        }
        label548: this.gnx = com.tencent.mm.pluginsdk.ui.e.j.b(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427762));
        break label325;
        label567: this.gnx = ((b)g.K(b.class)).a(this.ehM, this.ehM.field_username);
        if (this.hpS != null)
          this.zpG = ("(" + this.hpS.mEB + ")");
        AppMethodBeat.o(105274);
        break;
        bool2 = false;
      }
      label650: j = 1;
    }
  }

  public final a.b aou()
  {
    return this.zpH;
  }

  public final boolean bAv()
  {
    return this.hpS.mEL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.a.c
 * JD-Core Version:    0.6.2
 */