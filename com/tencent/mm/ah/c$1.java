package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements Runnable
{
  c$1(c paramc, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(77850);
    if (bo.isNullOrNil(this.eiH))
      AppMethodBeat.o(77850);
    while (true)
    {
      return;
      if (this.eiH.equals(this.frl.fri))
      {
        AppMethodBeat.o(77850);
      }
      else
      {
        Object localObject = c.ace();
        if (localObject == null)
        {
          AppMethodBeat.o(77850);
        }
        else
        {
          localObject = ((i)localObject).qo(this.eiH);
          if ((localObject == null) || (!((h)localObject).getUsername().equals(this.eiH)))
          {
            AppMethodBeat.o(77850);
          }
          else
          {
            if (bo.anT() - ((h)localObject).frY * 60L > 86400L);
            for (int i = 1; ; i = 0)
            {
              if (i != 0)
                break label136;
              AppMethodBeat.o(77850);
              break;
            }
            label136: if (bo.isNullOrNil(((h)localObject).acl()))
            {
              ab.w("MicroMsg.AvatarService", "dkhurl user has no url [%s]", new Object[] { this.eiH });
              AppMethodBeat.o(77850);
            }
            else if (c.acd() == null)
            {
              AppMethodBeat.o(77850);
            }
            else
            {
              d.E(this.eiH, false);
              d.E(this.eiH, true);
              this.frl.pZ(this.eiH);
              AppMethodBeat.o(77850);
            }
          }
        }
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(77851);
    String str = super.toString() + "|checkAvatarExpire";
    AppMethodBeat.o(77851);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c.1
 * JD-Core Version:    0.6.2
 */