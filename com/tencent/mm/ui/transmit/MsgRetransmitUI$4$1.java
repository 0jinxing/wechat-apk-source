package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.g;
import com.tencent.mm.at.l;
import com.tencent.mm.at.o;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;

final class MsgRetransmitUI$4$1
  implements DialogInterface.OnClickListener
{
  MsgRetransmitUI$4$1(MsgRetransmitUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35064);
    g localg;
    com.tencent.mm.at.e locale;
    if (MsgRetransmitUI.e(this.zJs.zJr) != null)
    {
      aw.Rg().c(MsgRetransmitUI.e(this.zJs.zJr));
      paramInt = (int)MsgRetransmitUI.e(this.zJs.zJr).fEX;
      paramDialogInterface = o.ahl().ly(paramInt);
      if (paramDialogInterface != null)
      {
        localg = o.ahl();
        locale = localg.ly(paramInt);
        if ((locale != null) && (locale.fDy == paramInt))
          break label137;
      }
    }
    while (true)
    {
      aw.ZK();
      c.XO().jg(paramDialogInterface.fDH);
      Toast.makeText(this.zJs.zJr, 2131301507, 1).show();
      this.zJs.zJr.finish();
      AppMethodBeat.o(35064);
      return;
      label137: com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDz, "", ""));
      com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDE, "", ""));
      com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDB, "", ""));
      com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDB, "", "") + "hd");
      localg.fni.delete("ImgInfo2", "id=?", new String[] { String.valueOf(paramInt) });
      if (locale.agQ())
      {
        locale = localg.ly(locale.fDJ);
        if (locale != null)
        {
          com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDz, "", ""));
          com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDE, "", ""));
          com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDB, "", ""));
          com.tencent.mm.vfs.e.deleteFile(localg.q(locale.fDB, "", "") + "hd");
          localg.fni.delete("ImgInfo2", "id=?", new String[] { locale.fDy });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.4.1
 * JD-Core Version:    0.6.2
 */