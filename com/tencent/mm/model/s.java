package com.tencent.mm.model;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class s
{
  private static Set<String> fkN;

  static
  {
    AppMethodBeat.i(136854);
    fkN = new HashSet();
    AppMethodBeat.o(136854);
  }

  public static String a(ad paramad, String paramString)
  {
    AppMethodBeat.i(138684);
    paramad = t.a(paramad, paramString);
    AppMethodBeat.o(138684);
    return paramad;
  }

  public static String a(ad paramad, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(136850);
    if (paramad == null)
      AppMethodBeat.o(136850);
    while (true)
    {
      return paramString;
      if ((paramBoolean) && (bo.isNullOrNil(paramad.field_nickname)))
      {
        paramString = ((c)g.K(c.class)).XV().mJ(paramString);
        AppMethodBeat.o(136850);
      }
      else if ((paramad.Oj() != null) && (paramad.Oj().length() > 0))
      {
        paramString = paramad.Oj();
        AppMethodBeat.o(136850);
      }
      else if ((bo.isNullOrNil(paramad.field_nickname)) && (t.nH(paramString)))
      {
        paramString = a.kN(paramString);
        AppMethodBeat.o(136850);
      }
      else
      {
        AppMethodBeat.o(136850);
      }
    }
  }

  public static String c(ad paramad)
  {
    AppMethodBeat.i(136851);
    Object localObject = mJ(paramad.field_username);
    if (t.kH(paramad.field_username))
      if (!((String)localObject).equals(paramad.field_username))
      {
        AppMethodBeat.o(136851);
        paramad = (ad)localObject;
      }
    while (true)
    {
      return paramad;
      localObject = ((c)g.K(c.class)).XV().oe(paramad.field_username);
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        paramad = new ArrayList();
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
          paramad.add(mJ((String)((Iterator)localObject).next()));
        paramad = "(" + bo.c(paramad, ", ") + ")";
        AppMethodBeat.o(136851);
      }
      else
      {
        paramad = ah.getResources().getString(2131296440);
        AppMethodBeat.o(136851);
        continue;
        AppMethodBeat.o(136851);
        paramad = (ad)localObject;
      }
    }
  }

  public static void c(Set<String> paramSet)
  {
    fkN = paramSet;
  }

  public static String getDisplayName(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136846);
    if (bo.isNullOrNil(paramString2))
    {
      paramString1 = mJ(paramString1);
      AppMethodBeat.o(136846);
    }
    while (true)
    {
      return paramString1;
      String str = mK(paramString1);
      if (!bo.isNullOrNil(str))
      {
        AppMethodBeat.o(136846);
        paramString1 = str;
      }
      else
      {
        paramString2 = n.ab(paramString1, paramString2);
        if (bo.isNullOrNil(paramString2))
        {
          paramString1 = mJ(paramString1);
          AppMethodBeat.o(136846);
        }
        else
        {
          AppMethodBeat.o(136846);
          paramString1 = paramString2;
        }
      }
    }
  }

  public static String mH(String paramString)
  {
    AppMethodBeat.i(136845);
    ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
    if (localad == null)
      AppMethodBeat.o(136845);
    while (true)
    {
      return paramString;
      if (!bo.isNullOrNil(localad.field_nickname))
      {
        paramString = localad.field_nickname;
        AppMethodBeat.o(136845);
      }
      else
      {
        AppMethodBeat.o(136845);
      }
    }
  }

  public static String mI(String paramString)
  {
    AppMethodBeat.i(136847);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = "";
      AppMethodBeat.o(136847);
    }
    while (true)
    {
      return paramString;
      ad localad = ((j)g.K(j.class)).XM().aoO(paramString);
      ab.d("MicroMsg.ContactCommDisplay", "username: %s", new Object[] { paramString });
      if (localad == null)
      {
        AppMethodBeat.o(136847);
      }
      else if ((t.kH(paramString)) && (bo.isNullOrNil(localad.field_nickname)))
      {
        String str = ((c)g.K(c.class)).XV().mJ(paramString);
        if (!bo.isNullOrNil(str))
        {
          AppMethodBeat.o(136847);
          paramString = str;
        }
      }
      else if ((localad.Oi() != null) && (localad.Oi().length() > 0))
      {
        paramString = localad.Oi();
        AppMethodBeat.o(136847);
      }
      else
      {
        AppMethodBeat.o(136847);
      }
    }
  }

  public static String mJ(String paramString)
  {
    AppMethodBeat.i(136848);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = "";
      AppMethodBeat.o(136848);
    }
    while (true)
    {
      return paramString;
      paramString = t.a(((j)g.K(j.class)).XM().aoO(paramString), paramString);
      AppMethodBeat.o(136848);
    }
  }

  public static String mK(String paramString)
  {
    AppMethodBeat.i(136852);
    paramString = ((j)g.K(j.class)).XM().aoO(paramString);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(136852);
    }
    while (true)
    {
      return paramString;
      if (!bo.isNullOrNil(paramString.field_conRemark))
      {
        paramString = paramString.field_conRemark;
        AppMethodBeat.o(136852);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(136852);
      }
    }
  }

  public static String mL(String paramString)
  {
    AppMethodBeat.i(136853);
    if (fkN.contains(paramString))
    {
      paramString = "";
      AppMethodBeat.o(136853);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(136853);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.s
 * JD-Core Version:    0.6.2
 */