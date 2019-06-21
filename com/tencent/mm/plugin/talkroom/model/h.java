package com.tencent.mm.plugin.talkroom.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class h
{
  private static final int sxv = a.sxv;

  public static String aU(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(25846);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(25846);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      aw.ZK();
      ad localad = c.XM().aoO(paramString);
      if (localad == null)
      {
        AppMethodBeat.o(25846);
        paramContext = localObject;
      }
      else if (t.kH(paramString))
      {
        if (bo.isNullOrNil(localad.field_nickname))
        {
          paramContext = paramContext.getString(2131304014);
          AppMethodBeat.o(25846);
        }
        else
        {
          paramContext = localad.Oi();
          AppMethodBeat.o(25846);
        }
      }
      else
      {
        paramContext = s.mJ(paramString);
        AppMethodBeat.o(25846);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.h
 * JD-Core Version:    0.6.2
 */