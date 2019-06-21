package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.dj;
import com.tencent.mm.protocal.protobuf.dt;
import com.tencent.mm.protocal.protobuf.du;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class af
{
  public static int a(Context paramContext, com.tencent.mm.protocal.protobuf.av paramav)
  {
    int i = 0;
    AppMethodBeat.i(38468);
    if (paramav == null)
      AppMethodBeat.o(38468);
    while (true)
    {
      return i;
      if (paramav.jCt == 6)
      {
        if (paramav.vCA == null)
        {
          AppMethodBeat.o(38468);
        }
        else if (a.gkF.u(paramContext, paramav.vCy.fKh))
        {
          i = paramav.vCA.vFo;
          AppMethodBeat.o(38468);
        }
        else
        {
          i = paramav.vCA.vFp;
          AppMethodBeat.o(38468);
        }
      }
      else
      {
        i = paramav.Scene;
        AppMethodBeat.o(38468);
      }
    }
  }

  public static void a(Context paramContext, av paramav, com.tencent.mm.protocal.protobuf.av paramav1)
  {
    AppMethodBeat.i(38469);
    Object localObject;
    boolean bool;
    if ((paramav1 != null) && (paramav1.vCy != null))
    {
      localObject = paramav1.vCy.fKh;
      label137: if (bo.isNullOrNil((String)localObject))
      {
        bool = false;
        if (!bool)
          break label448;
        paramav.rBh = false;
        if ((paramav1.vCC == null) || (paramav1.vCD == null))
          break label278;
        if (!a.gkF.u(paramContext, paramav1.vCy.fKh))
          break label236;
        paramContext = paramav1.vCC;
        label82: localObject = aa.dor();
        if (!((String)localObject).equals("zh_CN"))
          break label244;
        paramContext = paramContext.vFA;
        label100: switch (paramav1.jCt)
        {
        default:
          paramav.rBh = false;
          if (bo.isNullOrNil(paramContext))
          {
            ab.e("MicroMsg.OpenActionContent", "text can not load ?");
            paramav.rBh = false;
          }
          AppMethodBeat.o(38469);
        case 4:
        case 5:
        case 6:
        }
      }
    }
    while (true)
    {
      while (true)
      {
        return;
        localObject = g.bT((String)localObject, true);
        if ((localObject == null) || (bo.isNullOrNil(((f)localObject).field_appId)))
        {
          bool = false;
          break;
        }
        if ((((f)localObject).field_appInfoFlag & 0x20) > 0);
        for (bool = true; ; bool = false)
        {
          ab.v("MicroMsg.AppInfoLogic", "canShowSNSTail, appid = %s, ret = %b", new Object[] { ((f)localObject).field_appId, Boolean.valueOf(bool) });
          break;
        }
        label236: paramContext = paramav1.vCD;
        break label82;
        label244: if ((((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK")))
        {
          paramContext = paramContext.vFB;
          break label100;
        }
        paramContext = paramContext.vFz;
        break label100;
        label278: if (paramav1 == null)
          localObject = "";
        try
        {
          while (true)
          {
            if (bo.isNullOrNil((String)localObject))
              break label395;
            int i = paramContext.getResources().getIdentifier((String)localObject, "string", paramContext.getPackageName());
            if (i <= 0)
              break label395;
            paramContext = paramContext.getString(i);
            break;
            if (paramav1.jCt == 6)
            {
              if (paramav1.vCB == null)
                localObject = "";
              else if (a.gkF.u(paramContext, paramav1.vCy.fKh))
                localObject = paramav1.vCB.vFC;
              else
                localObject = paramav1.vCB.vFD;
            }
            else
              localObject = paramav1.vCz;
          }
        }
        catch (Exception paramContext)
        {
          label395: paramContext = "";
        }
      }
      break label100;
      paramav.rBi = paramContext;
      paramav.rBh = true;
      break label137;
      if (paramav1.Scene != 1)
        break label137;
      paramav.rBi = paramContext;
      paramav.rBh = true;
      break label137;
      paramav.rBi = paramContext;
      paramav.rBh = true;
      break label137;
      label448: paramav.rBh = false;
      AppMethodBeat.o(38469);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.af
 * JD-Core Version:    0.6.2
 */