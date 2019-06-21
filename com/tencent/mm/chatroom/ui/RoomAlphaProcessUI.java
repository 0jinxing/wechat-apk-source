package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.chatroom.c.q;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(3)
@Deprecated
public class RoomAlphaProcessUI extends MMActivity
  implements b.a
{
  private String chatroomName;

  private static void p(Runnable paramRunnable)
  {
    AppMethodBeat.i(104134);
    new ak().postDelayed(paramRunnable, 200L);
    AppMethodBeat.o(104134);
  }

  public final void e(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(104135);
    if (paramBoolean)
    {
      h.bQ(this, getString(2131302655));
      p(new RoomAlphaProcessUI.1(this, paramBoolean, paramInt));
      AppMethodBeat.o(104135);
    }
    while (true)
    {
      return;
      h.a(this, getString(2131302654), "", null);
      p(new RoomAlphaProcessUI.2(this, paramBoolean));
      AppMethodBeat.o(104135);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104130);
    super.onCreate(paramBundle);
    this.chatroomName = getIntent().getStringExtra("RoomInfo_Id");
    q localq = new q(this.chatroomName);
    paramBundle = new b.2(h.b(this, getString(2131300968), false, new b.1()), this, this);
    g.RO().eJo.a(482, paramBundle);
    g.RO().eJo.a(localq, 0);
    AppMethodBeat.o(104130);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104133);
    super.onDestroy();
    AppMethodBeat.o(104133);
  }

  public void onPause()
  {
    AppMethodBeat.i(104132);
    super.onPause();
    AppMethodBeat.o(104132);
  }

  public void onResume()
  {
    AppMethodBeat.i(104131);
    super.onResume();
    AppMethodBeat.o(104131);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAlphaProcessUI
 * JD-Core Version:    0.6.2
 */