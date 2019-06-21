package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.b.a;
import com.tencent.mm.plugin.fts.ui.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.List;

public final class r extends b
{
  private r.a mLp;

  public r(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(62036);
    this.mLp = new r.a(this);
    AppMethodBeat.o(62036);
  }

  private Pair<String, String> K(ad paramad)
  {
    AppMethodBeat.i(62038);
    c localc = new c();
    localc.vj(paramad.duw);
    int i = 0;
    label64: int k;
    if (i < localc.geU.size())
    {
      c.a locala = (c.a)localc.geU.get(i);
      Iterator localIterator = locala.geV.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          String str = ((c.b)localIterator.next()).vk(paramad.field_openImAppid);
          if (!bo.isNullOrNil(str))
          {
            String[] arrayOfString = this.mDz.mEa;
            int j = arrayOfString.length;
            k = 0;
            label118: if (k < j)
              if (str.contains(arrayOfString[k]))
              {
                paramad = new Pair(locala.title, str);
                AppMethodBeat.o(62038);
              }
          }
        }
    }
    while (true)
    {
      return paramad;
      k++;
      break label118;
      break label64;
      i++;
      break;
      paramad = null;
      AppMethodBeat.o(62038);
    }
  }

  public final a.b Ps()
  {
    return this.mLp;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62037);
    this.username = this.hpS.mDx;
    this.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.username);
    paramArrayOfObject = null;
    parama = null;
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    String str = com.tencent.mm.plugin.fts.a.d.LC(this.username);
    int j;
    switch (this.hpS.mDw)
    {
    default:
      j = 0;
      bool4 = bool5;
      bool1 = bool2;
      label385: if (i != 0)
      {
        this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        this.jMY = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMY, this.mDz, bool1, bool4, b.a.mHq, b.c.mHx)).mDR;
        if (j != 0)
        {
          this.jMZ = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, parama, com.tencent.mm.bz.a.al(paramContext, 2131427813));
          this.jMZ = f.a(com.tencent.mm.plugin.fts.a.a.d.a(this.jMZ, this.mDz, bool1, bool4, b.a.mHq, b.c.mHz)).mDR;
          this.jMZ = TextUtils.concat(new CharSequence[] { paramArrayOfObject, this.jMZ });
        }
        if (!ad.aox(this.ehM.field_username))
          break label953;
        this.mJU = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).ba(this.ehM.field_openImAppid, this.ehM.field_descWordingId);
        AppMethodBeat.o(62037);
      }
      break;
    case 3:
      label261: bool4 = true;
    case 7:
    case 6:
    case 5:
    case 4:
    case 15:
    case 16:
    case 18:
    case 17:
    case 11:
    case 51:
    case 2:
    case 1:
    }
    label389: for (bool3 = true; ; bool3 = false)
    {
      i = 1;
      j = 0;
      bool1 = bool3;
      break;
      bool3 = true;
      bool1 = true;
      bool4 = bool3;
      parama = this.ehM.field_nickname;
      paramArrayOfObject = paramContext.getString(2131302829);
      j = 1;
      break;
      parama = this.ehM.dul;
      paramArrayOfObject = paramContext.getString(2131302824);
      j = 1;
      bool1 = bool2;
      bool4 = bool5;
      break;
      paramArrayOfObject = this.ehM.Hq();
      parama = paramArrayOfObject;
      if (bo.isNullOrNil(paramArrayOfObject))
        parama = this.ehM.field_username;
      paramArrayOfObject = paramContext.getString(2131302833);
      j = 1;
      bool1 = bool2;
      bool4 = bool5;
      break;
      paramArrayOfObject = this.hpS.content;
      Object localObject;
      int k;
      if (!bo.isNullOrNil(paramArrayOfObject))
      {
        localObject = paramArrayOfObject.split("​");
        k = localObject.length;
        j = 0;
        label545: if (j < k)
        {
          parama = localObject[j];
          if (!parama.startsWith(this.mDz.mDY));
        }
      }
      while (true)
      {
        paramArrayOfObject = paramContext.getString(2131302828);
        j = 1;
        bool1 = bool2;
        bool4 = bool5;
        break;
        j++;
        break label545;
        parama = this.hpS.content;
        paramArrayOfObject = paramContext.getString(2131302830);
        j = 1;
        bool1 = bool2;
        bool4 = bool5;
        break;
        parama = this.hpS.content;
        paramArrayOfObject = paramContext.getString(2131302823);
        j = 1;
        bool1 = bool2;
        bool4 = bool5;
        break;
        List localList = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSMainDB().MX(this.ehM.field_contactLabelIds);
        StringBuffer localStringBuffer = new StringBuffer();
        for (parama : this.mDz.mEa)
        {
          Iterator localIterator = localList.iterator();
          while (localIterator.hasNext())
          {
            localObject = (String)localIterator.next();
            if (com.tencent.mm.plugin.fts.a.d.Nb((String)localObject).contains(parama))
            {
              localStringBuffer.append((String)localObject);
              localStringBuffer.append(",");
            }
          }
        }
        localStringBuffer.trimToSize();
        if (localStringBuffer.length() == 0);
        for (parama = ""; ; parama = localStringBuffer.substring(0, localStringBuffer.length() - 1))
        {
          paramArrayOfObject = paramContext.getString(2131302832);
          j = 1;
          bool1 = bool2;
          bool4 = bool5;
          break;
        }
        paramArrayOfObject = K(this.ehM);
        if (paramArrayOfObject != null)
        {
          parama = (String)paramArrayOfObject.second;
          paramArrayOfObject = (String)paramArrayOfObject.first + "：";
          j = 1;
          bool1 = bool2;
          bool4 = bool5;
          break;
        }
        j = 1;
        parama = "";
        paramArrayOfObject = "";
        bool1 = bool2;
        bool4 = bool5;
        break;
        this.jMY = com.tencent.mm.pluginsdk.ui.e.j.d(paramContext, str, com.tencent.mm.bz.a.al(paramContext, 2131427813));
        break label261;
        label953: this.mJU = "";
        AppMethodBeat.o(62037);
        break label385;
        parama = paramArrayOfObject;
      }
      bool4 = false;
      break label389;
      bool4 = false;
    }
  }

  public final String aAp()
  {
    AppMethodBeat.i(62039);
    String str;
    if ((this.ehM != null) && (ad.aox(this.ehM.field_username)))
    {
      str = "openim:" + this.ehM.field_openImAppid;
      AppMethodBeat.o(62039);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(62039);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.r
 * JD-Core Version:    0.6.2
 */