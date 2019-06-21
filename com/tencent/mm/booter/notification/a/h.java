package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.compatible.util.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.c;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.viewitems.j.a;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import junit.framework.Assert;

public final class h
{
  private static WeakReference<TextPaint> eeQ;
  private static int eeR = 0;
  private static int eeS = 0;
  public String eeO = "";
  public String eeP = "";
  public String mTitle = "";

  private static int C(String paramString, int paramInt)
  {
    AppMethodBeat.i(16054);
    if (paramInt < paramString.length())
      if (paramString.charAt(paramInt) != '%')
        AppMethodBeat.o(16054);
    while (true)
    {
      return paramInt;
      paramInt++;
      break;
      paramInt = paramString.length();
      AppMethodBeat.o(16054);
    }
  }

  private static int Ja()
  {
    AppMethodBeat.i(16053);
    int i;
    if (eeR > 0)
    {
      i = eeR;
      AppMethodBeat.o(16053);
    }
    while (true)
    {
      return i;
      i = BackwardSupportUtil.b.b(ah.getContext(), 200.0F);
      AppMethodBeat.o(16053);
    }
  }

  private static CharSequence a(String paramString, TextPaint paramTextPaint)
  {
    AppMethodBeat.i(16052);
    paramString = TextUtils.ellipsize(paramString, paramTextPaint, Ja(), TextUtils.TruncateAt.END);
    AppMethodBeat.o(16052);
    return paramString;
  }

