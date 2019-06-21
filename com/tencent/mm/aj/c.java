package com.tencent.mm.aj;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.afu;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.bxq;
import com.tencent.mm.protocal.protobuf.hf;
import com.tencent.mm.protocal.protobuf.km;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends j<b>
  implements com.tencent.mm.ai.f
{
  public static final String[] fnj;
  public static hf fuK;
  private e bSd;
  private final l<c.a, c.a.a> fuL;

  static
  {
    AppMethodBeat.i(11270);
    fnj = new String[] { j.a(b.ccO, "BizEnterprise") };
    AppMethodBeat.o(11270);
  }

  public c(e parame)
  {
    super(parame, b.ccO, "BizEnterprise", null);
    AppMethodBeat.i(11254);
    this.fuL = new c.1(this);
    this.bSd = parame;
    parame.hY("BizEnterprise", "CREATE INDEX IF NOT EXISTS BizEnterpriseUserNameIndex ON BizEnterprise ( userName )");
    g.RO().eJo.a(1343, this);
    g.RO().eJo.a(1228, this);
    AppMethodBeat.o(11254);
  }

  public static y a(String paramString, boolean paramBoolean, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(11264);
    km localkm = new km();
    localkm.vNb = paramString;
    int i;
    if (paramBoolean)
    {
      i = 1;
      localkm.vNv = i;
      localkm.vNt = 0;
      paramString = new y(localkm, paramf);
      if (!g.RO().eJo.a(paramString, 0))
        break label75;
      AppMethodBeat.o(11264);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label75: paramString = null;
      AppMethodBeat.o(11264);
    }
  }

  public static void a(y paramy)
  {
    AppMethodBeat.i(11266);
    g.RO().eJo.c(paramy);
    paramy.data = null;
    AppMethodBeat.o(11266);
  }

  private boolean a(b paramb)
  {
    AppMethodBeat.i(11261);
    boolean bool1;
    if (paramb == null)
    {
      bool1 = false;
      AppMethodBeat.o(11261);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = super.b(paramb);
      c.a.b localb = c.a.b.fuQ;
      bool1 = bool2;
      if (!bool2)
      {
        bool1 = super.a(paramb);
        localb = c.a.b.fuS;
      }
      if (bool1)
      {
        c.a.a locala = new c.a.a();
        locala.fuO = paramb.field_userName;
        locala.fuN = localb;
        locala.fuP = paramb;
        this.fuL.cF(locala);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11261);
    }
  }

  private boolean a(km paramkm)
  {
    AppMethodBeat.i(11262);
    b localb = qD(paramkm.vNb);
    localb.field_userName = paramkm.vNb;
    localb.field_qyUin = paramkm.vNt;
    localb.field_userUin = paramkm.vNu;
    localb.field_wwMaxExposeTimes = paramkm.vNw;
    localb.field_wwUserVid = paramkm.vNx;
    localb.field_wwCorpId = paramkm.vNy;
    localb.field_userType = paramkm.vNz;
    localb.field_chatOpen = paramkm.vNA;
    localb.field_wwUnreadCnt = paramkm.vNB;
    localb.field_show_confirm = paramkm.vNC;
    localb.field_use_preset_banner_tips = paramkm.vNE;
    fuK = paramkm.vND;
    if ((paramkm.vNx == 0L) && (paramkm.vNy == 0L) && (paramkm.vNt != 0))
    {
      localb.field_wwUserVid = paramkm.vNu;
      localb.field_wwCorpId = paramkm.vNt;
    }
    paramkm.vNv &= -9;
    localb.field_userFlag = (paramkm.vNv | localb.field_userFlag & 0x8);
    boolean bool = a(localb);
    AppMethodBeat.o(11262);
    return bool;
  }

  public static boolean a(String paramString, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(11263);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(11263);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (f.rc(paramString));
      for (int i = 1; ; i = 2)
      {
        paramString = new s(paramString, i, paramf);
        bool = g.RO().eJo.a(paramString, 0);
        AppMethodBeat.o(11263);
        break;
        if (!f.rb(paramString))
          break label76;
      }
      label76: AppMethodBeat.o(11263);
      bool = false;
    }
  }

  public static String lb(int paramInt)
  {
    AppMethodBeat.i(11268);
    String str = null;
    if (fuK == null)
      fuK = new hf();
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(11268);
      return str;
      str = fuK.vJP;
      continue;
      str = fuK.vJQ;
      continue;
      str = fuK.vJR;
    }
  }

  public final void a(c.a parama)
  {
    AppMethodBeat.i(11256);
    if (this.fuL != null)
      this.fuL.remove(parama);
    AppMethodBeat.o(11256);
  }

  public final void a(c.a parama, Looper paramLooper)
  {
    AppMethodBeat.i(11255);
    this.fuL.a(parama, paramLooper);
    AppMethodBeat.o(11255);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = -1;
    AppMethodBeat.i(11269);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      AppMethodBeat.o(11269);
      return;
    }
    int j = paramInt2;
    Object localObject1;
    Object localObject2;
    if ((paramm instanceof s))
    {
      localObject1 = (s)paramm;
      if ((((s)localObject1).ehh != null) && (((s)localObject1).ehh.fsH.fsP != null));
      for (localObject2 = (afu)((s)localObject1).ehh.fsH.fsP; ; localObject2 = null)
      {
        if ((localObject2 != null) && (((afu)localObject2).vNh != null) && (((afu)localObject2).vNh.ret == 0) && (((afu)localObject2).wmX != null))
          break label127;
        AppMethodBeat.o(11269);
        break;
      }
      label127: if (!a(((afu)localObject2).wmX))
        paramInt2 = -1;
      localObject2 = (com.tencent.mm.ai.f)((s)localObject1).data;
      j = paramInt2;
      if (localObject2 != null)
      {
        ((com.tencent.mm.ai.f)localObject2).onSceneEnd(paramInt1, paramInt2, paramString, paramm);
        j = paramInt2;
      }
    }
    if ((paramm instanceof y))
    {
      localObject1 = (y)paramm;
      if ((((y)localObject1).ehh != null) && (((y)localObject1).ehh.fsH.fsP != null));
      for (localObject2 = (bxq)((y)localObject1).ehh.fsH.fsP; ; localObject2 = null)
      {
        if ((localObject2 != null) && (((bxq)localObject2).vNh != null) && (((bxq)localObject2).vNh.ret == 0) && (((bxq)localObject2).wmX != null))
          break label274;
        AppMethodBeat.o(11269);
        break;
      }
      label274: if (a(((bxq)localObject2).wmX))
        break label327;
      j = i;
    }
    label327: 
    while (true)
    {
      localObject2 = (com.tencent.mm.ai.f)((y)localObject1).data;
      if (localObject2 != null)
        ((com.tencent.mm.ai.f)localObject2).onSceneEnd(paramInt1, j, paramString, paramm);
      AppMethodBeat.o(11269);
      break;
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11260);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(11260);
    while (true)
    {
      return bool;
      b localb = new b();
      localb.field_userName = paramString;
      bool = super.a(localb, new String[] { "userName" });
      if (bool)
      {
        c.a.a locala = new c.a.a();
        locala.fuO = paramString;
        locala.fuN = c.a.b.fuR;
        locala.fuP = localb;
        this.fuL.cF(locala);
        this.fuL.doNotify();
      }
      AppMethodBeat.o(11260);
    }
  }

  public final b qC(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(11257);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(11257);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      b localb = new b();
      localb.field_userName = paramString;
      if (super.b(localb, new String[0]))
      {
        AppMethodBeat.o(11257);
        paramString = localb;
      }
      else
      {
        a(paramString, null);
        AppMethodBeat.o(11257);
        paramString = localObject;
      }
    }
  }

  public final b qD(String paramString)
  {
    AppMethodBeat.i(11258);
    b localb = qC(paramString);
    if (localb == null)
    {
      localb = new b();
      localb.field_userName = paramString;
      localb.field_qyUin = 0;
      localb.field_userUin = 0;
      localb.field_userFlag = 0;
      localb.field_wwExposeTimes = 0;
      localb.field_wwMaxExposeTimes = 0;
      localb.field_wwUserVid = 0L;
      localb.field_wwCorpId = 0L;
      localb.field_chatOpen = false;
      localb.field_wwUnreadCnt = 0;
      AppMethodBeat.o(11258);
    }
    for (paramString = localb; ; paramString = localb)
    {
      return paramString;
      AppMethodBeat.o(11258);
    }
  }

  public final int qE(String paramString)
  {
    AppMethodBeat.i(11259);
    paramString = qC(paramString);
    int i;
    if (paramString == null)
    {
      i = 0;
      AppMethodBeat.o(11259);
    }
    while (true)
    {
      return i;
      i = paramString.field_qyUin;
      AppMethodBeat.o(11259);
    }
  }

  public final void qF(String paramString)
  {
    AppMethodBeat.i(11265);
    paramString = qD(paramString);
    if (paramString.field_wwExposeTimes >= paramString.field_wwMaxExposeTimes)
      AppMethodBeat.o(11265);
    while (true)
    {
      return;
      paramString.field_wwExposeTimes += 1;
      a(paramString);
      AppMethodBeat.o(11265);
    }
  }

  public final boolean qG(String paramString)
  {
    AppMethodBeat.i(11267);
    paramString = qC(paramString);
    boolean bool;
    if ((paramString != null) && ((paramString.field_userFlag & 0x1) != 0))
    {
      bool = true;
      AppMethodBeat.o(11267);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11267);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.c
 * JD-Core Version:    0.6.2
 */