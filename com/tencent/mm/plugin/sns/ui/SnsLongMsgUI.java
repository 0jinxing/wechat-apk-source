package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class SnsLongMsgUI extends MMActivity
{
  private Button qZB;

  public final int getLayoutId()
  {
    return 2130969955;
  }

  @TargetApi(17)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39063);
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    this.qZB = ((Button)findViewById(2131825327));
    this.qZB.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(39061);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(SnsLongMsgUI.this, SnsUploadUI.class);
        paramAnonymousView.putExtra("KSnsPostManu", true);
        paramAnonymousView.putExtra("KTouchCameraTime", bo.anT());
        paramAnonymousView.putExtra("sns_comment_type", 1);
        paramAnonymousView.putExtra("Ksnsupload_type", 9);
        SnsLongMsgUI.this.startActivity(paramAnonymousView);
        SnsLongMsgUI.this.finish();
        AppMethodBeat.o(39061);
      }
    });
    AppMethodBeat.o(39063);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39062);
    super.onDestroy();
    AppMethodBeat.o(39062);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(39064);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      paramKeyEvent = new Intent();
      paramKeyEvent.setClass(this, SnsUploadUI.class);
      paramKeyEvent.putExtra("KSnsPostManu", true);
      paramKeyEvent.putExtra("KTouchCameraTime", bo.anT());
      paramKeyEvent.putExtra("sns_comment_type", 1);
      paramKeyEvent.putExtra("Ksnsupload_type", 9);
      startActivity(paramKeyEvent);
      finish();
      AppMethodBeat.o(39064);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(39064);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsLongMsgUI
 * JD-Core Version:    0.6.2
 */