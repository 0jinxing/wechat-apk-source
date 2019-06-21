package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.roomsdk.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.tools.b.c.a;
import com.tencent.mm.ui.widget.MMEditText;

public class ModRemarkRoomNameUI extends MMActivity
  implements c.a
{
  private String ehq;
  private p eir = null;
  private String ejG = "";
  private MMEditText ejH;

  public final void JW()
  {
    AppMethodBeat.i(104126);
    h.g(this, 2131303149, 2131303152);
    AppMethodBeat.o(104126);
  }

  public final void JX()
  {
    AppMethodBeat.i(104127);
    h.g(this, 2131303150, 2131303152);
    AppMethodBeat.o(104127);
  }

  public final int getLayoutId()
  {
    return 2130970242;
  }

  public final void initView()
  {
    AppMethodBeat.i(104122);
    setMMTitle(2131302508);
    this.ejH = ((MMEditText)findViewById(2131826141));
    String str = bo.nullAsNil(getIntent().getStringExtra("room_name"));
    Object localObject;
    if (bo.isNullOrNil(str))
    {
      localObject = ((com.tencent.mm.plugin.chatroom.a.c)g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV();
      this.ejH.setHint(j.b(this, ((ag)localObject).mJ(this.ehq), this.ejH.getTextSize()));
      this.ejH.setEllipsize(TextUtils.TruncateAt.END);
    }
    while (true)
    {
      this.ejH.setSelection(this.ejH.getText().length());
      this.ejH.addTextChangedListener(new ModRemarkRoomNameUI.1(this, str));
      localObject = com.tencent.mm.ui.tools.b.c.d(this.ejH).hz(1, 32);
      ((com.tencent.mm.ui.tools.b.c)localObject).zIx = false;
      ((com.tencent.mm.ui.tools.b.c)localObject).a(null);
      setBackBtn(new ModRemarkRoomNameUI.2(this));
      a(0, getString(2131297038), new ModRemarkRoomNameUI.3(this), q.b.ymu);
      enableOptionMenu(false);
      AppMethodBeat.o(104122);
      return;
      this.ejH.setText(j.b(this, str, this.ejH.getTextSize()));
    }
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(104125);
    this.ejG = paramString;
    com.tencent.mm.roomsdk.a.c.a locala = b.alY(this.ehq).M(this.ehq, this.ejG);
    locala.d(new ModRemarkRoomNameUI.4(this, locala));
    paramString = this.mController.ylL;
    getString(2131297061);
    locala.a(paramString, getString(2131298487), false, null);
    AppMethodBeat.o(104125);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104121);
    super.onCreate(paramBundle);
    this.ehq = getIntent().getStringExtra("RoomInfo_Id");
    initView();
    AppMethodBeat.o(104121);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104124);
    super.onDestroy();
    AppMethodBeat.o(104124);
  }

  public void onPause()
  {
    AppMethodBeat.i(104123);
    super.onPause();
    AppMethodBeat.o(104123);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI
 * JD-Core Version:    0.6.2
 */