package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.n.a;
import com.tencent.mm.pluginsdk.ui.preference.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;

public final class p
{
  public static b[] a(Context paramContext, ad paramad, int paramInt)
  {
    AppMethodBeat.i(23613);
    String str = bo.nullAsNil(((Activity)paramContext).getIntent().getStringExtra("Verify_ticket"));
    if (a.jh(paramad.field_type))
    {
      AppMethodBeat.o(23613);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(23613);
        paramContext = null;
      }
      else
      {
        ab.d("MicroMsg.FMessageUtil", "initAddContent, scene = ".concat(String.valueOf(paramInt)));
        if (paramInt == 18)
        {
          ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is lbs");
          paramContext = b.a(paramContext, d.akQ().apz(paramad.field_username));
        }
        while (true)
        {
          if ((paramContext != null) && (paramContext.length != 0))
            break label179;
          AppMethodBeat.o(23613);
          paramContext = null;
          break;
          if (com.tencent.mm.model.bf.kE(paramInt))
          {
            ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is shake");
            paramContext = b.a(paramContext, d.akR().apY(paramad.field_username));
          }
          else
          {
            ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is other");
            paramContext = b.a(paramContext, d.akO().apv(paramad.field_username));
          }
        }
        label179: AppMethodBeat.o(23613);
      }
    }
  }

  public static String b(Context paramContext, ad paramad, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(23614);
    paramContext = bo.nullAsNil(((Activity)paramContext).getIntent().getStringExtra("Verify_ticket"));
    if (a.jh(paramad.field_type))
      AppMethodBeat.o(23614);
    for (paramContext = localObject; ; paramContext = localObject)
    {
      return paramContext;
      if (!bo.isNullOrNil(paramContext))
        break;
      AppMethodBeat.o(23614);
    }
    paramContext = "";
    ab.d("MicroMsg.FMessageUtil", "initAddContent, scene = ".concat(String.valueOf(paramInt)));
    if (paramInt == 18)
    {
      ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is lbs");
      paramad = d.akQ().apz(paramad.field_username);
      if (paramad.length > 0)
        paramContext = paramad[0].field_svrid;
    }
    while (true)
    {
      AppMethodBeat.o(23614);
      break;
      if (com.tencent.mm.model.bf.kE(paramInt))
      {
        ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is shake");
        paramad = d.akR().apY(paramad.field_username);
        if (paramad.length > 0)
          paramContext = paramad[0].field_svrid;
      }
      else
      {
        ab.d("MicroMsg.FMessageUtil", "initAddContent, scene is other");
        paramad = d.akO().apv(paramad.field_username);
        if (paramad.length > 0)
          paramContext = paramad[0].field_svrId;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.p
 * JD-Core Version:    0.6.2
 */