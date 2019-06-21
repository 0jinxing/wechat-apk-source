package com.tencent.mm.plugin.expt.roomexpt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ac;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$4
  implements Runnable
{
  a$4(a parama, long paramLong, int paramInt1, String paramString1, int paramInt2, boolean paramBoolean, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73563);
    long l1 = bo.yz();
    long l2 = bo.anT();
    String str1;
    boolean bool1;
    e locale;
    Object localObject;
    label101: int j;
    if (a.a(this.lOy).cYo <= 0L)
    {
      a.a(this.lOy).Fq();
      a.c(this.lOy);
      str1 = a.e(this.lOy);
      bool1 = a.p(this.lOA, this.lOB);
      locale = a.f(this.lOy).eh(this.lOz, str1);
      String str2 = this.lOz;
      if (locale == null)
        break label372;
      localObject = locale;
      ab.i("MicroMsg.ChatRoomExptService", "get db [%s %s] item [%s]", new Object[] { str2, str1, localObject });
      if (locale == null)
        break label397;
      locale.field_sendCount += this.lOB;
      locale.field_unReadCount += this.lOC;
      int i = locale.field_disRedDotCount;
      if (!bool1)
        break label379;
      j = 1;
      label177: locale.field_disRedDotCount = (j + i);
      i = locale.field_enterCount;
      if (!bool1)
        break label385;
      j = 0;
      label202: locale.field_enterCount = (j + i);
      locale.field_stayTime += this.lOA;
      if (!this.kAS)
        break label391;
      j = 1;
      label237: locale.field_isMute = j;
      bool1 = true;
      a.a(locale);
      if (!bool1)
        break label529;
    }
    label385: label391: label397: label529: for (boolean bool2 = a.f(this.lOy).c(locale); ; bool2 = a.f(this.lOy).b(locale))
    {
      if (!bool2)
        h.pYm.k(869L, 32L, 1L);
      ab.i("MicroMsg.ChatRoomExptService", "noteroominfo isUpdate[%b] dbOpRet[%b] cost[%d] item[%s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(bo.az(l1)), locale });
      AppMethodBeat.o(73563);
      while (true)
      {
        return;
        if (l2 - a.a(this.lOy).cYo < 604800L)
          break;
        a.d(this.lOy);
        AppMethodBeat.o(73563);
      }
      break;
      label372: localObject = "null";
      break label101;
      label379: j = 0;
      break label177;
      j = 1;
      break label202;
      j = 0;
      break label237;
      locale = new e();
      locale.field_chatroom = this.lOz;
      locale.field_nickname = this.lOD;
      locale.field_daySec = str1;
      locale.field_sendCount = this.lOB;
      if (this.kAS)
      {
        j = 1;
        label450: locale.field_isMute = j;
        locale.field_unReadCount = this.lOC;
        if (!bool1)
          break label517;
        j = 1;
        label474: locale.field_disRedDotCount = j;
        if (!bool1)
          break label523;
      }
      for (j = 0; ; j = 1)
      {
        locale.field_enterCount = j;
        locale.field_stayTime = this.lOA;
        bool1 = false;
        break;
        j = 0;
        break label450;
        j = 0;
        break label474;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.a.4
 * JD-Core Version:    0.6.2
 */