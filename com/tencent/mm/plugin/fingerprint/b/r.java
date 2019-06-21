package com.tencent.mm.plugin.fingerprint.b;

import android.app.Dialog;
import android.arch.lifecycle.Lifecycle;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.faceid.auth.b;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;

public final class r
  implements i
{
  public final void a(MMActivity paramMMActivity, com.tencent.mm.plugin.fingerprint.faceid.auth.a parama, Bundle paramBundle)
  {
    AppMethodBeat.i(41566);
    parama = new b(paramMMActivity, parama, paramBundle);
    parama.setCancelable(false);
    paramMMActivity.getLifecycle().addObserver(parama);
    parama.show();
    AppMethodBeat.o(41566);
  }

  public final boolean g(MMActivity paramMMActivity)
  {
    boolean bool = false;
    AppMethodBeat.i(41567);
    if (((Boolean)g.RP().Ry().get(ac.a.xKQ, Boolean.FALSE)).booleanValue())
    {
      ab.i("MicroMsg.WalletSoterService", "has show the finger print auth guide!");
      AppMethodBeat.o(41567);
      return bool;
    }
    Object localObject1 = com.tencent.mm.wallet_core.a.aE(paramMMActivity);
    Bundle localBundle = new Bundle();
    if (localObject1 != null)
      localBundle = ((c)localObject1).mqu;
    while (true)
    {
      if (TextUtils.isEmpty(localBundle.getString("key_pwd1")))
      {
        ab.i("MicroMsg.WalletSoterService", "pwd is empty, not show the finger print auth guide!");
        AppMethodBeat.o(41567);
        break;
      }
      Object localObject2 = (l)g.K(l.class);
      ab.i("MicroMsg.WalletSoterService", "fingerprint: %s has fingerprint: %s, faceid: %s has faceid: %s", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.wallet.b.a.cOQ()), Boolean.valueOf(((l)localObject2).bxo()), Boolean.valueOf(com.tencent.mm.plugin.wallet.b.a.cOR()), Boolean.valueOf(((l)localObject2).bxB()) });
      Object localObject3;
      if ((!((l)localObject2).bxe()) && (!((l)localObject2).bxh()))
      {
        if ((!com.tencent.mm.plugin.wallet.b.a.cOQ()) || (!((l)localObject2).bxo()) || (!com.tencent.mm.plugin.wallet.b.a.cOR()) || (!((l)localObject2).bxB()))
          break label378;
        localObject3 = new com.tencent.mm.ui.base.i(paramMMActivity, 2131493867);
        ((com.tencent.mm.ui.base.i)localObject3).setContentView(2130968851);
        CheckBox localCheckBox = (CheckBox)((com.tencent.mm.ui.base.i)localObject3).findViewById(2131821792);
        TextView localTextView1 = (TextView)((com.tencent.mm.ui.base.i)localObject3).findViewById(2131821793);
        TextView localTextView2 = (TextView)((com.tencent.mm.ui.base.i)localObject3).findViewById(2131821794);
        localObject2 = (TextView)((com.tencent.mm.ui.base.i)localObject3).findViewById(2131821795);
        localBundle = new Bundle();
        if (localObject1 != null)
          localBundle = ((c)localObject1).mqu;
        localTextView1.setOnClickListener(new r.3(this, paramMMActivity, localBundle, (com.tencent.mm.ui.base.i)localObject3));
        localTextView2.setOnClickListener(new r.4(this, (c)localObject1, localBundle, paramMMActivity, (com.tencent.mm.ui.base.i)localObject3));
        ((TextView)localObject2).setOnClickListener(new r.5(this, localCheckBox, (com.tencent.mm.ui.base.i)localObject3));
        ((com.tencent.mm.ui.base.i)localObject3).show();
        ((MMActivity)paramMMActivity).addDialog((Dialog)localObject3);
      }
      while (true)
      {
        AppMethodBeat.o(41567);
        bool = true;
        break;
        label378: if ((com.tencent.mm.plugin.wallet.b.a.cOQ()) && (((l)localObject2).bxo()) && (!((l)localObject2).bxe()))
        {
          localObject1 = new Intent();
          ((Intent)localObject1).putExtras(localBundle);
          d.b(paramMMActivity, "fingerprint", ".ui.FingerPrintAuthTransparentUI", (Intent)localObject1);
        }
        else if ((com.tencent.mm.plugin.wallet.b.a.cOR()) && (((l)localObject2).bxB()) && (!((l)localObject2).bxh()))
        {
          localObject3 = LayoutInflater.from(paramMMActivity).inflate(2130969563, null);
          localObject1 = (TextView)((View)localObject3).findViewById(2131824048);
          localObject2 = (CheckBox)((View)localObject3).findViewById(2131824049);
          ((TextView)localObject1).setText(paramMMActivity.getString(2131299557));
          h.a(paramMMActivity, false, null, (View)localObject3, paramMMActivity.getString(2131297757), paramMMActivity.getString(2131296868), new r.1(this, paramMMActivity, localBundle), new r.2(this, (CheckBox)localObject2));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.r
 * JD-Core Version:    0.6.2
 */