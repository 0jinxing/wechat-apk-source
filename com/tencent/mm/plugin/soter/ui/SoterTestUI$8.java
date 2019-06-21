package com.tencent.mm.plugin.soter.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.core.a.a.b;
import com.tencent.soter.core.a.a.d;
import com.tencent.soter.core.c.j;
import java.security.Signature;
import java.security.SignatureException;

final class SoterTestUI$8
  implements View.OnClickListener
{
  SoterTestUI$8(SoterTestUI paramSoterTestUI)
  {
  }

  public final void onClick(final View paramView)
  {
    AppMethodBeat.i(59391);
    paramView = com.tencent.soter.core.a.aud("sample_auth_key_name");
    if (paramView != null);
    try
    {
      paramView.update("challenge".getBytes());
      paramView.sign();
      ab.e("MicroMsg.SoterTestUI", "hy: should NOT happen if no exception");
      SoterTestUI.a(this.rOJ).setText("not passed: signature success without fingerprint authentication");
      AppMethodBeat.o(59391);
      while (true)
      {
        return;
        ab.e("MicroMsg.SoterTestUI", "hy: signature is null. do sign failed");
        AppMethodBeat.o(59391);
      }
    }
    catch (SignatureException localSignatureException)
    {
      while (true)
      {
        ab.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + localSignatureException.toString());
        com.tencent.soter.core.a.a locala = com.tencent.soter.core.a.a.iU(this.rOJ);
        if ((locala.isHardwareDetected()) && (locala.hasEnrolledFingerprints()))
        {
          locala.a(new a.d(paramView), null, new a.b()
          {
            public final void cvW()
            {
              AppMethodBeat.i(59388);
              ab.i("MicroMsg.SoterTestUI", "hy: onAuthenticationSucceeded");
              try
              {
                paramView.update("challenge".getBytes());
                Object localObject = com.tencent.soter.core.a.co(paramView.sign());
                TextView localTextView = SoterTestUI.a(SoterTestUI.8.this.rOJ);
                if (localObject == null);
                for (localObject = "not pass: exception occurs"; ; localObject = ((j)localObject).toString())
                {
                  localTextView.setText((CharSequence)localObject);
                  AppMethodBeat.o(59388);
                  return;
                }
              }
              catch (SignatureException localSignatureException)
              {
                while (true)
                {
                  ab.e("MicroMsg.SoterTestUI", "hy: occurred exception when sign: " + localSignatureException.toString());
                  AppMethodBeat.o(59388);
                }
              }
            }

            public final void onAuthenticationCancelled()
            {
              AppMethodBeat.i(59390);
              super.onAuthenticationCancelled();
              AppMethodBeat.o(59390);
            }

            public final void onAuthenticationError(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
            {
              AppMethodBeat.i(59386);
              ab.i("MicroMsg.SoterTestUI", "hy: onAuthenticationError");
              AppMethodBeat.o(59386);
            }

            public final void onAuthenticationFailed()
            {
              AppMethodBeat.i(59389);
              ab.i("MicroMsg.SoterTestUI", "hy: onAuthenticationFailed");
              AppMethodBeat.o(59389);
            }

            public final void onAuthenticationHelp(int paramAnonymousInt, CharSequence paramAnonymousCharSequence)
            {
              AppMethodBeat.i(59387);
              ab.i("MicroMsg.SoterTestUI", "hy: onAuthenticationHelp");
              AppMethodBeat.o(59387);
            }
          });
          AppMethodBeat.o(59391);
        }
        else
        {
          ab.e("MicroMsg.SoterTestUI", "hy: no hardware detected or no fingerprint registered");
          AppMethodBeat.o(59391);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.ui.SoterTestUI.8
 * JD-Core Version:    0.6.2
 */