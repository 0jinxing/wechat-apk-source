package com.tencent.mm.model.gdpr.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.e;
import com.tencent.mm.protocal.protobuf.bxx;
import com.tencent.mm.protocal.protobuf.bxy;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

final class MPGdprPolicyUI$1
  implements e
{
  MPGdprPolicyUI$1(MPGdprPolicyUI paramMPGdprPolicyUI)
  {
  }

  public final void a(MMWebView paramMMWebView)
  {
    AppMethodBeat.i(1500);
    this.foz.runOnUiThread(new MPGdprPolicyUI.1.3(this));
    AppMethodBeat.o(1500);
  }

  public final boolean aba()
  {
    AppMethodBeat.i(1498);
    this.foz.runOnUiThread(new MPGdprPolicyUI.1.1(this));
    AppMethodBeat.o(1498);
    return true;
  }

  public final void abb()
  {
    AppMethodBeat.i(1499);
    this.foz.runOnUiThread(new MPGdprPolicyUI.1.2(this));
    AppMethodBeat.o(1499);
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(1501);
    if (paramInt == 200)
    {
      boolean bool = paramBundle.getBoolean("OnMPGdprPolicyAgreement_KIsAgree", false);
      MPGdprPolicyUI.a(this.foz, bool);
      MPGdprPolicyUI.b(this.foz);
      if ((bool) && (!bo.isNullOrNil(MPGdprPolicyUI.c(this.foz))) && (MPGdprPolicyUI.d(this.foz).foo != 0))
      {
        com.tencent.mm.ai.a locala = new com.tencent.mm.ai.a();
        bxx localbxx = new bxx();
        localbxx.csB = MPGdprPolicyUI.c(this.foz);
        localbxx.scene = MPGdprPolicyUI.d(this.foz).foo;
        paramBundle = new b.a();
        paramBundle.fsJ = localbxx;
        paramBundle.fsK = new bxy();
        paramBundle.fsI = 2734;
        paramBundle.uri = "/cgi-bin/mmbiz-bin/wxabusiness/setgdrpauth";
        locala.ehh = paramBundle.acD();
        locala.acy();
      }
    }
    AppMethodBeat.o(1501);
    return false;
  }

  public final boolean oZ(String paramString)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI.1
 * JD-Core Version:    0.6.2
 */