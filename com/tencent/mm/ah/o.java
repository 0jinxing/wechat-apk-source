package com.tencent.mm.ah;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashMap;

public class o
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private i fsp;
  private d fsq;
  private c fsr;
  private g fss;
  private ap fst;

  static
  {
    AppMethodBeat.i(77967);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("IMG_FLAG_TABLE".hashCode()), new o.1());
    eaA.put(Integer.valueOf("HDHEADIMGINFO_TABLE".hashCode()), new o.2());
    AppMethodBeat.o(77967);
  }

  public o()
  {
    AppMethodBeat.i(77957);
    this.fst = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new o.3(this), false);
    AppMethodBeat.o(77957);
  }

  public static d acd()
  {
    AppMethodBeat.i(77959);
    com.tencent.mm.kernel.g.RN().QU();
    if (acs().fsq == null)
      acs().fsq = new d();
    d locald = acs().fsq;
    AppMethodBeat.o(77959);
    return locald;
  }

  public static o acs()
  {
    AppMethodBeat.i(77956);
    o localo = (o)q.Y(o.class);
    AppMethodBeat.o(77956);
    return localo;
  }

  public static i act()
  {
    AppMethodBeat.i(77958);
    com.tencent.mm.kernel.g.RN().QU();
    if (acs().fsp == null)
      acs().fsp = new i(com.tencent.mm.kernel.g.RP().eJN);
    i locali = acs().fsp;
    AppMethodBeat.o(77958);
    return locali;
  }

  public static g acu()
  {
    AppMethodBeat.i(77960);
    com.tencent.mm.kernel.g.RN().QU();
    if (acs().fss == null)
      acs().fss = new g(com.tencent.mm.kernel.g.RP().eJN);
    g localg = acs().fss;
    AppMethodBeat.o(77960);
    return localg;
  }

  public static c acv()
  {
    AppMethodBeat.i(77961);
    com.tencent.mm.kernel.g.RN().QU();
    if (acs().fsr == null)
      acs().fsr = new c();
    c localc = acs().fsr;
    AppMethodBeat.o(77961);
    return localc;
  }

  public static boolean acw()
  {
    AppMethodBeat.i(77965);
    boolean bool;
    if (bo.a((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(59, null), false))
    {
      AppMethodBeat.o(77965);
      bool = true;
    }
    while (true)
    {
      return bool;
      acd();
      if (d.qe(r.Yz()))
      {
        AppMethodBeat.o(77965);
        bool = true;
      }
      else
      {
        String str = r.Yz();
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(77965);
          bool = false;
        }
        else
        {
          Bitmap localBitmap = d.b.ql(com.tencent.mm.plugin.i.c.XW() + "user_" + com.tencent.mm.a.g.x(str.getBytes()) + ".png");
          if ((localBitmap == null) || (localBitmap.isRecycled()))
          {
            AppMethodBeat.o(77965);
            bool = false;
          }
          else
          {
            bool = acd().f(str, localBitmap);
            AppMethodBeat.o(77965);
          }
        }
      }
    }
  }

  static Context getContext()
  {
    AppMethodBeat.i(77964);
    Context localContext = ah.getContext();
    AppMethodBeat.o(77964);
    return localContext;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(77963);
    if (paramBoolean)
    {
      ab.d("MicroMsg.SubCoreAvatar", "update all plugin avatars");
      com.tencent.mm.kernel.g.RP().Ry().set(90113, Boolean.TRUE);
    }
    try
    {
      String str = r.Yz();
      d locald = acd();
      d.E(str, false);
      d.E(str, true);
      locald.e(str, null);
      this.fst.ae(10000L, 10000L);
      b.a(new com.tencent.mm.plugin.avatar.a(), new String[] { "//avatar" });
      AppMethodBeat.o(77963);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SubCoreAvatar", localException, "Failed to refresh avatar.", new Object[0]);
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(77962);
    this.fst.stopTimer();
    if (acs().fsq != null)
      d.reset();
    Object localObject = acs().fsr;
    if (localObject != null)
      com.tencent.mm.kernel.g.Rg().b(123, (com.tencent.mm.ai.f)localObject);
    localObject = acs().fsp;
    if (localObject != null)
      ((i)localObject).frZ.clear();
    b.N(new String[] { "//avatar" });
    AppMethodBeat.o(77962);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.o
 * JD-Core Version:    0.6.2
 */