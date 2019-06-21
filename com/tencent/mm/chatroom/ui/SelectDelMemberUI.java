package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.q.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SelectDelMemberUI extends SelectMemberUI
{
  private int ejS;

  private void Kt()
  {
    AppMethodBeat.i(104394);
    if (this.emD.size() > 0)
    {
      updateOptionMenuText(1, getString(2131298869) + "(" + this.emD.size() + ")");
      enableOptionMenu(1, true);
      AppMethodBeat.o(104394);
    }
    while (true)
    {
      return;
      updateOptionMenuText(1, getString(2131298869));
      enableOptionMenu(1, false);
      AppMethodBeat.o(104394);
    }
  }

  protected final void Kq()
  {
    AppMethodBeat.i(104388);
    super.Kq();
    this.ejS = getIntent().getIntExtra("room_member_count", 0);
    AppMethodBeat.o(104388);
  }

  public final boolean Kr()
  {
    return true;
  }

  protected final HashSet<String> Ku()
  {
    AppMethodBeat.i(104391);
    HashSet localHashSet = super.Ku();
    if (Kz().aos(r.Yz()))
      AppMethodBeat.o(104391);
    while (true)
    {
      return localHashSet;
      Iterator localIterator = Kz().afg().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if ((Kz().aoo(str)) || (Kz().aos(str)))
          localHashSet.add(str);
      }
      AppMethodBeat.o(104391);
    }
  }

  protected final void a(View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104393);
    super.a(paramView, paramInt, paramLong);
    ((SelectMemberUI.c)paramView.getTag()).emS.performClick();
    AppMethodBeat.o(104393);
  }

  public void finish()
  {
    AppMethodBeat.i(104390);
    aqX();
    super.finish();
    AppMethodBeat.o(104390);
  }

  public final void initView()
  {
    AppMethodBeat.i(104389);
    super.initView();
    setMMTitle(getString(2131302625) + "(" + this.ejS + ")");
    a(1, getString(2131298869), new SelectDelMemberUI.1(this), q.b.ymv);
    Kt();
    AppMethodBeat.o(104389);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void w(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(104392);
    super.w(paramInt, paramBoolean);
    Kt();
    AppMethodBeat.o(104392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDelMemberUI
 * JD-Core Version:    0.6.2
 */