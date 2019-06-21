package com.tencent.tinker.lib.b;

import android.content.Context;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public class a
  implements b
{
  protected final Context context;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  public final int auh(String paramString)
  {
    int i = eI(paramString, SharePatchFileUtil.at(new File(paramString)));
    if (i == 0)
      TinkerPatchService.ce(this.context, paramString);
    while (true)
    {
      return i;
      com.tencent.tinker.lib.e.a.iX(this.context).ABE.d(new File(paramString), i);
    }
  }

  protected int eI(String paramString1, String paramString2)
  {
    com.tencent.tinker.lib.e.a locala = com.tencent.tinker.lib.e.a.iX(this.context);
    int i;
    if ((!ShareTinkerInternals.Se(locala.tinkerFlags)) || (!ShareTinkerInternals.jn(this.context)))
      i = -1;
    while (true)
    {
      return i;
      if (!SharePatchFileUtil.ap(new File(paramString1)))
      {
        i = -2;
      }
      else if (locala.ABI)
      {
        i = -4;
      }
      else if (com.tencent.tinker.lib.util.b.iZ(this.context))
      {
        i = -3;
      }
      else if (ShareTinkerInternals.dSq())
      {
        i = -5;
      }
      else
      {
        paramString1 = com.tencent.tinker.lib.e.a.iX(this.context);
        if (paramString1.ABK)
        {
          paramString1 = paramString1.ABJ;
          if ((paramString1 != null) && (!paramString1.ABR) && (paramString2.equals(paramString1.ABO)))
            i = -6;
        }
        else if (!com.tencent.tinker.lib.util.c.jc(this.context).auk(paramString2))
        {
          i = -7;
        }
        else
        {
          i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.b.a
 * JD-Core Version:    0.6.2
 */