package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.a;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.List;
import java.util.regex.Pattern;

public final class q extends a
{
  public ad ehM;
  public l hpS;
  public CharSequence jMY;
  public CharSequence jMZ;
  public CharSequence mLl;
  private q.b mLm;
  q.a mLn;
  public String username;

  public q(int paramInt)
  {
    super(2, paramInt);
    AppMethodBeat.i(62032);
    this.mLm = new q.b(this);
    this.mLn = new q.a(this);
    AppMethodBeat.o(62032);
  }

  public final a.b Ps()
  {
    return this.mLm;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    int i = 1;
    AppMethodBeat.i(62033);
    this.username = this.hpS.mDx;
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.username);
    try
    {
      Object localObject1 = paramContext.getResources();
      paramArrayOfObject = com.tencent.mm.plugin.fts.a.d.LC(this.ehM.field_username);
      switch (this.hpS.mDw)
      {
      default:
        bool1 = false;
        bool2 = false;
        i = 0;
        parama = null;
        if (i != 0)
          this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, paramArrayOfObject, b.c.mHw);
      case 3:
      case 7:
      case 38:
        label147: Object localObject2;
        float f;
        for (this.jMY = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMY, this.mDz, bool2, bool1, b.a.mHq, b.c.mHx)).mDR; ; this.jMY = TextUtils.concat(new CharSequence[] { TextUtils.ellipsize(paramArrayOfObject, paramContext, f - paramContext.measureText(((CharSequence)localObject2).toString()), (TextUtils.TruncateAt)localObject1), localObject2 }))
        {
          this.jMZ = parama;
          AppMethodBeat.o(62033);
          return;
          bool1 = true;
          bool2 = true;
          this.jMZ = this.ehM.field_nickname;
          parama = null;
          break label147;
          localObject2 = g.RP().eJN.a("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new String[] { this.ehM.field_username }, 2);
          if (!((Cursor)localObject2).moveToFirst())
            break label521;
          parama = ((Cursor)localObject2).getString(0);
          if (parama == null);
          for (parama = null; ; parama = c.a.mCy.split(parama))
          {
            ((Cursor)localObject2).close();
            if ((parama != null) && (parama.length > 0))
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("(");
              this.mLl = (parama.length + ")");
            }
            if ((parama == null) || (this.hpS.mEI == null))
              break;
            parama = m.a(paramContext, this.hpS.mEI, parama, this.mDz, b.c.mHz);
            parama = TextUtils.concat(new CharSequence[] { ((Resources)localObject1).getString(2131302827), parama });
            bool1 = false;
            bool2 = false;
            i = 0;
            break label147;
          }
          this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, paramArrayOfObject, b.c.mHw);
          paramArrayOfObject = this.jMY;
          localObject2 = this.mLl;
          f = b.a.mHq;
          paramContext = b.c.mHx;
          localObject1 = TextUtils.TruncateAt.END;
        }
      case 2:
      case 6:
      case 1:
      case 5:
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        if (this.jMY == null)
          this.jMY = com.tencent.mm.plugin.fts.a.d.LC(this.ehM.field_username);
        AppMethodBeat.o(62033);
        continue;
        label521: parama = null;
        continue;
        boolean bool1 = false;
        continue;
        bool1 = false;
        boolean bool2 = false;
      }
    }
  }

  public final int aAq()
  {
    return this.hpS.mEK;
  }

  public final int bAu()
  {
    AppMethodBeat.i(62034);
    int i;
    if (this.hpS.mDw == 38)
    {
      List localList = this.hpS.mEI;
      if ((localList != null) && (localList.size() > 0))
      {
        i = ((com.tencent.mm.plugin.fts.a.a.f)localList.get(0)).mDw;
        AppMethodBeat.o(62034);
      }
    }
    while (true)
    {
      return i;
      i = super.bAu();
      AppMethodBeat.o(62034);
    }
  }

  public final boolean bAv()
  {
    return this.hpS.mEL;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.q
 * JD-Core Version:    0.6.2
 */