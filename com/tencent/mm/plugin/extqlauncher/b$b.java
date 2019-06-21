package com.tencent.mm.plugin.extqlauncher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mv;
import com.tencent.mm.g.a.mv.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class b$b extends c<mv>
{
  private b$b(b paramb)
  {
    AppMethodBeat.i(20479);
    this.xxI = mv.class.getName().hashCode();
    AppMethodBeat.o(20479);
  }

  private boolean a(mv parammv)
  {
    boolean bool = false;
    AppMethodBeat.i(20480);
    if (!b.a(this.lRT))
    {
      ab.e("MicroMsg.SubCoreExtQLauncher", "!isPluginInstall");
      AppMethodBeat.o(20480);
    }
    while (true)
    {
      return bool;
      if (ah.getContext() == null)
      {
        ab.e("MicroMsg.SubCoreExtQLauncher", "MMApplicationContext null");
        AppMethodBeat.o(20480);
        continue;
      }
      ab.d("MicroMsg.SubCoreExtQLauncher", "GetScanCodeEvent callback flag = %s, url = %s", new Object[] { Integer.valueOf(parammv.cIL.bJt), parammv.cIL.scanResult });
      try
      {
        int i = parammv.cIL.bJt;
        switch (i)
        {
        default:
        case 0:
        }
        do
        {
          AppMethodBeat.o(20480);
          break;
        }
        while ((bo.isNullOrNil(parammv.cIL.scanResult)) || (!parammv.cIL.scanResult.startsWith("qlauncher://")));
        Intent localIntent = new android/content/Intent;
        localIntent.<init>("android.intent.action.VIEW");
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>("com.tencent.qlauncher", "com.tencent.qlauncher.thirdpartycoop.DispatchActivity");
        localIntent.setComponent(localComponentName);
        localIntent.setData(Uri.parse(parammv.cIL.scanResult));
        localIntent.setFlags(268435456);
        ah.getContext().startActivity(localIntent);
        parammv.cIM.ret = 1;
        AppMethodBeat.o(20480);
        bool = true;
      }
      catch (Exception parammv)
      {
        while (true)
          ab.e("MicroMsg.SubCoreExtQLauncher", "Exception in ScanCodeResultEvent, %s", new Object[] { parammv.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.extqlauncher.b.b
 * JD-Core Version:    0.6.2
 */