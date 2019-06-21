package com.tencent.mm.plugin.gwallet;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.jg.JgMethodChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.2;
import com.tencent.mm.plugin.gwallet.a.b.3;
import com.tencent.mm.plugin.gwallet.a.b.b;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;

@JgClassChecked(author=31, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK, com.jg.EType.RECEIVERCHECK})
public class GWalletUI extends Activity
{
  BroadcastReceiver jIA;
  private b npw;

  public GWalletUI()
  {
    AppMethodBeat.i(41679);
    this.npw = null;
    this.jIA = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(41677);
        boolean bool;
        if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(paramAnonymousIntent.getAction()))
        {
          paramAnonymousContext = paramAnonymousIntent.getStringArrayListExtra("tokens");
          bool = paramAnonymousIntent.getBooleanExtra("IS_FAILED_CONSUME", false);
          if ((paramAnonymousContext == null) || (paramAnonymousContext.size() == 0))
          {
            GWalletUI.a(GWalletUI.this, 0, null);
            AppMethodBeat.o(41677);
          }
        }
        while (true)
        {
          return;
          d.post(new b.2(GWalletUI.b(GWalletUI.this), paramAnonymousContext, new GWalletUI.3.1(this, bool), new ak()), "IabHelper_consumeAsync");
          AppMethodBeat.o(41677);
        }
      }
    };
    AppMethodBeat.o(41679);
  }

  public final void hW(boolean paramBoolean)
  {
    AppMethodBeat.i(41681);
    b localb = this.npw;
    GWalletUI.4 local4 = new GWalletUI.4(this, paramBoolean);
    ak localak = new ak();
    localb.Oz("queryInventory");
    d.post(new b.3(localb, "inapp", localak, local4), "IabHelper_queryInventoryAsync");
    AppMethodBeat.o(41681);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41685);
    b localb = this.npw;
    Object localObject;
    if (paramInt1 == localb.czV)
    {
      localb.Oz("handleActivityResult");
      if (paramIntent == null)
      {
        b.OA("Null data in IAB activity result.");
        paramIntent = new c(-1002, "Null data in IAB result");
        if (localb.npN != null)
          localb.npN.b(paramIntent, null);
        AppMethodBeat.o(41685);
        return;
      }
      localObject = paramIntent.getExtras().get("RESPONSE_CODE");
      if (localObject != null)
        break label249;
      b.OA("Intent with no response code, assuming OK (known issue)");
      paramInt1 = 0;
    }
    while (true)
    {
      String str = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      localObject = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      ab.d("MicroMsg.IabHelper", "Purchase data: ".concat(String.valueOf(str)));
      ab.d("MicroMsg.IabHelper", "Data signature: ".concat(String.valueOf(localObject)));
      ab.d("MicroMsg.IabHelper", "Extras: " + paramIntent.getExtras());
      ab.d("MicroMsg.IabHelper", "Expected item type: " + localb.npO);
      localObject = new c(paramInt1, "Null data in IAB result");
      if (localb.npN != null)
        localb.npN.b((c)localObject, paramIntent);
      AppMethodBeat.o(41685);
      break;
      label249: if ((localObject instanceof Integer))
      {
        paramInt1 = ((Integer)localObject).intValue();
      }
      else
      {
        if (!(localObject instanceof Long))
          break label290;
        paramInt1 = (int)((Long)localObject).longValue();
      }
    }
    label290: b.OA("Unexpected type for intent response code.");
    b.OA(localObject.getClass().getName());
    paramIntent = new RuntimeException("Unexpected type for intent response code: " + localObject.getClass().getName());
    AppMethodBeat.o(41685);
    throw paramIntent;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41680);
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    ab.d("MicroMsg.GWalletUI", "Creating IAB helper.");
    this.npw = new b(this);
    ab.d("MicroMsg.GWalletUI", "Starting setup.");
    this.npw.a(new GWalletUI.1(this));
    AppMethodBeat.o(41680);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(41686);
    ab.d("MicroMsg.GWalletUI", "Destroying helper.");
    if (this.npw != null)
      this.npw.dispose();
    this.npw = null;
    super.onDestroy();
    AppMethodBeat.o(41686);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(41682);
    if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(paramIntent.getAction()))
      hW(paramIntent.getBooleanExtra("is_direct", true));
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(41682);
  }

  public void onStart()
  {
    AppMethodBeat.i(41683);
    super.onStart();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
    registerReceiver(this.jIA, localIntentFilter);
    AppMethodBeat.o(41683);
  }

  protected void onStop()
  {
    AppMethodBeat.i(41684);
    super.onStop();
    unregisterReceiver(this.jIA);
    AppMethodBeat.o(41684);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.GWalletUI
 * JD-Core Version:    0.6.2
 */