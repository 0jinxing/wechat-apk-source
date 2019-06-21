package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class j$1 extends ak
{
  j$1(j paramj, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(113521);
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 9:
    case 7:
    case 8:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(113521);
      while (true)
      {
        return;
        this.nNk.TF.setText(this.nNk.nNj);
        AppMethodBeat.o(113521);
        continue;
        ab.d("MicroMsg.ShareHeaderMsgMgr", "update member num, isMyselfTalking=%b, isOtherTalking=%b", new Object[] { Boolean.valueOf(this.nNk.nMO), Boolean.valueOf(this.nNk.nNi) });
        if ((this.nNk.nMO) || (this.nNk.nNi))
          break;
        Object localObject = this.nNk;
        ((j)localObject).TF.setTextColor(((j)localObject).nNf);
        ((j)localObject).TF.invalidate();
        int i = ((Integer)paramMessage.obj).intValue();
        if (i == 0)
        {
          this.nNk.TF.setText(this.nNk.context.getString(2131304117));
          AppMethodBeat.o(113521);
        }
        else
        {
          this.nNk.TF.setText(this.nNk.context.getResources().getQuantityString(2131361825, i, new Object[] { Integer.valueOf(i) }));
          AppMethodBeat.o(113521);
          continue;
          if ((this.nNk.nNi) || (this.nNk.nMO))
          {
            removeMessages(3);
            localObject = Message.obtain();
            ((Message)localObject).what = 3;
            ((Message)localObject).obj = paramMessage.obj;
            sendMessage((Message)localObject);
            AppMethodBeat.o(113521);
          }
          else
          {
            this.nNk.nNj = this.nNk.TF.getText().toString();
            j.a(this.nNk);
            paramMessage = s.mJ((String)paramMessage.obj);
            this.nNk.TF.setText(this.nNk.context.getString(2131304123, new Object[] { paramMessage }));
            if ((!this.nNk.nMO) && (!this.nNk.nNi))
              break;
            j.b(this.nNk);
            AppMethodBeat.o(113521);
            continue;
            if ((this.nNk.nNi) || (this.nNk.nMO))
            {
              removeMessages(4);
              localObject = Message.obtain();
              ((Message)localObject).what = 4;
              ((Message)localObject).obj = paramMessage.obj;
              sendMessage((Message)localObject);
              AppMethodBeat.o(113521);
            }
            else
            {
              this.nNk.nNj = this.nNk.TF.getText().toString();
              j.a(this.nNk);
              paramMessage = s.mJ((String)paramMessage.obj);
              this.nNk.TF.setText(this.nNk.context.getString(2131304124, new Object[] { paramMessage }));
              if ((!this.nNk.nMO) && (!this.nNk.nNi))
                break;
              j.b(this.nNk);
              AppMethodBeat.o(113521);
              continue;
              this.nNk.nNi = true;
              this.nNk.nMO = false;
              j.a(this.nNk);
              paramMessage = s.mJ((String)paramMessage.obj);
              this.nNk.TF.setText(this.nNk.context.getString(2131304125, new Object[] { paramMessage }));
              AppMethodBeat.o(113521);
              continue;
              this.nNk.nMO = true;
              this.nNk.nNi = false;
              j.a(this.nNk);
              this.nNk.TF.setText(this.nNk.context.getString(2131304122));
              AppMethodBeat.o(113521);
              continue;
              this.nNk.nMO = false;
              if (this.nNk.nNi)
                break;
              this.nNk.iC(true);
              AppMethodBeat.o(113521);
              continue;
              this.nNk.nNi = true;
              paramMessage = this.nNk;
              paramMessage.TF.setTextColor(paramMessage.nNg);
              paramMessage.TF.invalidate();
              this.nNk.TF.setText(this.nNk.context.getString(2131304127));
              this.nNk.nNj = this.nNk.TF.getText().toString();
              j.b(this.nNk);
              AppMethodBeat.o(113521);
              continue;
              paramMessage = this.nNk;
              paramMessage.TF.setTextColor(paramMessage.nNh);
              paramMessage.TF.invalidate();
              this.nNk.TF.setText(this.nNk.context.getString(2131304128));
              AppMethodBeat.o(113521);
            }
          }
        }
      }
      this.nNk.nNi = false;
      this.nNk.iC(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.j.1
 * JD-Core Version:    0.6.2
 */