package com.tencent.mm.plugin.soter.ui;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class SoterAuthenticationUI$a extends Handler
{
  private WeakReference<SoterAuthenticationUI> lWJ;

  private SoterAuthenticationUI$a(SoterAuthenticationUI paramSoterAuthenticationUI)
  {
    AppMethodBeat.i(73897);
    this.lWJ = null;
    this.lWJ = new WeakReference(paramSoterAuthenticationUI);
    AppMethodBeat.o(73897);
  }

  @TargetApi(23)
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(73898);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      ab.e("MicroMsg.SoterAuthenticationUI", "hy: unidentified msg: %d", new Object[] { Integer.valueOf(paramMessage.what) });
      AppMethodBeat.o(73898);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SoterAuthenticationUI", "hy: inform ok");
      paramMessage = (k)paramMessage.obj;
      if ((this.lWJ != null) && (this.lWJ.get() != null))
      {
        SoterAuthenticationUI.a((SoterAuthenticationUI)this.lWJ.get(), paramMessage);
        AppMethodBeat.o(73898);
      }
      else
      {
        ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
        AppMethodBeat.o(73898);
        continue;
        ab.i("MicroMsg.SoterAuthenticationUI", "hy: inform cancel");
        paramMessage = (k)paramMessage.obj;
        if ((this.lWJ != null) && (this.lWJ.get() != null))
        {
          SoterAuthenticationUI.b((SoterAuthenticationUI)this.lWJ.get(), paramMessage);
          AppMethodBeat.o(73898);
        }
        else
        {
          ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
          AppMethodBeat.o(73898);
          continue;
          ab.i("MicroMsg.SoterAuthenticationUI", "hy: inform fail");
          paramMessage = (k)paramMessage.obj;
          if ((this.lWJ != null) && (this.lWJ.get() != null))
          {
            SoterAuthenticationUI.c((SoterAuthenticationUI)this.lWJ.get(), paramMessage);
            AppMethodBeat.o(73898);
          }
          else
          {
            ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
            AppMethodBeat.o(73898);
            continue;
            ab.i("MicroMsg.SoterAuthenticationUI", "hy: request permission");
            if ((this.lWJ != null) && (this.lWJ.get() != null))
            {
              String[] arrayOfString = paramMessage.getData().getStringArray("permissions");
              int i = paramMessage.getData().getInt("request_code");
              if ((arrayOfString == null) || (arrayOfString.length <= 1))
              {
                ab.e("MicroMsg.SoterAuthenticationUI", "hy: permission null");
                AppMethodBeat.o(73898);
              }
              else
              {
                ((SoterAuthenticationUI)this.lWJ.get()).requestPermissions(arrayOfString, i);
                AppMethodBeat.o(73898);
              }
            }
            else
            {
              ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
              AppMethodBeat.o(73898);
              continue;
              ab.i("MicroMsg.SoterAuthenticationUI", "hy: show progress");
              if ((this.lWJ != null) && (this.lWJ.get() != null))
              {
                SoterAuthenticationUI.a((SoterAuthenticationUI)this.lWJ.get());
                AppMethodBeat.o(73898);
              }
              else
              {
                ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                AppMethodBeat.o(73898);
                continue;
                ab.i("MicroMsg.SoterAuthenticationUI", "hy: dismiss progress");
                if ((this.lWJ != null) && (this.lWJ.get() != null))
                {
                  SoterAuthenticationUI.b((SoterAuthenticationUI)this.lWJ.get());
                  AppMethodBeat.o(73898);
                }
                else
                {
                  ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                  AppMethodBeat.o(73898);
                  continue;
                  ab.i("MicroMsg.SoterAuthenticationUI", "hy: show dialog");
                  if ((this.lWJ != null) && (this.lWJ.get() != null))
                  {
                    SoterAuthenticationUI.b((b)paramMessage.obj);
                    AppMethodBeat.o(73898);
                  }
                  else
                  {
                    ab.w("MicroMsg.SoterAuthenticationUI", "hy: ui cleared");
                    AppMethodBeat.o(73898);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI.a
 * JD-Core Version:    0.6.2
 */