  public static String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext)
  {
    AppMethodBeat.i(16042);
    paramString1 = bo.nullAsNil(a(null, paramInt1, paramString1, paramString2, paramInt2, paramContext, new PString(), new PString(), new PInt(), false, false));
    AppMethodBeat.o(16042);
    return paramString1;
  }

  private static String a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, PString paramPString1, PString paramPString2)
  {
    int i = 2131299991;
    AppMethodBeat.i(16044);
    String str1 = "";
    String str2;
    String str3;
    int j;
    if ((t.ne(paramString1)) || (t.ng(paramString1)))
    {
      str2 = str1;
      str3 = paramString2;
      if (paramString2 != null)
      {
        j = paramString2.indexOf(":");
        str2 = str1;
        str3 = paramString2;
        if (j >= 0)
        {
          str2 = str1;
          str3 = paramString2;
          if (j < paramString2.length())
          {
            paramString1 = paramString2.substring(0, j);
            if (!ad.aou(paramString1))
            {
              str2 = str1;
              str3 = paramString2;
              if (!ad.aow(paramString1));
            }
            else
            {
              str2 = s.mJ(paramString1);
              paramPString2.value = paramString1;
              str3 = paramString2.substring(j + 1);
            }
          }
        }
      }
      if (bo.nullAsNil(str2).length() > 0)
        break label318;
      if (paramString3 != null)
        break label311;
    }
    while (true)
    {
      paramPString1.value = str3;
      paramContext = paramPString1.value;
      AppMethodBeat.o(16044);
      return paramContext;
      if (!ad.aou(paramString1))
      {
        str2 = str1;
        str3 = paramString2;
        if (!ad.aow(paramString1))
          break;
      }
      s.mJ(paramString1);
      paramPString2.value = paramString1;
      if (paramInt == 1)
      {
        paramContext = new StringBuilder().append(paramContext.getString(2131299991, new Object[] { "" }));
        if (paramString3 == null);
        while (true)
        {
          paramPString1.value = paramString2;
          paramPString2.value = "";
          paramContext = paramPString1.value;
          AppMethodBeat.o(16044);
          break;
          paramString2 = paramString3;
        }
      }
      if (paramString3 == null);
      while (true)
      {
        paramPString1.value = paramString2;
        paramPString2.value = "";
        paramContext = paramPString1.value;
        AppMethodBeat.o(16044);
        break;
        paramString2 = paramString3;
      }
      label311: str3 = paramString3;
    }
    label318: paramString1 = new StringBuilder();
    if (paramInt == 1)
    {
      j = 2131299991;
      label335: paramString2 = paramString1.append(paramContext.getString(j));
      if (paramString3 != null)
        break label437;
      paramString1 = str3;
      label354: paramPString1.value = paramString1;
      paramString1 = new StringBuilder();
      if (paramInt != 1)
        break label443;
      paramInt = i;
      label383: paramContext = paramString1.append(paramContext.getString(paramInt, new Object[] { str2 }));
      if (paramString3 != null)
        break label449;
      paramString3 = str3;
    }
    label437: label443: label449: 
    while (true)
    {
      paramContext = paramString3;
      AppMethodBeat.o(16044);
      break;
      j = 2131300001;
      break label335;
      paramString1 = paramString3;
      break label354;
      paramInt = 2131300001;
      break label383;
    }
  }

  public static String a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(16058);
    if (paramBoolean)
    {
      String str = com.tencent.mm.cb.b.dqD().anU(paramString);
      paramString = str;
      if (paramInt3 > 1)
        paramString = paramContext.getResources().getQuantityString(2131361814, paramInt3, new Object[] { Integer.valueOf(paramInt3) }) + str;
      AppMethodBeat.o(16058);
    }
    while (true)
    {
      return paramString;
      paramString = paramContext.getResources().getQuantityString(2131361815, paramInt1, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(16058);
    }
  }

  public static String a(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(16038);
    paramContext = a(0, paramString2, paramString1, paramInt, paramContext);
    paramContext = j.ajP(com.tencent.mm.cb.b.dqD().anU(paramContext));
    AppMethodBeat.o(16038);
    return paramContext;
  }

  private static String a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, Context paramContext, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(16043);
    boolean bool;
    label35: int i;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue("context is null", bool);
      if ((paramString2 == null) || (paramString2.length() <= 0))
        break label90;
      bool = true;
      Assert.assertTrue("username is null", bool);
      if (paramBoolean1)
        break label157;
      if ((!t.ne(paramString2)) || (r.YR()))
        break label96;
      i = 1;
      label63: if (i == 0)
        break label157;
      paramString3 = paramContext.getString(2131303207);
      AppMethodBeat.o(16043);
    }
    while (true)
    {
      return paramString3;
      bool = false;
      break;
      label90: bool = false;
      break label35;
      label96: if (t.ng(paramString2))
      {
        if ((r.YD() & 0x40) != 0);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label132;
          i = 1;
          break;
        }
      }
      label132: if ((t.nk(paramString2)) && (!r.YU()))
      {
        i = 1;
        break label63;
      }
      i = 0;
      break label63;
      label157: if (!t.nk(paramString2))
        break label196;
      if (paramBoolean1)
      {
        paramString3 = "";
        AppMethodBeat.o(16043);
      }
      else
      {
        paramString3 = bx(paramContext);
        AppMethodBeat.o(16043);
      }
    }
    label196: if ((paramString3 != null) && (paramBoolean1))
      paramString3 = jV(paramString3);
    for (int j = 1; ; j = 0)
    {
      paramPString1.value = paramString3;
      String str1;
      String str2;
      if ((paramInt1 == 0) && ((t.kH(paramString2)) || (t.mP(paramString2))))
      {
        i = bf.ox(paramString3);
        if (i > 0)
        {
          str1 = paramString3.substring(0, i).trim();
          str2 = s.getDisplayName(str1, paramString2);
        }
      }
      for (Object localObject1 = (paramString3 + " ").substring(i + 1); ; localObject1 = paramString3)
      {
        i = 0;
        Object localObject2;
        int k;
        if ((t.ny(paramString2)) || (t.nH(paramString2)))
        {
          i = paramString3.indexOf(":");
          localObject2 = paramString3;
          if (i != -1)
          {
            paramPString2.value = paramString3.substring(0, i);
            localObject2 = paramString3.substring(i + 1);
          }
          k = 0;
          paramString3 = (String)localObject2;
        }
        while (true)
        {
          label804: label2354: switch (paramInt2)
          {
          default:
          case 3:
          case 23:
          case 33:
          case 47:
          case 1048625:
          case 13:
          case 39:
          case 11:
          case 36:
          case 34:
          case 43:
          case 62:
          case 12299999:
          case -1879048191:
          case -1879048190:
          case -1879048189:
          case 50:
          case 53:
          case 52:
          case -1879048188:
          case 37:
          case 40:
          case 35:
          case 42:
          case 66:
          case 48:
            label358: label1021: 
            do
            {
              localObject1 = "";
              localObject2 = null;
              i = 0;
              paramString1 = paramString3;
              paramString3 = (String)localObject1;
              while (true)
              {
                if (!t.nf(paramString2))
                  break label7405;
                if (1 != paramInt1)
                  break label7115;
                if (bo.isNullOrNil(paramString3))
                  break label7062;
                paramPString1.value = paramString3;
                AppMethodBeat.o(16043);
                break;
                aw.ZK();
                localObject2 = c.XR().aoZ(paramString2);
                if (((localObject2 == null) || (!((ak)localObject2).jl(2097152))) && (!paramBoolean2))
                  break label7934;
                k = 1;
                i = k;
                if (paramString3 == null)
                  break label7934;
                int m = paramString3.indexOf(":");
                i = k;
                if (m == -1)
                  break label7934;
                paramPString2.value = paramString3.substring(0, m);
                paramString3 = paramString3.substring(m + 1);
                k = 1;
                break label358;
                localObject1 = paramContext.getString(2131297012);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if (str1.length() <= 0)
                    break label1021;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject2 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label985;
                }
                localObject1 = ap.aps(paramString3);
                localObject2 = ((ap)localObject1).fWW + ": ";
                if ((paramString1 != null) && (paramString1.length() == 32));
                for (paramString3 = paramString1; ; paramString3 = paramContext.getString(2131296895))
                {
                  paramPString1.value = "";
                  paramPString2.value = ((ap)localObject1).fWW;
                  localObject1 = null;
                  i = 0;
                  paramString1 = (String)localObject2;
                  localObject2 = localObject1;
                  break;
                }
                paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(2131297012), paramPString1, paramPString2);
                paramString3 = "";
                localObject2 = null;
                i = 0;
                continue;
                paramString1 = a(paramContext, paramInt1, paramString2, paramString3, null, paramPString1, paramPString2);
                paramString3 = "";
                localObject2 = null;
                i = 0;
                continue;
                if ((ad.aou(paramString2)) || (ad.aow(paramString2)) || (t.ne(paramString2)) || (t.ng(paramString2)))
                {
                  paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(2131297079), paramPString1, paramPString2);
                  paramString3 = "";
                  localObject2 = null;
                  i = 0;
                }
                else
                {
                  paramString1 = paramString3;
                  if (paramString3 != null)
                  {
                    paramString1 = paramString3;
                    if (paramString3.length() > 0)
                    {
                      paramString1 = paramString3;
                      if (!t.nf(paramString2))
                      {
                        if (!t.kH(paramString2))
                          break label1338;
                        paramString3 = new com.tencent.mm.modelvoice.n(paramString3);
                        paramString1 = paramString3.alt() + ": ";
                        paramPString1.value = "%s:";
                        paramPString2.value = paramString3.alt();
                      }
                    }
                  }
                  while (true)
                  {
                    paramString3 = paramContext.getString(2131297079);
                    localObject2 = null;
                    i = 0;
                    break;
                    paramString1 = "";
                  }
                  if ((ad.aou(paramString2)) || (ad.aow(paramString2)) || (t.ne(paramString2)) || (t.ng(paramString2)))
                  {
                    paramString1 = a(paramContext, paramInt1, paramString2, paramString3, paramContext.getString(2131297076), paramPString1, paramPString2);
                    paramString3 = "";
                    localObject2 = null;
                    i = 0;
                  }
                  else
                  {
                    paramString1 = paramString3;
                    if (paramString3 != null)
                    {
                      paramString1 = paramString3;
                      if (paramString3.length() > 0)
                      {
                        paramString1 = paramString3;
                        if (!t.nf(paramString2))
                        {
                          if (!t.kH(paramString2))
                            break label1504;
                          paramString3 = new q(paramString3);
                          paramString1 = paramString3.alt() + ": ";
                          paramPString1.value = "%s:";
                          paramPString2.value = paramString3.alt();
                        }
                      }
                    }
                    while (true)
                    {
                      paramString3 = paramContext.getString(2131297076);
                      localObject2 = null;
                      i = 0;
                      break;
                      paramString1 = "";
                    }
                    paramString3 = paramContext.getString(2131297082);
                    localObject2 = null;
                    i = 0;
                    paramString1 = "";
                    continue;
                    paramString3 = paramContext.getString(2131297081);
                    localObject2 = null;
                    i = 0;
                    paramString1 = "";
                    continue;
                    if (paramString3.equals(bi.xZc))
                    {
                      paramString3 = paramContext.getString(2131297082);
                      localObject2 = null;
                      i = 0;
                      paramString1 = "";
                    }
                    else
                    {
                      if (!paramString3.equals(bi.xZb))
                        break label804;
                      paramString3 = paramContext.getString(2131297084);
                      localObject2 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      paramString3 = paramContext.getString(2131297082);
                      localObject2 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      paramString3 = paramContext.getString(2131297084);
                      localObject2 = null;
                      i = 0;
                      paramString1 = "";
                      continue;
                      if ((paramString3 == null) || (paramString3.length() <= 0))
                        break label804;
                      localObject2 = bi.d.apF(paramString3);
                      paramString1 = paramString3;
                      if (((bi.d)localObject2).dtY() != null)
                      {
                        paramString1 = paramString3;
                        if (((bi.d)localObject2).dtY().length() <= 0);
                      }
                      switch (((bi.d)localObject2).scene)
                      {
                      case 19:
                      case 20:
                      case 21:
                      default:
                        paramString1 = paramContext.getString(2131300013, new Object[] { ((bi.d)localObject2).getDisplayName() });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        break;
                      case 18:
                        paramString1 = paramContext.getString(2131299994, new Object[] { ((bi.d)localObject2).getDisplayName() });
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        break;
                      case 22:
                      case 23:
                      case 24:
                      case 26:
                      case 27:
                      case 28:
                      case 29:
                        paramString1 = paramContext.getString(2131300004, new Object[] { ((bi.d)localObject2).getDisplayName() });
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        break;
                      case 25:
                        paramString1 = paramContext.getString(2131299926, new Object[] { ((bi.d)localObject2).getDisplayName() });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        continue;
                        if ((paramString3 == null) || (paramString3.length() <= 0))
                          break label804;
                        localObject2 = bi.a.apC(paramString3);
                        paramString1 = paramString3;
                        if (((bi.a)localObject2).dtY() != null)
                        {
                          paramString1 = paramString3;
                          if (((bi.a)localObject2).dtY().length() > 0)
                          {
                            paramString1 = paramContext.getString(2131299951, new Object[] { ((bi.a)localObject2).getDisplayName() });
                            paramPString1.value = paramString1;
                          }
                        }
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        continue;
                        if (bo.nullAsNil(paramString3).length() <= 0)
                          break label804;
                        aw.ZK();
                        paramString1 = c.XO().Rl(paramString3);
                        paramString1 = paramContext.getString(2131299987, new Object[] { paramString1.fOt, paramString1.title });
                        paramPString1.value = paramString1;
                        paramString3 = "";
                        localObject2 = null;
                        i = 0;
                        continue;
                        if (bo.nullAsNil(paramString3).length() <= 0)
                          break label804;
                        if (t.kH(paramString2))
                        {
                          localObject2 = bf.oy(paramString3);
                          paramString1 = (String)localObject2;
                          if (!TextUtils.isEmpty((CharSequence)localObject2));
                        }
                        else
                        {
                          paramString1 = paramString2;
                        }
                        aw.ZK();
                        localObject1 = c.XO().Rn(paramString3);
                        aw.ZK();
                        localObject2 = c.XM().aoO(paramString1).Oj();
                        paramString3 = (String)localObject2;
                        if (t.kH((String)localObject2))
                          paramString3 = com.tencent.mm.model.n.T(com.tencent.mm.model.n.mB((String)localObject2));
                        if (paramInt1 == 1)
                        {
                          localObject2 = paramContext.getString(2131299927, new Object[] { paramString3, ((bi.a)localObject1).getDisplayName() });
                          paramPString1.value = paramContext.getString(2131299927, new Object[] { "%s", ((bi.a)localObject1).getDisplayName() });
                          paramPString2.value = paramString1;
                          paramString3 = "";
                          localObject1 = null;
                          i = 0;
                          paramString1 = (String)localObject2;
                          localObject2 = localObject1;
                        }
                        else
                        {
                          localObject2 = paramContext.getString(2131299928, new Object[] { paramString3, ((bi.a)localObject1).getDisplayName() });
                          paramPString1.value = paramContext.getString(2131299928, new Object[] { "%s", ((bi.a)localObject1).getDisplayName() });
                          paramPString2.value = paramString1;
                          paramString3 = "";
                          localObject1 = null;
                          i = 0;
                          paramString1 = (String)localObject2;
                          localObject2 = localObject1;
                        }
                        break;
                      }
                    }
                  }
                }
              }
            }
            while (bo.nullAsNil(paramString3).length() <= 0);
            label819: label985: label1504: if (t.kH(paramString2))
            {
              i = bf.ox(paramString3);
              if (i != -1)
              {
                paramString1 = paramString3.substring(0, i).trim();
                bf.oz(paramString3);
              }
            }
            label1338: break;
          case 335544369:
          case 402653233:
          case 419430449:
          case 436207665:
          case 469762097:
          case 536870961:
          case 671088689:
          case 369098801:
          case 452984881:
          case 520093745:
          case -1879048186:
          case -1879048185:
          case -1879048183:
          case -1879048176:
          case 704643121:
          case 49:
          case 16777265:
          case 268435505:
          case 553648177:
          case 587202609:
          case 687865905:
          case 285212721:
          case 318767153:
          case 55:
          case 57:
          case 503316529:
          case 570425393:
          case 603979825:
          }
          while (true)
          {
            while (true)
            {
              while (true)
              {
                if (paramInt1 == 1)
                {
                  paramString1 = paramContext.getString(2131300970);
                  paramPString1.value = paramString1;
                  paramString3 = "";
                  localObject2 = null;
                  i = 0;
                  break label819;
                }
                localObject2 = paramContext.getString(2131300970);
                paramPString1.value = paramContext.getString(2131300970);
                paramPString2.value = paramString1;
                paramString3 = "";
                localObject1 = null;
                i = 0;
                paramString1 = (String)localObject2;
                localObject2 = localObject1;
                break label819;
                paramString1 = j.b.me(bo.anj((String)localObject1));
                if (paramString1.fgP != 0)
                  if (paramString1.fgP == 1)
                    paramString1 = paramContext.getString(2131302771);
                while (true)
                {
                  paramPString2.value = str1;
                  paramPString1.value = "";
                  paramString3 = paramString1;
                  localObject2 = null;
                  i = 0;
                  paramString1 = "";
                  break;
                  if (paramString1.fgP == 2)
                    paramString1 = paramContext.getString(2131302773);
                  else if (paramString1.fgP == 3)
                    paramString1 = paramContext.getString(2131302772);
                  else
                    paramString1 = paramContext.getString(2131302774);
                }
                localObject2 = bo.anj((String)localObject1);
                paramString3 = "";
                paramString1 = "";
                localObject2 = j.b.me((String)localObject2);
                if (localObject2 != null)
                {
                  paramPString1.value = (paramContext.getString(2131302787) + bo.nullAsNil(((j.b)localObject2).title));
                  paramString1 = paramPString1.value;
                }
                paramPString2.value = str1;
                localObject2 = null;
                i = 0;
                break label819;
                localObject2 = bo.anj((String)localObject1);
                paramString3 = "";
                paramString1 = "";
                localObject2 = j.b.me((String)localObject2);
                if (localObject2 != null)
                {
                  if (paramInt1 != 1)
                    break label2739;
                  i = 1;
                  label2669: switch (((j.b)localObject2).fhv)
                  {
                  case 2:
                  default:
                    paramPString1.value = bo.nullAsNil(((j.b)localObject2).title);
                  case 1:
                  case 3:
                  case 4:
                  }
                }
                while (true)
                {
                  paramString1 = paramPString1.value;
                  paramPString2.value = str1;
                  localObject2 = null;
                  i = 0;
                  break;
                  label2739: i = 0;
                  break label2669;
                  if (i != 0)
                  {
                    paramPString1.value = paramContext.getString(2131297174);
                  }
                  else
                  {
                    paramPString1.value = paramContext.getString(2131297177);
                    continue;
                    if (i != 0)
                    {
                      paramPString1.value = paramContext.getString(2131297175);
                    }
                    else
                    {
                      paramPString1.value = paramContext.getString(2131297172);
                      continue;
                      if (i != 0)
                        paramPString1.value = paramContext.getString(2131297176);
                      else
                        paramPString1.value = paramContext.getString(2131297173);
                    }
                  }
                }
                paramString1 = bo.anj((String)localObject1);
                localObject1 = "";
                paramString3 = "";
                paramString1 = j.b.me(paramString1);
                if (paramString1 != null)
                {
                  if (paramInt1 != 1)
                    break label2972;
                  i = 1;
                  label2886: if (i == 0)
                    break label2978;
                  paramPString1.value = ("[" + paramString1.fhW + "]" + paramString1.fhT);
                }
                while (true)
                {
                  paramString3 = paramPString1.value;
                  paramString1 = paramString3;
                  if (t.ny(paramString2))
                    break label7912;
                  paramString1 = paramString3;
                  if (k != 0)
                    break label7912;
                  paramPString2.value = str1;
                  localObject2 = null;
                  i = 0;
                  paramString1 = paramString3;
                  paramString3 = (String)localObject1;
                  break;
                  label2972: i = 0;
                  break label2886;
                  label2978: if (!bo.isNullOrNil(str2))
                    paramPString1.value = (bo.nullAsNil(str2) + ": [" + paramString1.fhW + "]" + paramString1.fhS);
                  else
                    paramPString1.value = ("[" + paramString1.fhW + "]" + paramString1.fhS);
                }
                localObject2 = bo.anj((String)localObject1);
                paramString3 = "";
                paramString1 = "";
                localObject2 = j.b.me((String)localObject2);
                if (localObject2 == null)
                  break label7912;
                paramString1 = (com.tencent.mm.af.b)((j.b)localObject2).X(com.tencent.mm.af.b.class);
                if (paramInt1 == 1)
                {
                  i = 1;
                  label3124: if (i == 0)
                    break label3181;
                }
                label3181: for (paramPString1.value = paramContext.getString(2131300582, new Object[] { paramString1.ffF }); ; paramPString1.value = paramContext.getString(2131300582, new Object[] { paramString1.ffG }))
                {
                  paramString1 = paramPString1.value;
                  paramPString2.value = str1;
                  localObject2 = null;
                  i = 0;
                  break;
                  i = 0;
                  break label3124;
                }
                paramString3 = bo.anj((String)localObject1);
                paramString1 = "";
                paramString3 = j.b.me(paramString3);
                if (paramString3 != null)
                {
                  paramString1 = (j.a)paramString3.X(j.a.class);
                  if (paramString1.state != 1)
                    break label3283;
                }
                label3283: for (paramString1 = paramContext.getString(2131298950, new Object[] { paramString1.appName }); ; paramString1 = paramContext.getString(2131298968, new Object[] { paramString1.appName }))
                {
                  paramPString1.value = paramString1;
                  paramString3 = "";
                  localObject2 = null;
                  i = 0;
                  break;
                }
                switch (j.b.me(bo.anj((String)localObject1)).fgP)
                {
                default:
                  paramString1 = paramContext.getString(2131297017);
                  label3353: if (str1.length() <= 0)
                    break;
                case 10000:
                case 20000:
                }
                for (paramString3 = str1 + ": "; ; paramString3 = "")
                {
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  paramPString1.value = "";
                  localObject1 = paramString1;
                  localObject2 = null;
                  i = 0;
                  paramString1 = paramString3;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = paramContext.getString(2131297018);
                  break label3353;
                  paramString1 = paramContext.getString(2131297020);
                  break label3353;
                }
                paramString3 = j.b.me(bo.anj((String)localObject1));
                if (paramString3 == null)
                {
                  ab.e("MicroMsg.Notification.Wording", "decode msg content failed");
                  paramString3 = "";
                  AppMethodBeat.o(16043);
                  break;
                }
                localObject1 = "";
                localObject2 = paramContext.getString(2131297932);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + (String)localObject2 + paramString3.title;
                  label3546: if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label3643;
                }
                label3643: for (paramString3 = "%s: " + (String)localObject2 + paramString3.title; ; paramString3 = (String)localObject2 + paramString3.title)
                {
                  paramPString1.value = paramString3;
                  localObject2 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = (String)localObject2 + paramString3.title;
                  break label3546;
                }
                paramString3 = j.b.me(bo.anj((String)localObject1));
                if (paramString3 == null)
                {
                  ab.e("MicroMsg.Notification.Wording", "decode msg content failed");
                  paramString3 = "";
                  AppMethodBeat.o(16043);
                  break;
                }
                localObject1 = "";
                paramString1 = paramContext.getString(2131297932);
                if (paramInt1 == 1)
                {
                  paramString3 = paramString1 + paramString3.fhJ;
                  if (str1.length() > 0);
                  for (paramString1 = "%s: ".concat(String.valueOf(paramString3)); ; paramString1 = String.valueOf(paramString3))
                  {
                    paramPString1.value = paramString1;
                    paramString1 = paramString3;
                    if (t.ny(paramString2))
                      break label7912;
                    paramString1 = paramString3;
                    if (k != 0)
                      break label7912;
                    paramPString2.value = str1;
                    localObject2 = null;
                    i = 0;
                    paramString1 = paramString3;
                    paramString3 = (String)localObject1;
                    break;
                  }
                }
                paramString3 = paramString1 + paramString3.fhI;
                if (str1.length() > 0);
                for (paramString1 = "%s: ".concat(String.valueOf(paramString3)); ; paramString1 = String.valueOf(paramString3))
                {
                  paramPString1.value = paramString1;
                  break;
                }
                paramString3 = j.b.me(bo.anj((String)localObject1));
                if (paramString3 == null)
                {
                  ab.e("MicroMsg.Notification.Wording", "decode msg content failed");
                  paramString3 = "";
                  AppMethodBeat.o(16043);
                  break;
                }
                localObject1 = "";
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + paramString3.title;
                  label3946: if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4020;
                }
                label4020: for (paramString3 = "%s: " + paramString3.title; ; paramString3 = paramString3.title)
                {
                  paramPString1.value = paramString3;
                  localObject2 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = paramString3.title;
                  break label3946;
                }
                localObject1 = paramContext.getString(2131296527);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  label4068: if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4123;
                }
                label4123: for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject2 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label4068;
                }
                paramString1 = j.b.me(bo.anj((String)localObject1));
                if (paramString1 == null)
                {
                  ab.e("MicroMsg.Notification.Wording", "decode msg content failed");
                  paramString3 = "";
                  AppMethodBeat.o(16043);
                  break;
                }
                localObject1 = "";
                try
                {
                  paramString1 = URLDecoder.decode(paramString1.content, "UTF-8");
                  paramString3 = paramString1;
                  paramString1 = j.ajP(paramString1);
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() > 0)
                  {
                    paramString3 = "%s: ".concat(String.valueOf(paramString1));
                    paramPString1.value = paramString3;
                    localObject2 = null;
                    i = 0;
                    paramString3 = (String)localObject1;
                  }
                }
                catch (Exception localException)
                {
                  while (true)
                  {
                    paramString1 = paramString3;
                    ab.printErrStackTrace("MicroMsg.Notification.Wording", localException, "", new Object[0]);
                    continue;
                    paramString3 = paramString1;
                  }
                }
              }
              paramString1 = bo.anj((String)localObject1);
              localObject3 = j.b.me(paramString1);
              if (localObject3 == null)
              {
                ab.e("MicroMsg.Notification.Wording", "decode msg content failed");
                paramString3 = "";
                AppMethodBeat.o(16043);
                break;
              }
              switch (((j.b)localObject3).type)
              {
              case 9:
              case 10:
              case 11:
              case 12:
              case 13:
              case 14:
              case 18:
              case 20:
              case 21:
              case 22:
              case 23:
              case 28:
              case 29:
              case 30:
              case 31:
              case 32:
              case 35:
              case 37:
              case 38:
              case 39:
              case 41:
              case 42:
              case 43:
              case 45:
              default:
                paramString3 = paramContext.getString(2131296527);
                localObject3 = null;
                i = 0;
                paramString1 = "";
                break;
              case 1:
                localObject1 = "";
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + ((j.b)localObject3).title;
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4647;
                }
                for (paramString3 = "%s: " + ((j.b)localObject3).title; ; paramString3 = ((j.b)localObject3).title)
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = ((j.b)localObject3).title;
                  break label4571;
                }
              case 2:
                localObject1 = paramContext.getString(2131297012);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4751;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label4696;
                }
              case 3:
                localObject1 = paramContext.getString(2131296980);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4856;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = ((j.b)localObject3).title;
                  i = 1;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label4797;
                }
              case 4:
                localObject1 = paramContext.getString(2131297076);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label4961;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = ((j.b)localObject3).title;
                  i = 1;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label4902;
                }
              case 6:
                localObject1 = paramContext.getString(2131296942);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label5066;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = ((j.b)localObject3).title;
                  i = 1;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label5007;
                }
              case 7:
                localObject1 = paramContext.getString(2131296527);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label5167;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label5112;
                }
              case 5:
                localObject1 = paramContext.getString(2131297071);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0) && (!t.nH(paramString2)))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label5279;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = ((j.b)localObject3).getTitle();
                  i = 1;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label5213;
                }
              case 46:
                paramString3 = paramContext.getString(2131296527);
                localObject3 = null;
                i = 0;
                paramString1 = "";
                break;
              case 33:
              case 36:
                localObject1 = "";
                paramString3 = paramContext.getString(2131296591);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + paramString3 + ((j.b)localObject3).title;
                  if ((!t.ny(paramString2)) && (k == 0) && (!t.nH(paramString2)))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label5465;
                }
                for (paramString3 = "%s: " + paramString3 + ((j.b)localObject3).title; ; paramString3 = paramString3 + ((j.b)localObject3).title)
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = paramString3 + ((j.b)localObject3).title;
                  break label5361;
                }
              case 44:
                if (((j.b)localObject3).cw(false))
                {
                  localObject1 = "";
                  paramString3 = ((j.b)localObject3).p(paramContext, true);
                  if (!bo.isNullOrNil(paramString3))
                  {
                    if (str1.length() > 0)
                    {
                      paramString1 = str1 + ": " + paramString3 + ((j.b)localObject3).title;
                      paramPString2.value = str1;
                      if (str1.length() <= 0)
                        break label5647;
                    }
                    for (paramString3 = "%s: " + paramString3 + ((j.b)localObject3).title; ; paramString3 = paramString3 + ((j.b)localObject3).title)
                    {
                      paramPString1.value = paramString3;
                      localObject3 = null;
                      i = 0;
                      paramString3 = (String)localObject1;
                      break;
                      paramString1 = paramString3 + ((j.b)localObject3).title;
                      break label5562;
                    }
                  }
                  paramString3 = paramContext.getString(2131296527);
                  localObject3 = null;
                  i = 0;
                  paramString1 = "";
                  break;
                }
                paramString3 = paramContext.getString(2131296527);
                localObject3 = null;
                i = 0;
                paramString1 = "";
                break;
              case 8:
                paramString3 = paramContext.getString(2131296896);
                if (str1.length() > 0);
                for (paramString1 = str1 + ": "; ; paramString1 = "")
                {
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  paramPString1.value = "";
                  localObject3 = null;
                  i = 0;
                  break;
                }
              case 15:
              case 26:
              case 27:
                paramString3 = paramContext.getString(2131296897);
                if (str1.length() > 0);
                for (paramString1 = str1 + ": "; ; paramString1 = "")
                {
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  paramPString1.value = "";
                  localObject3 = null;
                  i = 0;
                  break;
                }
              case 25:
                paramString3 = paramContext.getString(2131296883);
                if (str1.length() > 0);
                for (paramString1 = str1 + ": "; ; paramString1 = "")
                {
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  paramPString1.value = "";
                  localObject3 = null;
                  i = 0;
                  break;
                }
              case 17:
                localObject1 = "";
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + ((j.b)localObject3).title;
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label6073;
                }
                for (paramString3 = "%s: " + ((j.b)localObject3).title; ; paramString3 = ((j.b)localObject3).title)
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = ((j.b)localObject3).title;
                  break label5997;
                }
              case 19:
                localObject1 = paramContext.getString(2131297030);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label6177;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = "";
                  break label6122;
                }
              case 24:
                paramString1 = "";
                if (!bo.isNullOrNil(((j.b)localObject3).description))
                {
                  i = ((j.b)localObject3).description.indexOf("\n");
                  paramString1 = ((j.b)localObject3).description;
                  if (i > 0)
                    paramString1 = paramString1.substring(0, i);
                }
                else
                {
                  localObject1 = paramContext.getString(2131299767) + paramString1;
                  if (str1.length() <= 0)
                    break label6348;
                  paramString1 = str1 + ": ";
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label6354;
                }
                for (paramString3 = "%s: "; ; paramString3 = "")
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  i = ((j.b)localObject3).description.length();
                  break label6221;
                  paramString1 = "";
                  break label6286;
                }
              case 16:
                localObject1 = "";
                paramString3 = paramContext.getString(2131297932);
                if (str1.length() > 0)
                {
                  paramString1 = str1 + ": " + paramString3 + ((j.b)localObject3).title;
                  if ((!t.ny(paramString2)) && (k == 0))
                    paramPString2.value = str1;
                  if (str1.length() <= 0)
                    break label6497;
                }
                for (paramString3 = "%s: ".concat(String.valueOf(paramString3)); ; paramString3 = String.valueOf(paramString3))
                {
                  paramPString1.value = paramString3;
                  localObject3 = null;
                  i = 0;
                  paramString3 = (String)localObject1;
                  break;
                  paramString1 = paramString3 + ((j.b)localObject3).title;
                  break label6415;
                }
              case 34:
                localObject1 = "";
                paramString1 = paramContext.getString(2131297932);
                if (paramInt1 == 1)
                {
                  paramString3 = paramString1 + ((j.b)localObject3).fhJ;
                  if (str1.length() > 0);
                  for (paramString1 = "%s: ".concat(String.valueOf(paramString3)); ; paramString1 = String.valueOf(paramString3))
                  {
                    paramPString1.value = paramString1;
                    paramString1 = paramString3;
                    if (t.ny(paramString2))
                      break label7912;
                    paramString1 = paramString3;
                    if (k != 0)
                      break label7912;
                    paramPString2.value = str1;
                    localObject3 = null;
                    i = 0;
                    paramString1 = paramString3;
                    paramString3 = (String)localObject1;
                    break;
                  }
                }
                paramString3 = paramString1 + ((j.b)localObject3).fhI;
                if (str1.length() > 0);
                for (paramString1 = "%s: ".concat(String.valueOf(paramString3)); ; paramString1 = String.valueOf(paramString3))
                {
                  paramPString1.value = paramString1;
                  break;
                }
              case 40:
                label4571: label4856: label5112: if (com.tencent.mm.af.n.mj(paramString1).fju == 19)
                {
                  localObject1 = paramContext.getString(2131297030);
                  localObject3 = null;
                  i = 0;
                  paramString1 = paramString3;
                  paramString3 = (String)localObject1;
                  break;
                }
                label4647: label4696: label4961: label5361: localObject1 = paramContext.getString(2131296527);
                label4751: label4797: label5066: label5213: label5997: localObject3 = null;
                label4902: label5167: label5465: label6122: i = 0;
                label5007: label5279: label5562: label6221: label6354: label6497: paramString1 = paramString3;
                label5647: label6073: label6348: paramString3 = (String)localObject1;
                label6177: break;
                label6286: label6415: paramString1 = paramString3;
                if (j != 0)
                  paramString1 = jW(paramString3);
                paramString3 = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).mi(paramString1);
                paramString1 = paramString3;
                if (j != 0)
                  paramString1 = jV(paramString3);
                paramPString1.value = paramString1;
                paramString3 = "";
                localObject3 = null;
                i = 0;
                break;
                paramPString1.value = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).mh(paramString3);
                paramString3 = paramPString1.value;
                ab.i("MicroMsg.Notification.Wording", "[parseMsgContentToShow] type:%s suffix:%s", new Object[] { Integer.valueOf(318767153), paramString3 });
                localObject3 = null;
                i = 0;
                paramString1 = "";
                break;
                paramString1 = com.tencent.mm.ak.a.b(a.a.rE(paramString3));
                paramPString1.value = paramString1;
                paramString3 = "";
                localObject3 = null;
                i = 0;
                break;
                paramString3 = "";
                localObject3 = j.b.me((String)localObject1);
                paramString1 = paramString3;
                if (localObject3 == null)
                  break label7050;
                paramString1 = paramString3;
                try
                {
                  paramString3 = URLDecoder.decode(((j.b)localObject3).content, "UTF-8");
                  paramString1 = paramString3;
                  paramString3 = j.ajP(paramString3);
                  paramString1 = paramString3;
                  paramPString1.value = paramString3;
                  localObject1 = "";
                  localObject3 = null;
                  i = 0;
                  paramString1 = paramString3;
                  paramString3 = (String)localObject1;
                }
                catch (Exception paramString3)
                {
                  ab.printErrStackTrace("MicroMsg.Notification.Wording", paramString3, "", new Object[0]);
                  paramString3 = "";
                  localObject3 = null;
                  i = 0;
                }
              }
            }
            break label819;
            paramString1 = ((e)g.K(e.class)).QD(paramString3);
            if (paramString1 != null);
            for (paramString1 = paramString1.toString(); ; paramString1 = "")
            {
              paramPString1.value = paramString1;
              paramString3 = "";
              localObject3 = null;
              i = 0;
              break;
            }
            paramString3 = com.tencent.mm.af.a.a.mk(paramString3).content;
            paramString1 = paramString3;
            if (bo.isNullOrNil(paramString3))
              paramString1 = "";
            paramPString1.value = paramString1;
            label7050: paramString3 = "";
            Object localObject3 = null;
            i = 0;
            break label819;
            label7062: paramString1 = paramString1.split("@bottle:");
            if (paramString1.length > 1)
            {
              paramPString1.value = paramString1[1];
              paramString3 = paramString1[1];
              AppMethodBeat.o(16043);
              break;
            }
            paramPString1.value = "";
            paramString3 = null;
            AppMethodBeat.o(16043);
            break;
            label7115: paramString2 = null;
            paramPString2 = null;
            paramContext = paramString1.split(":");
            if ((paramContext == null) || (paramContext.length <= 0))
            {
              paramPString1.value = "";
              paramString3 = null;
              AppMethodBeat.o(16043);
              break;
            }
            paramContext = paramContext[0];
            if (!bo.isNullOrNil(paramContext))
            {
              aw.ZK();
              paramPInt = c.XM().aoO(paramContext);
              paramContext = paramPString2;
              if (paramPInt != null)
              {
                paramContext = paramPString2;
                if (paramPInt.getCity() != null)
                  paramContext = paramPInt.getCity();
              }
              if (paramContext != null)
              {
                paramString2 = paramContext;
                if (paramContext.length() > 0);
              }
              else
              {
                paramString2 = paramPInt.getProvince();
              }
            }
            if (!bo.isNullOrNil(paramString3))
            {
              paramPString1.value = (paramString2 + ": " + paramString3);
              paramString3 = paramString2 + ": " + paramString3;
              AppMethodBeat.o(16043);
              break;
            }
            paramString1 = paramString1.split("@bottle:");
            if (paramString1.length > 1)
            {
              paramPString1.value = (paramString2 + ": " + paramString1[1]);
              paramString3 = paramString2 + ": " + paramString1[1];
              AppMethodBeat.o(16043);
              break;
            }
            paramPString1.value = paramString2;
            AppMethodBeat.o(16043);
            paramString3 = paramString2;
            break;
            label7405: if (bo.isNullOrNil(paramString1))
              paramPString1.value = "";
            if (!bo.isNullOrNil(str1))
            {
              paramString2 = paramString1;
              if (str2 != null)
              {
                paramString2 = paramString1;
                if (str2.length() > 0)
                  paramString2 = i(paramString1, str1, str2);
              }
              if (bo.isNullOrNil(paramPString2.value))
              {
                paramPString1.value = i(paramPString1.value, str1, "%s");
                paramPString2.value = str1;
              }
              paramString1 = o.kz(paramString2);
              paramPString1.value = o.kz(paramPString1.value);
              paramString2 = paramString1 + paramString3;
              paramPString1.value += paramString3;
              if ((paramBoolean1) && (!a(paramInt2, paramPString1, paramString2)))
                a(paramInt2, paramPString1, paramPString2, paramPInt);
              paramString1 = paramString2;
              if (i != 0)
                paramString1 = paramString2.concat(" " + bo.nullAsNil((String)localObject3));
              paramString3 = bo.nullAsNil(paramString1);
              AppMethodBeat.o(16043);
              break;
            }
            if ((t.ny(paramString2)) || (k != 0) || (t.nH(paramString2)))
            {
              paramString2 = paramString1;
              if (paramString3 != null)
              {
                paramString2 = paramString1;
                if (paramString3.length() > 0)
                  paramString2 = paramString3;
              }
              if (bo.isNullOrNil(paramString2))
              {
                paramPString1.value = "";
                paramPString2.value = "";
                paramString3 = "";
                AppMethodBeat.o(16043);
                break;
              }
              if (paramInt1 == 0);
              for (paramPString1.value = "%s:".concat(String.valueOf(paramString2)); ; paramPString1.value = (paramContext.getString(2131296970) + ":" + paramString2))
              {
                if (!paramBoolean1)
                  break label7825;
                a(paramInt2, paramPString1, paramPString2, paramPInt);
                paramString1 = paramString2;
                paramString2 = paramString1;
                if (i != 0)
                {
                  paramString2 = paramString1;
                  if (localObject3 != null)
                    paramString2 = paramString1.concat(" ".concat(String.valueOf(localObject3)));
                }
                paramString1 = paramString2;
                if (j != 0)
                  paramString1 = jW(paramString2);
                paramString3 = bo.nullAsNil(paramString1);
                AppMethodBeat.o(16043);
                break;
              }
              label7825: paramString3 = s.mJ(paramPString2.value) + ":" + paramString2;
              AppMethodBeat.o(16043);
              break;
            }
            if ((paramString3 != null) && (paramString3.length() > 0))
              paramPString1.value = paramString3;
            for (paramString2 = paramString3; ; paramString2 = paramString1)
            {
              paramString1 = paramString2;
              if (!paramBoolean1)
                break;
              a(paramInt2, paramPString1, paramPString2, paramPInt);
              paramString1 = paramString2;
              break;
            }
            label7912: paramString3 = "";
            localObject3 = null;
            i = 0;
            break label819;
            paramString1 = paramString2;
            break label2354;
            paramString1 = paramString2;
          }
          label7934: k = i;
        }
        str2 = "";
        str1 = "";
      }
    }
  }

  private static void a(int paramInt, PString paramPString1, PString paramPString2, PInt paramPInt)
  {
    AppMethodBeat.i(16051);
    if ((paramPString1.value.length() == 32) && ((paramInt == 47) || (paramInt == 1048625)))
      AppMethodBeat.o(16051);
    while (true)
    {
      return;
      if (paramPString1.value.length() >= 150)
        paramPString1.value = paramPString1.value.substring(0, C(paramPString1.value, 150));
      TextPaint localTextPaint = getTextPaint();
      if ((paramPString1.value.replace("%%", "").contains("%s")) || (localTextPaint == null))
      {
        paramPInt.value = 0;
        AppMethodBeat.o(16051);
        continue;
      }
      try
      {
        paramPString2 = String.format(paramPString1.value, new Object[] { paramPString2.value });
        paramPString1.value = a(paramPString2, localTextPaint).toString();
        paramPInt.value = 1;
        AppMethodBeat.o(16051);
      }
      catch (Exception paramPString2)
      {
        while (true)
          paramPString2 = paramPString1.value;
      }
    }
  }

  public static void a(TextPaint paramTextPaint)
  {
    AppMethodBeat.i(16056);
    if ((eeQ == null) || (eeQ.get() == null))
      eeQ = new WeakReference(paramTextPaint);
    AppMethodBeat.o(16056);
  }

  private static boolean a(int paramInt, PString paramPString, String paramString)
  {
    AppMethodBeat.i(16048);
    boolean bool;
    if ((paramPString.value.length() == 32) && ((paramInt == 47) || (paramInt == 1048625)))
    {
      paramPString.value = paramString;
      bool = true;
      AppMethodBeat.o(16048);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16048);
    }
  }

  public static String b(ad paramad)
  {
    AppMethodBeat.i(16040);
    Object localObject = ah.getContext();
    if (paramad == null)
    {
      paramad = ((Context)localObject).getString(2131297739);
      AppMethodBeat.o(16040);
    }
    while (true)
    {
      return paramad;
      if (RegionCodeDecoder.apQ(paramad.getCountryCode()))
      {
        localObject = paramad.getCity();
        if (!bo.isNullOrNil((String)localObject))
        {
          AppMethodBeat.o(16040);
          paramad = (ad)localObject;
        }
        else
        {
          localObject = s.mL(paramad.getProvince());
          if (!bo.isNullOrNil((String)localObject))
          {
            AppMethodBeat.o(16040);
            paramad = (ad)localObject;
          }
          else
          {
            RegionCodeDecoder.duj();
            paramad = RegionCodeDecoder.getLocName(paramad.getCountryCode());
            AppMethodBeat.o(16040);
          }
        }
      }
      else
      {
        paramad = s.mL(paramad.getProvince());
        if (!bo.isNullOrNil(paramad))
        {
          AppMethodBeat.o(16040);
        }
        else
        {
          paramad = ((Context)localObject).getString(2131297739);
          AppMethodBeat.o(16040);
        }
      }
    }
  }

  public static String b(bi parambi, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean)
  {
    AppMethodBeat.i(16041);
    if (parambi.dtv());
    for (String str = parambi.dtW(); ; str = parambi.field_content)
    {
      str = j.ajP(str);
      parambi = bo.nullAsNil(a(parambi.field_imgPath, parambi.field_isSend, parambi.field_talker, str, parambi.getType(), ah.getContext(), paramPString1, paramPString2, paramPInt, true, paramBoolean));
      AppMethodBeat.o(16041);
      return parambi;
    }
  }

  private static String bx(Context paramContext)
  {
    AppMethodBeat.i(16045);
    boolean bool = r.YU();
    aw.ZK();
    long l = bo.a((Long)c.Ry().get(65793, null), 0L);
    if (!bool)
    {
      paramContext = paramContext.getString(2131303207);
      AppMethodBeat.o(16045);
    }
    while (true)
    {
      return paramContext;
      if (l == 0L)
      {
        paramContext = paramContext.getString(2131299989);
        AppMethodBeat.o(16045);
      }
      else if (bo.fp(l) * 1000L > 1209600000L)
      {
        paramContext = paramContext.getString(2131299988, new Object[] { Long.valueOf(bo.fp(l) * 1000L / 86400000L) });
        AppMethodBeat.o(16045);
      }
      else
      {
        paramContext = "";
        AppMethodBeat.o(16045);
      }
    }
  }

  public static String d(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(16057);
    paramString = com.tencent.mm.cb.b.dqD().anU(paramString);
    if (paramBoolean)
    {
      AppMethodBeat.o(16057);
      paramContext = paramString;
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131300629);
      AppMethodBeat.o(16057);
    }
  }

  public static String e(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(16059);
    if (paramBoolean)
    {
      paramContext = com.tencent.mm.cb.b.dqD().anU(paramString);
      AppMethodBeat.o(16059);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getString(2131301820);
      AppMethodBeat.o(16059);
    }
  }

  public static String g(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(16039);
    if (t.kH(paramString1))
    {
      paramString2 = bf.oy(paramString2);
      if (paramString2 != null)
      {
        paramString2 = s.mJ(paramString2.trim());
        if (!paramString1.contains("@bottle"))
          break label87;
        paramContext = paramContext.getResources().getQuantityString(2131361813, 1, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(16039);
      }
    }
    while (true)
    {
      return paramContext;
      paramString2 = s.mJ(paramString1);
      break;
      paramString2 = s.mJ(paramString1);
      break;
      label87: String str = paramString2;
      if (bo.isNullOrNil(paramString2))
      {
        str = paramString2;
        if (t.kH(paramString1))
          str = paramContext.getString(2131298223);
      }
      paramContext = com.tencent.mm.cb.b.dqD().anU(str);
      AppMethodBeat.o(16039);
    }
  }

  private static TextPaint getTextPaint()
  {
    AppMethodBeat.i(16055);
    TextPaint localTextPaint;
    if (eeQ == null)
    {
      localTextPaint = null;
      AppMethodBeat.o(16055);
    }
    while (true)
    {
      return localTextPaint;
      localTextPaint = (TextPaint)eeQ.get();
      AppMethodBeat.o(16055);
    }
  }

  private static String i(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(16047);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(paramString3)))
      AppMethodBeat.o(16047);
    while (true)
    {
      return paramString1;
      int i = paramString1.indexOf(paramString2);
      if (i < 0)
      {
        AppMethodBeat.o(16047);
      }
      else
      {
        paramString1 = paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length());
        AppMethodBeat.o(16047);
      }
    }
  }

  public static void iv(int paramInt)
  {
    eeR = paramInt;
  }

  public static void iw(int paramInt)
  {
    eeS = paramInt;
  }

  private static String jV(String paramString)
  {
    AppMethodBeat.i(16046);
    if (paramString != null)
    {
      paramString = paramString.replaceAll("%", "%%");
      AppMethodBeat.o(16046);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(16046);
    }
  }

  private static String jW(String paramString)
  {
    AppMethodBeat.i(16049);
    if (paramString != null)
    {
      paramString = paramString.replaceAll("%%", "%");
      AppMethodBeat.o(16049);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(16049);
    }
  }

  public static String jX(String paramString)
  {
    AppMethodBeat.i(16050);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(16050);
    }
    while (true)
    {
      return paramString;
      if (paramString.length() < 150)
      {
        AppMethodBeat.o(16050);
      }
      else
      {
        paramString = paramString.substring(0, 150) + "...";
        AppMethodBeat.o(16050);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.h
 * JD-Core Version:    0.6.2
 */