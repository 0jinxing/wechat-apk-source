package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;

public class SeeMemberRecordUI extends SelectMemberUI
{
  public final boolean Kl()
  {
    return true;
  }

  protected final void a(View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(104281);
    super.a(paramView, paramInt, paramLong);
    String str = this.emB.iH(paramInt).ehM.field_username;
    aqX();
    paramView = new Intent(this, SelectedMemberChattingRecordUI.class);
    paramView.putExtra("RoomInfo_Id", this.ejD);
    paramView.putExtra("room_member", str);
    paramView.putExtra("title", getString(2131302866));
    startActivity(paramView);
    AppMethodBeat.o(104281);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104282);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = TransitionInflater.from(this).inflateTransition(17760258);
      paramBundle.excludeTarget(getWindow().getDecorView().findViewById(2131820940), true);
      paramBundle.excludeTarget(16908335, true);
      getWindow().setEnterTransition(paramBundle);
    }
    AppMethodBeat.o(104282);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeMemberRecordUI
 * JD-Core Version:    0.6.2
 */