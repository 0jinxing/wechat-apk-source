package com.tencent.mm.ui.chatting;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.m;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMFragmentActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.c.c;

@com.tencent.mm.kernel.i
@SuppressLint({"DefaultLocale", "ValidFragment"})
@TargetApi(11)
public class ChattingUI extends MMFragmentActivity
{
  public ChattingUIFragment yLg;
  public ak yLh;

  public ChattingUI()
  {
    AppMethodBeat.i(30821);
    this.yLh = new ak();
    AppMethodBeat.o(30821);
  }

  protected ChattingUIFragment dBp()
  {
    AppMethodBeat.i(30823);
    ChattingUIFragment localChattingUIFragment = new ChattingUIFragment((byte)0);
    AppMethodBeat.o(30823);
    return localChattingUIFragment;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(30824);
    ab.d("MicroMsg.ChattingUI", "chatting ui dispatch key event %s", new Object[] { paramKeyEvent });
    if ((this.yLg != null) && (this.yLg.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent)))
      AppMethodBeat.o(30824);
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(30824);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30828);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.yLg.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(30828);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30822);
    getWindow().setFormat(-2);
    f.ah(this);
    super.onCreate(null);
    if (c.aU(getIntent()))
    {
      finish();
      AppMethodBeat.o(30822);
    }
    while (true)
    {
      return;
      setContentView(2130969128);
      this.yLg = dBp();
      paramBundle = getIntent().getExtras();
      paramBundle.putBoolean("FROM_CHATTING_ACTIVITY", true);
      this.yLg.setArguments(paramBundle);
      getSupportFragmentManager().beginTransaction().a(2131821892, this.yLg).commit();
      getSupportActionBar().show();
      if (getIntent().getBooleanExtra("resend_fail_messages", false))
      {
        al.n(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(30819);
            h.d(ChattingUI.this, ChattingUI.this.getString(2131301806), "", ChattingUI.this.getString(2131301807), ChattingUI.this.getString(2131296868), new ChattingUI.1.1(this), new ChattingUI.1.2(this));
            AppMethodBeat.o(30819);
          }
        }
        , 500L);
        getIntent().putExtra("is_need_resend_sns", false);
      }
      initNavigationSwipeBack();
      this.yLh.post(new ChattingUI.2(this));
      AppMethodBeat.o(30822);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(30826);
    ab.d("MicroMsg.ChattingUI", "chatting ui on key down, %d, %s", new Object[] { Integer.valueOf(paramInt), paramKeyEvent });
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(30826);
    return bool;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(30825);
    ab.d("MicroMsg.ChattingUI", "chatting ui on key up");
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(30825);
    return bool;
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(30827);
    ab.i("MicroMsg.ChattingUI", "chatting onRequestPermissionsResult");
    this.yLg.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    AppMethodBeat.o(30827);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChattingUI
 * JD-Core Version:    0.6.2
 */