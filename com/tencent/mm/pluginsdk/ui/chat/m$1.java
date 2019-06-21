package com.tencent.mm.pluginsdk.ui.chat;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.o;
import java.util.ArrayList;

final class m$1 extends ak
{
  m$1(m paramm)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = 0;
    AppMethodBeat.i(62455);
    switch (paramMessage.what)
    {
    default:
    case 20003:
    case 20001:
    case 20002:
    }
    while (true)
    {
      AppMethodBeat.o(62455);
      while (true)
      {
        return;
        paramMessage = this.voP;
        paramMessage.mHandler.removeMessages(20001);
        Object localObject;
        label123: String str;
        if (paramMessage.voJ)
        {
          localObject = paramMessage.voL;
          ((m.b)localObject).mData = paramMessage.lbH;
          ((m.b)localObject).notifyDataSetInvalidated();
          if ((paramMessage.lbH == null) || (paramMessage.lbH.size() <= 2))
            break label232;
          paramMessage.voE.setWidth((int)(paramMessage.voC * 2.5D) + paramMessage.voD * 2);
          paramMessage.dkL();
          if ((paramMessage.lbH == null) || (paramMessage.lbH.size() < 3))
            break label294;
          paramMessage.mHandler.sendEmptyMessageDelayed(20001, 5000L);
          label159: localObject = h.pYm;
          str = paramMessage.voH;
          if (paramMessage.lbH != null)
            break label311;
        }
        while (true)
        {
          ((h)localObject).e(10994, new Object[] { Integer.valueOf(0), str, "", Integer.valueOf(0), "", Integer.valueOf(i) });
          AppMethodBeat.o(62455);
          break;
          label232: if ((paramMessage.lbH != null) && (paramMessage.lbH.size() == 2))
          {
            paramMessage.voE.setWidth(paramMessage.voC * 2 + paramMessage.voD * 2);
            break label123;
          }
          paramMessage.voE.setWidth(paramMessage.voC + paramMessage.voD * 2);
          break label123;
          label294: paramMessage.mHandler.sendEmptyMessageDelayed(20001, 3000L);
          break label159;
          label311: i = paramMessage.lbH.size();
        }
        this.voP.hide();
        AppMethodBeat.o(62455);
      }
      removeMessages(20001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.1
 * JD-Core Version:    0.6.2
 */