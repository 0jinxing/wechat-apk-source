package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.ga;
import com.tencent.mm.g.a.ga.b;
import com.tencent.mm.g.c.cp;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bf;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.bt;
import com.tencent.mm.storage.bu;
import junit.framework.Assert;

public final class b
{
  public boolean cRY;
  public String fjz;
  public String gta;
  public long id;
  public String nickname;
  public int qvb;
  public String username;
  public String vqC;

  private static b a(Context paramContext, long paramLong, boolean paramBoolean, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(28054);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    int i = 0;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    int j;
    if (paramInt == 0)
    {
      localObject7 = bi.a.apC(paramString2);
      localObject1 = ((bi.a)localObject7).svN;
      localObject2 = ((bi.a)localObject7).nickname;
      localObject8 = ((bi.a)localObject7).xZi;
      localObject9 = ((bi.a)localObject7).xZj;
      j = ((bi.a)localObject7).scene;
      localObject7 = localObject6;
    }
    while (true)
    {
      paramContext = a(paramContext, paramLong, paramBoolean, paramString1, paramString2, paramInt, (String)localObject1, (String)localObject2, (String)localObject8, (String)localObject9, (String)localObject5, j);
      paramContext.vqC = ((String)localObject7);
      AppMethodBeat.o(28054);
      return paramContext;
      localObject7 = localObject6;
      localObject8 = localObject3;
      localObject9 = localObject4;
      j = i;
      if (paramBoolean)
      {
        bi.d locald = bi.d.apF(paramString2);
        String str1 = locald.svN;
        String str2 = locald.nickname;
        String str3 = locald.content;
        localObject7 = localObject6;
        localObject1 = str1;
        localObject2 = str2;
        localObject8 = localObject3;
        localObject9 = localObject4;
        localObject5 = str3;
        j = i;
        if (locald.xZy == 1)
        {
          localObject7 = locald.xZA;
          localObject1 = str1;
          localObject2 = str2;
          localObject8 = localObject3;
          localObject9 = localObject4;
          localObject5 = str3;
          j = i;
        }
      }
    }
  }

