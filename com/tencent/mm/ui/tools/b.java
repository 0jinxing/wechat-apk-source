package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.ex;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public final class b
{
  private static boolean isDeleteCancel = false;
  private static p tipDialog = null;

  public static void a(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad, int paramInt)
  {
    AppMethodBeat.i(34789);
    a(paramd, paramActivity, paramad, false, null, paramInt);
    AppMethodBeat.o(34789);
  }

  public static void a(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad, boolean paramBoolean, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(34792);
    if ((paramd == null) || (paramActivity == null) || (paramad == null))
    {
      boolean bool2;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null)
          break label82;
        bool2 = true;
        label33: if (paramad != null)
          break label88;
      }
      while (true)
      {
        ab.e("MicroMsg.BizContactDeleteUtil", "error args, %b, %b, %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        AppMethodBeat.o(34792);
        return;
        paramBoolean = false;
        break;
        label82: bool2 = false;
        break label33;
        label88: bool1 = false;
      }
    }
    String str = paramad.field_username;
    paramad.NC();
    aw.ZK();
    com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.c(str, paramInt));
    if (com.tencent.mm.model.t.mW(str))
    {
      ((j)g.K(j.class)).XM().aoU(str);
      aw.ZK();
      com.tencent.mm.model.c.XV().og(str);
      label171: if (com.tencent.mm.app.plugin.a.a.a(paramd))
      {
        paramd = new ex();
        paramd.cyr.cwz = str;
        com.tencent.mm.sdk.b.a.xxA.m(paramd);
      }
      z.aeQ().ri(str);
      z.aeX().QS(str);
      z.aeY().QS(str);
      if (paramBoolean)
      {
        paramInt = paramActivity.getIntent().getIntExtra("Kdel_from", -1);
        if (paramInt != 0)
          break label426;
        paramd = new Intent(paramActivity, LauncherUI.class);
        paramd.addFlags(67108864);
        paramActivity.startActivity(paramd);
      }
    }
    while (true)
    {
      paramActivity.finish();
      AppMethodBeat.o(34792);
      break;
      isDeleteCancel = false;
      paramActivity.getString(2131297061);
      tipDialog = h.b(paramActivity, paramActivity.getString(2131297086), true, new b.2());
      b.3 local3 = new b.3(paramd, str);
      z.afd();
      com.tencent.mm.aj.a.qz(str);
      ((j)g.K(j.class)).XM().b(str, paramad);
      if (paramd.adP())
        f.rf(paramd.field_username);
      while (true)
      {
        if ((paramActivity == null) || (!paramBoolean))
          break label424;
        paramActivity.setResult(-1, paramActivity.getIntent().putExtra("_delete_ok_", true));
        break;
        bf.a(str, local3);
        aw.ZK();
        com.tencent.mm.model.c.XR().aoX(str);
      }
      label424: break label171;
      label426: if (paramInt == 2)
      {
        paramd = new Intent();
        paramd.addFlags(67108864);
        com.tencent.mm.bp.d.b(paramActivity, "brandservice", ".ui.BrandServiceIndexUI", paramd);
      }
    }
  }

  public static void a(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad, boolean paramBoolean, Runnable paramRunnable, int paramInt)
  {
    AppMethodBeat.i(34790);
    if ((paramd == null) || (paramActivity == null) || (paramad == null))
    {
      boolean bool1;
      if (paramd == null)
      {
        paramBoolean = true;
        if (paramActivity != null)
          break label85;
        bool1 = true;
        label31: if (paramad != null)
          break label91;
      }
      label85: label91: for (boolean bool2 = true; ; bool2 = false)
      {
        ab.e("MicroMsg.BizContactDeleteUtil", "bizInfo null : %s, context null : %s, ct null : %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        AppMethodBeat.o(34790);
        return;
        paramBoolean = false;
        break;
        bool1 = false;
        break label31;
      }
    }
    if (paramd.adQ());
    for (String str = paramActivity.getString(2131297749); ; str = paramActivity.getString(2131297750, new Object[] { paramad.Oj() }))
    {
      h.a(paramActivity, str, "", paramActivity.getString(2131298653), paramActivity.getString(2131298652), new b.1(paramd, paramActivity, paramad, paramBoolean, paramInt, paramRunnable), null, 2131690384);
      AppMethodBeat.o(34790);
      break;
    }
  }

  public static void c(com.tencent.mm.aj.d paramd, Activity paramActivity, ad paramad)
  {
    AppMethodBeat.i(34791);
    a(paramd, paramActivity, paramad, false, 0);
    AppMethodBeat.o(34791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.b
 * JD-Core Version:    0.6.2
 */