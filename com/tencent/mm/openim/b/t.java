package com.tencent.mm.openim.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.cd.h;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.openim.e.d;
import com.tencent.mm.openim.e.f;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.as;
import com.tencent.mm.protocal.protobuf.bha;
import com.tencent.mm.protocal.protobuf.bhb;
import com.tencent.mm.protocal.protobuf.dr;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.EllipsizeTextView;
import com.tencent.mm.ui.base.EllipsizeTextView.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class t
  implements com.tencent.mm.openim.a.b
{
  private HashMap<String, t.b> gfk;
  private EllipsizeTextView.a gfl;
  private EllipsizeTextView.a gfm;

  public t()
  {
    AppMethodBeat.i(78894);
    this.gfk = new HashMap();
    this.gfl = new t.1(this);
    this.gfm = new t.2(this);
    com.tencent.mm.a.e.cw(anx());
    com.tencent.mm.openim.e.c localc = new com.tencent.mm.openim.e.c();
    localc.field_appid = "3552365301";
    localc.field_language = aa.gw(ah.getContext());
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid", "language" });
    if (localc.xDa == -1L)
    {
      vl("3552365301");
      AppMethodBeat.o(78894);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(78894);
    }
  }

  private static String a(String paramString1, String paramString2, b.a parama, String paramString3)
  {
    AppMethodBeat.i(78906);
    com.tencent.mm.openim.e.a locala = new com.tencent.mm.openim.e.a();
    locala.field_acctTypeId = paramString1;
    locala.field_language = paramString3;
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAccTypeInfoStg().b(locala, new String[] { "acctTypeId", "language" });
    if (locala.xDa == -1L)
    {
      AppMethodBeat.o(78906);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      if (parama == b.a.geR)
      {
        paramString1 = locala.field_accTypeRec.vCr.iterator();
        while (true)
          if (paramString1.hasNext())
          {
            parama = (bhb)paramString1.next();
            if (paramString2.equals(parama.key))
            {
              paramString1 = parama.cEh;
              AppMethodBeat.o(78906);
              break;
            }
          }
        AppMethodBeat.o(78906);
        paramString1 = null;
      }
      else
      {
        paramString1 = locala.field_accTypeRec.ckO.iterator();
        while (true)
          if (paramString1.hasNext())
          {
            parama = (bha)paramString1.next();
            if (paramString2.equals(parama.key))
            {
              paramString1 = parama.url;
              AppMethodBeat.o(78906);
              break;
            }
          }
        AppMethodBeat.o(78906);
        paramString1 = null;
      }
    }
  }

  public static String anx()
  {
    AppMethodBeat.i(78895);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = com.tencent.mm.kernel.g.RP().eJM + "openim/";
    AppMethodBeat.o(78895);
    return localObject;
  }

  private String b(String paramString1, String paramString2, b.a parama, String paramString3)
  {
    AppMethodBeat.i(78908);
    com.tencent.mm.openim.e.c localc = new com.tencent.mm.openim.e.c();
    localc.field_appid = paramString1;
    localc.field_language = paramString3;
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid", "language" });
    if (localc.xDa == -1L)
    {
      bb(paramString1, paramString3);
      AppMethodBeat.o(78908);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      if (parama == b.a.geR)
      {
        paramString1 = localc.field_appRec.vCr.iterator();
        while (true)
          if (paramString1.hasNext())
          {
            parama = (bhb)paramString1.next();
            if (paramString2.equals(parama.key))
            {
              paramString1 = parama.cEh;
              AppMethodBeat.o(78908);
              break;
            }
          }
        AppMethodBeat.o(78908);
        paramString1 = null;
      }
      else
      {
        paramString1 = localc.field_appRec.ckO.iterator();
        while (true)
          if (paramString1.hasNext())
          {
            parama = (bha)paramString1.next();
            if (paramString2.equals(parama.key))
            {
              paramString1 = parama.url;
              AppMethodBeat.o(78908);
              break;
            }
          }
        AppMethodBeat.o(78908);
        paramString1 = null;
      }
    }
  }

  private void bb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78913);
    u(paramString1, paramString2, "");
    AppMethodBeat.o(78913);
  }

  private String v(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78911);
    com.tencent.mm.openim.e.e locale = new com.tencent.mm.openim.e.e();
    locale.field_appid = paramString1;
    locale.field_language = paramString3;
    locale.field_wordingId = paramString2;
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getWordingInfoStg().b(locale, new String[] { "appid", "language", "wordingId" });
    if (locale.xDa == -1L)
    {
      u(paramString1, paramString3, paramString2);
      paramString1 = null;
      AppMethodBeat.o(78911);
    }
    while (true)
    {
      return paramString1;
      paramString1 = locale.field_wording;
      AppMethodBeat.o(78911);
    }
  }

  private void vl(String paramString)
  {
    AppMethodBeat.i(78912);
    bb(paramString, aa.gw(ah.getContext()));
    AppMethodBeat.o(78912);
  }

  public final CharSequence a(Context paramContext, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(78897);
    Object localObject = paramCharSequence;
    if (bo.ac(paramCharSequence))
      localObject = "";
    paramCharSequence = new SpannableStringBuilder((CharSequence)localObject);
    paramCharSequence.append(" ");
    paramContext = paramContext.getResources().getDrawable(2131231778);
    paramContext.setBounds(0, 0, paramContext.getIntrinsicWidth(), paramContext.getIntrinsicHeight());
    paramCharSequence.setSpan(new ImageSpan(paramContext), ((CharSequence)localObject).length(), ((CharSequence)localObject).length() + 1, 33);
    AppMethodBeat.o(78897);
    return paramCharSequence;
  }

  public final CharSequence a(Context paramContext, String paramString1, String paramString2, float paramFloat)
  {
    AppMethodBeat.i(78901);
    paramString1 = vh(paramString1);
    if (paramString1 != null)
    {
      paramString2 = j.b(paramContext, "  ".concat(String.valueOf(paramString2)), paramFloat);
      int i = (int)(com.tencent.mm.bz.a.fromDPToPix(paramContext, 2) + paramFloat);
      paramContext = new ImageSpan(ah.getContext(), paramString1);
      paramContext.getDrawable().setBounds(0, 0, i, i);
      paramString2.setSpan(paramContext, 0, 1, 33);
      AppMethodBeat.o(78901);
    }
    while (true)
    {
      return paramString2;
      AppMethodBeat.o(78901);
    }
  }

  public final String a(String paramString1, String paramString2, b.a parama)
  {
    AppMethodBeat.i(78904);
    com.tencent.mm.openim.e.c localc = new com.tencent.mm.openim.e.c();
    localc.field_appid = paramString1;
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid" });
    if (localc.xDa == -1L)
    {
      vl(paramString1);
      paramString1 = null;
      AppMethodBeat.o(78904);
    }
    while (true)
    {
      return paramString1;
      String str = a(localc.field_acctTypeId, paramString2, parama, aa.gw(ah.getContext()));
      paramString1 = str;
      if (str == null)
        paramString1 = a(localc.field_acctTypeId, paramString2, parama, "en");
      AppMethodBeat.o(78904);
    }
  }

  public final void a(Context paramContext, TextView paramTextView, CharSequence paramCharSequence)
  {
    AppMethodBeat.i(78900);
    if ((paramTextView instanceof EllipsizeTextView))
    {
      paramContext = (EllipsizeTextView)paramTextView;
      paramContext.setLayoutCallback(this.gfm);
      paramContext.a(paramCharSequence, " ", -1, (int)paramTextView.getTextSize());
      AppMethodBeat.o(78900);
    }
    while (true)
    {
      return;
      paramTextView.setText(((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).a(paramContext, paramCharSequence));
      AppMethodBeat.o(78900);
    }
  }

  public final void a(Context paramContext, TextView paramTextView, CharSequence paramCharSequence, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(78899);
    if ((paramTextView instanceof EllipsizeTextView))
    {
      EllipsizeTextView localEllipsizeTextView = (EllipsizeTextView)paramTextView;
      paramTextView = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).ba(paramString1, paramString2);
      if (!bo.isNullOrNil(paramTextView))
      {
        paramContext = paramTextView;
        if (!"3552365301".equals(paramString1));
      }
      for (paramContext = " @".concat(String.valueOf(paramTextView)); ; paramContext = "")
      {
        localEllipsizeTextView.setLayoutCallback(this.gfl);
        localEllipsizeTextView.a(paramCharSequence, paramContext, 2131690328, paramInt);
        AppMethodBeat.o(78899);
        return;
      }
    }
    paramString2 = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).ba(paramString1, paramString2);
    if (!bo.isNullOrNil(paramString2))
      if (!"3552365301".equals(paramString1))
        break label254;
    label254: for (paramString1 = " @".concat(String.valueOf(paramString2)); ; paramString1 = paramString2)
    {
      paramString2 = j.b(paramContext, paramCharSequence, paramInt);
      paramCharSequence = new SpannableStringBuilder();
      paramCharSequence.append(paramString2);
      paramString2 = new SpannableString(paramString1);
      paramContext = com.tencent.mm.bz.a.h(paramContext, 2131690328);
      paramString2.setSpan(new TextAppearanceSpan(null, 0, paramInt, paramContext, paramContext), 0, paramString1.length(), 33);
      paramCharSequence.append(paramString2);
      for (paramContext = paramCharSequence; ; paramContext = j.b(paramContext, paramCharSequence, paramInt))
      {
        paramTextView.setText(paramContext);
        AppMethodBeat.o(78899);
        break;
      }
    }
  }

  public final void aZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78915);
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = new com.tencent.mm.openim.e.c();
    ((com.tencent.mm.openim.e.c)localObject).field_appid = paramString1;
    ((com.tencent.mm.openim.e.c)localObject).field_language = aa.gw(ah.getContext());
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().b((com.tencent.mm.sdk.e.c)localObject, new String[] { "appid", "language" });
    localStringBuffer.append(String.format("openIMAppIdinfo.field_updateTime %s | ", new Object[] { Long.valueOf(((com.tencent.mm.openim.e.c)localObject).field_updateTime) }));
    if ((((com.tencent.mm.openim.e.c)localObject).xDa == -1L) || (bo.fp(((com.tencent.mm.openim.e.c)localObject).field_updateTime) > 172800L));
    for (boolean bool1 = true; ; bool1 = false)
    {
      boolean bool2 = bool1;
      if (!bool1)
      {
        bool2 = bool1;
        if (!bo.isNullOrNil(paramString2))
        {
          localObject = new com.tencent.mm.openim.e.e();
          ((com.tencent.mm.openim.e.e)localObject).field_appid = paramString1;
          ((com.tencent.mm.openim.e.e)localObject).field_language = aa.gw(ah.getContext());
          ((com.tencent.mm.openim.e.e)localObject).field_wordingId = paramString2;
          com.tencent.mm.kernel.g.RQ();
          ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getWordingInfoStg().b((com.tencent.mm.sdk.e.c)localObject, new String[] { "appid", "language", "wordingId" });
          if ((((com.tencent.mm.openim.e.e)localObject).xDa != -1L) && (bo.fp(((com.tencent.mm.openim.e.e)localObject).field_updateTime) <= 172800L))
            break label343;
          bool1 = true;
        }
      }
      label343: 
      while (true)
      {
        localStringBuffer.append(String.format("wordingInfo.field_updateTime %s | ", new Object[] { Long.valueOf(((com.tencent.mm.openim.e.e)localObject).field_updateTime) }));
        bool2 = bool1;
        ab.i("MicroMsg.Openim.OpenImResourceMgr", "checkRecUpdate openimAppId %s wordingId %s needUpdate %s logBuffer: %s", new Object[] { paramString1, paramString2, Boolean.valueOf(bool2), localStringBuffer.toString() });
        if (bool2)
          u(paramString1, aa.gw(ah.getContext()), paramString2);
        AppMethodBeat.o(78915);
        return;
      }
    }
  }

  public final void anw()
  {
    AppMethodBeat.i(78910);
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().fni.delete("OpenIMAppIdInfo", null, null);
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAccTypeInfoStg().fni.delete("OpenIMAccTypeInfo", null, null);
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getWordingInfoStg().fni.delete("OpenIMWordingInfo", null, null);
    AppMethodBeat.o(78910);
  }

  public final String b(String paramString1, String paramString2, b.a parama)
  {
    AppMethodBeat.i(78905);
    String str1 = a(paramString1, paramString2, parama, aa.gw(ah.getContext()));
    String str2 = str1;
    if (str1 == null)
      str2 = a(paramString1, paramString2, parama, "en");
    AppMethodBeat.o(78905);
    return str2;
  }

  public final String ba(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78909);
    String str1 = v(paramString1, paramString2, aa.gw(ah.getContext()));
    String str2 = str1;
    if (str1 == null)
      str2 = v(paramString1, paramString2, "en");
    AppMethodBeat.o(78909);
    return str2;
  }

  public final String c(String paramString1, String paramString2, b.a parama)
  {
    AppMethodBeat.i(78907);
    String str1 = b(paramString1, paramString2, parama, aa.gw(ah.getContext()));
    String str2 = str1;
    if (str1 == null)
      str2 = b(paramString1, paramString2, parama, "en");
    AppMethodBeat.o(78907);
    return str2;
  }

  public final SpannableString e(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(78898);
    paramContext = j.b(paramContext, paramString, paramInt);
    AppMethodBeat.o(78898);
    return paramContext;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78896);
    if (paramm.getType() != 453)
      AppMethodBeat.o(78896);
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        AppMethodBeat.o(78896);
      }
      else
      {
        paramm = (i)paramm;
        paramString = (t.b)this.gfk.get(paramm.gfc + paramm.aOt);
        if (!paramString.gfp.isEmpty())
        {
          while ((paramString.gfq.size() < 10) && (!paramString.gfp.isEmpty()))
            paramString.gfq.add(paramString.gfp.removeFirst());
          com.tencent.mm.kernel.g.RO().eJo.a(new i(paramm.gfc, paramm.aOt, paramString.gfq), 0);
          AppMethodBeat.o(78896);
        }
        else
        {
          this.gfk.remove(paramm.gfc + paramm.aOt);
          AppMethodBeat.o(78896);
        }
      }
    }
  }

  public final void u(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(78914);
    ab.i("MicroMsg.Openim.OpenImResourceMgr", "try checkDoSceneGetRec openimAppId %s language %s wordingid %s", new Object[] { paramString1, paramString2, paramString3 });
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(78914);
    while (true)
    {
      return;
      if (!this.gfk.containsKey(paramString1 + paramString2))
      {
        t.b localb = new t.b(this, (byte)0);
        if (!bo.isNullOrNil(paramString3))
          localb.gfq.add(paramString3);
        this.gfk.put(paramString1 + paramString2, localb);
        com.tencent.mm.kernel.g.RO().eJo.a(new i(paramString1, paramString2, localb.gfq), 0);
      }
      if (bo.isNullOrNil(paramString3))
      {
        AppMethodBeat.o(78914);
      }
      else
      {
        paramString1 = (t.b)this.gfk.get(paramString1 + paramString2);
        if ((paramString1.gfp.contains(paramString3)) || (paramString1.gfq.contains(paramString3)))
        {
          AppMethodBeat.o(78914);
        }
        else
        {
          paramString1.gfp.add(paramString3);
          AppMethodBeat.o(78914);
        }
      }
    }
  }

  public final Bitmap vh(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(78902);
    t.a locala = new t.a(this, (byte)0);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(78902);
      paramString = (String)localObject;
    }
    while (true)
    {
      return paramString;
      localObject = new c.a();
      ((c.a)localObject).ePH = true;
      ((c.a)localObject).ePJ = (anx() + com.tencent.mm.a.g.x(paramString.getBytes()));
      localObject = ((c.a)localObject).ahG();
      o.ahp().a(paramString, null, (com.tencent.mm.at.a.a.c)localObject, new t.3(this, locala));
      paramString = locala.bitmap;
      AppMethodBeat.o(78902);
    }
  }

  public final int vi(String paramString)
  {
    AppMethodBeat.i(78903);
    com.tencent.mm.openim.e.c localc = new com.tencent.mm.openim.e.c();
    localc.field_appid = paramString;
    com.tencent.mm.kernel.g.RQ();
    ((PluginOpenIM)com.tencent.mm.kernel.g.M(PluginOpenIM.class)).getAppIdInfoStg().b(localc, new String[] { "appid" });
    int i;
    if (localc.xDa == -1L)
    {
      vl(paramString);
      AppMethodBeat.o(78903);
      i = 0;
    }
    while (true)
    {
      return i;
      i = localc.field_appRec.vFv;
      AppMethodBeat.o(78903);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.t
 * JD-Core Version:    0.6.2
 */