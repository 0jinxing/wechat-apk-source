package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.q.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SelectAddRoomManagerUI extends SelectMemberUI
{
  private boolean emk;
  private HashSet<String> eml;

  public SelectAddRoomManagerUI()
  {
    AppMethodBeat.i(104371);
    this.emk = false;
    this.eml = new HashSet();
    AppMethodBeat.o(104371);
  }

  private void Kt()
  {
    AppMethodBeat.i(104377);
    if (this.emD.size() > 0)
    {
      enableOptionMenu(1, true);
      AppMethodBeat.o(104377);
    }
    while (true)
    {
      return;
      enableOptionMenu(1, false);
      AppMethodBeat.o(104377);
    }
  }

  protected final void Kq()
  {
    AppMethodBeat.i(104372);
    super.Kq();
    this.emk = false;
    Iterator localIterator = this.eih.afg().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.eih.aoo(str))
        this.eml.add(str);
    }
    AppMethodBeat.o(104372);
  }

  public final boolean Kr()
  {
    return true;
  }

  protected final HashSet<String> Ks()
  {
    return this.eml;
  }

  protected final void a(View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104376);
    super.a(paramView, paramInt, paramLong);
    SelectMemberUI.c localc = (SelectMemberUI.c)paramView.getTag();
    paramView = localc.emO.ehM.Oj();
    ab.d("MicroMsg.SelectAddRoomManagerUI", "[onItemClick] username:%s remark:%s", new Object[] { localc.emO.ehM.field_username, paramView, localc.emO.ehM.Oi() });
    localc.emS.performClick();
    AppMethodBeat.o(104376);
  }

  public void finish()
  {
    AppMethodBeat.i(104375);
    aqX();
    super.finish();
    AppMethodBeat.o(104375);
  }

  public final void initView()
  {
    AppMethodBeat.i(104373);
    super.initView();
    String str;
    label42: SelectAddRoomManagerUI.1 local1;
    if (this.emk)
    {
      str = getString(2131302627);
      setMMTitle(str);
      if (!this.emk)
        break label90;
      str = getString(2131298869);
      local1 = new SelectAddRoomManagerUI.1(this);
      if (!this.emk)
        break label100;
    }
    label90: label100: for (q.b localb = q.b.ymv; ; localb = q.b.ymu)
    {
      a(1, str, local1, localb);
      Kt();
      AppMethodBeat.o(104373);
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
    AppMethodBeat.i(104374);
    super.w(paramInt, paramBoolean);
    Kt();
    AppMethodBeat.o(104374);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectAddRoomManagerUI
 * JD-Core Version:    0.6.2
 */