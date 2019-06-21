package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.c;

public final class j extends b
{
  int dtW;
  private c yhs;
  View zwu;

  public j(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(34668);
    this.zwu = View.inflate(paramContext, 2130969870, null);
    if (this.zwu == null)
      AppMethodBeat.o(34668);
    while (true)
    {
      return;
      this.dtW = ah.getInt(g.Nu().getValue("InviteFriendsControlFlags"), 0);
      this.zwu.setVisibility(8);
      this.zwu.setPadding(0, -com.tencent.mm.bz.a.fromDPToPix(paramContext, 2131427811), 0, 0);
      if ((this.dtW & 0x1) > 0)
      {
        this.zwu.setVisibility(0);
        this.zwu.setPadding(0, 0, 0, 0);
      }
      this.zwu.setOnClickListener(new j.1(this, paramContext));
      this.yhs = new j.2(this);
      AppMethodBeat.o(34668);
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(34669);
    com.tencent.mm.sdk.b.a.xxA.c(this.yhs);
    boolean bool;
    if ((this.zwu != null) && (this.zwu.getVisibility() == 0))
    {
      bool = true;
      AppMethodBeat.o(34669);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(34669);
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final View getView()
  {
    return this.zwu;
  }

  public final void release()
  {
    AppMethodBeat.i(34670);
    com.tencent.mm.sdk.b.a.xxA.d(this.yhs);
    AppMethodBeat.o(34670);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.j
 * JD-Core Version:    0.6.2
 */