package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelectDelRoomManagerUI extends SelectMemberUI
{
  private boolean emk;
  private List<String> emv;

  public SelectDelRoomManagerUI()
  {
    AppMethodBeat.i(104398);
    this.emk = false;
    this.emv = new ArrayList();
    AppMethodBeat.o(104398);
  }

  private void Kt()
  {
    AppMethodBeat.i(104405);
    if (this.emD.size() > 0)
    {
      enableOptionMenu(1, true);
      AppMethodBeat.o(104405);
    }
    while (true)
    {
      return;
      enableOptionMenu(1, false);
      AppMethodBeat.o(104405);
    }
  }

  protected final void Kq()
  {
    AppMethodBeat.i(104399);
    super.Kq();
    String str = getIntent().getStringExtra("RoomManagers");
    if (str != null)
      for (str : str.split(","))
        this.emv.add(str);
    this.emk = true;
    AppMethodBeat.o(104399);
  }

  public final boolean Kr()
  {
    return true;
  }

  protected final boolean Kv()
  {
    return false;
  }

  protected final BaseAdapter Kw()
  {
    AppMethodBeat.i(104403);
    BaseAdapter localBaseAdapter = super.Kw();
    AppMethodBeat.o(104403);
    return localBaseAdapter;
  }

  protected final List<String> Kx()
  {
    return this.emv;
  }

  protected final void a(View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104402);
    super.a(paramView, paramInt, paramLong);
    ((SelectMemberUI.c)paramView.getTag()).emS.performClick();
    AppMethodBeat.o(104402);
  }

  public void finish()
  {
    AppMethodBeat.i(104401);
    aqX();
    super.finish();
    AppMethodBeat.o(104401);
  }

  public final void initView()
  {
    AppMethodBeat.i(104400);
    super.initView();
    String str;
    label42: SelectDelRoomManagerUI.1 local1;
    if (this.emk)
    {
      str = getString(2131302627);
      setMMTitle(str);
      if (!this.emk)
        break label90;
      str = getString(2131298869);
      local1 = new SelectDelRoomManagerUI.1(this);
      if (!this.emk)
        break label100;
    }
    label90: label100: for (q.b localb = q.b.ymv; ; localb = q.b.ymu)
    {
      a(1, str, local1, localb);
      Kt();
      AppMethodBeat.o(104400);
      return;
      str = getString(2131302626);
      break;
      str = getString(2131296944);
      break label42;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void w(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(104404);
    super.w(paramInt, paramBoolean);
    Kt();
    AppMethodBeat.o(104404);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI
 * JD-Core Version:    0.6.2
 */