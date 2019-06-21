package com.tencent.mm.ui.bizchat;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import java.util.HashMap;
import java.util.Map;

public final class a extends com.tencent.mm.ui.contact.a.a
{
  private static Map<String, c> yDP;
  public CharSequence gnx;
  public long jMj;
  public String username;
  public String yDO;
  private a.b yDQ;
  a.a yDR;

  static
  {
    AppMethodBeat.i(105189);
    yDP = new HashMap();
    AppMethodBeat.o(105189);
  }

  public a(int paramInt)
  {
    super(4, paramInt);
    AppMethodBeat.i(105186);
    this.jMj = -1L;
    this.yDQ = new a.b(this);
    this.yDR = new a.a(this);
    AppMethodBeat.o(105186);
  }

  public final void a(Context paramContext, com.tencent.mm.ui.contact.a.a.a parama)
  {
    AppMethodBeat.i(105187);
    this.gnx = j.b(paramContext, this.gnx, com.tencent.mm.bz.a.al(paramContext, 2131427813));
    AppMethodBeat.o(105187);
  }

  public final com.tencent.mm.ui.contact.a.a.b aou()
  {
    return this.yDQ;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.a
 * JD-Core Version:    0.6.2
 */