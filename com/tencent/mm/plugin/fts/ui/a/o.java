package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;

public final class o extends f
{
  private o.a mLh;

  public o(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(62024);
    this.mLh = new o.a(this);
    AppMethodBeat.o(62024);
  }

  public final a.b Ps()
  {
    return this.mLh;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62025);
    String str = this.mKp.mDx;
    boolean bool1;
    boolean bool2;
    switch (this.mKp.mDw)
    {
    case 4:
    default:
      paramArrayOfObject = null;
      parama = null;
      bool1 = false;
      bool2 = false;
    case 3:
      while (true)
      {
        this.mKm = str;
        if (bo.isNullOrNil(paramArrayOfObject))
          break;
        this.mKl = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool1, bool2, b.c.mHv, paramArrayOfObject + "(", ")")).mDR;
        this.mKl = TextUtils.concat(new CharSequence[] { "\"", this.mKl, paramContext.getString(2131302862) });
        AppMethodBeat.o(62025);
        return;
        bool2 = true;
        bool1 = true;
        parama = com.tencent.mm.plugin.fts.a.d.LC(str);
        paramArrayOfObject = null;
      }
    case 7:
      label136: label177: label180: bool2 = true;
      label194: bool1 = true;
    case 2:
    case 1:
    case 6:
    case 5:
    }
    while (true)
    {
      parama = ((j)g.K(j.class)).XM().aoO(str).field_nickname;
      paramArrayOfObject = com.tencent.mm.plugin.fts.a.d.LC(str);
      break;
      this.mKl = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool1, bool2, 400.0F, b.c.mHv)).mDR;
      break label136;
      bool2 = false;
      break label177;
      bool1 = false;
      bool2 = false;
      break label180;
      bool2 = false;
      break label194;
      bool1 = false;
      bool2 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.o
 * JD-Core Version:    0.6.2
 */