package com.tencent.mm.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.d.a;
import com.tencent.mm.ai.d.b;
import com.tencent.mm.ai.e;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.api.f;
import com.tencent.mm.api.l;
import com.tencent.mm.model.cb;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.mk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ba;

public final class a
  implements l
{
  private static cm b(cm paramcm)
  {
    boolean bool = true;
    AppMethodBeat.i(35445);
    if (paramcm == null)
    {
      paramcm = null;
      AppMethodBeat.o(35445);
      return paramcm;
    }
    Object localObject = paramcm.vEB;
    int i = paramcm.nao;
    if (paramcm.vED == null);
    while (true)
    {
      ab.i("FunctionMsg.FunctionMsgDispatcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", new Object[] { localObject, Integer.valueOf(i), Boolean.valueOf(bool) });
      localObject = bo.nullAsNil(aa.a(paramcm.vEB));
      if ("readerapp".equals(localObject))
      {
        paramcm.vEB = aa.vy("newsapp");
        paramcm.nao = 12399999;
      }
      if (("blogapp".equals(localObject)) || ("newsapp".equals(localObject)))
        paramcm.nao = 12399999;
      AppMethodBeat.o(35445);
      break;
      bool = false;
    }
  }

  public final void a(String paramString, f paramf, cm paramcm)
  {
    boolean bool1 = false;
    AppMethodBeat.i(35446);
    boolean bool2;
    if ((paramf == null) || (paramcm == null))
      if (paramf == null)
      {
        bool2 = true;
        if (paramcm == null)
          bool1 = true;
        ab.e("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] null == item?%s null == addMsg?%s MsgType:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1), Integer.valueOf(paramcm.nao) });
        AppMethodBeat.o(35446);
      }
    while (true)
    {
      return;
      bool2 = false;
      break;
      b(paramcm);
      ab.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] item:%s", new Object[] { paramf });
      try
      {
        d.b localb = new com/tencent/mm/ai/d$b;
        localb.<init>();
        localb.fsS = paramf.field_businessInfo;
        localb.fsT = paramf.field_functionmsgid;
        if (paramf.field_actionTime == 0L);
        for (long l = cb.aaD() / 1000L; ; l = paramf.field_actionTime)
        {
          paramcm.pcX = ((int)l);
          paramf.field_status = 100;
          paramf.a(paramcm);
          ba localba = ba.xZa;
          ba.a(paramString, paramf);
          paramString = e.d.bg(Integer.valueOf(paramcm.nao));
          paramf = new com/tencent/mm/ai/e$a;
          paramf.<init>(paramcm, localb);
          paramString.b(paramf);
          AppMethodBeat.o(35446);
          break;
        }
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", paramString, "", new Object[0]);
        AppMethodBeat.o(35446);
      }
    }
  }

  public final void b(mk parammk)
  {
    AppMethodBeat.i(35448);
    try
    {
      new d.b();
      d.a.bf(Long.valueOf(parammk.vQj));
      AppMethodBeat.o(35448);
      return;
    }
    catch (Exception parammk)
    {
      while (true)
      {
        ab.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", parammk, "", new Object[0]);
        AppMethodBeat.o(35448);
      }
    }
  }

  public final void b(String paramString, f paramf, cm paramcm)
  {
    AppMethodBeat.i(35447);
    ab.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgDelete] item:%s", new Object[] { paramf });
    try
    {
      b(paramcm);
      paramcm.pcX = ((int)paramf.field_actionTime);
      paramf.a(paramcm);
      paramf.field_status = 100;
      Object localObject = ba.xZa;
      ba.a(paramString, paramf);
      paramf = e.d.bg(Integer.valueOf(paramcm.nao));
      localObject = new com/tencent/mm/ai/e$c;
      ((e.c)localObject).<init>(paramcm, paramString);
      paramf.a((e.c)localObject);
      AppMethodBeat.o(35447);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", paramString, "", new Object[0]);
        AppMethodBeat.o(35447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.s.a
 * JD-Core Version:    0.6.2
 */