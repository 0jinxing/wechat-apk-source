package com.tencent.mm.plugin.wepkg.utils;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.pz;
import com.tencent.mm.g.a.pz.a;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.g.a.vv.a;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.model.b.2;
import com.tencent.mm.plugin.wepkg.model.h;
import com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  public com.tencent.mm.sdk.b.c uXW;
  public final com.tencent.mm.sdk.b.c uXX;

  public c()
  {
    AppMethodBeat.i(63636);
    this.uXW = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(pz paramAnonymouspz)
      {
        AppMethodBeat.i(63628);
        boolean bool = paramAnonymouspz.cMo.cCt;
        ab.i("MicroMsg.Wepkg.WepkgListener", "sendEntranceStateListener isInFindEntrance:%b", new Object[] { Boolean.valueOf(bool) });
        if ((bool) && (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSz, Long.valueOf(0L)))) > 60L))
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSz, Long.valueOf(bo.anT()));
          c.a(c.this, 2);
        }
        AppMethodBeat.o(63628);
        return false;
      }
    };
    this.uXX = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(vv paramAnonymousvv)
      {
        AppMethodBeat.i(63632);
        if (ah.bqo())
        {
          bool = com.tencent.mm.m.g.Nv().Ni();
          ab.d("MicroMsg.Wepkg.WepkgListener", "wepkg notify event operation:%d", new Object[] { Integer.valueOf(paramAnonymousvv.cSX.cuy) });
        }
        label100: int i;
        switch (paramAnonymousvv.cSX.cuy)
        {
        default:
          AppMethodBeat.o(63632);
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          while (true)
          {
            return false;
            bool = b.uXV;
            break;
            if (bool)
            {
              AppMethodBeat.o(63632);
            }
            else
            {
              d.aNS().aa(new c.2.1(this));
              break label100;
              if (bool)
              {
                AppMethodBeat.o(63632);
              }
              else
              {
                Object localObject = paramAnonymousvv.cSX.cSY;
                i = paramAnonymousvv.cSX.cTb;
                paramAnonymousvv = new HashSet();
                if (!bo.isNullOrNil((String)localObject))
                  paramAnonymousvv.add(localObject);
                WepkgVersionUpdater.a(paramAnonymousvv, 1, i, false);
                break label100;
                if (bool)
                {
                  AppMethodBeat.o(63632);
                }
                else
                {
                  localObject = paramAnonymousvv.cSX;
                  com.tencent.mm.plugin.wepkg.b.f localf = com.tencent.mm.plugin.wepkg.b.f.dgp();
                  paramAnonymousvv = paramAnonymousvv.cSX.cSY;
                  if ((!localf.hrm) || (bo.isNullOrNil(paramAnonymousvv)))
                    bool = false;
                  while (true)
                  {
                    ((vv.a)localObject).cSZ = bool;
                    break;
                    paramAnonymousvv = localf.ahF(paramAnonymousvv);
                    if ((paramAnonymousvv != null) && (paramAnonymousvv.field_bigPackageReady) && (paramAnonymousvv.field_preloadFilesReady))
                      bool = true;
                    else
                      bool = false;
                  }
                  if (!ah.bqo())
                    break label100;
                  com.tencent.mm.plugin.wepkg.model.b.dgz().dgA();
                  break label100;
                  if (bool)
                  {
                    AppMethodBeat.o(63632);
                  }
                  else
                  {
                    localObject = h.ahX(paramAnonymousvv.cSX.cSY);
                    if (localObject == null)
                      break label100;
                    paramAnonymousvv.cSX.cTa = ((WepkgVersion)localObject).uXP;
                    ab.i("MicroMsg.Wepkg.WepkgListener", "total download count:%s", new Object[] { Integer.valueOf(paramAnonymousvv.cSX.cTa) });
                    break label100;
                    if (!bool)
                      break label389;
                    AppMethodBeat.o(63632);
                  }
                }
              }
            }
          }
          label389: if (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSy, Long.valueOf(0L)))) > 60L)
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSy, Long.valueOf(bo.anT()));
          break;
        case 6:
        case 7:
        case 8:
        }
        for (boolean bool = c.a(c.this, 1); (!bool) && (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSx, Long.valueOf(0L)))) > 1800L); bool = false)
        {
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSx, Long.valueOf(bo.anT()));
          paramAnonymousvv = new vv();
          paramAnonymousvv.cSX.cuy = 0;
          a.xxA.m(paramAnonymousvv);
          break;
          if (bo.isNullOrNil(paramAnonymousvv.cSX.cSY))
          {
            paramAnonymousvv = com.tencent.mm.plugin.wepkg.model.b.dgz();
            if (Looper.getMainLooper() == Looper.myLooper())
            {
              d.aNS().aa(new b.2(paramAnonymousvv));
              break;
            }
            com.tencent.mm.plugin.wepkg.model.b.dQ(null, 0);
            break;
          }
          com.tencent.mm.plugin.wepkg.model.b.dgz().dP(paramAnonymousvv.cSX.cSY, 2);
          break;
          com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:tools", null, c.a.class, null);
          break;
          i = paramAnonymousvv.cSX.scene;
          paramAnonymousvv = paramAnonymousvv.cSX.cTc;
          if (bo.ek(paramAnonymousvv))
            break;
          switch (i)
          {
          default:
            break;
          case 0:
            WepkgVersionUpdater.r(paramAnonymousvv, 4);
            break;
          case 1:
            WepkgVersionUpdater.r(paramAnonymousvv, 3);
            break;
          }
        }
      }
    };
    AppMethodBeat.o(63636);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.c
 * JD-Core Version:    0.6.2
 */