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

public final class SoterAuthenticationUIWC$a extends Handler
{
  private WeakReference<SoterAuthenticationUIWC> lWJ;

  private SoterAuthenticationUIWC$a(SoterAuthenticationUIWC paramSoterAuthenticationUIWC)
  {
    AppMethodBeat.i(59362);
    this.lWJ = null;
    this.lWJ = new WeakReference(paramSoterAuthenticationUIWC);
    AppMethodBeat.o(59362);
  }

  @TargetApi(23)
  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(59363);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
      ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: unidentified msg: %d", new Object[] { Integer.valueOf(paramMessage.what) });
      AppMethodBeat.o(59363);
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
      ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform ok");
      paramMessage = (k)paramMessage.obj;
      if ((this.lWJ != null) && (this.lWJ.get() != null))
      {
        SoterAuthenticationUIWC.a((SoterAuthenticationUIWC)this.lWJ.get(), paramMessage);
        AppMethodBeat.o(59363);
      }
      else
      {
        ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
        AppMethodBeat.o(59363);
        continue;
        ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform cancel");
        paramMessage = (k)paramMessage.obj;
        if ((this.lWJ != null) && (this.lWJ.get() != null))
        {
          SoterAuthenticationUIWC.b((SoterAuthenticationUIWC)this.lWJ.get(), paramMessage);
          AppMethodBeat.o(59363);
        }
        else
        {
          ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
          AppMethodBeat.o(59363);
          continue;
          ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: inform fail");
          paramMessage = (k)paramMessage.obj;
          if ((this.lWJ != null) && (this.lWJ.get() != null))
          {
            SoterAuthenticationUIWC.c((SoterAuthenticationUIWC)this.lWJ.get(), paramMessage);
            AppMethodBeat.o(59363);
          }
          else
          {
            ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
            AppMethodBeat.o(59363);
            continue;
            ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: request permission");
            if ((this.lWJ != null) && (this.lWJ.get() != null))
            {
              String[] arrayOfString = paramMessage.getData().getStringArray("permissions");
              int i = paramMessage.getData().getInt("request_code");
              if ((arrayOfString == null) || (arrayOfString.length <= 1))
              {
                ab.e("MicroMsg.SoterAuthenticationUIWC", "hy: permission null");
                AppMethodBeat.o(59363);
              }
              else
              {
                ((SoterAuthenticationUIWC)this.lWJ.get()).requestPermissions(arrayOfString, i);
                AppMethodBeat.o(59363);
              }
            }
            else
            {
              ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
              AppMethodBeat.o(59363);
              continue;
              ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: show progress");
              if ((this.lWJ != null) && (this.lWJ.get() != null))
              {
                SoterAuthenticationUIWC.a((SoterAuthenticationUIWC)this.lWJ.get());
                AppMethodBeat.o(59363);
              }
              else
              {
                ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                AppMethodBeat.o(59363);
                continue;
                ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: dismiss progress");
                if ((this.lWJ != null) && (this.lWJ.get() != null))
                {
                  SoterAuthenticationUIWC.b((SoterAuthenticationUIWC)this.lWJ.get());
                  AppMethodBeat.o(59363);
                }
                else
                {
                  ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                  AppMethodBeat.o(59363);
                  continue;
                  ab.i("MicroMsg.SoterAuthenticationUIWC", "hy: show dialog");
                  if ((this.lWJ != null) && (this.lWJ.get() != null))
                  {
                    SoterAuthenticationUIWC.b((b)paramMessage.obj);
                    AppMethodBeat.o(59363);
                  }
                  else
                  {
                    ab.w("MicroMsg.SoterAuthenticationUIWC", "hy: ui cleared");
                    AppMethodBeat.o(59363);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC.a
 * JD-Core Version:    0.6.2
 */