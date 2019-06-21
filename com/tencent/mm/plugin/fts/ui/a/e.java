package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.b.c;

public final class e extends k
{
  public int count;
  private e.a mKh;
  e.b mKi;
  public String talker;

  public e(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(61980);
    this.mKh = new e.a(this);
    this.mKi = new e.b(this);
    AppMethodBeat.o(61980);
  }

  public final a.b Ps()
  {
    return this.mKh;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61981);
    this.mKQ = paramContext.getString(2131302859, new Object[] { TextUtils.ellipsize(d.LC(this.talker), b.c.mHz, 500.0F, TextUtils.TruncateAt.MIDDLE) });
    AppMethodBeat.o(61981);
  }

  public final a.a bBi()
  {
    return this.mKi;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.e
 * JD-Core Version:    0.6.2
 */