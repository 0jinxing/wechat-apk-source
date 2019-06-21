package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.f;
import com.tencent.mm.plugin.story.api.f.a;
import com.tencent.mm.plugin.story.api.m;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class d
{
  public static CharSequence a(Context paramContext, cat paramcat, com.tencent.mm.plugin.sns.ui.j paramj, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(40503);
    paramContext = b(paramContext, paramcat, paramj, paramInt1, paramString, paramInt2);
    AppMethodBeat.o(40503);
    return paramContext;
  }

  private static String a(cat paramcat)
  {
    AppMethodBeat.i(40505);
    ad localad = af.cnt().aoN(paramcat.vHl);
    if (localad != null)
    {
      paramcat = localad.Oj();
      AppMethodBeat.o(40505);
    }
    while (true)
    {
      return paramcat;
      if (paramcat.wCW != null)
      {
        paramcat = paramcat.wCW;
        AppMethodBeat.o(40505);
      }
      else
      {
        paramcat = paramcat.vHl;
        AppMethodBeat.o(40505);
      }
    }
  }

  private static CharSequence b(Context paramContext, cat paramcat, com.tencent.mm.plugin.sns.ui.j paramj, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(40504);
    String str1 = "";
    String str2 = a(paramcat);
    String str3 = "";
    Object localObject1 = null;
    String str4 = null;
    int i = 0;
    int j = 0;
    boolean bool;
    int k;
    label77: String str5;
    if ((((e)com.tencent.mm.kernel.g.M(e.class)).getStoryBasicConfig().a(f.a.rQA)) && (com.tencent.mm.plugin.sns.e.a.Xu(paramcat.vHl)))
    {
      bool = true;
      if (paramInt1 != 21)
        break label499;
      k = 3;
      str5 = bo.nullAsNil(paramcat.ncM);
      if (bo.isNullOrNil(paramString))
        break label1086;
      com.tencent.mm.kernel.g.RQ();
    }
    label516: label526: label559: label1080: label1086: for (Object localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoM(paramString); ; localObject2 = null)
    {
      int m = i;
      label195: label231: int n;
      if (paramInt2 == 1)
      {
        if ((com.tencent.mm.plugin.sns.e.a.Xt(paramcat.vHl)) && (((e)com.tencent.mm.kernel.g.M(e.class)).getStoryBasicConfig().a(f.a.rQB)) && (n.isShowStoryCheck()))
        {
          str3 = str2 + "  ";
          m = 1;
        }
      }
      else
      {
        if (!fF(paramcat.wZL, 1))
          break label559;
        if (localObject2 == null)
          break label526;
        if ((localObject2 != null) && (!TextUtils.isEmpty(((ad)localObject2).Oj())))
          break label516;
        localObject2 = paramString;
        str3 = str3 + paramContext.getString(2131303598);
        i = str3.length();
        str3 = str3 + (String)localObject2;
        str3 = "" + str3 + ": ";
        n = 0;
        localObject1 = localObject2;
        localObject2 = str4;
      }
      while (true)
      {
        paramContext = com.tencent.mm.pluginsdk.ui.e.j.a(paramContext, str3 + str5, com.tencent.mm.bz.a.fromDPToPix(paramContext, (int)(15.0F * com.tencent.mm.bz.a.dm(paramContext))), 2, bool);
        if (paramInt1 != 21)
          break label987;
        paramInt1 = 3;
        label372: paramContext = new k(paramContext);
        if (paramInt2 == 1)
        {
          paramContext.a(new o(paramcat.vHl, paramj, paramInt1), str2, 0);
          if (m != 0)
            paramContext.setSpan(new g(((e)com.tencent.mm.kernel.g.M(e.class)).getStoryUIFactory().ls(true)), str2.length() + 1, str2.length() + 2, 17);
        }
        if (bo.isNullOrNil(localObject1))
          break label992;
        paramContext.a(new o(paramString, paramj, k), localObject1, i);
        label486: AppMethodBeat.o(40504);
        return paramContext;
        bool = false;
        break;
        label499: k = 2;
        break label77;
        str3 = str2;
        m = i;
        break label195;
        localObject2 = ((ad)localObject2).Oj();
        break label231;
        ab.w("SnsCommentUtil", "feedContact null by feedOwnUserName %s", new Object[] { paramString });
        i = 0;
        n = 0;
        localObject2 = str4;
        str3 = str1;
        continue;
        if (!fF(paramcat.wZL, 8))
          break label716;
        str4 = ((b)com.tencent.mm.kernel.g.K(b.class)).mJ(paramcat.xaa);
        localObject2 = str3;
        if (!bo.isNullOrNil(str3))
          localObject2 = str3 + ": ";
        str3 = (String)localObject2 + paramContext.getString(2131303598);
        n = str3.length();
        str3 = str3 + str4;
        str3 = "" + str3 + " ";
        i = 0;
        localObject2 = str4;
      }
      label716: if (!bo.isNullOrNil(paramcat.xaa))
      {
        localObject2 = af.cnt().aoN(paramcat.xaa);
        if (localObject2 == null)
        {
          localObject2 = paramcat.xaa;
          label751: if ((!com.tencent.mm.plugin.sns.e.a.Xt(paramcat.xaa)) || (!((e)com.tencent.mm.kernel.g.M(e.class)).getStoryBasicConfig().a(f.a.rQB)) || (!n.isShowStoryCheck()))
            break label1080;
          localObject2 = (String)localObject2 + "  ";
        }
      }
      for (i = 1; ; i = 0)
      {
        str3 = str3 + paramContext.getString(2131303752);
        n = str3.length();
        str3 = str3 + (String)localObject2;
        str3 = "" + str3 + ": ";
        j = i;
        i = 0;
        break;
        localObject2 = ((ad)localObject2).Oj();
        break label751;
        localObject2 = str3;
        if (!bo.isNullOrNil(str3))
          localObject2 = str3 + ": ";
        str3 = "" + (String)localObject2;
        i = 0;
        n = 0;
        localObject2 = str4;
        break;
        label987: paramInt1 = 2;
        break label372;
        label992: if (bo.isNullOrNil((String)localObject2))
          break label486;
        paramContext.a(new o(paramcat.xaa, paramj, k), (CharSequence)localObject2, n);
        if (j == 0)
          break label486;
        paramContext.setSpan(new g(((e)com.tencent.mm.kernel.g.M(e.class)).getStoryUIFactory().ls(true)), ((String)localObject2).length() + n - 1, ((String)localObject2).length() + n, 17);
        break label486;
      }
    }
  }

  public static boolean fF(int paramInt1, int paramInt2)
  {
    if ((paramInt1 & paramInt2) == paramInt2);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.d
 * JD-Core Version:    0.6.2
 */