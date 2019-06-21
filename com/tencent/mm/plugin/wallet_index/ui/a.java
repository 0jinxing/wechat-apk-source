package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.auh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
  implements b
{
  public static long tRs = 0L;
  BroadcastReceiver jIA;
  String kWz;
  private String tQX;
  String tQY;
  private d tRp;
  private d tRq;
  private c tRr;
  private d tRt;
  private com.tencent.mm.plugin.wallet_index.b.a.a tRu;
  private com.tencent.mm.plugin.wallet_index.b.a.b tRv;
  String tRw;

  public a(Activity paramActivity, c paramc, d paramd)
  {
    AppMethodBeat.i(48220);
    this.tRp = null;
    this.tRq = null;
    this.jIA = new a.1(this);
    this.tRt = paramd;
    tRs = 0L;
    this.tRr = paramc;
    paramc = new IntentFilter();
    paramc.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
    paramc.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
    paramActivity.registerReceiver(this.jIA, paramc);
    this.tRu = new com.tencent.mm.plugin.wallet_index.b.a.a();
    AppMethodBeat.o(48220);
  }

  private static void b(MMActivity paramMMActivity, int paramInt)
  {
    AppMethodBeat.i(48223);
    com.tencent.mm.plugin.wallet_index.c.b localb = com.tencent.mm.plugin.wallet_index.c.b.bu(paramInt, "");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", localb.nqa);
    localIntent.putExtra("key_err_msg", localb.nqb);
    localIntent.putExtra("key_launch_ts", tRs);
    paramMMActivity.setResult(-1, localIntent);
    paramMMActivity.finish();
    AppMethodBeat.o(48223);
  }

  public final int a(MMActivity paramMMActivity, d paramd)
  {
    AppMethodBeat.i(48221);
    this.tRp = paramd;
    this.kWz = this.tRr.tRe.pho;
    this.tQY = this.tRr.tRe.pdz;
    this.tQX = this.tRr.tRe.wma;
    Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
    localIntent.setPackage("com.tencent.mm");
    localIntent.putExtra("product_id", this.kWz);
    this.tRw = this.tRr.tRe.wym;
    Object localObject1 = this.tRw;
    Object localObject2 = this.tQY;
    String str = this.tQX;
    paramd = (d)localObject1;
    if (bo.isNullOrNil((String)localObject1))
      paramd = "";
    localObject1 = localObject2;
    if (bo.isNullOrNil((String)localObject2))
      localObject1 = "";
    localObject2 = str;
    if (bo.isNullOrNil(str))
      localObject2 = "";
    localIntent.putExtra("developer_pay_load", paramd + "[#]" + (String)localObject1 + "[#]" + (String)localObject2);
    if (!paramMMActivity.getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty())
    {
      tRs = bo.anU();
      ab.i("MicroMsg.GoogleWallet", "GWallet Found!");
      paramMMActivity.startActivityForResult(localIntent, 10001);
    }
    while (true)
    {
      AppMethodBeat.o(48221);
      return 10001;
      ab.i("MicroMsg.GoogleWallet", "Try to downloading GWallet Moudle!");
      paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(3, "");
      if (this.tRp != null)
        this.tRp.a(paramMMActivity, null);
    }
  }

  public final void a(MMActivity paramMMActivity, ArrayList<String> paramArrayList, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(48226);
    this.tRq = paramd;
    ab.d("MicroMsg.GoogleWallet", "consumePurchase. consume...");
    com.tencent.mm.plugin.wallet_index.b.a.b localb = this.tRv;
    paramd = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      Object localObject = (String)paramArrayList.next();
      localObject = (com.tencent.mm.plugin.wallet_index.b.a.c)localb.tQQ.get(localObject);
      if (localObject != null)
        paramd.add(((com.tencent.mm.plugin.wallet_index.b.a.c)localObject).gtl);
    }
    if (paramd.size() > 0)
    {
      paramArrayList = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
      paramArrayList.setPackage("com.tencent.mm");
      paramArrayList.putStringArrayListExtra("tokens", paramd);
      paramArrayList.putExtra("IS_FAILED_CONSUME", paramBoolean);
      paramMMActivity.sendBroadcast(paramArrayList);
      AppMethodBeat.o(48226);
    }
    while (true)
    {
      return;
      paramMMActivity = com.tencent.mm.plugin.wallet_index.c.b.bu(0, "");
      if (this.tRq != null)
        this.tRq.a(paramMMActivity, null);
      AppMethodBeat.o(48226);
    }
  }

  public final boolean a(MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48224);
    if (paramInt1 == 10001)
    {
      ab.i("MicroMsg.GoogleWallet", "purchase flow!result_code: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramIntent != null)
      {
        paramInt1 = paramIntent.getIntExtra("RESPONSE_CODE", 0);
        if ((paramInt1 == 3) || (paramInt1 == 105))
        {
          z.d(this.tRw, this.kWz, this.tQY, paramInt1, "");
          b(paramMMActivity, paramInt1);
          AppMethodBeat.o(48224);
        }
      }
    }
    while (true)
    {
      return true;
      if (paramInt1 == 100000001)
      {
        b(paramMMActivity, paramInt1);
        AppMethodBeat.o(48224);
        continue;
        b(paramMMActivity, 1);
        AppMethodBeat.o(48224);
      }
      else
      {
        d locald = this.tRq;
        paramMMActivity = this.tRw;
        String str1 = this.kWz;
        String str2 = this.tQY;
        paramInt1 = com.tencent.mm.plugin.wallet_index.b.a.a.ay(paramIntent);
        ab.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(paramInt1));
        paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(paramInt1, "");
        z.d(paramMMActivity, str1, str2, paramInt1, paramIntent.nqb);
        if (locald != null)
          locald.a(paramIntent, null);
        AppMethodBeat.o(48224);
      }
    }
  }

  public final void b(MMActivity paramMMActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(48225);
    ab.d("MicroMsg.GoogleWallet", "restorePurchase. Querying inventory.");
    ab.d("MicroMsg.GoogleWallet", "is direct? ".concat(String.valueOf(paramBoolean)));
    Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
    localIntent.setPackage("com.tencent.mm");
    localIntent.putExtra("is_direct", paramBoolean);
    paramMMActivity.startActivityForResult(localIntent, 10001);
    AppMethodBeat.o(48225);
  }

  public final int cSW()
  {
    return 3;
  }

  public final void l(MMActivity paramMMActivity)
  {
    AppMethodBeat.i(48222);
    try
    {
      paramMMActivity.unregisterReceiver(this.jIA);
      if (!bo.cv(paramMMActivity))
      {
        ab.d("MicroMsg.GoogleWallet", "close front UI.");
        Intent localIntent = new Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        localIntent.setPackage("com.tencent.mm");
        paramMMActivity.sendBroadcast(localIntent);
      }
      ab.d("MicroMsg.GoogleWallet", "Destroying helper.");
      AppMethodBeat.o(48222);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        ab.e("MicroMsg.GoogleWallet", localIllegalArgumentException.toString());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.a
 * JD-Core Version:    0.6.2
 */