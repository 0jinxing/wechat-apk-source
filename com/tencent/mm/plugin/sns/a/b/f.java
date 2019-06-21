package com.tencent.mm.plugin.sns.a.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.e;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class f
{
  private static String WW(String paramString)
  {
    AppMethodBeat.i(35715);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(35715);
    }
    while (true)
    {
      return paramString;
      paramString = Base64.decode(paramString, 0);
      cdg localcdg = new cdg();
      try
      {
        localcdg.parseFrom(paramString);
        paramString = p.a(localcdg.xcS);
        AppMethodBeat.o(35715);
      }
      catch (IOException paramString)
      {
        ab.e("SnsAdExtUtil", "", new Object[] { paramString });
        paramString = "";
        AppMethodBeat.o(35715);
      }
    }
  }

  public static String a(long paramLong, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35712);
    af.cnz();
    paramArrayOfObject = new StringBuilder(i.s(paramArrayOfObject));
    a(paramLong, paramArrayOfObject);
    paramArrayOfObject = paramArrayOfObject.toString();
    AppMethodBeat.o(35712);
    return paramArrayOfObject;
  }

  public static String a(TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(35714);
    if (paramTimeLineObject != null)
    {
      paramTimeLineObject = WW(paramTimeLineObject.rjC);
      AppMethodBeat.o(35714);
    }
    while (true)
    {
      return paramTimeLineObject;
      ab.v("SnsAdExtUtil", "getSnsStatExt timeLineObject null");
      paramTimeLineObject = null;
      AppMethodBeat.o(35714);
    }
  }

  public static void a(long paramLong, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(35713);
    Object localObject = af.cnI().ku(paramLong);
    if (localObject != null)
    {
      localObject = ((e)localObject).cqu();
      if (localObject != null)
      {
        p.a(((TimeLineObject)localObject).rjC, paramStringBuilder);
        AppMethodBeat.o(35713);
      }
    }
    while (true)
    {
      return;
      ab.v("SnsAdExtUtil", "l timeLineObject null, snsId %d", new Object[] { Long.valueOf(paramLong) });
      paramStringBuilder.append(",,");
      AppMethodBeat.o(35713);
      continue;
      ab.v("SnsAdExtUtil", "l snsInfo null, snsId %d", new Object[] { Long.valueOf(paramLong) });
      paramStringBuilder.append(",,");
      AppMethodBeat.o(35713);
    }
  }

  public static void a(String paramString, d paramd)
  {
    AppMethodBeat.i(35711);
    Object localObject = af.cnF().YS(paramString);
    if (localObject != null)
    {
      localObject = ((n)localObject).cqu();
      if (localObject != null)
      {
        p.a(((TimeLineObject)localObject).rjC, paramd);
        AppMethodBeat.o(35711);
      }
    }
    while (true)
    {
      return;
      ab.v("SnsAdExtUtil", "timeLineObject null, snsId %s", new Object[] { paramString });
      AppMethodBeat.o(35711);
      continue;
      ab.v("SnsAdExtUtil", "snsInfo null, snsId %s", new Object[] { paramString });
      AppMethodBeat.o(35711);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.f
 * JD-Core Version:    0.6.2
 */