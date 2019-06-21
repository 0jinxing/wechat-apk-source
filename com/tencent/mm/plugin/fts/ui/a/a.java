package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.f;

public final class a extends com.tencent.mm.plugin.fts.a.d.a.a
{
  public CharSequence mJP;
  private a.b mJQ;
  private a mJR;

  public a(int paramInt)
  {
    super(10, paramInt);
    AppMethodBeat.i(61970);
    this.mJQ = new a.b(this);
    this.mJR = new a();
    AppMethodBeat.o(61970);
  }

  public final com.tencent.mm.plugin.fts.a.d.a.a.b Ps()
  {
    return this.mJQ;
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61971);
    this.mJP = f.a(paramContext.getResources().getString(2131300100), "", d.b(this.mDz.mDY, this.mDz.mDY)).mDR;
    AppMethodBeat.o(61971);
  }

  public final class a extends com.tencent.mm.plugin.fts.a.d.a.a.a
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.a
 * JD-Core Version:    0.6.2
 */