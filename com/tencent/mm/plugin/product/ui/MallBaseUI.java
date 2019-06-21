package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.g;

public abstract class MallBaseUI extends MMActivity
{
  protected String hxN;

  public final void AM(int paramInt)
  {
    this.mController.contentView.setVisibility(paramInt);
    if (paramInt == 0)
      this.mController.showTitleView();
    while (true)
    {
      return;
      this.mController.hideTitleView();
    }
  }

  protected final void UJ(String paramString)
  {
    this.hxN = paramString;
    showDialog(-10001);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new MallBaseUI.1(this));
  }

  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.onCreateDialog(paramInt);
    case -10001:
    case -10002:
    }
    while (true)
    {
      return localObject;
      if (bo.isNullOrNil(this.hxN))
        this.hxN = getString(2131301348);
      localObject = h.a(this, this.hxN, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(44027);
          MallBaseUI.this.finish();
          AppMethodBeat.o(44027);
        }
      });
      continue;
      localObject = g.a(this.mController.ylL, false, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
        }
      });
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
      this.mController.callBackMenu();
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallBaseUI
 * JD-Core Version:    0.6.2
 */