package com.tencent.mm.plugin.wenote.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.text.Spanned;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  public static HashMap<String, String> uSF;
  public static HashMap<String, r> uSG;
  public static c uSH;
  private static com.tencent.mm.a.f<String, Integer> uSI;

  static
  {
    AppMethodBeat.i(26993);
    uSF = new HashMap();
    uSG = new HashMap();
    uSH = null;
    uSI = new com.tencent.mm.memory.a.c(30);
    AppMethodBeat.o(26993);
  }

  public static String a(Context paramContext, com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    AppMethodBeat.i(26991);
    if (paramc == null)
    {
      paramContext = "";
      AppMethodBeat.o(26991);
    }
    while (true)
    {
      return paramContext;
      int i = paramc.getType();
      if (i == 1)
      {
        paramContext = ((i)paramc).content;
        AppMethodBeat.o(26991);
      }
      else if (i == 3)
      {
        paramContext = paramContext.getString(2131305658);
        AppMethodBeat.o(26991);
      }
      else if (i == 2)
      {
        paramContext = paramContext.getString(2131305657);
        AppMethodBeat.o(26991);
      }
      else if (i == 6)
      {
        paramContext = paramContext.getString(2131305659);
        AppMethodBeat.o(26991);
      }
      else if (i == 4)
      {
        paramContext = paramContext.getString(2131305660);
        AppMethodBeat.o(26991);
      }
      else if (i == 5)
      {
        paramContext = paramContext.getString(2131305656);
        AppMethodBeat.o(26991);
      }
      else
      {
        paramContext = "";
        AppMethodBeat.o(26991);
      }
    }
  }

  public static Bitmap ahk(String paramString)
  {
    AppMethodBeat.i(26983);
    paramString = com.tencent.mm.plugin.fav.ui.c.aI(paramString, false);
    if (paramString != null)
      AppMethodBeat.o(26983);
    while (true)
    {
      return paramString;
      if (bo.isNullOrNil(null))
      {
        AppMethodBeat.o(26983);
        paramString = null;
      }
      else
      {
        paramString = com.tencent.mm.plugin.fav.ui.c.aI(null, false);
        AppMethodBeat.o(26983);
      }
    }
  }

  public static int ahl(String paramString)
  {
    AppMethodBeat.i(26987);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(26987);
    }
    while (true)
    {
      return i;
      i = ahn(b.ahh(paramString));
      AppMethodBeat.o(26987);
    }
  }

  public static int ahm(String paramString)
  {
    AppMethodBeat.i(26989);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      AppMethodBeat.o(26989);
    }
    while (true)
    {
      return i;
      if (uSI.aj(paramString))
      {
        i = ((Integer)uSI.get(paramString)).intValue();
        AppMethodBeat.o(26989);
      }
      else
      {
        i = ahn(paramString);
        uSI.put(paramString, Integer.valueOf(i));
        AppMethodBeat.o(26989);
      }
    }
  }

  private static int ahn(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(26990);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(26990);
    while (true)
    {
      return i;
      int j = 0;
      int k;
      for (i = 0; j < paramString.length(); i = k + i)
      {
        k = x(paramString.charAt(j));
        j++;
      }
      AppMethodBeat.o(26990);
    }
  }

  public static String aho(String paramString)
  {
    AppMethodBeat.i(26992);
    paramString = Pattern.compile("wx-b>", 2).matcher(paramString).replaceAll("wa-b>");
    paramString = Pattern.compile("</wx-li>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("</wn-todo>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(paramString).replaceAll("");
    paramString = Pattern.compile("wa-b>", 2).matcher(paramString).replaceAll("wx-b>");
    AppMethodBeat.o(26992);
    return paramString;
  }

  public static int c(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(26988);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(26988);
      paramInt1 = 0;
    }
    while (true)
    {
      return paramInt1;
      paramString = a.ahb(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(26988);
        paramInt1 = 0;
      }
      else
      {
        if (paramBoolean)
          paramInt2 = paramString.length();
        if ((paramInt1 < 0) || (paramInt1 > paramString.length()) || (paramInt2 < 0) || (paramInt2 > paramString.length()) || (paramInt1 > paramInt2))
        {
          AppMethodBeat.o(26988);
          paramInt1 = 0;
        }
        else
        {
          paramString = (Spanned)paramString.subSequence(paramInt1, paramInt2);
          if (paramString == null)
          {
            AppMethodBeat.o(26988);
            paramInt1 = 0;
          }
          else
          {
            paramInt1 = ahn(paramString.toString());
            AppMethodBeat.o(26988);
          }
        }
      }
    }
  }

  public static com.tencent.mm.plugin.wenote.model.a.c c(com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    AppMethodBeat.i(26984);
    Object localObject1;
    if (paramc == null)
    {
      AppMethodBeat.o(26984);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      switch (paramc.getType())
      {
      case 0:
      default:
        localObject1 = null;
      case 1:
      case 3:
      case 2:
      case 6:
      case 4:
      case 5:
      case -1:
      }
      while (true)
      {
        if (localObject1 != null)
          break label386;
        AppMethodBeat.o(26984);
        localObject1 = null;
        break;
        localObject1 = new i();
        ((i)localObject1).content = ((i)paramc).content;
        continue;
        localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
        Object localObject2 = (com.tencent.mm.plugin.wenote.model.a.g)localObject1;
        Object localObject3 = (com.tencent.mm.plugin.wenote.model.a.g)paramc;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject2).lat = ((com.tencent.mm.plugin.wenote.model.a.g)localObject3).lat;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject2).lng = ((com.tencent.mm.plugin.wenote.model.a.g)localObject3).lng;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject2).scale = ((com.tencent.mm.plugin.wenote.model.a.g)localObject3).scale;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject2).fBg = ((com.tencent.mm.plugin.wenote.model.a.g)localObject3).fBg;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject2).eUu = ((com.tencent.mm.plugin.wenote.model.a.g)localObject3).eUu;
        continue;
        localObject1 = new com.tencent.mm.plugin.wenote.model.a.f();
        ((com.tencent.mm.plugin.wenote.model.a.f)localObject1).uOq = ((com.tencent.mm.plugin.wenote.model.a.f)paramc).uOq;
        continue;
        localObject1 = new k();
        localObject3 = (k)localObject1;
        localObject2 = (k)paramc;
        ((k)localObject3).thumbPath = ((k)localObject2).thumbPath;
        ((k)localObject3).duration = ((k)localObject2).duration;
        ((k)localObject3).uOf = ((k)localObject2).uOf;
        continue;
        localObject1 = new l();
        localObject2 = (l)localObject1;
        localObject3 = (l)paramc;
        ((l)localObject2).uOD = ((l)localObject3).uOD;
        ((l)localObject2).length = ((l)localObject3).length;
        ((l)localObject2).uOC = ((l)localObject3).uOC;
        ((l)localObject2).hNN = ((l)localObject3).hNN;
        ((l)localObject2).cAP = ((l)localObject3).cAP;
        ((l)localObject2).cAO = ((l)localObject3).cAO;
        ((l)localObject2).uOf = ((l)localObject3).uOf;
        continue;
        localObject1 = new com.tencent.mm.plugin.wenote.model.a.d();
        localObject3 = (com.tencent.mm.plugin.wenote.model.a.d)localObject1;
        localObject2 = (com.tencent.mm.plugin.wenote.model.a.d)paramc;
        ((com.tencent.mm.plugin.wenote.model.a.d)localObject3).title = ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).title;
        ((com.tencent.mm.plugin.wenote.model.a.d)localObject3).content = ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).content;
        ((com.tencent.mm.plugin.wenote.model.a.d)localObject3).hNN = ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).hNN;
        ((com.tencent.mm.plugin.wenote.model.a.d)localObject3).uOf = ((com.tencent.mm.plugin.wenote.model.a.d)localObject2).uOf;
        continue;
        localObject1 = new h();
      }
      label386: ((o)localObject1).type = ((o)paramc).type;
      ((o)localObject1).uOp = ((o)paramc).uOp;
      ((o)localObject1).cHg = ((o)paramc).cHg;
      AppMethodBeat.o(26984);
    }
  }

  public static String d(com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    AppMethodBeat.i(26985);
    if (paramc == null)
    {
      paramc = "";
      AppMethodBeat.o(26985);
    }
    while (true)
    {
      return paramc;
      if (paramc.getType() == 2)
      {
        paramc = ((com.tencent.mm.plugin.wenote.model.a.f)paramc).uOq;
        AppMethodBeat.o(26985);
      }
      else
      {
        paramc = ((o)paramc).cHg;
        AppMethodBeat.o(26985);
      }
    }
  }

  public static String e(com.tencent.mm.plugin.wenote.model.a.c paramc)
  {
    AppMethodBeat.i(26986);
    if (paramc == null)
    {
      paramc = "";
      AppMethodBeat.o(26986);
    }
    while (true)
    {
      return paramc;
      if (paramc.getType() == 2)
      {
        paramc = ((com.tencent.mm.plugin.wenote.model.a.f)paramc).cHg;
        AppMethodBeat.o(26986);
      }
      else if (paramc.getType() == 6)
      {
        paramc = ((k)paramc).thumbPath;
        AppMethodBeat.o(26986);
      }
      else
      {
        paramc = "";
        AppMethodBeat.o(26986);
      }
    }
  }

  public static String hs(String paramString1, String paramString2)
  {
    int i = 1280;
    AppMethodBeat.i(26981);
    if (bo.isNullOrNil(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.x(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_HD";
      paramString2 = an.bvm() + "/" + paramString2;
    }
    while (true)
    {
      BitmapFactory.Options localOptions;
      int j;
      int m;
      if (!e.ct(paramString2))
      {
        localOptions = com.tencent.mm.sdk.platformtools.d.amj(paramString1);
        if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
        {
          ab.e("MicroMsg.WNNoteUtil", "GetImageOptions Error");
          paramString2 = null;
          AppMethodBeat.o(26981);
          return paramString2;
        }
        j = localOptions.outHeight;
        int k = localOptions.outWidth;
        m = k;
        if (k > 1280)
          m = 1280;
        if (j <= 1280)
          break label241;
      }
      while (true)
      {
        if (localOptions.outHeight < localOptions.outWidth)
        {
          j = i;
          i = m;
          m = j;
        }
        while (true)
        {
          if (ad.amy(paramString1) > 0)
          {
            i = localOptions.outHeight;
            m = localOptions.outWidth;
          }
          com.tencent.mm.sdk.platformtools.d.c(paramString1, i, m, Bitmap.CompressFormat.JPEG, 95, paramString2);
          AppMethodBeat.o(26981);
          break;
        }
        label241: i = j;
      }
    }
  }

  public static String ht(String paramString1, String paramString2)
  {
    int i = 800;
    AppMethodBeat.i(26982);
    if (bo.isNullOrNil(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.x(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_TH";
      paramString2 = an.bvm() + "/" + paramString2;
    }
    while (true)
    {
      BitmapFactory.Options localOptions;
      int j;
      int k;
      int m;
      if (!e.ct(paramString2))
      {
        localOptions = com.tencent.mm.sdk.platformtools.d.amj(paramString1);
        if ((localOptions == null) || (localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
        {
          ab.e("MicroMsg.WNNoteUtil", "GetImageOptions Error,use orignal file");
          paramString2 = null;
          AppMethodBeat.o(26982);
          return paramString2;
        }
        j = localOptions.outHeight;
        k = localOptions.outWidth;
        while (k * j > 2764800)
        {
          k >>= 1;
          j >>= 1;
        }
        m = k;
        if (k > 800)
          m = 800;
        if (j <= 800)
          break label255;
        j = i;
      }
      label255: 
      while (true)
      {
        if (localOptions.outHeight < localOptions.outWidth)
        {
          k = j;
          j = m;
          m = k;
        }
        while (true)
        {
          com.tencent.mm.sdk.platformtools.d.c(paramString1, j, m, Bitmap.CompressFormat.JPEG, 95, paramString2);
          AppMethodBeat.o(26982);
          break;
        }
      }
    }
  }

  private static int x(char paramChar)
  {
    if (paramChar <= '');
    for (paramChar = '\001'; ; paramChar = '\002')
      return paramChar;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.b.c
 * JD-Core Version:    0.6.2
 */