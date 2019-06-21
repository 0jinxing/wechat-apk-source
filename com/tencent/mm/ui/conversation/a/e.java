package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.b.d;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.be;
import com.tencent.mm.model.be.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class e
{
  public static com.tencent.mm.pluginsdk.ui.b.a a(Context paramContext, e.a parama, Object[] paramArrayOfObject)
  {
    Object localObject = null;
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(34649);
    String str1;
    label125: String str2;
    switch (e.1.zvV[parama.ordinal()])
    {
    default:
      parama = localObject;
    case 1:
    case 2:
      label215: 
      do
      {
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(34649);
              return parama;
              parama = localObject;
            }
            while (paramArrayOfObject == null);
            parama = localObject;
          }
          while (paramArrayOfObject.length != 2);
          if (paramArrayOfObject[0] != null)
          {
            str1 = paramArrayOfObject[0].toString();
            if (paramArrayOfObject[1] == null)
              break label215;
          }
          for (paramArrayOfObject = paramArrayOfObject[1].toString(); ; paramArrayOfObject = null)
          {
            if (aw.ZK().Yk() == null)
              ab.w("MicroMsg.BannerFactory", "recommend banner stg is null. this may be caused by account async init.");
            parama = localObject;
            if (aw.ZK().Yk() == null)
              break;
            if (!aw.ZK().Yk().oV(str1))
            {
              parama = localObject;
              if (!aw.ZK().Yk().oV(paramArrayOfObject))
                break;
            }
            parama = new f(paramContext, str1, paramArrayOfObject);
            break;
            str1 = null;
            break label125;
          }
          parama = localObject;
        }
        while (paramArrayOfObject == null);
        parama = localObject;
      }
      while (paramArrayOfObject.length != 3);
      if (paramArrayOfObject[0] != null)
      {
        str1 = paramArrayOfObject[0].toString();
        label248: if (paramArrayOfObject[1] == null)
          break label357;
        str2 = paramArrayOfObject[1].toString();
        label262: if ((paramArrayOfObject[2] == null) || (!(paramArrayOfObject[2] instanceof Boolean)))
          break label799;
      }
      break;
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    }
    label799: for (bool2 = ((Boolean)paramArrayOfObject[2]).booleanValue(); ; bool2 = false)
    {
      if ((!aw.RK()) || (aw.ZK().Yl() == null) || (!aw.ZK().Yl().oV(str1)))
      {
        parama = localObject;
        if (!aw.ZK().Yl().oV(str2))
          break;
      }
      parama = new g(paramContext, str1, str2, bool2);
      break;
      str1 = null;
      break label248;
      label357: str2 = null;
      break label262;
      parama = new o(paramContext);
      break;
      parama = new p(paramContext);
      break;
      parama = new i(paramContext);
      break;
      parama = new h(paramContext);
      break;
      parama = new a(paramContext);
      break;
      be.ZV();
      paramArrayOfObject = be.ZW();
      parama = localObject;
      if (paramArrayOfObject == null)
        break;
      parama = new l(paramContext, paramArrayOfObject);
      break;
      paramArrayOfObject = com.tencent.mm.model.a.g.aaK().oP("4");
      parama = localObject;
      if (paramArrayOfObject == null)
        break;
      paramArrayOfObject = paramArrayOfObject.value;
      parama = localObject;
      if (bo.isNullOrNil(paramArrayOfObject))
        break;
      parama = localObject;
      if (paramArrayOfObject.equals("0"))
        break;
      if (paramArrayOfObject.equals("1"))
      {
        aw.ZK();
        parama = com.tencent.mm.model.c.Ry().get(328195, Boolean.FALSE);
        if ((parama instanceof Boolean))
          bool2 = ((Boolean)parama).booleanValue();
        if (!bool2)
        {
          be.ZV();
          parama = be.ZY();
          if ((parama == be.a.fmg) || (parama == be.a.fmh))
          {
            ab.i("MicroMsg.BannerFactory", "already Bind the Mobile");
            parama = localObject;
            break;
          }
          parama = new l(paramContext, new bd(1, 1, ""));
          com.tencent.mm.model.a.f.oT("4");
          break;
        }
        ab.i("MicroMsg.BannerFactory", "[cpan] banner type bind mobile has clicked.");
        parama = localObject;
        break;
      }
      parama = localObject;
      if (!paramArrayOfObject.equals("2"))
        break;
      aw.ZK();
      parama = com.tencent.mm.model.c.Ry().get(328196, Boolean.FALSE);
      bool2 = bool1;
      if ((parama instanceof Boolean))
        bool2 = ((Boolean)parama).booleanValue();
      if (!bool2)
      {
        be.ZV();
        if (be.ZY() == be.a.fmg)
        {
          ab.i("MicroMsg.BannerFactory", "already upload the Mobile");
          parama = localObject;
          break;
        }
        parama = new l(paramContext, new bd(2, 1, ""));
        com.tencent.mm.model.a.f.oT("4");
        break;
      }
      ab.i("MicroMsg.BannerFactory", "[cpan] banner type upload contact has clicked.");
      parama = localObject;
      break;
      parama = new m(paramContext);
      break;
      parama = new q(paramContext);
      break;
      parama = new k(paramContext);
      break;
      if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0));
      for (parama = (b.b)paramArrayOfObject[0]; ; parama = b.b.foh)
      {
        parama = new com.tencent.mm.ui.d.a(paramContext, parama);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.e
 * JD-Core Version:    0.6.2
 */