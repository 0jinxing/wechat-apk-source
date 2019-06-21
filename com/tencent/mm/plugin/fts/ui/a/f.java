package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
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

public class f extends k
{
  public String mEp;
  protected CharSequence mKl;
  protected String mKm;
  protected CharSequence mKn;
  protected String mKo;
  public l mKp;
  private f.a mKq;
  f.b mKr;
  public int showType;

  public f(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(61984);
    this.mKq = new f.a(this);
    this.mKr = new f.b(this);
    AppMethodBeat.o(61984);
  }

  public a.b Ps()
  {
    return this.mKq;
  }

  public void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61985);
    String str = this.mKp.mDx;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    parama = null;
    switch (this.mKp.mDw)
    {
    case 4:
    default:
      paramArrayOfObject = null;
      bool2 = false;
      bool4 = bool5;
      if (this.showType == 2)
      {
        this.mKm = str;
        if (!bo.isNullOrNil(paramArrayOfObject))
        {
          this.mKl = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool4, bool2, b.c.mHv, paramArrayOfObject + "(", ")")).mDR;
          this.mKl = TextUtils.concat(new CharSequence[] { "\"", this.mKl, "\"" });
          this.mKn = TextUtils.concat(new CharSequence[] { "\"", TextUtils.ellipsize(com.tencent.mm.plugin.fts.a.d.LC(this.mEp), b.c.mHx, 300.0F, TextUtils.TruncateAt.END), paramContext.getString(2131302862) });
          this.mKo = this.mEp;
          AppMethodBeat.o(61985);
          return;
        }
      }
      break;
    case 3:
      label159: bool2 = true;
    case 7:
    case 6:
    case 5:
    case 2:
    case 1:
    }
    label250: for (bool4 = true; ; bool4 = bool3)
    {
      parama = com.tencent.mm.plugin.fts.a.d.LC(str);
      paramArrayOfObject = null;
      break;
      bool2 = true;
      bool4 = true;
      bool1 = bool2;
      parama = ((j)g.K(j.class)).XM().aoO(str).field_nickname;
      paramArrayOfObject = com.tencent.mm.plugin.fts.a.d.LC(str);
      bool2 = bool1;
      break;
      this.mKl = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool4, bool2, 400.0F, b.c.mHv)).mDR;
      break label159;
      this.mKl = TextUtils.concat(new CharSequence[] { "\"", TextUtils.ellipsize(com.tencent.mm.plugin.fts.a.d.LC(this.mEp), b.c.mHx, 300.0F, TextUtils.TruncateAt.END), "\"" });
      this.mKm = this.mEp;
      this.mKo = str;
      if (!bo.isNullOrNil(paramArrayOfObject));
      for (this.mKn = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool4, bool2, b.c.mHv, paramArrayOfObject + "(", ")")).mDR; ; this.mKn = com.tencent.mm.plugin.fts.a.f.a(com.tencent.mm.plugin.fts.a.a.d.a(parama, this.mKp.mDz, bool4, bool2, 400.0F, b.c.mHv)).mDR)
      {
        this.mKn = TextUtils.concat(new CharSequence[] { "\"", this.mKn, paramContext.getString(2131302862) });
        AppMethodBeat.o(61985);
        break;
      }
      bool2 = false;
      break label250;
      bool2 = false;
    }
  }

  public final a.a bBi()
  {
    return this.mKr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.f
 * JD-Core Version:    0.6.2
 */