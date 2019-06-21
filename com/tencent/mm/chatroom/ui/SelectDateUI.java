package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import java.util.HashMap;

public class SelectDateUI extends MMActivity
  implements com.tencent.mm.chatroom.a.a
{
  private p ejZ = null;
  private long ejc = -1L;
  private DayPickerView emn;
  private String emo;
  private HashMap<String, com.tencent.mm.chatroom.c.a> emp;
  private TextView emq;
  private ak mHandler;

  public final long Jz()
  {
    AppMethodBeat.i(104383);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(104383);
    return l;
  }

  public final void a(com.tencent.mm.chatroom.c.a parama)
  {
    AppMethodBeat.i(104384);
    if (parama == null)
    {
      ab.e("MicroMsg.SelectDateUI", "null == calendarDay");
      AppMethodBeat.o(104384);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SelectDateUI", "Day Selected timestamp:%s day:%s month:%s year:%s", new Object[] { Long.valueOf(parama.ehg), Integer.valueOf(parama.ehf), Integer.valueOf(parama.month), Integer.valueOf(parama.year) });
      long l = parama.cvx;
      ab.i("MicroMsg.SelectDateUI", "[goToChattingUI] msgLocalId:%s", new Object[] { Long.valueOf(l) });
      com.tencent.mm.bp.d.f(this, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", this.emo).putExtra("finish_direct", true).putExtra("from_date_search", true).putExtra("msg_local_id", l));
      AppMethodBeat.o(104384);
    }
  }

  public final int getLayoutId()
  {
    return 2130970588;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104382);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    setMMTitle(2131302624);
    this.emn = ((DayPickerView)findViewById(2131827311));
    this.emq = ((TextView)findViewById(2131821477));
    this.emp = new HashMap();
    this.mHandler = new ak(getMainLooper());
    this.emo = getIntent().getStringExtra("detail_username");
    com.tencent.mm.sdk.g.d.post(new SelectDateUI.1(this), "prepare_data");
    setBackBtn(new SelectDateUI.2(this));
    AppMethodBeat.o(104382);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectDateUI
 * JD-Core Version:    0.6.2
 */