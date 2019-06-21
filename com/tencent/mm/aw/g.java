package com.tencent.mm.aw;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class g extends f
{
  public static e a(j.b paramb, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    e locale = null;
    AppMethodBeat.i(108011);
    if (paramb == null)
    {
      AppMethodBeat.o(108011);
      paramb = locale;
      return paramb;
    }
    locale = new e();
    locale.fJS = 0;
    locale.fJU = paramString1;
    locale.fJV = 0.0F;
    locale.fJY = "";
    locale.fJZ = paramString2;
    locale.fKe = paramString4;
    locale.fJT = 1;
    locale.fKd = null;
    locale.fJW = paramb.title;
    locale.fJX = paramb.description;
    locale.fKc = paramb.url;
    if (!bo.isNullOrNil(paramb.fgN));
    for (paramString1 = paramb.fgN; ; paramString1 = paramb.fgn)
    {
      locale.fKb = paramString1;
      locale.fKa = paramb.fgM;
      locale.fKh = paramb.appId;
      locale.fKf = paramString3;
      AppMethodBeat.o(108011);
      paramb = locale;
      break;
    }
  }

  public static e a(String paramString, TimeLineObject paramTimeLineObject, int paramInt)
  {
    String str = null;
    e locale = null;
    AppMethodBeat.i(108010);
    if ((paramTimeLineObject == null) || (paramTimeLineObject.xfI == null) || (paramTimeLineObject.xfI.wbK == null) || (paramTimeLineObject.xfI.wbK.size() <= 0))
    {
      AppMethodBeat.o(108010);
      paramString = locale;
    }
    while (true)
    {
      return paramString;
      bau localbau = (bau)paramTimeLineObject.xfI.wbK.get(0);
      if (localbau == null)
      {
        AppMethodBeat.o(108010);
        paramString = locale;
      }
      else
      {
        locale = new e();
        locale.fJS = paramInt;
        locale.fJU = paramTimeLineObject.Id;
        locale.fJV = 0.0F;
        locale.fJY = "";
        locale.fJZ = localbau.wEH;
        locale.fKe = null;
        locale.fJT = 1;
        locale.fKd = null;
        locale.fJW = localbau.Title;
        locale.fJX = localbau.Desc;
        if (paramTimeLineObject.xfI != null)
          str = paramTimeLineObject.xfI.Url;
        locale.fKc = str;
        locale.fKb = localbau.wEL;
        locale.fKa = localbau.Url;
        locale.fKi = localbau.wEI;
        locale.fKk = localbau.Id;
        locale.fKf = paramString;
        locale.fKh = paramTimeLineObject.xfH.Id;
        locale.fKo = paramTimeLineObject.jBB;
        AppMethodBeat.o(108010);
        paramString = locale;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aw.g
 * JD-Core Version:    0.6.2
 */