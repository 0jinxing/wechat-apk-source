package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.g.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c.a;

final class SnsCommentUI$2$1
  implements c.a
{
  SnsCommentUI$2$1(SnsCommentUI.2 param2)
  {
  }

  public final void JW()
  {
  }

  public final void JX()
  {
    AppMethodBeat.i(38916);
    com.tencent.mm.ui.base.h.g(this.rrM.rrL, 2131303848, 2131303849);
    AppMethodBeat.o(38916);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(38915);
    String str1 = SnsCommentUI.b(this.rrM.rrL).getText().toString().trim();
    SnsCommentUI.b(this.rrM.rrL).setText("");
    if (str1.length() > 0)
      switch (SnsCommentUI.a(this.rrM.rrL))
      {
      default:
      case 0:
      case 1:
      case 2:
      }
    while (true)
    {
      AppMethodBeat.o(38915);
      long l1;
      long l2;
      String str2;
      long l3;
      while (true)
      {
        return;
        this.rrM.rrL.aqX();
        SnsCommentUI.a(this.rrM.rrL, str1);
        AppMethodBeat.o(38915);
        continue;
        this.rrM.rrL.aqX();
        SnsCommentUI.b(this.rrM.rrL, str1);
        AppMethodBeat.o(38915);
        continue;
        this.rrM.rrL.aqX();
        l1 = this.rrM.rrL.getIntent().getLongExtra("sns_id", 0L);
        l2 = this.rrM.rrL.getIntent().getLongExtra("action_st_time", 0L);
        paramString = bo.bc(this.rrM.rrL.getIntent().getStringExtra("sns_uxinfo"), "");
        str2 = bo.bc(this.rrM.rrL.getIntent().getStringExtra("sns_actionresult"), "");
        str2 = str2 + "|4:1:" + str1;
        l3 = System.currentTimeMillis();
        localObject = af.cnx().coB();
        if ((localObject != null) && (((com.tencent.mm.plugin.sns.g.h)localObject).coC()))
          break;
        AppMethodBeat.o(38915);
      }
      str1 = ((com.tencent.mm.plugin.sns.g.h)localObject).qPn;
      Object localObject = ((com.tencent.mm.plugin.sns.g.h)localObject).qPm;
      ab.d("MicroMsg.SnsCommentUI", "report abtestnotlike " + l1 + " uxinfo:" + paramString + " actionresult: " + str2 + " " + l2 + " " + l3);
      com.tencent.mm.plugin.report.service.h.pYm.e(11988, new Object[] { str1, localObject, "", "", i.jV(l1), paramString, str2, Long.valueOf(l2 / 1000L), Long.valueOf(l3 / 1000L) });
      SnsCommentUI.c(this.rrM.rrL);
      this.rrM.rrL.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentUI.2.1
 * JD-Core Version:    0.6.2
 */