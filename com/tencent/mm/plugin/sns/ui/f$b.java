package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

abstract class f$b
{
  View.OnClickListener rgo = new f.b.1(this);
  View.OnClickListener rgp = new f.b.2(this);
  View.OnClickListener rgq = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      AppMethodBeat.i(38085);
      f.b.this.rgr = ((f.b.a)paramAnonymousView.getTag());
      int i = f.b.this.rgr.position;
      f.b.this.DM(i);
      AppMethodBeat.o(38085);
    }
  };
  public a rgr = new a();

  public abstract void DM(int paramInt);

  public static final class a
  {
    public String cFc;
    public int position;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.f.b
 * JD-Core Version:    0.6.2
 */