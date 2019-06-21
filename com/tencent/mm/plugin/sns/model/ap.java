package com.tencent.mm.plugin.sns.model;

import android.view.Menu;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.rx;
import com.tencent.mm.g.a.ry;
import com.tencent.mm.g.a.rz;
import com.tencent.mm.g.a.th;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.l;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;

public final class ap
{
  private static HashMap<String, ap.b> qMP;
  private static LinkedList<ap.a> qMQ;
  private static c qMR;

  static
  {
    AppMethodBeat.i(36633);
    qMP = new HashMap();
    qMQ = new LinkedList();
    qMR = new ap.1();
    AppMethodBeat.o(36633);
  }

  private static boolean Cj()
  {
    boolean bool = false;
    AppMethodBeat.i(36615);
    if (!d.afj("translate"))
      AppMethodBeat.o(36615);
    while (true)
    {
      return bool;
      String str = g.Nu().getValue("TranslateSnsOff");
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(36615);
        bool = true;
      }
      else if (bo.ank(str) != 0)
      {
        AppMethodBeat.o(36615);
      }
      else
      {
        AppMethodBeat.o(36615);
        bool = true;
      }
    }
  }

  public static ap.b Ye(String paramString)
  {
    AppMethodBeat.i(36630);
    if (qMP.containsKey(paramString))
    {
      paramString = (ap.b)qMP.get(paramString);
      AppMethodBeat.o(36630);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(36630);
    }
  }

  public static void a(Menu paramMenu, boolean paramBoolean)
  {
    AppMethodBeat.i(36616);
    if (Cj())
      if (paramBoolean)
      {
        paramMenu.add(0, 14, 0, 2131303836);
        AppMethodBeat.o(36616);
      }
    while (true)
    {
      return;
      paramMenu.add(0, 15, 0, 2131303836);
      AppMethodBeat.o(36616);
    }
  }

  public static void a(ap.b paramb)
  {
    AppMethodBeat.i(36619);
    if ((paramb.dtW & 0x2) != 0)
      paramb.qMU = false;
    while (true)
    {
      qMP.put(paramb.id, paramb);
      AppMethodBeat.o(36619);
      return;
      if ((paramb.dtW & 0x4) != 0)
        paramb.qMV = false;
    }
  }

  public static void a(l paraml)
  {
    AppMethodBeat.i(36622);
    String str;
    if ((paraml != null) && (paraml.qJj != null))
    {
      str = paraml.ncM;
      if (bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.SnsTranslateManager", "commentContent is empty, quit translate");
        AppMethodBeat.o(36622);
      }
    }
    while (true)
    {
      return;
      Object localObject = new StringBuilder();
      if (paraml.qJj.wZG != 0);
      for (long l = paraml.qJj.wZG; ; l = paraml.qJj.wZJ)
      {
        localObject = l;
        paraml = ga(paraml.rib, (String)localObject);
        if (!qMP.containsKey(paraml))
          break label182;
        localObject = (ap.b)qMP.get(paraml);
        if ((!((ap.b)localObject).foa) || (bo.isNullOrNil(((ap.b)localObject).result)))
          break label174;
        ab.d("MicroMsg.SnsTranslateManager", "translateComment, get from cache, id:%s", new Object[] { paraml });
        f(((ap.b)localObject).id, 2, ((ap.b)localObject).result, ((ap.b)localObject).fwM);
        AppMethodBeat.o(36622);
        break;
      }
      label174: qMP.remove(paraml);
      label182: localObject = new th();
      ((th)localObject).cPy.id = paraml;
      ((th)localObject).cPy.cPz = str;
      ((th)localObject).cPy.type = 3;
      a.xxA.m((b)localObject);
      cY(paraml, 2);
      localObject = new ap.a((byte)0);
      ((ap.a)localObject).id = paraml;
      ((ap.a)localObject).qMS = str;
      ((ap.a)localObject).type = 3;
      qMQ.add(localObject);
      ab.d("MicroMsg.SnsTranslateManager", "translateComment, id:%s", new Object[] { ((ap.a)localObject).id });
      AppMethodBeat.o(36622);
    }
  }

  public static void aon()
  {
    AppMethodBeat.i(36614);
    a.xxA.d(qMR);
    AppMethodBeat.o(36614);
  }

  public static void b(Menu paramMenu, boolean paramBoolean)
  {
    AppMethodBeat.i(36617);
    if (Cj())
      if (paramBoolean)
      {
        paramMenu.add(0, 16, 0, 2131303838);
        AppMethodBeat.o(36617);
      }
    while (true)
    {
      return;
      paramMenu.add(0, 17, 0, 2131303838);
      AppMethodBeat.o(36617);
    }
  }

  private static void b(ap.b paramb)
  {
    AppMethodBeat.i(36620);
    if ((paramb.dtW & 0x2) != 0)
      paramb.qMU = true;
    while (true)
    {
      qMP.put(paramb.id, paramb);
      AppMethodBeat.o(36620);
      return;
      if ((paramb.dtW & 0x4) != 0)
        paramb.qMV = true;
    }
  }

  public static void b(l paraml)
  {
    AppMethodBeat.i(36623);
    Object localObject;
    if (paraml != null)
    {
      localObject = new StringBuilder();
      if (paraml.qJj.wZG == 0)
        break label115;
    }
    label115: for (long l = paraml.qJj.wZG; ; l = paraml.qJj.wZJ)
    {
      localObject = l;
      paraml = ga(paraml.rib, (String)localObject);
      b(Ye(paraml));
      localObject = new rz();
      ((rz)localObject).cNU.type = 2;
      ((rz)localObject).cNU.id = paraml;
      a.xxA.m((b)localObject);
      ab.d("MicroMsg.SnsTranslateManager", "unTranslateComment, id:%s", new Object[] { paraml });
      AppMethodBeat.o(36623);
      return;
    }
  }

  public static boolean c(ap.b paramb)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramb != null)
    {
      bool2 = bool1;
      if ((paramb.dtW & 0x2) != 0)
        bool2 = true;
    }
    return bool2;
  }

  private static void cY(String paramString, int paramInt)
  {
    AppMethodBeat.i(36624);
    if (!qMP.containsKey(paramString))
    {
      localObject = new ap.b();
      ((ap.b)localObject).id = paramString;
      ((ap.b)localObject).fwM = null;
      ((ap.b)localObject).result = null;
      ((ap.b)localObject).foa = false;
      ((ap.b)localObject).aAR = false;
      ((ap.b)localObject).qMV = true;
      ((ap.b)localObject).qMU = true;
      qMP.put(paramString, localObject);
    }
    Object localObject = new ry();
    ((ry)localObject).cNT.type = paramInt;
    ((ry)localObject).cNT.id = paramString;
    a.xxA.m((b)localObject);
    AppMethodBeat.o(36624);
  }

  public static void cZ(String paramString, int paramInt)
  {
    AppMethodBeat.i(36627);
    if (qMP.containsKey(paramString))
    {
      ap.b localb = (ap.b)qMP.get(paramString);
      localb.dtW |= paramInt;
      qMP.put(paramString, localb);
    }
    AppMethodBeat.o(36627);
  }

  public static HashMap<String, ap.b> coh()
  {
    return qMP;
  }

  public static void da(String paramString, int paramInt)
  {
    AppMethodBeat.i(36628);
    if (qMP.containsKey(paramString))
    {
      ap.b localb = (ap.b)qMP.get(paramString);
      localb.dtW &= (paramInt ^ 0xFFFFFFFF);
      if ((paramInt != 2) && (paramInt == 4))
        localb.qMV = true;
      qMP.put(paramString, localb);
    }
    AppMethodBeat.o(36628);
  }

  public static boolean db(String paramString, int paramInt)
  {
    AppMethodBeat.i(36629);
    boolean bool;
    if (qMP.containsKey(paramString))
      if ((((ap.b)qMP.get(paramString)).dtW & paramInt) != 0)
      {
        bool = true;
        AppMethodBeat.o(36629);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(36629);
      bool = false;
      continue;
      AppMethodBeat.o(36629);
      bool = false;
    }
  }

  private static void f(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(36625);
    if (qMP.containsKey(paramString1))
    {
      localObject = (ap.b)qMP.get(paramString1);
      ((ap.b)localObject).fwM = paramString3;
      ((ap.b)localObject).result = paramString2;
      ((ap.b)localObject).foa = true;
      ((ap.b)localObject).aAR = bo.isNullOrNil(paramString2);
      qMP.put(paramString1, localObject);
    }
    if (bo.isNullOrNil(paramString2))
      Toast.makeText(ah.getContext(), 2131303837, 1).show();
    Object localObject = new rx();
    ((rx)localObject).cNR.type = paramInt;
    ((rx)localObject).cNR.id = paramString1;
    ((rx)localObject).cNR.result = paramString2;
    ((rx)localObject).cNR.cNS = paramString3;
    a.xxA.m((b)localObject);
    AppMethodBeat.o(36625);
  }

  public static String ga(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36626);
    paramString1 = paramString1 + ";" + paramString2;
    AppMethodBeat.o(36626);
    return paramString1;
  }

  public static void init()
  {
    AppMethodBeat.i(36613);
    a.xxA.c(qMR);
    AppMethodBeat.o(36613);
  }

  public static void r(n paramn)
  {
    AppMethodBeat.i(36618);
    String str;
    if (paramn != null)
    {
      str = paramn.cqA();
      ab.d("MicroMsg.SnsTranslateManager", "translatePost, id:%s", new Object[] { str });
      if (paramn.field_snsId == 0L)
      {
        ab.d("MicroMsg.SnsTranslateManager", "translatePost, the id is null or zero");
        qMP.remove(str);
        f(str, 1, null, null);
        AppMethodBeat.o(36618);
      }
    }
    while (true)
    {
      return;
      Object localObject;
      if (qMP.containsKey(str))
      {
        localObject = (ap.b)qMP.get(str);
        if ((((ap.b)localObject).foa) && (!((ap.b)localObject).aAR))
        {
          ab.d("MicroMsg.SnsTranslateManager", "translatePost, get from cache, id:%s", new Object[] { str });
          f(((ap.b)localObject).id, 1, ((ap.b)localObject).result, ((ap.b)localObject).fwM);
          AppMethodBeat.o(36618);
        }
        else
        {
          qMP.remove(str);
        }
      }
      else
      {
        if (paramn.cqu() != null)
        {
          localObject = paramn.cqu().xfF;
          th localth = new th();
          localth.cPy.id = str;
          localth.cPy.cPz = ((String)localObject);
          localth.cPy.type = 2;
          a.xxA.m(localth);
          cY(paramn.cqA(), 1);
          paramn = new ap.a((byte)0);
          paramn.id = str;
          paramn.qMS = ((String)localObject);
          paramn.type = 2;
          qMQ.add(paramn);
        }
        AppMethodBeat.o(36618);
      }
    }
  }

  public static void s(n paramn)
  {
    AppMethodBeat.i(36621);
    if (paramn != null)
    {
      paramn = paramn.cqA();
      b(Ye(paramn));
      rz localrz = new rz();
      localrz.cNU.type = 1;
      localrz.cNU.id = paramn;
      a.xxA.m(localrz);
      ab.d("MicroMsg.SnsTranslateManager", "unTranslatePost, id:%s", new Object[] { paramn });
    }
    AppMethodBeat.o(36621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ap
 * JD-Core Version:    0.6.2
 */