package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.modelgeo.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import java.util.Set;

public final class a$a
{
  Set<Long> nJC;
  private c.a nJD;

  public a$a()
  {
    AppMethodBeat.i(113300);
    this.nJD = new a.a.1(this);
    AppMethodBeat.o(113300);
  }

  public final String[] W(bi parambi)
  {
    int i = 1;
    AppMethodBeat.i(113302);
    String[] arrayOfString = new String[2];
    Object localObject1 = parambi.field_content;
    if (bo.isNullOrNil((String)localObject1))
    {
      arrayOfString[0] = "";
      arrayOfString[1] = "";
      AppMethodBeat.o(113302);
      return arrayOfString;
    }
    label53: Object localObject2;
    label161: long l;
    if (parambi.field_isSend == 0)
    {
      j = 1;
      localObject2 = localObject1;
      if (t.kH(parambi.field_talker))
      {
        localObject2 = localObject1;
        if (j != 0)
        {
          j = bf.ox((String)localObject1);
          localObject2 = localObject1;
          if (j != -1)
            localObject2 = ((String)localObject1).substring(j + 1).trim();
        }
      }
      localObject1 = ((j)g.K(j.class)).bOr().Ro((String)localObject2);
      if (!((bi.b)localObject1).dua())
        break label350;
      localObject2 = ((bi.b)localObject1).label;
      localObject1 = ((bi.b)localObject1).eUu;
      arrayOfString[0] = localObject2;
      arrayOfString[1] = localObject1;
      if ((bo.isNullOrNil(arrayOfString[0])) && (bo.isNullOrNil(arrayOfString[1])))
      {
        ab.i("MicroMsg.LocationServer", "pull from sever");
        l = parambi.field_msgId;
        if ((this.nJC != null) && (!this.nJC.contains(Long.valueOf(l))))
        {
          localObject1 = parambi.field_content;
          if (parambi.field_isSend != 0)
            break label366;
        }
      }
    }
    label350: label366: for (int j = i; ; j = 0)
    {
      localObject2 = localObject1;
      if (t.kH(parambi.field_talker))
      {
        localObject2 = localObject1;
        if (j != 0)
        {
          j = bf.ox((String)localObject1);
          localObject2 = localObject1;
          if (j != -1)
            localObject2 = ((String)localObject1).substring(j + 1).trim();
        }
      }
      localObject2 = bi.b.apD((String)localObject2);
      this.nJC.add(Long.valueOf(l));
      c.agw().a(((bi.b)localObject2).nJu, ((bi.b)localObject2).nJv, this.nJD, Long.valueOf(parambi.field_msgId));
      AppMethodBeat.o(113302);
      break;
      j = 0;
      break label53;
      arrayOfString[0] = ((bi.b)localObject1).label;
      arrayOfString[1] = "";
      break label161;
    }
  }

  public final void bJq()
  {
    AppMethodBeat.i(113301);
    if (this.nJC != null)
      this.nJC.clear();
    c.agw().a(this.nJD);
    AppMethodBeat.o(113301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.a.a
 * JD-Core Version:    0.6.2
 */