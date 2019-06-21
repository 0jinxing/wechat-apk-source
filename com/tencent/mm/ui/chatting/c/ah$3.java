package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.BitmapFactory.Options;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.o;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.v;

final class ah$3
  implements DialogInterface.OnClickListener
{
  ah$3(ah paramah, boolean paramBoolean, o paramo, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31665);
    if ((this.yRO) && (this.yRL.dDX() != null) && (this.yRL.dDX().getCallback() != null) && ((this.yRL.dDX().getCallback() instanceof v)))
    {
      paramDialogInterface = new BitmapFactory.Options();
      paramDialogInterface.inJustDecodeBounds = true;
      if (((com.tencent.mm.sdk.platformtools.d.decodeFile(this.yRP, paramDialogInterface) != null) && (paramDialogInterface.outHeight > b.Na())) || (paramDialogInterface.outWidth > b.Na()))
      {
        Toast.makeText(this.yRM.cgL.yTx.getContext(), 2131299043, 0).show();
        AppMethodBeat.o(31665);
      }
    }
    while (true)
    {
      return;
      paramDialogInterface = new WXMediaMessage(new WXEmojiObject(this.yRP));
      paramDialogInterface = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().a(this.yRM.cgL.yTx.getContext(), paramDialogInterface, null);
      if (paramDialogInterface != null)
        ((v)this.yRL.dDX().getCallback()).B(((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(paramDialogInterface));
      AppMethodBeat.o(31665);
      continue;
      paramDialogInterface = new l(5, this.yRM.cgL.dFu(), this.yRM.cgL.getTalkerUserName(), this.yRP, 0, null, 0, "", "", true, 2130838182);
      aw.Rg().a(paramDialogInterface, 0);
      AppMethodBeat.o(31665);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ah.3
 * JD-Core Version:    0.6.2
 */