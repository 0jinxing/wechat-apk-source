package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aq.b;
import com.tencent.mm.az.d;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.p;

public final class c
{
  public static void a(final String paramString, final Context paramContext, final ak paramak, final Runnable paramRunnable, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    AppMethodBeat.i(34169);
    final PBool localPBool = new PBool();
    Object localObject;
    if (t.kH(paramString))
    {
      paramak = null;
      aw.ZK();
      localObject = com.tencent.mm.model.c.XO().Ra(paramString);
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new d(paramString, ((cy)localObject).field_msgSvrId));
      localPBool.value = false;
      paramContext.getString(2131297061);
      localObject = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131297086), true, new c.1(localPBool));
      if (!localPBool.value)
        paramak = e.akq(paramString);
      if (!ah.isNullOrNil(paramak))
      {
        ((ProgressDialog)localObject).dismiss();
        com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(2131304729, new Object[] { paramak }), null, paramContext.getString(2131300420), paramContext.getString(2131298854), new c.7(localPBool, paramContext, paramBoolean2, paramString, paramBoolean1), new c.8((ProgressDialog)localObject, localPBool, paramString, paramBoolean1, paramRunnable), -1, 2131689665);
        if (!t.ng(paramString))
          break label714;
        ab.i("MicroMsg.ConvDelLogic", "del all qmessage");
        bf.aab();
        aw.ZK();
        com.tencent.mm.model.c.XR().aoY("@qqim");
        AppMethodBeat.o(34169);
      }
    }
    while (true)
    {
      return;
      ((ProgressDialog)localObject).dismiss();
      com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131299942), "", paramContext.getString(2131296881), paramContext.getString(2131296868), new c.9(paramString, localPBool, (ProgressDialog)localObject, paramRunnable), null, 2131689665);
      break;
      if (t.np(paramString))
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().aoY(paramString);
        paramContext = new ng();
        paramContext.cJw.opType = 4;
        paramContext.cJw.cJB = 20;
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
        break;
      }
      if (t.nf(paramString))
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().aoY(paramString);
        break;
      }
      if (t.ni(paramString))
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().aoX(paramString);
        break;
      }
      if (f.kq(paramString))
      {
        localPBool.value = false;
        paramContext.getString(2131297061);
        paramak = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131297086), true, new c.10(localPBool));
        paramak.dismiss();
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(2131299940), "", paramContext.getString(2131296881), paramContext.getString(2131296868), new c.11(paramString, localPBool, paramak, paramString), null, 2131689665);
        break;
      }
      aw.ZK();
      localObject = com.tencent.mm.model.c.XO().Ra(paramString);
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new d(paramString, ((cy)localObject).field_msgSvrId));
      localPBool.value = false;
      paramContext.getString(2131297061);
      p localp = com.tencent.mm.ui.base.h.b(paramContext, paramContext.getString(2131297086), true, new c.12(localPBool));
      localObject = null;
      if (!localPBool.value)
        localObject = e.akq(paramString);
      if (!ah.isNullOrNil((String)localObject))
      {
        localp.dismiss();
        com.tencent.mm.ui.base.h.a(paramContext, false, paramContext.getString(2131304729, new Object[] { localObject }), null, paramContext.getString(2131300420), paramContext.getString(2131298854), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(34167);
            this.zqU.value = true;
            c.c(paramContext, paramBoolean2, paramString);
            if (paramBoolean1)
              com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(4), paramString });
            AppMethodBeat.o(34167);
          }
        }
        , new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(34168);
            this.zqV.show();
            localPBool.value = false;
            c.a(paramString, paramak, localPBool, this.zqV);
            if (paramRunnable != null)
              paramRunnable.run();
            if (paramBoolean1)
              com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(3), paramString });
            AppMethodBeat.o(34168);
          }
        }
        , -1, 2131689665);
        break;
      }
      localp.dismiss();
      if (t.ny(paramString));
      for (int i = 2131299941; ; i = 2131299940)
      {
        com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(i), "", paramContext.getString(2131296881), paramContext.getString(2131296868), new c.2(paramContext, paramString, paramak, localPBool, localp, paramRunnable), null, 2131689665);
        break;
      }
      label714: if (t.ne(paramString))
      {
        ab.i("MicroMsg.ConvDelLogic", "del all tmessage");
        bf.aac();
        aw.ZK();
        com.tencent.mm.model.c.XR().aoY("@t.qq.com");
      }
      AppMethodBeat.o(34169);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c
 * JD-Core Version:    0.6.2
 */