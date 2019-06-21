package com.tencent.mm.plugin.fav.ui.detail;

import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class a
{
  public static void a(MMActivity paramMMActivity, g paramg)
  {
    AppMethodBeat.i(74456);
    Object localObject;
    if ((14 == paramg.field_type) && (!bo.isNullOrNil(paramg.field_favProto.title)))
      localObject = paramg.field_favProto.title;
    while (true)
    {
      paramg = DateFormat.format("yyyy/M/d", paramg.field_updateTime);
      paramMMActivity.setMMSubTitle(String.format(paramMMActivity.getString(2131299597), new Object[] { localObject, paramg }));
      AppMethodBeat.o(74456);
      return;
      abl localabl = paramg.field_favProto.wit;
      if ((localabl != null) && (!bo.isNullOrNil(localabl.whU)))
      {
        String str1 = b.LC(localabl.whU);
        String str2;
        if (r.Yz().equals(localabl.cEV))
        {
          str2 = b.mK(localabl.toUser);
          localObject = str1;
          if (!bo.bc(str2, "").equals(localabl.toUser))
            localObject = str1 + " - " + str2;
        }
        else
        {
          str2 = b.mK(localabl.cEV);
          localObject = str1;
          if (!bo.bc(str2, "").equals(localabl.cEV))
            localObject = str1 + " - " + str2;
        }
      }
      else
      {
        localObject = b.mK(paramg.field_fromUser);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.a
 * JD-Core Version:    0.6.2
 */