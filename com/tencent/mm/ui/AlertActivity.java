package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public class AlertActivity extends AppCompatActivity
{
  private static c.a vkm;
  private DialogInterface.OnDismissListener cMR;
  private DialogInterface.OnCancelListener yes;

  public static void a(c.a parama)
  {
    vkm = parama;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(112442);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setStatusBarColor(getResources().getColor(17170445));
    if (vkm != null)
    {
      vkm.mContext = this;
      this.cMR = vkm.zQe.Uf;
      this.yes = vkm.zQe.Ue;
      vkm.a(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(112440);
          if (AlertActivity.a(AlertActivity.this) != null)
            AlertActivity.a(AlertActivity.this).onDismiss(paramAnonymousDialogInterface);
          AlertActivity.this.finish();
          AppMethodBeat.o(112440);
        }
      });
      vkm.f(new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          AppMethodBeat.i(112441);
          if (AlertActivity.b(AlertActivity.this) != null)
            AlertActivity.b(AlertActivity.this).onCancel(paramAnonymousDialogInterface);
          AlertActivity.this.finish();
          AppMethodBeat.o(112441);
        }
      });
      vkm.aMb().show();
    }
    AppMethodBeat.o(112442);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(112444);
    super.onDestroy();
    vkm = null;
    AppMethodBeat.o(112444);
  }

  public void onPause()
  {
    AppMethodBeat.i(112443);
    overridePendingTransition(0, 0);
    super.onPause();
    AppMethodBeat.o(112443);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.AlertActivity
 * JD-Core Version:    0.6.2
 */