  public static b a(Context paramContext, long paramLong, boolean paramBoolean, String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt2)
  {
    AppMethodBeat.i(28055);
    b localb = new b();
    localb.id = paramLong;
    if (!paramBoolean);
    for (boolean bool = true; ; bool = false)
    {
      localb.cRY = bool;
      ab.d("MicroMsg.FMessageProvider", "build, fmsgInfo.type:%d, fmsgInfo.talker:%s, scene:%d  ", new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2) });
      if (paramInt1 != 0)
        break label364;
      if (paramString2 != null)
        break;
      ab.e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = ".concat(String.valueOf(paramString1)));
      paramContext = null;
      AppMethodBeat.o(28055);
      return paramContext;
    }
    localb.username = paramString3;
    localb.nickname = paramString4;
    switch (paramInt2)
    {
    default:
      localb.fjz = paramContext.getString(2131298103);
    case 4:
    case 10:
    case 11:
    case 31:
    case 32:
    case 58:
    case 59:
    case 60:
    }
    while (true)
    {
      AppMethodBeat.o(28055);
      paramContext = localb;
      break;
      localb.fjz = paramContext.getString(2131298094);
      continue;
      paramString1 = new ga();
      paramString1.cAj.cAg = paramString5;
      paramString1.cAj.cAh = paramString6;
      a.xxA.m(paramString1);
      localb.fjz = paramContext.getString(2131298099, new Object[] { bo.bc(paramString1.cAk.cAl, "") });
      continue;
      localb.fjz = paramContext.getString(2131298110);
      continue;
      localb.fjz = paramContext.getString(2131298104);
      continue;
      localb.gta = bi.a.apC(paramString2).gta;
      localb.fjz = paramContext.getString(2131298097);
      continue;
      label364: if (!paramBoolean)
      {
        localb.username = paramString1;
        localb.fjz = paramString2;
      }
      else
      {
        localb.username = paramString3;
        localb.nickname = paramString4;
        if ((paramString7 != null) && (!paramString7.trim().equals("")))
          localb.fjz = paramString7;
        else
          localb.fjz = paramContext.getString(2131301809);
      }
    }
  }

  public static b a(Context paramContext, cp paramcp)
  {
    AppMethodBeat.i(28056);
    ab.d("MicroMsg.FMessageProvider", "build lbs, talker = " + paramcp.field_sayhiuser + ", scene = " + paramcp.field_scene);
    b localb = new b();
    localb.id = paramcp.xDa;
    if (paramcp.field_isSend == 1);
    for (boolean bool = true; ; bool = false)
    {
      localb.cRY = bool;
      localb.username = paramcp.field_sayhiuser;
      localb.qvb = paramcp.field_scene;
      if (paramcp.field_isSend != 1)
        break;
      localb.fjz = paramcp.field_content;
      AppMethodBeat.o(28056);
      return localb;
    }
    paramcp = bi.d.apF(paramcp.field_content);
    if ((paramcp.content != null) && (!paramcp.content.trim().equals("")));
    for (localb.fjz = paramcp.content; ; localb.fjz = paramContext.getString(2131298112))
    {
      localb.nickname = paramcp.nickname;
      break;
    }
  }

  public static b a(Context paramContext, bt parambt)
  {
    AppMethodBeat.i(28057);
    ab.d("MicroMsg.FMessageProvider", "build shake, talker = " + parambt.field_talker + ", scene = " + parambt.field_scene);
    b localb = new b();
    localb.id = parambt.xDa;
    if (parambt.field_isSend == 1);
    for (boolean bool = true; ; bool = false)
    {
      localb.cRY = bool;
      localb.username = parambt.field_sayhiuser;
      localb.qvb = parambt.field_scene;
      if (parambt.field_isSend != 1)
        break;
      localb.fjz = parambt.field_content;
      AppMethodBeat.o(28057);
      return localb;
    }
    parambt = bi.d.apF(parambt.field_content);
    if ((parambt.content != null) && (!parambt.content.trim().equals("")));
    for (localb.fjz = parambt.content; ; localb.fjz = paramContext.getString(2131298112))
    {
      localb.nickname = parambt.nickname;
      break;
    }
  }

  public static ad a(ax paramax)
  {
    AppMethodBeat.i(28063);
    ad localad = new ad();
    if (paramax == null)
    {
      AppMethodBeat.o(28063);
      paramax = localad;
    }
    while (true)
    {
      return paramax;
      if (paramax.field_type == 0)
      {
        paramax = ajM(paramax.field_msgContent);
        AppMethodBeat.o(28063);
      }
      else
      {
        paramax = ajN(paramax.field_msgContent);
        AppMethodBeat.o(28063);
      }
    }
  }

  public static String a(Context paramContext, int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(28061);
    ab.d("MicroMsg.FMessageProvider", "setDigest, fmsgType = %d, fmsgScene = %d, fmsgContent = %s, isSend = %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject;
    if (paramInt1 == 0)
    {
      if (paramString == null)
      {
        ab.e("MicroMsg.FMessageProvider", "setDigest fail, fmsgContent is null");
        localObject = null;
        AppMethodBeat.o(28061);
        return localObject;
      }
      localObject = bi.a.apC(paramString);
      switch (((bi.a)localObject).scene)
      {
      default:
        localObject = paramContext.getString(2131298103);
      case 4:
      case 10:
      case 11:
      case 31:
      case 32:
      case 58:
      case 59:
      case 60:
      }
    }
    while (true)
    {
      AppMethodBeat.o(28061);
      break;
      localObject = paramContext.getString(2131298094);
      continue;
      paramString = new ga();
      paramString.cAj.cAg = ((bi.a)localObject).xZi;
      paramString.cAj.cAh = ((bi.a)localObject).xZj;
      a.xxA.m(paramString);
      localObject = paramContext.getString(2131298099, new Object[] { bo.bc(paramString.cAk.cAl, "") });
      continue;
      localObject = paramContext.getString(2131298110);
      continue;
      localObject = paramContext.getString(2131298104);
      continue;
      localObject = paramContext.getString(2131298097);
      continue;
      localObject = paramString;
      if (!paramBoolean)
      {
        paramString = bi.d.apF(paramString);
        if ((paramString.content != null) && (!paramString.content.trim().equals("")))
          localObject = paramString.content;
        else
          localObject = paramContext.getString(2131299907);
      }
    }
  }

  public static b[] a(Context paramContext, cp[] paramArrayOfcp)
  {
    AppMethodBeat.i(28059);
    StringBuilder localStringBuilder = new StringBuilder("convert lbsList, talker = ");
    Object localObject;
    if ((paramArrayOfcp == null) || (paramArrayOfcp.length == 0) || (paramArrayOfcp[0] == null))
    {
      localObject = "null";
      ab.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfcp != null) && (paramArrayOfcp.length != 0))
        break label86;
      ab.e("MicroMsg.FMessageProvider", "convert lbs fail, lbsList is null");
      paramContext = null;
      AppMethodBeat.o(28059);
    }
    while (true)
    {
      return paramContext;
      localObject = paramArrayOfcp[0].field_sayhiuser;
      break;
      label86: localObject = new b[paramArrayOfcp.length];
      for (int i = 0; i < localObject.length; i++)
        localObject[(localObject.length - i - 1)] = a(paramContext, paramArrayOfcp[i]);
      AppMethodBeat.o(28059);
      paramContext = (Context)localObject;
    }
  }

  public static b[] a(Context paramContext, ax[] paramArrayOfax)
  {
    AppMethodBeat.i(28058);
    StringBuilder localStringBuilder = new StringBuilder("convert fmsgList, talker = ");
    Object localObject;
    if ((paramArrayOfax == null) || (paramArrayOfax.length == 0) || (paramArrayOfax[0] == null))
    {
      localObject = "null";
      ab.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfax != null) && (paramArrayOfax.length != 0))
        break label86;
      ab.e("MicroMsg.FMessageProvider", "convert fmsg fail, fmsgList is null");
      paramContext = null;
      AppMethodBeat.o(28058);
    }
    while (true)
    {
      return paramContext;
      localObject = paramArrayOfax[0].field_talker;
      break;
      label86: localObject = new b[paramArrayOfax.length];
      for (int i = 0; i < localObject.length; i++)
        localObject[(localObject.length - i - 1)] = b(paramContext, paramArrayOfax[i]);
      AppMethodBeat.o(28058);
      paramContext = (Context)localObject;
    }
  }

  public static b[] a(Context paramContext, bt[] paramArrayOfbt)
  {
    AppMethodBeat.i(28060);
    StringBuilder localStringBuilder = new StringBuilder("convert shakeList, talker = ");
    Object localObject;
    if ((paramArrayOfbt == null) || (paramArrayOfbt.length == 0) || (paramArrayOfbt[0] == null))
    {
      localObject = "null";
      ab.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfbt != null) && (paramArrayOfbt.length != 0))
        break label86;
      ab.e("MicroMsg.FMessageProvider", "convert shake fail, shakeList is null");
      paramContext = null;
      AppMethodBeat.o(28060);
    }
    while (true)
    {
      return paramContext;
      localObject = paramArrayOfbt[0].field_sayhiuser;
      break;
      label86: localObject = new b[paramArrayOfbt.length];
      for (int i = 0; i < localObject.length; i++)
        localObject[(localObject.length - i - 1)] = a(paramContext, paramArrayOfbt[i]);
      AppMethodBeat.o(28060);
      paramContext = (Context)localObject;
    }
  }

  private static ad ajM(String paramString)
  {
    AppMethodBeat.i(28064);
    paramString = bi.a.apC(paramString);
    ad localad = new ad();
    localad.setUsername(paramString.svN);
    localad.iy(paramString.dFl);
    localad.iB(paramString.getDisplayName());
    localad.iC(paramString.gwF);
    localad.iD(paramString.gwG);
    localad.hA(paramString.dtS);
    localad.iR(paramString.getProvince());
    localad.iS(paramString.getCity());
    localad.iQ(paramString.signature);
    localad.hw(paramString.ufB);
    localad.iV(paramString.duh);
    localad.je(paramString.vqs);
    AppMethodBeat.o(28064);
    return localad;
  }

  private static ad ajN(String paramString)
  {
    AppMethodBeat.i(28065);
    bi.d locald = bi.d.apF(paramString);
    paramString = new ad();
    paramString.setUsername(locald.svN);
    paramString.iy(locald.dFl);
    paramString.iB(locald.nickname);
    paramString.iC(locald.gwF);
    paramString.iD(locald.gwG);
    paramString.hA(locald.dtS);
    paramString.iQ(locald.signature);
    paramString.iR(locald.getProvince());
    paramString.iS(locald.getCity());
    AppMethodBeat.o(28065);
    return paramString;
  }

  public static b b(Context paramContext, ax paramax)
  {
    AppMethodBeat.i(28053);
    paramContext = a(paramContext, paramax.xDa, paramax.dtf(), paramax.field_talker, paramax.field_msgContent, paramax.field_type);
    AppMethodBeat.o(28053);
    return paramContext;
  }

  public static void bG(String paramString, int paramInt)
  {
    AppMethodBeat.i(28062);
    bf[] arrayOfbf = null;
    bt[] arrayOfbt;
    Object localObject1;
    ax[] arrayOfax;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      ab.d("MicroMsg.FMessageProvider", "initAddContent, scene is shake");
      arrayOfbt = d.akR().apY(paramString);
      localObject1 = a(ah.getContext(), arrayOfbt);
      arrayOfax = null;
    }
    while (localObject1 == null)
    {
      AppMethodBeat.o(28062);
      return;
      if (paramInt == 18)
      {
        ab.d("MicroMsg.FMessageProvider", "initAddContent, scene is lbs");
        arrayOfbf = d.akQ().apz(paramString);
        localObject1 = a(ah.getContext(), arrayOfbf);
        arrayOfbt = null;
        arrayOfax = null;
      }
      else
      {
        arrayOfax = d.akO().apv(paramString);
        localObject1 = a(ah.getContext(), arrayOfax);
        arrayOfbt = null;
      }
    }
    paramInt = 0;
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    bi localbi;
    int k;
    int m;
    if (j < i)
    {
      localObject2 = localObject1[j];
      localbi = new bi();
      localbi.setContent(localObject2.fjz);
      k = t.nK(localObject2.username);
      if (arrayOfax != null)
      {
        m = paramInt + 1;
        localbi.eJ(arrayOfax[paramInt].field_createTime);
        paramInt = m;
      }
    }
    label541: 
    while (true)
    {
      label213: localbi.ju(localObject2.username);
      localbi.setType(k);
      label250: long l;
      if (localObject2.cRY)
      {
        localbi.setStatus(2);
        localbi.hO(1);
        aw.ZK();
        l = c.XO().Z(localbi);
        if (l == -1L)
          break label381;
      }
      label381: for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        ab.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = ".concat(String.valueOf(l)));
        j++;
        break;
        if (arrayOfbf != null)
        {
          m = paramInt + 1;
          localbi.eJ(arrayOfbf[paramInt].field_createtime * 1000L);
          paramInt = m;
          break label213;
        }
        if (arrayOfbt == null)
          break label541;
        m = paramInt + 1;
        localbi.eJ(arrayOfbt[paramInt].field_createtime * 1000L);
        paramInt = m;
        break label213;
        localbi.setStatus(6);
        localbi.hO(0);
        break label250;
      }
      localObject1 = new bi();
      if (arrayOfax != null)
        ((bi)localObject1).eJ(arrayOfax[0].field_createTime + 1L);
      while (true)
      {
        ((bi)localObject1).ju(paramString);
        ((bi)localObject1).setContent(ah.getContext().getString(2131304130));
        ((bi)localObject1).setType(10000);
        ((bi)localObject1).setStatus(6);
        ((bi)localObject1).hO(0);
        aw.ZK();
        ab.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = ".concat(String.valueOf(c.XO().Z((bi)localObject1))));
        AppMethodBeat.o(28062);
        break;
        if (arrayOfbf != null)
          ((bi)localObject1).eJ(arrayOfbf[0].field_createtime * 1000L + 1L);
        else if (arrayOfbt != null)
          ((bi)localObject1).eJ(arrayOfbt[0].field_createtime * 1000L + 1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.b
 * JD-Core Version:    0.6.2
 */