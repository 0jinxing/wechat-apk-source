package com.tencent.mm.ak;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

public final class a$a
{
  private static final f<Integer, a> emX;
  public String cEV;
  public String fyk;
  public String fyl;
  public String fym;
  public String fyn;
  public String fyo;
  public String fyp;
  public String fyq;
  public String fyr;
  public String fys;
  public String toUser;

  static
  {
    AppMethodBeat.i(16426);
    emX = new c(100);
    AppMethodBeat.o(16426);
  }

  public static final a rE(String paramString)
  {
    AppMethodBeat.i(16425);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.BrandQALogic", "empty xml to parse");
      AppMethodBeat.o(16425);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("<qamsg");
      Object localObject = paramString;
      if (i > 0)
        localObject = paramString.substring(i);
      i = ((String)localObject).hashCode();
      paramString = (a)emX.get(Integer.valueOf(i));
      if (paramString != null)
      {
        AppMethodBeat.o(16425);
      }
      else
      {
        localObject = br.z((String)localObject, "qamsg");
        if (localObject == null)
        {
          ab.e("MicroMsg.BrandQALogic", "parse msg failed");
          AppMethodBeat.o(16425);
          paramString = null;
        }
        else
        {
          try
          {
            paramString = new com/tencent/mm/ak/a$a;
            paramString.<init>();
            paramString.cEV = ((String)((Map)localObject).get(".qamsg.$fromUser"));
            paramString.fyk = ((String)((Map)localObject).get(".qamsg.$fromNickname"));
            paramString.toUser = ((String)((Map)localObject).get(".qamsg.$title"));
            paramString.fyl = ((String)((Map)localObject).get(".qamsg.question.$id"));
            paramString.fym = ((String)((Map)localObject).get(".qamsg.question.$fromUser"));
            paramString.fyn = ((String)((Map)localObject).get(".qamsg.question.content"));
            paramString.fyo = ((String)((Map)localObject).get(".qamsg.answer.$id"));
            paramString.fyp = ((String)((Map)localObject).get(".qamsg.answer.$fromUser"));
            paramString.fyq = ((String)((Map)localObject).get(".qamsg.answer.content"));
            paramString.fyo = ((String)((Map)localObject).get(".qamsg.answer1.$id"));
            paramString.fyr = ((String)((Map)localObject).get(".qamsg.answer1.$fromUser"));
            paramString.fys = ((String)((Map)localObject).get(".qamsg.answer1.content"));
            emX.k(Integer.valueOf(i), paramString);
            AppMethodBeat.o(16425);
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.BrandQALogic", "parse qamessage xml failed");
            ab.printErrStackTrace("MicroMsg.BrandQALogic", paramString, "", new Object[0]);
            AppMethodBeat.o(16425);
            paramString = null;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.a.a
 * JD-Core Version:    0.6.2
 */