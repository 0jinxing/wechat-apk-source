package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;

public final class h
{
  public static gu a(bi parambi, boolean paramBoolean1, String paramString, PLong paramPLong, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    AppMethodBeat.i(17467);
    if (parambi.field_msgSvrId == 0L)
    {
      ab.e("MicroMsg.BackupMsgLogic", "packedMsg msgSvrId is 0, talker[%s], type[%d]", new Object[] { parambi.field_talker, Integer.valueOf(parambi.getType()) });
      parambi = null;
      AppMethodBeat.o(17467);
    }
    while (true)
    {
      return parambi;
      int i = com.tencent.mm.pluginsdk.model.app.l.Kx(parambi.getType());
      if (!rr(i))
      {
        ab.e("MicroMsg.BackupMsgLogic", "packedMsg type is not allowed, talker[%s], type[%d]", new Object[] { parambi.field_talker, Integer.valueOf(parambi.getType()) });
        parambi = null;
        AppMethodBeat.o(17467);
      }
      else
      {
        gu localgu = new gu();
        localgu.ptF = parambi.field_msgSvrId;
        if (parambi.field_isSend == 1)
        {
          localgu.vEB = new bts().alV(paramString);
          localgu.vEC = new bts().alV(parambi.field_talker);
          j = 2;
        }
        Object localObject;
        while (true)
        {
          localgu.vIY = j;
          localgu.vJd = new SKBuiltinBuffer_t();
          localgu.vJe = 0;
          localgu.vJf = 0;
          localgu.vEG = "";
          localgu.jCt = i;
          localgu.vIZ = ((int)(parambi.field_createTime / 1000L));
          localgu.vJh = parambi.field_createTime;
          localgu.vJg = ((int)parambi.field_msgSeq);
          localgu.vJi = parambi.field_flag;
          localObject = new bts();
          ((bts)localObject).alV(bo.bc(parambi.field_content, ""));
          localgu.vED = ((bts)localObject);
          localObject = c.aTz().rq(com.tencent.mm.pluginsdk.model.app.l.Kx(parambi.getType()));
          if (localObject != null)
            break label395;
          ab.d("MicroMsg.BackupMsgLogic", "packedMsg unknow type[%d]", new Object[] { Integer.valueOf(parambi.getType()) });
          parambi = null;
          AppMethodBeat.o(17467);
          break;
          localgu.vEB = new bts().alV(parambi.field_talker);
          localgu.vEC = new bts().alV(paramString);
          if (paramBoolean2)
            j = 3;
          else
            j = 4;
        }
        label395: int j = ((l)localObject).a(localgu, paramBoolean1, parambi, paramString, paramLinkedList, paramHashMap, paramBoolean3, paramLong);
        if (j < 0)
        {
          parambi = null;
          AppMethodBeat.o(17467);
        }
        else
        {
          paramPLong.value += j;
          paramPLong.value += 60L;
          AppMethodBeat.o(17467);
          parambi = localgu;
        }
      }
    }
  }

  private static boolean rr(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 1)
    {
      bool2 = bool1;
      if (paramInt != 3)
      {
        bool2 = bool1;
        if (paramInt != 34)
        {
          bool2 = bool1;
          if (paramInt != 42)
          {
            bool2 = bool1;
            if (paramInt != 66)
            {
              bool2 = bool1;
              if (paramInt != 43)
              {
                bool2 = bool1;
                if (paramInt != 43)
                {
                  bool2 = bool1;
                  if (paramInt != 44)
                  {
                    bool2 = bool1;
                    if (paramInt != 47)
                    {
                      bool2 = bool1;
                      if (paramInt != 48)
                      {
                        bool2 = bool1;
                        if (paramInt != 49)
                        {
                          bool2 = bool1;
                          if (paramInt != 50)
                          {
                            bool2 = bool1;
                            if (paramInt != 62)
                              if (paramInt != 10000)
                                break label115;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label115: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.h
 * JD-Core Version:    0.6.2
 */