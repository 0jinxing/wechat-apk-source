package com.tencent.mm.plugin.expt.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class b
{
  private static String TAG = "MicroMsg.ExptManager";
  private static b lOP;
  private f<Integer, a> lNH;
  private String name;

  protected b()
  {
    AppMethodBeat.i(93275);
    this.lNH = new com.tencent.mm.a.h(50);
    this.name = null;
    AppMethodBeat.o(93275);
  }

  private int Lb(String paramString)
  {
    int i = -1;
    AppMethodBeat.i(138273);
    as localas = brs();
    if (localas == null)
      AppMethodBeat.o(138273);
    while (true)
    {
      return i;
      i = localas.getInt(paramString, -1);
      AppMethodBeat.o(138273);
    }
  }

  private static void a(a parama, String paramString1, String paramString2)
  {
    AppMethodBeat.i(138275);
    e.pXa.e(15452, new Object[] { Integer.valueOf(parama.field_exptId), Integer.valueOf(parama.field_groupId), Integer.valueOf(parama.field_exptSeq), Long.valueOf(parama.field_startTime), Long.valueOf(parama.field_endTime), paramString1, paramString2 });
    AppMethodBeat.o(138275);
  }

  private String aZm()
  {
    AppMethodBeat.i(93278);
    String str = hashCode();
    AppMethodBeat.o(93278);
    return str;
  }

  public static b brr()
  {
    AppMethodBeat.i(93274);
    if (lOP == null)
      lOP = new b();
    b localb = lOP;
    AppMethodBeat.o(93274);
    return localb;
  }

  private a vc(int paramInt)
  {
    a locala = null;
    AppMethodBeat.i(138274);
    if (paramInt <= 0)
      AppMethodBeat.o(138274);
    Object localObject;
    while (true)
    {
      return locala;
      localObject = brs();
      if (localObject == null)
      {
        AppMethodBeat.o(138274);
      }
      else
      {
        localObject = ((as)localObject).getString(String.valueOf(paramInt), "");
        if (bo.isNullOrNil((String)localObject))
        {
          AppMethodBeat.o(138274);
        }
        else
        {
          locala = (a)this.lNH.get(Integer.valueOf(paramInt));
          if (locala == null)
            break label115;
          if (!bo.isEqual((String)localObject, locala.field_exptContent))
            break;
          AppMethodBeat.o(138274);
        }
      }
    }
    this.lNH.remove(Integer.valueOf(paramInt));
    label115: locala = new a();
    if (locala.La((String)localObject))
      this.lNH.put(Integer.valueOf(paramInt), locala);
    while (true)
    {
      AppMethodBeat.o(138274);
      break;
      locala = null;
    }
  }

  public final String b(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(93277);
    int i = Lb(paramString1);
    String str;
    if (i > 0)
    {
      a locala = vc(i);
      if ((locala != null) && (locala.isReady()))
      {
        localObject = locala.brq();
        if ((localObject != null) && (!((HashMap)localObject).isEmpty()))
        {
          str = (String)((HashMap)localObject).get(paramString1);
          localObject = str;
          if (paramBoolean1)
            a(locala, paramString1, str);
        }
      }
    }
    for (Object localObject = str; ; localObject = paramString2)
    {
      if (paramBoolean2)
        ab.i(TAG, "%s get mulit expt result[%s] key[%s] def[%s]", new Object[] { aZm(), localObject, paramString1, paramString2 });
      AppMethodBeat.o(93277);
      return localObject;
    }
  }

  public final as brs()
  {
    AppMethodBeat.i(93276);
    int i = ah.getContext().getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.util.h.Mu()).getInt("default_uin", 0);
    Object localObject;
    if (i == 0)
    {
      localObject = null;
      AppMethodBeat.o(93276);
    }
    while (true)
    {
      return localObject;
      localObject = i + "_WxExptmmkv";
      if (!bo.isEqual(this.name, (String)localObject))
      {
        ab.i(TAG, "%s get mmkv change uin old[%s] new[%s]", new Object[] { aZm(), this.name, localObject });
        this.name = ((String)localObject);
      }
      localObject = as.amF(this.name);
      AppMethodBeat.o(93276);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.d.b
 * JD-Core Version:    0.6.2
 */