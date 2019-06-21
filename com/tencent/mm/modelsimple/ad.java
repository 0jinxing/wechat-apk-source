package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.l;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ad
{
  private static f ehi = null;
  private static boolean fPO = false;
  private static int fPP = 3;
  private static long fPQ = 0L;

  public static void run()
  {
    AppMethodBeat.i(108300);
    if (fPO)
    {
      ab.i("MicroMsg.PostTaskUploadHDHeadImg", "is uploading hdHeadImg now!");
      AppMethodBeat.o(108300);
    }
    while (true)
    {
      return;
      if ((fPQ == 0L) || (bo.az(fPQ) > 180000L))
      {
        fPQ = bo.yz();
        fPP = 3;
      }
      if (fPP <= 0)
      {
        ab.i("MicroMsg.PostTaskUploadHDHeadImg", "frequency limit");
        AppMethodBeat.o(108300);
      }
      else
      {
        fPP -= 1;
        Object localObject = com.tencent.mm.compatible.util.e.euY + "temp.avatar.hd";
        if (!com.tencent.mm.vfs.e.ct((String)localObject))
        {
          ab.d("MicroMsg.PostTaskUploadHDHeadImg", "has uploaded HDHeadImg and delete it");
          AppMethodBeat.o(108300);
        }
        else
        {
          if (ehi == null)
            ehi = new ad.1((String)localObject);
          g.Rg().a(157, ehi);
          localObject = new l((String)localObject);
          g.Rg().a((m)localObject, 0);
          fPO = true;
          AppMethodBeat.o(108300);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ad
 * JD-Core Version:    0.6.2
 */