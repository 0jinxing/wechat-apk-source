package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.ab;

public class n extends a
{
  public String mLd;
  private n.b mLe;
  private a mLf;

  public n(int paramInt)
  {
    super(12, paramInt);
    AppMethodBeat.i(62021);
    this.mLe = new n.b(this);
    this.mLf = new a();
    AppMethodBeat.o(62021);
  }

  public a.b Ps()
  {
    return this.mLe;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62022);
    parama = m.wf(this.mFl);
    if (parama == null);
    for (this.mLd = ""; ; this.mLd = paramContext.getResources().getString(2131302813, new Object[] { parama }))
    {
      ab.i("MicroMsg.FTS.FTSMoreDataItem", "fillDataItem: tip=%s", new Object[] { this.mLd });
      AppMethodBeat.o(62022);
      return;
    }
  }

  public final class a extends a.a
  {
    public View contentView;
    public ImageView iqT;
    public TextView mJS;

    public a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.n
 * JD-Core Version:    0.6.2
 */